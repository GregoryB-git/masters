package com.google.protobuf;

import android.support.v4.media.a;
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

public abstract class c0
  extends AbstractMap
{
  public final int o;
  public List p;
  public Map q;
  public boolean r;
  public volatile g s;
  public Map t;
  public volatile c u;
  
  public c0(int paramInt)
  {
    o = paramInt;
    p = Collections.emptyList();
    q = Collections.emptyMap();
    t = Collections.emptyMap();
  }
  
  public static c0 q(int paramInt)
  {
    return new a(paramInt);
  }
  
  public void clear()
  {
    g();
    if (!p.isEmpty()) {
      p.clear();
    }
    if (!q.isEmpty()) {
      q.clear();
    }
  }
  
  public boolean containsKey(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    boolean bool;
    if ((f((Comparable)paramObject) < 0) && (!q.containsKey(paramObject))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public Set entrySet()
  {
    if (s == null) {
      s = new g(null);
    }
    return s;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof c0)) {
      return super.equals(paramObject);
    }
    paramObject = (c0)paramObject;
    int i = size();
    if (i != ((c0)paramObject).size()) {
      return false;
    }
    int j = k();
    if (j != ((c0)paramObject).k()) {
      return entrySet().equals(((c0)paramObject).entrySet());
    }
    for (int k = 0; k < j; k++) {
      if (!j(k).equals(((c0)paramObject).j(k))) {
        return false;
      }
    }
    if (j != i) {
      return q.equals(q);
    }
    return true;
  }
  
  public final int f(Comparable paramComparable)
  {
    int i = p.size();
    int j = i - 1;
    int k;
    if (j >= 0)
    {
      k = paramComparable.compareTo(((e)p.get(j)).h());
      if (k <= 0) {}
    }
    for (j = i + 1;; j = i + 1)
    {
      return -j;
      if (k == 0) {
        return j;
      }
      i = 0;
      while (i <= j)
      {
        k = (i + j) / 2;
        int m = paramComparable.compareTo(((e)p.get(k)).h());
        if (m < 0) {
          j = k - 1;
        } else if (m > 0) {
          i = k + 1;
        } else {
          return k;
        }
      }
    }
  }
  
  public final void g()
  {
    if (!r) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public Object get(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    int i = f((Comparable)paramObject);
    if (i >= 0) {
      return ((e)p.get(i)).getValue();
    }
    return q.get(paramObject);
  }
  
  public Set h()
  {
    if (u == null) {
      u = new c(null);
    }
    return u;
  }
  
  public int hashCode()
  {
    int i = k();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += ((e)p.get(j)).hashCode();
      j++;
    }
    j = k;
    if (l() > 0) {
      j = k + q.hashCode();
    }
    return j;
  }
  
  public final void i()
  {
    g();
    if ((p.isEmpty()) && (!(p instanceof ArrayList))) {
      p = new ArrayList(o);
    }
  }
  
  public Map.Entry j(int paramInt)
  {
    return (Map.Entry)p.get(paramInt);
  }
  
  public int k()
  {
    return p.size();
  }
  
  public int l()
  {
    return q.size();
  }
  
  public Iterable m()
  {
    Object localObject;
    if (q.isEmpty()) {
      localObject = d.b();
    } else {
      localObject = q.entrySet();
    }
    return (Iterable)localObject;
  }
  
  public final SortedMap n()
  {
    g();
    if ((q.isEmpty()) && (!(q instanceof TreeMap)))
    {
      TreeMap localTreeMap = new TreeMap();
      q = localTreeMap;
      t = localTreeMap.descendingMap();
    }
    return (SortedMap)q;
  }
  
  public boolean o()
  {
    return r;
  }
  
  public void p()
  {
    if (!r)
    {
      Map localMap;
      if (q.isEmpty()) {
        localMap = Collections.emptyMap();
      } else {
        localMap = Collections.unmodifiableMap(q);
      }
      q = localMap;
      if (t.isEmpty()) {
        localMap = Collections.emptyMap();
      } else {
        localMap = Collections.unmodifiableMap(t);
      }
      t = localMap;
      r = true;
    }
  }
  
  public Object r(Comparable paramComparable, Object paramObject)
  {
    g();
    int i = f(paramComparable);
    if (i >= 0) {
      return ((e)p.get(i)).setValue(paramObject);
    }
    i();
    i = -(i + 1);
    if (i >= o) {
      return n().put(paramComparable, paramObject);
    }
    int j = p.size();
    int k = o;
    if (j == k)
    {
      e locale = (e)p.remove(k - 1);
      n().put(locale.h(), locale.getValue());
    }
    p.add(i, new e(paramComparable, paramObject));
    return null;
  }
  
  public Object remove(Object paramObject)
  {
    g();
    paramObject = (Comparable)paramObject;
    int i = f((Comparable)paramObject);
    if (i >= 0) {
      return s(i);
    }
    if (q.isEmpty()) {
      return null;
    }
    return q.remove(paramObject);
  }
  
  public final Object s(int paramInt)
  {
    g();
    Object localObject = ((e)p.remove(paramInt)).getValue();
    if (!q.isEmpty())
    {
      Iterator localIterator = n().entrySet().iterator();
      p.add(new e((Map.Entry)localIterator.next()));
      localIterator.remove();
    }
    return localObject;
  }
  
  public int size()
  {
    return p.size() + q.size();
  }
  
  public class a
    extends c0
  {
    public a()
    {
      super(null);
    }
    
    public void p()
    {
      if (!o()) {
        if (k() <= 0)
        {
          Iterator localIterator = m().iterator();
          if (localIterator.hasNext())
          {
            a.a(((Map.Entry)localIterator.next()).getKey());
            throw null;
          }
        }
        else
        {
          a.a(j(0).getKey());
          throw null;
        }
      }
      super.p();
    }
  }
  
  public class b
    implements Iterator
  {
    public int o = c0.b(c0.this).size();
    public Iterator p;
    
    public b() {}
    
    public final Iterator b()
    {
      if (p == null) {
        p = c0.e(c0.this).entrySet().iterator();
      }
      return p;
    }
    
    public Map.Entry d()
    {
      if (b().hasNext()) {}
      int i;
      for (Object localObject = b().next();; localObject = ((List)localObject).get(i))
      {
        return (Map.Entry)localObject;
        localObject = c0.b(c0.this);
        i = o - 1;
        o = i;
      }
    }
    
    public boolean hasNext()
    {
      int i = o;
      boolean bool;
      if (((i > 0) && (i <= c0.b(c0.this).size())) || (b().hasNext())) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void remove()
    {
      throw new UnsupportedOperationException();
    }
  }
  
  public class c
    extends c0.g
  {
    public c()
    {
      super(null);
    }
    
    public Iterator iterator()
    {
      return new c0.b(c0.this, null);
    }
  }
  
  public static abstract class d
  {
    public static final Iterator a = new a();
    public static final Iterable b = new b();
    
    public static Iterable b()
    {
      return b;
    }
    
    public class a
      implements Iterator
    {
      public boolean hasNext()
      {
        return false;
      }
      
      public Object next()
      {
        throw new NoSuchElementException();
      }
      
      public void remove()
      {
        throw new UnsupportedOperationException();
      }
    }
    
    public class b
      implements Iterable
    {
      public Iterator iterator()
      {
        return c0.d.a();
      }
    }
  }
  
  public class e
    implements Map.Entry, Comparable
  {
    public final Comparable o;
    public Object p;
    
    public e(Comparable paramComparable, Object paramObject)
    {
      o = paramComparable;
      p = paramObject;
    }
    
    public e(Map.Entry paramEntry)
    {
      this((Comparable)paramEntry.getKey(), paramEntry.getValue());
    }
    
    public int c(e parame)
    {
      return h().compareTo(parame.h());
    }
    
    public final boolean e(Object paramObject1, Object paramObject2)
    {
      boolean bool;
      if (paramObject1 == null)
      {
        if (paramObject2 == null) {
          bool = true;
        } else {
          bool = false;
        }
      }
      else {
        bool = paramObject1.equals(paramObject2);
      }
      return bool;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (paramObject == this) {
        return true;
      }
      if (!(paramObject instanceof Map.Entry)) {
        return false;
      }
      paramObject = (Map.Entry)paramObject;
      if ((!e(o, ((Map.Entry)paramObject).getKey())) || (!e(p, ((Map.Entry)paramObject).getValue()))) {
        bool = false;
      }
      return bool;
    }
    
    public Object getValue()
    {
      return p;
    }
    
    public Comparable h()
    {
      return o;
    }
    
    public int hashCode()
    {
      Object localObject = o;
      int i = 0;
      int j;
      if (localObject == null) {
        j = 0;
      } else {
        j = localObject.hashCode();
      }
      localObject = p;
      if (localObject != null) {
        i = localObject.hashCode();
      }
      return j ^ i;
    }
    
    public Object setValue(Object paramObject)
    {
      c0.a(c0.this);
      Object localObject = p;
      p = paramObject;
      return localObject;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(o);
      localStringBuilder.append("=");
      localStringBuilder.append(p);
      return localStringBuilder.toString();
    }
  }
  
  public class f
    implements Iterator
  {
    public int o = -1;
    public boolean p;
    public Iterator q;
    
    public f() {}
    
    public final Iterator b()
    {
      if (q == null) {
        q = c0.c(c0.this).entrySet().iterator();
      }
      return q;
    }
    
    public Map.Entry d()
    {
      p = true;
      int i = o + 1;
      o = i;
      if (i < c0.b(c0.this).size()) {}
      for (Object localObject = c0.b(c0.this).get(o);; localObject = b().next()) {
        return (Map.Entry)localObject;
      }
    }
    
    public boolean hasNext()
    {
      int i = o;
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (i + 1 >= c0.b(c0.this).size()) {
        if ((!c0.c(c0.this).isEmpty()) && (b().hasNext())) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
      return bool2;
    }
    
    public void remove()
    {
      if (p)
      {
        p = false;
        c0.a(c0.this);
        if (o < c0.b(c0.this).size())
        {
          c0 localc0 = c0.this;
          int i = o;
          o = (i - 1);
          c0.d(localc0, i);
        }
        else
        {
          b().remove();
        }
        return;
      }
      throw new IllegalStateException("remove() was called before next()");
    }
  }
  
  public class g
    extends AbstractSet
  {
    public g() {}
    
    public boolean a(Map.Entry paramEntry)
    {
      if (!contains(paramEntry))
      {
        r((Comparable)paramEntry.getKey(), paramEntry.getValue());
        return true;
      }
      return false;
    }
    
    public void clear()
    {
      c0.this.clear();
    }
    
    public boolean contains(Object paramObject)
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
    
    public Iterator iterator()
    {
      return new c0.f(c0.this, null);
    }
    
    public boolean remove(Object paramObject)
    {
      paramObject = (Map.Entry)paramObject;
      if (contains(paramObject))
      {
        remove(((Map.Entry)paramObject).getKey());
        return true;
      }
      return false;
    }
    
    public int size()
    {
      return c0.this.size();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */