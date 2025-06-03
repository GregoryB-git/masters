package T3;

import e4.d;
import e4.e;
import e4.g;
import java.io.EOFException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

public class q$e
  implements q.d, d
{
  public e4.c a;
  
  public q$e(q paramq, e4.c paramc)
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
      if (q.c(b).f()) {
        q.c(b).a("Error connecting", locale, new Object[0]);
      }
      g();
    }
  }
  
  public void b()
  {
    q.e(b).execute(new c());
  }
  
  public void c()
  {
    q.e(b).execute(new a());
  }
  
  public void close()
  {
    a.c();
  }
  
  public void d(final e parame)
  {
    q.e(b).execute(new d(parame));
  }
  
  public void e(String paramString)
  {
    a.p(paramString);
  }
  
  public void f(final g paramg)
  {
    paramg = paramg.a();
    if (q.c(b).f())
    {
      c4.c localc = q.c(b);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("ws message: ");
      localStringBuilder.append(paramg);
      localc.b(localStringBuilder.toString(), new Object[0]);
    }
    q.e(b).execute(new b(paramg));
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
      q.c(b).c("Interrupted while shutting down websocket threads", localInterruptedException);
    }
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      q.a(b).cancel(false);
      q.b(b, true);
      if (q.c(b).f()) {
        q.c(b).b("websocket opened", new Object[0]);
      }
      q.d(b);
    }
  }
  
  public class b
    implements Runnable
  {
    public b(String paramString) {}
    
    public void run()
    {
      q.f(b, paramg);
    }
  }
  
  public class c
    implements Runnable
  {
    public c() {}
    
    public void run()
    {
      if (q.c(b).f()) {
        q.c(b).b("closed", new Object[0]);
      }
      q.g(b);
    }
  }
  
  public class d
    implements Runnable
  {
    public d(e parame) {}
    
    public void run()
    {
      if ((parame.getCause() != null) && ((parame.getCause() instanceof EOFException))) {
        q.c(b).b("WebSocket reached EOF.", new Object[0]);
      } else {
        q.c(b).a("WebSocket error.", parame, new Object[0]);
      }
      q.g(b);
    }
  }
}

/* Location:
 * Qualified Name:     T3.q.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */