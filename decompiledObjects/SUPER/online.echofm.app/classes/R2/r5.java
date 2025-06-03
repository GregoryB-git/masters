package R2;

import E2.e;
import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.G6;

public final class r5
{
  public long a;
  public long b;
  public final x c;
  
  public r5(l5 paraml5)
  {
    c = new u5(this, a);
    long l = paraml5.b().b();
    a = l;
    b = l;
  }
  
  public final long a(long paramLong)
  {
    long l = b;
    b = paramLong;
    return paramLong - l;
  }
  
  public final void b()
  {
    c.a();
    a = 0L;
    b = 0L;
  }
  
  public final boolean d(boolean paramBoolean1, boolean paramBoolean2, long paramLong)
  {
    d.n();
    d.v();
    if ((!G6.a()) || (!d.f().s(K.q0)) || (d.a.p())) {
      d.i().p.b(d.b().a());
    }
    long l = paramLong - a;
    if ((!paramBoolean1) && (l < 1000L))
    {
      d.j().K().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(l));
      return false;
    }
    if (!paramBoolean2) {
      l = a(paramLong);
    }
    d.j().K().b("Recording user engagement, ms", Long.valueOf(l));
    Bundle localBundle = new Bundle();
    localBundle.putLong("_et", l);
    paramBoolean1 = d.f().Q();
    S5.L(d.s().C(paramBoolean1 ^ true), localBundle, true);
    if (!paramBoolean2) {
      d.r().z0("auto", "_e", localBundle);
    }
    a = paramLong;
    c.a();
    c.b(3600000L);
    return true;
  }
  
  public final void e(long paramLong)
  {
    c.a();
  }
  
  public final void f(long paramLong)
  {
    d.n();
    c.a();
    a = paramLong;
    b = paramLong;
  }
}

/* Location:
 * Qualified Name:     R2.r5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */