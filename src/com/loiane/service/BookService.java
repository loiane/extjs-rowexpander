package com.loiane.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loiane.dao.BookDAO;
import com.loiane.model.Book;

/**
 * All the business logic goes here
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@Service
public class BookService {

	private BookDAO bookDAO;
	
	public List<Book> getBooks(){
		return bookDAO.getBooks();
	}

	@Autowired
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
}
