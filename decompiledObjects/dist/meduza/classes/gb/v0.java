package gb;

import eb.c;
import eb.c.b;
import eb.e0;
import eb.e1;
import eb.e1.a;
import eb.f0;
import eb.h;
import eb.h.a;
import eb.h.b;
import eb.h0;
import eb.h0.a;
import eb.k0.f;
import eb.k0.i;
import eb.s0;
import eb.s0.b;
import eb.s0.c;
import eb.s0.f;
import eb.t0;
import f;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import n7.c.e;
import n7.o;
import n7.p;
import n7.q;
import x6.b;

public final class v0
{
  public static final Logger a = Logger.getLogger(v0.class.getName());
  public static final Set<e1.a> b = Collections.unmodifiableSet(EnumSet.of(e1.a.c, new e1.a[] { e1.a.f, e1.a.p, e1.a.q, e1.a.t, e1.a.u, e1.a.v, e1.a.z }));
  public static final s0.b c;
  public static final s0.b d;
  public static final s0.f e;
  public static final s0.b f;
  public static final s0.f g;
  public static final s0.b h;
  public static final s0.b i;
  public static final s0.b j;
  public static final s0.b k;
  public static final long l;
  public static final t2 m = new t2();
  public static final c.b<Boolean> n = new c.b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
  public static final a o = new a();
  public static final b p = new b();
  public static final c q = new c();
  public static final d r = new d();
  
  static
  {
    Charset.forName("US-ASCII");
    c = new s0.b("grpc-timeout", new h());
    Object localObject = s0.d;
    d = new s0.b("grpc-encoding", (s0.c)localObject);
    e = h0.a("grpc-accept-encoding", new f());
    f = new s0.b("content-encoding", (s0.c)localObject);
    g = h0.a("accept-encoding", new f());
    h = new s0.b("content-length", (s0.c)localObject);
    i = new s0.b("content-type", (s0.c)localObject);
    j = new s0.b("te", (s0.c)localObject);
    k = new s0.b("user-agent", (s0.c)localObject);
    o.a(',');
    c.e.c.getClass();
    localObject = TimeUnit.SECONDS;
    l = ((TimeUnit)localObject).toNanos(20L);
    TimeUnit.HOURS.toNanos(2L);
    ((TimeUnit)localObject).toNanos(20L);
  }
  
  public static URI a(String paramString)
  {
    b.y(paramString, "authority");
    try
    {
      URI localURI = new URI(null, paramString, null, null, null);
      return localURI;
    }
    catch (URISyntaxException localURISyntaxException)
    {
      throw new IllegalArgumentException(g.d("Invalid authority: ", paramString), localURISyntaxException);
    }
  }
  
  public static void b(Closeable paramCloseable)
  {
    if (paramCloseable == null) {
      return;
    }
    try
    {
      paramCloseable.close();
    }
    catch (IOException paramCloseable)
    {
      a.log(Level.WARNING, "exception caught in closeQuietly", paramCloseable);
    }
  }
  
  public static h[] c(c paramc, s0 params0, int paramInt, boolean paramBoolean)
  {
    List localList = g;
    int i1 = localList.size() + 1;
    h[] arrayOfh = new h[i1];
    c localc = c.k;
    paramc = new h.b(paramc, paramInt, paramBoolean);
    for (paramInt = 0; paramInt < localList.size(); paramInt++) {
      arrayOfh[paramInt] = ((h.a)localList.get(paramInt)).a(paramc, params0);
    }
    arrayOfh[(i1 - 1)] = o;
    return arrayOfh;
  }
  
  public static s7.g d(String paramString)
  {
    Boolean localBoolean = Boolean.TRUE;
    String.format(Locale.ROOT, paramString, new Object[] { Integer.valueOf(0) });
    return new s7.g(Executors.defaultThreadFactory(), paramString, new AtomicLong(0L), localBoolean);
  }
  
  public static u e(k0.f paramf, boolean paramBoolean)
  {
    final Object localObject = a;
    if (localObject != null) {
      localObject = ((q3)((k0.i)localObject).e()).a();
    } else {
      localObject = null;
    }
    if (localObject != null)
    {
      paramf = b;
      if (paramf == null) {
        return (u)localObject;
      }
      return new e((u)localObject);
    }
    if (!c.e())
    {
      if (d) {
        return new m0(g(c), t.a.c);
      }
      if (!paramBoolean) {
        return new m0(g(c), t.a.a);
      }
    }
    return null;
  }
  
  public static e1 f(int paramInt)
  {
    if (((paramInt < 100) || (paramInt >= 200)) && (paramInt != 400)) {
      if (paramInt != 401)
      {
        if (paramInt != 403)
        {
          if (paramInt != 404)
          {
            if (paramInt != 429)
            {
              if (paramInt != 431) {
                switch (paramInt)
                {
                default: 
                  localObject = e1.a.e;
                  break;
                }
              }
            }
            else
            {
              localObject = e1.a.y;
              break label123;
            }
          }
          else
          {
            localObject = e1.a.w;
            break label123;
          }
        }
        else
        {
          localObject = e1.a.r;
          break label123;
        }
      }
      else
      {
        localObject = e1.a.A;
        break label123;
      }
    }
    Object localObject = e1.a.x;
    label123:
    e1 locale1 = ((e1.a)localObject).f();
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("HTTP status code ");
    ((StringBuilder)localObject).append(paramInt);
    return locale1.g(((StringBuilder)localObject).toString());
  }
  
  public static e1 g(e1 parame1)
  {
    boolean bool;
    if (parame1 != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.t(bool);
    e1 locale1 = parame1;
    if (b.contains(a))
    {
      locale1 = e1.m;
      StringBuilder localStringBuilder = f.l("Inappropriate status code from control plane: ");
      localStringBuilder.append(a);
      localStringBuilder.append(" ");
      localStringBuilder.append(b);
      locale1 = locale1.g(localStringBuilder.toString()).f(c);
    }
    return locale1;
  }
  
  public final class a
    extends h
  {}
  
  public final class b
    implements h3.c<Executor>
  {
    public final Object a()
    {
      return Executors.newCachedThreadPool(v0.d("grpc-default-executor-%d"));
    }
    
    public final void b(Object paramObject)
    {
      ((ExecutorService)paramObject).shutdown();
    }
    
    public final String toString()
    {
      return "grpc-default-executor";
    }
  }
  
  public final class c
    implements h3.c<ScheduledExecutorService>
  {
    public final Object a()
    {
      ScheduledExecutorService localScheduledExecutorService = Executors.newScheduledThreadPool(1, v0.d("grpc-timer-%d"));
      try
      {
        try
        {
          localScheduledExecutorService.getClass().getMethod("setRemoveOnCancelPolicy", new Class[] { Boolean.TYPE }).invoke(localScheduledExecutorService, new Object[] { Boolean.TRUE });
        }
        catch (Exception localException)
        {
          throw new RuntimeException(localException);
        }
        catch (RuntimeException localRuntimeException)
        {
          throw localRuntimeException;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;) {}
      }
      return Executors.unconfigurableScheduledExecutorService(localRuntimeException);
    }
    
    public final void b(Object paramObject)
    {
      ((ScheduledExecutorService)paramObject).shutdown();
    }
  }
  
  public final class d
    implements q<p>
  {
    public final Object get()
    {
      return new p();
    }
  }
  
  public final class e
    implements u
  {
    public e(u paramu) {}
    
    public final s d(t0<?, ?> paramt0, s0 params0, c paramc, h[] paramArrayOfh)
    {
      Object localObject = c.k;
      b.y(paramc, "callOptions cannot be null");
      boolean bool = false;
      localObject = new h.b(paramc, 0, false);
      localObject = a((h.b)localObject, params0);
      if (paramArrayOfh[(paramArrayOfh.length - 1)] == v0.o) {
        bool = true;
      }
      b.I(bool, "lb tracer already assigned");
      paramArrayOfh[(paramArrayOfh.length - 1)] = localObject;
      return localObject.d(paramt0, params0, paramc, paramArrayOfh);
    }
    
    public final f0 f()
    {
      return localObject.f();
    }
  }
  
  public static final class f
    implements h0.a<byte[]>
  {
    public final byte[] a(Serializable paramSerializable)
    {
      return (byte[])paramSerializable;
    }
    
    public final Object b(byte[] paramArrayOfByte)
    {
      return paramArrayOfByte;
    }
  }
  
  public static enum g
  {
    public static final g[] d;
    public final int a;
    public final e1 b;
    
    static
    {
      Object localObject1 = e1.n;
      Object localObject2 = new g("NO_ERROR", 0, 0, (e1)localObject1);
      e1 locale1 = e1.m;
      g localg1 = new g("PROTOCOL_ERROR", 1, 1, locale1);
      g localg2 = new g("INTERNAL_ERROR", 2, 2, locale1);
      c = localg2;
      e = new g[] { localObject2, localg1, localg2, new g("FLOW_CONTROL_ERROR", 3, 3, locale1), new g("SETTINGS_TIMEOUT", 4, 4, locale1), new g("STREAM_CLOSED", 5, 5, locale1), new g("FRAME_SIZE_ERROR", 6, 6, locale1), new g("REFUSED_STREAM", 7, 7, (e1)localObject1), new g("CANCEL", 8, 8, e1.f), new g("COMPRESSION_ERROR", 9, 9, locale1), new g("CONNECT_ERROR", 10, 10, locale1), new g("ENHANCE_YOUR_CALM", 11, 11, e1.k.g("Bandwidth exhausted")), new g("INADEQUATE_SECURITY", 12, 12, e1.i.g("Permission denied as protocol is not secure enough to call")), new g("HTTP_1_1_REQUIRED", 13, 13, e1.g) };
      localObject1 = values();
      localObject2 = new g[(int)length1a + 1];
      int i = localObject1.length;
      for (int j = 0; j < i; j++)
      {
        locale1 = localObject1[j];
        localObject2[((int)a)] = locale1;
      }
      d = (g[])localObject2;
    }
    
    public g(int paramInt, e1 parame1)
    {
      a = paramInt;
      ??? = f.l("HTTP/2 error code: ");
      ((StringBuilder)???).append(name());
      String str = ((StringBuilder)???).toString();
      ??? = str;
      if (b != null) {
        ??? = g.f(g.g(str, " ("), b, ")");
      }
      b = parame1.g((String)???);
    }
  }
  
  public static final class h
    implements s0.c<Long>
  {
    public final String a(Serializable paramSerializable)
    {
      Object localObject = (Long)paramSerializable;
      TimeUnit localTimeUnit = TimeUnit.NANOSECONDS;
      if (((Long)localObject).longValue() >= 0L)
      {
        if (((Long)localObject).longValue() < 100000000L)
        {
          paramSerializable = new StringBuilder();
          paramSerializable.append(localObject);
          paramSerializable.append("n");
          paramSerializable = paramSerializable.toString();
        }
        else
        {
          if (((Long)localObject).longValue() < 100000000000L)
          {
            paramSerializable = new StringBuilder();
            paramSerializable.append(localTimeUnit.toMicros(((Long)localObject).longValue()));
            localObject = "u";
          }
          else if (((Long)localObject).longValue() < 100000000000000L)
          {
            paramSerializable = new StringBuilder();
            paramSerializable.append(localTimeUnit.toMillis(((Long)localObject).longValue()));
            localObject = "m";
          }
          else if (((Long)localObject).longValue() < 100000000000000000L)
          {
            paramSerializable = new StringBuilder();
            paramSerializable.append(localTimeUnit.toSeconds(((Long)localObject).longValue()));
            localObject = "S";
          }
          else if (((Long)localObject).longValue() < 6000000000000000000L)
          {
            paramSerializable = new StringBuilder();
            paramSerializable.append(localTimeUnit.toMinutes(((Long)localObject).longValue()));
            localObject = "M";
          }
          else
          {
            paramSerializable = new StringBuilder();
            paramSerializable.append(localTimeUnit.toHours(((Long)localObject).longValue()));
            localObject = "H";
          }
          paramSerializable.append((String)localObject);
          paramSerializable = paramSerializable.toString();
        }
        return paramSerializable;
      }
      throw new IllegalArgumentException("Timeout too small");
    }
    
    public final Object b(String paramString)
    {
      boolean bool;
      if (paramString.length() > 0) {
        bool = true;
      } else {
        bool = false;
      }
      b.s("empty timeout", bool);
      if (paramString.length() <= 9) {
        bool = true;
      } else {
        bool = false;
      }
      b.s("bad timeout format", bool);
      long l = Long.parseLong(paramString.substring(0, paramString.length() - 1));
      char c = paramString.charAt(paramString.length() - 1);
      if (c != 'H')
      {
        if (c != 'M')
        {
          if (c != 'S')
          {
            if (c != 'u')
            {
              if (c != 'm')
              {
                if (c == 'n') {
                  return Long.valueOf(l);
                }
                throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", new Object[] { Character.valueOf(c) }));
              }
              paramString = TimeUnit.MILLISECONDS;
            }
            else
            {
              paramString = TimeUnit.MICROSECONDS;
            }
          }
          else {
            paramString = TimeUnit.SECONDS;
          }
        }
        else {
          paramString = TimeUnit.MINUTES;
        }
      }
      else {
        paramString = TimeUnit.HOURS;
      }
      paramString = Long.valueOf(paramString.toNanos(l));
      return paramString;
    }
  }
}

/* Location:
 * Qualified Name:     gb.v0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */