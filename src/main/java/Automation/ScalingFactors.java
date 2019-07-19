package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScalingFactors {
	WebDriver driver;

	public ScalingFactors(WebDriver driver) {
		this.driver = driver;
	}

	By Inevntorybtn = By.xpath("//div[@class='import-inventory-button-container']/button[2]");
	By Browserbtn = By.xpath("//div[@class='col-sm-3']/button");
	By Importbtn = By.xpath("//div[@class='modal-footer']/div/button[1]");

	public WebElement Inevntorybtn() {
		return driver.findElement(Inevntorybtn);
	}
	public WebElement Browserbtn() {
		return driver.findElement(Browserbtn);
	}
	public WebElement Importbtn() {
		return driver.findElement(Importbtn);
	}


}
