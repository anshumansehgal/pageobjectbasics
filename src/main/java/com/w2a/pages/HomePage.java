package com.w2a.pages;

import org.openqa.selenium.By;


import com.w2a.base.Page;

public class HomePage extends Page {


	public void goToCustomers() {
		driver.findElement(By.xpath("//a[@class='zh-customers']")).click();
	}

	public void goToSupport() {
		driver.findElement(By.xpath("//a[@class='zh-support']")).click();
	}

	public void goToContactSales() {
		driver.findElement(By.xpath("//a[@class='zh-contact']")).click();
	}

	public void goToSignUp() {
		driver.findElement(By.xpath("//a[@class='zh-signup']")).click();
	}

	public LoginPage goToLogin() {

		click("loginlink_XPATH");
		
		return new LoginPage();

	}

	public void validateFooterLinks() {

	}
}
