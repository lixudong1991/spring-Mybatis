package lxd.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
@Aspect
public class AnnoLogAspect {

    @Pointcut("execution(* lxd..AnnoPeopleServiceImpl.updatePeopelById(..))")
    private void pointCutUpdata(){}

    @Before("pointCutUpdata()")
    public void printLog(JoinPoint point)
    {
        System.out.println("AnnoLogAspect printLog... args:"+Arrays.toString(point.getArgs()));
    }
    @AfterThrowing("pointCutUpdata()")
    public void onExceptionLog(JoinPoint point)
    {
        System.out.println("AnnoLogAspect Exception..");
    }

    @After("pointCutUpdata()")
    public void afterMethod()
    {
        System.out.println("AnnoLogAspect afterMethod...");
    }
    @AfterReturning("pointCutUpdata()")
    public void afterReturnMethod()
    {
        System.out.println("AnnoLogAspect afterReturnMethod...");
    }

    public Object aroundPrintLog(ProceedingJoinPoint point)
    {
        Object ret=null;
        try {
            System.out.println("AnnoLogAspect aroundPrintLogBefore...");
            ret=point.proceed();
            System.out.println("AnnoLogAspect aroundPrintLogAfter...");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return ret;
    }
}
