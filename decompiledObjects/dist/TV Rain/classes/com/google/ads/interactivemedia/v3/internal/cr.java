package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;

public abstract class cr
{
  public static final cr a = new cu();
  
  public int a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramInt2 != 0)
    {
      if (paramInt2 != 1)
      {
        if (paramInt2 == 2)
        {
          if (paramInt1 == a(paramBoolean)) {
            return b(paramBoolean);
          }
          return paramInt1 + 1;
        }
        throw new IllegalStateException();
      }
      return paramInt1;
    }
    if (paramInt1 == a(paramBoolean)) {
      return -1;
    }
    return paramInt1 + 1;
  }
  
  public final int a(int paramInt1, ct paramct, cw paramcw, int paramInt2, boolean paramBoolean)
  {
    int i = ab;
    if (a0Lf == paramInt1)
    {
      paramInt1 = a(i, paramInt2, paramBoolean);
      if (paramInt1 == -1) {
        return -1;
      }
      return a0Le;
    }
    return paramInt1 + 1;
  }
  
  public abstract int a(Object paramObject);
  
  public int a(boolean paramBoolean)
  {
    if (a()) {
      return -1;
    }
    return b() - 1;
  }
  
  public final Pair<Object, Long> a(cw paramcw, ct paramct, int paramInt, long paramLong)
  {
    return (Pair)rp.a(a(paramcw, paramct, paramInt, paramLong, 0L));
  }
  
  public final Pair<Object, Long> a(cw paramcw, ct paramct, int paramInt, long paramLong1, long paramLong2)
  {
    rp.a(paramInt, 0, b());
    a(paramInt, paramcw, paramLong2);
    paramLong2 = paramLong1;
    if (paramLong1 == -9223372036854775807L)
    {
      paramLong1 = g;
      paramLong2 = paramLong1;
      if (paramLong1 == -9223372036854775807L) {
        return null;
      }
    }
    paramInt = e;
    paramLong1 = i + paramLong2;
    for (paramLong2 = ac; (paramLong2 != -9223372036854775807L) && (paramLong1 >= paramLong2) && (paramInt < f); paramLong2 = ac)
    {
      paramLong1 -= paramLong2;
      paramInt++;
    }
    return Pair.create(rp.a(a), Long.valueOf(paramLong1));
  }
  
  public abstract ct a(int paramInt, ct paramct, boolean paramBoolean);
  
  public ct a(Object paramObject, ct paramct)
  {
    return a(a(paramObject), paramct, true);
  }
  
  public abstract cw a(int paramInt, cw paramcw, long paramLong);
  
  public abstract Object a(int paramInt);
  
  public final boolean a()
  {
    return b() == 0;
  }
  
  public abstract int b();
  
  public int b(boolean paramBoolean)
  {
    if (a()) {
      return -1;
    }
    return 0;
  }
  
  public abstract int c();
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.cr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */