package com.multycart.qa.Nexttech;

public class MainClass {

	public static void main(String[] args) {
	//call  exel_config class
		exel_config config = new exel_config("exelpath");
		//calling config to gitData method
		System.out.println(config.getData(0, 0, 0));
	}

}
