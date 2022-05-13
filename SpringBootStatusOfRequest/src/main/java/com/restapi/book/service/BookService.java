package com.restapi.book.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restapi.book.dao.BookDao;
import com.restapi.book.entity.Books;

@Service
public class BookService {

	@Autowired
	private BookDao bookDao;

	//// return list of books
	public List<Books> getAllBooks() {
		List list = bookDao.getDaoAllBooks();
		return list;
	}

//	get books by derived method and with @query annotation in bookRepository interface 
	public Books getBookById(Integer id) {
		Books book = bookDao.getDaoBookById(id);
		return book;
	}

//	add book to database
	public Books addBooks(Books book) {
		book = bookDao.addDaoBooks(book);
		return book;
	}

//	Update book in database
	public Books bookUpdate(Books book,Integer id) {
		Books result=bookDao.updateDaoBooks(book, id);
		return result;

	}
//	Delete Book in database

	public void bookDelete(Integer id) {
		bookDao.deleteDaoBooks(id);

	}

}
