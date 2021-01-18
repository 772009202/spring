package com.chenyu.service;

import com.chenyu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chenyu
 * @date 2021-01-13
 */
@Service
public class UserService {
  @Autowired private UserDao userDao;

  public void printUser() {
    userDao.printUser();
  }
}
