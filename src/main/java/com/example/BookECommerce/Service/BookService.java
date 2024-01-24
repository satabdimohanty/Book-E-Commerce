package com.example.BookECommerce.Service;

import com.example.BookECommerce.Entity.Book;
import com.example.BookECommerce.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    public Book postBook(Book book)
    {
        return bookRepository.save(book);
    }
    public List<Book>getBook()
    {
        return bookRepository.findAll();
    }
    public  Book getBookBy(int id)
    {
        return bookRepository.findById(id).get();
    }
    public void deletebook(int id)
    {
         bookRepository.deleteById(id);
    }
    public Book editbook(Book book,int id)
    {
        Book book1=bookRepository.findById(id).get();
        book1.setBookid(book.getBookid());
        book1.setBookname(book.getBookname());
        book1.setBookprice(book.getBookprice());
        return bookRepository.save(book1);
    }
}
