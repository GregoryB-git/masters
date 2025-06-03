package s0;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class f1<K extends Comparable<K>, V>
  extends AbstractMap<K, V>
{
  public final int a;
  public List<f1<K, V>.b> b;
  public Map<K, V> c;
  public boolean d;
  public volatile f1<K, V>.d e;
  public Map<K, V> f;
  
  public f1(int paramInt)
  {
    a = paramInt;
    b = Collections.emptyList();
    c = Collections.emptyMap();
    f = Collections.emptyMap();
  }
  
  public final int b(K paramK)
  {
    int i = b.size() - 1;
    if (i >= 0)
    {
      j = paramK.compareTo(b.get(i)).a);
      if (j > 0) {
        return -(i + 2);
      }
      if (j == 0) {
        return i;
      }
    }
    int j = 0;
    while (j <= i)
    {
      int k = (j + i) / 2;
      int m = paramK.compareTo(b.get(k)).a);
      if (m < 0) {
        i = k - 1;
      } else if (m > 0) {
        j = k + 1;
      } else {
        return k;
      }
    }
    return -(j + 1);
  }
  
  public final void c()
  {
    if (!d) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void clear()
  {
    c();
    if (!b.isEmpty()) {
      b.clear();
    }
    if (!c.isEmpty()) {
      c.clear();
    }
  }
  
  public final boolean containsKey(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    boolean bool;
    if ((b((Comparable)paramObject) < 0) && (!c.containsKey(paramObject))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final Map.Entry<K, V> d(int paramInt)
  {
    return (Map.Entry)b.get(paramInt);
  }
  
  public final int e()
  {
    return b.size();
  }
  
  public final Set<Map.Entry<K, V>> entrySet()
  {
    if (e == null) {
      e = new d();
    }
    return e;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof f1)) {
      return super.equals(paramObject);
    }
    paramObject = (f1)paramObject;
    int i = size();
    if (i != ((f1)paramObject).size()) {
      return false;
    }
    int j = e();
    if (j != ((f1)paramObject).e()) {
      return entrySet().equals(((f1)paramObject).entrySet());
    }
    for (int k = 0; k < j; k++) {
      if (!d(k).equals(((f1)paramObject).d(k))) {
        return false;
      }
    }
    if (j != i) {
      return c.equals(c);
    }
    return true;
  }
  
  public final Iterable<Map.Entry<K, V>> f()
  {
    Object localObject;
    if (c.isEmpty()) {
      localObject = a.b;
    } else {
      localObject = c.entrySet();
    }
    return (Iterable<Map.Entry<K, V>>)localObject;
  }
  
  public final SortedMap<K, V> g()
  {
    c();
    if ((c.isEmpty()) && (!(c instanceof TreeMap)))
    {
      TreeMap localTreeMap1 = new TreeMap();
      c = localTreeMap1;
      TreeMap localTreeMap2 = (TreeMap)localTreeMap1;
      f = localTreeMap1.descendingMap();
    }
    return (SortedMap)c;
  }
  
  public final V get(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    int i = b((Comparable)paramObject);
    if (i >= 0) {
      return (V)b.get(i)).b;
    }
    return (V)c.get(paramObject);
  }
  
  public void h()
  {
    if (!d)
    {
      Map localMap;
      if (c.isEmpty()) {
        localMap = Collections.emptyMap();
      } else {
        localMap = Collections.unmodifiableMap(c);
      }
      c = localMap;
      if (f.isEmpty()) {
        localMap = Collections.emptyMap();
      } else {
        localMap = Collections.unmodifiableMap(f);
      }
      f = localMap;
      d = true;
    }
  }
  
  public final int hashCode()
  {
    int i = e();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += ((b)b.get(j)).hashCode();
      j++;
    }
    j = k;
    if (c.size() > 0) {
      j = k + c.hashCode();
    }
    return j;
  }
  
  public final V i(K paramK, V paramV)
  {
    c();
    int i = b(paramK);
    if (i >= 0) {
      return (V)((b)b.get(i)).setValue(paramV);
    }
    c();
    if ((b.isEmpty()) && (!(b instanceof ArrayList))) {
      b = new ArrayList(a);
    }
    int j = -(i + 1);
    if (j >= a) {
      return (V)g().put(paramK, paramV);
    }
    i = b.size();
    int k = a;
    if (i == k)
    {
      b localb = (b)b.remove(k - 1);
      g().put(a, b);
    }
    b.add(j, new b(paramK, paramV));
    return null;
  }
  
  public final V j(int paramInt)
  {
    c();
    Object localObject = b.remove(paramInt)).b;
    if (!c.isEmpty())
    {
      Iterator localIterator = g().entrySet().iterator();
      List localList = b;
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localList.add(new b((Comparable)localEntry.getKey(), localEntry.getValue()));
      localIterator.remove();
    }
    return (V)localObject;
  }
  
  public final V remove(Object paramObject)
  {
    c();
    paramObject = (Comparable)paramObject;
    int i = b((Comparable)paramObject);
    if (i >= 0) {
      return (V)j(i);
    }
    if (c.isEmpty()) {
      return null;
    }
    return (V)c.remove(paramObject);
  }
  
  public final int size()
  {
    int i = b.size();
    return c.size() + i;
  }
  
  public static final class a
  {
    public static final a a = new a();
    public static final b b = new b();
    
    public static final class a
      implements Iterator<Object>
    {
      public final boolean hasNext()
      {
        return false;
      }
      
      public final Object next()
      {
        throw new NoSuchElementException();
      }
      
      public final void remove()
      {
        throw new UnsupportedOperationException();
      }
    }
    
    public static final class b
      implements Iterable<Object>
    {
      public final Iterator<Object> iterator()
      {
        return f1.a.a;
      }
    }
  }
  
  public final class b
    implements Map.Entry<K, V>, Comparable<f1<K, V>.b>
  {
    public final K a;
    public V b;
    
    public b() {}
    
    public b(V paramV)
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
      Object localObject = f1.this;
      int i = f1.o;
      ((f1)localObject).c();
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
  
  public final class c
    implements Iterator<Map.Entry<K, V>>
  {
    public int a = -1;
    public boolean b;
    public Iterator<Map.Entry<K, V>> c;
    
    public c() {}
    
    public final Iterator<Map.Entry<K, V>> a()
    {
      if (c == null) {
        c = c.entrySet().iterator();
      }
      return c;
    }
    
    public final boolean hasNext()
    {
      int i = a;
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (i + 1 >= b.size()) {
        if ((!c.isEmpty()) && (a().hasNext())) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      return bool2;
    }
    
    public final Object next()
    {
      b = true;
      int i = a + 1;
      a = i;
      Object localObject;
      if (i < b.size()) {
        localObject = b.get(a);
      } else {
        localObject = a().next();
      }
      return (Map.Entry)localObject;
    }
    
    public final void remove()
    {
      if (b)
      {
        b = false;
        f1 localf1 = f1.this;
        int i = f1.o;
        localf1.c();
        if (a < b.size())
        {
          localf1 = f1.this;
          i = a;
          a = (i - 1);
          localf1.j(i);
        }
        else
        {
          a().remove();
        }
        return;
      }
      throw new IllegalStateException("remove() was called before next()");
    }
  }
  
  public class d
    extends AbstractSet<Map.Entry<K, V>>
  {
    public d() {}
    
    public final boolean add(Object paramObject)
    {
      paramObject = (Map.Entry)paramObject;
      boolean bool;
      if (!contains(paramObject))
      {
        i((Comparable)((Map.Entry)paramObject).getKey(), ((Map.Entry)paramObject).getValue());
        bool = true;
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    
    public final void clear()
    {
      f1.this.clear();
    }
    
    public final boolean contains(Object paramObject)
    {
      Object localObject = (Map.Entry)paramObject;
      paramObject = get(((Map.Entry)localObject).getKey());
      localObject = ((Map.Entry)localObject).getValue();
      boolean bool;
      if ((paramObject != localObject) && ((paramObject == null) || (!paramObject.equals(localObject)))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public Iterator<Map.Entry<K, V>> iterator()
    {
      return new f1.c(f1.this);
    }
    
    public final boolean remove(Object paramObject)
    {
      paramObject = (Map.Entry)paramObject;
      if (contains(paramObject))
      {
        remove(((Map.Entry)paramObject).getKey());
        return true;
      }
      return false;
    }
    
    public final int size()
    {
      return f1.this.size();
    }
  }
}

/* Location:
 * Qualified Name:     s0.f1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */