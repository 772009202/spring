package com.chenyu.dao;

import com.chenyu.entity.Count;
import com.chenyu.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author chenyu
 * @date 2021-01-13
 */
@Repository
public interface UserDao {

  int addUser(User user);

  List<Count> sumAll();
}
