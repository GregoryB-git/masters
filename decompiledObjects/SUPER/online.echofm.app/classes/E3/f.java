package E3;

import android.util.Log;

public class f
{
  public static final f c = new f("FirebaseCrashlytics");
  public final String a;
  public int b;
  
  public f(String paramString)
  {
    a = paramString;
    b = 4;
  }
  
  public static f f()
  {
    return c;
  }
  
  public final boolean a(int paramInt)
  {
    boolean bool;
    if ((b > paramInt) && (!Log.isLoggable(a, paramInt))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void b(String paramString)
  {
    c(paramString, null);
  }
  
  public void c(String paramString, Throwable paramThrowable)
  {
    if (a(3)) {
      Log.d(a, paramString, paramThrowable);
    }
  }
  
  public void d(String paramString)
  {
    e(paramString, null);
  }
  
  public void e(String paramString, Throwable paramThrowable)
  {
    if (a(6)) {
      Log.e(a, paramString, paramThrowable);
    }
  }
  
  public void g(String paramString)
  {
    h(paramString, null);
  }
  
  public void h(String paramString, Throwable paramThrowable)
  {
    if (a(4)) {
      Log.i(a, paramString, paramThrowable);
    }
  }
  
  public void i(String paramString)
  {
    j(paramString, null);
  }
  
  public void j(String paramString, Throwable paramThrowable)
  {
    if (a(2)) {
      Log.v(a, paramString, paramThrowable);
    }
  }
  
  public void k(String paramString)
  {
    l(paramString, null);
  }
  
  public void l(String paramString, Throwable paramThrowable)
  {
    if (a(5)) {
      Log.w(a, paramString, paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     E3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */