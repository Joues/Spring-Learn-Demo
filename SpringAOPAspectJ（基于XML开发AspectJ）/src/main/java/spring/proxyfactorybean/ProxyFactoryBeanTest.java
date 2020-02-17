package spring.proxyfactorybean;

import dynamic.jdk.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/2/17 13:23
 */
public class ProxyFactoryBeanTest {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("/spring/proxyfactorybean/applicationContext.xml");
//        从容器中获取增强后的目标对象
        TestDao testDaoAdvice = (TestDao)appCon.getBean("testDaoProxy");
//        执行方法
        testDaoAdvice.save();
        System.out.println("========================");
        testDaoAdvice.modify();
        System.out.println("========================");
        testDaoAdvice.delete();
    }
}
