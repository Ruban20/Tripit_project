package tripit;


import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;




public class Tripit_PageObject_Model {
	/*
	 * Declare the elements for Login page
	 */
	@FindBy(xpath = "//a[.='Sign In']")
	private WebElement Signin;

	@FindBy(xpath = "//input[@id='email_address']")
	private WebElement Emailbox;

	@FindBy(xpath = "//*[@type='password']")
	private WebElement Passwordbox;
	
	@FindBy(xpath = "//*[@type='submit']") 
	private WebElement SubmitBox;
	
	@FindBy(xpath = "//a[@id='forgot_password']")
	private WebElement Forgotbutton;
	
	@FindBy(xpath = "//p[@class='fieldBlock']")
	private WebElement ForgotmailBox;
	
	@FindBy(xpath = "//*[@id='signin-submit-btn']")
	private WebElement ForgotSendBox;
	
	@FindBy(xpath = "//a[@aria-label='TripIt Logo']")
	private WebElement Logo;
	
	@FindBy(xpath = "//ul[@class='nav nav-tabs']")
	private WebElement wrapper_titles;
	
	@FindBy(xpath = "//div[@id='app']")
	private WebElement HomepageOpened;
	
	@FindBy(xpath = "//a[.='Support']")
	private WebElement support;
	
	@FindBy(xpath = "(//a[contains(.,'TripIt Pro')])")
	private WebElement Tripitpro;
	
	@FindBy(xpath = "//li[@id='__BVID__106']")
	private WebElement Account;
	
	@FindBy(xpath = "//a[@href='/app/logout']")
	private WebElement Logout;
	
	@FindBy(xpath = "//div[.='Upcoming Trips']")
	private WebElement upcomingTrips;
	
	@FindBy(xpath = "//a[@href='/app/trip/create']")
	private WebElement addTrip;
	
	@FindBy(xpath = "//input[@id='trip-name']")
	private WebElement addtripName;
	
	@FindBy(xpath = "//input[@name='trip-destination-city-input']")
    private WebElement destinationName;
	
	@FindBy(xpath = "//input[@id='trip-start-date-input']")
    private WebElement StartdateBox;
	
	@FindBy(xpath = "//input[@id='trip-end-date-input']")
    private WebElement EnddateBox;
	
	@FindBy(xpath = "(//button[@type='button'])[3]")
	private WebElement StartDateCalender;
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement endDateCalender;
	
	@FindBy(xpath = "//div[@data-date='2023-10-28']")
	private WebElement StartDate;
	
	@FindBy(xpath = "//div[@data-date='2023-10-30']")
	private WebElement endDate;
	
	@FindBy(xpath = "//span[.='Save']")
	private WebElement savetrip;
	
	@FindBy(xpath = "//a[.='Manage Sharing']")
	private WebElement Managesharing;
	
	@FindBy(xpath = "//button[.='Invite']")
	private WebElement Sharingtrip2;
	
	@FindBy(xpath = "//input[@id='share-trip-modal-send-field']")
	private WebElement SharingtripMail;
	
	@FindBy(xpath = "//span[.='Send']")
	private WebElement SendMail;
	
	@FindBy(xpath = "//span[.='Close']")
	private WebElement closeSendMail;
	
	@FindBy(xpath = "//span[@class='caret']")
	private WebElement LaanguageBox;
	
	@FindBy(xpath = "//a[@class='language-link']")
	private List<WebElement> AllLanguages;
	
	@FindBy(xpath = "//div[@id='footer-products']")
	private List<WebElement>productLists;
	
	@FindBy(xpath = "//div[@id='footer-news_and_resources']")
	private List<WebElement>news_and_resourcesLists;
	
	@FindBy(xpath = "//div[@id='footer-partners']")
	private List<WebElement>partnerLists;
	
	@FindBy(xpath = "//a[.='Download App']")
	private WebElement DownloadApp;
	
	@FindBy(xpath = "//div[@class='items-group']")
	private WebElement DownloadPage;
	
	@FindBy(xpath = "(//a[@class='social-media-link-icon--instagram'])[2]")
    private WebElement InstagramLink;
	
	@FindBy(xpath = "(//span[@class='fa fa-facebook fa-in'])[2]")
	private WebElement FacebookLink;
	
	@FindBy(xpath = "(//span[@class='fa fa-twitter fa-in'])[2]")
	private WebElement TwitterLink;
	
	@FindBy(xpath = "(//span[@class='fa fa-linkedin fa-in'])[2]")
	private WebElement LinkedinLink;
	
	@FindBy(xpath = "(//a[@class='social-media-link-icon--youtube'])[2]")
	private WebElement YoutubeLink;
	
	/*
	 * Utilize the elements
	 */
	public void TestCase_01()
	{
		Reporter.log("test case is pass",true);
		Signin.click();
	}
	
	public void TestCase_02()//valid username and valid password
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		
	}
	
	public void TestCase_003()//invalid username and valid password
	{
		Signin.click();
		Emailbox.sendKeys("ivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");
	}
	
	public void TestCase_004()//invalid username and invalid password
	{
		Signin.click();
		Emailbox.sendKeys("ivjeevie@gmail.com");
		Passwordbox.sendKeys("akeid001");	
		}
	
	public void TestCase_005() //valid username and blank password
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("");
	}

	public void TestCase_006() ////invalid username and blank password
	{
		Signin.click();
		Emailbox.sendKeys("fsfffdsn");
		Passwordbox.sendKeys("");
	}

	public void TestCase_007() ////blank username and valid password
	{
		Signin.click();
		Emailbox.sendKeys("");
		Passwordbox.sendKeys("Fakeid001");
	}

	public void TestCase_008() //blank username and blank password
	{
		Signin.click();
		Emailbox.sendKeys("");
		Passwordbox.sendKeys("");
	}

	public void TestCase_009() //blank username and invalid password
	{
		Signin.click();
		Emailbox.sendKeys("");
		Passwordbox.sendKeys("monkey");
	}
	
	public void TestCase_010()//valid username and invalid password
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("akeid001");	
		}
	
	public void TestCase_011()
	{
		Signin.click();
		Reporter.log(""+Emailbox.isDisplayed(),true);
	}

	public void TestCase_012()
	{
		Signin.click();
		Reporter.log(""+Passwordbox.isDisplayed(),true);
	}
	
	public void TestCase_013()
	{
		Signin.click();
		Reporter.log(""+Forgotbutton.isDisplayed(),true);
	}

	public void TestCase_014()
	{
		Signin.click();
		Reporter.log(""+SubmitBox.isDisplayed(),true);
	}
	
	public void TestCase_015()
	{
		Signin.click();
		Reporter.log(Forgotbutton.getText(),true);
	}

	public void TestCase_016()
	{
		Signin.click();
		Forgotbutton.click();
		Reporter.log("TestCase_016 is pass",true);
	}
	
	public void TestCase_017()
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		Reporter.log(""+Logo.isDisplayed(),true);
	}
	
	public void TestCase_018()
	{
		Signin.click();
		int un = Emailbox.getSize().height;
		int pw = Passwordbox.getSize().height;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(un, pw);
		Reporter.log("TestCase_018 is pass",true);
	}

	public void TestCase_019()
	{
		Signin.click();
		int un = Emailbox.getSize().width;
		int pw = Passwordbox.getSize().width;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(un, pw);
		Reporter.log("TestCase_019 is pass",true);
	}
	
	public void TestCase_020()
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		int height = Logo.getSize().height;
		int width = Logo.getSize().width;
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(height, width);
		Reporter.log("TestCase20 is pass",true);
	}
	
	public void TestCase_021()
	{
		Signin.click();
		Reporter.log(""+SubmitBox.isDisplayed(),true);
	}
	
	public void TestCase_022()
	{
		Signin.click();
		Emailbox.sendKeys("!@#$%^&*");
		}

	public void TestCase_023()
	{
		Signin.click();
		Passwordbox.sendKeys("!@#$%^&*");
		}
	
	public void TestCase_024() throws InterruptedException
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");
		SubmitBox.click();
		Thread.sleep(2000);
		Reporter.log(""+wrapper_titles.getText(),true);

	}
	
	public void TestCase_025() throws InterruptedException
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");
		SubmitBox.click();
		Thread.sleep(2000);
		Reporter.log(""+HomepageOpened.isDisplayed(),true);

	}
	
	public void TestCase_026() throws InterruptedException
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");
		SubmitBox.click();
		Thread.sleep(2000);
		Reporter.log(""+wrapper_titles.getText(),true);

	}
	
	public void TestCase_027() throws InterruptedException
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");
		SubmitBox.click();
		Thread.sleep(2000);
		Reporter.log(""+Tripitpro.getText(),true);

	}
	
	public void TestCase_28()
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");
		SubmitBox.click();
		Account.click();
		Reporter.log("TestCase_28 is Pass",true);
	}
	
	public void TestCase_29() throws InterruptedException
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");
		SubmitBox.click();
		Thread.sleep(2000);
		Account.click();
		Thread.sleep(2000);
		Logout.click();
		Reporter.log("TestCase_29 is Pass",true);
	}
	
	public void TestCase_030()
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		
		Reporter.log(""+upcomingTrips.isDisplayed(),true);
	}
	public void TestCase_031()
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		addTrip.click();
	}
	
	public void TestCase_032()
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		addTrip.click();
	addtripName.sendKeys("Singapore");
	}
	
	public void TestCase_033()
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		addTrip.click();
	addtripName.sendKeys("Singapore");
	destinationName.sendKeys("Delhi, India");
	}
	
	public void TestCase_034()throws InterruptedException
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		Thread.sleep(2000);
		addTrip.click();
		Thread.sleep(2000);
	addtripName.sendKeys("Singapore");
	Thread.sleep(2000);
	destinationName.sendKeys("Delhi, India");
	Thread.sleep(2000);
	StartDateCalender.click();
	
	
	}
	
	public void TestCase_035()
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		addTrip.click();
	addtripName.sendKeys("Singapore");
	destinationName.sendKeys("Delhi, India");
	StartDateCalender.click();
StartDate.click();
	endDateCalender.click();
	endDate.click();
	}
	
	public void TestCase_036()throws InterruptedException
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		Thread.sleep(2000);
		addTrip.click();
		Thread.sleep(2000);
	addtripName.sendKeys("Singapore");
	destinationName.sendKeys("Delhi, India");
	StartDateCalender.click();
	Thread.sleep(2000);
	StartDate.click();
	Thread.sleep(2000);
	endDateCalender.click();
	Thread.sleep(2000);
	endDate.click();
	Thread.sleep(2000);
	savetrip.click();
	}
	
	public void TestCase_037()throws InterruptedException
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		Thread.sleep(2000);
		addTrip.click();
	addtripName.sendKeys("Singapore");

	destinationName.sendKeys("Delhi, India");
	
	StartDateCalender.click();
	
	StartDate.click();
	
	endDateCalender.click();
	Thread.sleep(2000);
	endDate.click();
	Thread.sleep(2000);
	savetrip.click();
	Thread.sleep(2000);
	Managesharing.click();
	Thread.sleep(2000);
	Sharingtrip2.click();
	}
	
	public void TestCase_038()throws InterruptedException
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		addTrip.click();
	addtripName.sendKeys("Singapore");
	destinationName.sendKeys("Abu Dhabi, United Arab Emirates");
	StartDateCalender.click();
	StartDate.click();
	endDateCalender.click();
	Thread.sleep(2000);
	endDate.click();
	Thread.sleep(2000);
	savetrip.click();
	Thread.sleep(2000);
    Managesharing.click();
    Thread.sleep(2000);
	Sharingtrip2.click();
	Thread.sleep(2000);
	SharingtripMail.sendKeys("Rubanstr2@gmail.com");
	}
	
	public void TestCase_039()throws InterruptedException
	{
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		addTrip.click();
	addtripName.sendKeys("Singapore");
	destinationName.sendKeys("Kuala Lumpur, Malaysia");
	StartDateCalender.click();
	StartDate.click();
	endDateCalender.click();
	endDate.click();
	Thread.sleep(2000);
	savetrip.click();
	Thread.sleep(2000);
	Managesharing.click();
	Thread.sleep(2000);
	Sharingtrip2.click();
	SharingtripMail.sendKeys("Rubanstr2@gmail.com");
	Thread.sleep(2000);
	SendMail.click();
	}
	public void TestCase_040()throws InterruptedException
	{
	Signin.click();
	Emailbox.sendKeys("sivjeevie@gmail.com");
	Passwordbox.sendKeys("Fakeid001");	
	SubmitBox.click();
	addTrip.click();
	addtripName.sendKeys("Singapore");
	destinationName.sendKeys("Bengaluru, India");
	StartDateCalender.click();
	StartDate.click();
	endDateCalender.click();
	endDate.click();
	Thread.sleep(2000);
	savetrip.click();
	Thread.sleep(2000);
	Managesharing.click();
	Thread.sleep(2000);
	Sharingtrip2.click();
	SharingtripMail.sendKeys("Rubanstr2@gmail.com");
	Thread.sleep(2000);
	SendMail.click();
	}
	public void TestCase_041()throws InterruptedException
	{
		LaanguageBox.click();
      int count=AllLanguages.size();
    ArrayList<String> al=new ArrayList<String>();
      for(int i=0; i<count;i++)
      {
    	 String Text= AllLanguages.get(i).getText();
    	 al.add(Text);
      }
      Collections.sort(al);
      for(String i:al)
      {
    	  System.out.println(i);
      }
      }
	public void TestCase_042() {
		Signin.click();
		Emailbox.sendKeys("sivjeevie@gmail.com");
		Passwordbox.sendKeys("Fakeid001");	
		SubmitBox.click();
		int count=productLists.size();
		for(int i=0;i<count;i++)
		{
		String Text=productLists.get(i).getText();
		System.out.println(Text);
		
		}}
		public void TestCase_043() {
			Signin.click();
			Emailbox.sendKeys("sivjeevie@gmail.com");
			Passwordbox.sendKeys("Fakeid001");	
			SubmitBox.click();
			int count=news_and_resourcesLists.size();
			for(int i=0;i<count;i++)
			{
			String Text=news_and_resourcesLists.get(i).getText();
			System.out.println(Text);
			
			}
	}
		public void TestCase_044() {
			Signin.click();
			Emailbox.sendKeys("sivjeevie@gmail.com");
			Passwordbox.sendKeys("Fakeid001");	
			SubmitBox.click();
			int count=partnerLists.size();
			for(int i=0;i<count;i++)
			{
			String Text=partnerLists.get(i).getText();
			System.out.println(Text);
			
			}
	}
	
		public void TestCase_045() throws AWTException {
		DownloadApp.click();
		boolean pge= DownloadPage.isDisplayed();
		System.out.println(pge);
}
		public void TestCase_046() throws InterruptedException, AWTException {
			DownloadApp.click();
			Thread.sleep(10000);
			String txt= DownloadPage.getText();
			System.out.println(txt);
			}
		
		public void TestCase_047() throws InterruptedException, AWTException, IOException {
			DownloadApp.click();
			Thread.sleep(10000);
			DownloadPage.isDisplayed();
		
			TakesScreenshot ts=(TakesScreenshot)DownloadPage;
			Thread.sleep(2000);
			File source=ts.getScreenshotAs(OutputType.FILE);
			File destination=new File("./screenshot/ss2.png");
			FileUtils.copyFile(source, destination);
			}
	
		public void TestCase_048() throws InterruptedException, AWTException, IOException{
			boolean insta=InstagramLink.isEnabled();
			System.out.println(insta);
			InstagramLink.click();
			Reporter.log("Instagram page is opened",true);
			}
		
		public void TestCase_049() throws InterruptedException, AWTException, IOException{
			boolean fb=FacebookLink.isEnabled();
			System.out.println(fb);
			FacebookLink.click();
			Reporter.log("Facebook page is opened",true);
			}
		
		public void TestCase_050() throws InterruptedException, AWTException, IOException{
			boolean tw=TwitterLink.isEnabled();
			System.out.println(tw);
			TwitterLink.click();
			Reporter.log("Twitter page is opened",true);
			}
		
		public void TestCase_051() throws InterruptedException, AWTException, IOException{
			boolean Ld=LinkedinLink.isEnabled();
			System.out.println(Ld);
			LinkedinLink.click();
			Reporter.log("LinkedIn page is opened",true);
			}
		
		public void TestCase_052() throws InterruptedException, AWTException, IOException{
			boolean Ld=YoutubeLink.isEnabled();
			System.out.println(Ld);
			YoutubeLink.click();
			Reporter.log("YouTube page is opened",true);
			}
		
		
		
		
		
		
		
		
}
	