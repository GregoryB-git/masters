package t5;

import android.util.Log;

public abstract class b
{
  public static void a(String paramString1, String paramString2) {}
  
  public static void b(String paramString1, String paramString2)
  {
    Log.e(paramString1, paramString2);
  }
  
  public static void c(String paramString1, String paramString2, Throwable paramThrowable)
  {
    Log.e(paramString1, paramString2, paramThrowable);
  }
  
  public static String d(Throwable paramThrowable)
  {
    return Log.getStackTraceString(paramThrowable);
  }
  
  public static void e(String paramString1, String paramString2) {}
  
  public static void f(String paramString1, String paramString2) {}
  
  public static void g(String paramString1, String paramString2)
  {
    Log.w(paramString1, paramString2);
  }
  
  public static void h(String paramString1, String paramString2, Throwable paramThrowable)
  {
    Log.w(paramString1, paramString2, paramThrowable);
  }
}

/* Location:
 * Qualified Name:     t5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */