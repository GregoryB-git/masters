package tb;

import ec.i;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import sb.d.a;
import sb.j;
import va.a;

public final class b$a<E>
  extends sb.f<E>
  implements RandomAccess, Serializable
{
  public E[] a;
  public final int b;
  public int c;
  public final a<E> d;
  public final b<E> e;
  
  public b$a(E[] paramArrayOfE, int paramInt1, int paramInt2, a<E> parama, b<E> paramb)
  {
    a = paramArrayOfE;
    b = paramInt1;
    c = paramInt2;
    d = parama;
    e = paramb;
    modCount = b.i(paramb);
  }
  
  public final int a()
  {
    m();
    return c;
  }
  
  public final void add(int paramInt, E paramE)
  {
    n();
    m();
    int i = c;
    if ((paramInt >= 0) && (paramInt <= i))
    {
      l(b + paramInt, paramE);
      return;
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final boolean add(E paramE)
  {
    n();
    m();
    l(b + c, paramE);
    return true;
  }
  
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    i.e(paramCollection, "elements");
    n();
    m();
    int i = c;
    if ((paramInt >= 0) && (paramInt <= i))
    {
      i = paramCollection.size();
      k(b + paramInt, paramCollection, i);
      boolean bool;
      if (i > 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    i.e(paramCollection, "elements");
    n();
    m();
    int i = paramCollection.size();
    k(b + c, paramCollection, i);
    boolean bool;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void clear()
  {
    n();
    m();
    p(b, c);
  }
  
  public final boolean equals(Object paramObject)
  {
    m();
    if (paramObject != this) {
      if ((paramObject instanceof List))
      {
        paramObject = (List)paramObject;
        if (x6.b.a(a, b, c, (List)paramObject)) {}
      }
      else
      {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public final E get(int paramInt)
  {
    m();
    int i = c;
    if ((paramInt >= 0) && (paramInt < i)) {
      return (E)a[(b + paramInt)];
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final E h(int paramInt)
  {
    n();
    m();
    int i = c;
    if ((paramInt >= 0) && (paramInt < i)) {
      return (E)o(b + paramInt);
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final int hashCode()
  {
    m();
    Object[] arrayOfObject = a;
    int i = b;
    int j = c;
    int k = 1;
    for (int m = 0; m < j; m++)
    {
      Object localObject = arrayOfObject[(i + m)];
      int n;
      if (localObject != null) {
        n = localObject.hashCode();
      } else {
        n = 0;
      }
      k = k * 31 + n;
    }
    return k;
  }
  
  public final int indexOf(Object paramObject)
  {
    m();
    for (int i = 0; i < c; i++) {
      if (i.a(a[(b + i)], paramObject)) {
        return i;
      }
    }
    return -1;
  }
  
  public final boolean isEmpty()
  {
    m();
    boolean bool;
    if (c == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Iterator<E> iterator()
  {
    return listIterator(0);
  }
  
  public final void k(int paramInt1, Collection<? extends E> paramCollection, int paramInt2)
  {
    modCount += 1;
    Object localObject = d;
    if (localObject != null)
    {
      ((a)localObject).k(paramInt1, paramCollection, paramInt2);
    }
    else
    {
      b localb = e;
      localObject = b.d;
      localb.k(paramInt1, paramCollection, paramInt2);
    }
    a = e.a;
    c += paramInt2;
  }
  
  public final void l(int paramInt, E paramE)
  {
    modCount += 1;
    Object localObject = d;
    if (localObject != null)
    {
      ((a)localObject).l(paramInt, paramE);
    }
    else
    {
      localObject = e;
      b localb = b.d;
      ((b)localObject).l(paramInt, paramE);
    }
    a = e.a;
    c += 1;
  }
  
  public final int lastIndexOf(Object paramObject)
  {
    m();
    for (int i = c - 1; i >= 0; i--) {
      if (i.a(a[(b + i)], paramObject)) {
        return i;
      }
    }
    return -1;
  }
  
  public final ListIterator<E> listIterator()
  {
    return listIterator(0);
  }
  
  public final ListIterator<E> listIterator(int paramInt)
  {
    m();
    int i = c;
    if ((paramInt >= 0) && (paramInt <= i)) {
      return new a(this, paramInt);
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final void m()
  {
    if (b.i(e) == modCount) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public final void n()
  {
    if (!e.c) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final E o(int paramInt)
  {
    modCount += 1;
    Object localObject = d;
    if (localObject != null)
    {
      localObject = ((a)localObject).o(paramInt);
    }
    else
    {
      b localb = e;
      localObject = b.d;
      localObject = localb.o(paramInt);
    }
    c -= 1;
    return (E)localObject;
  }
  
  public final void p(int paramInt1, int paramInt2)
  {
    if (paramInt2 > 0) {
      modCount += 1;
    }
    Object localObject = d;
    if (localObject != null)
    {
      ((a)localObject).p(paramInt1, paramInt2);
    }
    else
    {
      b localb = e;
      localObject = b.d;
      localb.p(paramInt1, paramInt2);
    }
    c -= paramInt2;
  }
  
  public final int q(int paramInt1, int paramInt2, Collection<? extends E> paramCollection, boolean paramBoolean)
  {
    Object localObject = d;
    if (localObject != null)
    {
      paramInt1 = ((a)localObject).q(paramInt1, paramInt2, paramCollection, paramBoolean);
    }
    else
    {
      localObject = e;
      b localb = b.d;
      paramInt1 = ((b)localObject).q(paramInt1, paramInt2, paramCollection, paramBoolean);
    }
    if (paramInt1 > 0) {
      modCount += 1;
    }
    c -= paramInt1;
    return paramInt1;
  }
  
  public final boolean remove(Object paramObject)
  {
    n();
    m();
    int i = indexOf(paramObject);
    if (i >= 0) {
      h(i);
    }
    boolean bool;
    if (i >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean removeAll(Collection<? extends Object> paramCollection)
  {
    i.e(paramCollection, "elements");
    n();
    m();
    int i = b;
    int j = c;
    boolean bool = false;
    if (q(i, j, paramCollection, false) > 0) {
      bool = true;
    }
    return bool;
  }
  
  public final boolean retainAll(Collection<? extends Object> paramCollection)
  {
    i.e(paramCollection, "elements");
    n();
    m();
    int i = b;
    int j = c;
    boolean bool = true;
    if (q(i, j, paramCollection, true) <= 0) {
      bool = false;
    }
    return bool;
  }
  
  public final E set(int paramInt, E paramE)
  {
    n();
    m();
    int i = c;
    if ((paramInt >= 0) && (paramInt < i))
    {
      Object[] arrayOfObject = a;
      i = b;
      Object localObject = arrayOfObject[(i + paramInt)];
      arrayOfObject[(i + paramInt)] = paramE;
      return (E)localObject;
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final List<E> subList(int paramInt1, int paramInt2)
  {
    d.a.a(paramInt1, paramInt2, c);
    return new a(a, b + paramInt1, paramInt2 - paramInt1, this, e);
  }
  
  public final Object[] toArray()
  {
    m();
    Object[] arrayOfObject = a;
    int i = b;
    int j = c + i;
    i.e(arrayOfObject, "<this>");
    a.b(j, arrayOfObject.length);
    arrayOfObject = Arrays.copyOfRange(arrayOfObject, i, j);
    i.d(arrayOfObject, "copyOfRange(...)");
    return arrayOfObject;
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    i.e(paramArrayOfT, "array");
    m();
    int i = paramArrayOfT.length;
    int j = c;
    if (i < j)
    {
      arrayOfObject = a;
      i = b;
      paramArrayOfT = Arrays.copyOfRange(arrayOfObject, i, j + i, paramArrayOfT.getClass());
      i.d(paramArrayOfT, "copyOfRange(...)");
      return paramArrayOfT;
    }
    Object[] arrayOfObject = a;
    i = b;
    j.l(arrayOfObject, 0, paramArrayOfT, i, j + i);
    j = c;
    if (j < paramArrayOfT.length) {
      paramArrayOfT[j] = null;
    }
    return paramArrayOfT;
  }
  
  public final String toString()
  {
    m();
    return x6.b.b(a, b, c, this);
  }
  
  public static final class a<E>
    implements ListIterator<E>
  {
    public final b.a<E> a;
    public int b;
    public int c;
    public int d;
    
    public a(b.a<E> parama, int paramInt)
    {
      a = parama;
      b = paramInt;
      c = -1;
      d = b.a.i(parama);
    }
    
    public final void a()
    {
      if (b.i(a.e) == d) {
        return;
      }
      throw new ConcurrentModificationException();
    }
    
    public final void add(E paramE)
    {
      a();
      b.a locala = a;
      int i = b;
      b = (i + 1);
      locala.add(i, paramE);
      c = -1;
      d = b.a.i(a);
    }
    
    public final boolean hasNext()
    {
      boolean bool;
      if (b < a.c) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final boolean hasPrevious()
    {
      boolean bool;
      if (b > 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public final E next()
    {
      a();
      int i = b;
      b.a locala = a;
      if (i < c)
      {
        b = (i + 1);
        c = i;
        return (E)a[(b + i)];
      }
      throw new NoSuchElementException();
    }
    
    public final int nextIndex()
    {
      return b;
    }
    
    public final E previous()
    {
      a();
      int i = b;
      if (i > 0)
      {
        i--;
        b = i;
        c = i;
        b.a locala = a;
        return (E)a[(b + i)];
      }
      throw new NoSuchElementException();
    }
    
    public final int previousIndex()
    {
      return b - 1;
    }
    
    public final void remove()
    {
      a();
      int i = c;
      int j;
      if (i != -1) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        a.h(i);
        b = c;
        c = -1;
        d = b.a.i(a);
        return;
      }
      throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
    }
    
    public final void set(E paramE)
    {
      a();
      int i = c;
      int j;
      if (i != -1) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        a.set(i, paramE);
        return;
      }
      throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
    }
  }
}

/* Location:
 * Qualified Name:     tb.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */