package applicationUtility;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {
	
	public void docubleClickUSingActions(WebElement ele);
	public void rightClickUSingActions(WebElement ele);
	public void clickUSingActions(WebElement ele);
	public void howerUsingActions(WebElement ele);
	public void switchToNewTab(int index);
	public void uploadFile(String path);
	public void selectByVisibletext(WebElement ele, String text);
	public void selectByIndexing(WebElement ele, int index);
	public void selectByValue(WebElement ele, String value);
	
	public List<WebElement> selectAlloptions(WebElement ele);

}
