package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;

public final class rx
  extends rz
{
  public final int a;
  public final long b;
  public final long c;
  public final boolean d;
  public final int e;
  public final long f;
  public final int g;
  public final long h;
  public final boolean i;
  public final boolean j;
  public final fe k;
  public final List<sa> l;
  public final long m;
  
  public rx(int paramInt1, String paramString, List<String> paramList, long paramLong1, long paramLong2, boolean paramBoolean1, int paramInt2, long paramLong3, int paramInt3, long paramLong4, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, fe paramfe, List<sa> paramList1)
  {
    super(paramString, paramList, paramBoolean2);
    a = paramInt1;
    c = paramLong2;
    d = paramBoolean1;
    e = paramInt2;
    f = paramLong3;
    g = paramInt3;
    h = paramLong4;
    i = paramBoolean3;
    j = paramBoolean4;
    k = paramfe;
    l = Collections.unmodifiableList(paramList1);
    if (!paramList1.isEmpty())
    {
      paramString = (sa)paramList1.get(paramList1.size() - 1);
      m = (e + c);
    }
    else
    {
      m = 0L;
    }
    if (paramLong1 == -9223372036854775807L) {
      paramLong1 = -9223372036854775807L;
    } else if (paramLong1 < 0L) {
      paramLong1 = m + paramLong1;
    }
    b = paramLong1;
  }
  
  public final long a()
  {
    return c + m;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.rx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */