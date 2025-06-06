package j2;

import android.os.Build.VERSION;
import android.util.Log;

public abstract class a
{
  public static String a(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString1);
    localStringBuilder.append(paramString2);
    paramString2 = localStringBuilder.toString();
    paramString1 = paramString2;
    if (paramString2.length() > 23) {
      paramString1 = paramString2.substring(0, 23);
    }
    return paramString1;
  }
  
  public static void b(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = e(paramString1);
    if (Log.isLoggable(paramString1, 3)) {
      Log.d(paramString1, String.format(paramString2, new Object[] { paramObject }));
    }
  }
  
  public static void c(String paramString1, String paramString2, Object... paramVarArgs)
  {
    paramString1 = e(paramString1);
    if (Log.isLoggable(paramString1, 3)) {
      Log.d(paramString1, String.format(paramString2, paramVarArgs));
    }
  }
  
  public static void d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    paramString1 = e(paramString1);
    if (Log.isLoggable(paramString1, 6)) {
      Log.e(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static String e(String paramString)
  {
    if (Build.VERSION.SDK_INT < 26) {
      return a("TRuntime.", paramString);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("TRuntime.");
    localStringBuilder.append(paramString);
    return localStringBuilder.toString();
  }
  
  public static void f(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = e(paramString1);
    if (Log.isLoggable(paramString1, 4)) {
      Log.i(paramString1, String.format(paramString2, new Object[] { paramObject }));
    }
  }
  
  public static void g(String paramString1, String paramString2, Object paramObject)
  {
    paramString1 = e(paramString1);
    if (Log.isLoggable(paramString1, 5)) {
      Log.w(paramString1, String.format(paramString2, new Object[] { paramObject }));
    }
  }
}

/* Location:
 * Qualified Name:     j2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */