package test;

import annotation.controller.TestController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMoreAnnotation {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("annotationContext.xml");
        TestController testcon = (TestController) appCon.getBean("testController");
        testcon.save();
    }
}
