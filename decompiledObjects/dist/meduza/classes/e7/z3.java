package e7;

import android.os.SystemClock;
import android.text.TextUtils;
import b.z;
import d2.q;
import java.util.concurrent.atomic.AtomicReference;
import l6.q0;

public final class z3
  implements Runnable
{
  public final void run()
  {
    switch (a)
    {
    default: 
      break;
    case 0: 
      c.j().u.b(b);
      c.zzj().v.c("Session timeout duration set", Long.valueOf(b));
      return;
    }
    k3 localk3 = c;
    long l1 = b;
    localk3.l();
    localk3.t();
    zzjv.b("Resetting analytics data (FE)");
    Object localObject = localk3.r();
    ((o0)localObject).l();
    localObject = o;
    c.a();
    long l2;
    if (d.h().x(null, h0.X0))
    {
      ((z)d.zzb()).getClass();
      l2 = SystemClock.elapsedRealtime();
    }
    else
    {
      l2 = 0L;
    }
    a = l2;
    b = l2;
    localk3.m().x();
    boolean bool = ((j2)b).d();
    localObject = localk3.j();
    p.b(l1);
    if (!TextUtils.isEmpty(jF.a())) {
      F.b(null);
    }
    z.b(0L);
    A.b(0L);
    if (!((q)localObject).h().B()) {
      ((l1)localObject).t(bool ^ true);
    }
    G.b(null);
    H.b(0L);
    I.b(null);
    w4 localw4 = localk3.q();
    localw4.l();
    localw4.t();
    localObject = localw4.I(false);
    localw4.n().x();
    localw4.x(new q0(3, localw4, localObject));
    rf.a();
    B = (bool ^ true);
    c.q().y(new AtomicReference());
  }
}

/* Location:
 * Qualified Name:     e7.z3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */