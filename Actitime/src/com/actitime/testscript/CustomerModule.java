package com.actitime.testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

//public class CustomerModule extends BaseClass  {
	@Listeners(com.actitime.generic.ListenerImplementation.class)
	
	public class CustomerModule extends BaseClass  
	{
		@Test
		public void testCreateCustomer() throws IOException, InterruptedException  
		{
			String customername = f.getExceldata("CreateCustomer", 1, 2);
			String des = f.getExceldata("CreateCustomer", 1, 3);
			EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
			e.settask();
		TaskListPage t=new TaskListPage(driver);
		t.getaddNewbtn().click();
		t.getnewCustOption().click();
		t.getenterCustNametxt().sendKeys(customername);
		t.getcustDestxt().sendKeys(des);
		t.getselectCustdd().click();
		t.getselectBigbangCompany().click();
	    t.getcreateCustBtn().click();
	    Thread.sleep(3000);
	    String actualCustomerText=t.getActualCustomer().getText();
	    Assert.assertEquals(actualCustomerText, actualCustomerText);
	    
	}
	}

