package a0;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import t.h;

public class d$n$c
  implements Runnable
{
  public d$n$c(d.n paramn, d.o paramo, String paramString, IBinder paramIBinder, Bundle paramBundle) {}
  
  public void run()
  {
    Object localObject = o.asBinder();
    localObject = (d.f)s.a.s.get(localObject);
    if (localObject == null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("addSubscription for callback that isn't registered id=");
      ((StringBuilder)localObject).append(p);
      Log.w("MBServiceCompat", ((StringBuilder)localObject).toString());
      return;
    }
    s.a.a(p, (d.f)localObject, q, r);
  }
}

/* Location:
 * Qualified Name:     a0.d.n.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */