package W5;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

public final class f
  extends d
{
  public static final a r = new a(null);
  public static final Object[] s = new Object[0];
  public int o;
  public Object[] p = s;
  public int q;
  
  public final int D(int paramInt)
  {
    if (paramInt == k.k(p)) {
      paramInt = 0;
    } else {
      paramInt++;
    }
    return paramInt;
  }
  
  public final int M(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0) {
      i = paramInt + p.length;
    }
    return i;
  }
  
  public final void S(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = p;
    if (paramInt1 < paramInt2)
    {
      j.e(arrayOfObject, null, paramInt1, paramInt2);
    }
    else
    {
      j.e(arrayOfObject, null, paramInt1, arrayOfObject.length);
      j.e(p, null, 0, paramInt2);
    }
  }
  
  public final int T(int paramInt)
  {
    Object[] arrayOfObject = p;
    int i = paramInt;
    if (paramInt >= arrayOfObject.length) {
      i = paramInt - arrayOfObject.length;
    }
    return i;
  }
  
  public final void U()
  {
    modCount += 1;
  }
  
  public final Object V()
  {
    if (!isEmpty())
    {
      U();
      Object[] arrayOfObject = p;
      int i = o;
      Object localObject = arrayOfObject[i];
      arrayOfObject[i] = null;
      o = D(i);
      q = (size() - 1);
      return localObject;
    }
    throw new NoSuchElementException("ArrayDeque is empty.");
  }
  
  public final Object W()
  {
    Object localObject;
    if (isEmpty()) {
      localObject = null;
    } else {
      localObject = V();
    }
    return localObject;
  }
  
  public final Object X()
  {
    if (!isEmpty())
    {
      U();
      int i = T(o + m.h(this));
      Object[] arrayOfObject = p;
      Object localObject = arrayOfObject[i];
      arrayOfObject[i] = null;
      q = (size() - 1);
      return localObject;
    }
    throw new NoSuchElementException("ArrayDeque is empty.");
  }
  
  public final void Y(int paramInt1, int paramInt2)
  {
    int i = T(o + (paramInt1 - 1));
    int j = T(o + (paramInt2 - 1));
    paramInt2 = i;
    while (paramInt1 > 0)
    {
      int k = paramInt2 + 1;
      i = Math.min(paramInt1, Math.min(k, j + 1));
      Object[] arrayOfObject = p;
      j -= i;
      paramInt2 -= i;
      j.c(arrayOfObject, arrayOfObject, j + 1, paramInt2 + 1, k);
      paramInt2 = M(paramInt2);
      j = M(j);
      paramInt1 -= i;
    }
  }
  
  public final void Z(int paramInt1, int paramInt2)
  {
    int i = T(o + paramInt2);
    paramInt1 = T(o + paramInt1);
    int j = size();
    int k = paramInt2;
    paramInt2 = i;
    for (;;)
    {
      j -= k;
      if (j <= 0) {
        break;
      }
      Object[] arrayOfObject = p;
      k = Math.min(j, Math.min(arrayOfObject.length - paramInt2, arrayOfObject.length - paramInt1));
      arrayOfObject = p;
      i = paramInt2 + k;
      j.c(arrayOfObject, arrayOfObject, paramInt1, paramInt2, i);
      paramInt2 = T(i);
      paramInt1 = T(paramInt1 + k);
    }
  }
  
  public int a()
  {
    return q;
  }
  
  public void add(int paramInt, Object paramObject)
  {
    c.o.b(paramInt, size());
    if (paramInt == size())
    {
      g(paramObject);
      return;
    }
    if (paramInt == 0)
    {
      f(paramObject);
      return;
    }
    U();
    s(size() + 1);
    int i = T(o + paramInt);
    Object[] arrayOfObject;
    if (paramInt < size() + 1 >> 1)
    {
      int j = q(i);
      paramInt = q(o);
      i = o;
      if (j >= i)
      {
        arrayOfObject = p;
        arrayOfObject[paramInt] = arrayOfObject[i];
        j.c(arrayOfObject, arrayOfObject, i, i + 1, j + 1);
      }
      else
      {
        arrayOfObject = p;
        j.c(arrayOfObject, arrayOfObject, i - 1, i, arrayOfObject.length);
        arrayOfObject = p;
        arrayOfObject[(arrayOfObject.length - 1)] = arrayOfObject[0];
        j.c(arrayOfObject, arrayOfObject, 0, 1, j + 1);
      }
      p[j] = paramObject;
      o = paramInt;
    }
    else
    {
      paramInt = T(o + size());
      arrayOfObject = p;
      if (i < paramInt)
      {
        j.c(arrayOfObject, arrayOfObject, i + 1, i, paramInt);
      }
      else
      {
        j.c(arrayOfObject, arrayOfObject, 1, 0, paramInt);
        arrayOfObject = p;
        arrayOfObject[0] = arrayOfObject[(arrayOfObject.length - 1)];
        j.c(arrayOfObject, arrayOfObject, i + 1, i, arrayOfObject.length - 1);
      }
      p[i] = paramObject;
    }
    q = (size() + 1);
  }
  
  public boolean add(Object paramObject)
  {
    g(paramObject);
    return true;
  }
  
  public boolean addAll(int paramInt, Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    c.o.b(paramInt, size());
    if (paramCollection.isEmpty()) {
      return false;
    }
    if (paramInt == size()) {
      return addAll(paramCollection);
    }
    U();
    s(size() + paramCollection.size());
    int i = T(o + size());
    int j = T(o + paramInt);
    int k = paramCollection.size();
    Object[] arrayOfObject;
    if (paramInt < size() + 1 >> 1)
    {
      i = o;
      paramInt = i - k;
      if (j >= i)
      {
        if (paramInt >= 0)
        {
          arrayOfObject = p;
          j.c(arrayOfObject, arrayOfObject, paramInt, i, j);
        }
        else
        {
          arrayOfObject = p;
          paramInt += arrayOfObject.length;
          int m = arrayOfObject.length - paramInt;
          if (m >= j - i)
          {
            j.c(arrayOfObject, arrayOfObject, paramInt, i, j);
          }
          else
          {
            j.c(arrayOfObject, arrayOfObject, paramInt, i, i + m);
            arrayOfObject = p;
            j.c(arrayOfObject, arrayOfObject, 0, o + m, j);
          }
        }
      }
      else
      {
        arrayOfObject = p;
        j.c(arrayOfObject, arrayOfObject, paramInt, i, arrayOfObject.length);
        arrayOfObject = p;
        if (k >= j)
        {
          j.c(arrayOfObject, arrayOfObject, arrayOfObject.length - k, 0, j);
        }
        else
        {
          j.c(arrayOfObject, arrayOfObject, arrayOfObject.length - k, 0, k);
          arrayOfObject = p;
          j.c(arrayOfObject, arrayOfObject, 0, k, j);
        }
      }
      o = paramInt;
      i(M(j - k), paramCollection);
    }
    else
    {
      paramInt = j + k;
      if (j < i)
      {
        k += i;
        arrayOfObject = p;
        if (k <= arrayOfObject.length) {}
        for (;;)
        {
          j.c(arrayOfObject, arrayOfObject, paramInt, j, i);
          break label542;
          if (paramInt < arrayOfObject.length) {
            break;
          }
          paramInt -= arrayOfObject.length;
        }
        k = i - (k - arrayOfObject.length);
        j.c(arrayOfObject, arrayOfObject, 0, k, i);
        arrayOfObject = p;
        j.c(arrayOfObject, arrayOfObject, paramInt, j, k);
      }
      else
      {
        arrayOfObject = p;
        j.c(arrayOfObject, arrayOfObject, k, 0, i);
        arrayOfObject = p;
        if (paramInt >= arrayOfObject.length)
        {
          j.c(arrayOfObject, arrayOfObject, paramInt - arrayOfObject.length, j, arrayOfObject.length);
        }
        else
        {
          j.c(arrayOfObject, arrayOfObject, 0, arrayOfObject.length - k, arrayOfObject.length);
          arrayOfObject = p;
          j.c(arrayOfObject, arrayOfObject, paramInt, j, arrayOfObject.length - k);
        }
      }
      label542:
      i(j, paramCollection);
    }
    return true;
  }
  
  public boolean addAll(Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    if (paramCollection.isEmpty()) {
      return false;
    }
    U();
    s(size() + paramCollection.size());
    i(T(o + size()), paramCollection);
    return true;
  }
  
  public void clear()
  {
    if ((isEmpty() ^ true))
    {
      U();
      int i = T(o + size());
      S(o, i);
    }
    o = 0;
    q = 0;
  }
  
  public boolean contains(Object paramObject)
  {
    boolean bool;
    if (indexOf(paramObject) != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Object d(int paramInt)
  {
    c.o.a(paramInt, size());
    if (paramInt == m.h(this)) {
      return X();
    }
    if (paramInt == 0) {
      return V();
    }
    U();
    int i = T(o + paramInt);
    Object localObject = p[i];
    Object[] arrayOfObject;
    if (paramInt < size() >> 1)
    {
      paramInt = o;
      if (i >= paramInt)
      {
        arrayOfObject = p;
        j.c(arrayOfObject, arrayOfObject, paramInt + 1, paramInt, i);
      }
      else
      {
        arrayOfObject = p;
        j.c(arrayOfObject, arrayOfObject, 1, 0, i);
        arrayOfObject = p;
        arrayOfObject[0] = arrayOfObject[(arrayOfObject.length - 1)];
        paramInt = o;
        j.c(arrayOfObject, arrayOfObject, paramInt + 1, paramInt, arrayOfObject.length - 1);
      }
      arrayOfObject = p;
      paramInt = o;
      arrayOfObject[paramInt] = null;
      o = D(paramInt);
    }
    else
    {
      paramInt = T(o + m.h(this));
      arrayOfObject = p;
      if (i <= paramInt)
      {
        j.c(arrayOfObject, arrayOfObject, i, i + 1, paramInt + 1);
      }
      else
      {
        j.c(arrayOfObject, arrayOfObject, i, i + 1, arrayOfObject.length);
        arrayOfObject = p;
        arrayOfObject[(arrayOfObject.length - 1)] = arrayOfObject[0];
        j.c(arrayOfObject, arrayOfObject, 0, 1, paramInt + 1);
      }
      p[paramInt] = null;
    }
    q = (size() - 1);
    return localObject;
  }
  
  public final void f(Object paramObject)
  {
    U();
    s(size() + 1);
    int i = q(o);
    o = i;
    p[i] = paramObject;
    q = (size() + 1);
  }
  
  public final void g(Object paramObject)
  {
    U();
    s(size() + 1);
    p[T(o + size())] = paramObject;
    q = (size() + 1);
  }
  
  public Object get(int paramInt)
  {
    c.o.a(paramInt, size());
    return p[T(o + paramInt)];
  }
  
  public final void i(int paramInt, Collection paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    int i = p.length;
    while ((paramInt < i) && (localIterator.hasNext()))
    {
      p[paramInt] = localIterator.next();
      paramInt++;
    }
    i = o;
    for (paramInt = 0; (paramInt < i) && (localIterator.hasNext()); paramInt++) {
      p[paramInt] = localIterator.next();
    }
    q = (size() + paramCollection.size());
  }
  
  public int indexOf(Object paramObject)
  {
    int i = T(o + size());
    int j = o;
    if (j < i) {
      while (j < i)
      {
        if (Intrinsics.a(paramObject, p[j])) {
          return j - o;
        }
        j++;
      }
    }
    if (j >= i)
    {
      int k = p.length;
      for (;;)
      {
        if (j >= k) {
          break label95;
        }
        if (Intrinsics.a(paramObject, p[j])) {
          break;
        }
        j++;
      }
      label95:
      for (j = 0;; j++)
      {
        if (j >= i) {
          break label132;
        }
        if (Intrinsics.a(paramObject, p[j]))
        {
          j += p.length;
          break;
        }
      }
    }
    label132:
    return -1;
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
  
  public final void k(int paramInt)
  {
    Object[] arrayOfObject1 = new Object[paramInt];
    Object[] arrayOfObject2 = p;
    j.c(arrayOfObject2, arrayOfObject1, 0, o, arrayOfObject2.length);
    arrayOfObject2 = p;
    paramInt = arrayOfObject2.length;
    int i = o;
    j.c(arrayOfObject2, arrayOfObject1, paramInt - i, 0, i);
    o = 0;
    p = arrayOfObject1;
  }
  
  public int lastIndexOf(Object paramObject)
  {
    int i = T(o + size());
    int j = o;
    if (j < i)
    {
      i--;
      if (j > i) {
        break label151;
      }
      if (!Intrinsics.a(paramObject, p[i])) {}
    }
    for (;;)
    {
      return i - o;
      if (i == j) {
        break label151;
      }
      i--;
      break;
      if (j <= i) {
        break label151;
      }
      i--;
      for (;;)
      {
        if (-1 >= i) {
          break label106;
        }
        if (Intrinsics.a(paramObject, p[i]))
        {
          i += p.length;
          break;
        }
        i--;
      }
      label106:
      i = k.k(p);
      j = o;
      if (j > i) {
        break label151;
      }
      while (!Intrinsics.a(paramObject, p[i]))
      {
        if (i == j) {
          break label151;
        }
        i--;
      }
    }
    label151:
    return -1;
  }
  
  public final int q(int paramInt)
  {
    if (paramInt == 0) {
      paramInt = k.k(p);
    } else {
      paramInt--;
    }
    return paramInt;
  }
  
  public boolean remove(Object paramObject)
  {
    int i = indexOf(paramObject);
    if (i == -1) {
      return false;
    }
    remove(i);
    return true;
  }
  
  public boolean removeAll(Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    boolean bool1 = isEmpty();
    int i = 0;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = bool2;
    if (!bool1) {
      if (p.length == 0)
      {
        bool4 = bool2;
      }
      else
      {
        int j = T(o + size());
        int k = o;
        int m;
        Object localObject;
        if (k < j)
        {
          m = k;
          while (k < j)
          {
            localObject = p[k];
            if ((paramCollection.contains(localObject) ^ true))
            {
              p[m] = localObject;
              m++;
            }
            else
            {
              bool3 = true;
            }
            k++;
          }
          j.e(p, null, m, j);
          k = m;
        }
        else
        {
          int n = p.length;
          bool3 = false;
          m = k;
          Object[] arrayOfObject;
          while (k < n)
          {
            arrayOfObject = p;
            localObject = arrayOfObject[k];
            arrayOfObject[k] = null;
            if ((paramCollection.contains(localObject) ^ true))
            {
              p[m] = localObject;
              m++;
            }
            else
            {
              bool3 = true;
            }
            k++;
          }
          k = T(m);
          for (m = i; m < j; m++)
          {
            arrayOfObject = p;
            localObject = arrayOfObject[m];
            arrayOfObject[m] = null;
            if ((paramCollection.contains(localObject) ^ true))
            {
              p[k] = localObject;
              k = D(k);
            }
            else
            {
              bool3 = true;
            }
          }
        }
        bool4 = bool3;
        if (bool3)
        {
          U();
          q = M(k - o);
          bool4 = bool3;
        }
      }
    }
    return bool4;
  }
  
  public void removeRange(int paramInt1, int paramInt2)
  {
    c.o.c(paramInt1, paramInt2, size());
    int i = paramInt2 - paramInt1;
    if (i == 0) {
      return;
    }
    if (i == size())
    {
      clear();
      return;
    }
    if (i == 1)
    {
      remove(paramInt1);
      return;
    }
    U();
    if (paramInt1 < size() - paramInt2)
    {
      Y(paramInt1, paramInt2);
      paramInt1 = T(o + i);
      S(o, paramInt1);
      o = paramInt1;
    }
    else
    {
      Z(paramInt1, paramInt2);
      paramInt1 = T(o + size());
      S(M(paramInt1 - i), paramInt1);
    }
    q = (size() - i);
  }
  
  public boolean retainAll(Collection paramCollection)
  {
    Intrinsics.checkNotNullParameter(paramCollection, "elements");
    boolean bool1 = isEmpty();
    int i = 0;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = bool2;
    if (!bool1) {
      if (p.length == 0)
      {
        bool4 = bool2;
      }
      else
      {
        int j = T(o + size());
        int k = o;
        int m;
        Object localObject1;
        if (k < j)
        {
          m = k;
          while (k < j)
          {
            localObject1 = p[k];
            if (paramCollection.contains(localObject1))
            {
              p[m] = localObject1;
              m++;
            }
            else
            {
              bool3 = true;
            }
            k++;
          }
          j.e(p, null, m, j);
          k = m;
        }
        else
        {
          int n = p.length;
          bool3 = false;
          m = k;
          Object localObject2;
          while (k < n)
          {
            localObject1 = p;
            localObject2 = localObject1[k];
            localObject1[k] = null;
            if (paramCollection.contains(localObject2))
            {
              p[m] = localObject2;
              m++;
            }
            else
            {
              bool3 = true;
            }
            k++;
          }
          k = T(m);
          for (m = i; m < j; m++)
          {
            localObject1 = p;
            localObject2 = localObject1[m];
            localObject1[m] = null;
            if (paramCollection.contains(localObject2))
            {
              p[k] = localObject2;
              k = D(k);
            }
            else
            {
              bool3 = true;
            }
          }
        }
        bool4 = bool3;
        if (bool3)
        {
          U();
          q = M(k - o);
          bool4 = bool3;
        }
      }
    }
    return bool4;
  }
  
  public final void s(int paramInt)
  {
    if (paramInt >= 0)
    {
      Object[] arrayOfObject = p;
      if (paramInt <= arrayOfObject.length) {
        return;
      }
      if (arrayOfObject == s)
      {
        p = new Object[l6.d.a(paramInt, 10)];
        return;
      }
      k(c.o.d(arrayOfObject.length, paramInt));
      return;
    }
    throw new IllegalStateException("Deque is too big.");
  }
  
  public Object set(int paramInt, Object paramObject)
  {
    c.o.a(paramInt, size());
    paramInt = T(o + paramInt);
    Object[] arrayOfObject = p;
    Object localObject = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramObject;
    return localObject;
  }
  
  public Object[] toArray()
  {
    return toArray(new Object[size()]);
  }
  
  public Object[] toArray(Object[] paramArrayOfObject)
  {
    Intrinsics.checkNotNullParameter(paramArrayOfObject, "array");
    if (paramArrayOfObject.length < size()) {
      paramArrayOfObject = h.a(paramArrayOfObject, size());
    }
    int i = T(o + size());
    int j = o;
    if (j < i)
    {
      j.d(p, paramArrayOfObject, 0, j, i, 2, null);
    }
    else if ((isEmpty() ^ true))
    {
      Object[] arrayOfObject = p;
      j.c(arrayOfObject, paramArrayOfObject, 0, o, arrayOfObject.length);
      arrayOfObject = p;
      j.c(arrayOfObject, paramArrayOfObject, arrayOfObject.length - o, 0, i);
    }
    return n.c(size(), paramArrayOfObject);
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     W5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */