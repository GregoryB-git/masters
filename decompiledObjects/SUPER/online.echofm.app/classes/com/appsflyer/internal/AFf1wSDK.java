package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.Locale;

public enum AFf1wSDK
{
  static
  {
    AFf1wSDK localAFf1wSDK1 = new AFf1wSDK("SUCCESS", 0);
    AFInAppEventParameterName = localAFf1wSDK1;
    AFf1wSDK localAFf1wSDK2 = new AFf1wSDK("FAILURE", 1);
    AFKeystoreWrapper = localAFf1wSDK2;
    AFf1wSDK localAFf1wSDK3 = new AFf1wSDK("NA", 2);
    valueOf = localAFf1wSDK3;
    AFf1wSDK localAFf1wSDK4 = new AFf1wSDK("INTERNAL_ERROR", 3);
    values = localAFf1wSDK4;
    AFInAppEventType = new AFf1wSDK[] { localAFf1wSDK1, localAFf1wSDK2, localAFf1wSDK3, localAFf1wSDK4 };
  }
  
  private AFf1wSDK() {}
  
  @NonNull
  public final String toString()
  {
    return super.toString().toLowerCase(Locale.getDefault());
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1wSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */