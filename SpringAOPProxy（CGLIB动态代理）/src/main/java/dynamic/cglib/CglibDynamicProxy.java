package dynamic.cglib;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: yihangjou(周逸航)
 * @Site: www.yihang.ml
 * @cnBlogs: https://www.cnblogs.com/yihangjou/
 * @Date: create in 2020/2/16 14:54
 */
public class CglibDynamicProxy implements MethodInterceptor {
    /**
     * 创建代理的方法，生成CGLIB代理对象
     * target是目标对象，需要增强的对象
     * 返回目标对象的CGLIB代理对象
     */
    public Object createProxy(Object target) {
//        创建一个动态类对象，即增强类对象
        Enhancer enhancer = new Enhancer();
//        确定需要增强的类，设置其父类
        enhancer.setSuperclass(target.getClass());
//        确定代理逻辑对象为当前对象，要求当前对象实现MethodIntercepor的方法
        enhancer.setCallback((Callback) this);
//        返回创建的代理对象
        return enhancer.create();
    }

    /**
     * intercept方法会在程序执行目标方法时被调用
     * proxy时CGLIB根据指定父类生成的代理对象
     * method是拦截方法
     * args是拦截方法的参数数组
     * methodProxy是方法的代理对象，用于执行父类的方法
     * 返回代理结果
     */

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        //创建一个切面
        MyAspect myAspect = new MyAspect();
        //前增强
        myAspect.check();
        myAspect.except();
        //目标方法执行，返回代理结果
        Object obj = methodProxy.invokeSuper(proxy, args);
        //后增强
        myAspect.log();
        myAspect.monitor();
        return obj;
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        return null;
    }
}