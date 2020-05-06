package utils;

import com.elvdou.koala.core.common.Constants;
import com.elvdou.koala.infra.common.ImgPathUtil;
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;
import org.apache.commons.lang3.StringUtils;
import org.openkoala.koala.commons.InvokeResult;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.io.*;
import java.util.UUID;

/**
 * 对上传图片的操作
 * com.elvdou.koala.api.common.ZipImageUtils
 *
 * @author lenovo
 */
public class ZipImageUtils {

    private static final String LAST_INDEX = ".";

    /**
     * servlet上传
     * 压缩图片，大小不变
     */
    public static String zipImage(InputStream input, String savePath) throws Exception {
        BufferedImage image = ImageIO.read(input);
        int height = image.getHeight(null);
        int width = image.getWidth(null);
        BufferedImage bi = new BufferedImage(width, height, 1);
        bi.getGraphics().drawImage(image, 0, 0, width, height, null);
        File destFile = new File(savePath);
        FileOutputStream out = new FileOutputStream(destFile);
        JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
        encoder.encode(image);
        input.close();
        out.close();
        return savePath;
    }

    /**
     * springMVC上传图片处理
     * 压缩图片，大小不变
     */
    public static String zipImage(File file, HttpServletRequest request, String savePath, String oldFileName) throws Exception {
        String commentpath = Constants.LIFE_LAYOUT_PATH;
        String filePath;
        String filename = file.getName();
        String path = ImgPathUtil.getHashcold(filename);
        String fileSuffix = ".jpg";
        if (StringUtils.isNoneBlank(oldFileName) && oldFileName.contains(LAST_INDEX)) {
            fileSuffix = oldFileName.substring(oldFileName.lastIndexOf(LAST_INDEX));
        }
        filename = System.nanoTime() + fileSuffix;
        filePath = commentpath + savePath + "/" + path;
        File exitfile = new File(filePath);
        if (!exitfile.exists()) {
            exitfile.mkdirs();
        }
        FileInputStream fis = new FileInputStream(file);
        File destFile = new File(filePath + filename);
        FileOutputStream out = new FileOutputStream(destFile);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            out.write(buffer, 0, length);
        }
        fis.close();
        out.close();
        return "/" + savePath + "/" + path + filename;
    }

    /**
     * 图片先缩放再剪裁 图片格式为：二进制格式
     *
     * @param is      输入文件流
     * @param zoomw   放大后的宽
     * @param zoomh   放大后的高
     * @param x       剪裁区域开始的x轴
     * @param y       剪裁区域开始的y轴
     * @param w       剪裁区域宽度
     * @param h       剪裁区域高度
     * @param quality 图片质量
     */
    public static InvokeResult zoomCutSaveImageByte(InputStream is, int zoomw, int zoomh, int x, int y, int w, int h,
                                                    HttpServletRequest request, String savePath, float quality) {

        // 以下其实可以忽略，将图片压缩处理了一下，可以小一点
        BufferedImage bi;
        try {
            String commentpath = Constants.HOUSELAYOUT_PATH_WEB;
            String typePath = savePath;
            String path = ImgPathUtil.getHashcold(UUID.randomUUID().toString());
            String dir = request.getSession().getServletContext().getRealPath(commentpath) + "/" + savePath + "/";
            String filename = System.nanoTime() + ".jpg";
            savePath = dir + path;
            File exitfile = new File(savePath);
            if (!exitfile.exists()) {
                exitfile.mkdirs();
            }

            bi = ImageIO.read(is);
            // 获取缩放后的图片大小
            Image image = bi.getScaledInstance(zoomw, zoomh, Image.SCALE_SMOOTH);
            ImageFilter cropFilter = new CropImageFilter(x, y, w, h);
            Image img = Toolkit.getDefaultToolkit().createImage(new FilteredImageSource(image.getSource(), cropFilter));
            BufferedImage tag = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            //---绘制截取后的图
            Graphics g = tag.getGraphics();
            g.drawImage(img, 0, 0, null);
            g.dispose();
            // ---文件存储
            FileOutputStream newimage;
            // 输出到文件流
            newimage = new FileOutputStream(savePath + filename);
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(newimage);
            JPEGEncodeParam jpeg = JPEGCodec.getDefaultJPEGEncodeParam(tag);
            /* 压缩质量 */
            jpeg.setQuality(quality, true);
            encoder.encode(tag, jpeg);
            newimage.close();
            return InvokeResult.success(commentpath + typePath + "/" + path + filename);
        } catch (IOException e) {
            e.printStackTrace();
            return InvokeResult.failure("失败");
        }
    }

    public static BufferedImage toBufferedImage(Image image) {
        int height = image.getHeight(null);
        int width = image.getWidth(null);
        if (image instanceof BufferedImage) {
            return (BufferedImage) image;
        }
        image = new ImageIcon(image).getImage();
        BufferedImage bimage = null;
        GraphicsEnvironment ge = GraphicsEnvironment
                .getLocalGraphicsEnvironment();
        try {
            int transparency = Transparency.OPAQUE;
            GraphicsDevice gs = ge.getDefaultScreenDevice();
            GraphicsConfiguration gc = gs.getDefaultConfiguration();

            bimage = gc.createCompatibleImage(width, height, transparency);
        } catch (HeadlessException ignored) {
        }
        if (bimage == null) {
            int type = BufferedImage.TYPE_INT_RGB;
            bimage = new BufferedImage(width, height, type);
        }
        Graphics g = bimage.createGraphics();
        g.drawImage(image, 0, 0, null);
        g.dispose();
        return bimage;
    }


}
