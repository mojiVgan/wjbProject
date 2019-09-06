package conf;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * ProjectName : okejia
 * Description :
 * @author : wuxingfeng
 * CreateDate : 2019年-08月-19日
 *
 */
public class MybatisReverse {

    // 进行反转时释放注释掉部分代码，另外，注意修改generate中的target路径地址
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        //Configuration config = cp.parseConfiguration(new File("./elvdou-conf/src/main/resources/META-INF/generatorConfig.xml"));
        String fileName = "/generatorConfig.xml";
        //URL resource = MybatisReverse.class.getResource(fileName);
        //System.out.println(resource.toURI().toString());
        InputStream resourceAsStream = MybatisReverse.class.getResourceAsStream(fileName);
        Configuration config = cp.parseConfiguration(resourceAsStream);
        DefaultShellCallback callback = new DefaultShellCallback(true);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        for (String warning : warnings) {
            System.out.println(warning);
        }
    }

}
