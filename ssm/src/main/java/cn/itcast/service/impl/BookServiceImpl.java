package cn.itcast.service.impl;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import cn.itcast.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookService")
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao dao;

    @Override
    public List<Book> findAll() {
        System.out.println("业务层，service执行，查询所有");
        return dao.findAll();
    }

    @Override
    public void save(Book book) {
        System.out.println("业务层，保存");
        dao.save(book);
    }
}
