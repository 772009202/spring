package com.chenyu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * 定一个切面类<br>
 * spring aop测试 让service包下的类调方法的时候都走自己定义的方法
 *
 * @author chenyu
 * @date 2021-01-15
 */
@Aspect
@Component
@EnableAspectJAutoProxy
public class AopTest {

  /** 定一个切点 */
  @Pointcut("execution (* com.chenyu.service..*.*(..))")
  public void printLog() {}

  @Around("printLog()")
  public void around(ProceedingJoinPoint joinPoint) throws Throwable {
    Signature signature = joinPoint.getSignature();

    System.out.println("环绕监听的方法" + signature.getName());
    joinPoint.proceed();
    //    System.out.println("环绕通知后");
  }

  //  @Before("printLog()")
  //  public void before() {
  //    System.out.println("前置通知");
  //  }
  //
  //  @After("printLog()")
  //  public void after() {
  //    System.out.println("后置通知");
  //  }
  //
  //  @AfterReturning("printLog()")
  //  public void afterRun() {
  //    System.out.println("运行时通知");
  //  }

  /**
   * 异常通知就不会走运行通知 <br>
   * 事务的实现其实就是怎么实现的
   */
  @AfterThrowing("printLog()")
  public void afterThrow() {
    System.out.println("异常通知");
  }
}
