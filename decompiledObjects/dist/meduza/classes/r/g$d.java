package r;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

public final class g$d
  implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>
{
  public int a;
  public int b;
  public boolean c = false;
  
  public g$d(g paramg)
  {
    a = (paramg.d() - 1);
    b = -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (c)
    {
      boolean bool1 = paramObject instanceof Map.Entry;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      Map.Entry localEntry = (Map.Entry)paramObject;
      paramObject = localEntry.getKey();
      Object localObject = d.b(b, 0);
      int i;
      if ((paramObject != localObject) && ((paramObject == null) || (!paramObject.equals(localObject)))) {
        i = 0;
      } else {
        i = 1;
      }
      bool1 = bool2;
      if (i != 0)
      {
        localObject = localEntry.getValue();
        paramObject = d.b(b, 1);
        if ((localObject != paramObject) && ((localObject == null) || (!localObject.equals(paramObject)))) {
          i = 0;
        } else {
          i = 1;
        }
        bool1 = bool2;
        if (i != 0) {
          bool1 = true;
        }
      }
      return bool1;
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public final K getKey()
  {
    if (c) {
      return (K)d.b(b, 0);
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public final V getValue()
  {
    if (c) {
      return (V)d.b(b, 1);
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (b < a) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int hashCode()
  {
    if (c)
    {
      Object localObject1 = d;
      int i = b;
      int j = 0;
      Object localObject2 = ((g)localObject1).b(i, 0);
      localObject1 = d.b(b, 1);
      if (localObject2 == null) {
        i = 0;
      } else {
        i = localObject2.hashCode();
      }
      if (localObject1 != null) {
        j = localObject1.hashCode();
      }
      return i ^ j;
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public final Object next()
  {
    if (hasNext())
    {
      b += 1;
      c = true;
      return this;
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    if (c)
    {
      d.h(b);
      b -= 1;
      a -= 1;
      c = false;
      return;
    }
    throw new IllegalStateException();
  }
  
  public final V setValue(V paramV)
  {
    if (c) {
      return (V)d.i(b, paramV);
    }
    throw new IllegalStateException("This container does not support retaining Map.Entry objects");
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getKey());
    localStringBuilder.append("=");
    localStringBuilder.append(getValue());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     r.g.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */