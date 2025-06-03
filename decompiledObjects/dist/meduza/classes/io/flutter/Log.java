package io.flutter;

public class Log
{
  public static int ASSERT = 7;
  public static int DEBUG = 3;
  public static int ERROR = 6;
  public static int INFO = 4;
  public static int VERBOSE = 2;
  public static int WARN = 5;
  private static int logLevel = 3;
  
  public static void d(String paramString1, String paramString2) {}
  
  public static void d(String paramString1, String paramString2, Throwable paramThrowable) {}
  
  public static void e(String paramString1, String paramString2)
  {
    android.util.Log.e(paramString1, paramString2);
  }
  
  public static void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    android.util.Log.e(paramString1, paramString2, paramThrowable);
  }
  
  public static String getStackTraceString(Throwable paramThrowable)
  {
    return android.util.Log.getStackTraceString(paramThrowable);
  }
  
  public static void i(String paramString1, String paramString2) {}
  
  public static void i(String paramString1, String paramString2, Throwable paramThrowable) {}
  
  public static void println(int paramInt, String paramString1, String paramString2) {}
  
  public static void setLogLevel(int paramInt)
  {
    logLevel = paramInt;
  }
  
  public static void v(String paramString1, String paramString2) {}
  
  public static void v(String paramString1, String paramString2, Throwable paramThrowable) {}
  
  public static void w(String paramString1, String paramString2)
  {
    android.util.Log.w(paramString1, paramString2);
  }
  
  public static void w(String paramString1, String paramString2, Throwable paramThrowable)
  {
    android.util.Log.w(paramString1, paramString2, paramThrowable);
  }
  
  public static void wtf(String paramString1, String paramString2)
  {
    android.util.Log.wtf(paramString1, paramString2);
  }
  
  public static void wtf(String paramString1, String paramString2, Throwable paramThrowable)
  {
    android.util.Log.wtf(paramString1, paramString2, paramThrowable);
  }
}

/* Location:
 * Qualified Name:     io.flutter.Log
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */