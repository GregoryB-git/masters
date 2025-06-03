package gb;

import eb.d;
import eb.d.a;
import eb.h1;
import eb.k0.b;
import eb.k0.e;
import eb.k0.i;
import eb.k0.j;
import java.util.concurrent.ScheduledExecutorService;
import x6.b;

public final class r1$k
  extends k0.e
{
  public i.a a;
  
  public r1$k(r1 paramr1) {}
  
  public final k0.i a(k0.b paramb)
  {
    b.n.d();
    b.I(b.J ^ true, "Channel is being terminated");
    return new r1.o(b, paramb);
  }
  
  public final d b()
  {
    return b.P;
  }
  
  public final ScheduledExecutorService c()
  {
    return b.h;
  }
  
  public final h1 d()
  {
    return b.n;
  }
  
  public final void e()
  {
    b.n.d();
    b.n.execute(new a());
  }
  
  public final void f(final eb.n paramn, final k0.j paramj)
  {
    b.n.d();
    b.y(paramn, "newState");
    b.y(paramj, "newPicker");
    b.n.execute(new b(paramj, paramn));
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      r1 localr1 = b;
      n.d();
      if (x) {
        w.b();
      }
    }
  }
  
  public final class b
    implements Runnable
  {
    public final void run()
    {
      Object localObject1 = c;
      Object localObject2 = b;
      if (localObject1 != y) {
        return;
      }
      localObject1 = paramj;
      z = ((k0.j)localObject1);
      F.i((k0.j)localObject1);
      localObject2 = paramn;
      if (localObject2 != eb.n.e)
      {
        c.b.P.b(d.a.b, "Entering {0} state with picker: {1}", new Object[] { localObject2, paramj });
        c.b.s.a(paramn);
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.r1.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */