package com.tns.application;
 
import com.tns.framework.ShopAcc;
import com.tns.framework.NormalAcc;
import com.tns.framework.PrimeAcc;
import com.tns.framework.ShopFactory;


public class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAcc(int AccNo, String AccNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NormalAcc getNewNormalAccount(int AccNo, String AccNm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		return null;
	}

}


