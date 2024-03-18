package org.loginpojo;

import org.openqa.selenium.WebElement;

public class AchiveLoginPojo extends LoginPojoFramework {
public static void main(String[] args) throws InterruptedException {
	browserLaunch();
	launchUrl("https://www.facebook.com/");
	
	LoginPojoFramework l=new LoginPojoFramework();
	WebElement email = l.getEmail();
	email.sendKeys("sst");
	driver.navigate().refresh();
	WebElement email1 = l.getEmail();
	email1.sendKeys("rajesh");
	WebElement pass = l.getPassword();
	pass.sendKeys("928299292");
	driver.navigate().refresh();
	WebElement pass1 = l.getPassword();
	pass1.sendKeys("893565672");
	WebElement login2 = l.getLogin();
	login2.click();
	
}
}
