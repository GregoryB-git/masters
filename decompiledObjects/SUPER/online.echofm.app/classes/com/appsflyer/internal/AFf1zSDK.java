package com.appsflyer.internal;

import androidx.annotation.NonNull;

public final class AFf1zSDK
{
  @NonNull
  public final String AFInAppEventParameterName;
  public final String AFInAppEventType;
  public final long AFKeystoreWrapper;
  public final String AFLogger;
  public final Throwable afDebugLog;
  public final AFf1wSDK afInfoLog;
  public final long valueOf;
  public final int values;
  
  public AFf1zSDK(String paramString1, @NonNull String paramString2, long paramLong1, long paramLong2, int paramInt, AFf1wSDK paramAFf1wSDK, String paramString3, Throwable paramThrowable)
  {
    AFInAppEventType = paramString1;
    AFInAppEventParameterName = paramString2;
    AFKeystoreWrapper = paramLong1;
    valueOf = paramLong2;
    values = paramInt;
    afInfoLog = paramAFf1wSDK;
    AFLogger = paramString3;
    afDebugLog = paramThrowable;
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFf1zSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */