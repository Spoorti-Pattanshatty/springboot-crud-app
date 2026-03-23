package com.tap.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tap.models.Book;
import com.tap.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bs;
	
	@GetMapping("Book")
	public List<Book> getAllBooks() {
		return bs.getAllBooks();
	}
	
	@GetMapping("Book/{id}")
	public Book getBook(@PathVariable("id") int bid) {
		return bs.getBook(bid);
	}

	@PostMapping("Book")
	public String  insertBook(@RequestBody Book b) {
		return bs.insertBook(b);
	}
	
	@PutMapping("Book/{id}")
	public String updateBook(@PathVariable("id") int bid, @RequestBody Book b) {
		
		return bs.updateBook(bid, b);
	}
	
	@DeleteMapping("Book/{id}")
	public String deleteBook(@PathVariable("id") int bid) {
		return bs.deleteBook(bid);
	}
}
