package gb;

import eb.e.a;
import eb.e1;
import eb.s0;
import java.util.ArrayList;
import java.util.List;

public final class d0$i<RespT>
  extends e.a<RespT>
{
  public final e.a<RespT> a;
  public volatile boolean b;
  public List<Runnable> c = new ArrayList();
  
  public d0$i(e.a<RespT> parama)
  {
    a = parama;
  }
  
  public final void a(s0 params0, e1 parame1)
  {
    e(new e0(this, parame1, params0));
  }
  
  public final void b(final s0 params0)
  {
    if (b) {
      a.b(params0);
    } else {
      e(new a(params0));
    }
  }
  
  public final void c(final RespT paramRespT)
  {
    if (b) {
      a.c(paramRespT);
    } else {
      e(new b(paramRespT));
    }
  }
  
  public final void d()
  {
    if (b) {
      a.d();
    } else {
      e(new c());
    }
  }
  
  public final void e(Runnable paramRunnable)
  {
    try
    {
      if (!b)
      {
        c.add(paramRunnable);
        return;
      }
      paramRunnable.run();
      return;
    }
    finally {}
  }
  
  public final class a
    implements Runnable
  {
    public a(s0 params0) {}
    
    public final void run()
    {
      a.b(params0);
    }
  }
  
  public final class b
    implements Runnable
  {
    public b(Object paramObject) {}
    
    public final void run()
    {
      a.c(paramRespT);
    }
  }
  
  public final class c
    implements Runnable
  {
    public c() {}
    
    public final void run()
    {
      a.d();
    }
  }
}

/* Location:
 * Qualified Name:     gb.d0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */