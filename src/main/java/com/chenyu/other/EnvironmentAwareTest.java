package com.chenyu.other;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author chenyu
 * @date 2021-01-15
 */
@Component
public class EnvironmentAwareTest implements EnvironmentAware {
  public void setEnvironment(Environment environment) {
    //    System.out.println(environment.getProperty("os.name") + "你好");
  }
}
