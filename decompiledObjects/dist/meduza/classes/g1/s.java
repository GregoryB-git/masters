package g1;

import android.os.Bundle;
import android.support.v4.os.a;
import android.util.Log;
import f;
import r.h;

public final class s
  implements Runnable
{
  public s(c.k paramk, c.m paramm, String paramString, Bundle paramBundle, a parama) {}
  
  public final void run()
  {
    Object localObject = ((c.m)a).a();
    if ((c.c)e.a.d.getOrDefault(localObject, null) == null)
    {
      localObject = f.l("sendCustomAction for callback that isn't registered action=");
      ((StringBuilder)localObject).append(b);
      ((StringBuilder)localObject).append(", extras=");
      ((StringBuilder)localObject).append(c);
      Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
      return;
    }
    c localc = e.a;
    localObject = d;
    localc.getClass();
    ((a)localObject).b(-1, null);
  }
}

/* Location:
 * Qualified Name:     g1.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */