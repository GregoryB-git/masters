package rc;

import dc.p;
import ub.h;
import ub.h.b;
import ub.h.c;

public final class k
  implements h
{
  public final Throwable a;
  
  public k(h paramh, Throwable paramThrowable)
  {
    a = paramThrowable;
    b = paramh;
  }
  
  public final <R> R fold(R paramR, p<? super R, ? super h.b, ? extends R> paramp)
  {
    return (R)b.fold(paramR, paramp);
  }
  
  public final <E extends h.b> E get(h.c<E> paramc)
  {
    return b.get(paramc);
  }
  
  public final h minusKey(h.c<?> paramc)
  {
    return b.minusKey(paramc);
  }
  
  public final h plus(h paramh)
  {
    return b.plus(paramh);
  }
}

/* Location:
 * Qualified Name:     rc.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */