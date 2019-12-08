package com.my.demo;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
	    driver.get("http://www.doclever.cn/controller/index/index.html");
	    driver.findElement(By.linkText("登录")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='请输入用户名'])[1]/following::input[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='请输入用户名'])[1]/following::input[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='请输入用户名'])[1]/following::input[1]")).clear();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='请输入用户名'])[1]/following::input[1]")).sendKeys("roadtester");
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='请输入密码'])[1]/following::input[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='请输入密码'])[1]/following::input[1]")).clear();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='请输入密码'])[1]/following::input[1]")).sendKeys("123456");
	    driver.findElement(By.id("login")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	 
	  }
	

}
