package com.google.ads.interactivemedia.v3.internal;

import java.util.Map.Entry;

final class ahq<K, V>
  extends ahv<K, V, Map.Entry<V, K>>
{
  public ahq(ahn<K, V> paramahn)
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
      int i = a.b(paramObject);
      if ((i != -1) && (ahf.a(a.a[i], localObject))) {
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
      int j = a.b(paramObject, i);
      if ((j != -1) && (ahf.a(a.a[j], localObject)))
      {
        a.b(j, i);
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */