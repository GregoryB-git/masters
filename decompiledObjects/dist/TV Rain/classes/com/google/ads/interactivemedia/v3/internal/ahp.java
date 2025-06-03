package com.google.ads.interactivemedia.v3.internal;

final class ahp<K, V>
  extends ahl<V, K>
{
  private final ahn<K, V> a;
  private final V b;
  private int c;
  
  public ahp(ahn<K, V> paramahn, int paramInt)
  {
    a = paramahn;
    b = b[paramInt];
    c = paramInt;
  }
  
  private final void a()
  {
    int i = c;
    if (i != -1)
    {
      ahn localahn = a;
      if ((i <= c) && (ahf.a(b, b[i]))) {}
    }
    else
    {
      c = a.b(b);
    }
  }
  
  public final V getKey()
  {
    return (V)b;
  }
  
  public final K getValue()
  {
    a();
    int i = c;
    if (i == -1) {
      return null;
    }
    return (K)a.a[i];
  }
  
  public final K setValue(K paramK)
  {
    a();
    int i = c;
    if (i == -1) {
      return (K)a.a(b, paramK, false);
    }
    Object localObject = a.a[i];
    if (ahf.a(localObject, paramK)) {
      return paramK;
    }
    ahn.b(a, c, paramK, false);
    return (K)localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ahp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */