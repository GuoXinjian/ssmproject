package com.gxj.controller.test;

import com.gxj.controller.TestController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void testSpring(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext( "applicationContext.xml");
        TestController testController=
                (TestController) applicationContext.getBean("testController");
        testController.hello();
    }
}
