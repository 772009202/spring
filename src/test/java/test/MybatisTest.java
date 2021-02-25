package test;

import com.chenyu.dao.UserDao;
import com.chenyu.entity.Count;
import com.chenyu.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

/**
 * @author chenyu
 * @date 2021-02-25
 */
public class MybatisTest {
  static SqlSessionFactory sqlSessionFactory = null;

  static {
    sqlSessionFactory = MybatisUtil.getSqlSessionFactory();
  }

  @Test
  public void getUser() {
    SqlSession sqlSession = sqlSessionFactory.openSession();
    UserDao userDao = sqlSession.getMapper(UserDao.class);
    List<Count> counts = userDao.sumAll();
    System.out.println(counts);
  }
}
