package utils;

import org.junit.Before;

public class BaseComLoginTesteSelenium extends BaseTesteSelenium {

	@Override
	@Before
	public void setUp() throws Exception {
		super.setUp();
		UtilSeleniumTestes.login(driver);
	}

}
