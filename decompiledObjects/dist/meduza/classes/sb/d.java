package sb;

import ec.i;
import f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public abstract class d<E>
  extends b<E>
  implements List<E>
{
  public final void add(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof List)) {
      return false;
    }
    paramObject = (Collection)paramObject;
    i.e(paramObject, "other");
    if (size() != ((Collection)paramObject).size()) {}
    boolean bool2;
    for (;;)
    {
      bool2 = false;
      break;
      paramObject = ((Collection)paramObject).iterator();
      Iterator localIterator = iterator();
      do
      {
        bool2 = bool1;
        if (!localIterator.hasNext()) {
          break;
        }
      } while (i.a(localIterator.next(), ((Iterator)paramObject).next()));
    }
    return bool2;
  }
  
  public abstract E get(int paramInt);
  
  public final int hashCode()
  {
    Iterator localIterator = iterator();
    int j;
    for (int i = 1; localIterator.hasNext(); i = i * 31 + j)
    {
      Object localObject = localIterator.next();
      if (localObject != null) {
        j = localObject.hashCode();
      } else {
        j = 0;
      }
    }
    return i;
  }
  
  public int indexOf(E paramE)
  {
    Iterator localIterator = iterator();
    for (int i = 0; localIterator.hasNext(); i++) {
      if (i.a(localIterator.next(), paramE)) {
        return i;
      }
    }
    i = -1;
    return i;
  }
  
  public Iterator<E> iterator()
  {
    return new b();
  }
  
  public int lastIndexOf(E paramE)
  {
    ListIterator localListIterator = listIterator(size());
    while (localListIterator.hasPrevious()) {
      if (i.a(localListIterator.previous(), paramE)) {
        return localListIterator.nextIndex();
      }
    }
    int i = -1;
    return i;
  }
  
  public final ListIterator<E> listIterator()
  {
    return new c(0);
  }
  
  public final ListIterator<E> listIterator(int paramInt)
  {
    return new c(paramInt);
  }
  
  public final E remove(int paramInt)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final E set(int paramInt, E paramE)
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
  
  public final List<E> subList(int paramInt1, int paramInt2)
  {
    return new d(this, paramInt1, paramInt2);
  }
  
  public static final class a
  {
    public static void a(int paramInt1, int paramInt2, int paramInt3)
    {
      if ((paramInt1 >= 0) && (paramInt2 <= paramInt3))
      {
        if (paramInt1 <= paramInt2) {
          return;
        }
        throw new IllegalArgumentException(f.i("fromIndex: ", paramInt1, " > toIndex: ", paramInt2));
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
  }
  
  public class b
    implements Iterator<E>
  {
    public int a;
    
    public final boolean hasNext()
    {
      boolean bool;
      if (a < b.a()) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final E next()
    {
      if (hasNext())
      {
        d locald = b;
        int i = a;
        a = (i + 1);
        return (E)locald.get(i);
      }
      throw new NoSuchElementException();
    }
    
    public final void remove()
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
  
  public final class c
    extends d<E>.b
    implements ListIterator<E>
  {
    public c()
    {
      super();
      int j = a();
      int i;
      if ((i >= 0) && (i <= j))
      {
        a = i;
        return;
      }
      throw new IndexOutOfBoundsException(f.i("index: ", i, ", size: ", j));
    }
    
    public final void add(E paramE)
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean hasPrevious()
    {
      boolean bool;
      if (a > 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final int nextIndex()
    {
      return a;
    }
    
    public final E previous()
    {
      if (hasPrevious())
      {
        d locald = d.this;
        int i = a - 1;
        a = i;
        return (E)locald.get(i);
      }
      throw new NoSuchElementException();
    }
    
    public final int previousIndex()
    {
      return a - 1;
    }
    
    public final void set(E paramE)
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
  
  public static final class d<E>
    extends d<E>
    implements RandomAccess
  {
    public final d<E> a;
    public final int b;
    public int c;
    
    public d(d<? extends E> paramd, int paramInt1, int paramInt2)
    {
      a = paramd;
      b = paramInt1;
      d.a.a(paramInt1, paramInt2, paramd.a());
      c = (paramInt2 - paramInt1);
    }
    
    public final int a()
    {
      return c;
    }
    
    public final E get(int paramInt)
    {
      int i = c;
      if ((paramInt >= 0) && (paramInt < i)) {
        return (E)a.get(b + paramInt);
      }
      throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
    }
  }
}

/* Location:
 * Qualified Name:     sb.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */