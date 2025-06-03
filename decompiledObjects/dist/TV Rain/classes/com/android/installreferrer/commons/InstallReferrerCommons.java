package com.android.installreferrer.commons;

import android.util.Log;

public final class InstallReferrerCommons
{
  public static void logVerbose(String paramString1, String paramString2)
  {
    if (Log.isLoggable(paramString1, 2)) {
      Log.v(paramString1, paramString2);
    }
  }
  
  public static void logWarn(String paramString1, String paramString2)
  {
    if (Log.isLoggable(paramString1, 5)) {
      Log.w(paramString1, paramString2);
    }
  }
}

/* Location:
 * Qualified Name:     com.android.installreferrer.commons.InstallReferrerCommons
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */