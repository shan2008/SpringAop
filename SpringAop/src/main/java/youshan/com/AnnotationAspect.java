package youshan.com;

import org.aspectj.lang.ProceedingJoinPoint;

import java.lang.reflect.Method;

/**
 * Created by syou on 2018/1/22.
 */
public class AnnotationAspect {
    public void before() {
        System.out.println("开始执行...");
    }

    public void after() {
        System.out.println("执行完毕...");
    }

    public void around(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("开始执行...环绕...");
            getCount(joinPoint);
            joinPoint.proceed();
            System.out.println("执行完毕...环绕...");
        } catch (Throwable e) {
        }

    }

    public void afterThrowing() {
        System.out.println("异常执行....");
    }

    public void afterReturn() {
        System.out.println("返回完毕执行...");
    }


    private int getCount(ProceedingJoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName(); //拿到方法，login
        Object[] arguments = joinPoint.getArgs(); //拿到方法参数
        Class targetClass = joinPoint.getTarget().getClass(); //拿到代理对象
        Method[] methods = targetClass.getMethods();
        for (Method method : methods) {
            if (method.getName().equals(methodName) && arguments.length == method.getTypeParameters().length) {
                method.getAnnotation(LoginCountAnnotation.class).getCount();
            }
        }

        return 0;
    }

}
