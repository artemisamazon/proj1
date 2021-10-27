package com.revature.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Artemis/Documents/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080");
		
		//Addition
		
		// Locate the 2 input elements and button for adding numbers
		WebElement addInput1 = driver.findElement(By.id("add1"));
		WebElement addInput2 = driver.findElement(By.id("add2"));
		WebElement addButton = driver.findElement(By.id("addButton"));
	
				
		addInput1.sendKeys("10.5");
		addInput2.sendKeys("15.3");
		addButton.click();
		driver.switchTo().frame("addResult"); // Switch into the inside of the iframe
		
		WebElement addOutput = driver.findElement(By.tagName("pre")); // find the pre tag that the addition result is embedded into inside of the iframe
		System.out.println("The result of adding 10.5 and 15.3 is " + addOutput.getText()); // print out the text of the output element
		

		driver.switchTo().defaultContent(); // Switch back outside of the iframe
		
		
		// subtract element
				WebElement subInput1 = driver.findElement(By.id("sub1"));
				WebElement subInput2 = driver.findElement(By.id("sub2"));
				WebElement subButton = driver.findElement(By.id("subButton"));
			
						
				subInput1.sendKeys("10.5");
				subInput2.sendKeys("15.3");
				subButton.click();
				driver.switchTo().frame("subResult"); // Switch into the inside of the iframe
				
				WebElement subOutput = driver.findElement(By.tagName("pre")); // find the pre tag that the addition result is embedded into inside of the iframe
				System.out.println("The result of subtracting 10.5 and 15.3 is " + subOutput.getText()); // print out the text of the output element
				

		driver.switchTo().defaultContent(); // Switch back outside of the iframe
				
		// multiplication element
				WebElement multiInput1 = driver.findElement(By.id("multi1"));
				WebElement multiInput2 = driver.findElement(By.id("multi2"));
				WebElement multiButton = driver.findElement(By.id("multiButton"));
			
						
				multiInput1.sendKeys("10.5");
				multiInput2.sendKeys("15.3");
				multiButton.click();
				driver.switchTo().frame("multiResult"); // Switch into the inside of the iframe
				
				WebElement multiOutput = driver.findElement(By.tagName("pre")); // find the pre tag that the addition result is embedded into inside of the iframe
				System.out.println("The result of multiplying 10.5 and 15.3 is " + multiOutput.getText()); // print out the text of the output element
				

		driver.switchTo().defaultContent(); // Switch back outside of the iframe
		
		//Division
		
				// Locate the 2 input elements and button for adding numbers
				WebElement divInput1 = driver.findElement(By.id("div1"));
				WebElement divInput2 = driver.findElement(By.id("div2"));
				WebElement divButton = driver.findElement(By.id("divButton"));
			
						
				divInput1.sendKeys("10.5");
				divInput2.sendKeys("15.3");
				divButton.click();
				driver.switchTo().frame("divResult"); // Switch into the inside of the iframe
				
				WebElement divOutput = driver.findElement(By.tagName("pre")); // find the pre tag that the addition result is embedded into inside of the iframe
				System.out.println("The result of dividing 10.5 and 15.3 is " + divOutput.getText()); // print out the text of the output element
				

				driver.switchTo().defaultContent(); // Switch back outside of the iframe
				
	
	
		//to pause 
		Thread.sleep(10000);
		//quit method
		// whenever we are done with the scripted tasks we will provide to Selenium 
		// WebDriver. You should quit the driver.
				
driver.quit(); 

	}

}