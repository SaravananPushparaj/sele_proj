package Sessions;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Close_quit_Browser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("http://www.naukri.com");
		
		//wait
		Thread.sleep(8000);
		
		//quit
		driver.quit();
		
		//***************************************************************
		
		FirefoxDriver driver2=  new FirefoxDriver();
		driver2.get("http://www.naukri.com");
		
		//wait
		Thread.sleep(8000);
		
		//close
		driver2.close();
		
		
		
		
	}

}
