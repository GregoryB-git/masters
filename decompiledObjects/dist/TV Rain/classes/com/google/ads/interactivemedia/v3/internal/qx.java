package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import java.util.List;

final class qx
  extends sn
{
  private int c = a(paramod.a(0));
  
  public qx(od paramod, int[] paramArrayOfInt)
  {
    super(paramod, paramArrayOfInt);
  }
  
  public final int a()
  {
    return c;
  }
  
  public final void a(long paramLong1, long paramLong2, long paramLong3, List<? extends ow> paramList, oz[] paramArrayOfoz)
  {
    paramLong1 = SystemClock.elapsedRealtime();
    if (!b(c, paramLong1)) {
      return;
    }
    for (int i = a - 1; i >= 0; i--) {
      if (!b(i, paramLong1))
      {
        c = i;
        return;
      }
    }
    throw new IllegalStateException();
  }
  
  public final int b()
  {
    return 0;
  }
  
  public final Object c()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.qx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */