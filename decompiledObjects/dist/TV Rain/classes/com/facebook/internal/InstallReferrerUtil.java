package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

public class InstallReferrerUtil
{
  private static final String IS_REFERRER_UPDATED = "is_referrer_updated";
  
  private static boolean isUpdated()
  {
    if (CrashShieldHandler.isObjectCrashing(InstallReferrerUtil.class)) {
      return false;
    }
    try
    {
      boolean bool = FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, InstallReferrerUtil.class);
    }
    return false;
  }
  
  /* Error */
  private static void tryConnectReferrerInfo(Callback paramCallback)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 25	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: invokestatic 40	com/facebook/FacebookSdk:getApplicationContext	()Landroid/content/Context;
    //   12: invokestatic 64	com/android/installreferrer/api/InstallReferrerClient:newBuilder	(Landroid/content/Context;)Lcom/android/installreferrer/api/InstallReferrerClient$Builder;
    //   15: invokevirtual 70	com/android/installreferrer/api/InstallReferrerClient$Builder:build	()Lcom/android/installreferrer/api/InstallReferrerClient;
    //   18: astore_1
    //   19: new 6	com/facebook/internal/InstallReferrerUtil$1
    //   22: astore_2
    //   23: aload_2
    //   24: aload_1
    //   25: aload_0
    //   26: invokespecial 73	com/facebook/internal/InstallReferrerUtil$1:<init>	(Lcom/android/installreferrer/api/InstallReferrerClient;Lcom/facebook/internal/InstallReferrerUtil$Callback;)V
    //   29: aload_1
    //   30: aload_2
    //   31: invokevirtual 77	com/android/installreferrer/api/InstallReferrerClient:startConnection	(Lcom/android/installreferrer/api/InstallReferrerStateListener;)V
    //   34: return
    //   35: astore_0
    //   36: aload_0
    //   37: ldc 2
    //   39: invokestatic 32	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   42: return
    //   43: astore_0
    //   44: goto -10 -> 34
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	paramCallback	Callback
    //   18	12	1	localInstallReferrerClient	InstallReferrerClient
    //   22	9	2	local1	1
    // Exception table:
    //   from	to	target	type
    //   9	29	35	finally
    //   29	34	35	finally
    //   29	34	43	java/lang/Exception
  }
  
  public static void tryUpdateReferrerInfo(Callback paramCallback)
  {
    if (CrashShieldHandler.isObjectCrashing(InstallReferrerUtil.class)) {
      return;
    }
    try
    {
      if (!isUpdated()) {
        tryConnectReferrerInfo(paramCallback);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramCallback, InstallReferrerUtil.class);
    }
  }
  
  private static void updateReferrer()
  {
    if (CrashShieldHandler.isObjectCrashing(InstallReferrerUtil.class)) {
      return;
    }
    try
    {
      FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, InstallReferrerUtil.class);
    }
  }
  
  public static abstract interface Callback
  {
    public abstract void onReceiveReferrerUrl(String paramString);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.InstallReferrerUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */