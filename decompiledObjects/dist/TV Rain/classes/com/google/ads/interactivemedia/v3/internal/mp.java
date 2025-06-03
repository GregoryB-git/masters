package com.google.ads.interactivemedia.v3.internal;

final class mp
  extends mj
{
  public static final Object c = new Object();
  private final Object d;
  private final Object e;
  
  private mp(cr paramcr, Object paramObject1, Object paramObject2)
  {
    super(paramcr);
    d = paramObject1;
    e = paramObject2;
  }
  
  public static mp a(cr paramcr, Object paramObject1, Object paramObject2)
  {
    return new mp(paramcr, paramObject1, paramObject2);
  }
  
  public static mp b(Object paramObject)
  {
    return new mp(new mm(paramObject), cw.a, c);
  }
  
  public final int a(Object paramObject)
  {
    cr localcr = b;
    Object localObject = paramObject;
    if (c.equals(paramObject)) {
      localObject = e;
    }
    return localcr.a(localObject);
  }
  
  public final ct a(int paramInt, ct paramct, boolean paramBoolean)
  {
    b.a(paramInt, paramct, paramBoolean);
    if (wl.a(a, e)) {
      a = c;
    }
    return paramct;
  }
  
  public final cw a(int paramInt, cw paramcw, long paramLong)
  {
    b.a(paramInt, paramcw, paramLong);
    if (wl.a(b, d)) {
      b = cw.a;
    }
    return paramcw;
  }
  
  public final mp a(cr paramcr)
  {
    return new mp(paramcr, d, e);
  }
  
  public final Object a(int paramInt)
  {
    Object localObject1 = b.a(paramInt);
    Object localObject2 = localObject1;
    if (wl.a(localObject1, e)) {
      localObject2 = c;
    }
    return localObject2;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.mp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */