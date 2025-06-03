package gb;

import eb.c;
import eb.e1;
import eb.h;
import eb.s0;
import eb.t0;

public final class d1$b
  extends p0
{
  public final x a;
  public final m b;
  
  public d1$b(x paramx, m paramm)
  {
    a = paramx;
    b = paramm;
  }
  
  public final x a()
  {
    return a;
  }
  
  public final s d(t0<?, ?> paramt0, s0 params0, c paramc, h[] paramArrayOfh)
  {
    return new a(a().d(paramt0, params0, paramc, paramArrayOfh));
  }
  
  public final class a
    extends n0
  {
    public a(s params) {}
    
    public final void l(final t paramt)
    {
      m localm = b;
      b.b();
      a.a();
      paramt = new a(paramt);
      a.l(paramt);
    }
    
    public final class a
      extends o0
    {
      public a(t paramt) {}
      
      public final void d(e1 parame1, t.a parama, s0 params0)
      {
        Object localObject = b;
        if (parame1.e()) {
          localObject = c;
        } else {
          localObject = d;
        }
        ((q1)localObject).b();
        paramt.d(parame1, parama, params0);
      }
    }
  }
}

/* Location:
 * Qualified Name:     gb.d1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */