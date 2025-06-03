package a0;

import android.os.Bundle;
import android.util.Log;
import b.b;
import t.h;

public class d$n$i
  implements Runnable
{
  public d$n$i(d.n paramn, d.o paramo, String paramString, Bundle paramBundle, b paramb) {}
  
  public void run()
  {
    Object localObject = o.asBinder();
    localObject = (d.f)s.a.s.get(localObject);
    if (localObject == null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("sendCustomAction for callback that isn't registered action=");
      ((StringBuilder)localObject).append(p);
      ((StringBuilder)localObject).append(", extras=");
      ((StringBuilder)localObject).append(q);
      Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
      return;
    }
    s.a.n(p, q, (d.f)localObject, r);
  }
}

/* Location:
 * Qualified Name:     a0.d.n.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */