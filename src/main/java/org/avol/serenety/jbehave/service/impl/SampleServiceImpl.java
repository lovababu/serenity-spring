package org.avol.serenety.jbehave.service.impl;

import org.avol.serenety.jbehave.service.SampleService;

public class SampleServiceImpl implements SampleService {

    public String greet(String username) {
        return String.format("Hello, %s welcome to serenity jbehave.", username);
    }
}
