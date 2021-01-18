package com.chenyu.config;

import com.chenyu.entity.User;
import com.chenyu.other.User2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ComponentScan 扫包的功能 <br>
 * @Import 替代@Bean更简单
 *
 * @author chenyu
 * @date 2021-01-13
 */
@Configuration
@Import(User2.class)
@ComponentScan(value = "com.chenyu")
public class Config {

  /**
   * @Bean 一般用来把第三方jar的类注入到spring容器里<br>
   * 这里来模拟 <br>
   * initMethod:指定初始化方法 <br>
   * destroyMethod:指定销毁方法
   *
   * @return
   */
  @Bean(initMethod = "printInit", destroyMethod = "printDestory")
  public User user() {
    return new User("陈雨", "110");
  }
}
