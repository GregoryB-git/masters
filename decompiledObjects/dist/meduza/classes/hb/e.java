package hb;

import eb.k1;
import eb.o0;
import gb.d1.f;
import gb.e2;
import gb.e2.a;
import gb.e2.b;
import gb.h;
import gb.h.a;
import gb.h3.c;
import gb.j3;
import gb.m2;
import gb.o1;
import gb.r3;
import gb.r3.a;
import gb.v.a;
import gb.v0;
import gb.x;
import ib.a;
import ib.b.a;
import ib.k;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public final class e
  extends eb.v<e>
{
  public static final ib.b m;
  public static final long n;
  public static final j3 o;
  public final e2 a = new e2(paramString, new c(), new b());
  public r3.a b = r3.c;
  public j3 c = o;
  public j3 d = new j3(v0.q);
  public SSLSocketFactory e;
  public ib.b f = m;
  public int g = 1;
  public long h = Long.MAX_VALUE;
  public long i = v0.l;
  public int j = 65535;
  public int k = 4194304;
  public int l = Integer.MAX_VALUE;
  
  static
  {
    Logger.getLogger(e.class.getName());
    b.a locala = new b.a(ib.b.e);
    locala.a(new a[] { a.q, a.s, a.r, a.t, a.v, a.u });
    locala.b(new k[] { k.c });
    if (a)
    {
      d = true;
      m = new ib.b(locala);
      n = TimeUnit.DAYS.toNanos(1000L);
      o = new j3(new a());
      EnumSet.of(k1.a, k1.b);
      return;
    }
    throw new IllegalStateException("no TLS extensions for cleartext connections");
  }
  
  public e(String paramString) {}
  
  public final void b(TimeUnit paramTimeUnit)
  {
    long l1 = paramTimeUnit.toNanos(30L);
    h = l1;
    l1 = Math.max(l1, o1.l);
    h = l1;
    if (l1 >= n) {
      h = Long.MAX_VALUE;
    }
  }
  
  public final void c()
  {
    g = 2;
  }
  
  public final o0<?> d()
  {
    return a;
  }
  
  public final class a
    implements h3.c<Executor>
  {
    public final Object a()
    {
      return Executors.newCachedThreadPool(v0.d("grpc-okhttp-%d"));
    }
    
    public final void b(Object paramObject)
    {
      ((ExecutorService)paramObject).shutdown();
    }
  }
  
  public final class b
    implements e2.a
  {
    public b() {}
    
    public final int a()
    {
      e locale = e.this;
      int i = q0.g.c(g);
      if (i != 0)
      {
        if (i == 1)
        {
          i = 80;
        }
        else
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(g.p(g));
          localStringBuilder.append(" not handled");
          throw new AssertionError(localStringBuilder.toString());
        }
      }
      else {
        i = 443;
      }
      return i;
    }
  }
  
  public final class c
    implements e2.b
  {
    public c() {}
    
    public final e.d a()
    {
      e locale = e.this;
      boolean bool;
      if (h != Long.MAX_VALUE) {
        bool = true;
      } else {
        bool = false;
      }
      j3 localj31 = c;
      j3 localj32 = d;
      int i = q0.g.c(g);
      Object localObject;
      if (i != 0) {
        if (i == 1) {
          localObject = null;
        }
      }
      for (;;)
      {
        break label127;
        localObject = f.l("Unknown negotiation type: ");
        ((StringBuilder)localObject).append(g.p(g));
        throw new RuntimeException(((StringBuilder)localObject).toString());
        try
        {
          if (e == null) {
            e = SSLContext.getInstance("Default", da).getSocketFactory();
          }
          localObject = e;
        }
        catch (GeneralSecurityException localGeneralSecurityException)
        {
          label127:
          throw new RuntimeException("TLS Provider failure", localGeneralSecurityException);
        }
      }
      return new e.d(localj31, localj32, (SSLSocketFactory)localObject, f, k, bool, h, i, j, l, b);
    }
  }
  
  public static final class d
    implements gb.v
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
    
    public d(j3 paramj31, j3 paramj32, SSLSocketFactory paramSSLSocketFactory, ib.b paramb, int paramInt1, boolean paramBoolean, long paramLong1, long paramLong2, int paramInt2, int paramInt3, r3.a parama)
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
}

/* Location:
 * Qualified Name:     hb.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */