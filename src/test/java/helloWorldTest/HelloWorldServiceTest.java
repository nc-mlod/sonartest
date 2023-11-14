package helloWorldTest;

import org.testng.annotations.BeforeClass;
import service.HelloWorldService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldServiceTest {
    private HelloWorldService helloWorldService;

    @BeforeClass
    public void beforeSuite(){
        helloWorldService = new HelloWorldService();
    }
    @Test
    public void isBusinessCostsReturningRightCosts(){
        int businessCost = helloWorldService.calcBusinessCosts(50, 13);
        Assert.assertEquals(businessCost, 37);
    }

    @Test
    public void isHelloWorldMethodReturningHelloWorldText(){
        Assert.assertEquals(helloWorldService.helloWorldTextValue(), "Hello world");
    }
}
