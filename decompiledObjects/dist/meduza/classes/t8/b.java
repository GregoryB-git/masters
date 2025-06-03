package t8;

import j9.g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import v4.d;

public final class b<K, V>
  extends c<K, V>
{
  public final K[] a;
  public final V[] b;
  public final Comparator<K> c;
  
  public b()
  {
    a = new Object[0];
    b = new Object[0];
    c = locald;
  }
  
  public b(Comparator<K> paramComparator, K[] paramArrayOfK, V[] paramArrayOfV)
  {
    a = paramArrayOfK;
    b = paramArrayOfV;
    c = paramComparator;
  }
  
  public final boolean a(K paramK)
  {
    boolean bool;
    if (q(paramK) != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final V h(K paramK)
  {
    int i = q(paramK);
    if (i != -1) {
      paramK = b[i];
    } else {
      paramK = null;
    }
    return paramK;
  }
  
  public final Comparator<K> i()
  {
    return c;
  }
  
  public final boolean isEmpty()
  {
    boolean bool;
    if (a.length == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Iterator<Map.Entry<K, V>> iterator()
  {
    return new a(this, 0);
  }
  
  public final K k()
  {
    Object localObject = a;
    if (localObject.length > 0) {
      localObject = localObject[(localObject.length - 1)];
    } else {
      localObject = null;
    }
    return (K)localObject;
  }
  
  public final K l()
  {
    Object localObject = a;
    if (localObject.length > 0) {
      localObject = localObject[0];
    } else {
      localObject = null;
    }
    return (K)localObject;
  }
  
  public final int m(g paramg)
  {
    return q(paramg);
  }
  
  public final c<K, V> n(K paramK, V paramV)
  {
    int i = q(paramK);
    int j = 0;
    if (i != -1)
    {
      arrayOfObject = a;
      if ((arrayOfObject[i] == paramK) && (b[i] == paramV)) {
        return this;
      }
      j = arrayOfObject.length;
      localObject = new Object[j];
      System.arraycopy(arrayOfObject, 0, localObject, 0, j);
      localObject[i] = paramK;
      paramK = b;
      j = paramK.length;
      arrayOfObject = new Object[j];
      System.arraycopy(paramK, 0, arrayOfObject, 0, j);
      arrayOfObject[i] = paramV;
      return new b(c, (Object[])localObject, arrayOfObject);
    }
    if (a.length > 25)
    {
      localObject = new HashMap(a.length + 1);
      for (;;)
      {
        arrayOfObject = a;
        if (j >= arrayOfObject.length) {
          break;
        }
        ((HashMap)localObject).put(arrayOfObject[j], b[j]);
        j++;
      }
      ((HashMap)localObject).put(paramK, paramV);
      paramK = c;
      return k.a.b(new ArrayList(((HashMap)localObject).keySet()), (Map)localObject, paramK);
    }
    for (j = 0;; j++)
    {
      localObject = a;
      if ((j >= localObject.length) || (c.compare(localObject[j], paramK) >= 0)) {
        break;
      }
    }
    Object[] arrayOfObject = a;
    int k = arrayOfObject.length + 1;
    Object localObject = new Object[k];
    System.arraycopy(arrayOfObject, 0, localObject, 0, j);
    localObject[j] = paramK;
    i = j + 1;
    System.arraycopy(arrayOfObject, j, localObject, i, k - j - 1);
    arrayOfObject = b;
    k = arrayOfObject.length + 1;
    paramK = new Object[k];
    System.arraycopy(arrayOfObject, 0, paramK, 0, j);
    paramK[j] = paramV;
    System.arraycopy(arrayOfObject, j, paramK, i, k - j - 1);
    return new b(c, (Object[])localObject, paramK);
  }
  
  public final Iterator<Map.Entry<K, V>> o(K paramK)
  {
    for (int i = 0;; i++)
    {
      Object[] arrayOfObject = a;
      if ((i >= arrayOfObject.length) || (c.compare(arrayOfObject[i], paramK) >= 0)) {
        break;
      }
    }
    return new a(this, i);
  }
  
  public final c<K, V> p(K paramK)
  {
    int i = q(paramK);
    if (i == -1) {
      return this;
    }
    Object[] arrayOfObject1 = a;
    int j = arrayOfObject1.length - 1;
    paramK = new Object[j];
    System.arraycopy(arrayOfObject1, 0, paramK, 0, i);
    int k = i + 1;
    System.arraycopy(arrayOfObject1, k, paramK, i, j - i);
    Object[] arrayOfObject2 = b;
    j = arrayOfObject2.length - 1;
    arrayOfObject1 = new Object[j];
    System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, i);
    System.arraycopy(arrayOfObject2, k, arrayOfObject1, i, j - i);
    return new b(c, paramK, arrayOfObject1);
  }
  
  public final int q(K paramK)
  {
    Object[] arrayOfObject = a;
    int i = arrayOfObject.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Object localObject = arrayOfObject[j];
      if (c.compare(paramK, localObject) == 0) {
        return k;
      }
      k++;
      j++;
    }
    return -1;
  }
  
  public final int size()
  {
    return a.length;
  }
}

/* Location:
 * Qualified Name:     t8.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */