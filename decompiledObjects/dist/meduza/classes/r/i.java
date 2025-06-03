package r;

import b.a0;

public final class i<E>
  implements Cloneable
{
  public static final Object d = new Object();
  public int[] a;
  public Object[] b;
  public int c;
  
  public i()
  {
    int i = 40;
    int k;
    for (int j = 4;; j++)
    {
      k = i;
      if (j >= 32) {
        break;
      }
      k = (1 << j) - 12;
      if (40 <= k) {
        break;
      }
    }
    j = k / 4;
    a = new int[j];
    b = new Object[j];
  }
  
  public final void a(int paramInt, E paramE)
  {
    int i = c;
    if ((i != 0) && (paramInt <= a[(i - 1)]))
    {
      d(paramInt, paramE);
      return;
    }
    if (i >= a.length)
    {
      int j = (i + 1) * 4;
      int m;
      for (int k = 4;; k++)
      {
        m = j;
        if (k >= 32) {
          break;
        }
        m = (1 << k) - 12;
        if (j <= m) {
          break;
        }
      }
      k = m / 4;
      int[] arrayOfInt = new int[k];
      Object[] arrayOfObject = new Object[k];
      Object localObject = a;
      System.arraycopy(localObject, 0, arrayOfInt, 0, localObject.length);
      localObject = b;
      System.arraycopy(localObject, 0, arrayOfObject, 0, localObject.length);
      a = arrayOfInt;
      b = arrayOfObject;
    }
    a[i] = paramInt;
    b[i] = paramE;
    c = (i + 1);
  }
  
  public final i<E> b()
  {
    try
    {
      i locali = (i)super.clone();
      a = ((int[])a.clone());
      b = ((Object[])b.clone());
      return locali;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError(localCloneNotSupportedException);
    }
  }
  
  public final Object c(int paramInt, Integer paramInteger)
  {
    Object localObject = a;
    paramInt = a0.j(c, paramInt, (int[])localObject);
    if (paramInt >= 0)
    {
      localObject = b[paramInt];
      if (localObject != d) {
        return localObject;
      }
    }
    return paramInteger;
  }
  
  public final void d(int paramInt, E paramE)
  {
    Object localObject1 = a;
    int i = a0.j(c, paramInt, (int[])localObject1);
    if (i >= 0)
    {
      b[i] = paramE;
    }
    else
    {
      int j = i;
      i = c;
      if (j < i)
      {
        localObject1 = b;
        if (localObject1[j] == d)
        {
          a[j] = paramInt;
          localObject1[j] = paramE;
          return;
        }
      }
      int m;
      if (i >= a.length)
      {
        int k = (i + 1) * 4;
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
        i = m / 4;
        int[] arrayOfInt = new int[i];
        localObject1 = new Object[i];
        Object localObject2 = a;
        System.arraycopy(localObject2, 0, arrayOfInt, 0, localObject2.length);
        localObject2 = b;
        System.arraycopy(localObject2, 0, localObject1, 0, localObject2.length);
        a = arrayOfInt;
        b = ((Object[])localObject1);
      }
      i = c - j;
      if (i != 0)
      {
        localObject1 = a;
        m = j + 1;
        System.arraycopy(localObject1, j, localObject1, m, i);
        localObject1 = b;
        System.arraycopy(localObject1, j, localObject1, m, c - j);
      }
      a[j] = paramInt;
      b[j] = paramE;
      c += 1;
    }
  }
  
  public final String toString()
  {
    int i = c;
    if (i <= 0) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder(i * 28);
    localStringBuilder.append('{');
    for (i = 0; i < c; i++)
    {
      if (i > 0) {
        localStringBuilder.append(", ");
      }
      localStringBuilder.append(a[i]);
      localStringBuilder.append('=');
      Object localObject = b[i];
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
 * Qualified Name:     r.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */