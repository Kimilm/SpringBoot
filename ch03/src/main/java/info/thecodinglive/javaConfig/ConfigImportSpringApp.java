
package info.thecodinglive.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import basic.WorkService;

public class ConfigImportSpringApp {
	public static void main (String [] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		WorkService yourWorkService = context.getBean("yourWorkService", WorkService.class);
		yourWorkService.askWork();
		
		WorkService myWorkService = context.getBean("myWorkService", WorkService.class);
		myWorkService.askWork();
		
		Company company = context.getBean("company", Company.class);
		company.getName();
		
		context.close();
	}
}
