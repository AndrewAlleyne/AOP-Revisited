package com.example.aoprevisited;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
    //  Call the advice at this point.
    @Pointcut("execution(public void com.example.aoprevisited.SomeService.doSomething2())")
    //  Method signatures can be used to refer to the point cut by the advice. usingPointCut is the PointCuts name.
    public void usingPointCut() {
        //Empty method body
    }

    //  Advice applied before ANY method execution in the package.Stay at the package level and not the class Level
    @Pointcut("within(com.example.aoprevisited..*)")
    //  Method signatures can be used to refer to the point cut by the advice. usingPointCut is the PointCuts name.
    public void usingPointCut2() {
        //Empty method body
    }

    /*Configured based on the point cut. See the description above the different pointcuts. */
    //    @Around("usingPointCut2()")
    //    public void myAdvice3(ProceedingJoinPoint joinPoint) throws Throwable {
    //        System.out.println("\nThird advice using around advice " + joinPoint.getSignature());
    //        //  Before the method execution do this.
    //        System.out.println("This call is before the method execution ");
    //        joinPoint.proceed();
    //        System.out.println("This call is after the method execution.");
    //    }

    //
    //    @Before("usingPointCut()")
    //    public void myAdvice1(JoinPoint joinPoint) {
    //        System.out.println("First advice! " + joinPoint.getSignature());
    //    }
    //
    //    @Before("usingPointCut2()")
    //    public void myAdvice2(JoinPoint joinPoint) {
    //        System.out.println("Second advice! " + joinPoint.getSignature());
    //        System.out.println("Testing out the live reload feature");
    //    }
    //
    //
    //    // Typename required means place the method access type
    //


    @Pointcut("execution(* com.example.aoprevisited.SomeService.doSomething2())")
    public void usingPointCut3() {
        //Empty method body
    }

    @AfterReturning(value = "usingPointCut3()", returning = "returnValue")
    public void myAdvice4(JoinPoint joinPoint, Object returnValue) {
        System.out.println("Fourth advice using the after returning advice " + joinPoint.getSignature());
        System.out.println("The value returned is : " + returnValue.toString());
    }
}
