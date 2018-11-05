package cn.itcast.test;

import cn.itcast.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test(){
        ApplicationContext ca = new ClassPathXmlApplicationContext("classpath:config.xml");
        BookService ser = ca.getBean("bookService", BookService.class);
       ser.findAll();
    }
}
