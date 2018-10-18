package com.realpage.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.realpage.ui.WidgetCheck.WidgetCheckCucumberTest;

@RunWith(value = Suite.class)
@SuiteClasses(value = { WidgetCheckCucumberTest.class})


public class WidgetCheckUat {

}
