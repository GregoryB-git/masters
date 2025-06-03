package d2;

import android.os.Build.VERSION;

public final class a$c
  extends a
{
  public a$c(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
  }
  
  public final boolean c()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 24) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     d2.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */