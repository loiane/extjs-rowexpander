package com.loiane.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loiane.model.Book;
import com.loiane.service.BookService;

/**
 * Controller - Spring
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@Controller
public class BookController {

	private BookService bookService;
	
	/**
	 * Get all the books from "database" to display on
	 * ExtJS data grid
	 * @return JSON object
	 */
	@RequestMapping(value="getBooks.action", method = RequestMethod.GET)
	public @ResponseBody Map<String,? extends Object> view() {

		List<Book> books = bookService.getBooks();

		Map<String,Object> modelMap = new HashMap<String,Object>();
		modelMap.put("books", books);

		return modelMap;
	}

	@Autowired
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	
	
}
