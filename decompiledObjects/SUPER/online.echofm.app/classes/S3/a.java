package S3;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class a
  extends c
{
  public final Object[] o;
  public final Object[] p;
  public final Comparator q;
  
  public a(Comparator paramComparator)
  {
    o = new Object[0];
    p = new Object[0];
    q = paramComparator;
  }
  
  public a(Comparator paramComparator, Object[] paramArrayOfObject1, Object[] paramArrayOfObject2)
  {
    o = paramArrayOfObject1;
    p = paramArrayOfObject2;
    q = paramComparator;
  }
  
  public static Object[] T(Object[] paramArrayOfObject, int paramInt, Object paramObject)
  {
    int i = paramArrayOfObject.length + 1;
    Object[] arrayOfObject = new Object[i];
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, paramInt);
    arrayOfObject[paramInt] = paramObject;
    System.arraycopy(paramArrayOfObject, paramInt, arrayOfObject, paramInt + 1, i - paramInt - 1);
    return arrayOfObject;
  }
  
  public static a U(List paramList, Map paramMap, c.a.a parama, Comparator paramComparator)
  {
    Collections.sort(paramList, paramComparator);
    int i = paramList.size();
    Object[] arrayOfObject1 = new Object[i];
    Object[] arrayOfObject2 = new Object[i];
    paramList = paramList.iterator();
    for (i = 0; paramList.hasNext(); i++)
    {
      Object localObject = paramList.next();
      arrayOfObject1[i] = localObject;
      arrayOfObject2[i] = paramMap.get(parama.a(localObject));
    }
    return new a(paramComparator, arrayOfObject1, arrayOfObject2);
  }
  
  public static a X(Map paramMap, Comparator paramComparator)
  {
    return U(new ArrayList(paramMap.keySet()), paramMap, c.a.e(), paramComparator);
  }
  
  public static Object[] Z(Object[] paramArrayOfObject, int paramInt)
  {
    int i = paramArrayOfObject.length - 1;
    Object[] arrayOfObject = new Object[i];
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, paramInt);
    System.arraycopy(paramArrayOfObject, paramInt + 1, arrayOfObject, paramInt, i - paramInt);
    return arrayOfObject;
  }
  
  public static Object[] a0(Object[] paramArrayOfObject, int paramInt, Object paramObject)
  {
    int i = paramArrayOfObject.length;
    Object[] arrayOfObject = new Object[i];
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, i);
    arrayOfObject[paramInt] = paramObject;
    return arrayOfObject;
  }
  
  public c D(Object paramObject)
  {
    int i = V(paramObject);
    if (i == -1) {
      return this;
    }
    Object[] arrayOfObject = Z(o, i);
    paramObject = Z(p, i);
    return new a(q, arrayOfObject, (Object[])paramObject);
  }
  
  public Iterator P()
  {
    return Y(o.length - 1, true);
  }
  
  public final int V(Object paramObject)
  {
    Object[] arrayOfObject = o;
    int i = arrayOfObject.length;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      Object localObject = arrayOfObject[j];
      if (q.compare(paramObject, localObject) == 0) {
        return k;
      }
      k++;
      j++;
    }
    return -1;
  }
  
  public final int W(Object paramObject)
  {
    for (int i = 0;; i++)
    {
      Object[] arrayOfObject = o;
      if ((i >= arrayOfObject.length) || (q.compare(arrayOfObject[i], paramObject) >= 0)) {
        break;
      }
    }
    return i;
  }
  
  public final Iterator Y(final int paramInt, final boolean paramBoolean)
  {
    return new a(paramInt, paramBoolean);
  }
  
  public boolean a(Object paramObject)
  {
    boolean bool;
    if (V(paramObject) != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Object d(Object paramObject)
  {
    int i = V(paramObject);
    if (i != -1) {
      paramObject = p[i];
    } else {
      paramObject = null;
    }
    return paramObject;
  }
  
  public Comparator f()
  {
    return q;
  }
  
  public Object g()
  {
    Object localObject = o;
    if (localObject.length > 0) {
      localObject = localObject[(localObject.length - 1)];
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public Object i()
  {
    Object localObject = o;
    if (localObject.length > 0) {
      localObject = localObject[0];
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (o.length == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Iterator iterator()
  {
    return Y(0, false);
  }
  
  public Object k(Object paramObject)
  {
    int i = V(paramObject);
    if (i != -1)
    {
      if (i > 0) {
        paramObject = o[(i - 1)];
      } else {
        paramObject = null;
      }
      return paramObject;
    }
    throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
  }
  
  public void q(h.b paramb)
  {
    for (int i = 0;; i++)
    {
      Object[] arrayOfObject = o;
      if (i >= arrayOfObject.length) {
        break;
      }
      paramb.a(arrayOfObject[i], p[i]);
    }
  }
  
  public c s(Object paramObject1, Object paramObject2)
  {
    int i = V(paramObject1);
    Object localObject;
    if (i != -1)
    {
      localObject = o;
      if ((localObject[i] == paramObject1) && (p[i] == paramObject2)) {
        return this;
      }
      paramObject1 = a0((Object[])localObject, i, paramObject1);
      paramObject2 = a0(p, i, paramObject2);
      return new a(q, (Object[])paramObject1, (Object[])paramObject2);
    }
    if (o.length > 25)
    {
      localObject = new HashMap(o.length + 1);
      for (i = 0;; i++)
      {
        Object[] arrayOfObject = o;
        if (i >= arrayOfObject.length) {
          break;
        }
        ((Map)localObject).put(arrayOfObject[i], p[i]);
      }
      ((Map)localObject).put(paramObject1, paramObject2);
      return k.S((Map)localObject, q);
    }
    i = W(paramObject1);
    paramObject1 = T(o, i, paramObject1);
    paramObject2 = T(p, i, paramObject2);
    return new a(q, (Object[])paramObject1, (Object[])paramObject2);
  }
  
  public int size()
  {
    return o.length;
  }
  
  public class a
    implements Iterator
  {
    public int o;
    
    public a(int paramInt, boolean paramBoolean)
    {
      o = paramInt;
    }
    
    public Map.Entry b()
    {
      Object localObject1 = a.M(a.this)[o];
      Object localObject2 = a.S(a.this);
      int i = o;
      localObject2 = localObject2[i];
      if (paramBoolean) {
        i--;
      } else {
        i++;
      }
      o = i;
      return new AbstractMap.SimpleImmutableEntry(localObject1, localObject2);
    }
    
    public boolean hasNext()
    {
      boolean bool1 = paramBoolean;
      boolean bool2 = false;
      if (bool1)
      {
        if (o < 0) {}
      }
      else {
        while (o < a.M(a.this).length)
        {
          bool2 = true;
          break;
        }
      }
      return bool2;
    }
    
    public void remove()
    {
      throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
    }
  }
}

/* Location:
 * Qualified Name:     S3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */