package com.mahesh;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest2 {

	@Test
	public void sum()
	{
		System.out.println("Sum Method");
		int a=10,b=5;
		Assert.assertEquals(15, a+b);
	}
	
	@Test
	public void sum1()
	{
		System.out.println("Sum1 Method");
		int a=10,b=5;
		Assert.assertEquals(5, a-b);
	}
}
