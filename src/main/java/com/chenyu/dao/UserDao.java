package com.chenyu.dao;

import com.chenyu.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author chenyu
 * @date 2021-01-13
 */
@Repository
public class UserDao {

  @Autowired private User user;

  public UserDao() {
    System.out.println("userDao无参构造函数被调");
  }

  public void printUser() {
    System.out.println(user);
  }
}
