package com.chenyu.other;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author chenyu
 * @date 2021-01-15
 */
@Component
public class ContextAwareTest implements ApplicationContextAware {
  /** 全局的上下文 */
  public static ApplicationContext context;

  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    ContextAwareTest.context = applicationContext;
  }
}
