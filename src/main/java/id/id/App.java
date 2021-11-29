package id.id;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;



public class App 

{
	 static WebDriver driver;
	   
	    //before
	    public static void prepareDriver(){
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
	        System.out.println("setup");
	    }
	    //after
	    public static void quitDriver() throws InterruptedException {
	    	 Thread.sleep(1500);
	            driver.quit();
	            System.out.println("done");

	    }
	    
	    
    public static void main( String[] args ) throws InterruptedException
    
    {
    	prepareDriver();
    	

        driver.get("https://www.tunisianet.com.tn/");
        
        
        // Click on the user icon
        
        Thread.sleep(1500); // TODO: Find a better way to wait for an element to become clickable
        WebElement userInfoDropdown = driver.findElement(By.cssSelector("#_desktop_user_info > div > div > svg"));
        userInfoDropdown.click();
        
        // Click on the Connexion button
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".user-down span")).click();
        
        // Click to create an account
        Thread.sleep(1500);
        driver.findElement(By.linkText("Pas de compte ? Créez-en un")).click();
        
        // fulll the form 
        
        driver.findElement(By.cssSelector(".radio-inline:nth-child(2) input")).click();
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys("maissa");
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys("gallah");
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("maissaglh@gmail.com");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("maissa");
        driver.findElement(By.name("birthday")).click();
        driver.findElement(By.name("birthday")).sendKeys("04/12/1998");
        
        // Click to submit
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".form-control-submit")).click();
        driver.findElement(By.cssSelector(".nav-link > svg")).click();
        
        // Click on the logout button
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".nav-link > svg > use")).click();
        driver.findElement(By.cssSelector(".nav-link > svg")).click();
        driver.findElement(By.cssSelector(".nav-link > svg")).click();
        driver.findElement(By.linkText("Déconnexion")).click();
        
        
       // As usual, click on the user icon
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".nav-link > svg")).click();

        // Click on Connexion Button
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".user-down span")).click();
        
        // Fill the email field
        Thread.sleep(1500);
        driver.findElement(By.name("email")).sendKeys("maissaglh@gmail.com");
        
        // Fill the password field
        Thread.sleep(1500);
        driver.findElement(By.name("password")).sendKeys("maiisa");
        
        // Click on sign in
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".input-group-btn > .btn")).click();
        driver.findElement(By.id("submit-login")).click();
        
       
        
        
        // Search for the pc
        Thread.sleep(1500);
        driver.findElement(By.id("search_query_top")).click();
        driver.findElement(By.id("search_query_top")).sendKeys("PC portable MacBook M1 13.3");

        // Click to search
        Thread.sleep(1500);
        driver.findElement(By.name("submit_search")).click();

        // Click on the selected product
        Thread.sleep(1500);
        // first product
        driver.findElements(By.className("product-title")).get(0).click();

        // Add product to cart
        Thread.sleep(1500);
        driver.findElement(By.cssSelector(".add-to-cart")).click();
     
    
        // Click to command button

        
        driver.findElement(By.linkText("Commander")).click();
        driver.findElement(By.cssSelector(".btn-secondry")).click();
       
        quitDriver();
        
       
    }
}
