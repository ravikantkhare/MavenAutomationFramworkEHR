package pages;

import java.time.LocalDate;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLirary.BaseLibraryPages;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatepicarPage extends BaseLibraryPages{
	
	public DatepicarPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//a[@href='newdemo.html']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-toggle='collapse' and@data-target='#alerts']")
	private WebElement aleartwindowframe;
	
	@FindBy(xpath = "//button[@data-target='#widget']")
	private WebElement widgets;
	
	@FindBy(xpath = "//a[@href='#tab_18']")
	private WebElement datepicker;
	
	@FindBy(xpath = "//input[@type='date']")
	private WebElement clickOndatepikar;
	
	
	
	public void clickonClose()
	{
		waitforclick(close);
		close.click();
	}
	public void clickOnPractic()
	{
		waitforclick(practice);
		practice.click();
	}
	
	
	public void clickOnwidgets()
	{
		waitforclick(widgets);
		widgets.click();
	}
	
	public void clickOnDatepicker()
	{
		waitforclick(datepicker);
		datepicker.click();
	}
	public WebElement selectTodayDate() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(
		    "arguments[0].value='2025-12-31';"+
		    "arguments[0].dispatchEvent(new Event('input'));" +
		    "arguments[0].dispatchEvent(new Event('change'));",
			clickOndatepikar);
		String value = clickOndatepikar.getAttribute("value");
		System.out.println("DATE VALUE = " + value);
		return clickOndatepikar;

	}

}
