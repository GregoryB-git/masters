package com.google.ads.interactivemedia.v3.internal;

final class ahm
  extends ahl
{
  private final Object a = a[paramInt];
  private int b;
  
  public ahm(ahn paramahn, int paramInt)
  {
    b = paramInt;
  }
  
  private final void a()
  {
    int i = b;
    if (i != -1)
    {
      ahn localahn = c;
      if ((i <= c) && (ahf.a(a[i], a))) {}
    }
    else
    {
      b = c.a(a);
    }
  }
  
  public final Object getKey()
  {
    return a;
  }
  
  public final Object getValue()
  {
    a();
    int i = b;
    if (i == -1) {
      return null;
    }
    return c.b[i];
  }
  
  public final Object setValue(Object paramObject)
  {
    a();
    int i = b;
    if (i == -1) {
      return c.put(a, paramObject);
    }
    Object localObject = c.b[i];
    if (ahf.a(localObject, paramObject)) {
      return paramObject;
    }
    ahn.a(c, b, paramObject, false);
    return localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */