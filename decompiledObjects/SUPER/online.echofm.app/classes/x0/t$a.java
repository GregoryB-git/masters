package x0;

import d0.I;
import d0.I.b;
import d0.I.c;
import d0.u;
import g0.M;

public final class t$a
  extends p
{
  public static final Object h = new Object();
  public final Object f;
  public final Object g;
  
  public t$a(I paramI, Object paramObject1, Object paramObject2)
  {
    super(paramI);
    f = paramObject1;
    g = paramObject2;
  }
  
  public static a u(u paramu)
  {
    return new a(new t.b(paramu), I.c.q, h);
  }
  
  public static a v(I paramI, Object paramObject1, Object paramObject2)
  {
    return new a(paramI, paramObject1, paramObject2);
  }
  
  public int b(Object paramObject)
  {
    I localI = e;
    Object localObject1 = paramObject;
    if (h.equals(paramObject))
    {
      Object localObject2 = g;
      localObject1 = paramObject;
      if (localObject2 != null) {
        localObject1 = localObject2;
      }
    }
    return localI.b(localObject1);
  }
  
  public I.b g(int paramInt, I.b paramb, boolean paramBoolean)
  {
    e.g(paramInt, paramb, paramBoolean);
    if ((M.c(b, g)) && (paramBoolean)) {
      b = h;
    }
    return paramb;
  }
  
  public Object m(int paramInt)
  {
    Object localObject1 = e.m(paramInt);
    Object localObject2 = localObject1;
    if (M.c(localObject1, g)) {
      localObject2 = h;
    }
    return localObject2;
  }
  
  public I.c o(int paramInt, I.c paramc, long paramLong)
  {
    e.o(paramInt, paramc, paramLong);
    if (M.c(a, f)) {
      a = I.c.q;
    }
    return paramc;
  }
  
  public a t(I paramI)
  {
    return new a(paramI, f, g);
  }
}

/* Location:
 * Qualified Name:     x0.t.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */