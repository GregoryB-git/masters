package Z0;

import g0.M;

public abstract class e
{
  public static b a(int paramInt, long[] paramArrayOfLong, int[] paramArrayOfInt, long paramLong)
  {
    int i = 8192 / paramInt;
    int j = paramArrayOfInt.length;
    int k = 0;
    int m = 0;
    int n = m;
    while (m < j)
    {
      n += M.k(paramArrayOfInt[m], i);
      m++;
    }
    long[] arrayOfLong1 = new long[n];
    int[] arrayOfInt1 = new int[n];
    long[] arrayOfLong2 = new long[n];
    int[] arrayOfInt2 = new int[n];
    int i1 = 0;
    m = i1;
    j = m;
    n = m;
    for (m = k; m < paramArrayOfInt.length; m++)
    {
      k = paramArrayOfInt[m];
      long l = paramArrayOfLong[m];
      while (k > 0)
      {
        int i2 = Math.min(i, k);
        arrayOfLong1[n] = l;
        int i3 = paramInt * i2;
        arrayOfInt1[n] = i3;
        j = Math.max(j, i3);
        arrayOfLong2[n] = (i1 * paramLong);
        arrayOfInt2[n] = 1;
        l += arrayOfInt1[n];
        i1 += i2;
        k -= i2;
        n++;
      }
    }
    return new b(arrayOfLong1, arrayOfInt1, j, arrayOfLong2, arrayOfInt2, paramLong * i1, null);
  }
  
  public static final class b
  {
    public final long[] a;
    public final int[] b;
    public final int c;
    public final long[] d;
    public final int[] e;
    public final long f;
    
    public b(long[] paramArrayOfLong1, int[] paramArrayOfInt1, int paramInt, long[] paramArrayOfLong2, int[] paramArrayOfInt2, long paramLong)
    {
      a = paramArrayOfLong1;
      b = paramArrayOfInt1;
      c = paramInt;
      d = paramArrayOfLong2;
      e = paramArrayOfInt2;
      f = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     Z0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */