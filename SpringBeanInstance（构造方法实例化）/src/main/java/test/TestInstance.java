package test;

import instance.BeanClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInstance {
    public static void main(String[] args) {
//        初始化Spring容器ApplicationContext，加载配置文件
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
//        测试构造方法实例化Bean
        BeanClass b1 = (BeanClass) appCon.getBean("constructorInstance");
        System.out.println(b1+b1.message);

    }
}
