package org.avol.serenity.jbehave.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.avol.serenety.jbehave.config.AppConfig;
import org.avol.serenety.jbehave.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@ContextConfiguration(classes = AppConfig.class)
public class SampleServiceSteps extends ScenarioSteps {

    @Autowired
    private SampleService sampleService;

    private String outpout;

    @Step("Given a system initiated")
    public void a_system_initiated() {
        System.out.println(sampleService != null);
        assertNotNull(sampleService);
    }

    @Step("When the user send greet request with {0}")
    public void when_the_user_send_greet_request_with(String username) {
        outpout = sampleService.greet(username);
    }

    @Step("Then the response should contains {0}")
    public void then_the_response_should_contains(String username) {
        assertTrue(outpout.contains(username));
    }
}
