package testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.Book;
import spring5.Orders;
import spring5.User;
import spring5.bean.Emp;
import spring5.service.UserService;

public class TestBean {
    @Test
    public void testAdd(){

        //1.加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testBean2(){

        //1.加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.add();
    }



}
