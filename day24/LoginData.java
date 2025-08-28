package day24;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginData {
	   @DataProvider(name = "LoginData")
	    public Object[][] getData() {
	        return new Object[][] {
	            {"admin", "admin123"},
	            {"admin", "admin123"},
	            {"admin", "admin123"}
	        };
	    }

	    @Test(dataProvider = "LoginData")
	    public void loginTest(String username, String password) {
	        System.out.println("Running test with: " + username + " | " + password);
	    }
	}

