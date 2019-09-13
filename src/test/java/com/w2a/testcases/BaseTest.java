package com.w2a.testcases;

import org.testng.annotations.AfterSuite;

import com.w2a.base.Page;

//any thing common we have to do in test cases, we will keep in this class
public class BaseTest {

	
	@AfterSuite
	public void tearDown() {
		
		Page.quit();
		
	}
	
}
