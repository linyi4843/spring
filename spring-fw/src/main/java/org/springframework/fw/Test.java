package org.springframework.fw;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created with IDEA
 *
 * @author: linyi
 * @Email: linyi4843@gmail.com
 */
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Hello hello = (Hello) context.getBean("hello");
		hello.sayHello();

		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(""));


	}

}
