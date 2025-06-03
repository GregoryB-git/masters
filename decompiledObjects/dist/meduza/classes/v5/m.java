package v5;

import android.text.TextUtils;
import android.util.Log;
import g;
import java.net.UnknownHostException;

public final class m
{
  public static final Object a = new Object();
  
  public static String a(String paramString, Throwable paramThrowable)
  {
    Object localObject1 = a;
    Object localObject2;
    if (paramThrowable == null) {
      paramThrowable = null;
    } else {
      localObject2 = paramThrowable;
    }
    for (;;)
    {
      if (localObject2 != null) {}
      try
      {
        int i;
        if ((localObject2 instanceof UnknownHostException))
        {
          i = 1;
        }
        else
        {
          localObject2 = ((Throwable)localObject2).getCause();
          continue;
          i = 0;
        }
        if (i != 0) {
          paramThrowable = "UnknownHostException (no network)";
        } else {
          paramThrowable = Log.getStackTraceString(paramThrowable).trim().replace("\t", "    ");
        }
        localObject2 = paramString;
        if (!TextUtils.isEmpty(paramThrowable))
        {
          paramString = g.g(paramString, "\n  ");
          paramString.append(paramThrowable.replace("\n", "\n  "));
          paramString.append('\n');
          localObject2 = paramString.toString();
        }
        return (String)localObject2;
      }
      finally {}
    }
  }
  
  public static void b(String paramString1, String paramString2)
  {
    synchronized (a)
    {
      Log.d(paramString1, paramString2);
      return;
    }
  }
  
  public static void c(String paramString1, String paramString2)
  {
    synchronized (a)
    {
      Log.e(paramString1, paramString2);
      return;
    }
  }
  
  public static void d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    c(paramString1, a(paramString2, paramThrowable));
  }
  
  public static void e(String paramString1, String paramString2)
  {
    synchronized (a)
    {
      Log.i(paramString1, paramString2);
      return;
    }
  }
  
  public static void f(String paramString1, String paramString2)
  {
    synchronized (a)
    {
      Log.w(paramString1, paramString2);
      return;
    }
  }
  
  public static void g(String paramString1, String paramString2, Exception paramException)
  {
    f(paramString1, a(paramString2, paramException));
  }
}

/* Location:
 * Qualified Name:     v5.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */