package com.tns.framework;

public abstract class NormalAcc extends ShopAcc{
	
	private final float deliverychargers;
	private int deliverycharges;


	public NormalAcc(int accNo, String accNm, float charges, float deliverCharges) {
		super(accNo, accNm, charges);
        this.deliverychargers = 50;
		
		// TODO Auto-generated constructor stub
		
		

	}


	public float getDeliverychargers() {
		return deliverychargers;
	}


	@Override
	public String toString() {
		return "NormalAcc [deliverychargers=" + deliverychargers + ", getDeliverychargers()=" + getDeliverychargers()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getCharges()=" + getCharges()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
