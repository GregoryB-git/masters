package gb;

import eb.e1;
import eb.s0;
import java.util.ArrayList;
import java.util.List;

public final class g0$n
  implements t
{
  public final t a;
  public volatile boolean b;
  public List<Runnable> c = new ArrayList();
  
  public g0$n(t paramt)
  {
    a = paramt;
  }
  
  public final void a(final n3.a parama)
  {
    if (b) {
      a.a(parama);
    } else {
      e(new a(parama));
    }
  }
  
  public final void b(final s0 params0)
  {
    e(new c(params0));
  }
  
  public final void c()
  {
    if (b) {
      a.c();
    } else {
      e(new b());
    }
  }
  
  public final void d(final e1 parame1, final t.a parama, final s0 params0)
  {
    e(new d(parame1, parama, params0));
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
    public a(n3.a parama) {}
    
    public final void run()
    {
      a.a(parama);
    }
  }
  
  public final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      a.c();
    }
  }
  
  public final class c
    implements Runnable
  {
    public c(s0 params0) {}
    
    public final void run()
    {
      a.b(params0);
    }
  }
  
  public final class d
    implements Runnable
  {
    public d(e1 parame1, t.a parama, s0 params0) {}
    
    public final void run()
    {
      a.d(parame1, parama, params0);
    }
  }
}

/* Location:
 * Qualified Name:     gb.g0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */