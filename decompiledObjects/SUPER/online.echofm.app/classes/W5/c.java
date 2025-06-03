package W5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

public abstract class c
  extends a
  implements List, h6.a
{
  public static final a o = new a(null);
  
  public void add(int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof List)) {
      return false;
    }
    return o.e(this, (Collection)paramObject);
  }
  
  public abstract Object get(int paramInt);
  
  public int hashCode()
  {
    return o.f(this);
  }
  
  public int indexOf(Object paramObject)
  {
    Iterator localIterator = iterator();
    for (int i = 0; localIterator.hasNext(); i++) {
      if (Intrinsics.a(localIterator.next(), paramObject)) {
        return i;
      }
    }
    i = -1;
    return i;
  }
  
  public Iterator iterator()
  {
    return new b();
  }
  
  public int lastIndexOf(Object paramObject)
  {
    ListIterator localListIterator = listIterator(size());
    while (localListIterator.hasPrevious()) {
      if (Intrinsics.a(localListIterator.previous(), paramObject)) {
        return localListIterator.nextIndex();
      }
    }
    int i = -1;
    return i;
  }
  
  public ListIterator listIterator()
  {
    return new c(0);
  }
  
  public ListIterator listIterator(int paramInt)
  {
    return new c(paramInt);
  }
  
  public Object remove(int paramInt)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public Object set(int paramInt, Object paramObject)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public List subList(int paramInt1, int paramInt2)
  {
    return new d(this, paramInt1, paramInt2);
  }
  
  public static final class a
  {
    public final void a(int paramInt1, int paramInt2)
    {
      if ((paramInt1 >= 0) && (paramInt1 < paramInt2)) {
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("index: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(", size: ");
      localStringBuilder.append(paramInt2);
      throw new IndexOutOfBoundsException(localStringBuilder.toString());
    }
    
    public final void b(int paramInt1, int paramInt2)
    {
      if ((paramInt1 >= 0) && (paramInt1 <= paramInt2)) {
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("index: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(", size: ");
      localStringBuilder.append(paramInt2);
      throw new IndexOutOfBoundsException(localStringBuilder.toString());
    }
    
    public final void c(int paramInt1, int paramInt2, int paramInt3)
    {
      if ((paramInt1 >= 0) && (paramInt2 <= paramInt3))
      {
        if (paramInt1 <= paramInt2) {
          return;
        }
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("fromIndex: ");
        localStringBuilder.append(paramInt1);
        localStringBuilder.append(" > toIndex: ");
        localStringBuilder.append(paramInt2);
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("fromIndex: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(", toIndex: ");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append(", size: ");
      localStringBuilder.append(paramInt3);
      throw new IndexOutOfBoundsException(localStringBuilder.toString());
    }
    
    public final int d(int paramInt1, int paramInt2)
    {
      int i = paramInt1 + (paramInt1 >> 1);
      paramInt1 = i;
      if (i - paramInt2 < 0) {
        paramInt1 = paramInt2;
      }
      i = paramInt1;
      if (paramInt1 - 2147483639 > 0) {
        if (paramInt2 > 2147483639) {
          i = Integer.MAX_VALUE;
        } else {
          i = 2147483639;
        }
      }
      return i;
    }
    
    public final boolean e(Collection paramCollection1, Collection paramCollection2)
    {
      Intrinsics.checkNotNullParameter(paramCollection1, "c");
      Intrinsics.checkNotNullParameter(paramCollection2, "other");
      if (paramCollection1.size() != paramCollection2.size()) {
        return false;
      }
      paramCollection2 = paramCollection2.iterator();
      paramCollection1 = paramCollection1.iterator();
      while (paramCollection1.hasNext()) {
        if (!Intrinsics.a(paramCollection1.next(), paramCollection2.next())) {
          return false;
        }
      }
      return true;
    }
    
    public final int f(Collection paramCollection)
    {
      Intrinsics.checkNotNullParameter(paramCollection, "c");
      paramCollection = paramCollection.iterator();
      int j;
      for (int i = 1; paramCollection.hasNext(); i = i * 31 + j)
      {
        Object localObject = paramCollection.next();
        if (localObject != null) {
          j = localObject.hashCode();
        } else {
          j = 0;
        }
      }
      return i;
    }
  }
  
  public class b
    implements Iterator, h6.a
  {
    public int o;
    
    public b() {}
    
    public final int b()
    {
      return o;
    }
    
    public final void d(int paramInt)
    {
      o = paramInt;
    }
    
    public boolean hasNext()
    {
      boolean bool;
      if (o < size()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Object next()
    {
      if (hasNext())
      {
        c localc = c.this;
        int i = o;
        o = (i + 1);
        return localc.get(i);
      }
      throw new NoSuchElementException();
    }
    
    public void remove()
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
  
  public class c
    extends c.b
    implements ListIterator, h6.a
  {
    public c(int paramInt)
    {
      super();
      c.o.b(paramInt, size());
      d(paramInt);
    }
    
    public void add(Object paramObject)
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public boolean hasPrevious()
    {
      boolean bool;
      if (b() > 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int nextIndex()
    {
      return b();
    }
    
    public Object previous()
    {
      if (hasPrevious())
      {
        c localc = c.this;
        d(b() - 1);
        return localc.get(b());
      }
      throw new NoSuchElementException();
    }
    
    public int previousIndex()
    {
      return b() - 1;
    }
    
    public void set(Object paramObject)
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
  
  public static final class d
    extends c
    implements RandomAccess
  {
    public final c p;
    public final int q;
    public int r;
    
    public d(c paramc, int paramInt1, int paramInt2)
    {
      p = paramc;
      q = paramInt1;
      c.o.c(paramInt1, paramInt2, paramc.size());
      r = (paramInt2 - paramInt1);
    }
    
    public int a()
    {
      return r;
    }
    
    public Object get(int paramInt)
    {
      c.o.a(paramInt, r);
      return p.get(q + paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     W5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */