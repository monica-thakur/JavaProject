package constructorAssignment;

import java.util.ArrayList;

public class Ques2Caller {

	public static void main(String[] args) {

		ArrayList<String> pluginList = new ArrayList<String>();
		pluginList.add("Honey");
		pluginList.add("Speedtest");
		pluginList.add("Grammarly");

		Ques2 obj = new Ques2("Chrome", "Google", 83.0, pluginList);
		System.out.println(obj.getbrowserName());
		System.out.println(obj.getCurrentVersion());
		System.out.println(obj.getVendorName());
		System.out.println(obj.getPluginList());
	}
}
