package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EstimateTabs {
	WebDriver driver;

	By InevntoryTab = By.xpath("//div[@class='estimate-tab-container']/ul/li[2]");

	public EstimateTabs(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement InevntoryTab() {
		return driver.findElement(InevntoryTab);
	}

}
