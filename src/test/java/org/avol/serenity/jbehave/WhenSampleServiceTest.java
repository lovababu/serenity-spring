package org.avol.serenity.jbehave;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.avol.serenity.jbehave.steps.SampleServiceSteps;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class WhenSampleServiceTest {
    @Steps
    private SampleServiceSteps steps;

    @Test
    public void test() {
        steps.a_system_initiated();
        steps.when_the_user_send_greet_request_with("Srilekha");
        steps.then_the_response_should_contains("Srilekha");
    }
}
