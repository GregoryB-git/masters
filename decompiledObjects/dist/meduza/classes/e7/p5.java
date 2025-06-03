package e7;

import android.os.Handler;
import b.z;
import d2.q;
import l3.l;

public final class p5
  implements Runnable
{
  public final void run()
  {
    Object localObject1 = b;
    long l = a;
    ((o0)localObject1).l();
    ((q5)localObject1).v();
    zzjw.c("Activity resumed, time", Long.valueOf(l));
    if (((q)localObject1).h().x(null, h0.W0) ? (!((q)localObject1).h().A()) || (!e) : (((q)localObject1).h().A()) || (jC.b()))
    {
      localObject2 = o;
      d.l();
      c.a();
      a = l;
      b = l;
    }
    Object localObject2 = p;
    ((q5)b).l();
    Object localObject3 = (r5)a;
    if (localObject3 != null) {
      b).d.removeCallbacks((Runnable)localObject3);
    }
    b).j().C.a(false);
    localObject3 = (q5)b;
    ((o0)localObject3).l();
    e = false;
    if ((((q5)b).h().x(null, h0.U0)) && (b).o().w))
    {
      b).zzj().w.b("Retrying trigger URI registration in foreground");
      ((q5)b).o().N();
    }
    localObject1 = f;
    a.l();
    if (((j2)a.b).d())
    {
      ((z)a.zzb()).getClass();
      ((v5)localObject1).b(System.currentTimeMillis(), false);
    }
  }
}

/* Location:
 * Qualified Name:     e7.p5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */