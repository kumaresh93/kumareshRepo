package stepDfinitions;

import cucumber.api.java.en.Given;

public class Expressionstepdef {
	@Given("^i have (\\d+) laptop$")
	public void i_have_laptop(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("lap count"+ arg1);
	}

	@Given("^i have (\\d+\\.\\d+) cgpa$")
	public void i_have_cgpa(float arg) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
System.out.println("cgpa is"+arg);
	}

	@Given("^\"([^\"]*)\" is elder to \"([^\"]*)\" and \"([^\"]*)\"$")
	public void is_elder_to_and(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
System.out.println(arg1+"is elder to"+arg2+"and"+ arg3);
	}

}
