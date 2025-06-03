package com.google.ads.interactivemedia.v3.internal;

final class aht
  extends ahv
{
  public aht(ahn paramahn)
  {
    super(paramahn);
  }
  
  public final Object a(int paramInt)
  {
    return b.a[paramInt];
  }
  
  public final boolean contains(Object paramObject)
  {
    return b.containsKey(paramObject);
  }
  
  public final boolean remove(Object paramObject)
  {
    int i = aim.b(paramObject);
    int j = b.a(paramObject, i);
    if (j != -1)
    {
      b.a(j, i);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aht
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */