package com.JavaSpringLearning.Service;

import com.JavaSpringLearning.Service.Dao.UserDao;
import com.JavaSpringLearning.Service.Impl.UserImpl;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class executeDemo {
    public static void main(String[] args) {
        // create bean factory
        // create xml loader
        // bind loader to factory
        // get bean by id
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
        xmlBeanDefinitionReader.loadBeanDefinitions("beans.xml");

        UserDao userimpl = (UserImpl) beanFactory.getBean("userimpl");
        System.out.println(userimpl);


    }
}
