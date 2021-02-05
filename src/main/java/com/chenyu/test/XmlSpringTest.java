package com.chenyu.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author chenyu
 * @date 2021-01-19
 */
public class XmlSpringTest {

  public static void main(String[] args) {
    //    ApplicationContext context =
    //        new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    //    String[] beanDefinitionNames = context.getBeanDefinitionNames();
    //    for (String e : beanDefinitionNames) {
    //      System.out.println(e);
    //    }
    XmlBeanFactory beanFactory =
        new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
    String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
    for (String e : beanDefinitionNames) {
      System.out.println(e);
    }
  }
}
