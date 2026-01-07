package baseLirary;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import applicationUtility.ApplicationUtility;
import waitUtility.WaitUtility;


public class BaseLibraryPages implements ApplicationUtility,WaitUtility{
	public static WebDriver driver = null;
	public void launchUrl()
	{
		
		driver = new ChromeDriver();
		driver.get("https://testingbaba.com/old");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	}
	@Override
	public void docubleClickUSingActions(WebElement ele) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rightClickUSingActions(WebElement ele) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void clickUSingActions(WebElement ele) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void howerUsingActions(WebElement ele) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void switchToNewTab(int index) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void uploadFile(String path) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void selectByVisibletext(WebElement ele, String text) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void selectByIndexing(WebElement ele, int index) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void selectByValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<WebElement> selectAlloptions(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}
	// Wait Class **************************************************************************
		@Override
		public void waitforclick(WebElement ele) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			wait.until(ExpectedConditions.elementToBeClickable(ele));
			
		}
		@Override
		public void waitforsendkeys(WebElement ele) {
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			wait.until(ExpectedConditions.visibilityOf(ele));

		}
		@Override
		public void waitforAleart() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			wait.until(ExpectedConditions.alertIsPresent());
			
		}
		
	
	

}
