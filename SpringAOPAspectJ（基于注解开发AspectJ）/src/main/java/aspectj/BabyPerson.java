package aspectj;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/2/17 14:39
 */

import org.springframework.stereotype.Component;

/**
 *功能  人的实现类
 */
@Component
public class BabyPerson implements Person{

    @Override
    public void eatBreakfast() {
        System.out.println("小Baby正在吃早餐");
    }

    @Override
    public void eatLunch() {
        System.out.println("小Baby正在吃午餐");
    }

    @Override
    public void eatSupper() {
        System.out.println("小Baby正在吃晚餐");
    }

    @Override
    public String drink(String name) {
        return "小Baby在喝："+name;
    }

}