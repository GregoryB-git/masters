package ub;

import dc.p;

public abstract interface h$b
  extends h
{
  public abstract <R> R fold(R paramR, p<? super R, ? super b, ? extends R> paramp);
  
  public abstract <E extends b> E get(h.c<E> paramc);
  
  public abstract h.c<?> getKey();
  
  public abstract h minusKey(h.c<?> paramc);
  
  public static final class a
  {
    public static <E extends h.b> E a(h.b paramb, h.c<E> paramc)
    {
      ec.i.e(paramc, "key");
      if (!ec.i.a(paramb.getKey(), paramc)) {
        paramb = null;
      }
      return paramb;
    }
    
    public static h b(h.b paramb, h.c<?> paramc)
    {
      ec.i.e(paramc, "key");
      Object localObject = paramb;
      if (ec.i.a(paramb.getKey(), paramc)) {
        localObject = i.a;
      }
      return (h)localObject;
    }
  }
}

/* Location:
 * Qualified Name:     ub.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */