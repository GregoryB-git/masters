package com.google.ads.interactivemedia.v3.internal;

import a;
import java.util.Arrays;

public final class fv
  implements ge
{
  public final int a;
  public final int[] b;
  public final long[] c;
  public final long[] d;
  public final long[] e;
  private final long f;
  
  public fv(int[] paramArrayOfInt, long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
  {
    b = paramArrayOfInt;
    c = paramArrayOfLong1;
    d = paramArrayOfLong2;
    e = paramArrayOfLong3;
    int i = paramArrayOfInt.length;
    a = i;
    if (i > 0)
    {
      f = (paramArrayOfLong2[(i - 1)] + paramArrayOfLong3[(i - 1)]);
      return;
    }
    f = 0L;
  }
  
  public final gh a(long paramLong)
  {
    int i = b(paramLong);
    gj localgj = new gj(e[i], c[i]);
    if ((b < paramLong) && (i != a - 1))
    {
      long[] arrayOfLong = e;
      i++;
      return new gh(localgj, new gj(arrayOfLong[i], c[i]));
    }
    return new gh(localgj);
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final int b(long paramLong)
  {
    return wl.a(e, paramLong, true, true);
  }
  
  public final long b()
  {
    return f;
  }
  
  public final String toString()
  {
    int i = a;
    String str1 = Arrays.toString(b);
    String str2 = Arrays.toString(c);
    String str3 = Arrays.toString(e);
    String str4 = Arrays.toString(d);
    StringBuilder localStringBuilder = new StringBuilder(a.b(str4, a.b(str3, a.b(str2, a.b(str1, 71)))));
    localStringBuilder.append("ChunkIndex(length=");
    localStringBuilder.append(i);
    localStringBuilder.append(", sizes=");
    localStringBuilder.append(str1);
    a.C(localStringBuilder, ", offsets=", str2, ", timeUs=", str3);
    return a.p(localStringBuilder, ", durationsUs=", str4, ")");
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.fv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */