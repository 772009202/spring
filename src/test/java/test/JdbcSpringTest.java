package test;

import com.chenyu.springjdbc.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenyu
 * @date 2021-02-25
 */
public class JdbcSpringTest {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext classPathXmlApplicationContext =
        new ClassPathXmlApplicationContext("applicationContext.xml");
    UserService service =
        classPathXmlApplicationContext.getBean("userServiceJdbc", UserService.class);
    service.select(1);
  }
}
