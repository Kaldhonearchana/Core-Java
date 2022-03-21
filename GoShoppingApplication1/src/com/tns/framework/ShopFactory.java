package com.tns.framework;

public abstract class ShopFactory 
{
   public abstract PrimeAcc getNewPrimeAcc( int AccNo, String AccNm, float charges,boolean isPrime);
   public abstract NormalAcc getNewNormalAccount(int AccNo, String AccNm, float charges, float deliveryCharges);
}
