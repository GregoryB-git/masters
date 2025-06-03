package t;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class h
{
  public static Object[] r;
  public static int s;
  public static Object[] t;
  public static int u;
  public int[] o;
  public Object[] p;
  public int q;
  
  public h()
  {
    o = d.a;
    p = d.c;
    q = 0;
  }
  
  public h(int paramInt)
  {
    if (paramInt == 0)
    {
      o = d.a;
      p = d.c;
    }
    else
    {
      a(paramInt);
    }
    q = 0;
  }
  
  public static int b(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    try
    {
      paramInt1 = d.a(paramArrayOfInt, paramInt1, paramInt2);
      return paramInt1;
    }
    catch (ArrayIndexOutOfBoundsException paramArrayOfInt)
    {
      throw new ConcurrentModificationException();
    }
  }
  
  public static void d(int[] paramArrayOfInt, Object[] paramArrayOfObject, int paramInt)
  {
    if (paramArrayOfInt.length == 8) {
      try
      {
        if (u < 10)
        {
          paramArrayOfObject[0] = t;
          paramArrayOfObject[1] = paramArrayOfInt;
          for (paramInt = (paramInt << 1) - 1; paramInt >= 2; paramInt--) {
            paramArrayOfObject[paramInt] = null;
          }
        }
        label71:
        if (paramArrayOfInt.length != 4) {
          return;
        }
      }
      finally
      {
        break label71;
        t = paramArrayOfObject;
        u += 1;
        return;
      }
    }
    try
    {
      if (s < 10)
      {
        paramArrayOfObject[0] = r;
        paramArrayOfObject[1] = paramArrayOfInt;
        for (paramInt = (paramInt << 1) - 1; paramInt >= 2; paramInt--) {
          paramArrayOfObject[paramInt] = null;
        }
      }
      label146:
      return;
    }
    finally
    {
      break label146;
      r = paramArrayOfObject;
      s += 1;
      return;
    }
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == 8) {
      label71:
      try
      {
        Object[] arrayOfObject1 = t;
        if (arrayOfObject1 != null)
        {
          p = arrayOfObject1;
          t = (Object[])arrayOfObject1[0];
          o = ((int[])arrayOfObject1[1]);
          arrayOfObject1[1] = null;
          arrayOfObject1[0] = null;
          u -= 1;
          return;
        }
      }
      finally
      {
        break label71;
        break label151;
      }
    }
    if (paramInt == 4) {
      label146:
      try
      {
        Object[] arrayOfObject2 = r;
        if (arrayOfObject2 != null)
        {
          p = arrayOfObject2;
          r = (Object[])arrayOfObject2[0];
          o = ((int[])arrayOfObject2[1]);
          arrayOfObject2[1] = null;
          arrayOfObject2[0] = null;
          s -= 1;
          return;
        }
      }
      finally
      {
        break label146;
      }
    }
    label151:
    o = new int[paramInt];
    p = new Object[paramInt << 1];
  }
  
  public void c(int paramInt)
  {
    int i = q;
    int[] arrayOfInt = o;
    if (arrayOfInt.length < paramInt)
    {
      Object[] arrayOfObject = p;
      a(paramInt);
      if (q > 0)
      {
        System.arraycopy(arrayOfInt, 0, o, 0, i);
        System.arraycopy(arrayOfObject, 0, p, 0, i << 1);
      }
      d(arrayOfInt, arrayOfObject, i);
    }
    if (q == i) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public void clear()
  {
    int i = q;
    if (i > 0)
    {
      int[] arrayOfInt = o;
      Object[] arrayOfObject = p;
      o = d.a;
      p = d.c;
      q = 0;
      d(arrayOfInt, arrayOfObject, i);
    }
    if (q <= 0) {
      return;
    }
    throw new ConcurrentModificationException();
  }
  
  public boolean containsKey(Object paramObject)
  {
    boolean bool;
    if (f(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean containsValue(Object paramObject)
  {
    boolean bool;
    if (h(paramObject) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int e(Object paramObject, int paramInt)
  {
    int i = q;
    if (i == 0) {
      return -1;
    }
    int j = b(o, i, paramInt);
    if (j < 0) {
      return j;
    }
    if (paramObject.equals(p[(j << 1)])) {
      return j;
    }
    for (int k = j + 1; (k < i) && (o[k] == paramInt); k++) {
      if (paramObject.equals(p[(k << 1)])) {
        return k;
      }
    }
    j--;
    while ((j >= 0) && (o[j] == paramInt))
    {
      if (paramObject.equals(p[(j << 1)])) {
        return j;
      }
      j--;
    }
    return k;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    try
    {
      Object localObject1;
      int i;
      Object localObject2;
      Object localObject3;
      if ((paramObject instanceof h))
      {
        localObject1 = (h)paramObject;
        if (size() != ((h)localObject1).size()) {
          return false;
        }
        for (i = 0; i < q; i++)
        {
          localObject2 = i(i);
          localObject3 = l(i);
          paramObject = ((h)localObject1).get(localObject2);
          if (localObject3 == null)
          {
            if ((paramObject != null) || (!((h)localObject1).containsKey(localObject2))) {
              return false;
            }
          }
          else if (!localObject3.equals(paramObject)) {
            return false;
          }
        }
        return true;
      }
      if ((paramObject instanceof Map))
      {
        localObject1 = (Map)paramObject;
        if (size() != ((Map)localObject1).size()) {
          return false;
        }
        for (i = 0; i < q; i++)
        {
          localObject2 = i(i);
          paramObject = l(i);
          localObject3 = ((Map)localObject1).get(localObject2);
          if (paramObject == null)
          {
            if ((localObject3 != null) || (!((Map)localObject1).containsKey(localObject2))) {
              return false;
            }
          }
          else
          {
            boolean bool = paramObject.equals(localObject3);
            if (!bool) {
              return false;
            }
          }
        }
        return true;
      }
    }
    catch (NullPointerException|ClassCastException paramObject)
    {
      for (;;) {}
    }
    return false;
  }
  
  public int f(Object paramObject)
  {
    int i;
    if (paramObject == null) {
      i = g();
    } else {
      i = e(paramObject, paramObject.hashCode());
    }
    return i;
  }
  
  public int g()
  {
    int i = q;
    if (i == 0) {
      return -1;
    }
    int j = b(o, i, 0);
    if (j < 0) {
      return j;
    }
    if (p[(j << 1)] == null) {
      return j;
    }
    for (int k = j + 1; (k < i) && (o[k] == 0); k++) {
      if (p[(k << 1)] == null) {
        return k;
      }
    }
    for (i = j - 1; (i >= 0) && (o[i] == 0); i--) {
      if (p[(i << 1)] == null) {
        return i;
      }
    }
    return k;
  }
  
  public Object get(Object paramObject)
  {
    return getOrDefault(paramObject, null);
  }
  
  public Object getOrDefault(Object paramObject1, Object paramObject2)
  {
    int i = f(paramObject1);
    if (i >= 0) {
      paramObject2 = p[((i << 1) + 1)];
    }
    return paramObject2;
  }
  
  public int h(Object paramObject)
  {
    int i = q * 2;
    Object[] arrayOfObject = p;
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
  
  public int hashCode()
  {
    int[] arrayOfInt = o;
    Object[] arrayOfObject = p;
    int i = q;
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
  
  public Object i(int paramInt)
  {
    return p[(paramInt << 1)];
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (q <= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Object j(int paramInt)
  {
    Object[] arrayOfObject = p;
    int i = paramInt << 1;
    Object localObject = arrayOfObject[(i + 1)];
    int j = q;
    if (j <= 1)
    {
      clear();
    }
    else
    {
      int k = j - 1;
      int[] arrayOfInt1 = o;
      int m = arrayOfInt1.length;
      int n = 8;
      if ((m > 8) && (j < arrayOfInt1.length / 3))
      {
        if (j > 8) {
          n = j + (j >> 1);
        }
        a(n);
        if (j == q)
        {
          if (paramInt > 0)
          {
            System.arraycopy(arrayOfInt1, 0, o, 0, paramInt);
            System.arraycopy(arrayOfObject, 0, p, 0, i);
          }
          if (paramInt < k)
          {
            m = paramInt + 1;
            int[] arrayOfInt2 = o;
            n = k - paramInt;
            System.arraycopy(arrayOfInt1, m, arrayOfInt2, paramInt, n);
            System.arraycopy(arrayOfObject, m << 1, p, i, n << 1);
          }
        }
        else
        {
          throw new ConcurrentModificationException();
        }
      }
      else
      {
        if (paramInt < k)
        {
          n = paramInt + 1;
          m = k - paramInt;
          System.arraycopy(arrayOfInt1, n, arrayOfInt1, paramInt, m);
          arrayOfObject = p;
          System.arraycopy(arrayOfObject, n << 1, arrayOfObject, i, m << 1);
        }
        arrayOfObject = p;
        paramInt = k << 1;
        arrayOfObject[paramInt] = null;
        arrayOfObject[(paramInt + 1)] = null;
      }
      if (j != q) {
        break label280;
      }
      q = k;
    }
    return localObject;
    label280:
    throw new ConcurrentModificationException();
  }
  
  public Object k(int paramInt, Object paramObject)
  {
    paramInt = (paramInt << 1) + 1;
    Object[] arrayOfObject = p;
    Object localObject = arrayOfObject[paramInt];
    arrayOfObject[paramInt] = paramObject;
    return localObject;
  }
  
  public Object l(int paramInt)
  {
    return p[((paramInt << 1) + 1)];
  }
  
  public Object put(Object paramObject1, Object paramObject2)
  {
    int i = q;
    int k;
    if (paramObject1 == null)
    {
      j = g();
      k = 0;
    }
    else
    {
      k = paramObject1.hashCode();
      j = e(paramObject1, k);
    }
    Object localObject;
    if (j >= 0)
    {
      j = (j << 1) + 1;
      paramObject1 = p;
      localObject = paramObject1[j];
      paramObject1[j] = paramObject2;
      return localObject;
    }
    int m = j;
    int[] arrayOfInt1 = o;
    if (i >= arrayOfInt1.length)
    {
      j = 8;
      if (i >= 8) {
        j = (i >> 1) + i;
      } else if (i < 4) {
        j = 4;
      }
      localObject = p;
      a(j);
      if (i == q)
      {
        int[] arrayOfInt2 = o;
        if (arrayOfInt2.length > 0)
        {
          System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
          System.arraycopy(localObject, 0, p, 0, localObject.length);
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
      localObject = o;
      j = m + 1;
      System.arraycopy(localObject, m, localObject, j, i - m);
      localObject = p;
      System.arraycopy(localObject, m << 1, localObject, j << 1, q - m << 1);
    }
    int j = q;
    if (i == j)
    {
      localObject = o;
      if (m < localObject.length)
      {
        localObject[m] = k;
        localObject = p;
        k = m << 1;
        localObject[k] = paramObject1;
        localObject[(k + 1)] = paramObject2;
        q = (j + 1);
        return null;
      }
    }
    throw new ConcurrentModificationException();
  }
  
  public Object putIfAbsent(Object paramObject1, Object paramObject2)
  {
    Object localObject1 = get(paramObject1);
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = put(paramObject1, paramObject2);
    }
    return localObject2;
  }
  
  public Object remove(Object paramObject)
  {
    int i = f(paramObject);
    if (i >= 0) {
      return j(i);
    }
    return null;
  }
  
  public boolean remove(Object paramObject1, Object paramObject2)
  {
    int i = f(paramObject1);
    if (i >= 0)
    {
      paramObject1 = l(i);
      if ((paramObject2 == paramObject1) || ((paramObject2 != null) && (paramObject2.equals(paramObject1))))
      {
        j(i);
        return true;
      }
    }
    return false;
  }
  
  public Object replace(Object paramObject1, Object paramObject2)
  {
    int i = f(paramObject1);
    if (i >= 0) {
      return k(i, paramObject2);
    }
    return null;
  }
  
  public boolean replace(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    int i = f(paramObject1);
    if (i >= 0)
    {
      paramObject1 = l(i);
      if ((paramObject1 == paramObject2) || ((paramObject2 != null) && (paramObject2.equals(paramObject1))))
      {
        k(i, paramObject3);
        return true;
      }
    }
    return false;
  }
  
  public int size()
  {
    return q;
  }
  
  public String toString()
  {
    if (isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(q * 28);
    localStringBuilder.append('{');
    for (int i = 0; i < q; i++)
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
      localObject = l(i);
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
 * Qualified Name:     t.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */