package com.chenyu.handler;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * 后置处理器
 *
 * @author chenyu
 * @date 2021-02-10
 */
@Component
public class BeanPostProcessorDemo implements BeanPostProcessor {

  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    //    System.out.println("后置处理器");
    return bean;
  }
}
