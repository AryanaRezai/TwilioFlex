package com.realpage.devsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.realpage.ui.TextTestDev.TextTestDevCucumberTest;

@RunWith(value = Suite.class)
@SuiteClasses(value = { TextTestDevCucumberTest.class})


public class TextTestDev {

}
