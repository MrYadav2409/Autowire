package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Employee;
import beans.Student;

public class SpringClient {

	public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

Employee e=(Employee)context.getBean("emp");
e.sayHello();

Student s = (Student)context.getBean(Student.class);
s.show();
	

	
	}

}
