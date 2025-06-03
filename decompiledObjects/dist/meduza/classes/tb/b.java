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

public final class b<E>
  extends sb.f<E>
  implements RandomAccess, Serializable
{
  public static final b d;
  public E[] a;
  public int b;
  public boolean c;
  
  static
  {
    b localb = new b(0);
    c = true;
    d = localb;
  }
  
  public b(int paramInt)
  {
    a = x6.b.g(paramInt);
  }
  
  public final int a()
  {
    return b;
  }
  
  public final void add(int paramInt, E paramE)
  {
    m();
    int i = b;
    if ((paramInt >= 0) && (paramInt <= i))
    {
      modCount += 1;
      n(paramInt, 1);
      a[paramInt] = paramE;
      return;
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final boolean add(E paramE)
  {
    m();
    int i = b;
    modCount += 1;
    n(i, 1);
    a[i] = paramE;
    return true;
  }
  
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    i.e(paramCollection, "elements");
    m();
    int i = b;
    if ((paramInt >= 0) && (paramInt <= i))
    {
      i = paramCollection.size();
      k(paramInt, paramCollection, i);
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
    m();
    int i = paramCollection.size();
    k(b, paramCollection, i);
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
    m();
    p(0, b);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramObject != this)
    {
      bool2 = bool1;
      if ((paramObject instanceof List))
      {
        paramObject = (List)paramObject;
        bool2 = bool1;
        if (!x6.b.a(a, 0, b, (List)paramObject)) {}
      }
    }
    else
    {
      bool2 = true;
    }
    return bool2;
  }
  
  public final E get(int paramInt)
  {
    int i = b;
    if ((paramInt >= 0) && (paramInt < i)) {
      return (E)a[paramInt];
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final E h(int paramInt)
  {
    m();
    int i = b;
    if ((paramInt >= 0) && (paramInt < i)) {
      return (E)o(paramInt);
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final int hashCode()
  {
    Object[] arrayOfObject = a;
    int i = b;
    int j = 1;
    for (int k = 0; k < i; k++)
    {
      Object localObject = arrayOfObject[(0 + k)];
      int m;
      if (localObject != null) {
        m = localObject.hashCode();
      } else {
        m = 0;
      }
      j = j * 31 + m;
    }
    return j;
  }
  
  public final int indexOf(Object paramObject)
  {
    for (int i = 0; i < b; i++) {
      if (i.a(a[i], paramObject)) {
        return i;
      }
    }
    return -1;
  }
  
  public final boolean isEmpty()
  {
    boolean bool;
    if (b == 0) {
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
    n(paramInt1, paramInt2);
    paramCollection = paramCollection.iterator();
    for (int i = 0; i < paramInt2; i++) {
      a[(paramInt1 + i)] = paramCollection.next();
    }
  }
  
  public final void l(int paramInt, E paramE)
  {
    modCount += 1;
    n(paramInt, 1);
    a[paramInt] = paramE;
  }
  
  public final int lastIndexOf(Object paramObject)
  {
    for (int i = b - 1; i >= 0; i--) {
      if (i.a(a[i], paramObject)) {
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
    int i = b;
    if ((paramInt >= 0) && (paramInt <= i)) {
      return new b(this, paramInt);
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final void m()
  {
    if (!c) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void n(int paramInt1, int paramInt2)
  {
    int i = b + paramInt2;
    if (i >= 0)
    {
      Object[] arrayOfObject = a;
      if (i > arrayOfObject.length)
      {
        int j = arrayOfObject.length;
        int k = j + (j >> 1);
        j = k;
        if (k - i < 0) {
          j = i;
        }
        k = j;
        if (j - 2147483639 > 0) {
          if (i > 2147483639) {
            k = Integer.MAX_VALUE;
          } else {
            k = 2147483639;
          }
        }
        arrayOfObject = Arrays.copyOf(arrayOfObject, k);
        i.d(arrayOfObject, "copyOf(...)");
        a = arrayOfObject;
      }
      arrayOfObject = a;
      j.l(arrayOfObject, paramInt1 + paramInt2, arrayOfObject, paramInt1, b);
      b += paramInt2;
      return;
    }
    throw new OutOfMemoryError();
  }
  
  public final E o(int paramInt)
  {
    modCount += 1;
    Object[] arrayOfObject = a;
    Object localObject = arrayOfObject[paramInt];
    j.l(arrayOfObject, paramInt, arrayOfObject, paramInt + 1, b);
    arrayOfObject = a;
    paramInt = b;
    i.e(arrayOfObject, "<this>");
    arrayOfObject[(paramInt - 1)] = null;
    b -= 1;
    return (E)localObject;
  }
  
  public final void p(int paramInt1, int paramInt2)
  {
    if (paramInt2 > 0) {
      modCount += 1;
    }
    Object[] arrayOfObject = a;
    j.l(arrayOfObject, paramInt1, arrayOfObject, paramInt1 + paramInt2, b);
    arrayOfObject = a;
    paramInt1 = b;
    x6.b.o0(arrayOfObject, paramInt1 - paramInt2, paramInt1);
    b -= paramInt2;
  }
  
  public final int q(int paramInt1, int paramInt2, Collection<? extends E> paramCollection, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    while (i < paramInt2)
    {
      Object[] arrayOfObject = a;
      int k = paramInt1 + i;
      if (paramCollection.contains(arrayOfObject[k]) == paramBoolean)
      {
        arrayOfObject = a;
        i++;
        arrayOfObject[(j + paramInt1)] = arrayOfObject[k];
        j++;
      }
      else
      {
        i++;
      }
    }
    i = paramInt2 - j;
    paramCollection = a;
    j.l(paramCollection, paramInt1 + j, paramCollection, paramInt2 + paramInt1, b);
    paramCollection = a;
    paramInt1 = b;
    x6.b.o0(paramCollection, paramInt1 - i, paramInt1);
    if (i > 0) {
      modCount += 1;
    }
    b -= i;
    return i;
  }
  
  public final boolean remove(Object paramObject)
  {
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
    m();
    int i = b;
    boolean bool = false;
    if (q(0, i, paramCollection, false) > 0) {
      bool = true;
    }
    return bool;
  }
  
  public final boolean retainAll(Collection<? extends Object> paramCollection)
  {
    i.e(paramCollection, "elements");
    m();
    int i = b;
    boolean bool = false;
    if (q(0, i, paramCollection, true) > 0) {
      bool = true;
    }
    return bool;
  }
  
  public final E set(int paramInt, E paramE)
  {
    m();
    int i = b;
    if ((paramInt >= 0) && (paramInt < i))
    {
      Object[] arrayOfObject = a;
      Object localObject = arrayOfObject[paramInt];
      arrayOfObject[paramInt] = paramE;
      return (E)localObject;
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final List<E> subList(int paramInt1, int paramInt2)
  {
    d.a.a(paramInt1, paramInt2, b);
    return new a(a, paramInt1, paramInt2 - paramInt1, null, this);
  }
  
  public final Object[] toArray()
  {
    Object[] arrayOfObject = a;
    int i = b;
    i.e(arrayOfObject, "<this>");
    a.b(i, arrayOfObject.length);
    arrayOfObject = Arrays.copyOfRange(arrayOfObject, 0, i);
    i.d(arrayOfObject, "copyOfRange(...)");
    return arrayOfObject;
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    i.e(paramArrayOfT, "array");
    int i = paramArrayOfT.length;
    int j = b;
    if (i < j)
    {
      paramArrayOfT = Arrays.copyOfRange(a, 0, j, paramArrayOfT.getClass());
      i.d(paramArrayOfT, "copyOfRange(...)");
      return paramArrayOfT;
    }
    j.l(a, 0, paramArrayOfT, 0, j);
    i = b;
    if (i < paramArrayOfT.length) {
      paramArrayOfT[i] = null;
    }
    return paramArrayOfT;
  }
  
  public final String toString()
  {
    return x6.b.b(a, 0, b, this);
  }
  
  public static final class a<E>
    extends sb.f<E>
    implements RandomAccess, Serializable
  {
    public E[] a;
    public final int b;
    public int c;
    public final a<E> d;
    public final b<E> e;
    
    public a(E[] paramArrayOfE, int paramInt1, int paramInt2, a<E> parama, b<E> paramb)
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
  
  public static final class b<E>
    implements ListIterator<E>
  {
    public final b<E> a;
    public int b;
    public int c;
    public int d;
    
    public b(b<E> paramb, int paramInt)
    {
      a = paramb;
      b = paramInt;
      c = -1;
      d = b.i(paramb);
    }
    
    public final void a()
    {
      if (b.i(a) == d) {
        return;
      }
      throw new ConcurrentModificationException();
    }
    
    public final void add(E paramE)
    {
      a();
      b localb = a;
      int i = b;
      b = (i + 1);
      localb.add(i, paramE);
      c = -1;
      d = b.i(a);
    }
    
    public final boolean hasNext()
    {
      boolean bool;
      if (b < a.b) {
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
      b localb = a;
      if (i < b)
      {
        b = (i + 1);
        c = i;
        return (E)a[i];
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
        return (E)a.a[i];
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
        d = b.i(a);
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
 * Qualified Name:     tb.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */