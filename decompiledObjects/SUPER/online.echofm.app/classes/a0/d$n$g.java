package a0;

import android.os.IBinder;
import t.h;

public class d$n$g
  implements Runnable
{
  public d$n$g(d.n paramn, d.o paramo) {}
  
  public void run()
  {
    IBinder localIBinder = o.asBinder();
    d.f localf = (d.f)p.a.s.remove(localIBinder);
    if (localf != null) {
      localIBinder.unlinkToDeath(localf, 0);
    }
  }
}

/* Location:
 * Qualified Name:     a0.d.n.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */