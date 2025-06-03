package tb;

import ec.i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import x6.b;

public final class c<K, V>
  implements Map<K, V>, Serializable
{
  public static final c v;
  public K[] a;
  public V[] b;
  public int[] c;
  public int[] d;
  public int e;
  public int f;
  public int o;
  public int p;
  public int q;
  public e<K> r;
  public f<V> s;
  public d<K, V> t;
  public boolean u;
  
  static
  {
    new a();
    c localc = new c(0);
    u = true;
    v = localc;
  }
  
  public c()
  {
    this(8);
  }
  
  public c(int paramInt)
  {
    a = arrayOfObject;
    b = null;
    c = arrayOfInt1;
    d = arrayOfInt2;
    e = 2;
    f = 0;
    o = (Integer.numberOfLeadingZeros(paramInt) + 1);
  }
  
  public final int b(K paramK)
  {
    c();
    int i = i(paramK);
    int j = e * 2;
    int k = d.length / 2;
    int m = j;
    if (j > k) {
      m = k;
    }
    k = 0;
    for (;;)
    {
      int[] arrayOfInt = d;
      j = arrayOfInt[i];
      if (j <= 0)
      {
        j = f;
        Object[] arrayOfObject = a;
        if (j >= arrayOfObject.length)
        {
          g(1);
          break;
        }
        m = j + 1;
        f = m;
        arrayOfObject[j] = paramK;
        c[j] = i;
        arrayOfInt[i] = m;
        q += 1;
        p += 1;
        if (k > e) {
          e = k;
        }
        return j;
      }
      if (i.a(a[(j - 1)], paramK)) {
        return -j;
      }
      k++;
      if (k > m)
      {
        j(d.length * 2);
        break;
      }
      if (i == 0) {
        i = d.length - 1;
      } else {
        i--;
      }
    }
  }
  
  public final void c()
  {
    if (!u) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    c();
    int i = f - 1;
    if (i >= 0) {
      for (int j = 0;; j++)
      {
        localObject = c;
        int k = localObject[j];
        if (k >= 0)
        {
          d[k] = 0;
          localObject[j] = -1;
        }
        if (j == i) {
          break;
        }
      }
    }
    b.o0(a, 0, f);
    Object localObject = b;
    if (localObject != null) {
      b.o0((Object[])localObject, 0, f);
    }
    q = 0;
    f = 0;
    p += 1;
  }
  
  public final boolean containsKey(Object paramObject)
  {
    boolean bool;
    if (h(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean containsValue(Object paramObject)
  {
    int i = f;
    int k;
    Object[] arrayOfObject;
    do
    {
      do
      {
        int j = -1;
        k = i - 1;
        i = j;
        if (k < 0) {
          break;
        }
        i = k;
      } while (c[k] < 0);
      arrayOfObject = b;
      i.b(arrayOfObject);
      i = k;
    } while (!i.a(arrayOfObject[k], paramObject));
    i = k;
    boolean bool;
    if (i >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void d(boolean paramBoolean)
  {
    Object[] arrayOfObject1 = b;
    int i = 0;
    int k;
    for (int j = 0;; j = k)
    {
      k = f;
      if (i >= k) {
        break;
      }
      int[] arrayOfInt = c;
      int m = arrayOfInt[i];
      k = j;
      if (m >= 0)
      {
        Object[] arrayOfObject2 = a;
        arrayOfObject2[j] = arrayOfObject2[i];
        if (arrayOfObject1 != null) {
          arrayOfObject1[j] = arrayOfObject1[i];
        }
        if (paramBoolean)
        {
          arrayOfInt[j] = m;
          d[m] = (j + 1);
        }
        k = j + 1;
      }
      i++;
    }
    b.o0(a, j, k);
    if (arrayOfObject1 != null) {
      b.o0(arrayOfObject1, j, f);
    }
    f = j;
  }
  
  public final boolean e(Collection<?> paramCollection)
  {
    i.e(paramCollection, "m");
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        break label48;
      }
      paramCollection = localIterator.next();
      if (paramCollection != null) {}
      try
      {
        boolean bool = f((Map.Entry)paramCollection);
        if (bool) {}
      }
      catch (ClassCastException paramCollection)
      {
        label48:
        for (;;) {}
      }
    }
    return false;
    return true;
  }
  
  public final Set<Map.Entry<K, V>> entrySet()
  {
    d locald1 = t;
    d locald2 = locald1;
    if (locald1 == null)
    {
      locald2 = new d(this);
      t = locald2;
    }
    return locald2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramObject != this)
    {
      bool2 = bool1;
      if ((paramObject instanceof Map))
      {
        paramObject = (Map)paramObject;
        int i;
        if ((q == ((Map)paramObject).size()) && (e(((Map)paramObject).entrySet()))) {
          i = 1;
        } else {
          i = 0;
        }
        bool2 = bool1;
        if (i == 0) {}
      }
    }
    else
    {
      bool2 = true;
    }
    return bool2;
  }
  
  public final boolean f(Map.Entry<? extends K, ? extends V> paramEntry)
  {
    i.e(paramEntry, "entry");
    int i = h(paramEntry.getKey());
    if (i < 0) {
      return false;
    }
    Object[] arrayOfObject = b;
    i.b(arrayOfObject);
    return i.a(arrayOfObject[i], paramEntry.getValue());
  }
  
  public final void g(int paramInt)
  {
    Object localObject = a;
    int i = localObject.length;
    int j = f;
    i -= j;
    int k = j - q;
    int m = 1;
    if ((i < paramInt) && (i + k >= paramInt) && (k >= localObject.length / 4)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      d(true);
    }
    else
    {
      j += paramInt;
      if (j < 0) {
        break label237;
      }
      if (j > localObject.length)
      {
        paramInt = localObject.length;
        paramInt += (paramInt >> 1);
        i = paramInt;
        if (paramInt - j < 0) {
          i = j;
        }
        paramInt = i;
        if (i - 2147483639 > 0) {
          if (j > 2147483639) {
            paramInt = Integer.MAX_VALUE;
          } else {
            paramInt = 2147483639;
          }
        }
        localObject = Arrays.copyOf((Object[])localObject, paramInt);
        i.d(localObject, "copyOf(...)");
        a = ((Object[])localObject);
        localObject = b;
        if (localObject != null)
        {
          localObject = Arrays.copyOf((Object[])localObject, paramInt);
          i.d(localObject, "copyOf(...)");
        }
        else
        {
          localObject = null;
        }
        b = ((Object[])localObject);
        localObject = Arrays.copyOf(c, paramInt);
        i.d(localObject, "copyOf(...)");
        c = ((int[])localObject);
        if (paramInt < 1) {
          paramInt = m;
        }
        paramInt = Integer.highestOneBit(paramInt * 3);
        if (paramInt > d.length) {
          j(paramInt);
        }
      }
    }
    return;
    label237:
    throw new OutOfMemoryError();
  }
  
  public final V get(Object paramObject)
  {
    int i = h(paramObject);
    if (i < 0) {
      return null;
    }
    paramObject = b;
    i.b(paramObject);
    return paramObject[i];
  }
  
  public final int h(K paramK)
  {
    int i = i(paramK);
    int j = e;
    for (;;)
    {
      int k = d[i];
      if (k == 0) {
        return -1;
      }
      if (k > 0)
      {
        Object[] arrayOfObject = a;
        k--;
        if (i.a(arrayOfObject[k], paramK)) {
          return k;
        }
      }
      j--;
      if (j < 0) {
        return -1;
      }
      if (i == 0) {
        i = d.length - 1;
      } else {
        i--;
      }
    }
  }
  
  public final int hashCode()
  {
    b localb = new b(this);
    int i = 0;
    while (localb.hasNext())
    {
      int j = b;
      Object localObject = a;
      if (j < f)
      {
        b = (j + 1);
        c = j;
        localObject = a[j];
        if (localObject != null) {
          j = localObject.hashCode();
        } else {
          j = 0;
        }
        localObject = a.b;
        i.b(localObject);
        localObject = localObject[c];
        int k;
        if (localObject != null) {
          k = localObject.hashCode();
        } else {
          k = 0;
        }
        localb.b();
        i += (j ^ k);
      }
      else
      {
        throw new NoSuchElementException();
      }
    }
    return i;
  }
  
  public final int i(K paramK)
  {
    int i;
    if (paramK != null) {
      i = paramK.hashCode();
    } else {
      i = 0;
    }
    return i * -1640531527 >>> o;
  }
  
  public final boolean isEmpty()
  {
    boolean bool;
    if (q == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void j(int paramInt)
  {
    p += 1;
    if (f > q) {
      d(false);
    }
    d = new int[paramInt];
    o = (Integer.numberOfLeadingZeros(paramInt) + 1);
    int i = 0;
    if (i < f)
    {
      int j = i + 1;
      paramInt = i(a[i]);
      int k = e;
      for (;;)
      {
        int[] arrayOfInt = d;
        if (arrayOfInt[paramInt] == 0)
        {
          arrayOfInt[paramInt] = j;
          c[i] = paramInt;
          paramInt = 1;
        }
        else
        {
          k--;
          if (k >= 0) {
            break label133;
          }
          paramInt = 0;
        }
        if (paramInt != 0)
        {
          i = j;
          break;
        }
        throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
        label133:
        if (paramInt == 0) {
          paramInt = arrayOfInt.length - 1;
        } else {
          paramInt--;
        }
      }
    }
  }
  
  public final void k(int paramInt)
  {
    Object localObject = a;
    i.e(localObject, "<this>");
    localObject[paramInt] = null;
    localObject = b;
    if (localObject != null) {
      localObject[paramInt] = null;
    }
    int i = c[paramInt];
    int j = e * 2;
    int k = d.length / 2;
    int m = j;
    if (j > k) {
      m = k;
    }
    j = 0;
    int n = i;
    k = m;
    m = i;
    int i1;
    label232:
    do
    {
      if (m == 0) {
        m = d.length - 1;
      } else {
        m--;
      }
      i1 = j + 1;
      if (i1 > e)
      {
        d[n] = 0;
        break;
      }
      localObject = d;
      int i2 = localObject[m];
      if (i2 == 0)
      {
        localObject[n] = 0;
        break;
      }
      if (i2 < 0)
      {
        localObject[n] = -1;
      }
      else
      {
        localObject = a;
        int i3 = i2 - 1;
        int i4 = i(localObject[i3]);
        localObject = d;
        i = n;
        j = i1;
        if ((i4 - m & localObject.length - 1) < i1) {
          break label232;
        }
        localObject[n] = i2;
        c[i3] = n;
      }
      i = m;
      j = 0;
      i1 = k - 1;
      n = i;
      k = i1;
    } while (i1 >= 0);
    d[i] = -1;
    c[paramInt] = -1;
    q -= 1;
    p += 1;
  }
  
  public final Set<K> keySet()
  {
    e locale1 = r;
    e locale2 = locale1;
    if (locale1 == null)
    {
      locale2 = new e(this);
      r = locale2;
    }
    return locale2;
  }
  
  public final V put(K paramK, V paramV)
  {
    c();
    int i = b(paramK);
    paramK = b;
    if (paramK == null)
    {
      paramK = b.g(a.length);
      b = paramK;
    }
    if (i < 0)
    {
      i = -i - 1;
      V ? = paramK[i];
      paramK[i] = paramV;
      return ?;
    }
    paramK[i] = paramV;
    return null;
  }
  
  public final void putAll(Map<? extends K, ? extends V> paramMap)
  {
    i.e(paramMap, "from");
    c();
    paramMap = paramMap.entrySet();
    if (!paramMap.isEmpty())
    {
      g(paramMap.size());
      Iterator localIterator = paramMap.iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        int i = b(localEntry.getKey());
        paramMap = b;
        if (paramMap == null)
        {
          paramMap = b.g(a.length);
          b = paramMap;
        }
        if (i >= 0)
        {
          paramMap[i] = localEntry.getValue();
        }
        else
        {
          i = -i - 1;
          Object localObject = paramMap[i];
          if (!i.a(localEntry.getValue(), localObject)) {
            paramMap[i] = localEntry.getValue();
          }
        }
      }
    }
  }
  
  public final V remove(Object paramObject)
  {
    c();
    int i = h(paramObject);
    if (i < 0) {
      return null;
    }
    paramObject = b;
    i.b(paramObject);
    paramObject = paramObject[i];
    k(i);
    return (V)paramObject;
  }
  
  public final int size()
  {
    return q;
  }
  
  public final String toString()
  {
    Object localObject1 = new StringBuilder(q * 3 + 2);
    ((StringBuilder)localObject1).append("{");
    int i = 0;
    b localb = new b(this);
    while (localb.hasNext())
    {
      if (i > 0) {
        ((StringBuilder)localObject1).append(", ");
      }
      int j = b;
      c localc = a;
      if (j < f)
      {
        b = (j + 1);
        c = j;
        Object localObject2 = a[j];
        if (localObject2 == localc) {
          ((StringBuilder)localObject1).append("(this Map)");
        } else {
          ((StringBuilder)localObject1).append(localObject2);
        }
        ((StringBuilder)localObject1).append('=');
        localObject2 = a.b;
        i.b(localObject2);
        localObject2 = localObject2[c];
        if (localObject2 == a) {
          ((StringBuilder)localObject1).append("(this Map)");
        } else {
          ((StringBuilder)localObject1).append(localObject2);
        }
        localb.b();
        i++;
      }
      else
      {
        throw new NoSuchElementException();
      }
    }
    ((StringBuilder)localObject1).append("}");
    localObject1 = ((StringBuilder)localObject1).toString();
    i.d(localObject1, "toString(...)");
    return (String)localObject1;
  }
  
  public final Collection<V> values()
  {
    f localf1 = s;
    f localf2 = localf1;
    if (localf1 == null)
    {
      localf2 = new f(this);
      s = localf2;
    }
    return localf2;
  }
  
  public static final class a {}
  
  public static final class b<K, V>
    extends c.d<K, V>
    implements Iterator<Map.Entry<K, V>>
  {
    public b(c<K, V> paramc)
    {
      super();
    }
    
    public final Object next()
    {
      a();
      int i = b;
      Object localObject = a;
      if (i < f)
      {
        b = (i + 1);
        c = i;
        localObject = new c.c((c)localObject, i);
        b();
        return localObject;
      }
      throw new NoSuchElementException();
    }
  }
  
  public static final class c<K, V>
    implements Map.Entry<K, V>
  {
    public final c<K, V> a;
    public final int b;
    public final int c;
    
    public c(c<K, V> paramc, int paramInt)
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
  
  public static class d<K, V>
  {
    public final c<K, V> a;
    public int b;
    public int c;
    public int d;
    
    public d(c<K, V> paramc)
    {
      a = paramc;
      c = -1;
      d = p;
      b();
    }
    
    public final void a()
    {
      if (a.p == d) {
        return;
      }
      throw new ConcurrentModificationException();
    }
    
    public final void b()
    {
      for (;;)
      {
        int i = b;
        c localc = a;
        if ((i >= f) || (c[i] >= 0)) {
          break;
        }
        b = (i + 1);
      }
    }
    
    public final boolean hasNext()
    {
      boolean bool;
      if (b < a.f) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final void remove()
    {
      a();
      int i;
      if (c != -1) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        a.c();
        a.k(c);
        c = -1;
        d = a.p;
        return;
      }
      throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
    }
  }
  
  public static final class e<K, V>
    extends c.d<K, V>
    implements Iterator<K>
  {
    public e(c<K, V> paramc)
    {
      super();
    }
    
    public final K next()
    {
      a();
      int i = b;
      Object localObject = a;
      if (i < f)
      {
        b = (i + 1);
        c = i;
        localObject = a[i];
        b();
        return (K)localObject;
      }
      throw new NoSuchElementException();
    }
  }
  
  public static final class f<K, V>
    extends c.d<K, V>
    implements Iterator<V>
  {
    public f(c<K, V> paramc)
    {
      super();
    }
    
    public final V next()
    {
      a();
      int i = b;
      Object localObject = a;
      if (i < f)
      {
        b = (i + 1);
        c = i;
        localObject = b;
        i.b(localObject);
        localObject = localObject[c];
        b();
        return (V)localObject;
      }
      throw new NoSuchElementException();
    }
  }
}

/* Location:
 * Qualified Name:     tb.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */