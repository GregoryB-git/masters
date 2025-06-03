package z4;

import v3.r1;
import v3.r1.b;
import v3.r1.c;
import v5.e0;

public final class p$a
  extends l
{
  public static final Object e = new Object();
  public final Object c;
  public final Object d;
  
  public p$a(r1 paramr1, Object paramObject1, Object paramObject2)
  {
    super(paramr1);
    c = paramObject1;
    d = paramObject2;
  }
  
  public final int b(Object paramObject)
  {
    r1 localr1 = b;
    Object localObject1 = paramObject;
    if (e.equals(paramObject))
    {
      Object localObject2 = d;
      localObject1 = paramObject;
      if (localObject2 != null) {
        localObject1 = localObject2;
      }
    }
    return localr1.b(localObject1);
  }
  
  public final r1.b f(int paramInt, r1.b paramb, boolean paramBoolean)
  {
    b.f(paramInt, paramb, paramBoolean);
    if ((e0.a(b, d)) && (paramBoolean)) {
      b = e;
    }
    return paramb;
  }
  
  public final Object l(int paramInt)
  {
    Object localObject1 = b.l(paramInt);
    Object localObject2 = localObject1;
    if (e0.a(localObject1, d)) {
      localObject2 = e;
    }
    return localObject2;
  }
  
  public final r1.c n(int paramInt, r1.c paramc, long paramLong)
  {
    b.n(paramInt, paramc, paramLong);
    if (e0.a(a, c)) {
      a = r1.c.z;
    }
    return paramc;
  }
}

/* Location:
 * Qualified Name:     z4.p.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */