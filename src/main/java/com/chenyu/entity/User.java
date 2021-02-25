package com.chenyu.entity;

/**
 * @author chenyu
 * @date 2021-01-13
 */
public class User {

  private String userName;

  private String userId;

  private Integer id;

  public User(String userName, String userId, Integer id) {
    this.userName = userName;
    this.userId = userId;
    this.id = id;
  }

  public User() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public User(String userName, String userId) {
    this.userName = userName;
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  //  public void printInit() {
  //    System.out.println("前回调");
  //  }
  //
  //  public void printDestory() {
  //    System.out.println("后回调");
  //  }

  @Override
  public String toString() {
    return "User{" + "userName='" + userName + '\'' + ", userId='" + userId + '\'' + '}';
  }
}
