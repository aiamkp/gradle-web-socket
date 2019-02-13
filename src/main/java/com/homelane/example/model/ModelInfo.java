package com.homelane.example.model;

import java.io.Serializable;
import java.util.Random;

public class ModelInfo implements Serializable {

	private static final long serialVersionUID = -7984032536291170146L;

	private double valueA;

	public double getValueA() {
		return valueA;
	}

		 
	public void changeValues() {
		this.valueA = random(10);
	}
	
	public static int random(int max) {
        Random rand = new Random();
        return rand.nextInt(max) * 2;
	}
	
}
