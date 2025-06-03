package e7;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.SystemClock;
import b.z;
import d2.q;

public final class t5
{
  public long a;
  public long b;
  public final s5 c;
  
  public t5(q5 paramq5)
  {
    c = new s5(this, (j2)b, 0);
    ((z)paramq5.zzb()).getClass();
    long l = SystemClock.elapsedRealtime();
    a = l;
    b = l;
  }
  
  public final boolean a(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    d.l();
    d.t();
    if (((j2)d.b).d())
    {
      localObject = d.j().z;
      ((z)d.zzb()).getClass();
      ((q1)localObject).b(System.currentTimeMillis());
    }
    long l = paramLong - a;
    if ((!paramBoolean1) && (l < 1000L))
    {
      d.zzj().w.c("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(l));
      return false;
    }
    if (!paramBoolean2)
    {
      l = paramLong - b;
      b = paramLong;
    }
    d.zzj().w.c("Recording user engagement, ms", Long.valueOf(l));
    Object localObject = new Bundle();
    ((BaseBundle)localObject).putLong("_et", l);
    paramBoolean1 = d.h().A();
    r6.L(d.p().v(paramBoolean1 ^ true), (Bundle)localObject, true);
    if (!paramBoolean2) {
      d.o().Q("auto", "_e", (Bundle)localObject);
    }
    a = paramLong;
    c.a();
    c.b(((Long)h0.l0.a(null)).longValue());
    return true;
  }
}

/* Location:
 * Qualified Name:     e7.t5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */