package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import z2;

public final class Log
{
  public static final int LOG_LEVEL_ALL = 0;
  public static final int LOG_LEVEL_ERROR = 3;
  public static final int LOG_LEVEL_INFO = 1;
  public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
  public static final int LOG_LEVEL_WARNING = 2;
  private static int logLevel = 0;
  private static boolean logStackTraces = true;
  
  private static String appendThrowableMessage(String paramString, @Nullable Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      return paramString;
    }
    paramThrowable = paramThrowable.getMessage();
    if (!TextUtils.isEmpty(paramThrowable)) {
      paramString = z2.p(paramString, " - ", paramThrowable);
    }
    return paramString;
  }
  
  public static void d(String paramString1, String paramString2)
  {
    if (logLevel == 0) {
      android.util.Log.d(paramString1, paramString2);
    }
  }
  
  public static void d(String paramString1, String paramString2, @Nullable Throwable paramThrowable)
  {
    if (!logStackTraces) {
      d(paramString1, appendThrowableMessage(paramString2, paramThrowable));
    }
    if (logLevel == 0) {
      android.util.Log.d(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void e(String paramString1, String paramString2)
  {
    if (logLevel <= 3) {
      android.util.Log.e(paramString1, paramString2);
    }
  }
  
  public static void e(String paramString1, String paramString2, @Nullable Throwable paramThrowable)
  {
    if (!logStackTraces) {
      e(paramString1, appendThrowableMessage(paramString2, paramThrowable));
    }
    if (logLevel <= 3) {
      android.util.Log.e(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static int getLogLevel()
  {
    return logLevel;
  }
  
  public static void i(String paramString1, String paramString2)
  {
    if (logLevel <= 1) {
      android.util.Log.i(paramString1, paramString2);
    }
  }
  
  public static void i(String paramString1, String paramString2, @Nullable Throwable paramThrowable)
  {
    if (!logStackTraces) {
      i(paramString1, appendThrowableMessage(paramString2, paramThrowable));
    }
    if (logLevel <= 1) {
      android.util.Log.i(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void setLogLevel(int paramInt)
  {
    logLevel = paramInt;
  }
  
  public static void setLogStackTraces(boolean paramBoolean)
  {
    logStackTraces = paramBoolean;
  }
  
  public static void w(String paramString1, String paramString2)
  {
    if (logLevel <= 2) {
      android.util.Log.w(paramString1, paramString2);
    }
  }
  
  public static void w(String paramString1, String paramString2, @Nullable Throwable paramThrowable)
  {
    if (!logStackTraces) {
      w(paramString1, appendThrowableMessage(paramString2, paramThrowable));
    }
    if (logLevel <= 2) {
      android.util.Log.w(paramString1, paramString2, paramThrowable);
    }
  }
  
  public boolean getLogStackTraces()
  {
    return logStackTraces;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.util.Log
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */