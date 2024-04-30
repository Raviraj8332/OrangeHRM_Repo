package orangehrm.library;

import org.openqa.selenium.By;

import utils.AppUtils;

public class LoginPage extends AppUtils
{
	
 public void login(String uid,String pwd)
 {
driver.findElement(By.id("txtUsername")).sendKeys(uid);	 
driver.findElement(By.id("txtPassword")).sendKeys(pwd);	 
driver.findElement(By.id("btnLogin")).click();
 }
 
	
	
	
	
	
}
