package o2;

import android.util.Log;

public abstract class j
{
  public static final Object a = new Object();
  public static volatile j b;
  
  public static j d()
  {
    synchronized (a)
    {
      if (b == null)
      {
        localObject2 = new o2/j$a;
        ((a)localObject2).<init>(3);
        b = (j)localObject2;
      }
      Object localObject2 = b;
      return (j)localObject2;
    }
  }
  
  public static String f(String paramString)
  {
    int i = paramString.length();
    StringBuilder localStringBuilder = new StringBuilder(23);
    localStringBuilder.append("WM-");
    String str = paramString;
    if (i >= 20) {
      str = paramString.substring(0, 20);
    }
    localStringBuilder.append(str);
    return localStringBuilder.toString();
  }
  
  public abstract void a(String paramString1, String paramString2);
  
  public abstract void b(String paramString1, String paramString2);
  
  public abstract void c(String paramString1, String paramString2, Throwable paramThrowable);
  
  public abstract void e(String paramString1, String paramString2);
  
  public abstract void g(String paramString1, String paramString2);
  
  public static final class a
    extends j
  {
    public final int c;
    
    public a(int paramInt)
    {
      c = paramInt;
    }
    
    public final void a(String paramString1, String paramString2)
    {
      if (c <= 3) {
        Log.d(paramString1, paramString2);
      }
    }
    
    public final void b(String paramString1, String paramString2)
    {
      if (c <= 6) {
        Log.e(paramString1, paramString2);
      }
    }
    
    public final void c(String paramString1, String paramString2, Throwable paramThrowable)
    {
      if (c <= 6) {
        Log.e(paramString1, paramString2, paramThrowable);
      }
    }
    
    public final void e(String paramString1, String paramString2)
    {
      if (c <= 4) {
        Log.i(paramString1, paramString2);
      }
    }
    
    public final void g(String paramString1, String paramString2)
    {
      if (c <= 5) {
        Log.w(paramString1, paramString2);
      }
    }
  }
}

/* Location:
 * Qualified Name:     o2.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */