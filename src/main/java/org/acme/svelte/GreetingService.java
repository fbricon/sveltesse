package org.acme.svelte;

import java.util.Random;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    private String[] greetings = {"Hello", "Hi", "Greetings"};

    public String greets(String name) {
        name = (name == null || name.isBlank())?"World":name;
        return greetings[new Random().nextInt(3)] + " " + name;
    }
}
