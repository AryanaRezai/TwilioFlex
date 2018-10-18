package com.realpage.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.realpage.ui.Templates.TemplatesCucumberTest;

@RunWith(value = Suite.class)
@SuiteClasses(value = { TemplatesCucumberTest.class})


public class Templates {

}
