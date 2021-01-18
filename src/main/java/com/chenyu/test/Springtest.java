package com.chenyu.test;

import com.chenyu.config.Config;
import com.chenyu.other.ContextAwareTest;
import com.chenyu.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * option + command + v : 自动返回结果<br>
 * option + command + u : 类图<br>
 *
 * @author chenyu
 * @date 2021-01-13
 */
public class Springtest {

  private static AnnotationConfigApplicationContext context;

  public static void main(String[] args) {
    context = new AnnotationConfigApplicationContext(Config.class);
    System.out.println("加载完毕");

    //    String[] beanNames = context.getBeanDefinitionNames();
    //    for (String e : beanNames) {
    //      System.out.println(e);
    //    }
    String[] beanNames = ContextAwareTest.context.getBeanDefinitionNames();
    for (String e : beanNames) {
      System.out.println(e);
    }

    UserService userService = Springtest.context.getBean("userService", UserService.class);
    userService.printUser();
    /** 销毁单例对象 */
    Springtest.context.close();
  }
}
