
public class oddoreven {
	private int randomnumber;

	oddoreven(int cpunum) {
		randomnumber = cpunum;
	}
	public String WhatIsIt() {
		String cpunumstring;
	 if (randomnumber % 2 == 0) {
			
			cpunumstring = "even";
		} else {
			
			cpunumstring = "odd";}
		 return cpunumstring;
		 }
		 }

