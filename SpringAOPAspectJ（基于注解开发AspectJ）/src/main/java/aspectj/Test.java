package aspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/2/17 14:42
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person=(Person)context.getBean("babyPerson");
        person.eatBreakfast();
        System.out.println("==================================================");
        person.eatLunch();
        System.out.println("==================================================");
        person.eatSupper();
        System.out.println("==================================================");
        person.drink("可乐");
        System.out.println("==================================================");
    }
}