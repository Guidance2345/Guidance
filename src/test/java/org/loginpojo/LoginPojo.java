package org.loginpojo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPojo extends Base {
    public static void main(String[] args) throws IOException, InterruptedException {
		browserLaunch();
		launchUrl("https://www.facebook.com/");
		pageTitle();
		pageUrl();
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        fillText(email, "sst");
        driver.navigate().refresh();
        WebElement email1 = driver.findElement(By.xpath("//input[@name='email']"));
        fillText(email1, "rajesh");
        WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		loginPassword(pass, "1128229");
		driver.navigate().refresh();
		WebElement pass1 = driver.findElement(By.xpath("//input[@type='password']"));
		loginPassword(pass1, "334444");
		WebElement login = driver.findElement(By.name("login"));
		loginButton(login);
		
		String screenshot="login";
		takeScreenShot(screenshot);
		
		 
	}
}
