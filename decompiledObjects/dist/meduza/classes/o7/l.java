package o7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import r7.a;
import x6.b;

public final class l<K, V>
  extends AbstractMap<K, V>
  implements Serializable
{
  public static final Object r = new Object();
  public transient Object a;
  public transient int[] b;
  public transient Object[] c;
  public transient Object[] d;
  public transient int e = a.D(3, 1);
  public transient int f;
  public transient c o;
  public transient a p;
  public transient e q;
  
  public final Map<K, V> b()
  {
    Object localObject = a;
    if ((localObject instanceof Map)) {
      return (Map)localObject;
    }
    return null;
  }
  
  public final int c(Object paramObject)
  {
    if (f()) {
      return -1;
    }
    int i = b.s0(paramObject);
    int j = (1 << (e & 0x1F)) - 1;
    Object localObject = a;
    Objects.requireNonNull(localObject);
    int k = c0.f(i & j, localObject);
    if (k == 0) {
      return -1;
    }
    int m = j;
    int n;
    do
    {
      k--;
      n = h()[k];
      if (((n & m) == (i & m)) && (b.Q(paramObject, d(k)))) {
        return k;
      }
      n &= j;
      k = n;
    } while (n != 0);
    return -1;
  }
  
  public final void clear()
  {
    if (f()) {
      return;
    }
    e += 32;
    Object localObject = b();
    if (localObject != null)
    {
      e = a.D(size(), 3);
      ((Map)localObject).clear();
      a = null;
    }
    else
    {
      Arrays.fill(i(), 0, f, null);
      Arrays.fill(j(), 0, f, null);
      localObject = a;
      Objects.requireNonNull(localObject);
      if ((localObject instanceof byte[])) {
        Arrays.fill((byte[])localObject, (byte)0);
      } else if ((localObject instanceof short[])) {
        Arrays.fill((short[])localObject, (short)0);
      } else {
        Arrays.fill((int[])localObject, 0);
      }
      Arrays.fill(h(), 0, f, 0);
    }
    f = 0;
  }
  
  public final boolean containsKey(Object paramObject)
  {
    Map localMap = b();
    boolean bool;
    if (localMap != null) {
      bool = localMap.containsKey(paramObject);
    } else if (c(paramObject) != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean containsValue(Object paramObject)
  {
    Map localMap = b();
    if (localMap != null) {
      return localMap.containsValue(paramObject);
    }
    for (int i = 0; i < f; i++) {
      if (b.Q(paramObject, l(i))) {
        return true;
      }
    }
    return false;
  }
  
  public final K d(int paramInt)
  {
    return (K)i()[paramInt];
  }
  
  public final void e(int paramInt1, int paramInt2)
  {
    Object localObject1 = a;
    Objects.requireNonNull(localObject1);
    int[] arrayOfInt = h();
    Object[] arrayOfObject1 = i();
    Object[] arrayOfObject2 = j();
    int i = size() - 1;
    if (paramInt1 < i)
    {
      Object localObject2 = arrayOfObject1[i];
      arrayOfObject1[paramInt1] = localObject2;
      arrayOfObject2[paramInt1] = arrayOfObject2[i];
      arrayOfObject1[i] = null;
      arrayOfObject2[i] = null;
      arrayOfInt[paramInt1] = arrayOfInt[i];
      arrayOfInt[i] = 0;
      int j = b.s0(localObject2) & paramInt2;
      int k = c0.f(j, localObject1);
      int m = i + 1;
      i = k;
      if (k == m) {
        c0.g(localObject1, j, paramInt1 + 1);
      } else {
        for (;;)
        {
          k = i - 1;
          j = arrayOfInt[k];
          i = j & paramInt2;
          if (i == m)
          {
            arrayOfInt[k] = (paramInt1 + 1 & paramInt2 | j & paramInt2);
            break;
          }
        }
      }
    }
    else
    {
      arrayOfObject1[paramInt1] = null;
      arrayOfObject2[paramInt1] = null;
      arrayOfInt[paramInt1] = 0;
    }
  }
  
  public final Set<Map.Entry<K, V>> entrySet()
  {
    a locala1 = p;
    a locala2 = locala1;
    if (locala1 == null)
    {
      locala2 = new a();
      p = locala2;
    }
    return locala2;
  }
  
  public final boolean f()
  {
    boolean bool;
    if (a == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Object g(Object paramObject)
  {
    if (f()) {
      return r;
    }
    int i = (1 << (e & 0x1F)) - 1;
    Object localObject = a;
    Objects.requireNonNull(localObject);
    int j = c0.e(paramObject, null, i, localObject, h(), i(), null);
    if (j == -1) {
      return r;
    }
    paramObject = l(j);
    e(j, i);
    f -= 1;
    e += 32;
    return paramObject;
  }
  
  public final V get(Object paramObject)
  {
    Map localMap = b();
    if (localMap != null) {
      return (V)localMap.get(paramObject);
    }
    int i = c(paramObject);
    if (i == -1) {
      return null;
    }
    return (V)l(i);
  }
  
  public final int[] h()
  {
    int[] arrayOfInt = b;
    Objects.requireNonNull(arrayOfInt);
    return (int[])arrayOfInt;
  }
  
  public final Object[] i()
  {
    Object[] arrayOfObject = c;
    Objects.requireNonNull(arrayOfObject);
    return (Object[])arrayOfObject;
  }
  
  public final boolean isEmpty()
  {
    boolean bool;
    if (size() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Object[] j()
  {
    Object[] arrayOfObject = d;
    Objects.requireNonNull(arrayOfObject);
    return (Object[])arrayOfObject;
  }
  
  public final int k(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject1 = c0.a(paramInt2);
    int i = paramInt2 - 1;
    if (paramInt4 != 0) {
      c0.g(localObject1, paramInt3 & i, paramInt4 + 1);
    }
    Object localObject2 = a;
    Objects.requireNonNull(localObject2);
    int[] arrayOfInt = h();
    for (paramInt2 = 0; paramInt2 <= paramInt1; paramInt2++)
    {
      int j;
      for (paramInt3 = c0.f(paramInt2, localObject2); paramInt3 != 0; paramInt3 = j & paramInt1)
      {
        paramInt4 = paramInt3 - 1;
        j = arrayOfInt[paramInt4];
        int k = paramInt1 & j | paramInt2;
        int m = k & i;
        int n = c0.f(m, localObject1);
        c0.g(localObject1, m, paramInt3);
        arrayOfInt[paramInt4] = (i & k | n & i);
      }
    }
    a = localObject1;
    e = (32 - Integer.numberOfLeadingZeros(i) & 0x1F | e & 0xFFFFFFE0);
    return i;
  }
  
  public final Set<K> keySet()
  {
    c localc1 = o;
    c localc2 = localc1;
    if (localc1 == null)
    {
      localc2 = new c();
      o = localc2;
    }
    return localc2;
  }
  
  public final V l(int paramInt)
  {
    return (V)j()[paramInt];
  }
  
  public final V put(K paramK, V paramV)
  {
    int k;
    if (f())
    {
      b.I(f(), "Arrays already allocated");
      i = e;
      j = Math.max(i + 1, 2);
      k = Integer.highestOneBit(j);
      m = k;
      if (j > (int)(k * 1.0D))
      {
        m = k << 1;
        if (m <= 0) {
          m = 1073741824;
        }
      }
      m = Math.max(4, m);
      a = c0.a(m);
      e = (32 - Integer.numberOfLeadingZeros(m - 1) & 0x1F | e & 0xFFFFFFE0);
      b = new int[i];
      c = new Object[i];
      d = new Object[i];
    }
    Object localObject1 = b();
    if (localObject1 != null) {
      return (V)((Map)localObject1).put(paramK, paramV);
    }
    int[] arrayOfInt = h();
    Object[] arrayOfObject = i();
    localObject1 = j();
    int n = f;
    int i1 = n + 1;
    int i2 = b.s0(paramK);
    int j = (1 << (e & 0x1F)) - 1;
    int m = i2 & j;
    Object localObject2 = a;
    Objects.requireNonNull(localObject2);
    int i = c0.f(m, localObject2);
    int i3;
    if (i == 0)
    {
      if (i1 <= j)
      {
        localObject1 = a;
        Objects.requireNonNull(localObject1);
        c0.g(localObject1, m, i1);
        m = j;
        break label522;
      }
    }
    else
    {
      i3 = j;
      m = i2 & i3;
      k = 0;
    }
    for (;;)
    {
      int i4 = i - 1;
      i = arrayOfInt[i4];
      int i5 = i & i3;
      if ((i5 == m) && (b.Q(paramK, arrayOfObject[i4])))
      {
        paramK = localObject1[i4];
        localObject1[i4] = paramV;
        return paramK;
      }
      i &= j;
      k++;
      if (i == 0)
      {
        if (k >= 9)
        {
          localObject1 = new LinkedHashMap((1 << (e & 0x1F)) - 1 + 1, 1.0F);
          if (isEmpty()) {
            m = -1;
          } else {
            m = 0;
          }
          for (;;)
          {
            if (m < 0) {
              break label436;
            }
            ((Map)localObject1).put(d(m), l(m));
            m++;
            if (m >= f) {
              break;
            }
          }
          label436:
          a = localObject1;
          b = null;
          c = null;
          d = null;
          e += 32;
          return (V)((Map)localObject1).put(paramK, paramV);
        }
        if (i1 > j)
        {
          m = k(j, c0.d(j), i2, n);
        }
        else
        {
          arrayOfInt[i4] = (i1 & j | i5);
          m = j;
        }
        label522:
        k = h().length;
        if (i1 > k)
        {
          i = Math.min(1073741823, Math.max(1, k >>> 1) + k | 0x1);
          if (i != k)
          {
            b = Arrays.copyOf(h(), i);
            c = Arrays.copyOf(i(), i);
            d = Arrays.copyOf(j(), i);
          }
        }
        h()[n] = (m & i2 | m & 0x0);
        i()[n] = paramK;
        j()[n] = paramV;
        f = i1;
        e += 32;
        return null;
      }
    }
  }
  
  public final V remove(Object paramObject)
  {
    Object localObject = b();
    if (localObject != null) {
      return (V)((Map)localObject).remove(paramObject);
    }
    localObject = g(paramObject);
    paramObject = localObject;
    if (localObject == r) {
      paramObject = null;
    }
    return (V)paramObject;
  }
  
  public final int size()
  {
    Map localMap = b();
    int i;
    if (localMap != null) {
      i = localMap.size();
    } else {
      i = f;
    }
    return i;
  }
  
  public final Collection<V> values()
  {
    e locale1 = q;
    e locale2 = locale1;
    if (locale1 == null)
    {
      locale2 = new e();
      q = locale2;
    }
    return locale2;
  }
  
  public final class a
    extends AbstractSet<Map.Entry<K, V>>
  {
    public a() {}
    
    public final void clear()
    {
      l.this.clear();
    }
    
    public final boolean contains(Object paramObject)
    {
      Map localMap = b();
      if (localMap != null) {
        return localMap.entrySet().contains(paramObject);
      }
      boolean bool1 = paramObject instanceof Map.Entry;
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        paramObject = (Map.Entry)paramObject;
        int i = c(((Map.Entry)paramObject).getKey());
        bool3 = bool2;
        if (i != -1)
        {
          bool3 = bool2;
          if (b.Q(l(i), ((Map.Entry)paramObject).getValue())) {
            bool3 = true;
          }
        }
      }
      return bool3;
    }
    
    public final Iterator<Map.Entry<K, V>> iterator()
    {
      Object localObject = l.this;
      Map localMap = ((l)localObject).b();
      if (localMap != null) {
        localObject = localMap.entrySet().iterator();
      } else {
        localObject = new j((l)localObject);
      }
      return (Iterator<Map.Entry<K, V>>)localObject;
    }
    
    public final boolean remove(Object paramObject)
    {
      Object localObject1 = b();
      if (localObject1 != null) {
        return ((Map)localObject1).entrySet().remove(paramObject);
      }
      if ((paramObject instanceof Map.Entry))
      {
        localObject1 = (Map.Entry)paramObject;
        if (f()) {
          return false;
        }
        int i = (1 << (e & 0x1F)) - 1;
        paramObject = ((Map.Entry)localObject1).getKey();
        Object localObject2 = ((Map.Entry)localObject1).getValue();
        localObject1 = a;
        Objects.requireNonNull(localObject1);
        int j = c0.e(paramObject, localObject2, i, localObject1, h(), i(), j());
        if (j == -1) {
          return false;
        }
        e(j, i);
        paramObject = l.this;
        f -= 1;
        e += 32;
        return true;
      }
      return false;
    }
    
    public final int size()
    {
      return l.this.size();
    }
  }
  
  public abstract class b<T>
    implements Iterator<T>
  {
    public int a = e;
    public int b;
    public int c;
    
    public b()
    {
      int i;
      if (isEmpty()) {
        i = -1;
      } else {
        i = 0;
      }
      b = i;
      c = -1;
    }
    
    public abstract T a(int paramInt);
    
    public final boolean hasNext()
    {
      boolean bool;
      if (b >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final T next()
    {
      if (e == a)
      {
        if (hasNext())
        {
          int i = b;
          c = i;
          Object localObject = a(i);
          l locall = l.this;
          i = b + 1;
          if (i >= f) {
            i = -1;
          }
          b = i;
          return (T)localObject;
        }
        throw new NoSuchElementException();
      }
      throw new ConcurrentModificationException();
    }
    
    public final void remove()
    {
      if (e == a)
      {
        boolean bool;
        if (c >= 0) {
          bool = true;
        } else {
          bool = false;
        }
        b.I(bool, "no calls to next() since the last call to remove()");
        a += 32;
        l locall = l.this;
        locall.remove(locall.d(c));
        locall = l.this;
        int i = b;
        locall.getClass();
        b = (i - 1);
        c = -1;
        return;
      }
      throw new ConcurrentModificationException();
    }
  }
  
  public final class c
    extends AbstractSet<K>
  {
    public c() {}
    
    public final void clear()
    {
      l.this.clear();
    }
    
    public final boolean contains(Object paramObject)
    {
      return containsKey(paramObject);
    }
    
    public final Iterator<K> iterator()
    {
      Object localObject = l.this;
      Map localMap = ((l)localObject).b();
      if (localMap != null) {
        localObject = localMap.keySet().iterator();
      } else {
        localObject = new i((l)localObject);
      }
      return (Iterator<K>)localObject;
    }
    
    public final boolean remove(Object paramObject)
    {
      Map localMap = b();
      boolean bool;
      if (localMap != null) {
        bool = localMap.keySet().remove(paramObject);
      } else if (g(paramObject) != l.r) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final int size()
    {
      return l.this.size();
    }
  }
  
  public final class d
    extends e<K, V>
  {
    public final K a;
    public int b;
    
    public d(int paramInt)
    {
      Object localObject = l.r;
      a = d(paramInt);
      b = paramInt;
    }
    
    public final void a()
    {
      int i = b;
      if ((i == -1) || (i >= size()) || (!b.Q(a, d(b))))
      {
        l locall = l.this;
        Object localObject1 = a;
        Object localObject2 = l.r;
        b = locall.c(localObject1);
      }
    }
    
    public final K getKey()
    {
      return (K)a;
    }
    
    public final V getValue()
    {
      Object localObject = b();
      if (localObject != null) {
        return (V)((Map)localObject).get(a);
      }
      a();
      int i = b;
      if (i == -1) {
        localObject = null;
      } else {
        localObject = l(i);
      }
      return (V)localObject;
    }
    
    public final V setValue(V paramV)
    {
      Object localObject1 = b();
      if (localObject1 != null) {
        return (V)((Map)localObject1).put(a, paramV);
      }
      a();
      int i = b;
      if (i == -1)
      {
        put(a, paramV);
        return null;
      }
      Object localObject2 = l(i);
      localObject1 = l.this;
      i = b;
      ((l)localObject1).j()[i] = paramV;
      return (V)localObject2;
    }
  }
  
  public final class e
    extends AbstractCollection<V>
  {
    public e() {}
    
    public final void clear()
    {
      l.this.clear();
    }
    
    public final Iterator<V> iterator()
    {
      l locall = l.this;
      Object localObject = locall.b();
      if (localObject != null) {
        localObject = ((Map)localObject).values().iterator();
      } else {
        localObject = new k(locall);
      }
      return (Iterator<V>)localObject;
    }
    
    public final int size()
    {
      return l.this.size();
    }
  }
}

/* Location:
 * Qualified Name:     o7.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */