package com.facebook.appevents.internal;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Currency;

class AutomaticAnalyticsLogger$PurchaseLoggingParameters
{
  public Currency currency;
  public Bundle param;
  public BigDecimal purchaseAmount;
  
  public AutomaticAnalyticsLogger$PurchaseLoggingParameters(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    purchaseAmount = paramBigDecimal;
    currency = paramCurrency;
    param = paramBundle;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.AutomaticAnalyticsLogger.PurchaseLoggingParameters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */