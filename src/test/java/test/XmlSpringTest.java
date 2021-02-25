package test;

import com.chenyu.entity.Count;
import com.chenyu.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author chenyu
 * @date 2021-01-19
 */
public class XmlSpringTest {

  public static void main(String[] args) {

    ClassPathXmlApplicationContext classPathXmlApplicationContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    UserService userService =
        classPathXmlApplicationContext.getBean("userService", UserService.class);
    //    userService.insertUser(new User("chenyu", "1", 3));
    List<Count> count = userService.count();
    //    AnnotationAwareAspectJAutoProxyCreator
    userService.testA();
    userService.testB();
  }
}
