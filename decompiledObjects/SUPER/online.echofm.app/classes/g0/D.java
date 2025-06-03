package g0;

import java.util.Arrays;

public final class D
{
  public long[] a;
  public Object[] b;
  public int c;
  public int d;
  
  public D()
  {
    this(10);
  }
  
  public D(int paramInt)
  {
    a = new long[paramInt];
    b = f(paramInt);
  }
  
  public static Object[] f(int paramInt)
  {
    return new Object[paramInt];
  }
  
  public void a(long paramLong, Object paramObject)
  {
    try
    {
      d(paramLong);
      e();
      b(paramLong, paramObject);
      return;
    }
    finally
    {
      paramObject = finally;
      throw ((Throwable)paramObject);
    }
  }
  
  public final void b(long paramLong, Object paramObject)
  {
    int i = c;
    int j = d;
    Object[] arrayOfObject = b;
    i = (i + j) % arrayOfObject.length;
    a[i] = paramLong;
    arrayOfObject[i] = paramObject;
    d = (j + 1);
  }
  
  public void c()
  {
    try
    {
      c = 0;
      d = 0;
      Arrays.fill(b, null);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void d(long paramLong)
  {
    int i = d;
    if (i > 0)
    {
      int j = c;
      int k = b.length;
      if (paramLong <= a[((j + i - 1) % k)]) {
        c();
      }
    }
  }
  
  public final void e()
  {
    int i = b.length;
    if (d < i) {
      return;
    }
    int j = i * 2;
    long[] arrayOfLong = new long[j];
    Object[] arrayOfObject = f(j);
    j = c;
    i -= j;
    System.arraycopy(a, j, arrayOfLong, 0, i);
    System.arraycopy(b, c, arrayOfObject, 0, i);
    j = c;
    if (j > 0)
    {
      System.arraycopy(a, 0, arrayOfLong, i, j);
      System.arraycopy(b, 0, arrayOfObject, i, c);
    }
    a = arrayOfLong;
    b = arrayOfObject;
    c = 0;
  }
  
  public final Object g(long paramLong, boolean paramBoolean)
  {
    Object localObject = null;
    long l2;
    for (long l1 = Long.MAX_VALUE; d > 0; l1 = l2)
    {
      l2 = paramLong - a[c];
      if ((l2 < 0L) && ((paramBoolean) || (-l2 >= l1))) {
        break;
      }
      localObject = j();
    }
    return localObject;
  }
  
  public Object h()
  {
    try
    {
      Object localObject1;
      if (d == 0) {
        localObject1 = null;
      } else {
        localObject1 = j();
      }
      return localObject1;
    }
    finally {}
  }
  
  public Object i(long paramLong)
  {
    try
    {
      Object localObject1 = g(paramLong, true);
      return localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public final Object j()
  {
    boolean bool;
    if (d > 0) {
      bool = true;
    } else {
      bool = false;
    }
    a.f(bool);
    Object[] arrayOfObject = b;
    int i = c;
    Object localObject = arrayOfObject[i];
    arrayOfObject[i] = null;
    c = ((i + 1) % arrayOfObject.length);
    d -= 1;
    return localObject;
  }
  
  public int k()
  {
    try
    {
      int i = d;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     g0.D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */