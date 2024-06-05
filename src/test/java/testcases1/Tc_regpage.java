package testcases1;

import org.testng.annotations.Test;

import pom.Regpage;

public class Tc_regpage  extends Baseclass1 {
		@Test
		public void Regtest() {
			Regpage rp=new Regpage(driver);
			rp.clickregister();
			rp.setname("ramya");
			rp.setloginname("ramyat");
			rp.setemail("ramyatirumani@gmail.com");
			rp.setmobile("6789455466");
			rp.setlandline("04056677835");
			rp.clicknext();
			rp.setpassword("ramya1253");
			rp.setconfirmpassword("ramya1253");
			rp.clicksubmit();
		}

	}

