package com.allhospital;

public interface Hospitalization {
	
	public void setup();
	public void register();
	public void discharge();
	public void viewInfo();
	public boolean searchPrn(Integer prn);

}
