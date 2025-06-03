package com.appsflyer;

import android.util.Log;
import androidx.annotation.NonNull;
import com.appsflyer.internal.AFa1eSDK;
import com.appsflyer.internal.AFb1tSDK;
import com.appsflyer.internal.AFc1wSDK;
import com.appsflyer.internal.AFc1xSDK;

public class AFLogger
{
  private static final long AFKeystoreWrapper = ;
  
  public static void AFInAppEventType(String paramString)
  {
    if (!AFInAppEventType()) {
      Log.d("AppsFlyer_6.12.2", valueOf(paramString, false));
    }
    AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("F", paramString);
  }
  
  private static boolean AFInAppEventType()
  {
    return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
  }
  
  private static boolean AFInAppEventType(LogLevel paramLogLevel)
  {
    return paramLogLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel());
  }
  
  public static void AFKeystoreWrapper(String paramString)
  {
    if (AFInAppEventType(LogLevel.WARNING)) {
      Log.w("AppsFlyer_6.12.2", valueOf(paramString, false));
    }
    AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("W", valueOf(paramString, true));
  }
  
  public static void afDebugLog(String paramString)
  {
    if (AFInAppEventType(LogLevel.DEBUG)) {
      Log.d("AppsFlyer_6.12.2", valueOf(paramString, false));
    }
    AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("D", valueOf(paramString, true));
  }
  
  public static void afErrorLog(String paramString, Throwable paramThrowable)
  {
    afErrorLog(paramString, paramThrowable, true, false, true);
  }
  
  public static void afErrorLog(String paramString, Throwable paramThrowable, boolean paramBoolean)
  {
    afErrorLog(paramString, paramThrowable, true, paramBoolean, true);
  }
  
  public static void afErrorLog(String paramString, Throwable paramThrowable, boolean paramBoolean1, boolean paramBoolean2)
  {
    afErrorLog(paramString, paramThrowable, true, paramBoolean1, paramBoolean2);
  }
  
  public static void afErrorLog(String paramString, Throwable paramThrowable, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    String str = paramString;
    if (paramString == null)
    {
      paramString = new StringBuilder();
      paramString.append(paramThrowable.getClass().getSimpleName());
      paramString.append(" at ");
      paramString.append(paramThrowable.getStackTrace()[0].toString());
      str = paramString.toString();
    }
    if (AFInAppEventType(LogLevel.ERROR))
    {
      paramString = valueOf(str, false);
      if (paramBoolean2) {
        Log.e("AppsFlyer_6.12.2", paramString, paramThrowable);
      } else if (paramBoolean1) {
        Log.d("AppsFlyer_6.12.2", paramString);
      }
    }
    AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventType(paramThrowable);
    if (paramBoolean3) {
      AFa1eSDK.valueOf().AFInAppEventType().onConversionDataSuccess().AFKeystoreWrapper(paramThrowable, str);
    }
  }
  
  @Deprecated
  public static void afErrorLog(Throwable paramThrowable)
  {
    afErrorLogForExcManagerOnly("Unknown", paramThrowable);
  }
  
  public static void afErrorLogForExcManagerOnly(String paramString, Throwable paramThrowable)
  {
    afErrorLogForExcManagerOnly(paramString, paramThrowable, false);
  }
  
  public static void afErrorLogForExcManagerOnly(String paramString, Throwable paramThrowable, boolean paramBoolean)
  {
    afErrorLog(paramString, paramThrowable, false, false, paramBoolean ^ true);
  }
  
  public static void afInfoLog(String paramString)
  {
    afInfoLog(paramString, true);
  }
  
  public static void afInfoLog(String paramString, boolean paramBoolean)
  {
    if (AFInAppEventType(LogLevel.INFO)) {
      Log.i("AppsFlyer_6.12.2", valueOf(paramString, false));
    }
    if (paramBoolean) {
      AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("I", valueOf(paramString, true));
    }
  }
  
  public static void afRDLog(String paramString)
  {
    if (AFInAppEventType(LogLevel.VERBOSE)) {
      Log.v("AppsFlyer_6.12.2", valueOf(paramString, false));
    }
    AFa1eSDK.valueOf().AFInAppEventType().afErrorLogForExcManagerOnly().AFInAppEventParameterName("V", valueOf(paramString, true));
  }
  
  public static void afWarnLog(String paramString)
  {
    AFKeystoreWrapper(paramString);
  }
  
  @NonNull
  private static String valueOf(String paramString, boolean paramBoolean)
  {
    String str = paramString;
    if (paramString == null) {
      str = "null";
    }
    if ((!paramBoolean) && (LogLevel.VERBOSE.getLevel() > AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel()))) {
      return str;
    }
    paramString = new StringBuilder("(");
    paramString.append(System.currentTimeMillis() - AFKeystoreWrapper);
    paramString.append(") [");
    paramString.append(Thread.currentThread().getName());
    paramString.append("] ");
    paramString.append(str);
    return paramString.toString();
  }
  
  public static enum LogLevel
  {
    private int AFKeystoreWrapper;
    
    static
    {
      LogLevel localLogLevel1 = new LogLevel("NONE", 0, 0);
      NONE = localLogLevel1;
      LogLevel localLogLevel2 = new LogLevel("ERROR", 1, 1);
      ERROR = localLogLevel2;
      LogLevel localLogLevel3 = new LogLevel("WARNING", 2, 2);
      WARNING = localLogLevel3;
      LogLevel localLogLevel4 = new LogLevel("INFO", 3, 3);
      INFO = localLogLevel4;
      LogLevel localLogLevel5 = new LogLevel("DEBUG", 4, 4);
      DEBUG = localLogLevel5;
      LogLevel localLogLevel6 = new LogLevel("VERBOSE", 5, 5);
      VERBOSE = localLogLevel6;
      AFInAppEventParameterName = new LogLevel[] { localLogLevel1, localLogLevel2, localLogLevel3, localLogLevel4, localLogLevel5, localLogLevel6 };
    }
    
    private LogLevel(int paramInt)
    {
      AFKeystoreWrapper = paramInt;
    }
    
    public final int getLevel()
    {
      return AFKeystoreWrapper;
    }
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.AFLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */