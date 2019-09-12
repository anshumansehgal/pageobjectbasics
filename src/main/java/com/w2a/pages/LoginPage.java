package com.w2a.pages;


import com.w2a.base.Page;

public class LoginPage extends Page {

	public ZohoAppPage doLogin(String username, String password) {// will be read from excel sheet at runtime

		type("email_CSS", username);
		type("password_CSS", password);
		click("signBtn_CSS");

		return new ZohoAppPage();
	}
}
