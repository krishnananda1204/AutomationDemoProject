package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_class implements IRetryAnalyzer{ //reexecute the fail testcases(eg: network issue)

	int counter = 0;
	int retryLimit = 2;
	
	public boolean retry(ITestResult result) {

		if(counter < retryLimit)
		{
			counter++;
			return true;
		}
		return false;
	}
}
