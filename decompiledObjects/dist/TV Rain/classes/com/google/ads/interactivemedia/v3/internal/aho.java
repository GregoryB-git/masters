package com.google.ads.interactivemedia.v3.internal;

import java.util.Map.Entry;

final class aho
  extends ahv
{
  public aho(ahn paramahn)
  {
    super(paramahn);
  }
  
  public final boolean contains(Object paramObject)
  {
    if ((paramObject instanceof Map.Entry))
    {
      Object localObject = (Map.Entry)paramObject;
      paramObject = ((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      int i = b.a(paramObject);
      if ((i != -1) && (ahf.a(localObject, b.b[i]))) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean remove(Object paramObject)
  {
    if ((paramObject instanceof Map.Entry))
    {
      Object localObject = (Map.Entry)paramObject;
      paramObject = ((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      int i = aim.b(paramObject);
      int j = b.a(paramObject, i);
      if ((j != -1) && (ahf.a(localObject, b.b[j])))
      {
        b.a(j, i);
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aho
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */