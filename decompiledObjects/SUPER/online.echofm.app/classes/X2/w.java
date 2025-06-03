package X2;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

public abstract class w
  implements Map, Serializable
{
  public static final Map.Entry[] r = new Map.Entry[0];
  private static final long serialVersionUID = 912559L;
  public transient y o;
  public transient y p;
  public transient t q;
  
  public static a a()
  {
    return new a();
  }
  
  public static w b(Iterable paramIterable)
  {
    int i;
    if ((paramIterable instanceof Collection)) {
      i = ((Collection)paramIterable).size();
    } else {
      i = 4;
    }
    a locala = new a(i);
    locala.h(paramIterable);
    return locala.a();
  }
  
  public static w c(Map paramMap)
  {
    if (((paramMap instanceof w)) && (!(paramMap instanceof SortedMap)))
    {
      w localw = (w)paramMap;
      if (!localw.h()) {
        return localw;
      }
    }
    return b(paramMap.entrySet());
  }
  
  public static w j()
  {
    return T.v;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new InvalidObjectException("Use SerializedForm");
  }
  
  public final void clear()
  {
    throw new UnsupportedOperationException();
  }
  
  public boolean containsKey(Object paramObject)
  {
    boolean bool;
    if (get(paramObject) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean containsValue(Object paramObject)
  {
    return k().contains(paramObject);
  }
  
  public abstract y d();
  
  public abstract y e();
  
  public boolean equals(Object paramObject)
  {
    return G.c(this, paramObject);
  }
  
  public abstract t f();
  
  public y g()
  {
    y localy1 = o;
    y localy2 = localy1;
    if (localy1 == null)
    {
      localy2 = d();
      o = localy2;
    }
    return localy2;
  }
  
  public abstract Object get(Object paramObject);
  
  public final Object getOrDefault(Object paramObject1, Object paramObject2)
  {
    paramObject1 = get(paramObject1);
    if (paramObject1 != null) {
      return paramObject1;
    }
    return paramObject2;
  }
  
  public abstract boolean h();
  
  public int hashCode()
  {
    return a0.d(g());
  }
  
  public y i()
  {
    y localy1 = p;
    y localy2 = localy1;
    if (localy1 == null)
    {
      localy2 = e();
      p = localy2;
    }
    return localy2;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (size() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public t k()
  {
    t localt1 = q;
    t localt2 = localt1;
    if (localt1 == null)
    {
      localt2 = f();
      q = localt2;
    }
    return localt2;
  }
  
  public final Object put(Object paramObject1, Object paramObject2)
  {
    throw new UnsupportedOperationException();
  }
  
  public final void putAll(Map paramMap)
  {
    throw new UnsupportedOperationException();
  }
  
  public final Object remove(Object paramObject)
  {
    throw new UnsupportedOperationException();
  }
  
  public String toString()
  {
    return G.k(this);
  }
  
  public Object writeReplace()
  {
    return new b(this);
  }
  
  public static class a
  {
    public Comparator a;
    public Object[] b;
    public int c;
    public boolean d;
    public a e;
    
    public a()
    {
      this(4);
    }
    
    public a(int paramInt)
    {
      b = new Object[paramInt * 2];
      c = 0;
      d = false;
    }
    
    public static void i(Object[] paramArrayOfObject, int paramInt, Comparator paramComparator)
    {
      Map.Entry[] arrayOfEntry = new Map.Entry[paramInt];
      int i = 0;
      for (int j = 0; j < paramInt; j++)
      {
        int k = j * 2;
        Object localObject1 = paramArrayOfObject[k];
        Objects.requireNonNull(localObject1);
        Object localObject2 = paramArrayOfObject[(k + 1)];
        Objects.requireNonNull(localObject2);
        arrayOfEntry[j] = new AbstractMap.SimpleImmutableEntry(localObject1, localObject2);
      }
      Arrays.sort(arrayOfEntry, 0, paramInt, P.b(paramComparator).f(G.l()));
      for (j = i; j < paramInt; j++)
      {
        i = j * 2;
        paramArrayOfObject[i] = arrayOfEntry[j].getKey();
        paramArrayOfObject[(i + 1)] = arrayOfEntry[j].getValue();
      }
    }
    
    public w a()
    {
      return c();
    }
    
    public final w b(boolean paramBoolean)
    {
      Object localObject1;
      if (paramBoolean)
      {
        localObject1 = e;
        if (localObject1 != null) {
          throw ((a)localObject1).a();
        }
      }
      int i = c;
      int j;
      if (a == null)
      {
        localObject1 = b;
        j = i;
      }
      else
      {
        if (d) {
          b = Arrays.copyOf(b, i * 2);
        }
        localObject2 = b;
        j = i;
        localObject1 = localObject2;
        if (!paramBoolean)
        {
          localObject2 = e((Object[])localObject2, c);
          j = i;
          localObject1 = localObject2;
          if (localObject2.length < b.length)
          {
            j = localObject2.length >>> 1;
            localObject1 = localObject2;
          }
        }
        i((Object[])localObject1, j, a);
      }
      d = true;
      Object localObject2 = T.l(j, (Object[])localObject1, this);
      if (paramBoolean)
      {
        localObject1 = e;
        if (localObject1 != null) {
          throw ((a)localObject1).a();
        }
      }
      return (w)localObject2;
    }
    
    public w c()
    {
      return b(true);
    }
    
    public final void d(int paramInt)
    {
      paramInt *= 2;
      Object[] arrayOfObject = b;
      if (paramInt > arrayOfObject.length)
      {
        b = Arrays.copyOf(arrayOfObject, t.b.c(arrayOfObject.length, paramInt));
        d = false;
      }
    }
    
    public final Object[] e(Object[] paramArrayOfObject, int paramInt)
    {
      Object localObject1 = new HashSet();
      BitSet localBitSet = new BitSet();
      Object localObject2;
      for (int i = paramInt - 1; i >= 0; i--)
      {
        localObject2 = paramArrayOfObject[(i * 2)];
        Objects.requireNonNull(localObject2);
        if (!((Set)localObject1).add(localObject2)) {
          localBitSet.set(i);
        }
      }
      if (localBitSet.isEmpty()) {
        return paramArrayOfObject;
      }
      localObject1 = new Object[(paramInt - localBitSet.cardinality()) * 2];
      i = 0;
      int j = 0;
      while (i < paramInt * 2) {
        if (localBitSet.get(i >>> 1))
        {
          i += 2;
        }
        else
        {
          localObject2 = paramArrayOfObject[i];
          Objects.requireNonNull(localObject2);
          localObject1[j] = localObject2;
          int k = j + 2;
          int m = i + 2;
          localObject2 = paramArrayOfObject[(i + 1)];
          Objects.requireNonNull(localObject2);
          localObject1[(j + 1)] = localObject2;
          i = m;
          j = k;
        }
      }
      return (Object[])localObject1;
    }
    
    public a f(Object paramObject1, Object paramObject2)
    {
      d(c + 1);
      i.a(paramObject1, paramObject2);
      Object[] arrayOfObject = b;
      int i = c;
      arrayOfObject[(i * 2)] = paramObject1;
      arrayOfObject[(i * 2 + 1)] = paramObject2;
      c = (i + 1);
      return this;
    }
    
    public a g(Map.Entry paramEntry)
    {
      return f(paramEntry.getKey(), paramEntry.getValue());
    }
    
    public a h(Iterable paramIterable)
    {
      if ((paramIterable instanceof Collection)) {
        d(c + ((Collection)paramIterable).size());
      }
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext()) {
        g((Map.Entry)paramIterable.next());
      }
      return this;
    }
    
    public static final class a
    {
      public final Object a;
      public final Object b;
      public final Object c;
      
      public a(Object paramObject1, Object paramObject2, Object paramObject3)
      {
        a = paramObject1;
        b = paramObject2;
        c = paramObject3;
      }
      
      public IllegalArgumentException a()
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Multiple entries with same key: ");
        localStringBuilder.append(a);
        localStringBuilder.append("=");
        localStringBuilder.append(b);
        localStringBuilder.append(" and ");
        localStringBuilder.append(a);
        localStringBuilder.append("=");
        localStringBuilder.append(c);
        return new IllegalArgumentException(localStringBuilder.toString());
      }
    }
  }
  
  public static class b
    implements Serializable
  {
    private static final long serialVersionUID = 0L;
    public final Object o;
    public final Object p;
    
    public b(w paramw)
    {
      Object[] arrayOfObject1 = new Object[paramw.size()];
      Object[] arrayOfObject2 = new Object[paramw.size()];
      g0 localg0 = paramw.g().q();
      for (int i = 0; localg0.hasNext(); i++)
      {
        paramw = (Map.Entry)localg0.next();
        arrayOfObject1[i] = paramw.getKey();
        arrayOfObject2[i] = paramw.getValue();
      }
      o = arrayOfObject1;
      p = arrayOfObject2;
    }
    
    public final Object a()
    {
      Object[] arrayOfObject1 = (Object[])o;
      Object[] arrayOfObject2 = (Object[])p;
      w.a locala = b(arrayOfObject1.length);
      for (int i = 0; i < arrayOfObject1.length; i++) {
        locala.f(arrayOfObject1[i], arrayOfObject2[i]);
      }
      return locala.c();
    }
    
    public w.a b(int paramInt)
    {
      return new w.a(paramInt);
    }
    
    public final Object readResolve()
    {
      Object localObject1 = o;
      if (!(localObject1 instanceof y)) {
        return a();
      }
      Object localObject2 = (y)localObject1;
      Object localObject3 = (t)p;
      localObject1 = b(((AbstractCollection)localObject2).size());
      localObject2 = ((y)localObject2).q();
      localObject3 = ((t)localObject3).q();
      while (((Iterator)localObject2).hasNext()) {
        ((w.a)localObject1).f(((Iterator)localObject2).next(), ((Iterator)localObject3).next());
      }
      return ((w.a)localObject1).c();
    }
  }
}

/* Location:
 * Qualified Name:     X2.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */