package youshan.com;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by syou on 2018/1/16.
 */
//@Aspect
//@Component
public class AspectClass {

    @Pointcut("execution(* youshan.com.*.*(..))")
    public void pointCut(){
    }

    @Before("pointCut()")
    public void before(){
        System.out.println("开始执行...");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("执行完毕...");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("开始执行...环绕...");
            joinPoint.proceed();
            System.out.println("执行完毕...环绕...");
        }catch (Throwable e){

        }
    }

    @AfterThrowing("pointCut()")
    public void   afterThrowing(){
        System.out.println("异常执行....");
    }

    @AfterReturning("pointCut()")
    public void afterReturn(){
        System.out.println("返回完毕执行...");
    }
}
