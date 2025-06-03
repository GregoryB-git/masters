package j4;

import c4.t.a;
import c4.u;
import v5.e0;

public final class f
  implements e
{
  public final long[] a;
  public final long[] b;
  public final long c;
  public final long d;
  
  public f(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong1, long paramLong2)
  {
    a = paramArrayOfLong1;
    b = paramArrayOfLong2;
    c = paramLong1;
    d = paramLong2;
  }
  
  public final long a(long paramLong)
  {
    return a[e0.f(b, paramLong, true)];
  }
  
  public final long c()
  {
    return d;
  }
  
  public final boolean e()
  {
    return true;
  }
  
  public final t.a g(long paramLong)
  {
    int i = e0.f(a, paramLong, true);
    long[] arrayOfLong1 = a;
    long l = arrayOfLong1[i];
    long[] arrayOfLong2 = b;
    u localu = new u(l, arrayOfLong2[i]);
    if ((l < paramLong) && (i != arrayOfLong1.length - 1))
    {
      i++;
      return new t.a(localu, new u(arrayOfLong1[i], arrayOfLong2[i]));
    }
    return new t.a(localu, localu);
  }
  
  public final long h()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     j4.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */