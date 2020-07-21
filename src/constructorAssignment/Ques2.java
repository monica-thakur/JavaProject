package constructorAssignment;

import java.util.ArrayList;

public class Ques2 {
	// Ques2: Design a browser class template with the following features:
//		 variables:
//		browserName
//		vendorName
//		currentVersion
//		List of plugins supported by Browser in Array List<String>
//
//		--Design the constructor of this class with different parameters and all parameters.
//
//		 --Write the get method of each variable with return keyword. 

	String browserName;
	String vendorName;
	double currentVersion;
	ArrayList<String> pluginList;

	public String getbrowserName() {
		return browserName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public double getCurrentVersion() {
		return currentVersion;
	}

	public ArrayList<String> getPluginList() {
		return pluginList;
	}

	public Ques2(String browserName, String vendorName, double currentVersion, ArrayList<String> pluginList) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.pluginList = pluginList;
	}

	public Ques2(String browserName, String vendorName, double currentVersion) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
	}

	public Ques2(String browserName, ArrayList<String> pluginList) {
		this.browserName = browserName;
		this.pluginList = pluginList;
	}
}
