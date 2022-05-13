package com.restapi.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.restapi.book.entity.Books;

@Service
public class BookService {

	private static List<Books> list = new ArrayList<Books>();;
	static {
		list.add(new Books(1, "bpb publication", "C++"));
		list.add(new Books(2, "pact", "python"));
		list.add(new Books(3, "mcgraw hill", "physics"));
	}

	//// return list of books
	public List<Books> getAllBooks() {
		return list;
	}

	public Books getBookById(Integer id) {
		Books book = list.stream().filter(b -> b.getId() == id).findFirst().get();
		return book;
	}

	public Books addBooks(Books book) {
		list.add(book);
		return book;
	}

//	lb=book of list
	public void bookUpdate(Books book) {
		list=list.stream().filter(lb -> lb.getId() == book.getId()).map(lb-> {
			lb.setAuthor(book.getAuthor());
			lb.setTitle(book.getTitle());
			return lb;
		}).collect(Collectors.toList());
	}

	public void bookDelete(Integer id) {
		list=list.stream().filter(lb->(lb.getId()!=id)).collect(Collectors.toList());
		
	}
}
