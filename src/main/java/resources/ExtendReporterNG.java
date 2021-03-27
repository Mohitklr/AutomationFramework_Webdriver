package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporterNG {
	static ExtentReports extent;
	
	public static ExtentReports getReportObject() {
		//ExtendSparkReporter , ExtendReports
				String Path=System.getProperty("user.dir")+"\\Reports\\E2E_ExtendsReport.html";
				//creating object of ExtendSparkReporter Class
				ExtentSparkReporter reporter =new ExtentSparkReporter(Path);
				reporter.config().setReportName("Automation Results");
				reporter.config().setDocumentTitle("Test Results");
				
				extent =new ExtentReports();
				extent.attachReporter(reporter);
				extent.setSystemInfo("Tester", "Mohit kalra");
				return extent;
	
	}

}
