package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	@Test
	public void call()
	{
		Reporter.log("call the person",true);
	}
    @Test(priority= -1)
    public void setting()
    {
    	Reporter.log("setting message",true);
    }
    @Test(priority=0)
    public void chat()
    {
    	Reporter.log("chatting with girlfriend",true);
    }
    @Test(priority= 2)
    public void turnOff()
    {
    	Reporter.log("switch off",true);
    }
}
