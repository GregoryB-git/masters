package r;

import b.a0;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class h<K, V>
{
  public static Object[] d;
  public static int e;
  public static Object[] f;
  public static int o;
  public int[] a;
  public Object[] b;
  public int c;
  
  public h()
  {
    a = a0.T;
    b = a0.U;
    c = 0;
  }
  
  public h(int paramInt)
  {
    if (paramInt == 0)
    {
      a = a0.T;
      b = a0.U;
    }
    else
    {
      b(paramInt);
    }
    c = 0;
  }
  
  private void b(int paramInt)
  {
    if (paramInt == 8) {
      try
      {
        Object[] arrayOfObject1 = f;
        if (arrayOfObject1 != null)
        {
          b = arrayOfObject1;
          f = (Object[])arrayOfObject1[0];
          a = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          o -= 1;
          return;
        }
      }
      finally {}
    }
    if (paramInt == 4) {
      try
      {
        Object[] arrayOfObject2 = d;
        if (arrayOfObject2 != null)
        {
          b = arrayOfObject2;
          d = (Object[])arrayOfObject2[0];
          a = ((int[])arrayOfObject2[1]);
          arrayOfObject2[1] = null;
          arrayOfObject2[0] = null;
          e -= 1;
          return;
        }
      }
      finally {}
    }
    a = new int[paramInt];
    b = new Object[paramInt << 1];
  }
  
  public static void d(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (o < 10)
        {
          paramArrayOfObject[0] = f;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (paramInt = (paramInt << 1) - 1; paramInt >= 2; paramInt--) {
            paramArrayOfObject[paramInt] = null;
          }
          f = paramArrayOfObject;
          o += 1;
        }
      }
      finally {}
    }
    if (paramArrayOfInt.length == 4) {
      try
      {
        if (e < 10)
        {
          paramArrayOfObject[0] = d;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (paramInt = (paramInt << 1) - 1; paramInt >= 2; paramInt--) {
            paramArrayOfObject[paramInt] = null;
          }
          d = paramArrayOfObject;
          e += 1;
        }
      }
      finally {}
    }
  }
  
  public final void c(int paramInt)
  {
    int i = c;
    int[] arrayOfInt = a;
    if (arrayOfInt.length < paramInt)
    {
      Object[] arrayOfObject = b;
      b(paramInt);
      if (c > 0)
      {
        System.arraycopy(arrayOfInt, 0, a, 0, i);
        System.arraycopy(arrayOfObject, 0, b, 0, i << 1);
      }
      d(arrayOfInt, arrayOfObject, i);
    }
    if (c == i) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public final void clear()
  {
    int i = c;
    if (i > 0)
    {
      int[] arrayOfInt = a;
      Object[] arrayOfObject = b;
      a = a0.T;
      b = a0.U;
      c = 0;
      d(arrayOfInt, arrayOfObject, i);
    }
    if (c <= 0) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public final boolean containsKey(Object paramObject)
  {
    boolean bool;
    if (f(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean containsValue(Object paramObject)
  {
    boolean bool;
    if (h(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final int e(int paramInt, Object paramObject)
  {
    int i = c;
    if (i == 0) {
      return -1;
    }
    int[] arrayOfInt = a;
    try
    {
      int j = a0.j(i, paramInt, arrayOfInt);
      if (j < 0) {
        return j;
      }
      if (paramObject.equals(b[(j << 1)])) {
        return j;
      }
      for (int k = j + 1; (k < i) && (a[k] == paramInt); k++) {
        if (paramObject.equals(b[(k << 1)])) {
          return k;
        }
      }
      for (i = j - 1; (i >= 0) && (a[i] == paramInt); i--) {
        if (paramObject.equals(b[(i << 1)])) {
          return i;
        }
      }
      return k;
    }
    catch (ArrayIndexOutOfBoundsException paramObject)
    {
      throw new ConcurrentModificationException();
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    Object localObject1;
    int i;
    Object localObject2;
    Object localObject3;
    boolean bool;
    if ((paramObject instanceof h))
    {
      localObject1 = (h)paramObject;
      if (c != c) {
        return false;
      }
      i = 0;
      try
      {
        while (i < c)
        {
          localObject2 = i(i);
          localObject3 = k(i);
          paramObject = ((h)localObject1).getOrDefault(localObject2, null);
          if (localObject3 == null)
          {
            if ((paramObject != null) || (!((h)localObject1).containsKey(localObject2))) {
              return false;
            }
          }
          else
          {
            bool = localObject3.equals(paramObject);
            if (!bool) {
              return false;
            }
          }
          i++;
        }
        return true;
      }
      catch (NullPointerException|ClassCastException paramObject)
      {
        return false;
      }
    }
    if ((paramObject instanceof Map))
    {
      localObject3 = (Map)paramObject;
      if (c != ((Map)localObject3).size()) {
        return false;
      }
      i = 0;
    }
    try
    {
      while (i < c)
      {
        localObject2 = i(i);
        paramObject = k(i);
        localObject1 = ((Map)localObject3).get(localObject2);
        if (paramObject == null)
        {
          if ((localObject1 != null) || (!((Map)localObject3).containsKey(localObject2))) {
            return false;
          }
        }
        else
        {
          bool = paramObject.equals(localObject1);
          if (!bool) {
            return false;
          }
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
  
  public final int f(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = g();
    } else {
      i = e(paramObject.hashCode(), paramObject);
    }
    return i;
  }
  
  public final int g()
  {
    int i = c;
    if (i == 0) {
      return -1;
    }
    int[] arrayOfInt = a;
    try
    {
      int j = a0.j(i, 0, arrayOfInt);
      if (j < 0) {
        return j;
      }
      if (b[(j << 1)] == null) {
        return j;
      }
      for (int k = j + 1; (k < i) && (a[k] == 0); k++) {
        if (b[(k << 1)] == null) {
          return k;
        }
      }
      j--;
      while ((j >= 0) && (a[j] == 0))
      {
        if (b[(j << 1)] == null) {
          return j;
        }
        j--;
      }
      return k;
    }
    catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
    {
      throw new ConcurrentModificationException();
    }
  }
  
  public final V get(Object paramObject)
  {
    return (V)getOrDefault(paramObject, null);
  }
  
  public final V getOrDefault(Object paramObject, V paramV)
  {
    int i = f(paramObject);
    if (i >= 0) {
      paramV = b[((i << 1) + 1)];
    }
    return paramV;
  }
  
  public final int h(Object paramObject)
  {
    int i = c * 2;
    Object[] arrayOfObject = b;
    if (paramObject == null) {
      for (j = 1; j < i; j += 2) {
        if (arrayOfObject[j] == null) {
          return j >> 1;
        }
      }
    }
    for (int j = 1; j < i; j += 2) {
      if (paramObject.equals(arrayOfObject[j])) {
        return j >> 1;
      }
    }
    return -1;
  }
  
  public final int hashCode()
  {
    int[] arrayOfInt = a;
    Object[] arrayOfObject = b;
    int i = c;
    int j = 1;
    int k = 0;
    int m = k;
    while (k < i)
    {
      Object localObject = arrayOfObject[j];
      int n = arrayOfInt[k];
      int i1;
      if (localObject == null) {
        i1 = 0;
      } else {
        i1 = localObject.hashCode();
      }
      m += (i1 ^ n);
      k++;
      j += 2;
    }
    return m;
  }
  
  public final K i(int paramInt)
  {
    return (K)b[(paramInt << 1)];
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
  
  public final V j(int paramInt)
  {
    Object[] arrayOfObject = b;
    int i = paramInt << 1;
    Object localObject = arrayOfObject[(i + 1)];
    int j = c;
    int k = 0;
    if (j <= 1)
    {
      d(a, arrayOfObject, j);
      a = a0.T;
      b = a0.U;
      paramInt = k;
    }
    else
    {
      int m = j - 1;
      int[] arrayOfInt1 = a;
      int n = arrayOfInt1.length;
      k = 8;
      if ((n > 8) && (j < arrayOfInt1.length / 3))
      {
        if (j > 8) {
          k = j + (j >> 1);
        }
        b(k);
        if (j == c)
        {
          if (paramInt > 0)
          {
            System.arraycopy(arrayOfInt1, 0, a, 0, paramInt);
            System.arraycopy(arrayOfObject, 0, b, 0, i);
          }
          if (paramInt < m)
          {
            n = paramInt + 1;
            int[] arrayOfInt2 = a;
            k = m - paramInt;
            System.arraycopy(arrayOfInt1, n, arrayOfInt2, paramInt, k);
            System.arraycopy(arrayOfObject, n << 1, b, i, k << 1);
          }
        }
        else
        {
          throw new ConcurrentModificationException();
        }
      }
      else
      {
        if (paramInt < m)
        {
          n = paramInt + 1;
          k = m - paramInt;
          System.arraycopy(arrayOfInt1, n, arrayOfInt1, paramInt, k);
          arrayOfObject = b;
          System.arraycopy(arrayOfObject, n << 1, arrayOfObject, i, k << 1);
        }
        arrayOfObject = b;
        paramInt = m << 1;
        arrayOfObject[paramInt] = null;
        arrayOfObject[(paramInt + 1)] = null;
      }
      paramInt = m;
    }
    if (j == c)
    {
      c = paramInt;
      return (V)localObject;
    }
    throw new ConcurrentModificationException();
  }
  
  public final V k(int paramInt)
  {
    return (V)b[((paramInt << 1) + 1)];
  }
  
  public final V put(K paramK, V paramV)
  {
    int i = c;
    int k;
    if (paramK == null)
    {
      j = g();
      k = 0;
    }
    else
    {
      k = paramK.hashCode();
      j = e(k, paramK);
    }
    Object localObject;
    if (j >= 0)
    {
      j = (j << 1) + 1;
      localObject = b;
      paramK = localObject[j];
      localObject[j] = paramV;
      return paramK;
    }
    int m = j;
    int[] arrayOfInt1 = a;
    if (i >= arrayOfInt1.length)
    {
      j = 4;
      if (i >= 8) {
        j = (i >> 1) + i;
      } else if (i >= 4) {
        j = 8;
      }
      localObject = b;
      b(j);
      if (i == c)
      {
        int[] arrayOfInt2 = a;
        if (arrayOfInt2.length > 0)
        {
          System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
          System.arraycopy(localObject, 0, b, 0, localObject.length);
        }
        d(arrayOfInt1, (Object[])localObject, i);
      }
      else
      {
        throw new ConcurrentModificationException();
      }
    }
    if (m < i)
    {
      localObject = a;
      j = m + 1;
      System.arraycopy(localObject, m, localObject, j, i - m);
      localObject = b;
      System.arraycopy(localObject, m << 1, localObject, j << 1, c - m << 1);
    }
    int j = c;
    if (i == j)
    {
      localObject = a;
      if (m < localObject.length)
      {
        localObject[m] = k;
        localObject = b;
        k = m << 1;
        localObject[k] = paramK;
        localObject[(k + 1)] = paramV;
        c = (j + 1);
        return null;
      }
    }
    throw new ConcurrentModificationException();
  }
  
  public final V putIfAbsent(K paramK, V paramV)
  {
    Object localObject1 = getOrDefault(paramK, null);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = put(paramK, paramV);
    }
    return (V)localObject2;
  }
  
  public final V remove(Object paramObject)
  {
    int i = f(paramObject);
    if (i >= 0) {
      return (V)j(i);
    }
    return null;
  }
  
  public final boolean remove(Object paramObject1, Object paramObject2)
  {
    int i = f(paramObject1);
    if (i >= 0)
    {
      paramObject1 = k(i);
      if ((paramObject2 == paramObject1) || ((paramObject2 != null) && (paramObject2.equals(paramObject1))))
      {
        j(i);
        return true;
      }
    }
    return false;
  }
  
  public final V replace(K paramK, V paramV)
  {
    int i = f(paramK);
    if (i >= 0)
    {
      i = (i << 1) + 1;
      Object[] arrayOfObject = b;
      paramK = arrayOfObject[i];
      arrayOfObject[i] = paramV;
      return paramK;
    }
    return null;
  }
  
  public final boolean replace(K paramK, V paramV1, V paramV2)
  {
    int i = f(paramK);
    if (i >= 0)
    {
      paramK = k(i);
      if ((paramK == paramV1) || ((paramV1 != null) && (paramV1.equals(paramK))))
      {
        i = (i << 1) + 1;
        paramK = b;
        paramV1 = paramK[i];
        paramK[i] = paramV2;
        return true;
      }
    }
    return false;
  }
  
  public final int size()
  {
    return c;
  }
  
  public final String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(c * 28);
    localStringBuilder.append('{');
    for (int i = 0; i < c; i++)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      Object localObject = i(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append("(this Map)");
      }
      localStringBuilder.append('=');
      localObject = k(i);
      if (localObject != this) {
        localStringBuilder.append(localObject);
      } else {
        localStringBuilder.append("(this Map)");
      }
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     r.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */