package com.demo.test;

import junit.framework.Assert;
import org.junit.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void testLengthOfTheUniqueKey() {
 
		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());
 
	}
	
	//@Test
	public void testLengthOfTheUniqueKeyFails() {
 
		App obj = new App();
		Assert.assertEquals(35, obj.generateUniqueKey().length());
 
	}
}
