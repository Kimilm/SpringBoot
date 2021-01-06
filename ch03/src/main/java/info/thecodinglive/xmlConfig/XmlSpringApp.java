package info.thecodinglive.xmlConfig;

import org.springframework.context.support.GenericXmlApplicationContext;

import basic.WorkService;


public class XmlSpringApp {
	public static void main (String [] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		WorkService yourWorkService = context.getBean("yourWorkService", WorkService.class);
		yourWorkService.askWork();
		
		WorkService myWorkService = context.getBean("myWorkService", WorkService.class);
		myWorkService.askWork();
		
		context.close();
	}
}
