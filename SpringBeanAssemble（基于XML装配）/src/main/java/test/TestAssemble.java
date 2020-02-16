package test;

import assemble.ComplexUser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAssemble {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
//        使用构造方法装配测试
        ComplexUser u1 = (ComplexUser) appCon.getBean("user1");
        System.out.println(u1);
        System.out.println("-------------------------");
//        使用setter方法装配测试
        ComplexUser u2 = (ComplexUser) appCon.getBean("user2");
        System.out.println(u2);
    }
}
