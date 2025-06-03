package ub;

public final class h$b$a
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

/* Location:
 * Qualified Name:     ub.h.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */