package g1;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.text.TextUtils;
import d0.b;
import java.util.HashMap;
import java.util.List;
import r.h;

public final class c$c
  implements IBinder.DeathRecipient
{
  public final String a;
  public final int b;
  public final int c;
  public final c.l d;
  public final HashMap<String, List<b<IBinder, Bundle>>> e = new HashMap();
  public c.b f;
  
  public c$c(c paramc, String paramString, int paramInt1, int paramInt2, c.l paraml)
  {
    a = paramString;
    b = paramInt1;
    c = paramInt2;
    if (paramString != null)
    {
      if (!TextUtils.isEmpty(paramString))
      {
        if (Build.VERSION.SDK_INT >= 28) {
          new u(paramString, paramInt1, paramInt2);
        }
        d = paraml;
        return;
      }
      throw new IllegalArgumentException("packageName should be nonempty");
    }
    throw new NullPointerException("package shouldn't be null");
  }
  
  public final void binderDied()
  {
    g.e.post(new a());
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      c.c localc = c.c.this;
      g.d.remove(((c.m)d).a());
    }
  }
}

/* Location:
 * Qualified Name:     g1.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */