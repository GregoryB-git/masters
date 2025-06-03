package ub;

import dc.p;
import ec.i;

public abstract class a
  implements h.b
{
  public final h.c<?> a;
  
  public a(h.c<?> paramc)
  {
    a = paramc;
  }
  
  public final <R> R fold(R paramR, p<? super R, ? super h.b, ? extends R> paramp)
  {
    i.e(paramp, "operation");
    return (R)paramp.invoke(paramR, this);
  }
  
  public <E extends h.b> E get(h.c<E> paramc)
  {
    return h.b.a.a(this, paramc);
  }
  
  public final h.c<?> getKey()
  {
    return a;
  }
  
  public h minusKey(h.c<?> paramc)
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
 * Qualified Name:     ub.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */