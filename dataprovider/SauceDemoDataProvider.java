package dataprovider;

import org.testng.annotations.DataProvider;

 public class SauceDemoDataProvider {

    /*
     * @DataProvider(name = "loginData")
     * - Returns a 2D Object array where EACH row is one test run.
     * - Column order matches the @Test method parameters:
     *     username | password | expectedOutcome
     * - We keep "expectedOutcome" as a simple string flag:
     *     "success" -> login should pass
     *     "locked"  -> user is locked out, should see locked message
     *     "invalid" -> wrong creds, should see invalid login message
     */
    @DataProvider(name = "loginData")
    public Object[][] getData() {
        return new Object[][]{
            {"standard_user",  "secret_sauce", "success"}, // valid user
            {"locked_out_user", "secret_sauce", "locked"},  // locked out user
            {"performance_glitch_user", "secret_sauce", "success"}, // valid (may be slower)
            {"invalid_user", "wrong_pass", "invalid"} // invalid credentials
        };
    }
}
