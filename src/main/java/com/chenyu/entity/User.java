package com.chenyu.entity;

/**
 * @author chenyu
 * @date 2021-01-13
 */
public class User {

  private String userName;

  private String userId;

  public User(String userName, String userId) {
    this.userName = userName;
    this.userId = userId;
  }

  public void printInit() {
    System.out.println("前回调");
  }

  public void printDestory() {
    System.out.println("后回调");
  }

  @Override
  public String toString() {
    return "User{" + "userName='" + userName + '\'' + ", userId='" + userId + '\'' + '}';
  }
}
