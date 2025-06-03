package r;

import b.a0;

public final class e<E>
  implements Cloneable
{
  public static final Object e = new Object();
  public boolean a = false;
  public long[] b;
  public Object[] c;
  public int d;
  
  public e()
  {
    int i = 80;
    int k;
    for (int j = 4;; j++)
    {
      k = i;
      if (j >= 32) {
        break;
      }
      k = (1 << j) - 12;
      if (80 <= k) {
        break;
      }
    }
    j = k / 8;
    b = new long[j];
    c = new Object[j];
  }
  
  public final void a(Long paramLong, long paramLong1)
  {
    int i = d;
    if ((i != 0) && (paramLong1 <= b[(i - 1)]))
    {
      e(paramLong, paramLong1);
      return;
    }
    if ((a) && (i >= b.length)) {
      c();
    }
    int j = d;
    if (j >= b.length)
    {
      int k = (j + 1) * 8;
      int m;
      for (i = 4;; i++)
      {
        m = k;
        if (i >= 32) {
          break;
        }
        m = (1 << i) - 12;
        if (k <= m) {
          break;
        }
      }
      i = m / 8;
      long[] arrayOfLong = new long[i];
      Object[] arrayOfObject = new Object[i];
      Object localObject = b;
      System.arraycopy(localObject, 0, arrayOfLong, 0, localObject.length);
      localObject = c;
      System.arraycopy(localObject, 0, arrayOfObject, 0, localObject.length);
      b = arrayOfLong;
      c = arrayOfObject;
    }
    b[j] = paramLong1;
    c[j] = paramLong;
    d = (j + 1);
  }
  
  public final e<E> b()
  {
    try
    {
      e locale = (e)super.clone();
      b = ((long[])b.clone());
      c = ((Object[])c.clone());
      return locale;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }
  
  public final void c()
  {
    int i = d;
    long[] arrayOfLong = b;
    Object[] arrayOfObject = c;
    int j = 0;
    int m;
    for (int k = j; j < i; k = m)
    {
      Object localObject = arrayOfObject[j];
      m = k;
      if (localObject != e)
      {
        if (j != k)
        {
          arrayOfLong[k] = arrayOfLong[j];
          arrayOfObject[k] = localObject;
          arrayOfObject[j] = null;
        }
        m = k + 1;
      }
      j++;
    }
    a = false;
    d = k;
  }
  
  public final Object d(Long paramLong, long paramLong1)
  {
    int i = a0.k(b, d, paramLong1);
    if (i >= 0)
    {
      Object localObject = c[i];
      if (localObject != e) {
        return localObject;
      }
    }
    return paramLong;
  }
  
  public final void e(Object paramObject, long paramLong)
  {
    int i = a0.k(b, d, paramLong);
    if (i >= 0)
    {
      c[i] = paramObject;
    }
    else
    {
      int j = i;
      int k = d;
      Object localObject1;
      if (j < k)
      {
        localObject1 = c;
        if (localObject1[j] == e)
        {
          b[j] = paramLong;
          localObject1[j] = paramObject;
          return;
        }
      }
      i = j;
      if (a)
      {
        i = j;
        if (k >= b.length)
        {
          c();
          i = a0.k(b, d, paramLong);
        }
      }
      j = d;
      if (j >= b.length)
      {
        int m = (j + 1) * 8;
        for (j = 4;; j++)
        {
          k = m;
          if (j >= 32) {
            break;
          }
          k = (1 << j) - 12;
          if (m <= k) {
            break;
          }
        }
        j = k / 8;
        long[] arrayOfLong = new long[j];
        localObject1 = new Object[j];
        Object localObject2 = b;
        System.arraycopy(localObject2, 0, arrayOfLong, 0, localObject2.length);
        localObject2 = c;
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
        b = arrayOfLong;
        c = ((Object[])localObject1);
      }
      j = d - i;
      if (j != 0)
      {
        localObject1 = b;
        k = i + 1;
        System.arraycopy(localObject1, i, localObject1, k, j);
        localObject1 = c;
        System.arraycopy(localObject1, i, localObject1, k, d - i);
      }
      b[i] = paramLong;
      c[i] = paramObject;
      d += 1;
    }
  }
  
  public final String toString()
  {
    if (a) {
      c();
    }
    int i = d;
    if (i <= 0) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(i * 28);
    localStringBuilder.append('{');
    for (i = 0; i < d; i++)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      if (a) {
        c();
      }
      localStringBuilder.append(b[i]);
      localStringBuilder.append('=');
      if (a) {
        c();
      }
      Object localObject = c[i];
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
 * Qualified Name:     r.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */