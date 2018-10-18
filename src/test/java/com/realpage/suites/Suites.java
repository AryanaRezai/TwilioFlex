package com.realpage.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.realpage.ui.ChatTest.ChatTestCucumberTest;
import com.realpage.ui.Login.LoginRegTestCucumberTest;
import com.realpage.ui.MainWidgetCheck.MainWidgetCheckCucumberTest;
import com.realpage.ui.Onboarding.OnboardingCucumberTest;
import com.realpage.ui.ProductsSettings.ProductsSettingsCucumberTest;
import com.realpage.ui.Properties.PropertiesCucumberTest;
import com.realpage.ui.Properties.PropertiesOverviewCucumberTest;
import com.realpage.ui.Properties.PropertiesProductsCucumberTest;
import com.realpage.ui.Properties.PropertiesSettingsAddWidgetsCucumberTest;
import com.realpage.ui.Properties.PropertiesSettingsEditWidgetsCucumberTest;
import com.realpage.ui.RollnRights.RollnRightsCucumberTest;
import com.realpage.ui.SMS.SMSCucumberTest;
import com.realpage.ui.Templates.TemplatesCucumberTest;
import com.realpage.ui.TextTest.TextTestCucumberTest;
import com.realpage.ui.WidgetCheckOnlyUat.WidgetCheckOnlyUatCucumberTest;
import com.realpage.ui.WidgetCheckProd.WidgetCheckProdCucumberTest;
import com.realpage.ui.WidgetSearch.WidgetSearchCucumberTest;

@RunWith(value = Suite.class)
@SuiteClasses(value = { PropertiesCucumberTest.class, 
		                PropertiesOverviewCucumberTest.class, 
		                PropertiesProductsCucumberTest.class, 
		                RollnRightsCucumberTest.class, 
		                WidgetCheckOnlyUatCucumberTest.class, 
		                TemplatesCucumberTest.class,
		                PropertiesSettingsAddWidgetsCucumberTest.class, 
		                PropertiesSettingsEditWidgetsCucumberTest.class, 
		                MainWidgetCheckCucumberTest.class, 
		                WidgetSearchCucumberTest.class, 
		                OnboardingCucumberTest.class,
		                TextTestCucumberTest.class,
		                ChatTestCucumberTest.class,
		                SMSCucumberTest.class,
		                ProductsSettingsCucumberTest.class,
		                LoginRegTestCucumberTest.class,
		                })


public class Suites {

}
