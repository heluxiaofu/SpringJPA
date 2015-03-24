package test;

import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import po.Tperson;

import service.TestService;

import dao.TpersonRepository;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*TestService testService = (TestService) applicationContext.getBean("testService");
		System.out.println(testService);*/
		TpersonRepository repository = (TpersonRepository) applicationContext.getBean("tpersonRepository");
		Iterator<Tperson> ite = repository.findAll().iterator();
		
		while(ite.hasNext()){
			System.out.println(ite.next().getTpersonId());
		}
	}

}
