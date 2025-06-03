package ub;

import dc.p;
import java.io.Serializable;

public final class i
  implements h, Serializable
{
  public static final i a = new i();
  
  public final <R> R fold(R paramR, p<? super R, ? super h.b, ? extends R> paramp)
  {
    ec.i.e(paramp, "operation");
    return paramR;
  }
  
  public final <E extends h.b> E get(h.c<E> paramc)
  {
    ec.i.e(paramc, "key");
    return null;
  }
  
  public final int hashCode()
  {
    return 0;
  }
  
  public final h minusKey(h.c<?> paramc)
  {
    ec.i.e(paramc, "key");
    return this;
  }
  
  public final h plus(h paramh)
  {
    ec.i.e(paramh, "context");
    return paramh;
  }
  
  public final String toString()
  {
    return "EmptyCoroutineContext";
  }
}

/* Location:
 * Qualified Name:     ub.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */