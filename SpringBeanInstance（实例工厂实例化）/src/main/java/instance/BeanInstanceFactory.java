package instance;

import sun.plugin.com.BeanClass;

public class BeanInstanceFactory {
    public BeanClass createBeanClassInstance() {
        return new BeanClass("调用实例工厂方法实例化Bean");
    }
}
