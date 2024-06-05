package pom;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public  class register {
		WebDriver driver;//global variable
		Select sc;
		public register(WebDriver driver) 
		{
			
					this.driver=driver;
					PageFactory.initElements(driver, this);
					
				}
		@FindBy(xpath="//a[@id='register-link']")
		WebElement register;
		@FindBy(id="id_1")
		WebElement Name;
		@FindBy(id="id_2")
		WebElement Loginname;
		@FindBy(id="id_3")
		WebElement Email;
		@FindBy(id="id_4")
		WebElement Mobile;
		@FindBy(id="id_5")
		WebElement Landline;
		
		@FindBy(xpath="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")
		WebElement Nextbutton;
		@FindBy(id="id_7")
		WebElement Password;
		@FindBy(id="id_8")
		WebElement Confirmpassword;
		@FindBy(xpath="//span[text()='Submit']")
		WebElement Submitbutton;

		
		public void clickregister() {
			  register.click();
		}
		  public void  setname(String fname) {
			  Name.sendKeys(fname);
		  }
		public void setloginname(String lname) {
			Loginname.sendKeys(lname);
		}
		public void setemail(String email) {
			Email.sendKeys(email);
		}
		public void setmobile(String mobile) {
			Mobile.sendKeys(mobile);
		}
		public void setlandline(String mobile2) {
			Landline.sendKeys(mobile2);
		}
		public void clicknext() {
			Nextbutton.click();
		}
		public void setpassword(String pwrd) {
			Password.sendKeys(pwrd);
		}
		public void setconfirmpassword(String cnpwrd) {
			Confirmpassword.sendKeys(cnpwrd);
		}
		public void clicksubmit() {
			Submitbutton.click();
		}	
		
	}
