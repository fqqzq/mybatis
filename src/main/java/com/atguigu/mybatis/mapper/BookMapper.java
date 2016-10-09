package com.atguigu.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.atguigu.mybatis.pojo.Book;

public interface BookMapper {

	int saveBook(Book book);
	
	void deleteBook(int bookId);
	
	void updateBook(Book book);
	
	Book getBookById(int bookId);
	
	List<Book> getBookList();
	
	List<Book> getBookLimitList(@Param("index") int index,@Param("pageSize") int pageSize);
	
	List<Book> getByBookCondition(Book book);
	
	List<Book> getByMapCondition(Map<String, Object> map);
	
	List<Book> getBookByCondition(@Param("minPrice") int minPrice,@Param("maxPrice") int maxPrice);
	
	Map<String, Object> getBookByIdToMap(int bookId);
	
	
	List<Map<String, Object>> getBookMapToList();
	
	
	
}
