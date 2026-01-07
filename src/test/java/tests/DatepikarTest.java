package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLirary.BaseLibraryPages;
import pages.DatepicarPage;



public class DatepikarTest extends BaseLibraryPages{
	

	DatepicarPage ob;
	@BeforeTest()
	public void launchURL()
	{
		launchUrl();
		ob = new DatepicarPage();
	}
	
	@Test(priority=1)
	public void clickonclose()
	{
		
		ob.clickonClose();
	}
	
	@Test(priority=2)
	public void clickOnpractic()
	{
		ob.clickOnPractic();
		ob.clickOnwidgets();
		ob.clickOnDatepicker();
		ob.selectTodayDate();
		
	}
	@Test(priority=3)
	public void selectToday()
	{
		
		 WebElement dateInput = ob.selectTodayDate();
		 Assert.assertEquals(
		            dateInput.getAttribute("value"),
		            "2025-12-31"
		        );
		
	}

}
