package cn.itcast.controller;

import cn.itcast.domain.Book;
import cn.itcast.service.BookService;

import cn.itcast.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/bookController")
public class BookController {



    @RequestMapping("/a")
    public String text(){
        System.out.println("run...");
        return "success";
    }

    @RequestMapping("/test")
    public @ResponseBody Book test(Book book) {
        System.out.println("controller执行");
        System.out.println(book.getBookName());
        System.out.println(book.getAuthor());
        book.setBookName("如何养俊杰狗");
        book.setAuthor("书爸爸");
        return book;
    }

    @Autowired
    private BookService service;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("controller执行");
        List<Book> list = service.findAll();
        model.addAttribute("list",list);
        return "list";
    }

}
