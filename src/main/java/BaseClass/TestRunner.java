package BaseClass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

        glue = "TestStep",
        features = "src/test/java/BDD/",

        plugin = {
                "pretty",
                "json:target/cucumber.json",
        },
        tags = "@CheckoutSneakers"
)

public class TestRunner extends BaseSetUp{

//        @BeforeClass
//        public static void setup() throws IOException {
//                getDriver();
//                openWebsite(getUrl());
//                maximizeWebsite();
//        }
//
//        @AfterClass
//        public static void tearDown() {
//                closeWebsite();
//
//        }

}
