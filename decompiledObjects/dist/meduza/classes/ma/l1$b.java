package ma;

import java.util.Map.Entry;

public final class l1$b
  implements Map.Entry<K, V>, Comparable<l1<K, V>.b>
{
  public final K a;
  public V b;
  
  public l1$b() {}
  
  public l1$b(K paramK, V paramV)
  {
    a = paramV;
    Object localObject;
    b = localObject;
  }
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (b)paramObject;
    return a.compareTo(a);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Map.Entry)) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    Object localObject1 = a;
    Object localObject2 = ((Map.Entry)paramObject).getKey();
    if (localObject1 == null)
    {
      if (localObject2 == null) {
        bool2 = true;
      } else {
        bool2 = false;
      }
    }
    else {
      bool2 = localObject1.equals(localObject2);
    }
    if (bool2)
    {
      localObject1 = b;
      paramObject = ((Map.Entry)paramObject).getValue();
      if (localObject1 == null)
      {
        if (paramObject == null) {
          bool2 = true;
        } else {
          bool2 = false;
        }
      }
      else {
        bool2 = localObject1.equals(paramObject);
      }
      if (bool2)
      {
        bool2 = bool1;
        break label123;
      }
    }
    boolean bool2 = false;
    label123:
    return bool2;
  }
  
  public final Object getKey()
  {
    return a;
  }
  
  public final V getValue()
  {
    return (V)b;
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = b;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j ^ i;
  }
  
  public final V setValue(V paramV)
  {
    Object localObject = c;
    int i = l1.o;
    ((l1)localObject).c();
    localObject = b;
    b = paramV;
    return (V)localObject;
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
 * Qualified Name:     ma.l1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */