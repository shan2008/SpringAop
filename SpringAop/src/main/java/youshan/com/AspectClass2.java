package youshan.com;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by syou on 2018/1/16.
 */
public class AspectClass2 {
    public void before(){
        System.out.println("开始执行...");
    }

    public void after(){
        System.out.println("执行完毕...");
    }

    public void around(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("开始执行...环绕...");
            joinPoint.proceed();
            System.out.println("执行完毕...环绕...");
        }catch (Throwable e){

        }
    }

    public void   afterThrowing(){
        System.out.println("异常执行....");
    }

    public void afterReturn(){
        System.out.println("返回完毕执行...");
    }
}
