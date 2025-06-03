package c4;

import v5.e0;
import x6.b;

public final class r
  implements t
{
  public final long[] a;
  public final long[] b;
  public final long c;
  public final boolean d;
  
  public r(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong)
  {
    boolean bool;
    if (paramArrayOfLong1.length == paramArrayOfLong2.length) {
      bool = true;
    } else {
      bool = false;
    }
    b.q(bool);
    int i = paramArrayOfLong2.length;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    d = bool;
    if ((bool) && (paramArrayOfLong2[0] > 0L))
    {
      int j = i + 1;
      long[] arrayOfLong1 = new long[j];
      a = arrayOfLong1;
      long[] arrayOfLong2 = new long[j];
      b = arrayOfLong2;
      System.arraycopy(paramArrayOfLong1, 0, arrayOfLong1, 1, i);
      System.arraycopy(paramArrayOfLong2, 0, arrayOfLong2, 1, i);
    }
    else
    {
      a = paramArrayOfLong1;
      b = paramArrayOfLong2;
    }
    c = paramLong;
  }
  
  public final boolean e()
  {
    return d;
  }
  
  public final t.a g(long paramLong)
  {
    if (!d)
    {
      localObject = u.c;
      return new t.a((u)localObject, (u)localObject);
    }
    int i = e0.f(b, paramLong, true);
    Object localObject = b;
    long l = localObject[i];
    long[] arrayOfLong = a;
    u localu = new u(l, arrayOfLong[i]);
    if ((l != paramLong) && (i != localObject.length - 1))
    {
      i++;
      return new t.a(localu, new u(localObject[i], arrayOfLong[i]));
    }
    return new t.a(localu, localu);
  }
  
  public final long h()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     c4.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */