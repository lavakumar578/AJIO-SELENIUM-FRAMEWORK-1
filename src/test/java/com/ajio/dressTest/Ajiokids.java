package com.ajio.dressTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajiokids {

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
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//img[@src='https://assets.ajio.com/cms/AJIO/WEB/15042022-D-KHP-shopbyproduct-header.jpg']")));
		driver.findElement(By.xpath("//a[@href='/s/starting-at-rs-199-4663-75761']")).click();
		WebElement ele = driver.findElement(By.xpath("//select"));
		Select s=new Select(ele);
		s.selectByValue("prce-desc");
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Infants - Tees, Tops & Shirts']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='brands']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-brand facet-linkname-3pin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-brand facet-linkname-612 League']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-brand facet-linkname-AARIKA GIRLS ETHNIC']")).click();
		String firstclothBrand = driver.findElement(By.xpath("//div[.='Shirt with Printed Vest']/..//div[@class='brand']")).getText();
		System.out.println(firstclothBrand);
		String firstclothName = driver.findElement(By.xpath("//div[.='Shirt with Printed Vest']")).getText();
		System.out.println(firstclothName);
		String firstclothprice = driver.findElement(By.xpath("//div[.='Shirt with Printed Vest']/..//span[@class='price  ']")).getText();
		System.out.println(firstclothprice);
		String secondclothBrand=driver.findElement(By.xpath("//div[.='Typographic Printed Crew-Neck T-shirt']/..//div[@class='brand']")).getText();
		System.out.println(secondclothBrand);
		String secondclothName = driver.findElement(By.xpath("//div[.='Typographic Printed Crew-Neck T-shirt']")).getText();
		System.out.println(secondclothName);
		String secondclothprice = driver.findElement(By.xpath("//div[.='Typographic Printed Crew-Neck T-shirt']/..//span[@class='price  ']")).getText();
		System.out.println(secondclothprice);
		String thirdclothBrand = driver.findElement(By.xpath("//div[.='Slim Fit Cotton Shirt with Patch Pocket']/..//div[@class='brand']")).getText();
		System.out.println(thirdclothBrand);
		String thirdclothName = driver.findElement(By.xpath("//div[.='Slim Fit Cotton Shirt with Patch Pocket']")).getText();
		System.out.println(thirdclothName);
		String thirdclothprice = driver.findElement(By.xpath("//div[.='Slim Fit Cotton Shirt with Patch Pocket']/..//span[@class='price  ']")).getText();
		System.out.println(thirdclothprice);
        
		driver.findElement(By.xpath("//img[@src='https://assets.ajio.com/medias/sys_master/root/h68/h43/12259017293854/612_league_white_%26_maroon_shirt_with_printed_vest.jpg']")).click();
		Thread.sleep(1000);
		Set<String> windows = driver.getWindowHandles();
		for(String win:windows)
		{
			driver.switchTo().window(win);
		}
		//driver.findElement(By.xpath("//div[@class='slick-slide slick-active size-swatch']//div[@class='oval size-variant-item size-instock ']//span[.='4-5Y']")).click();
	    //driver.findElement(By.xpath("//div[@class='  prod-content']//span[.='4-5Y']"));
	    driver.findElement(By.xpath("//div[@class='oval size-variant-item size-instock selected']")).click();
	}
}
