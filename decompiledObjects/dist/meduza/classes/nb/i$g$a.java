package nb;

import eb.e1;
import eb.h;
import eb.h.a;
import eb.h.b;
import eb.s0;
import java.util.concurrent.atomic.AtomicLong;
import m.e;

public final class i$g$a
  extends h.a
{
  public final i.a a;
  public final h.a b;
  
  public i$g$a(i.a parama, h.a parama1)
  {
    a = parama;
    b = parama1;
  }
  
  public final h a(h.b paramb, s0 params0)
  {
    h.a locala = b;
    if (locala != null) {
      return new a(locala.a(paramb, params0));
    }
    return new b();
  }
  
  public final class a
    extends a
  {
    public a(h paramh) {}
    
    public final void o(e1 parame1)
    {
      i.a locala = a;
      boolean bool = parame1.e();
      Object localObject = a;
      if ((e != null) || (f != null))
      {
        localObject = b;
        if (bool) {
          localObject = a;
        } else {
          localObject = b;
        }
        ((AtomicLong)localObject).getAndIncrement();
      }
      c.o(parame1);
    }
  }
  
  public final class b
    extends h
  {
    public b() {}
    
    public final void o(e1 parame1)
    {
      i.a locala = a;
      boolean bool = parame1.e();
      parame1 = a;
      if ((e != null) || (f != null))
      {
        if (bool) {
          parame1 = b.a;
        } else {
          parame1 = b.b;
        }
        parame1.getAndIncrement();
      }
    }
  }
}

/* Location:
 * Qualified Name:     nb.i.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */