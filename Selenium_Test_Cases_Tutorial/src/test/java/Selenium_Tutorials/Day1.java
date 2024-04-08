 package Selenium_Tutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Test case
		 1)Launch browser (chrome)
		 2)Open URL
		 3)Validate title should be  "Your Store"
		 4) close browser
		 */

		// 1) Launch browser (chrome)
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		//2)Open URL
				driver.get("http://demo.opencart.com/");
				//3)Validate title should be  "Your Store"
				
				String act_title=driver.getTitle();
				 
				 if (act_title.equals("Your Store"))
				 {
				 System.out.println("test case is passed");
				 }
				
				 else 
					 
				 {
					 System.out.println("test is failed");
				 }
				  driver.close();
				
			
	}

}
