package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
		
		
		
		driver.get("https://www.google.com/");
		
		System.out.println("https://www.google.com/" + "Executeed Successfully");
		Thread.sleep(2000);
		driver.close();
		
	}

}
