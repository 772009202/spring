package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author chenyu
 * @date 2021-02-01
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

  public MyClassPathXmlApplicationContext(String path) {
    super(path);
  }

  @Override
  protected void initPropertySources() {
    ConfigurableEnvironment v = getEnvironment();
  }

  public static void main(String[] args) {
    MyClassPathXmlApplicationContext applicationContext =
        new MyClassPathXmlApplicationContext("applicationContext.xml");
  }
}
