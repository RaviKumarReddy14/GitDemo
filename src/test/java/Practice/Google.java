package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
		
		
		
		driver.get("https://www.google.com/");
		
		System.out.println("https://www.google.com/" + "Executeed Successfully");
		
		String tittle="Google";
		
		if(tittle.equalsIgnoreCase("image")) {
			System.out.println("Failed script");
			
		}
		
		else {
			System.out.println("script failed");
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
