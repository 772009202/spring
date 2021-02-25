package com.chenyu.service;

import com.chenyu.dao.UserDao;
import com.chenyu.entity.Count;
import com.chenyu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author chenyu
 * @date 2021-01-13
 */
@Service
public class UserService {

  @Autowired private UserDao userDao;

  @Autowired private ApplicationContext applicationContext;

  private UserService userService;

  /** 利用PostConstruct在对象实例化后执行 <br> */
  @PostConstruct
  public void setUserService() {
    userService = applicationContext.getBean(UserService.class);
  }

  @Transactional
  public void insertUser(User user) {
    try {

      userDao.addUser(user);
      // 模拟异常

      int id = user.getId();
      //      int num = 10 / id;
    } catch (Exception e) {
      e.printStackTrace();
      // 设置手动回滚
      TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
    }
  }

  public List<Count> count() {
    List<Count> count = userDao.sumAll();
    return count;
  }
  /** 自我调用对aop的影响 */
  public void testA() {
    System.out.println("userService A方法");
    //    testB();
    userService.testB();
  }

  public void testB() {
    System.out.println("userService B方法");
  }
}
