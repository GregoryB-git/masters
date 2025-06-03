package a0;

import android.os.IBinder;
import android.util.Log;
import t.h;

public class d$n$d
  implements Runnable
{
  public d$n$d(d.n paramn, d.o paramo, String paramString, IBinder paramIBinder) {}
  
  public void run()
  {
    Object localObject = o.asBinder();
    localObject = (d.f)r.a.s.get(localObject);
    if (localObject == null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("removeSubscription for callback that isn't registered id=");
      ((StringBuilder)localObject).append(p);
      Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
      return;
    }
    if (!r.a.r(p, (d.f)localObject, q))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("removeSubscription called for ");
      ((StringBuilder)localObject).append(p);
      ((StringBuilder)localObject).append(" which is not subscribed");
      Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
    }
  }
}

/* Location:
 * Qualified Name:     a0.d.n.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */