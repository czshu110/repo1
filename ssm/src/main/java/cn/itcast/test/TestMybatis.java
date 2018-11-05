package cn.itcast.test;

import cn.itcast.dao.BookDao;
import cn.itcast.domain.Book;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class TestMybatis {
    @Test
    public void test2() throws IOException {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建sqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlSession对象
        SqlSession session = factory.openSession();
        //获取到代理对象
        BookDao dao= session.getMapper(BookDao.class);

        List<Book> list = dao.findAll();
        for (Book book : list) {
            System.out.println(book.getBookName());
        }
        //关闭资源
        session.close();
        in.close();

    }

    @Test
    public void test3() throws IOException {

        Book book = new Book();
        book.setBookName("如何养好俊杰狗");
        book.setAuthor("书爸爸");
        book.setKind_id(2);
        book.setCompany("黑马出版社");
        book.setPrice(50.0);
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建sqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //创建sqlSession对象
        SqlSession session = factory.openSession();
        //获取到代理对象
        BookDao dao= session.getMapper(BookDao.class);

       dao.save(book);
       //增删改操作需要提交才能生效
       session.commit();
        //关闭资源
        session.close();
        in.close();

    }
}
