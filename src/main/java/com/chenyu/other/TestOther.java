package com.chenyu.other;

import com.chenyu.config.MyCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * @Lazy 使用懒加载 Spring创建单例bean 默认使用饿汉模式
 *
 * @author chenyu
 * @date 2021-01-13
 */
@Component
// @Lazy
@Conditional(value = MyCondition.class)
public class TestOther {

  public TestOther() {
    //    System.out.println("testOther无参构造函数被调");
  }
}
