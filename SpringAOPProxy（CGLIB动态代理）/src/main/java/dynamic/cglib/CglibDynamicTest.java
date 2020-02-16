package dynamic.cglib;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/2/16 15:00
 */
public class CglibDynamicTest {
    public static void main(String[] args) {
        //创建代理对象
        CglibDynamicProxy cdp = new CglibDynamicProxy();
        //创建目标对象
        TestDao testDao = new TestDao();
        //获取增强后的目标对象
        TestDao testDaoAdvice = (TestDao)cdp.createProxy(testDao);
        //执行方法
        testDaoAdvice.save();
        System.out.println("=============");
        testDaoAdvice.modify();
        System.out.println("=============");
        testDaoAdvice.delete();
    }
}
