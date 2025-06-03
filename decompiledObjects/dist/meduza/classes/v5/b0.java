package v5;

import java.util.Arrays;
import x6.b;

public final class b0<V>
{
  public long[] a = new long[10];
  public V[] b = new Object[10];
  public int c;
  public int d;
  
  public final void a(Object paramObject, long paramLong)
  {
    try
    {
      int i = d;
      if (i > 0)
      {
        int j = c;
        k = b.length;
        if (paramLong <= a[((j + i - 1) % k)]) {
          b();
        }
      }
      c();
      i = c;
      int k = d;
      Object[] arrayOfObject = b;
      i = (i + k) % arrayOfObject.length;
      a[i] = paramLong;
      arrayOfObject[i] = paramObject;
      d = (k + 1);
      return;
    }
    finally {}
  }
  
  public final void b()
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
  
  public final void c()
  {
    int i = b.length;
    if (d < i) {
      return;
    }
    int j = i * 2;
    long[] arrayOfLong = new long[j];
    Object[] arrayOfObject = new Object[j];
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
  
  public final V d(long paramLong, boolean paramBoolean)
  {
    Object localObject = null;
    long l2;
    for (long l1 = Long.MAX_VALUE; d > 0; l1 = l2)
    {
      l2 = paramLong - a[c];
      if ((l2 < 0L) && ((paramBoolean) || (-l2 >= l1))) {
        break;
      }
      localObject = e();
    }
    return (V)localObject;
  }
  
  public final V e()
  {
    boolean bool;
    if (d > 0) {
      bool = true;
    } else {
      bool = false;
    }
    b.H(bool);
    Object[] arrayOfObject = b;
    int i = c;
    Object localObject = arrayOfObject[i];
    arrayOfObject[i] = null;
    c = ((i + 1) % arrayOfObject.length);
    d -= 1;
    return (V)localObject;
  }
}

/* Location:
 * Qualified Name:     v5.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */