package com.runner;


import io.cucumber.junit.CucumberOptions;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucu.sample_Project.Base;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\JAVA\\sample_Project\\src\\test\\java\\com\\Feature\\LimeRoad.feature"
, glue = {"com.step"}
//,strict = true
//,dryRun=false
,tags= "@tag1"
,plugin={"pretty","json:target/limeroad.json","html:target/limeroad.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)


	

public class TestRunner extends Base {
	
	@BeforeClass
	public static void browserLaunch() {
		launchBrowser("chrome");
	}

}
