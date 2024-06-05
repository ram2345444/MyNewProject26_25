package testcases1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageobjects.Register;
import pom.register;

public class Tc_register1 extends baseclass {
	@Test
	public void Register() {
	register rp=new register(driver);
	
	rp.clickregister();
	rp.setname("ramya");
	rp.setloginname("ramyat");
	rp.setemail("ramyatirumani@gmail.com");
	rp.setmobile("6789455466");
	rp.setlandline("04044567890");
	rp.clicknext();
	rp.setpassword("ramya1253");
	rp.setconfirmpassword("ramya1253");
	rp.clicksubmit();
}

}

