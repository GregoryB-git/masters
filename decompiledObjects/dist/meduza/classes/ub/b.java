package ub;

import dc.l;

public abstract class b<B extends h.b, E extends B>
  implements h.c<E>
{
  public final l<h.b, E> a;
  public final h.c<?> b;
  
  public b(h.c<B> paramc, l<? super h.b, ? extends E> paraml)
  {
    a = paraml;
    paraml = paramc;
    if ((paramc instanceof b)) {
      paraml = b;
    }
    b = paraml;
  }
}

/* Location:
 * Qualified Name:     ub.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */