package l;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import z.h.b;

public class v$a
  extends h.b
{
  public v$a(v paramv, int paramInt1, int paramInt2, WeakReference paramWeakReference) {}
  
  public void h(int paramInt) {}
  
  public void i(Typeface paramTypeface)
  {
    Typeface localTypeface = paramTypeface;
    if (Build.VERSION.SDK_INT >= 28)
    {
      int i = a;
      localTypeface = paramTypeface;
      if (i != -1)
      {
        boolean bool;
        if ((b & 0x2) != 0) {
          bool = true;
        } else {
          bool = false;
        }
        localTypeface = u.a(paramTypeface, i, bool);
      }
    }
    d.n(c, localTypeface);
  }
}

/* Location:
 * Qualified Name:     l.v.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */