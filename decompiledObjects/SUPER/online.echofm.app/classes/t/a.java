package t;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public class a
  extends h
  implements Map
{
  public a v;
  public c w;
  public e x;
  
  public a() {}
  
  public a(int paramInt)
  {
    super(paramInt);
  }
  
  public static boolean n(Set paramSet, Object paramObject)
  {
    boolean bool1 = true;
    if (paramSet == paramObject) {
      return true;
    }
    if ((paramObject instanceof Set)) {
      paramObject = (Set)paramObject;
    }
    try
    {
      if (paramSet.size() == ((Set)paramObject).size())
      {
        boolean bool2 = paramSet.containsAll((Collection)paramObject);
        if (bool2) {}
      }
      else
      {
        bool1 = false;
      }
      return bool1;
    }
    catch (NullPointerException|ClassCastException paramSet)
    {
      for (;;) {}
    }
    return false;
  }
  
  public Set entrySet()
  {
    a locala1 = v;
    a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = new a();
      v = locala2;
    }
    return locala2;
  }
  
  public Set keySet()
  {
    c localc1 = w;
    c localc2 = localc1;
    if (localc1 == null)
    {
      localc2 = new c();
      w = localc2;
    }
    return localc2;
  }
  
  public boolean m(Collection paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!containsKey(paramCollection.next())) {
        return false;
      }
    }
    return true;
  }
  
  public boolean o(Collection paramCollection)
  {
    int i = q;
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      remove(paramCollection.next());
    }
    boolean bool;
    if (i != q) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean p(Collection paramCollection)
  {
    int i = q;
    for (int j = i - 1; j >= 0; j--) {
      if (!paramCollection.contains(i(j))) {
        j(j);
      }
    }
    boolean bool;
    if (i != q) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void putAll(Map paramMap)
  {
    c(q + paramMap.size());
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      put(localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public Object[] q(Object[] paramArrayOfObject, int paramInt)
  {
    int i = q;
    Object[] arrayOfObject = paramArrayOfObject;
    if (paramArrayOfObject.length < i) {
      arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
    }
    for (int j = 0; j < i; j++) {
      arrayOfObject[j] = p[((j << 1) + paramInt)];
    }
    if (arrayOfObject.length > i) {
      arrayOfObject[i] = null;
    }
    return arrayOfObject;
  }
  
  public Collection values()
  {
    e locale1 = x;
    e locale2 = locale1;
    if (locale1 == null)
    {
      locale2 = new e();
      x = locale2;
    }
    return locale2;
  }
  
  public final class a
    extends AbstractSet
  {
    public a() {}
    
    public Iterator iterator()
    {
      return new a.d(a.this);
    }
    
    public int size()
    {
      return q;
    }
  }
  
  public final class b
    extends e
  {
    public b()
    {
      super();
    }
    
    public Object b(int paramInt)
    {
      return i(paramInt);
    }
    
    public void d(int paramInt)
    {
      j(paramInt);
    }
  }
  
  public final class c
    implements Set
  {
    public c() {}
    
    public boolean add(Object paramObject)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public void clear()
    {
      a.this.clear();
    }
    
    public boolean contains(Object paramObject)
    {
      return containsKey(paramObject);
    }
    
    public boolean containsAll(Collection paramCollection)
    {
      return m(paramCollection);
    }
    
    public boolean equals(Object paramObject)
    {
      return a.n(this, paramObject);
    }
    
    public int hashCode()
    {
      int i = q - 1;
      int j = 0;
      while (i >= 0)
      {
        Object localObject = i(i);
        int k;
        if (localObject == null) {
          k = 0;
        } else {
          k = localObject.hashCode();
        }
        j += k;
        i--;
      }
      return j;
    }
    
    public boolean isEmpty()
    {
      return a.this.isEmpty();
    }
    
    public Iterator iterator()
    {
      return new a.b(a.this);
    }
    
    public boolean remove(Object paramObject)
    {
      int i = f(paramObject);
      if (i >= 0)
      {
        j(i);
        return true;
      }
      return false;
    }
    
    public boolean removeAll(Collection paramCollection)
    {
      return o(paramCollection);
    }
    
    public boolean retainAll(Collection paramCollection)
    {
      return p(paramCollection);
    }
    
    public int size()
    {
      return q;
    }
    
    public Object[] toArray()
    {
      int i = q;
      Object[] arrayOfObject = new Object[i];
      for (int j = 0; j < i; j++) {
        arrayOfObject[j] = i(j);
      }
      return arrayOfObject;
    }
    
    public Object[] toArray(Object[] paramArrayOfObject)
    {
      return q(paramArrayOfObject, 0);
    }
  }
  
  public final class d
    implements Iterator, Map.Entry
  {
    public int o = q - 1;
    public int p = -1;
    public boolean q;
    
    public d() {}
    
    public Map.Entry b()
    {
      if (hasNext())
      {
        p += 1;
        q = true;
        return this;
      }
      throw new NoSuchElementException();
    }
    
    public boolean equals(Object paramObject)
    {
      if (q)
      {
        boolean bool1 = paramObject instanceof Map.Entry;
        boolean bool2 = false;
        if (!bool1) {
          return false;
        }
        paramObject = (Map.Entry)paramObject;
        bool1 = bool2;
        if (d.c(((Map.Entry)paramObject).getKey(), i(p)))
        {
          bool1 = bool2;
          if (d.c(((Map.Entry)paramObject).getValue(), l(p))) {
            bool1 = true;
          }
        }
        return bool1;
      }
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public Object getKey()
    {
      if (q) {
        return i(p);
      }
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public Object getValue()
    {
      if (q) {
        return l(p);
      }
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public boolean hasNext()
    {
      boolean bool;
      if (p < o) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      if (q)
      {
        Object localObject1 = i(p);
        Object localObject2 = l(p);
        int i = 0;
        int j;
        if (localObject1 == null) {
          j = 0;
        } else {
          j = localObject1.hashCode();
        }
        if (localObject2 != null) {
          i = localObject2.hashCode();
        }
        return j ^ i;
      }
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public void remove()
    {
      if (q)
      {
        j(p);
        p -= 1;
        o -= 1;
        q = false;
        return;
      }
      throw new IllegalStateException();
    }
    
    public Object setValue(Object paramObject)
    {
      if (q) {
        return k(p, paramObject);
      }
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(getKey());
      localStringBuilder.append("=");
      localStringBuilder.append(getValue());
      return localStringBuilder.toString();
    }
  }
  
  public final class e
    implements Collection
  {
    public e() {}
    
    public boolean add(Object paramObject)
    {
      throw new UnsupportedOperationException();
    }
    
    public boolean addAll(Collection paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public void clear()
    {
      a.this.clear();
    }
    
    public boolean contains(Object paramObject)
    {
      boolean bool;
      if (h(paramObject) >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean containsAll(Collection paramCollection)
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        if (!contains(paramCollection.next())) {
          return false;
        }
      }
      return true;
    }
    
    public boolean isEmpty()
    {
      return a.this.isEmpty();
    }
    
    public Iterator iterator()
    {
      return new a.f(a.this);
    }
    
    public boolean remove(Object paramObject)
    {
      int i = h(paramObject);
      if (i >= 0)
      {
        j(i);
        return true;
      }
      return false;
    }
    
    public boolean removeAll(Collection paramCollection)
    {
      int i = q;
      int j = 0;
      boolean bool = false;
      while (j < i)
      {
        int k = i;
        int m = j;
        if (paramCollection.contains(l(j)))
        {
          j(j);
          m = j - 1;
          k = i - 1;
          bool = true;
        }
        j = m + 1;
        i = k;
      }
      return bool;
    }
    
    public boolean retainAll(Collection paramCollection)
    {
      int i = q;
      int j = 0;
      boolean bool = false;
      while (j < i)
      {
        int k = i;
        int m = j;
        if (!paramCollection.contains(l(j)))
        {
          j(j);
          m = j - 1;
          k = i - 1;
          bool = true;
        }
        j = m + 1;
        i = k;
      }
      return bool;
    }
    
    public int size()
    {
      return q;
    }
    
    public Object[] toArray()
    {
      int i = q;
      Object[] arrayOfObject = new Object[i];
      for (int j = 0; j < i; j++) {
        arrayOfObject[j] = l(j);
      }
      return arrayOfObject;
    }
    
    public Object[] toArray(Object[] paramArrayOfObject)
    {
      return q(paramArrayOfObject, 1);
    }
  }
  
  public final class f
    extends e
  {
    public f()
    {
      super();
    }
    
    public Object b(int paramInt)
    {
      return l(paramInt);
    }
    
    public void d(int paramInt)
    {
      j(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     t.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */