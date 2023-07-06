package pagepack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class page1 {
	WebDriver driver;
	By myaccount=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a");
	By regstrn=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	By firstname=By.xpath("//*[@id=\"input-firstname\"]");
	By lastname=By.xpath("//*[@id=\"input-lastname\"]");
	By email=By.xpath("//*[@id=\"input-email\"]");
	By telephone=By.xpath("//*[@id=\"input-telephone\"]");
	By password=By.xpath("//*[@id=\"input-password\"]");
	By psswrdcnfrm=By.xpath("//*[@id=\"input-confirm\"]");
	By checkbox=By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
	By continue1=By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	By continue2=By.xpath("//*[@id=\"content\"]/div/div/a");
	
	public page1(WebDriver driver) {
		this.driver=driver;
		
	}

public void click()
{
	driver.findElement(myaccount).click();
}
public void click2()
{
	driver.findElement(regstrn).click();
}
public void setvalues(String fname,String lname,String emailid,String tele,String pass,String passconfrm)
{
	driver.findElement(firstname).sendKeys(fname);
	driver.findElement(lastname).sendKeys(lname);
	driver.findElement(email).sendKeys(emailid);
	driver.findElement(telephone).sendKeys(tele);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(psswrdcnfrm).sendKeys(passconfrm);
}
public void click3() {
	driver.findElement(checkbox).click();
}
public void click4()
{
	driver.findElement(continue1).click();
}
public void click5()
{
	driver.findElement(continue2).click();
}

}
