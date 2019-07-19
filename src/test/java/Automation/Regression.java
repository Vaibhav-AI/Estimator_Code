package Automation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Regression extends InvokeBrowser {
	WebDriver driver;

	@Test
	public void AVS() throws IOException, InterruptedException {

		// Borwser invoke
		driver = InvokeBrowser();

		// Login Code
		Login l = new Login(driver);
		l.Username().sendKeys("A04087DIRNTESTING");
		l.Password().sendKeys("4R+k-tY37E=d?jC0K9n*");
		l.SignIn().click();

		// Estimate Creation
		EstimateDashboard E = new EstimateDashboard(driver);
		E.EstimateCreateButton().click();
		Thread.sleep(5000);
		E.EstimateName().sendKeys("E532e5");
		E.clientName().sendKeys("C2");
		E.OppID().sendKeys("101");
		E.SolID().sendKeys("101");
		E.RefName().sendKeys("1");
		E.BaseModel().click();
		E.AVS().click();
		E.CreateButton().click();

		// Estimate Details
		EstimateElements em = new EstimateElements(driver);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(em.Savebtn));
		em.Savebtn().click();
		em.IndustryName().click();
		em.IndustryOpt().click();
		em.StageName().click();
		em.StageOpt().click();
		em.DealName().click();
		em.DealOpt().click();
		em.Savebtn().click();

		// Module Selection
		ModuleTab m = new ModuleTab(driver);		
		wait.until(ExpectedConditions.elementToBeClickable(m.Module1));
		m.Module1().click();
		m.Module2().click();
		m.Module3().click();
		m.Module4().click();
		m.Module5().click();

		// Click on Save Button
		em.Esavebtn().click();

		// Inventory tab
		EstimateTabs it = new EstimateTabs(driver);
		it.InevntoryTab().click();

		ScalingFactors sf = new ScalingFactors(driver);
		sf.Inevntorybtn().click();
		sf.Browserbtn().click();
		Thread.sleep(5000);
		Runtime.getRuntime()
				.exec("C:\\Users\\vaibhav.vijay.hatge\\Desktop\\Testing\\Estimator\\Files\\InventoryUpload.exe");
		sf.Importbtn().click();

	}

}
