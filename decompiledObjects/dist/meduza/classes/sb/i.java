package sb;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import va.a;

public final class i<E>
  extends f<E>
{
  public static final Object[] d = new Object[0];
  public int a;
  public Object[] b = d;
  public int c;
  
  public final int a()
  {
    return c;
  }
  
  public final void add(int paramInt, E paramE)
  {
    int i = c;
    if ((paramInt >= 0) && (paramInt <= i))
    {
      if (paramInt == i)
      {
        addLast(paramE);
        return;
      }
      Object[] arrayOfObject;
      if (paramInt == 0)
      {
        p();
        k(c + 1);
        i = a;
        paramInt = i;
        if (i == 0)
        {
          arrayOfObject = b;
          ec.i.e(arrayOfObject, "<this>");
          paramInt = arrayOfObject.length;
        }
        paramInt--;
        a = paramInt;
        b[paramInt] = paramE;
        c += 1;
        return;
      }
      p();
      k(c + 1);
      i = o(a + paramInt);
      int j = c;
      if (paramInt < j + 1 >> 1)
      {
        paramInt = i;
        if (i == 0)
        {
          arrayOfObject = b;
          ec.i.e(arrayOfObject, "<this>");
          paramInt = arrayOfObject.length;
        }
        j = paramInt - 1;
        i = a;
        paramInt = i;
        if (i == 0)
        {
          arrayOfObject = b;
          ec.i.e(arrayOfObject, "<this>");
          paramInt = arrayOfObject.length;
        }
        i = paramInt - 1;
        paramInt = a;
        arrayOfObject = b;
        if (j >= paramInt)
        {
          arrayOfObject[i] = arrayOfObject[paramInt];
          j.l(arrayOfObject, paramInt, arrayOfObject, paramInt + 1, j + 1);
        }
        else
        {
          j.l(arrayOfObject, paramInt - 1, arrayOfObject, paramInt, arrayOfObject.length);
          arrayOfObject = b;
          arrayOfObject[(arrayOfObject.length - 1)] = arrayOfObject[0];
          j.l(arrayOfObject, 0, arrayOfObject, 1, j + 1);
        }
        b[j] = paramE;
        a = i;
      }
      else
      {
        paramInt = o(j + a);
        arrayOfObject = b;
        if (i < paramInt)
        {
          j.l(arrayOfObject, i + 1, arrayOfObject, i, paramInt);
        }
        else
        {
          j.l(arrayOfObject, 1, arrayOfObject, 0, paramInt);
          arrayOfObject = b;
          arrayOfObject[0] = arrayOfObject[(arrayOfObject.length - 1)];
          j.l(arrayOfObject, i + 1, arrayOfObject, i, arrayOfObject.length - 1);
        }
        b[i] = paramE;
      }
      c += 1;
      return;
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final boolean add(E paramE)
  {
    addLast(paramE);
    return true;
  }
  
  public final boolean addAll(int paramInt, Collection<? extends E> paramCollection)
  {
    ec.i.e(paramCollection, "elements");
    int i = c;
    if ((paramInt >= 0) && (paramInt <= i))
    {
      if (paramCollection.isEmpty()) {
        return false;
      }
      if (paramInt == c) {
        return addAll(paramCollection);
      }
      p();
      i = c;
      k(paramCollection.size() + i);
      i = a;
      int j = o(c + i);
      i = o(a + paramInt);
      int k = paramCollection.size();
      Object[] arrayOfObject;
      if (paramInt < c + 1 >> 1)
      {
        j = a;
        paramInt = j - k;
        if (i >= j)
        {
          if (paramInt >= 0)
          {
            arrayOfObject = b;
            j.l(arrayOfObject, paramInt, arrayOfObject, j, i);
          }
          else
          {
            arrayOfObject = b;
            paramInt += arrayOfObject.length;
            int m = arrayOfObject.length - paramInt;
            if (m >= i - j)
            {
              j.l(arrayOfObject, paramInt, arrayOfObject, j, i);
            }
            else
            {
              j.l(arrayOfObject, paramInt, arrayOfObject, j, j + m);
              arrayOfObject = b;
              j.l(arrayOfObject, 0, arrayOfObject, a + m, i);
            }
          }
        }
        else
        {
          arrayOfObject = b;
          j.l(arrayOfObject, paramInt, arrayOfObject, j, arrayOfObject.length);
          arrayOfObject = b;
          j = arrayOfObject.length - k;
          if (k >= i)
          {
            j.l(arrayOfObject, j, arrayOfObject, 0, i);
          }
          else
          {
            j.l(arrayOfObject, j, arrayOfObject, 0, k);
            arrayOfObject = b;
            j.l(arrayOfObject, 0, arrayOfObject, k, i);
          }
        }
        a = paramInt;
        i(m(i - k), paramCollection);
      }
      else
      {
        paramInt = i + k;
        if (i < j)
        {
          k += j;
          arrayOfObject = b;
          if (k > arrayOfObject.length)
          {
            if (paramInt >= arrayOfObject.length) {
              paramInt -= arrayOfObject.length;
            }
          }
          else
          {
            j.l(arrayOfObject, paramInt, arrayOfObject, i, j);
            break label534;
          }
          k = j - (k - arrayOfObject.length);
          j.l(arrayOfObject, 0, arrayOfObject, k, j);
          arrayOfObject = b;
          j.l(arrayOfObject, paramInt, arrayOfObject, i, k);
        }
        else
        {
          arrayOfObject = b;
          j.l(arrayOfObject, k, arrayOfObject, 0, j);
          arrayOfObject = b;
          if (paramInt >= arrayOfObject.length)
          {
            j.l(arrayOfObject, paramInt - arrayOfObject.length, arrayOfObject, i, arrayOfObject.length);
          }
          else
          {
            j.l(arrayOfObject, 0, arrayOfObject, arrayOfObject.length - k, arrayOfObject.length);
            arrayOfObject = b;
            j.l(arrayOfObject, paramInt, arrayOfObject, i, arrayOfObject.length - k);
          }
        }
        label534:
        i(i, paramCollection);
      }
      return true;
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    ec.i.e(paramCollection, "elements");
    if (paramCollection.isEmpty()) {
      return false;
    }
    p();
    int i = a();
    k(paramCollection.size() + i);
    i = a;
    i(o(a() + i), paramCollection);
    return true;
  }
  
  public final void addLast(E paramE)
  {
    p();
    k(a() + 1);
    Object[] arrayOfObject = b;
    int i = a;
    arrayOfObject[o(a() + i)] = paramE;
    c = (a() + 1);
  }
  
  public final void clear()
  {
    if ((isEmpty() ^ true))
    {
      p();
      int i = a;
      i = o(a() + i);
      n(a, i);
    }
    a = 0;
    c = 0;
  }
  
  public final boolean contains(Object paramObject)
  {
    boolean bool;
    if (indexOf(paramObject) != -1) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final E get(int paramInt)
  {
    int i = a();
    if ((paramInt >= 0) && (paramInt < i)) {
      return (E)b[o(a + paramInt)];
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final E h(int paramInt)
  {
    int i = c;
    if ((paramInt >= 0) && (paramInt < i))
    {
      if (paramInt == a.d(this))
      {
        if (!isEmpty())
        {
          p();
          paramInt = a;
          paramInt = o(a.d(this) + paramInt);
          arrayOfObject = b;
          localObject = arrayOfObject[paramInt];
          arrayOfObject[paramInt] = null;
          c -= 1;
          return (E)localObject;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
      }
      if (paramInt == 0) {
        return (E)removeFirst();
      }
      p();
      i = o(a + paramInt);
      Object[] arrayOfObject = b;
      Object localObject = arrayOfObject[i];
      if (paramInt < c >> 1)
      {
        paramInt = a;
        if (i >= paramInt)
        {
          j.l(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, i);
        }
        else
        {
          j.l(arrayOfObject, 1, arrayOfObject, 0, i);
          arrayOfObject = b;
          arrayOfObject[0] = arrayOfObject[(arrayOfObject.length - 1)];
          paramInt = a;
          j.l(arrayOfObject, paramInt + 1, arrayOfObject, paramInt, arrayOfObject.length - 1);
        }
        arrayOfObject = b;
        paramInt = a;
        arrayOfObject[paramInt] = null;
        a = l(paramInt);
      }
      else
      {
        paramInt = a;
        int j = o(a.d(this) + paramInt);
        arrayOfObject = b;
        paramInt = i + 1;
        if (i <= j)
        {
          j.l(arrayOfObject, i, arrayOfObject, paramInt, j + 1);
        }
        else
        {
          j.l(arrayOfObject, i, arrayOfObject, paramInt, arrayOfObject.length);
          arrayOfObject = b;
          arrayOfObject[(arrayOfObject.length - 1)] = arrayOfObject[0];
          j.l(arrayOfObject, 0, arrayOfObject, 1, j + 1);
        }
        b[j] = null;
      }
      c -= 1;
      return (E)localObject;
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final void i(int paramInt, Collection<? extends E> paramCollection)
  {
    Iterator localIterator = paramCollection.iterator();
    int i = b.length;
    while ((paramInt < i) && (localIterator.hasNext()))
    {
      b[paramInt] = localIterator.next();
      paramInt++;
    }
    paramInt = 0;
    i = a;
    while ((paramInt < i) && (localIterator.hasNext()))
    {
      b[paramInt] = localIterator.next();
      paramInt++;
    }
    paramInt = a();
    c = (paramCollection.size() + paramInt);
  }
  
  public final int indexOf(Object paramObject)
  {
    int i = a;
    int j = o(a() + i);
    i = a;
    if (i < j) {
      while (i < j)
      {
        if (ec.i.a(paramObject, b[i])) {
          return i - a;
        }
        i++;
      }
    }
    if (i >= j)
    {
      int k = b.length;
      for (;;)
      {
        if (i >= k) {
          break label97;
        }
        if (ec.i.a(paramObject, b[i])) {
          break;
        }
        i++;
      }
      label97:
      for (i = 0;; i++)
      {
        if (i >= j) {
          break label134;
        }
        if (ec.i.a(paramObject, b[i]))
        {
          i += b.length;
          break;
        }
      }
    }
    label134:
    return -1;
  }
  
  public final boolean isEmpty()
  {
    boolean bool;
    if (a() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void k(int paramInt)
  {
    if (paramInt >= 0)
    {
      Object[] arrayOfObject1 = b;
      if (paramInt <= arrayOfObject1.length) {
        return;
      }
      if (arrayOfObject1 == d)
      {
        i = paramInt;
        if (paramInt < 10) {
          i = 10;
        }
        b = new Object[i];
        return;
      }
      int i = arrayOfObject1.length;
      int j = i + (i >> 1);
      i = j;
      if (j - paramInt < 0) {
        i = paramInt;
      }
      j = i;
      if (i - 2147483639 > 0) {
        if (paramInt > 2147483639) {
          j = Integer.MAX_VALUE;
        } else {
          j = 2147483639;
        }
      }
      Object[] arrayOfObject2 = new Object[j];
      j.l(arrayOfObject1, 0, arrayOfObject2, a, arrayOfObject1.length);
      arrayOfObject1 = b;
      i = arrayOfObject1.length;
      paramInt = a;
      j.l(arrayOfObject1, i - paramInt, arrayOfObject2, 0, paramInt);
      a = 0;
      b = arrayOfObject2;
      return;
    }
    throw new IllegalStateException("Deque is too big.");
  }
  
  public final int l(int paramInt)
  {
    Object[] arrayOfObject = b;
    ec.i.e(arrayOfObject, "<this>");
    if (paramInt == arrayOfObject.length - 1) {
      paramInt = 0;
    } else {
      paramInt++;
    }
    return paramInt;
  }
  
  public final int lastIndexOf(Object paramObject)
  {
    int i = a;
    i = o(c + i);
    int j = a;
    if (j < i)
    {
      i--;
      if (j <= i) {
        while (!ec.i.a(paramObject, b[i]))
        {
          if (i == j) {
            break label164;
          }
          i--;
        }
      }
    }
    else if (j > i)
    {
      i--;
      while (-1 < i)
      {
        if (ec.i.a(paramObject, b[i]))
        {
          i += b.length;
          break label146;
        }
        i--;
      }
      Object[] arrayOfObject = b;
      ec.i.e(arrayOfObject, "<this>");
      i = arrayOfObject.length - 1;
      j = a;
      if (j <= i) {
        for (;;)
        {
          if (ec.i.a(paramObject, b[i])) {
            label146:
            return i - a;
          }
          if (i == j) {
            break;
          }
          i--;
        }
      }
    }
    label164:
    return -1;
  }
  
  public final int m(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0) {
      i = paramInt + b.length;
    }
    return i;
  }
  
  public final void n(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject = b;
    if (paramInt1 < paramInt2)
    {
      j.m(arrayOfObject, paramInt1, paramInt2);
    }
    else
    {
      j.m(arrayOfObject, paramInt1, arrayOfObject.length);
      j.m(b, 0, paramInt2);
    }
  }
  
  public final int o(int paramInt)
  {
    Object[] arrayOfObject = b;
    int i = paramInt;
    if (paramInt >= arrayOfObject.length) {
      i = paramInt - arrayOfObject.length;
    }
    return i;
  }
  
  public final void p()
  {
    modCount += 1;
  }
  
  public final boolean remove(Object paramObject)
  {
    int i = indexOf(paramObject);
    if (i == -1) {
      return false;
    }
    h(i);
    return true;
  }
  
  public final boolean removeAll(Collection<? extends Object> paramCollection)
  {
    ec.i.e(paramCollection, "elements");
    boolean bool1 = isEmpty();
    int i = 0;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = bool2;
    if (!bool1)
    {
      int j;
      if (b.length == 0) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        bool4 = bool2;
      }
      else
      {
        j = a;
        int k = o(c + j);
        j = a;
        int m;
        Object localObject1;
        if (j < k)
        {
          m = j;
          while (j < k)
          {
            localObject1 = b[j];
            if ((paramCollection.contains(localObject1) ^ true))
            {
              b[m] = localObject1;
              m++;
            }
            else
            {
              bool3 = true;
            }
            j++;
          }
          j.m(b, m, k);
        }
        else
        {
          int n = b.length;
          bool3 = false;
          m = j;
          Object localObject2;
          while (j < n)
          {
            localObject1 = b;
            localObject2 = localObject1[j];
            localObject1[j] = null;
            if ((paramCollection.contains(localObject2) ^ true))
            {
              b[m] = localObject2;
              m++;
            }
            else
            {
              bool3 = true;
            }
            j++;
          }
          j = o(m);
          for (m = i; m < k; m++)
          {
            localObject2 = b;
            localObject1 = localObject2[m];
            localObject2[m] = null;
            if ((paramCollection.contains(localObject1) ^ true))
            {
              b[j] = localObject1;
              j = l(j);
            }
            else
            {
              bool3 = true;
            }
          }
          m = j;
        }
        bool4 = bool3;
        if (bool3)
        {
          p();
          c = m(m - a);
          bool4 = bool3;
        }
      }
    }
    return bool4;
  }
  
  public final E removeFirst()
  {
    if (!isEmpty())
    {
      p();
      Object[] arrayOfObject = b;
      int i = a;
      Object localObject = arrayOfObject[i];
      arrayOfObject[i] = null;
      a = l(i);
      c = (a() - 1);
      return (E)localObject;
    }
    throw new NoSuchElementException("ArrayDeque is empty.");
  }
  
  public final void removeRange(int paramInt1, int paramInt2)
  {
    d.a.a(paramInt1, paramInt2, c);
    int i = paramInt2 - paramInt1;
    if (i == 0) {
      return;
    }
    if (i == c)
    {
      clear();
      return;
    }
    if (i == 1)
    {
      h(paramInt1);
      return;
    }
    p();
    int j;
    int k;
    int m;
    Object[] arrayOfObject;
    if (paramInt1 < c - paramInt2)
    {
      j = o(paramInt1 - 1 + a);
      k = o(paramInt2 - 1 + a);
      paramInt2 = j;
      while (paramInt1 > 0)
      {
        m = paramInt2 + 1;
        j = Math.min(paramInt1, Math.min(m, k + 1));
        arrayOfObject = b;
        k -= j;
        paramInt2 -= j;
        j.l(arrayOfObject, k + 1, arrayOfObject, paramInt2 + 1, m);
        paramInt2 = m(paramInt2);
        k = m(k);
        paramInt1 -= j;
      }
      paramInt1 = o(a + i);
      n(a, paramInt1);
      a = paramInt1;
    }
    else
    {
      m = o(a + paramInt2);
      paramInt1 = o(a + paramInt1);
      k = c;
      j = paramInt2;
      paramInt2 = m;
      for (;;)
      {
        k -= j;
        if (k <= 0) {
          break;
        }
        arrayOfObject = b;
        j = Math.min(k, Math.min(arrayOfObject.length - paramInt2, arrayOfObject.length - paramInt1));
        arrayOfObject = b;
        m = paramInt2 + j;
        j.l(arrayOfObject, paramInt1, arrayOfObject, paramInt2, m);
        paramInt2 = o(m);
        paramInt1 = o(paramInt1 + j);
      }
      paramInt1 = a;
      paramInt1 = o(c + paramInt1);
      n(m(paramInt1 - i), paramInt1);
    }
    c -= i;
  }
  
  public final boolean retainAll(Collection<? extends Object> paramCollection)
  {
    ec.i.e(paramCollection, "elements");
    boolean bool1 = isEmpty();
    int i = 0;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = bool2;
    if (!bool1)
    {
      int j;
      if (b.length == 0) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        bool4 = bool2;
      }
      else
      {
        j = a;
        int k = o(c + j);
        j = a;
        int m;
        Object localObject;
        if (j < k)
        {
          m = j;
          while (j < k)
          {
            localObject = b[j];
            if (paramCollection.contains(localObject))
            {
              b[m] = localObject;
              m++;
            }
            else
            {
              bool3 = true;
            }
            j++;
          }
          j.m(b, m, k);
        }
        else
        {
          int n = b.length;
          bool3 = false;
          m = j;
          Object[] arrayOfObject;
          while (j < n)
          {
            arrayOfObject = b;
            localObject = arrayOfObject[j];
            arrayOfObject[j] = null;
            if (paramCollection.contains(localObject))
            {
              b[m] = localObject;
              m++;
            }
            else
            {
              bool3 = true;
            }
            j++;
          }
          j = o(m);
          for (m = i; m < k; m++)
          {
            arrayOfObject = b;
            localObject = arrayOfObject[m];
            arrayOfObject[m] = null;
            if (paramCollection.contains(localObject))
            {
              b[j] = localObject;
              j = l(j);
            }
            else
            {
              bool3 = true;
            }
          }
          m = j;
        }
        bool4 = bool3;
        if (bool3)
        {
          p();
          c = m(m - a);
          bool4 = bool3;
        }
      }
    }
    return bool4;
  }
  
  public final E set(int paramInt, E paramE)
  {
    int i = a();
    if ((paramInt >= 0) && (paramInt < i))
    {
      paramInt = o(a + paramInt);
      Object[] arrayOfObject = b;
      Object localObject = arrayOfObject[paramInt];
      arrayOfObject[paramInt] = paramE;
      return (E)localObject;
    }
    throw new IndexOutOfBoundsException(f.i("index: ", paramInt, ", size: ", i));
  }
  
  public final Object[] toArray()
  {
    return toArray(new Object[a()]);
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    ec.i.e(paramArrayOfT, "array");
    int i = paramArrayOfT.length;
    int j = c;
    if (i < j)
    {
      paramArrayOfT = Array.newInstance(paramArrayOfT.getClass().getComponentType(), j);
      ec.i.c(paramArrayOfT, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
      paramArrayOfT = (Object[])paramArrayOfT;
    }
    i = a;
    j = o(c + i);
    i = a;
    if (i < j)
    {
      j.l(b, 0, paramArrayOfT, i, j);
    }
    else if ((isEmpty() ^ true))
    {
      Object[] arrayOfObject = b;
      j.l(arrayOfObject, 0, paramArrayOfT, a, arrayOfObject.length);
      arrayOfObject = b;
      j.l(arrayOfObject, arrayOfObject.length - a, paramArrayOfT, 0, j);
    }
    i = c;
    if (i < paramArrayOfT.length) {
      paramArrayOfT[i] = null;
    }
    return paramArrayOfT;
  }
}

/* Location:
 * Qualified Name:     sb.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */