package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;

public final class on
  implements fy
{
  public final fw a;
  private final int b;
  private final bw c;
  private final SparseArray<om> d;
  private boolean e;
  private op f;
  private long g;
  private ge h;
  private bw[] i;
  
  public on(fw paramfw, int paramInt, bw parambw)
  {
    a = paramfw;
    b = paramInt;
    c = parambw;
    d = new SparseArray();
  }
  
  public final gi a(int paramInt1, int paramInt2)
  {
    om localom = (om)d.get(paramInt1);
    Object localObject = localom;
    if (localom == null)
    {
      boolean bool;
      if (i == null) {
        bool = true;
      } else {
        bool = false;
      }
      rp.c(bool);
      if (paramInt2 == b) {
        localObject = c;
      } else {
        localObject = null;
      }
      localObject = new om(paramInt1, paramInt2, (bw)localObject);
      ((om)localObject).a(f, g);
      d.put(paramInt1, localObject);
    }
    return (gi)localObject;
  }
  
  public final void a()
  {
    bw[] arrayOfbw = new bw[d.size()];
    for (int j = 0; j < d.size(); j++) {
      arrayOfbw[j] = d.valueAt(j)).a;
    }
    i = arrayOfbw;
  }
  
  public final void a(ge paramge)
  {
    h = paramge;
  }
  
  public final void a(op paramop, long paramLong1, long paramLong2)
  {
    f = paramop;
    g = paramLong2;
    if (!e)
    {
      a.a(this);
      if (paramLong1 != -9223372036854775807L) {
        a.a(0L, paramLong1);
      }
      e = true;
      return;
    }
    fw localfw = a;
    long l = paramLong1;
    if (paramLong1 == -9223372036854775807L) {
      l = 0L;
    }
    localfw.a(0L, l);
    for (int j = 0; j < d.size(); j++) {
      ((om)d.valueAt(j)).a(paramop, paramLong2);
    }
  }
  
  public final ge b()
  {
    return h;
  }
  
  public final bw[] c()
  {
    return i;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.on
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */