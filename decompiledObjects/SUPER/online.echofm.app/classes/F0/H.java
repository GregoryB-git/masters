package F0;

import g0.a;

public final class H
  implements M
{
  public final long[] a;
  public final long[] b;
  public final long c;
  public final boolean d;
  
  public H(long[] paramArrayOfLong1, long[] paramArrayOfLong2, long paramLong)
  {
    boolean bool;
    if (paramArrayOfLong1.length == paramArrayOfLong2.length) {
      bool = true;
    } else {
      bool = false;
    }
    a.a(bool);
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
  
  public boolean h()
  {
    return d;
  }
  
  public M.a j(long paramLong)
  {
    if (!d) {
      return new M.a(N.c);
    }
    int i = g0.M.h(b, paramLong, true, true);
    N localN = new N(b[i], a[i]);
    if ((a != paramLong) && (i != b.length - 1))
    {
      long[] arrayOfLong = b;
      i++;
      return new M.a(localN, new N(arrayOfLong[i], a[i]));
    }
    return new M.a(localN);
  }
  
  public long l()
  {
    return c;
  }
}

/* Location:
 * Qualified Name:     F0.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */