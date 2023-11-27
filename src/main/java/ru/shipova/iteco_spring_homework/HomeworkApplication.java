package ru.shipova.iteco_spring_homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import ru.shipova.iteco_spring_homework.service.ExternalService;
import ru.shipova.iteco_spring_homework.service.Flow;

@ComponentScan
@PropertySource("classpath:application.properties")
public class HomeworkApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HomeworkApplication.class);

		Flow flow = applicationContext.getBean(Flow.class);
		flow.run(1);
		flow.run(2);
		flow.run(2);
		flow.run(3);
		flow.run(4);
	}

}
