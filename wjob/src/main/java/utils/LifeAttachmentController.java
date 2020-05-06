package utils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.*;

@Slf4j
@Api(value = "图片上传",description = "life_web上传图片")
@Controller
@RequestMapping("/lifeWeb")
public class LifeAttachmentController {


	@ApiOperation(value = "单张图片上传(返回图片保存路径)",httpMethod = "POST")
	@ResponseBody
	@RequestMapping(value="/img",method= RequestMethod.POST)
	public ApiInvokeResult uploadLifeImg(@RequestParam(value = "file", required = true) CommonsMultipartFile file,
										 HttpServletRequest request) {
		try {
			if (file.isEmpty()) {
//				return ApiInvokeResult.failure("图片文件为空", ApiConstants.ParemeterVerifyCode);
				return ApiInvokeResult.failure("图片文件为空", "");
			}
			String typePhoto = "life/pic";
			DiskFileItem fi = (DiskFileItem) file.getFileItem();
			File f = fi.getStoreLocation();
			String path = ZipImageUtils.zipImage(f, request,typePhoto,file.getOriginalFilename());
//			path = Constants.LIFE_WEB_BASE_URL + Constants.TOP_PIC_PATH + path;
			Map<String, String> result = new HashMap<>(1);
			result.put("photoPath", path);
			return ApiInvokeResult.success(result,"");
		} catch (Exception e) {
			log.error("上传图片失败",e);
			return ApiInvokeResult.failure("图片的大小应在10K到1M之间", "");
		}
	}

	@ApiOperation(value = "多张图片上传(返回图片保存路径)",httpMethod = "POST")
	@RequestMapping("/imgs")
	@ResponseBody
	public ApiInvokeResult uploadLifeImgs(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 创建一个通用的多部分解析器
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 判断 request 是否有文件上传,即多部分请求
		if (multipartResolver.isMultipart(request)) {
			List<Map<String, String>> list = new ArrayList<Map<String, String>>();
			// 转换成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 取得request中的所有文件名
			Iterator<String> iter = multiRequest.getFileNames();
			while(iter.hasNext()){
				String typePhoto = "life/pic";
				CommonsMultipartFile file = (CommonsMultipartFile) multiRequest.getFile(iter.next());
				DiskFileItem fi = (DiskFileItem) file.getFileItem();
				File f = fi.getStoreLocation();
				if (f != null) {
					String path = ZipImageUtils.zipImage(f, request, typePhoto, f.getName());
//					path = Constants.LIFE_WEB_BASE_URL + Constants.TOP_PIC_PATH + path;
					Map<String, String> result = new HashMap<>(1);
					result.put("photoPath", path);
					list.add(result);
				}
			}
			return ApiInvokeResult.success(list,"");
		}
		return ApiInvokeResult.success("");
	}
}
