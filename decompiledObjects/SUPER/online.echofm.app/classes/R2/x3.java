package R2;

import A2.n;
import android.content.Context;
import android.os.BaseBundle;
import com.google.android.gms.internal.measurement.H0;

public final class x3
{
  public final Context a;
  public String b;
  public String c;
  public String d;
  public Boolean e;
  public long f;
  public H0 g;
  public boolean h = true;
  public Long i;
  public String j;
  
  public x3(Context paramContext, H0 paramH0, Long paramLong)
  {
    n.i(paramContext);
    paramContext = paramContext.getApplicationContext();
    n.i(paramContext);
    a = paramContext;
    i = paramLong;
    if (paramH0 != null)
    {
      g = paramH0;
      b = t;
      c = s;
      d = r;
      h = q;
      f = p;
      j = v;
      paramContext = u;
      if (paramContext != null) {
        e = Boolean.valueOf(paramContext.getBoolean("dataCollectionDefaultEnabled", true));
      }
    }
  }
}

/* Location:
 * Qualified Name:     R2.x3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */