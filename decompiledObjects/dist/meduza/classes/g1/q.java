package g1;

import android.os.IBinder;
import r.h;

public final class q
  implements Runnable
{
  public q(c.k paramk, c.m paramm) {}
  
  public final void run()
  {
    IBinder localIBinder = ((c.m)a).a();
    c.c localc = (c.c)b.a.d.remove(localIBinder);
    if (localc != null) {
      localIBinder.unlinkToDeath(localc, 0);
    }
  }
}

/* Location:
 * Qualified Name:     g1.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */