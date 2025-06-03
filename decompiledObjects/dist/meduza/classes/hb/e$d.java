package hb;

import gb.d1.f;
import gb.h;
import gb.h.a;
import gb.j3;
import gb.m2;
import gb.r3.a;
import gb.v;
import gb.v.a;
import gb.x;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class e$d
  implements v
{
  public final m2<Executor> a;
  public final Executor b;
  public final m2<ScheduledExecutorService> c;
  public final ScheduledExecutorService d;
  public final r3.a e;
  public final SocketFactory f;
  public final SSLSocketFactory o;
  public final HostnameVerifier p;
  public final ib.b q;
  public final int r;
  public final boolean s;
  public final h t;
  public final long u;
  public final int v;
  public final boolean w;
  public final int x;
  public final boolean y;
  public boolean z;
  
  public e$d(j3 paramj31, j3 paramj32, SSLSocketFactory paramSSLSocketFactory, ib.b paramb, int paramInt1, boolean paramBoolean, long paramLong1, long paramLong2, int paramInt2, int paramInt3, r3.a parama)
  {
    a = paramj31;
    b = ((Executor)paramj31.b());
    c = paramj32;
    d = ((ScheduledExecutorService)paramj32.b());
    f = null;
    o = paramSSLSocketFactory;
    p = null;
    q = paramb;
    r = paramInt1;
    s = paramBoolean;
    t = new h(paramLong1);
    u = paramLong2;
    v = paramInt2;
    w = false;
    x = paramInt3;
    y = false;
    x6.b.y(parama, "transportTracerFactory");
    e = parama;
  }
  
  public final x W(SocketAddress paramSocketAddress, v.a parama, d1.f paramf)
  {
    if (!z)
    {
      paramf = t;
      long l1 = b.get();
      paramf = new f(new h.a(paramf, l1));
      paramSocketAddress = new i(this, (InetSocketAddress)paramSocketAddress, a, c, b, d, paramf);
      if (s)
      {
        long l2 = u;
        boolean bool = w;
        H = true;
        I = l1;
        J = l2;
        K = bool;
      }
      return paramSocketAddress;
    }
    throw new IllegalStateException("The transport factory is closed.");
  }
  
  public final void close()
  {
    if (z) {
      return;
    }
    z = true;
    a.a(b);
    c.a(d);
  }
  
  public final ScheduledExecutorService p0()
  {
    return d;
  }
  
  public final Collection<Class<? extends SocketAddress>> y0()
  {
    return Collections.singleton(InetSocketAddress.class);
  }
}

/* Location:
 * Qualified Name:     hb.e.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */