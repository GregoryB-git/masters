package r;

import b.a0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class d<E>
  implements Collection<E>, Set<E>
{
  public static final int[] e = new int[0];
  public static final Object[] f = new Object[0];
  public static Object[] o;
  public static int p;
  public static Object[] q;
  public static int r;
  public int[] a;
  public Object[] b;
  public int c;
  public c d;
  
  public d()
  {
    this(0);
  }
  
  public d(int paramInt)
  {
    if (paramInt == 0)
    {
      a = e;
      b = f;
    }
    else
    {
      a(paramInt);
    }
    c = 0;
  }
  
  public static void h(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (r < 10)
        {
          paramArrayOfObject[0] = q;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt--;
          while (paramInt >= 2)
          {
            paramArrayOfObject[paramInt] = null;
            paramInt--;
          }
          q = paramArrayOfObject;
          r += 1;
        }
      }
      finally {}
    }
    if (paramArrayOfInt.length == 4) {
      try
      {
        if (p < 10)
        {
          paramArrayOfObject[0] = o;
          paramArrayOfObject[1] = paramArrayOfInt;
          paramInt--;
          while (paramInt >= 2)
          {
            paramArrayOfObject[paramInt] = null;
            paramInt--;
          }
          o = paramArrayOfObject;
          p += 1;
        }
      }
      finally {}
    }
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == 8) {
      try
      {
        Object[] arrayOfObject1 = q;
        if (arrayOfObject1 != null)
        {
          b = arrayOfObject1;
          q = (Object[])arrayOfObject1[0];
          a = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          r -= 1;
          return;
        }
      }
      finally {}
    }
    if (paramInt == 4) {
      try
      {
        Object[] arrayOfObject2 = o;
        if (arrayOfObject2 != null)
        {
          b = arrayOfObject2;
          o = (Object[])arrayOfObject2[0];
          a = ((int[])arrayOfObject2[1]);
          arrayOfObject2[1] = null;
          arrayOfObject2[0] = null;
          p -= 1;
          return;
        }
      }
      finally {}
    }
    a = new int[paramInt];
    b = new Object[paramInt];
  }
  
  public final boolean add(E paramE)
  {
    int i;
    int j;
    if (paramE == null)
    {
      i = k();
      j = 0;
    }
    else
    {
      j = paramE.hashCode();
      i = i(j, paramE);
    }
    if (i >= 0) {
      return false;
    }
    int k = i;
    int m = c;
    int[] arrayOfInt1 = a;
    Object localObject;
    if (m >= arrayOfInt1.length)
    {
      i = 4;
      if (m >= 8) {
        i = (m >> 1) + m;
      } else if (m >= 4) {
        i = 8;
      }
      localObject = b;
      a(i);
      int[] arrayOfInt2 = a;
      if (arrayOfInt2.length > 0)
      {
        System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
        System.arraycopy(localObject, 0, b, 0, localObject.length);
      }
      h(arrayOfInt1, (Object[])localObject, c);
    }
    m = c;
    if (k < m)
    {
      localObject = a;
      i = k + 1;
      System.arraycopy(localObject, k, localObject, i, m - k);
      localObject = b;
      System.arraycopy(localObject, k, localObject, i, c - k);
    }
    a[k] = j;
    b[k] = paramE;
    c += 1;
    return true;
  }
  
  public final boolean addAll(Collection<? extends E> paramCollection)
  {
    int i = c;
    i = paramCollection.size() + i;
    int[] arrayOfInt = a;
    int j = arrayOfInt.length;
    boolean bool = false;
    if (j < i)
    {
      Object[] arrayOfObject = b;
      a(i);
      i = c;
      if (i > 0)
      {
        System.arraycopy(arrayOfInt, 0, a, 0, i);
        System.arraycopy(arrayOfObject, 0, b, 0, c);
      }
      h(arrayOfInt, arrayOfObject, c);
    }
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      bool |= add(paramCollection.next());
    }
    return bool;
  }
  
  public final void clear()
  {
    int i = c;
    if (i != 0)
    {
      h(a, b, i);
      a = e;
      b = f;
      c = 0;
    }
  }
  
  public final boolean contains(Object paramObject)
  {
    boolean bool;
    if (indexOf(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean containsAll(Collection<?> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      if (!contains(paramCollection.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    int i;
    if ((paramObject instanceof Set))
    {
      paramObject = (Set)paramObject;
      if (c != ((Set)paramObject).size()) {
        return false;
      }
      i = 0;
    }
    try
    {
      while (i < c)
      {
        boolean bool = ((Set)paramObject).contains(b[i]);
        if (!bool) {
          return false;
        }
        i++;
      }
      return true;
    }
    catch (NullPointerException|ClassCastException paramObject)
    {
      for (;;) {}
    }
    return false;
  }
  
  public final int hashCode()
  {
    int[] arrayOfInt = a;
    int i = c;
    int j = 0;
    int k = 0;
    while (j < i)
    {
      k += arrayOfInt[j];
      j++;
    }
    return k;
  }
  
  public final int i(int paramInt, Object paramObject)
  {
    int i = c;
    if (i == 0) {
      return -1;
    }
    int j = a0.j(i, paramInt, a);
    if (j < 0) {
      return j;
    }
    if (paramObject.equals(b[j])) {
      return j;
    }
    for (int k = j + 1; (k < i) && (a[k] == paramInt); k++) {
      if (paramObject.equals(b[k])) {
        return k;
      }
    }
    j--;
    while ((j >= 0) && (a[j] == paramInt))
    {
      if (paramObject.equals(b[j])) {
        return j;
      }
      j--;
    }
    return k;
  }
  
  public final int indexOf(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = k();
    } else {
      i = i(paramObject.hashCode(), paramObject);
    }
    return i;
  }
  
  public final boolean isEmpty()
  {
    boolean bool;
    if (c <= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final Iterator<E> iterator()
  {
    if (d == null) {
      d = new c(this);
    }
    c localc = d;
    if (b == null) {
      b = new g.c(localc);
    }
    return b.iterator();
  }
  
  public final int k()
  {
    int i = c;
    if (i == 0) {
      return -1;
    }
    int j = a0.j(i, 0, a);
    if (j < 0) {
      return j;
    }
    if (b[j] == null) {
      return j;
    }
    for (int k = j + 1; (k < i) && (a[k] == 0); k++) {
      if (b[k] == null) {
        return k;
      }
    }
    for (i = j - 1; (i >= 0) && (a[i] == 0); i--) {
      if (b[i] == null) {
        return i;
      }
    }
    return k;
  }
  
  public final void l(int paramInt)
  {
    Object[] arrayOfObject = b;
    Object localObject = arrayOfObject[paramInt];
    int i = c;
    if (i <= 1)
    {
      h(a, arrayOfObject, i);
      a = e;
      b = f;
      c = 0;
    }
    else
    {
      localObject = a;
      int j = localObject.length;
      int k = 8;
      if ((j > 8) && (i < localObject.length / 3))
      {
        if (i > 8) {
          k = i + (i >> 1);
        }
        a(k);
        c -= 1;
        if (paramInt > 0)
        {
          System.arraycopy(localObject, 0, a, 0, paramInt);
          System.arraycopy(arrayOfObject, 0, b, 0, paramInt);
        }
        i = c;
        if (paramInt < i)
        {
          k = paramInt + 1;
          System.arraycopy(localObject, k, a, paramInt, i - paramInt);
          System.arraycopy(arrayOfObject, k, b, paramInt, c - paramInt);
        }
      }
      else
      {
        i--;
        c = i;
        if (paramInt < i)
        {
          k = paramInt + 1;
          System.arraycopy(localObject, k, localObject, paramInt, i - paramInt);
          arrayOfObject = b;
          System.arraycopy(arrayOfObject, k, arrayOfObject, paramInt, c - paramInt);
        }
        b[c] = null;
      }
    }
  }
  
  public final boolean remove(Object paramObject)
  {
    int i = indexOf(paramObject);
    if (i >= 0)
    {
      l(i);
      return true;
    }
    return false;
  }
  
  public final boolean removeAll(Collection<?> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    boolean bool = false;
    while (paramCollection.hasNext()) {
      bool |= remove(paramCollection.next());
    }
    return bool;
  }
  
  public final boolean retainAll(Collection<?> paramCollection)
  {
    int i = c - 1;
    boolean bool = false;
    while (i >= 0)
    {
      if (!paramCollection.contains(b[i]))
      {
        l(i);
        bool = true;
      }
      i--;
    }
    return bool;
  }
  
  public final int size()
  {
    return c;
  }
  
  public final Object[] toArray()
  {
    int i = c;
    Object[] arrayOfObject = new Object[i];
    System.arraycopy(b, 0, arrayOfObject, 0, i);
    return arrayOfObject;
  }
  
  public final <T> T[] toArray(T[] paramArrayOfT)
  {
    Object localObject = paramArrayOfT;
    if (paramArrayOfT.length < c) {
      localObject = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), c);
    }
    System.arraycopy(b, 0, localObject, 0, c);
    int i = localObject.length;
    int j = c;
    if (i > j) {
      localObject[j] = null;
    }
    return (T[])localObject;
  }
  
  public final String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(c * 14);
    localStringBuilder.append('{');
    for (int i = 0; i < c; i++)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject = b[i];
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append("(this Set)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     r.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */