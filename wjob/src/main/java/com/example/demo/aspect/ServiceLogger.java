package com.example.demo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/***
 * 应该是个拦截service做日志的类  回头试试  20200903
 * 从这里抄写的  https://github.com/DarrickLZH/JwtDemo/tree/master/src
 */
@Aspect
@Slf4j
@Component
public class ServiceLogger {

    @Pointcut("execution(public * net.javablog.service.*.*(..))")   //拦截的包路径
    public void service(){

    }

    @Before("service()")
    public void before(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        String method = signature.getDeclaringTypeName() + '.' + signature.getName();
        log.info("-------------------------------");
        log.info("执行Service方法 : " + method);
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            log.info("参数: " + arg);
        }
        log.info("-------------------------------");
    }


    @AfterReturning(pointcut = "service()", returning = "ret")
    public void afterReturn(Object ret) {
        log.info("--------------------------");
        log.info("返回参数 : " + ret);
        log.info("-------------------------");
    }
}