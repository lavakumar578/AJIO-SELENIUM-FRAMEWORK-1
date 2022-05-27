package com.ajio.dressTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioTopsAndTees {
	public static void main(String[] args) throws InterruptedException {
		
	ChromeOptions opt= new ChromeOptions();
    opt.addArguments("--disable-notifications");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.ajio.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@title='KIDS']")).click();	
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView", driver.findElement(By.xpath("//div[@class='LazyLoad is-visible']//img[@src='https://assets.ajio.com/cms/AJIO/WEB/13052022-D-KHP-shopbyproduct-tops&tees-starting199.jpg']")));
    driver.findElement(By.xpath("//div[@class='LazyLoad is-visible']//a[@href='/s/starting-at-rs-199-4691-77081']")).click();
    js.executeScript("arguments[0].scrollIntoView", driver.findElement(By.xpath("//div[.='MORE']")));
    //driver.findElement(By.xpath("//span[.='brands']")).click();
    
}
}