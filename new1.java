package com.test1;

import java.sql.Driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.html5.AddApplicationCache;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;




public class new1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Mayuri\\Eclipse\\extra\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://app.powermatch.dk/login");
		
		//login
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("admin@powermatch.dk");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("Oksum4210.");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		System.out.println("*******************login successfull*************");

		
		/********************************************* Applicant *********************************/
	
		driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[12]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Ansøgere']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/section/div/div[1]/div/div[2]/form/div/a")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("applicant[name]")).sendKeys("Test User");
		Thread.sleep(3000);
		driver.findElement(By.name("applicant[email]")).sendKeys("mpemail1204@yopmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("applicant[phone]")).sendKeys("88552659");
		Thread.sleep(3000);
		driver.findElement(By.name("applicant[age]")).sendKeys("20");
		Thread.sleep(3000);
		driver.findElement(By.name("applicant[address]")).sendKeys("Bispeengen 15, Frederiksberg, Denmark");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"select2-applicantJobTitleSelect-container\"]")).click();
		
		driver.findElement(By.xpath("//span[text()='Blikkenslager']")).click();
		Thread.sleep(2000);
		driver.quit();
		}

	}