package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

public final class og
{
  public static final og a = new og(new long[0]);
  public final long[] b;
  public final oj[] c;
  public final long d;
  private final int e;
  private final long f;
  
  private og(long... paramVarArgs)
  {
    int i = paramVarArgs.length;
    e = i;
    b = Arrays.copyOf(paramVarArgs, i);
    c = new oj[i];
    for (int j = 0; j < i; j++) {
      c[j] = new oj();
    }
    d = 0L;
    f = -9223372036854775807L;
  }
  
  public final int a(long paramLong)
  {
    for (int i = b.length - 1; i >= 0; i--)
    {
      int j = 0;
      int k = j;
      if (paramLong != Long.MIN_VALUE)
      {
        long l = b[i];
        if (l == Long.MIN_VALUE)
        {
          l = f;
          if (l != -9223372036854775807L)
          {
            k = j;
            if (paramLong >= l) {
              break label87;
            }
          }
        }
        else
        {
          k = j;
          if (paramLong >= l) {
            break label87;
          }
        }
        k = 1;
      }
      label87:
      if (k == 0) {
        break;
      }
    }
    if ((i >= 0) && (c[i].a())) {
      return i;
    }
    return -1;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (og.class == paramObject.getClass()))
    {
      paramObject = (og)paramObject;
      if ((e == e) && (f == f) && (Arrays.equals(b, b)) && (Arrays.equals(c, c))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = e;
    int j = (int)f;
    int k = Arrays.hashCode(b);
    return Arrays.hashCode(c) + (k + (i * 31 * 31 + j) * 31) * 31;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.og
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */