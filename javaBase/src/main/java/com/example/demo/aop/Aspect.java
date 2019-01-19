package com.example.demo.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {

    @Pointcut("execution( public * com.example.demo.aop.*.*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void deBefore(JoinPoint joinPoint) throws Throwable{
        System.out.println("before");
    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable{
        System.out.println("返回值为："+ret);
    }

    @AfterThrowing("webLog()")
    public void throwss(JoinPoint joinPoint){
        System.out.println("方法异常时执行");
    }

    @After("webLog()")
    public void after(JoinPoint joinPoint){
        System.out.println("方法最后执行");
    }

    public Object arround(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("环绕方法");
        try{
            Object o = proceedingJoinPoint.proceed();
            System.out.println("方法环绕proceed 结果是："+o);
            return o;
        }catch (Throwable e){
            e.printStackTrace();
            return null;
        }
    }



}
