package newPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MyClass {


    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
    	WebDriver driver ;
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\Zoro\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
    	driver =new FirefoxDriver() ;
    	
    	/*
    	// 1st sign up
    	driver.findElement(By.id("2")).click();
    	driver.findElement(By.id("E")).sendKeys("alifeqd@gmail.com");
    	driver.findElement(By.id("N")).sendKeys("ali");
    	driver.findElement(By.id("P")).sendKeys("12345");
    	driver.findElement(By.id("A")).sendKeys("23");
   
    	driver.findElement(By.id("t1")).click();
    	driver.findElement(By.id("s")).click();
    	*/
    	/*
    	// 2st sign up
    	driver.findElement(By.id("2")).click();
    	driver.findElement(By.id("E")).sendKeys("alqubati@gmail.com");
    	driver.findElement(By.id("N")).sendKeys("ali");
    	driver.findElement(By.id("P")).sendKeys("12345");
    	driver.findElement(By.id("A")).sendKeys("23");
   
    	driver.findElement(By.id("t1")).click();
    	driver.findElement(By.id("s")).click();
    	*/
    	
    	/*
    	 // 1st log in
    	driver.findElement(By.id("1")).click();
    	driver.findElement(By.id("e")).sendKeys("alqubati@gmail.com");
    	driver.findElement(By.id("p")).sendKeys("12345");
    	driver.findElement(By.id("l")).click();
    	
    	//driver.findElement(By.xpath("//input[@value='Go']")).click();
    	*/
    	/*
	   	 // 2st log in
	   	driver.findElement(By.id("1")).click();
	   	driver.findElement(By.id("e")).sendKeys("alqubati@gmail.com");
	   	driver.findElement(By.id("p")).sendKeys("54321");
	   	driver.findElement(By.id("l")).click();
	   	
	   	//driver.findElement(By.xpath("//input[@value='Go']")).click();
	   	*/
	    	/*
	   	 // 3th log in
	   	driver.findElement(By.id("1")).click();
	   	driver.findElement(By.id("e")).sendKeys("alqu@gmail.com");
	   	driver.findElement(By.id("p")).sendKeys("12345");
	   	driver.findElement(By.id("l")).click();
	   	
	   	//driver.findElement(By.xpath("//input[@value='Go']")).click();
	   	*/
    	
    	/*
    	 //view all games in a course
    	driver.get("http://localhost:8080/");
    	driver.findElement(By.id("1")).click();
    	driver.findElement(By.id("e")).sendKeys("alqubati@gmail.com");
    	driver.findElement(By.id("p")).sendKeys("12345");
    	driver.findElement(By.id("l")).click();   	
    	driver.findElement(By.id("1")).click();
    	*/
    	/*
	   	 //add course
	   	driver.get("http://localhost:8080/");
	   	driver.findElement(By.id("1")).click();
	   	driver.findElement(By.id("e")).sendKeys("alqubati@gmail.com");
	   	driver.findElement(By.id("p")).sendKeys("12345");
	   	driver.findElement(By.id("l")).click();    	
	   	driver.findElement(By.linkText("Add Course")).click();
	   	driver.findElement(By.id("CN")).sendKeys("math");
	   	driver.findElement(By.id("CA")).sendKeys("21");
	   	driver.findElement(By.id("TI")).sendKeys("5");
	   	driver.findElement(By.id("CD")).sendKeys("learn math");
	   	
	   	
   	*/
    	
    	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    //	WebDriverWait wait2 = new WebDriverWait(driver, 10);
    //	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("1")));
    	//driver.navigate().to("http://localhost:8080/showmycourse");
    	//driver.findElement(By.id("1")).click();
    	
    	
    }
    
}