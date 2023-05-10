package io.github.hmk.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.hmk.config.Rover;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.time.Duration;

public class Hooks {

    private static final Logger LOGGER = (Logger) LogManager.getLogger(Hooks.class.getName());
    private final BaseDriver baseDriver;

    public Hooks(BaseDriver baseDriver) {
        this.baseDriver = baseDriver;
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        LOGGER.info("Scenario: " + scenario.getName() + " started");
        
    }

    @After
    public synchronized void afterScenario(Scenario scenario) {
        LOGGER.info("Scenario: " + scenario.getName() + " finished.Status: " + scenario.getStatus());
    }
}
