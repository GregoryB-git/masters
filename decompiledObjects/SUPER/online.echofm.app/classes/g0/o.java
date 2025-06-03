package g0;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

public abstract class o
{
  public static final Object a = new Object();
  public static int b = 0;
  public static boolean c = true;
  public static a d = a.a;
  
  public static String a(String paramString, Throwable paramThrowable)
  {
    String str = e(paramThrowable);
    paramThrowable = paramString;
    if (!TextUtils.isEmpty(str))
    {
      paramThrowable = new StringBuilder();
      paramThrowable.append(paramString);
      paramThrowable.append("\n  ");
      paramThrowable.append(str.replace("\n", "\n  "));
      paramThrowable.append('\n');
      paramThrowable = paramThrowable.toString();
    }
    return paramThrowable;
  }
  
  public static void b(String paramString1, String paramString2)
  {
    synchronized (a)
    {
      if (b == 0) {
        d.a(paramString1, paramString2, null);
      }
    }
  }
  
  public static void c(String paramString1, String paramString2)
  {
    synchronized (a)
    {
      if (b <= 3) {
        d.d(paramString1, paramString2, null);
      }
    }
  }
  
  public static void d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    synchronized (a)
    {
      if (b <= 3) {
        d.d(paramString1, paramString2, paramThrowable);
      }
    }
  }
  
  public static String e(Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      return null;
    }
    synchronized (a)
    {
      if (g(paramThrowable)) {
        return "UnknownHostException (no network)";
      }
    }
  }
  
  public static void f(String paramString1, String paramString2)
  {
    synchronized (a)
    {
      if (b <= 1) {
        d.c(paramString1, paramString2, null);
      }
    }
  }
  
  public static boolean g(Throwable paramThrowable)
  {
    while (paramThrowable != null)
    {
      if ((paramThrowable instanceof UnknownHostException)) {
        return true;
      }
      paramThrowable = paramThrowable.getCause();
    }
    return false;
  }
  
  public static void h(String paramString1, String paramString2)
  {
    synchronized (a)
    {
      if (b <= 2) {
        d.b(paramString1, paramString2, null);
      }
    }
  }
  
  public static void i(String paramString1, String paramString2, Throwable paramThrowable)
  {
    synchronized (a)
    {
      if (b <= 2) {
        d.b(paramString1, paramString2, paramThrowable);
      }
    }
  }
  
  public static abstract interface a
  {
    public static final a a = new a();
    
    public abstract void a(String paramString1, String paramString2, Throwable paramThrowable);
    
    public abstract void b(String paramString1, String paramString2, Throwable paramThrowable);
    
    public abstract void c(String paramString1, String paramString2, Throwable paramThrowable);
    
    public abstract void d(String paramString1, String paramString2, Throwable paramThrowable);
    
    public class a
      implements o.a
    {
      public void a(String paramString1, String paramString2, Throwable paramThrowable)
      {
        Log.d(paramString1, o.a(paramString2, paramThrowable));
      }
      
      public void b(String paramString1, String paramString2, Throwable paramThrowable)
      {
        Log.w(paramString1, o.a(paramString2, paramThrowable));
      }
      
      public void c(String paramString1, String paramString2, Throwable paramThrowable)
      {
        Log.i(paramString1, o.a(paramString2, paramThrowable));
      }
      
      public void d(String paramString1, String paramString2, Throwable paramThrowable)
      {
        Log.e(paramString1, o.a(paramString2, paramThrowable));
      }
    }
  }
}

/* Location:
 * Qualified Name:     g0.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */