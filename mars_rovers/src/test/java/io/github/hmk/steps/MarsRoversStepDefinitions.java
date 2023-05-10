package io.github.hmk.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.hmk.config.Rover;




import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoversStepDefinitions {



    public MarsRoversStepDefinitions() {
        rover = new Rover();
    }
    @Given("the plateau's upper-right coordinates is {string}")
    public void upperRightCoordinate(String upperRight) {
        rover.setUpperRightCoordinates(upperRight);       
    }

    @Given("the beginning rover position is {string}")
    public void setPosition(String first_position) {
        String[] parameters=first_position.split(",");
        rover.setPosition(parameter[0], parameters[1], parameters[2]));     
    }

    @When("the Mars Rovers is moved based on {string} intructions")
    public void movement(String commands) {
        rover.process(commands);       
    }

    @Then("last position of the Mars Rovers should be {string}")
    public void shouldBeLastPosition(String last_position) {
    String last_position_printed=rover.printPosition();
    assertEquals(last_position_printed,last_position);
    }
}
