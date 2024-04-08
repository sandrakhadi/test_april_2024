package Selenium_Tutorials;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day2 {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver. manage().window().maximize();
  driver. get("https://demo.opencart.com/");
  
  // LOCATORS!!!!!
  
  //1)Find Element by Name!!!!!
  
  /*driver. findElement(By.name( "search")).sendKeys("Mac");
 driver. close();*/
 
  
  //  ID!!!
  
   /* boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
	System.out.println(logoDisplayStatus) ;*/
	
	//linktext & partialLinkText!!!!
  
  //driver.findElement(By.linkText("Tablets")).click();
  //driver.findElement(By.partialLinkText("Table")).click();
  
  //CLASSNAME!!!!!
  
/* List <WebElement> headerLinks =driver.findElements(By.className("list-inline-item"));
  System.out.println("Total amount of header links:" +headerLinks.size());
  driver.close();*/
  
  //TAGNAME!!!
  
  List <WebElement>links=driver.findElements(By.tagName("a"));
  System.out.println("Total amount of links:" +links. size());
  driver.close();
  
	}

}
