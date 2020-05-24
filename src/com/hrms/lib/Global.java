package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
//var /testdata
	public WebDriver driver;
	public String url="http://127.0.0.1/Orangehrm-2.6/login.php";
	public String un="admin";
	public String pw="admin";
	//objects
	public String txt_loginname="txtUserName";
	public String txt_passwaord="//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[2]/input";
	public String btn_login="Submit";
	public String link_logout="Logout";
	
}
