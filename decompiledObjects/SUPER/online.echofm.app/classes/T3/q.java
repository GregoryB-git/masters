package T3;

import e4.d;
import e4.e;
import e4.g;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class q
{
  public static long l;
  public d a;
  public boolean b = false;
  public boolean c = false;
  public long d = 0L;
  public U3.b e;
  public c f;
  public ScheduledFuture g;
  public ScheduledFuture h;
  public final c i;
  public final ScheduledExecutorService j;
  public final c4.c k;
  
  public q(c paramc, f paramf, String paramString1, String paramString2, c paramc1, String paramString3)
  {
    i = paramc;
    j = paramc.e();
    f = paramc1;
    long l1 = l;
    l = 1L + l1;
    paramc = paramc.f();
    paramc1 = new StringBuilder();
    paramc1.append("ws_");
    paramc1.append(l1);
    k = new c4.c(paramc, "WebSocket", paramc1.toString());
    a = m(paramf, paramString1, paramString2, paramString3);
  }
  
  public static String[] x(String paramString, int paramInt)
  {
    if (paramString.length() <= paramInt) {
      return new String[] { paramString };
    }
    ArrayList localArrayList = new ArrayList();
    int n;
    for (int m = 0; m < paramString.length(); m = n)
    {
      n = m + paramInt;
      localArrayList.add(paramString.substring(m, Math.min(n, paramString.length())));
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }
  
  public final void j(String paramString)
  {
    e.a(paramString);
    long l1 = d - 1L;
    d = l1;
    if (l1 == 0L)
    {
      try
      {
        e.i();
        Map localMap = f4.b.a(e.toString());
        e = null;
        if (k.f())
        {
          paramString = k;
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("handleIncomingFrame complete frame: ");
          localStringBuilder.append(localMap);
          paramString.b(localStringBuilder.toString(), new Object[0]);
        }
      }
      catch (ClassCastException localClassCastException)
      {
        break label131;
      }
      catch (IOException localIOException)
      {
        break label192;
      }
      f.a(localIOException);
      return;
      label131:
      c4.c localc = k;
      StringBuilder localStringBuilder = new StringBuilder();
      for (paramString = "Error parsing frame (cast error): ";; paramString = "Error parsing frame: ")
      {
        localStringBuilder.append(paramString);
        localStringBuilder.append(e.toString());
        localc.c(localStringBuilder.toString(), localIOException);
        k();
        w();
        break;
        label192:
        localc = k;
        localStringBuilder = new StringBuilder();
      }
    }
  }
  
  public void k()
  {
    if (k.f()) {
      k.b("websocket is being closed", new Object[0]);
    }
    c = true;
    a.close();
    ScheduledFuture localScheduledFuture = h;
    if (localScheduledFuture != null) {
      localScheduledFuture.cancel(true);
    }
    localScheduledFuture = g;
    if (localScheduledFuture != null) {
      localScheduledFuture.cancel(true);
    }
  }
  
  public final void l()
  {
    if ((!b) && (!c))
    {
      if (k.f()) {
        k.b("timed out on connect", new Object[0]);
      }
      a.close();
    }
  }
  
  public final d m(f paramf, String paramString1, String paramString2, String paramString3)
  {
    if (paramString1 == null) {
      paramString1 = paramf.b();
    }
    paramString1 = f.a(paramString1, paramf.d(), paramf.c(), paramString3);
    paramf = new HashMap();
    paramf.put("User-Agent", i.h());
    paramf.put("X-Firebase-GMPID", i.b());
    paramf.put("X-Firebase-AppCheck", paramString2);
    return new e(new e4.c(i, paramString1, null, paramf), null);
  }
  
  public final String n(String paramString)
  {
    if (paramString.length() <= 6) {}
    try
    {
      int m = Integer.parseInt(paramString);
      if (m > 0) {
        p(m);
      }
      return null;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
    p(1);
    return paramString;
  }
  
  public final void o(String paramString)
  {
    if (!c)
    {
      u();
      if (q()) {}
      do
      {
        j(paramString);
        break;
        paramString = n(paramString);
      } while (paramString != null);
    }
  }
  
  public final void p(int paramInt)
  {
    d = paramInt;
    e = new U3.b();
    if (k.f())
    {
      c4.c localc = k;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("HandleNewFrameCount: ");
      localStringBuilder.append(d);
      localc.b(localStringBuilder.toString(), new Object[0]);
    }
  }
  
  public final boolean q()
  {
    boolean bool;
    if (e != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Runnable r()
  {
    return new b();
  }
  
  public final void s()
  {
    if (!c)
    {
      if (k.f()) {
        k.b("closing itself", new Object[0]);
      }
      w();
    }
    a = null;
    ScheduledFuture localScheduledFuture = g;
    if (localScheduledFuture != null) {
      localScheduledFuture.cancel(false);
    }
  }
  
  public void t()
  {
    a.a();
    h = j.schedule(new a(), 30000L, TimeUnit.MILLISECONDS);
  }
  
  public final void u()
  {
    if (!c)
    {
      Object localObject = g;
      if (localObject != null)
      {
        ((Future)localObject).cancel(false);
        if (k.f())
        {
          localObject = k;
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Reset keepAlive. Remaining: ");
          localStringBuilder.append(g.getDelay(TimeUnit.MILLISECONDS));
          ((c4.c)localObject).b(localStringBuilder.toString(), new Object[0]);
        }
      }
      else if (k.f())
      {
        k.b("Reset keepAlive", new Object[0]);
      }
      g = j.schedule(r(), 45000L, TimeUnit.MILLISECONDS);
    }
  }
  
  public void v(Map paramMap)
  {
    u();
    Object localObject;
    StringBuilder localStringBuilder;
    try
    {
      String[] arrayOfString = x(f4.b.c(paramMap), 16384);
      if (arrayOfString.length > 1)
      {
        localObject = a;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("");
        localStringBuilder.append(arrayOfString.length);
        ((d)localObject).e(localStringBuilder.toString());
      }
    }
    catch (IOException localIOException)
    {
      break label100;
    }
    int m = 0;
    while (m < localIOException.length)
    {
      a.e(localIOException[m]);
      m++;
      continue;
      label100:
      localObject = k;
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Failed to serialize message: ");
      localStringBuilder.append(paramMap.toString());
      ((c4.c)localObject).c(localStringBuilder.toString(), localIOException);
      w();
    }
  }
  
  public final void w()
  {
    c = true;
    f.b(b);
  }
  
  public void y() {}
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      q.h(q.this);
    }
  }
  
  public class b
    implements Runnable
  {
    public b() {}
    
    public void run()
    {
      if (q.i(q.this) != null)
      {
        q.i(q.this).e("0");
        q.d(q.this);
      }
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(Map paramMap);
    
    public abstract void b(boolean paramBoolean);
  }
  
  public static abstract interface d
  {
    public abstract void a();
    
    public abstract void close();
    
    public abstract void e(String paramString);
  }
  
  public class e
    implements q.d, d
  {
    public e4.c a;
    
    public e(e4.c paramc)
    {
      a = paramc;
      paramc.r(this);
    }
    
    public void a()
    {
      try
      {
        a.e();
      }
      catch (e locale)
      {
        if (q.c(q.this).f()) {
          q.c(q.this).a("Error connecting", locale, new Object[0]);
        }
        g();
      }
    }
    
    public void b()
    {
      q.e(q.this).execute(new c());
    }
    
    public void c()
    {
      q.e(q.this).execute(new a());
    }
    
    public void close()
    {
      a.c();
    }
    
    public void d(final e parame)
    {
      q.e(q.this).execute(new d(parame));
    }
    
    public void e(String paramString)
    {
      a.p(paramString);
    }
    
    public void f(final g paramg)
    {
      paramg = paramg.a();
      if (q.c(q.this).f())
      {
        c4.c localc = q.c(q.this);
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("ws message: ");
        localStringBuilder.append(paramg);
        localc.b(localStringBuilder.toString(), new Object[0]);
      }
      q.e(q.this).execute(new b(paramg));
    }
    
    public final void g()
    {
      a.c();
      try
      {
        a.b();
      }
      catch (InterruptedException localInterruptedException)
      {
        q.c(q.this).c("Interrupted while shutting down websocket threads", localInterruptedException);
      }
    }
    
    public class a
      implements Runnable
    {
      public a() {}
      
      public void run()
      {
        q.a(q.this).cancel(false);
        q.b(q.this, true);
        if (q.c(q.this).f()) {
          q.c(q.this).b("websocket opened", new Object[0]);
        }
        q.d(q.this);
      }
    }
    
    public class b
      implements Runnable
    {
      public b(String paramString) {}
      
      public void run()
      {
        q.f(q.this, paramg);
      }
    }
    
    public class c
      implements Runnable
    {
      public c() {}
      
      public void run()
      {
        if (q.c(q.this).f()) {
          q.c(q.this).b("closed", new Object[0]);
        }
        q.g(q.this);
      }
    }
    
    public class d
      implements Runnable
    {
      public d(e parame) {}
      
      public void run()
      {
        if ((parame.getCause() != null) && ((parame.getCause() instanceof EOFException))) {
          q.c(q.this).b("WebSocket reached EOF.", new Object[0]);
        } else {
          q.c(q.this).a("WebSocket error.", parame, new Object[0]);
        }
        q.g(q.this);
      }
    }
  }
}

/* Location:
 * Qualified Name:     T3.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */