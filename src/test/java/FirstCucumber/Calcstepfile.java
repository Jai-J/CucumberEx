package FirstCucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Calcstepfile {
	
	@Given("Enter 50 in the calculator")
	public void firstvalue()
	{
		System.out.println("Entered first value:50");
	}
	
	@And("Press add button")
	public void clickAdd()
	{
		System.out.println("Pressed Add button");
	}
	
	@And("Enter 50 in the calculator again")
	public void secondvalue()
	{
		System.out.println("Entered second value:50");
	}
	
	@When("press equal button")
	public void clickequal()
	{
		System.out.println("Pressed the equal button");
	}
	
	@Then("The result should be 100 on this screen")
	public void result()
	{
		System.out.println("Result showned as 100");
	}
}
