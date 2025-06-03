package a0;

import android.util.Log;
import b.b;
import t.h;

public class d$n$e
  implements Runnable
{
  public d$n$e(d.n paramn, d.o paramo, String paramString, b paramb) {}
  
  public void run()
  {
    Object localObject = o.asBinder();
    localObject = (d.f)r.a.s.get(localObject);
    if (localObject == null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("getMediaItem for callback that isn't registered id=");
      ((StringBuilder)localObject).append(p);
      Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
      return;
    }
    r.a.p(p, (d.f)localObject, q);
  }
}

/* Location:
 * Qualified Name:     a0.d.n.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */