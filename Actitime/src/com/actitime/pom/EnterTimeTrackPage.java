package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(id="container_tasks")
	private WebElement taskBtn;
    
	@FindBy(id="logoutLink")
    private WebElement logoutBtn;

public EnterTimeTrackPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void settask()
{
	taskBtn.click();
}
public void setlogout() {
	logoutBtn.click();
}
}
