package Sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Union_Bank_Id_learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		System.out.println("started");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("loanamount")).sendKeys("10000");
		driver.findElement(By.id("rate")).sendKeys("12");
		driver.findElementById("pmonths").sendKeys("60");
		
		
		driver.findElement(By.id("Button1")).click();
		
		driver.findElement(By.id("EMI")).getAttribute("value");

	}

}
