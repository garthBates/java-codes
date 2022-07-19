package com.skillstorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.skillstorm.controllers.ExpenseController;
import com.skillstorm.data.ExpenseDAO;
import com.skillstorm.data.ExpenseDAOHibernateImpl;
import com.skillstorm.data.ExpenseDAOImpl;

@Configuration
public class SpringConfig {
	
	public static void main(String[] args) {
		// start a Spring App - by creating the IoC Container
		// IoC - BeanFactory / ApplicationContext
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		ExpenseController controller = context.getBean(ExpenseController.class);
		controller.callDao();
	}

	// Bean definitions - tells Spring to manage these beans
	@Bean   
	public ExpenseDAO expenseDAO() {
		//return new ExpenseDAOHibernateImpl();
		return new ExpenseDAOImpl();
	}
	
	@Bean
	public ExpenseController expenseController() {
		// call a setter, or use a constructor (constructor injection or setter injection)
		ExpenseController controller = new ExpenseController();
		controller.setDao(expenseDAO()); // DI - bean wiring
		return controller;
	}
	
}
