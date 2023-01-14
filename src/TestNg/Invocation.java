package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation {
	@Test
	public void call()
	{
		Reporter.log("call the person",true);
	}
    @Test(priority= -1,invocationCount = 2)
    public void setting()
    {
    	Reporter.log("setting message",true);
    }
    @Test(priority=-1)
    public void chat()
    {
    	Reporter.log("chatting with girlfriend",true);
    }
    @Test(priority= 2)
    public void turnOff()
    {
    	Reporter.log("switch off",true);
    }
    @Test(priority=-4, invocationCount = 4)
    public void VoiceCall()
    {
    	Reporter.log("Love",true);
    }


}
