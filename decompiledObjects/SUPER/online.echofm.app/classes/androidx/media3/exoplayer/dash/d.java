package androidx.media3.exoplayer.dash;

import F0.T;
import F0.T.a;
import Q0.a;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import d0.A;
import d0.q;
import d0.x;
import g0.M;
import g0.z;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import k0.v0;
import x0.P;
import y0.e;

public final class d
  implements Handler.Callback
{
  public final B0.b o;
  public final b p;
  public final Q0.b q;
  public final Handler r;
  public final TreeMap s;
  public o0.c t;
  public long u;
  public boolean v;
  public boolean w;
  public boolean x;
  
  public d(o0.c paramc, b paramb, B0.b paramb1)
  {
    t = paramc;
    p = paramb;
    o = paramb1;
    s = new TreeMap();
    r = M.B(this);
    q = new Q0.b();
  }
  
  public static long f(a parama)
  {
    try
    {
      long l = M.Q0(M.H(s));
      return l;
    }
    catch (A parama) {}
    return -9223372036854775807L;
  }
  
  public static boolean h(String paramString1, String paramString2)
  {
    boolean bool;
    if (("urn:mpeg:dash:event:2012".equals(paramString1)) && (("1".equals(paramString2)) || ("2".equals(paramString2)) || ("3".equals(paramString2)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Map.Entry e(long paramLong)
  {
    return s.ceilingEntry(Long.valueOf(paramLong));
  }
  
  public final void g(long paramLong1, long paramLong2)
  {
    Long localLong = (Long)s.get(Long.valueOf(paramLong2));
    if (localLong == null) {}
    while (localLong.longValue() > paramLong1)
    {
      s.put(Long.valueOf(paramLong2), Long.valueOf(paramLong1));
      break;
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    if (x) {
      return true;
    }
    if (what != 1) {
      return false;
    }
    paramMessage = (a)obj;
    g(a, b);
    return true;
  }
  
  public final void i()
  {
    if (!v) {
      return;
    }
    w = true;
    v = false;
    p.a();
  }
  
  public boolean j(long paramLong)
  {
    Object localObject = t;
    boolean bool1 = d;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    if (w) {
      return true;
    }
    localObject = e(h);
    bool1 = bool2;
    if (localObject != null)
    {
      bool1 = bool2;
      if (((Long)((Map.Entry)localObject).getValue()).longValue() < paramLong)
      {
        u = ((Long)((Map.Entry)localObject).getKey()).longValue();
        l();
        bool1 = true;
      }
    }
    if (bool1) {
      i();
    }
    return bool1;
  }
  
  public c k()
  {
    return new c(o);
  }
  
  public final void l()
  {
    p.b(u);
  }
  
  public void m(e parame)
  {
    v = true;
  }
  
  public boolean n(boolean paramBoolean)
  {
    if (!t.d) {
      return false;
    }
    if (w) {
      return true;
    }
    if (paramBoolean)
    {
      i();
      return true;
    }
    return false;
  }
  
  public void o()
  {
    x = true;
    r.removeCallbacksAndMessages(null);
  }
  
  public final void p()
  {
    Iterator localIterator = s.entrySet().iterator();
    while (localIterator.hasNext()) {
      if (((Long)((Map.Entry)localIterator.next()).getKey()).longValue() < t.h) {
        localIterator.remove();
      }
    }
  }
  
  public void q(o0.c paramc)
  {
    w = false;
    u = -9223372036854775807L;
    t = paramc;
    p();
  }
  
  public static final class a
  {
    public final long a;
    public final long b;
    
    public a(long paramLong1, long paramLong2)
    {
      a = paramLong1;
      b = paramLong2;
    }
  }
  
  public static abstract interface b
  {
    public abstract void a();
    
    public abstract void b(long paramLong);
  }
  
  public final class c
    implements T
  {
    public final P a;
    public final v0 b;
    public final O0.b c;
    public long d;
    
    public c(B0.b paramb)
    {
      a = P.l(paramb);
      b = new v0();
      c = new O0.b();
      d = -9223372036854775807L;
    }
    
    public void a(z paramz, int paramInt1, int paramInt2)
    {
      a.e(paramz, paramInt1);
    }
    
    public void b(long paramLong, int paramInt1, int paramInt2, int paramInt3, T.a parama)
    {
      a.b(paramLong, paramInt1, paramInt2, paramInt3, parama);
      l();
    }
    
    public int c(d0.i parami, int paramInt1, boolean paramBoolean, int paramInt2)
    {
      return a.f(parami, paramInt1, paramBoolean);
    }
    
    public void d(q paramq)
    {
      a.d(paramq);
    }
    
    public final O0.b g()
    {
      c.m();
      if (a.T(b, c, 0, false) == -4)
      {
        c.C();
        return c;
      }
      return null;
    }
    
    public boolean h(long paramLong)
    {
      return j(paramLong);
    }
    
    public void i(e parame)
    {
      long l = d;
      if ((l == -9223372036854775807L) || (h > l)) {
        d = h;
      }
      m(parame);
    }
    
    public boolean j(e parame)
    {
      long l = d;
      boolean bool;
      if ((l != -9223372036854775807L) && (l < g)) {
        bool = true;
      } else {
        bool = false;
      }
      return n(bool);
    }
    
    public final void k(long paramLong1, long paramLong2)
    {
      d.a locala = new d.a(paramLong1, paramLong2);
      d.d(d.this).sendMessage(d.d(d.this).obtainMessage(1, locala));
    }
    
    public final void l()
    {
      while (a.L(false))
      {
        Object localObject = g();
        if (localObject != null)
        {
          long l = t;
          localObject = d.a(d.this).a((O0.b)localObject);
          if (localObject != null)
          {
            localObject = (a)((x)localObject).d(0);
            if (d.b(o, p)) {
              m(l, (a)localObject);
            }
          }
        }
      }
      a.s();
    }
    
    public final void m(long paramLong, a parama)
    {
      long l = d.c(parama);
      if (l == -9223372036854775807L) {
        return;
      }
      k(paramLong, l);
    }
    
    public void n()
    {
      a.U();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.dash.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */