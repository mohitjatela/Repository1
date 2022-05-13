package com.restapi.book.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.restapi.book.entity.Books;
import com.restapi.book.repository.BookRepository;

@Component
public class BookDao {

	@Autowired
	private BookRepository bookRepository;

//	find all books
	public List getDaoAllBooks() {

		List list = bookRepository.findAll();
		return list;
	}

//	find book by book id
	public Books getDaoBookById(Integer id) {
		Books book = bookRepository.getBookBybid(id);
		if (book != null) {
			return book;
		}
		return null;
	}

//	add book
	public Books addDaoBooks(Books book) {
		book = bookRepository.save(book);
		return book;
	}

	public Books updateDaoBooks(Books book, Integer id) {

		Books book1 = bookRepository.getById(id);
		if (book1 != null) {
			book1.setTitle(book.getTitle());
			book1.setAuthor(book.getAuthor());
			book1.setPrice(book.getPrice());
			bookRepository.save(book1);
			return book1;
		}
		return null;

		/*
		 * List<Books> list = bookRepository.findAll(); list = list.stream().filter(l ->
		 * l.getBid() == book.getBid()).map(l -> { l.setPrice(book.getPrice());
		 * l.setTitle(book.getTitle()); l.setAuthor(book.getAuthor()); return l;
		 * }).collect(Collectors.toList()); System.out.println(list);
		 * bookRepository.saveAll(list);
		 * 
		 * return list.get(0);
		 */
	}

	public void deleteDaoBooks(Integer id) {
		Books book = bookRepository.getBookBybid(id);
		if (book != null) {
			bookRepository.delete(book);
		}
	}
}
