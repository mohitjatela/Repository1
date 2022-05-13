package com.restapi.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.restapi.book.entity.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, Integer>{

	  
//	  @Query("select b from books b where b.bid=:n")
//	  public Books getBookBybid(@Param("n") Integer id);
	public Books getBookBybid(Integer id);
	 
}
