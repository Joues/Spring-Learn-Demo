package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.plugin.com.BeanClass;

public class TestInstance {
    public static void main(String[] args) {
//        初始化Spring容器ApplicationContext，加载配置文件
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
//        测试静态工厂方法实例化Bean
        BeanClass b2 = (BeanClass) appCon.getBean("staticFactoryInstance");
        System.out.println(b2+b2.message);

    }
}
