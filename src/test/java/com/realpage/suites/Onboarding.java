package com.realpage.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.realpage.ui.Onboarding.OnboardingCucumberTest;

@RunWith(value = Suite.class)
@SuiteClasses(value = { OnboardingCucumberTest.class})


public class Onboarding {

}
