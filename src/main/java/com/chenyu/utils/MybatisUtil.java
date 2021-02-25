package com.chenyu.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author chenyu
 * @date 2021-02-25
 */
public class MybatisUtil {
  private static final SqlSessionFactory sqlSessionFactory;

  static {
    String resource = "resource/xml/UserMapper.xml";
    Reader reader = null;
    try {
      reader = Resources.getResourceAsReader(resource);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
  }

  public static SqlSessionFactory getSqlSessionFactory() {
    return sqlSessionFactory;
  }
}
