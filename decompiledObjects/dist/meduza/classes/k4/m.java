package k4;

import v5.e0;
import x6.b;

public final class m
{
  public final j a;
  public final int b;
  public final long[] c;
  public final int[] d;
  public final int e;
  public final long[] f;
  public final int[] g;
  public final long h;
  
  public m(j paramj, long[] paramArrayOfLong1, int[] paramArrayOfInt1, int paramInt, long[] paramArrayOfLong2, int[] paramArrayOfInt2, long paramLong)
  {
    int i = paramArrayOfInt1.length;
    int j = paramArrayOfLong2.length;
    boolean bool1 = false;
    if (i == j) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.q(bool2);
    if (paramArrayOfLong1.length == paramArrayOfLong2.length) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.q(bool2);
    boolean bool2 = bool1;
    if (paramArrayOfInt2.length == paramArrayOfLong2.length) {
      bool2 = true;
    }
    b.q(bool2);
    a = paramj;
    c = paramArrayOfLong1;
    d = paramArrayOfInt1;
    e = paramInt;
    f = paramArrayOfLong2;
    g = paramArrayOfInt2;
    h = paramLong;
    b = paramArrayOfLong1.length;
    if (paramArrayOfInt2.length > 0)
    {
      paramInt = paramArrayOfInt2.length - 1;
      paramArrayOfInt2[paramInt] |= 0x20000000;
    }
  }
  
  public final int a(long paramLong)
  {
    for (int i = e0.b(f, paramLong, true); i < f.length; i++) {
      if ((g[i] & 0x1) != 0) {
        return i;
      }
    }
    return -1;
  }
}

/* Location:
 * Qualified Name:     k4.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */