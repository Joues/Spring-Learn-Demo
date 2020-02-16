package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.plugin.com.BeanClass;

public class TestInstance {
    public static void main(String[] args) {
//        初始化Spring容器ApplicationContext，加载配置文件
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
//        测试实例工厂方法实例化Bean
        BeanClass b3 = (BeanClass) appCon.getBean("instanceFactoryInstance");
        System.out.println(b3+b3.message);

    }
}
