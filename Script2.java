package com.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Script2 {
@Test
	public void script2() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.close();
	}

}
