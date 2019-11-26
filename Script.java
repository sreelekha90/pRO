package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class Script {
	@Test
	
	public void Script1()
	{
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.close();
				

}
}
