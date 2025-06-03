package g0;

import android.util.Log;

public abstract interface o$a
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

/* Location:
 * Qualified Name:     g0.o.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */