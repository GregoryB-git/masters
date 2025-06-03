package com.google.ads.interactivemedia.v3.internal;

import java.util.Map.Entry;

final class aij<K, V>
  extends aid<Map.Entry<K, V>>
{
  private final transient aib<K, V> a;
  private final transient Object[] b;
  private final transient int c;
  private final transient int d;
  
  public aij(aib<K, V> paramaib, Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    a = paramaib;
    b = paramArrayOfObject;
    c = 0;
    d = paramInt2;
  }
  
  public final int b(Object[] paramArrayOfObject, int paramInt)
  {
    return c().b(paramArrayOfObject, paramInt);
  }
  
  public final aio<Map.Entry<K, V>> b()
  {
    return c().b();
  }
  
  public final boolean contains(Object paramObject)
  {
    if ((paramObject instanceof Map.Entry))
    {
      Object localObject = (Map.Entry)paramObject;
      paramObject = ((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      if ((localObject != null) && (localObject.equals(a.get(paramObject)))) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean g()
  {
    return true;
  }
  
  public final ahw<Map.Entry<K, V>> h()
  {
    return new aii(this);
  }
  
  public final int size()
  {
    return d;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aij
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */