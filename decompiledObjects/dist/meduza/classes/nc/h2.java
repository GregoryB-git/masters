package nc;

import dc.p;
import ec.i;
import ub.h;
import ub.h.a;
import ub.h.b;
import ub.h.b.a;
import ub.h.c;

public final class h2
  implements h.b, h.c<h2>
{
  public static final h2 a = new h2();
  
  public final <R> R fold(R paramR, p<? super R, ? super h.b, ? extends R> paramp)
  {
    i.e(paramp, "operation");
    return (R)paramp.invoke(paramR, this);
  }
  
  public final <E extends h.b> E get(h.c<E> paramc)
  {
    return h.b.a.a(this, paramc);
  }
  
  public final h.c<?> getKey()
  {
    return this;
  }
  
  public final h minusKey(h.c<?> paramc)
  {
    return h.b.a.b(this, paramc);
  }
  
  public final h plus(h paramh)
  {
    i.e(paramh, "context");
    return h.a.a(this, paramh);
  }
}

/* Location:
 * Qualified Name:     nc.h2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */