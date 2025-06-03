package x2;

import android.util.Log;

public class O
{
  public static final O e = new O(true, 3, 1, null, null);
  public final boolean a;
  public final String b;
  public final Throwable c;
  public final int d;
  
  public O(boolean paramBoolean, int paramInt1, int paramInt2, String paramString, Throwable paramThrowable)
  {
    a = paramBoolean;
    d = paramInt1;
    b = paramString;
    c = paramThrowable;
  }
  
  public static O b()
  {
    return e;
  }
  
  public static O c(String paramString)
  {
    return new O(false, 1, 5, paramString, null);
  }
  
  public static O d(String paramString, Throwable paramThrowable)
  {
    return new O(false, 1, 5, paramString, paramThrowable);
  }
  
  public static O f(int paramInt)
  {
    return new O(true, paramInt, 1, null, null);
  }
  
  public static O g(int paramInt1, int paramInt2, String paramString, Throwable paramThrowable)
  {
    return new O(false, paramInt1, paramInt2, paramString, paramThrowable);
  }
  
  public String a()
  {
    return b;
  }
  
  public final void e()
  {
    if ((!a) && (Log.isLoggable("GoogleCertificatesRslt", 3)))
    {
      if (c != null)
      {
        Log.d("GoogleCertificatesRslt", a(), c);
        return;
      }
      Log.d("GoogleCertificatesRslt", a());
    }
  }
}

/* Location:
 * Qualified Name:     x2.O
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */