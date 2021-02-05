package com.chenyu.handler;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

/**
 * @author chenyu
 * @date 2021-02-02
 */
@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

  public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName)
      throws BeansException {
    System.out.println("MyInstantiationAwareBeanPostProcessor:" + beanName);
    return null;
  }

  public static void main(String[] args) {
    XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
    //    ApplicationContext context =
    //        new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    for (String e : context.getBeanDefinitionNames()) {
      System.out.println("beanName:" + e);
    }

    System.out.println("bean的数量:" + context.getBeanDefinitionCount());
  }
}
