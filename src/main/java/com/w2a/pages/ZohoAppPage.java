package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{
	
	
	public CRMHomePage gotoCRM(){
		click("crmlink_XPATH");
		
		return new CRMHomePage();
	}

	public void gotoMail() {
		driver.findElement(By.xpath("//span[@class='zicon-apps-mail zicon-apps-96']")).click();
	
	}
	
	public void gotoCliq() {
		
		driver.findElement(By.xpath("//span[@class='zicon-apps-chat zicon-apps-96']")).click();
	}
}
