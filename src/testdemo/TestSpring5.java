package testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.Book;
import spring5.Orders;
import spring5.User;

public class TestSpring5 {
    @Test
    public void testAdd(){

        //1.加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook(){

        //1.加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders(){

        //1.加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2.获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.orderTest();
    }

}
