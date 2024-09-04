package listenerPractice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerPractice.ListenerImplementation.class)
public class TestClass extends BaseClass {
	
	@Test
	public void testMethiod() {
		System.out.println("@Test");
		Assert.fail();
		
	}

}
