package com.chenyu.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 仿造@Service注解 其底层还是用了@Component注解 这种注解就像是标记注解一样(spring中显式标记扫把) <br>
 * 类似的还有@Enable...（利用了@Import）还有@Repository <br>
 * Created by chenyu on 2021/1/13
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MySpringAnnotation {}
