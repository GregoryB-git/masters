package L4;

import M4.c;
import M4.o;
import N4.h;
import N4.k;
import N4.m;
import android.content.Context;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public final class d
{
  public final C4.a a;
  public final double b;
  public final double c;
  public a d = null;
  public a e = null;
  public boolean f;
  
  public d(M4.i parami, long paramLong, M4.a parama, double paramDouble1, double paramDouble2, C4.a parama1)
  {
    boolean bool1 = false;
    f = false;
    if ((0.0D <= paramDouble1) && (paramDouble1 < 1.0D)) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    o.a(bool2, "Sampling bucket ID should be in range [0.0, 1.0).");
    boolean bool2 = bool1;
    if (0.0D <= paramDouble2)
    {
      bool2 = bool1;
      if (paramDouble2 < 1.0D) {
        bool2 = true;
      }
    }
    o.a(bool2, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
    b = paramDouble1;
    c = paramDouble2;
    a = parama1;
    d = new a(parami, paramLong, parama, parama1, "Trace", f);
    e = new a(parami, paramLong, parama, parama1, "Network", f);
  }
  
  public d(Context paramContext, M4.i parami, long paramLong)
  {
    this(parami, paramLong, new M4.a(), b(), b(), C4.a.g());
    f = o.b(paramContext);
  }
  
  public static double b()
  {
    return new Random().nextDouble();
  }
  
  public void a(boolean paramBoolean)
  {
    d.a(paramBoolean);
    e.a(paramBoolean);
  }
  
  public final boolean c(List paramList)
  {
    int i = paramList.size();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i > 0)
    {
      bool2 = bool1;
      if (((k)paramList.get(0)).Z() > 0)
      {
        bool2 = bool1;
        if (((k)paramList.get(0)).Y(0) == N4.l.q) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final boolean d()
  {
    double d1 = a.f();
    boolean bool;
    if (c < d1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean e()
  {
    double d1 = a.s();
    boolean bool;
    if (b < d1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean f()
  {
    double d1 = a.G();
    boolean bool;
    if (b < d1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean g(N4.i parami)
  {
    if (!j(parami)) {
      return false;
    }
    if (parami.o()) {
      return e.b(parami) ^ true;
    }
    if (parami.l()) {
      return d.b(parami) ^ true;
    }
    return true;
  }
  
  public boolean h(N4.i parami)
  {
    if ((parami.l()) && (!f()) && (!c(parami.n().s0()))) {
      return false;
    }
    if ((i(parami)) && (!d()) && (!c(parami.n().s0()))) {
      return false;
    }
    return (!parami.o()) || (e()) || (c(parami.p().q0()));
  }
  
  public boolean i(N4.i parami)
  {
    boolean bool;
    if ((parami.l()) && (parami.n().r0().startsWith("_st_")) && (parami.n().h0("Hosting_activity"))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean j(N4.i parami)
  {
    if ((parami.l()) && ((parami.n().r0().equals(c.t.toString())) || (parami.n().r0().equals(c.u.toString()))) && (parami.n().k0() > 0)) {
      return false;
    }
    return !parami.f();
  }
  
  public static class a
  {
    public static final F4.a k = ;
    public static final long l = TimeUnit.SECONDS.toMicros(1L);
    public final M4.a a;
    public final boolean b;
    public M4.l c;
    public M4.i d;
    public long e;
    public double f;
    public M4.i g;
    public M4.i h;
    public long i;
    public long j;
    
    public a(M4.i parami, long paramLong, M4.a parama, C4.a parama1, String paramString, boolean paramBoolean)
    {
      a = parama;
      e = paramLong;
      d = parami;
      f = paramLong;
      c = parama.a();
      g(parama1, paramString, paramBoolean);
      b = paramBoolean;
    }
    
    public static long c(C4.a parama, String paramString)
    {
      if (paramString == "Trace") {
        return parama.E();
      }
      return parama.q();
    }
    
    public static long d(C4.a parama, String paramString)
    {
      if (paramString == "Trace") {
        return parama.t();
      }
      return parama.t();
    }
    
    public static long e(C4.a parama, String paramString)
    {
      if (paramString == "Trace") {
        return parama.F();
      }
      return parama.r();
    }
    
    public static long f(C4.a parama, String paramString)
    {
      if (paramString == "Trace") {
        return parama.t();
      }
      return parama.t();
    }
    
    public void a(boolean paramBoolean)
    {
      M4.i locali2;
      if (paramBoolean) {
        try
        {
          M4.i locali1 = g;
        }
        finally
        {
          break label53;
        }
      } else {
        locali2 = h;
      }
      d = locali2;
      long l1;
      if (paramBoolean) {
        l1 = i;
      } else {
        l1 = j;
      }
      e = l1;
      return;
      label53:
      throw locali2;
    }
    
    public boolean b(N4.i parami)
    {
      try
      {
        parami = a.a();
        d1 = c.d(parami) * d.a() / l;
        if (d1 > 0.0D)
        {
          f = Math.min(f + d1, e);
          c = parami;
        }
      }
      finally
      {
        break label110;
      }
      double d1 = f;
      if (d1 >= 1.0D)
      {
        f = (d1 - 1.0D);
        return true;
      }
      if (b) {
        k.j("Exceeded log rate limit, dropping the log.");
      }
      return false;
      label110:
      throw parami;
    }
    
    public final void g(C4.a parama, String paramString, boolean paramBoolean)
    {
      long l1 = f(parama, paramString);
      long l2 = e(parama, paramString);
      TimeUnit localTimeUnit = TimeUnit.SECONDS;
      M4.i locali = new M4.i(l2, l1, localTimeUnit);
      g = locali;
      i = l2;
      if (paramBoolean) {
        k.b("Foreground %s logging rate:%f, burst capacity:%d", new Object[] { paramString, locali, Long.valueOf(l2) });
      }
      l1 = d(parama, paramString);
      l2 = c(parama, paramString);
      parama = new M4.i(l2, l1, localTimeUnit);
      h = parama;
      j = l2;
      if (paramBoolean) {
        k.b("Background %s logging rate:%f, capacity:%d", new Object[] { paramString, parama, Long.valueOf(l2) });
      }
    }
  }
}

/* Location:
 * Qualified Name:     L4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */