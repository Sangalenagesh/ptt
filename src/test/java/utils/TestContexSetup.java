package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;


public class TestContexSetup {

	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestBase testbase;
	public GenericUtils genericutils;
	
	public  TestContexSetup() throws IOException {
		
		testbase=new TestBase();
		pageObjectManager=new PageObjectManager(testbase.WebDriverManager());
		genericutils=new GenericUtils(testbase.WebDriverManager());
	}


	}
