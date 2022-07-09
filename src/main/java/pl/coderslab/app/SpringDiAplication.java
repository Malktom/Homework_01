package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.Customer;
import pl.coderslab.beans.MemoryCustomerRepository;
import pl.coderslab.beans.SimpleCustomerLogger;

public class SpringDiAplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SimpleCustomerLogger simpleCustomerLogger = context.getBean(SimpleCustomerLogger.class);

        simpleCustomerLogger.log();
        System.out.println("============");

        MemoryCustomerRepository memoryCustomerRepository = context.getBean(MemoryCustomerRepository.class);









        context.close();
    }
}
