package tb;

import ec.i;
import java.util.ConcurrentModificationException;
import java.util.Map.Entry;
import x6.b;

public final class c$c<K, V>
  implements Map.Entry<K, V>
{
  public final c<K, V> a;
  public final int b;
  public final int c;
  
  public c$c(c<K, V> paramc, int paramInt)
  {
    a = paramc;
    b = paramInt;
    c = p;
  }
  
  public final void a()
  {
    if (a.p == c) {
      return;
    }
    throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof Map.Entry))
    {
      paramObject = (Map.Entry)paramObject;
      if ((i.a(((Map.Entry)paramObject).getKey(), getKey())) && (i.a(((Map.Entry)paramObject).getValue(), getValue()))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public final K getKey()
  {
    a();
    return (K)a.a[b];
  }
  
  public final V getValue()
  {
    a();
    Object[] arrayOfObject = a.b;
    i.b(arrayOfObject);
    return (V)arrayOfObject[b];
  }
  
  public final int hashCode()
  {
    Object localObject = getKey();
    int i = 0;
    int j;
    if (localObject != null) {
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    localObject = getValue();
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j ^ i;
  }
  
  public final V setValue(V paramV)
  {
    a();
    a.c();
    c localc = a;
    Object[] arrayOfObject = b;
    if (arrayOfObject == null)
    {
      arrayOfObject = b.g(a.length);
      b = arrayOfObject;
    }
    int i = b;
    localc = arrayOfObject[i];
    arrayOfObject[i] = paramV;
    return localc;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getKey());
    localStringBuilder.append('=');
    localStringBuilder.append(getValue());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     tb.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */