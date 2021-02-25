package com.chenyu.springjdbc;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author chenyu
 * @date 2021-02-25
 */
public class UserService {
  private JdbcTemplate jdbcTemplate;

  public void setDataSource(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
  }

  public void select(long id) {
    List<User> user =
        jdbcTemplate.query(
            "select * from user where id = ? ", new Object[] {id}, new UserRowMapper());

    System.out.println(user);
  }
}
