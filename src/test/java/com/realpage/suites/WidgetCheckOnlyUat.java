package com.realpage.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.realpage.ui.WidgetCheckOnlyUat.WidgetCheckOnlyUatCucumberTest;

@RunWith(value = Suite.class)
@SuiteClasses(value = { WidgetCheckOnlyUatCucumberTest.class})


public class WidgetCheckOnlyUat {

}
