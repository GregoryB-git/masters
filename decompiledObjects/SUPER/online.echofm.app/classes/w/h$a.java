package w;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public class h$a
{
  public final Bundle a;
  public IconCompat b;
  public final l[] c;
  public final l[] d;
  public boolean e;
  public boolean f = true;
  public final int g;
  public final boolean h;
  public int i;
  public CharSequence j;
  public PendingIntent k;
  public boolean l;
  
  public h$a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    this(localIconCompat, paramCharSequence, paramPendingIntent);
  }
  
  public h$a(IconCompat paramIconCompat, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    this(paramIconCompat, paramCharSequence, paramPendingIntent, new Bundle(), null, null, true, 0, true, false, false);
  }
  
  public h$a(IconCompat paramIconCompat, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle, l[] paramArrayOfl1, l[] paramArrayOfl2, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    b = paramIconCompat;
    if ((paramIconCompat != null) && (paramIconCompat.i() == 2)) {
      i = paramIconCompat.g();
    }
    j = h.e.e(paramCharSequence);
    k = paramPendingIntent;
    if (paramBundle == null) {
      paramBundle = new Bundle();
    }
    a = paramBundle;
    c = paramArrayOfl1;
    d = paramArrayOfl2;
    e = paramBoolean1;
    g = paramInt;
    f = paramBoolean2;
    h = paramBoolean3;
    l = paramBoolean4;
  }
  
  public PendingIntent a()
  {
    return k;
  }
  
  public boolean b()
  {
    return e;
  }
  
  public Bundle c()
  {
    return a;
  }
  
  public IconCompat d()
  {
    if (b == null)
    {
      int m = i;
      if (m != 0) {
        b = IconCompat.e(null, "", m);
      }
    }
    return b;
  }
  
  public l[] e()
  {
    return c;
  }
  
  public int f()
  {
    return g;
  }
  
  public boolean g()
  {
    return f;
  }
  
  public CharSequence h()
  {
    return j;
  }
  
  public boolean i()
  {
    return l;
  }
  
  public boolean j()
  {
    return h;
  }
}

/* Location:
 * Qualified Name:     w.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */