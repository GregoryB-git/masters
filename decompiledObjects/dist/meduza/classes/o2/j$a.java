package o2;

import android.util.Log;

public final class j$a
  extends j
{
  public final int c;
  
  public j$a(int paramInt)
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

/* Location:
 * Qualified Name:     o2.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */