package e7;

import android.os.Handler;
import b.z;
import d2.q;
import l3.l;

public final class i0
  implements Runnable
{
  public final void run()
  {
    switch (a)
    {
    default: 
      break;
    case 0: 
      ((a)c).w(b);
      return;
    }
    q5 localq5 = (q5)c;
    long l = b;
    localq5.l();
    localq5.v();
    zzjw.c("Activity paused, time", Long.valueOf(l));
    l locall = p;
    ((z)((q5)b).zzb()).getClass();
    r5 localr5 = new r5(locall, System.currentTimeMillis(), l);
    a = localr5;
    b).d.postDelayed(localr5, 2000L);
    if (localq5.h().A()) {
      o.c.a();
    }
  }
}

/* Location:
 * Qualified Name:     e7.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */