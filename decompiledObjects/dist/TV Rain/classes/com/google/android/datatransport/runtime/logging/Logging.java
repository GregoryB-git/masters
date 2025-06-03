package com.google.android.datatransport.runtime.logging;

import android.os.Build.VERSION;
import android.util.Log;
import z2;

public final class Logging
{
  private static final String LOG_PREFIX = "TRuntime.";
  private static final int MAX_LOG_TAG_SIZE_IN_SDK_N = 23;
  
  private static String concatTag(String paramString1, String paramString2)
  {
    paramString2 = z2.o(paramString1, paramString2);
    paramString1 = paramString2;
    if (paramString2.length() > 23) {
      paramString1 = paramString2.substring(0, 23);
    }
    return paramString1;
  }
  
  public static void d(String paramString1, String paramString2)
  {
    paramString1 = getTag(paramString1);
    if (Log.isLoggable(paramString1, 3)) {
      Log.d(paramString1, paramString2);
    }
  }
  
  public static void d(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = getTag(paramString1);
    if (Log.isLoggable(paramString1, 3)) {
      Log.d(paramString1, String.format(paramString2, new Object[] { paramObject }));
    }
  }
  
  public static void d(String paramString1, String paramString2, Object paramObject1, Object paramObject2)
  {
    paramString1 = getTag(paramString1);
    if (Log.isLoggable(paramString1, 3)) {
      Log.d(paramString1, String.format(paramString2, new Object[] { paramObject1, paramObject2 }));
    }
  }
  
  public static void d(String paramString1, String paramString2, Object... paramVarArgs)
  {
    paramString1 = getTag(paramString1);
    if (Log.isLoggable(paramString1, 3)) {
      Log.d(paramString1, String.format(paramString2, paramVarArgs));
    }
  }
  
  public static void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    paramString1 = getTag(paramString1);
    if (Log.isLoggable(paramString1, 6)) {
      Log.e(paramString1, paramString2, paramThrowable);
    }
  }
  
  private static String getTag(String paramString)
  {
    if (Build.VERSION.SDK_INT < 26) {
      return concatTag("TRuntime.", paramString);
    }
    return z2.o("TRuntime.", paramString);
  }
  
  public static void i(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = getTag(paramString1);
    if (Log.isLoggable(paramString1, 4)) {
      Log.i(paramString1, String.format(paramString2, new Object[] { paramObject }));
    }
  }
  
  public static void w(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = getTag(paramString1);
    if (Log.isLoggable(paramString1, 5)) {
      Log.w(paramString1, String.format(paramString2, new Object[] { paramObject }));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.logging.Logging
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */