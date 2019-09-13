package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class AccountsPage extends Page{
	
	public CreateAccountPage gotoCreateAccounts() {
		
		click("createaccountbtn_XPATH");
		click("createaccountsub_XPATH");
		
		return new CreateAccountPage();
	}

}
