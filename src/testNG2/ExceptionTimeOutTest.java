/**
 * 
 */
package testNG2;

import org.testng.annotations.Test;

/**
 * @author Manish
 *
 */
public class ExceptionTimeOutTest 
{
//@Test(invocationTimeOut=200, expectedExceptions=NumberFormatException.class)
//public void infiniteLoopTest()
//{
//	int i=1;
//	while(i==1)
//	{
//		System.out.println(i);
//	}
//}
	@Test(expectedExceptions=NumberFormatException.class)
	public void test()
	{
		String s="100A";
		Integer.parseInt(s);
	}
}
	

