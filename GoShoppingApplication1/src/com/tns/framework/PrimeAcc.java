package com.tns.framework;

public abstract class PrimeAcc extends ShopAcc {
     
	private boolean isPrime;
	private static final float deliveryCharges=0;
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) 
	{
		super(accNo, accNm, charges);
		this.isPrime=isPrime;
	}
		// TODO Auto-generated constructor stub

	public boolean isPrime() {
		return isPrime;
	}


	public static float getDeliverycharges() {
		return deliveryCharges;
	
		
	}
	public void bookProduct(float charges)
	 {
		 
	 }

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", isPrime()=" + isPrime() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	}


 

