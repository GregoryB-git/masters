package a0;

import android.os.Bundle;
import android.util.Log;
import b.b;
import t.h;

public class d$n$h
  implements Runnable
{
  public d$n$h(d.n paramn, d.o paramo, String paramString, Bundle paramBundle, b paramb) {}
  
  public void run()
  {
    Object localObject = o.asBinder();
    localObject = (d.f)s.a.s.get(localObject);
    if (localObject == null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("search for callback that isn't registered query=");
      ((StringBuilder)localObject).append(p);
      Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
      return;
    }
    s.a.q(p, q, (d.f)localObject, r);
  }
}

/* Location:
 * Qualified Name:     a0.d.n.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */