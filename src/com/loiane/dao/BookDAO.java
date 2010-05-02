package com.loiane.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.loiane.model.Book;

/**
 * BookDAO - generates dummy data.
 * It does not get any data from database.
 * Only for academic purpose.
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@Repository
public class BookDAO {

	public List<Book> getBooks(){
		return bookGenerator();
	}
	
	private List<Book> bookGenerator(){
		
		List<Book> books = new ArrayList<Book>(3);
		
		StringBuffer description = new StringBuffer();
		
		//book 1
		Book book = new Book();
		book.setId(1);
		book.setTitle("Learning Ext JS");
		book.setPublisher("Packt Publishing");
		book.setISBN10("1847195148");
		book.setISBN13("978-1847195142");
		book.setLink("https://www.packtpub.com/learning-ext-js/book");
		
		description.append("The book provides plenty of fun example code and screenshots to guide you through the creation ");
		description.append("of examples to assist with learning. By taking a chapter-by-chapter look at each ");
		description.append("major aspect of the Ext JS framework, the book lets you digest the available features in small, ");
		description.append("easily understandable, chunks, allowing you to start using the library for your ");
		description.append("development needs immediately.");
		
		book.setDescription(description.toString());
		
		books.add(book);
		
		//book 2
		book = new Book();
		book.setId(2);
		book.setTitle("Ext JS 3.0 Cookbook");
		book.setPublisher("Packt Publishing");
		book.setISBN10("1847198708");
		book.setISBN13("978-1847198709");
		book.setLink("https://www.packtpub.com/ext-js-3-0-cookbook/book");
		
		description.delete(0, description.length()-1);
		description.append("The Ext JS Cookbook contains step-by-step instructions for Ext JS users to build desktop-style ");
		description.append("interfaces in their own web applications. The book is designed so that you can refer to ");
		description.append("it chapter by chapter, or you can look at the list of recipes and read them in no particular order.");
		
		book.setDescription(description.toString());
		
		books.add(book);
		
		//book 3
		book = new Book();
		book.setId(3);
		book.setTitle("Ext JS in Action");
		book.setPublisher("Manning Publications");
		book.setISBN10("1935182110");
		book.setISBN13("978-1935182115");
		book.setLink("http://www.manning.com/garcia/");
		
		description.delete(0, description.length()-1);
		description.append("Ext JS in Action teaches the reader about Ext from the ground up. By following the common design patterns ");
		description.append("demonstrated in the Ext source and in many commercial applications, the  ");
		description.append("book teaches you to achieve the same results you see in world-class commercial JavaScript applications. ");
		
		book.setDescription(description.toString());
		
		books.add(book);
		
		return books;
	}
}
