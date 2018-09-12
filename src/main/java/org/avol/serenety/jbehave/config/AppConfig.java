package org.avol.serenety.jbehave.config;

import org.avol.serenety.jbehave.service.SampleService;
import org.avol.serenety.jbehave.service.impl.SampleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SampleService sampleService() {
        return new SampleServiceImpl();
    }
}
