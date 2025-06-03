package u;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.graphics.drawable.IconCompat.a;

public final class n
{
  public final Bundle a;
  public IconCompat b;
  public final z[] c;
  public boolean d;
  public boolean e = true;
  public final int f;
  public final boolean g;
  @Deprecated
  public int h;
  public CharSequence i;
  public PendingIntent j;
  public boolean k;
  
  public n(int paramInt, String paramString, PendingIntent paramPendingIntent)
  {
    this(localIconCompat, paramString, paramPendingIntent, new Bundle(), null, null, true, 0, true, false, false);
  }
  
  public n(IconCompat paramIconCompat, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle, z[] paramArrayOfz1, z[] paramArrayOfz2, boolean paramBoolean1, int paramInt, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    b = paramIconCompat;
    if (paramIconCompat != null)
    {
      int m = a;
      int n = m;
      if (m == -1) {
        n = IconCompat.a.c(b);
      }
      if (n == 2) {
        h = paramIconCompat.e();
      }
    }
    i = q.b(paramCharSequence);
    j = paramPendingIntent;
    if (paramBundle == null) {
      paramBundle = new Bundle();
    }
    a = paramBundle;
    c = paramArrayOfz1;
    d = paramBoolean1;
    f = paramInt;
    e = paramBoolean2;
    g = paramBoolean3;
    k = paramBoolean4;
  }
}

/* Location:
 * Qualified Name:     u.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */