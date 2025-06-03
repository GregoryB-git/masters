package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public abstract class d5
  extends AbstractMap
{
  public final int o;
  public List p;
  public Map q;
  public boolean r;
  public volatile p5 s;
  public Map t;
  public volatile h5 u;
  
  public d5(int paramInt)
  {
    o = paramInt;
    p = Collections.emptyList();
    q = Collections.emptyMap();
    t = Collections.emptyMap();
  }
  
  public static d5 b(int paramInt)
  {
    return new c5(paramInt);
  }
  
  public final int a(Comparable paramComparable)
  {
    int i = p.size();
    int j = i - 1;
    int k;
    if (j >= 0)
    {
      k = paramComparable.compareTo((Comparable)((k5)p.get(j)).getKey());
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
        int m = (i + j) / 2;
        k = paramComparable.compareTo((Comparable)((k5)p.get(m)).getKey());
        if (k < 0) {
          j = m - 1;
        } else if (k > 0) {
          i = m + 1;
        } else {
          return m;
        }
      }
    }
  }
  
  public void clear()
  {
    q();
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
    return (a((Comparable)paramObject) >= 0) || (q.containsKey(paramObject));
  }
  
  public final Object d(Comparable paramComparable, Object paramObject)
  {
    q();
    int i = a(paramComparable);
    if (i >= 0) {
      return ((k5)p.get(i)).setValue(paramObject);
    }
    q();
    if ((p.isEmpty()) && (!(p instanceof ArrayList))) {
      p = new ArrayList(o);
    }
    int j = -(i + 1);
    if (j >= o) {
      return p().put(paramComparable, paramObject);
    }
    int k = p.size();
    i = o;
    if (k == i)
    {
      k5 localk5 = (k5)p.remove(i - 1);
      p().put((Comparable)localk5.getKey(), localk5.getValue());
    }
    p.add(j, new k5(this, paramComparable, paramObject));
    return null;
  }
  
  public Set entrySet()
  {
    if (s == null) {
      s = new p5(this, null);
    }
    return s;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof d5)) {
      return super.equals(paramObject);
    }
    paramObject = (d5)paramObject;
    int i = size();
    if (i != ((d5)paramObject).size()) {
      return false;
    }
    int j = g();
    Object localObject;
    if (j != ((d5)paramObject).g()) {
      localObject = entrySet();
    }
    for (paramObject = ((d5)paramObject).entrySet();; paramObject = q)
    {
      return localObject.equals(paramObject);
      for (int k = 0; k < j; k++) {
        if (!h(k).equals(((d5)paramObject).h(k))) {
          return false;
        }
      }
      if (j == i) {
        break;
      }
      localObject = q;
    }
    return true;
  }
  
  public void f()
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
  
  public final int g()
  {
    return p.size();
  }
  
  public Object get(Object paramObject)
  {
    paramObject = (Comparable)paramObject;
    int i = a((Comparable)paramObject);
    if (i >= 0) {
      return ((k5)p.get(i)).getValue();
    }
    return q.get(paramObject);
  }
  
  public final Map.Entry h(int paramInt)
  {
    return (Map.Entry)p.get(paramInt);
  }
  
  public int hashCode()
  {
    int i = g();
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += ((k5)p.get(j)).hashCode();
      j++;
    }
    j = k;
    if (q.size() > 0) {
      j = k + q.hashCode();
    }
    return j;
  }
  
  public final Iterable j()
  {
    if (q.isEmpty()) {
      return j5.a();
    }
    return q.entrySet();
  }
  
  public final Object k(int paramInt)
  {
    q();
    Object localObject = ((k5)p.remove(paramInt)).getValue();
    if (!q.isEmpty())
    {
      Iterator localIterator = p().entrySet().iterator();
      p.add(new k5(this, (Map.Entry)localIterator.next()));
      localIterator.remove();
    }
    return localObject;
  }
  
  public final Set m()
  {
    if (u == null) {
      u = new h5(this, null);
    }
    return u;
  }
  
  public final boolean o()
  {
    return r;
  }
  
  public final SortedMap p()
  {
    q();
    if ((q.isEmpty()) && (!(q instanceof TreeMap)))
    {
      TreeMap localTreeMap = new TreeMap();
      q = localTreeMap;
      t = localTreeMap.descendingMap();
    }
    return (SortedMap)q;
  }
  
  public final void q()
  {
    if (!r) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public Object remove(Object paramObject)
  {
    q();
    paramObject = (Comparable)paramObject;
    int i = a((Comparable)paramObject);
    if (i >= 0) {
      return k(i);
    }
    if (q.isEmpty()) {
      return null;
    }
    return q.remove(paramObject);
  }
  
  public int size()
  {
    return p.size() + q.size();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.d5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */