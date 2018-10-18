package com.realpage.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.realpage.ui.WidgetCheckProd.WidgetCheckProdCucumberTest;

@RunWith(value = Suite.class)
@SuiteClasses(value = { WidgetCheckProdCucumberTest.class})


public class WidgetCheckProd {

}
