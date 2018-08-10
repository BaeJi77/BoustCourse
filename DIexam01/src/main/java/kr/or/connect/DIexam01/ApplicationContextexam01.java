package kr.or.connect.DIexam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextexam01 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml"); 
		System.out.println("초기화 완료");
		
		UserBean ub = (UserBean)ac.getBean("userBean");
		ub.setName("hoon");
		
		System.out.println(ub.getName());
		
		UserBean ub2 = (UserBean)ac.getBean("userBean");
		ub2.setName("111111111");
		
		System.out.println(ub2.getName());
		
		if(ub==ub2) System.out.println("같은 인스턴스다ㅎㅎㅎㅎㅎ");
	}
}
