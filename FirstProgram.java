package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;



public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
	WebDriver driver= new ChromeDriver(); 
	
	driver.get("http://www.google.com");
	String title=driver.getTitle();
	System.out.println(title);
	
	if (title.equalsIgnoreCase("google")){
		
		System.out.println("Pass");}
		
	else {
			System.out.println("False");
	}
	
//finding element
	//WebElement element1=driver.findElement( By.name("q"));
	WebElement element1=driver.findElement( By.xpath("//input[@name='q']"));
	element1.sendKeys("facebook");
	element1.sendKeys(Keys.ENTER);
	
	WebElement element2=driver.findElement(By.xpath("//h3[text()='Facebook - Log In or Sign Up']"));
    element2.click();
    //driver.wait();
    //use of java script
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("document.getElementById('email').value='shyam';");
	//driver.close();
    //WebElement element3=driver.findElement( By.xpath("//input[@name='email']"));
    //element3.sendKeys("shyam");
	}

	}

