package mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.atguigu.mybatis.mapper.BookMapper;
import com.atguigu.mybatis.pojo.Book;

public class TestWorld {

	private SqlSessionFactory factory;
	@Before
	public void init() {
		factory = new SqlSessionFactoryBuilder().build(this.getClass().getClassLoader().getResourceAsStream("mybatis-config.xml"));
	}
	@Test
	public void test1() {
		SqlSession session = null;
		
		try {

			
			int b = 10;


			int a = 10;

			session = factory.openSession();
			
			BookMapper mapper = session.getMapper(BookMapper.class);
			Book book = new Book(null, "aaa", 111, "cccc");
			
			mapper.saveBook(book);
			
			System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
	
			session.commit();
			
		}catch (Exception e){
			
			session.rollback();
			
			e.printStackTrace();
			
		}finally{
			
			session.close();
			
		}
	}

}
