package com.realpage.ui.flexSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.realpage.flex.ChatTest.ChatTestCucumberTest;
import com.realpage.flex.FlexAdminLogin.FlexAdminLoginCucumberTest;
import com.realpage.flex.FlexAgentsPage.FlexAgentsPageCucumberTest;
import com.realpage.flex.FlexMyProfilePage.FlexMyProfilePageCucumberTest;
import com.realpage.flex.FlexPammChat.FlexPammChatCucumberTest;


@RunWith(value = Suite.class)
@SuiteClasses(value = {
		
		ChatTestCucumberTest.class,
		FlexAdminLoginCucumberTest.class,
		FlexAgentsPageCucumberTest.class,
		FlexMyProfilePageCucumberTest.class,
		FlexPammChatCucumberTest.class
		

})



public class FlexSuite {
	
	
	  

}
