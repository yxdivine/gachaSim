package yxdivine.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GachaAspect {
    int count = 0;

    /**
     * 创建切入点：execution表达式指定针对某个（些）方法，进行切入
     */
    @Pointcut("execution(* yxdivine.rest.TestService.*(..))")
    public void myPointCut() {
    }


    /**
     * 环绕通知：最先执行，在执行proceed()之前执行前置通知，在return之后执行后置通知
     *
     * @param joinPoint
     * @return
     * @throws Throwable
     */
    @Around("myPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object obj = joinPoint.proceed();
        System.out.println(count);
        return obj;
    }

}
