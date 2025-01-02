package in.sb.main.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import in.sb.main.entity.Book;
@Component
public class BookService 
{
	private static List<Book> list=new ArrayList<>();
	
	static 
	{
		list.add(new Book(12,"JAVA BOOK","JAMES GOSLING"));
		list.add(new Book(13,"PYTHON BOOK","VAN ROSSUM"));
		list.add(new Book(14,"JAVASCRIPT","BRENDEN EICH"));
	}
	
	//get all books
	public List<Book> getallBooks()
	{
		return list;
	}
	
	//get single book
	public Book getBookById(int id)
	{
		Book book=null;
		book=list.stream().filter(e->e.getId()==id).findFirst().get();			//matching the list through id for print
		return book;
	}
}
