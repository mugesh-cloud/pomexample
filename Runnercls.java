package runerpac;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import baspac.Basclas;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/luma.feature",glue = "stppac",publish = true,monochrome = true,dryRun =  false)
public class Runnercls extends Basclas{
	
	@BeforeClass
	
	public static void start() {
		Browserlaunch();
		Maximize();
	}
	
}