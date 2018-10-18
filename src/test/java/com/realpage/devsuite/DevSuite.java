package com.realpage.devsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.realpage.ui.ChatTestDev.ChatTestDevCucumberTest;
import com.realpage.ui.Login.LoginRegTestCucumberTest;
import com.realpage.ui.MainWidgetCheck.MainWidgetCheckDevCucumberTest;
import com.realpage.ui.Onboarding.OnboardingCucumberTest;
import com.realpage.ui.Onboarding.OnboardingDevCucumberTest;
import com.realpage.ui.ProductsSettings.ProductsSettingsCucumberTest;
import com.realpage.ui.Properties.PropertiesCucumberTest;
import com.realpage.ui.Properties.PropertiesOverviewDevCucumberTest;
import com.realpage.ui.Properties.PropertiesProductsCucumberTest;
import com.realpage.ui.Properties.PropertiesSettingsAddWidgetsCucumberTest;
import com.realpage.ui.Properties.PropertiesSettingsCucumberTest;
import com.realpage.ui.Properties.PropertiesSettingsEditWidgetsCucumberTest;
import com.realpage.ui.Properties.PropertiesTransferDevCucumberTest;
import com.realpage.ui.RollnRights.RollnRightsCucumberTest;
import com.realpage.ui.SMS.SMSCucumberTest;
import com.realpage.ui.Templates.TemplatesCucumberTest;
import com.realpage.ui.TextTestDev.TextTestDevCucumberTest;
import com.realpage.ui.WidgetCheck.WidgetCheckDevCucumberTest;

@RunWith(value = Suite.class)
@SuiteClasses(value = {  ChatTestDevCucumberTest.class,
		                 OnboardingDevCucumberTest.class,
		                 PropertiesCucumberTest.class,
		                 PropertiesOverviewDevCucumberTest.class,
		                 PropertiesProductsCucumberTest.class,
		                 PropertiesSettingsCucumberTest.class,
		                 PropertiesSettingsAddWidgetsCucumberTest.class,
		                 PropertiesSettingsEditWidgetsCucumberTest.class,
		                 PropertiesTransferDevCucumberTest.class,
		                 TextTestDevCucumberTest.class,
		                 WidgetCheckDevCucumberTest.class,
		                 TemplatesCucumberTest.class,
		                 SMSCucumberTest.class,
		                 RollnRightsCucumberTest.class,
		                 ProductsSettingsCucumberTest.class,
		                 MainWidgetCheckDevCucumberTest.class,
		                 LoginRegTestCucumberTest.class})


public class DevSuite {

}
