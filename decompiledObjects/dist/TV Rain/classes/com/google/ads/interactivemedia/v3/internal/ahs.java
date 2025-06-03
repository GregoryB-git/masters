package com.google.ads.interactivemedia.v3.internal;

final class ahs
  extends ahv
{
  public ahs(ahn paramahn)
  {
    super(paramahn);
  }
  
  public final Object a(int paramInt)
  {
    return b.b[paramInt];
  }
  
  public final boolean contains(Object paramObject)
  {
    return b.containsValue(paramObject);
  }
  
  public final boolean remove(Object paramObject)
  {
    int i = aim.b(paramObject);
    int j = b.b(paramObject, i);
    if (j != -1)
    {
      b.b(j, i);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */