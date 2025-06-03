package n;

import java.util.Map.Entry;

public final class b$c<K, V>
  implements Map.Entry<K, V>
{
  public final K a;
  public final V b;
  public c<K, V> c;
  public c<K, V> d;
  
  public b$c(K paramK, V paramV)
  {
    a = paramK;
    b = paramV;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    paramObject = (c)paramObject;
    if ((!a.equals(a)) || (!b.equals(b))) {
      bool = false;
    }
    return bool;
  }
  
  public final K getKey()
  {
    return (K)a;
  }
  
  public final V getValue()
  {
    return (V)b;
  }
  
  public final int hashCode()
  {
    return a.hashCode() ^ b.hashCode();
  }
  
  public final V setValue(V paramV)
  {
    throw new UnsupportedOperationException("An entry modification is not supported");
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append("=");
    localStringBuilder.append(b);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     n.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */