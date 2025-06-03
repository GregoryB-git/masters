package ub;

import dc.p;

public abstract interface h
{
  public abstract <R> R fold(R paramR, p<? super R, ? super b, ? extends R> paramp);
  
  public abstract <E extends b> E get(c<E> paramc);
  
  public abstract h minusKey(c<?> paramc);
  
  public abstract h plus(h paramh);
  
  public static final class a
  {
    public static h a(h paramh1, h paramh2)
    {
      ec.i.e(paramh2, "context");
      if (paramh2 != i.a) {
        paramh1 = (h)paramh2.fold(paramh1, new g());
      }
      return paramh1;
    }
  }
  
  public static abstract interface b
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
  
  public static abstract interface c<E extends h.b> {}
}

/* Location:
 * Qualified Name:     ub.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */