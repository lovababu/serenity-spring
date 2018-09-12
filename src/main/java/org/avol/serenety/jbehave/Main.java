package org.avol.serenety.jbehave;

import org.avol.serenety.jbehave.config.AppConfig;
import org.avol.serenety.jbehave.service.SampleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        SampleService sampleService = applicationContext.getBean(SampleService.class);
        System.out.println(sampleService.greet("Srilekha"));
    }
}
