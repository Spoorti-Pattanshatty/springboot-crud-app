package com.tap.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tap.models.Book;
import com.tap.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository br;
	
	public List<Book> getAllBooks() {
		return (List<Book>)br.findAll();
	}

	public Book getBook(int bid) {
		
		Book b = br.findById(bid);
		
		return b;
	}

	public String insertBook(Book b) {
		
		if(br.save(b) != null) {
			return "Book Saved";
		}
		else {
			return "Book not Saved";
		}
	}

	public String updateBook(int bid, Book b) {
		
		if(br.findById(bid) != null) {
			br.save(b);
			
			return "Book updated";
		}
		
		return "Book not updated";
	}

	public String deleteBook(int bid) {
		br.deleteById(bid);
		
		return "Book Deleted";
	}

	
}
