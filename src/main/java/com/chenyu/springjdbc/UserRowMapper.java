package com.chenyu.springjdbc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author chenyu
 * @date 2021-02-25
 */
public class UserRowMapper implements RowMapper {
  public Object mapRow(ResultSet resultSet, int i) throws SQLException {
    User one = new User();
    one.setId(resultSet.getLong("id"));
    one.setUsername(resultSet.getString("userName"));
    one.setPassword(resultSet.getString("passWord"));
    return one;
  }
}
