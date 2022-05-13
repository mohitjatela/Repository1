package com.restapi.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.book.entity.Books;
import com.restapi.book.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;

//	Method to test postman 
	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String getTest() {
		System.out.println("git line");
		System.out.println("git line 2");
		return "code changed for git testing";
	}

//	Read all books
	@GetMapping("/books")
	public ResponseEntity<List<Books>> getBooks() {
		
		List<Books> list = bookService.getAllBooks();
		if(list.size()==0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//			build()--> this will create the ResponseEntity object
		}
//		return ResponseEntity.of(Optional.of(list));
		return ResponseEntity.ok(list);
		
	}

	// Read book by id

	@GetMapping("/books/{bookid}")
	public ResponseEntity<Books> getBookById(@PathVariable("bookid") Integer id) {
		Books book = bookService.getBookById(id);
		if(book==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.ok(book);
	}

//	Add books
	@PostMapping("/books")
	public Books addBooks(@RequestBody Books book) {
		book = bookService.addBooks(book);
		return book;
	}

//	Update the book
	@PutMapping("/books/{bookid}")
	public Books updateBook(@PathVariable("bookid") Integer id,@RequestBody Books book) 
	{
		Books result = bookService.bookUpdate(book,id);
		return result;
	}

////	delete book by id
	@DeleteMapping("/books/{bookid}")
	public String deleteBook(@PathVariable("bookid") Integer id) {
		bookService.bookDelete(id);
		return "delete operation executed";
	}
}
