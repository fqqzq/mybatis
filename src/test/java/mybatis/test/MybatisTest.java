package mybatis.test;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.atguigu.mybatis.mapper.BookMapper;
import com.atguigu.mybatis.pojo.Book;


public class MybatisTest {

	public static void main(String[] args) {
		ClassLoader loader = MybatisTest.class.getClassLoader();
		
		InputStream stream = loader.getResourceAsStream("mybatis-config.xml");
		
		SqlSessionFactory build = new SqlSessionFactoryBuilder().build(stream);
		
		SqlSession session = build.openSession();
		
		Connection conn = session.getConnection();
		
		try {
			conn.setAutoCommit(false);
			
			BookMapper mapper = session.getMapper(BookMapper.class);
			Book book = new Book(null, "我的书4", 200.0, "付倩倩");
			mapper.saveBook(book);
			System.out.println(book.getBookId());
			session.commit();
		} catch (SQLException e) {
			session.rollback();
		}finally{
			session.close();
		}
	}
	
}
