package pageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.CommonFunctions;
import utilities.DriverInit;

public class PizzaHutPaymentTest {

	CommonFunctions cfs = new CommonFunctions();
	
	public  PizzaHutPaymentTest(WebDriver driver) {
		
		PageFactory.initElements( driver, this);
	}
	
	
	@FindBy(xpath = ("//input[@placeholder='Enter your location for delivery']"))
	WebElement enterLocation ;
	
	@FindBy(how = How.XPATH, using = "//button[@data-testid=\"close-offer-collection\"]")
	WebElement closebutton;
	
	@FindBy(xpath="//a[@class='button button--primary button--xl mb-20']") WebElement ViewAllDealsButton;  
	
	@FindBy(xpath = "(//button[@class='sc-AxheI bqJhFB'])[13]") WebElement kidsTreat;
	
	@FindBy(how = How.XPATH, using="//button[@data-synth=\"link--basket\"]") WebElement addDeal;
	
	@FindBy(xpath="//span[@class=\"bg-green-dark pl-5 pr-5 rounded\"]") WebElement itemsCount;
	
	@FindBy(how = How.XPATH, using="//button[@class='button button--primary  justify-between']")WebElement checkoutButton;
	
	@FindBy(xpath="//a[@data-synth='link--drinks--side']")WebElement drinks;
	
	@FindBy(xpath="(//button[@class='button button--md button--green flex-1 font-semibold'])[3]") WebElement mirinda;
	
	@FindBy(xpath="(//button[@class='button button--md button--green flex-1 font-semibold'])[3]") WebElement sevenup;

	@FindBy(how = How.XPATH, using="(//span[@class=\"absolute inset-0 flex-center\"])[2]")WebElement checkoutButton1;

	@FindBy(xpath="(//i[@class='mt-4'])[1]") WebElement onlinePayment;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/form/div[4]/div[2]/label[3]/i") WebElement cashPayment;
	
	@FindBy(xpath="/html/body/div[1]/div/div[1]/div/form/div[5]/label/span") WebElement checkboxChecked;
	
	@FindBy(id="checkout__name")WebElement enterName;
	
	@FindBy(id="checkout__phone")WebElement enterMobileNumber; 
	
	@FindBy(id="checkout__email")WebElement enterEmail;
	
	@FindBy(how = How.XPATH, using="//button[@class=\"w-full\"]")WebElement giftCard;
	
	 @FindBy(xpath=("//div[@class='sc-fznMnq gdZumo']")) WebElement voucher;
	
	 @FindBy(xpath=("//input[@name=\"voucherId\"]")) WebElement voucherInput;
	 
	 @FindBy(how = How.XPATH, using="//button[@class='sc-AxheI fhPHUH']")WebElement redeemButton;
	 
	 @FindBy(xpath=("//div[@class=\"sc-fznJRM ciBEcK\"] ")) WebElement errorMessage;
	
	 @FindBy(xpath=("//button[@class='icon-remove-3 absolute top-0 right-0 mr-20 mt-20'] ")) WebElement closeVoucher;
	 
	 
	public void enterDeliverAddress() throws InterruptedException {
		
			cfs.scrollWebPage();
		    enterLocation.sendKeys("lulu mall bangalore");
		    Thread.sleep(5000);
		    enterLocation.sendKeys(Keys.BACK_SPACE);
		    enterLocation.sendKeys("e");
		    Thread.sleep(5000);
		    enterLocation.sendKeys(Keys.ENTER);
		    Thread.sleep(5000);
	}

	public void closeButton() {
	
		closebutton.click();
	
	}
	
	public void viewDealsButton() {
		ViewAllDealsButton.click();
	}
	
	public void enterDeliverLocation() throws InterruptedException {
		
		    enterLocation.sendKeys(Keys.CLEAR);
		    enterLocation.clear();
		    enterLocation.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		    enterLocation.sendKeys(Keys.DELETE);
		    enterLocation.sendKeys("Kadapa Railway Station");
		    enterLocation.sendKeys(Keys.BACK_SPACE);
		    enterLocation.sendKeys(Keys.BACK_SPACE);
		    Thread.sleep(5000);
		    enterLocation.sendKeys("on");
		    Thread.sleep(5000);
		    enterLocation.sendKeys(Keys.ENTER);
		  
	}
	
	public void urlDealstest() throws InterruptedException {
		
		Thread.sleep(6000);// Location load taking time thats why i used thread.sleep instead wait.
		String currentUrl = DriverInit.getDriver().getCurrentUrl();
		System.out.println("current url is: "+currentUrl);
		String expUrl = "deals";
		System.out.println(currentUrl);
		Assert.assertTrue(currentUrl.contains(expUrl), "currentUrl does not contain deals");
		System.out.println(currentUrl);
		
	}
	
	public void clickKidsTreatDeal149() {
		kidsTreat.click();
	}
	public void addDealToBasket() {
		addDeal.click();
	}
	
	public void itemsOnCheckoutButton() {
		String items = itemsCount.getText();
		int totalItems = Integer.parseInt(itemsCount.getText().replaceAll("[^\\d.]", ""));
		System.out.println(items);
		System.out.println(totalItems);
				 
	}
	public void checkoutButtonNotShowingPrice() {
		String buttonText = checkoutButton.getText();
	    String regex = ".*[0-9].*"; // match any number from 0-9
	    Assert.assertFalse(buttonText.matches(regex), "Checkout button is showing a price: " + buttonText);
	}
	public void clickOnDrinks() {
		drinks.click();
	}
	
	public void addDrinks() {
		mirinda.click();
		sevenup.click();
	}
	public void chekoutOption() {
		checkoutButton1.click();
	}
	public void onlinePaymentRadioButton() {
		cfs.scrollWebPage2();
		onlinePayment.isSelected();
	}
	public void clickOnCash() {
		cfs.scrollWebPage3();
		cashPayment.click();
	}
	
	public void checkbokChecking() {
		checkboxChecked.isSelected();
	}
	
	public void enterNameNumberEmail() {
		cfs.scrollWebPage();
		enterName.sendKeys("Vigneswara Deva");
		enterMobileNumber.sendKeys("9876543210");
		enterEmail.sendKeys("om@universe.world");
	}
	
	public void clickonApplyGiftCard() {
		cfs.scrollWebPage3();
		giftCard.click();
	}
	public void clickVoucher() {
		voucher.click();
	}
	
	public void enterVoucherCode() {
		
		voucherInput.sendKeys("12345");
	}
	
	public void clickRedeem() {
		redeemButton.click();
	}
	
	public void errorValidation() {
		errorMessage.isDisplayed();
		String Error_Message= errorMessage.getText();
		System.out.println(Error_Message);
	}
	
	public void closeVoucherPopUp() {
		 closeVoucher.click();
	}
}