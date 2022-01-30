package com.example.handlingformsubmission;

public class Greeting {

	private double mfcc1, mfcc2, mfcc3;

//	public Greeting(double mfcc1, double mfcc2, double mfcc3) {
//		this.mfcc1 = mfcc1;
//		this.mfcc2 = mfcc2;
//		this.mfcc3 = mfcc3;
//	}
//
//	public Greeting() {
//
//	}

	public Boolean detectAmbulance(){
		boolean first = (0.08 <= mfcc1) && (mfcc1 <= 0.13);
		boolean second = (-188.05 <= mfcc2) && (mfcc2 <= -110.32);
		boolean third = (96.04 <= mfcc3) && (mfcc3 <= 149.29);

		return first && second && third;
	}

	public double getMfcc1() {
		return mfcc1;
	}

	public void setMfcc1(double mfcc1) {
		this.mfcc1 = mfcc1;
	}

	public double getMfcc2() {
		return mfcc2;
	}

	public void setMfcc2(double mfcc2) {
		this.mfcc2 = mfcc2;
	}

	public double getMfcc3() {
		return mfcc3;
	}

	public void setMfcc3(double mfcc3) {
		this.mfcc3 = mfcc3;
	}
}
