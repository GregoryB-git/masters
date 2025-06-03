package d2;

import android.os.Build.VERSION;

public final class a$f
  extends a
{
  public a$f(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
  }
  
  public final boolean c()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 27) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     d2.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */