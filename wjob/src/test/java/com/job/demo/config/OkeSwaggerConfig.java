package com.job.demo.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * ProjectName : okejia
 * Description : [swagger的配置]
 * @author : wuxingfeng
 * CreateDate : 2019年-08月-08日
 */
@WebAppConfiguration
@EnableSwagger2
public class OkeSwaggerConfig extends WebMvcConfigurationSupport {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).select()
                //扫描指定包中的swagger注解
                //.apis(RequestHandlerSelectors.basePackage("com.xxx.controller"))
                //扫描所有有注解的api
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(setHeaderToken());
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("互惠生活 REST APIs")
                .description("接口文档")
                .termsOfServiceUrl("http://www.okejia.com/")
                .version("1.0.0")
                .termsOfServiceUrl("http://www.okejia.com/")
                .license("LICENSE")
                .licenseUrl("http://www.okejia.com/")
                .build();
    }
    private List<Parameter> setHeaderToken() {
        List<Parameter> pars = new ArrayList<>();
        ParameterBuilder tokenPar = new ParameterBuilder();
        tokenPar.name("token").description("移动端token").modelRef(new ModelRef("string"))
                .parameterType("header").required(false).build();
        pars.add(tokenPar.build());
        ParameterBuilder clientPar = new ParameterBuilder();
        clientPar.name("client").description("client标识").modelRef(new ModelRef("int"))
//                .parameterType("header").defaultValue(String.valueOf(Const.modle.YSH_APP.getCode())).required(false).build();
                .parameterType("header").defaultValue(String.valueOf(2)).required(false).build();
        pars.add(clientPar.build());
        ParameterBuilder signPar = new ParameterBuilder();
        signPar.name("sign").description("sign标识").modelRef(new ModelRef("string"))
                .parameterType("header").required(false).build();
        pars.add(signPar.build());
        ParameterBuilder deviceIdPar = new ParameterBuilder();
        deviceIdPar.name("deviceId").description("deviceId标识").modelRef(new ModelRef("long"))
                .parameterType("header").required(false).build();
        pars.add(deviceIdPar.build());
        ParameterBuilder deviceTokenPar = new ParameterBuilder();
        deviceTokenPar.name("deviceTokenId").description("deviceToken标识").modelRef(new ModelRef("string"))
                .parameterType("header").required(false).build();
        pars.add(deviceTokenPar.build());
        ParameterBuilder platformPar = new ParameterBuilder();
        platformPar.name("platform").description("platform标识").modelRef(new ModelRef("int"))
                .parameterType("header").required(false).build();
        pars.add(platformPar.build());
        ParameterBuilder vPar = new ParameterBuilder();
        vPar.name("v").description("v标识").modelRef(new ModelRef("double"))
                .parameterType("header").required(false).build();
        pars.add(vPar.build());
        ParameterBuilder tPar = new ParameterBuilder();
        tPar.name("t").description("t标识").modelRef(new ModelRef("long"))
                .parameterType("header").required(false).build();
        pars.add(tPar.build());
        return pars;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");

        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }


}
