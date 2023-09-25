package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
    @FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewbtn;
	
	@FindBy(xpath="//div[contains(text(),'+ New Customer')]")
	private WebElement newCustOption;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustNametxt;
	
	@FindBy(xpath="//textarea[@class='textarea' and @placeholder='Enter Customer Description']")
	private WebElement custDestxt;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustdd;
	
	@FindBy(xpath="//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement selectBigbangCompany;
	
		@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
		
		@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
		private WebElement actualCustomer;
public TaskListPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}


public WebElement getaddNewbtn() {
	return addNewbtn;
}


public WebElement getnewCustOption() {
	return newCustOption;
}


public WebElement getenterCustNametxt() {
	return enterCustNametxt;
}


public WebElement getcustDestxt() {
	return custDestxt;
}


public WebElement getselectCustdd() {
	return selectCustdd;
}


public WebElement getselectBigbangCompany() {
	return selectBigbangCompany;
}
public WebElement getcreateCustBtn() {
	return createCustBtn;
}
public WebElement getActualCustomer() {
	return actualCustomer;
}
}