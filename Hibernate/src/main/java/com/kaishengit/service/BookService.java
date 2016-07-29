package com.kaishengit.service;

import com.kaishengit.dao.BookDao;
import com.kaishengit.dao.BookTypeDao;
import com.kaishengit.dao.PubliserDao;
import com.kaishengit.pojo.Book;
import com.kaishengit.pojo.BookType;
import com.kaishengit.pojo.Publisher;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@Transactional
public class BookService {
    @Inject
    private BookDao bookDao;
    @Inject
    private BookTypeDao bookTypeDao;
    @Inject
    private PubliserDao publiserDao;

    public void saveBook(Book book){
        bookDao.save(book);

    }
    public List<Book> findAllBook(){
        return bookDao.findAll();
    }

    public List<BookType> findAllBookType(){
        return bookTypeDao.findAll();
    }

    public List<Publisher> findAllPublisher(){
        return publiserDao.findAll();
    }

    public void delBook(Integer id){
        bookDao.del(id);
    }
    public void delBook(Book book){
        bookDao.del(book);
    }
    public Book findBookById(Integer id ){
        return bookDao.findById(id);
    }

}
