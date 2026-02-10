package parallel;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class skip {
	boolean flag = true;
	@Test
	public void s()
	{
		if(flag)
			throw new SkipException("custom error: skip the test");
		System.out.println("seetha");
	}

}
