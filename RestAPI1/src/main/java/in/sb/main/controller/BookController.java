package in.sb.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.sb.main.entity.Book;
import in.sb.main.services.BookService;

@RestController
public class BookController 
{
	//@RequestMapping(value = "/books", method= RequestMethod.GET)		//comment out line and try yourself some changes 
	
	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/books")						//for http GET method
	public List<Book> getBooks() 
	{	
		
		return this.bookService.getallBooks();
		
		
//		Book book=new Book();
//		book.setId(123);
//		book.setTitle("JAVA BOOK");
//		book.setAuthor("JAMES GOSLING");
//		return book;
	}
	@GetMapping("/books/{id}")					//for http GET method with id
	public Book getBook(@PathVariable("id")int id)				//for calling 1 book 
	{
		return bookService.getBookById(id);
	}
}
