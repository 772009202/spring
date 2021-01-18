package com.chenyu.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 重写的方法如果是true可以注册 反之<br>
 * 配合@Condition注解使用
 *
 * @author chenyu
 * @date 2021-01-13
 */
public class MyCondition implements Condition {

  public boolean matches(
      ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
    Environment en = conditionContext.getEnvironment();
    //    System.out.println(en.getProperty("os.name"));
    return true;
  }
}
