package r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class g<K, V>
{
  public g<K, V>.b a;
  public g<K, V>.c b;
  public g<K, V>.e c;
  
  public static <T> boolean j(Set<T> paramSet, Object paramObject)
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
  
  public static <K, V> boolean k(Map<K, V> paramMap, Collection<?> paramCollection)
  {
    int i = paramMap.size();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext()) {
      if (!paramCollection.contains(localIterator.next())) {
        localIterator.remove();
      }
    }
    boolean bool;
    if (i != paramMap.size()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public abstract void a();
  
  public abstract Object b(int paramInt1, int paramInt2);
  
  public abstract Map<K, V> c();
  
  public abstract int d();
  
  public abstract int e(Object paramObject);
  
  public abstract int f(Object paramObject);
  
  public abstract void g(K paramK, V paramV);
  
  public abstract void h(int paramInt);
  
  public abstract V i(int paramInt, V paramV);
  
  public final Object[] l(int paramInt, Object[] paramArrayOfObject)
  {
    int i = d();
    Object[] arrayOfObject = paramArrayOfObject;
    if (paramArrayOfObject.length < i) {
      arrayOfObject = (Object[])Array.newInstance(paramArrayOfObject.getClass().getComponentType(), i);
    }
    for (int j = 0; j < i; j++) {
      arrayOfObject[j] = b(j, paramInt);
    }
    if (arrayOfObject.length > i) {
      arrayOfObject[i] = null;
    }
    return arrayOfObject;
  }
  
  public final class a<T>
    implements Iterator<T>
  {
    public final int a;
    public int b;
    public int c;
    public boolean d = false;
    
    public a(int paramInt)
    {
      a = paramInt;
      b = d();
    }
    
    public final boolean hasNext()
    {
      boolean bool;
      if (c < b) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final T next()
    {
      if (hasNext())
      {
        Object localObject = b(c, a);
        c += 1;
        d = true;
        return (T)localObject;
      }
      throw new NoSuchElementException();
    }
    
    public final void remove()
    {
      if (d)
      {
        int i = c - 1;
        c = i;
        b -= 1;
        d = false;
        h(i);
        return;
      }
      throw new IllegalStateException();
    }
  }
  
  public final class b
    implements Set<Map.Entry<K, V>>
  {
    public b() {}
    
    public final boolean add(Object paramObject)
    {
      paramObject = (Map.Entry)paramObject;
      throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> paramCollection)
    {
      int i = d();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)paramCollection.next();
        g(localEntry.getKey(), localEntry.getValue());
      }
      boolean bool;
      if (i != d()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final void clear()
    {
      a();
    }
    
    public final boolean contains(Object paramObject)
    {
      boolean bool1 = paramObject instanceof Map.Entry;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      Object localObject = (Map.Entry)paramObject;
      int i = e(((Map.Entry)localObject).getKey());
      if (i < 0) {
        return false;
      }
      paramObject = b(i, 1);
      localObject = ((Map.Entry)localObject).getValue();
      if (paramObject != localObject)
      {
        bool1 = bool2;
        if (paramObject != null)
        {
          bool1 = bool2;
          if (!paramObject.equals(localObject)) {}
        }
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        if (!contains(paramCollection.next())) {
          return false;
        }
      }
      return true;
    }
    
    public final boolean equals(Object paramObject)
    {
      return g.j(this, paramObject);
    }
    
    public final int hashCode()
    {
      int i = d() - 1;
      int j = 0;
      while (i >= 0)
      {
        Object localObject1 = b(i, 0);
        Object localObject2 = b(i, 1);
        int k;
        if (localObject1 == null) {
          k = 0;
        } else {
          k = localObject1.hashCode();
        }
        int m;
        if (localObject2 == null) {
          m = 0;
        } else {
          m = localObject2.hashCode();
        }
        j += (k ^ m);
        i--;
      }
      return j;
    }
    
    public final boolean isEmpty()
    {
      boolean bool;
      if (d() == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final Iterator<Map.Entry<K, V>> iterator()
    {
      return new g.d(g.this);
    }
    
    public final boolean remove(Object paramObject)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final int size()
    {
      return d();
    }
    
    public final Object[] toArray()
    {
      throw new UnsupportedOperationException();
    }
    
    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      throw new UnsupportedOperationException();
    }
  }
  
  public final class c
    implements Set<K>
  {
    public c() {}
    
    public final boolean add(K paramK)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(Collection<? extends K> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void clear()
    {
      a();
    }
    
    public final boolean contains(Object paramObject)
    {
      boolean bool;
      if (e(paramObject) >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      Map localMap = c();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        if (!localMap.containsKey(paramCollection.next())) {
          return false;
        }
      }
      boolean bool = true;
      return bool;
    }
    
    public final boolean equals(Object paramObject)
    {
      return g.j(this, paramObject);
    }
    
    public final int hashCode()
    {
      int i = d() - 1;
      int j = 0;
      while (i >= 0)
      {
        Object localObject = b(i, 0);
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
    
    public final boolean isEmpty()
    {
      boolean bool;
      if (d() == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final Iterator<K> iterator()
    {
      return new g.a(g.this, 0);
    }
    
    public final boolean remove(Object paramObject)
    {
      int i = e(paramObject);
      if (i >= 0)
      {
        h(i);
        return true;
      }
      return false;
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      Map localMap = c();
      int i = localMap.size();
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        localMap.remove(paramCollection.next());
      }
      boolean bool;
      if (i != localMap.size()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      return g.k(c(), paramCollection);
    }
    
    public final int size()
    {
      return d();
    }
    
    public final Object[] toArray()
    {
      g localg = g.this;
      int i = localg.d();
      Object[] arrayOfObject = new Object[i];
      for (int j = 0; j < i; j++) {
        arrayOfObject[j] = localg.b(j, 0);
      }
      return arrayOfObject;
    }
    
    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      return l(0, paramArrayOfT);
    }
  }
  
  public final class d
    implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V>
  {
    public int a = d() - 1;
    public int b = -1;
    public boolean c = false;
    
    public d() {}
    
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
        Object localObject = b(b, 0);
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
          paramObject = b(b, 1);
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
        return (K)b(b, 0);
      }
      throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    
    public final V getValue()
    {
      if (c) {
        return (V)b(b, 1);
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
        Object localObject1 = g.this;
        int i = b;
        int j = 0;
        Object localObject2 = ((g)localObject1).b(i, 0);
        localObject1 = b(b, 1);
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
        h(b);
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
        return (V)i(b, paramV);
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
  
  public final class e
    implements Collection<V>
  {
    public e() {}
    
    public final boolean add(V paramV)
    {
      throw new UnsupportedOperationException();
    }
    
    public final boolean addAll(Collection<? extends V> paramCollection)
    {
      throw new UnsupportedOperationException();
    }
    
    public final void clear()
    {
      a();
    }
    
    public final boolean contains(Object paramObject)
    {
      boolean bool;
      if (f(paramObject) >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean containsAll(Collection<?> paramCollection)
    {
      paramCollection = paramCollection.iterator();
      while (paramCollection.hasNext()) {
        if (!contains(paramCollection.next())) {
          return false;
        }
      }
      return true;
    }
    
    public final boolean isEmpty()
    {
      boolean bool;
      if (d() == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final Iterator<V> iterator()
    {
      return new g.a(g.this, 1);
    }
    
    public final boolean remove(Object paramObject)
    {
      int i = f(paramObject);
      if (i >= 0)
      {
        h(i);
        return true;
      }
      return false;
    }
    
    public final boolean removeAll(Collection<?> paramCollection)
    {
      int i = d();
      int j = 0;
      boolean bool = false;
      while (j < i)
      {
        int k = i;
        int m = j;
        if (paramCollection.contains(b(j, 1)))
        {
          h(j);
          m = j - 1;
          k = i - 1;
          bool = true;
        }
        j = m + 1;
        i = k;
      }
      return bool;
    }
    
    public final boolean retainAll(Collection<?> paramCollection)
    {
      int i = d();
      int j = 0;
      boolean bool = false;
      while (j < i)
      {
        int k = i;
        int m = j;
        if (!paramCollection.contains(b(j, 1)))
        {
          h(j);
          m = j - 1;
          k = i - 1;
          bool = true;
        }
        j = m + 1;
        i = k;
      }
      return bool;
    }
    
    public final int size()
    {
      return d();
    }
    
    public final Object[] toArray()
    {
      g localg = g.this;
      int i = localg.d();
      Object[] arrayOfObject = new Object[i];
      for (int j = 0; j < i; j++) {
        arrayOfObject[j] = localg.b(j, 1);
      }
      return arrayOfObject;
    }
    
    public final <T> T[] toArray(T[] paramArrayOfT)
    {
      return l(1, paramArrayOfT);
    }
  }
}

/* Location:
 * Qualified Name:     r.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */