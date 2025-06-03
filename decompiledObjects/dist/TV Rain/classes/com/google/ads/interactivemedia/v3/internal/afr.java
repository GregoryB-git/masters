package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;

final class afr
{
  private final aft a;
  private final long b;
  private final Handler c;
  private boolean d;
  
  public afr(aft paramaft, long paramLong)
  {
    a = paramaft;
    c = new Handler();
    b = paramLong;
    d = false;
  }
  
  private static void b(aft paramaft, Handler paramHandler, long paramLong)
  {
    paramHandler.postDelayed(new afq(paramaft, paramHandler, paramLong), paramLong);
  }
  
  public final void a()
  {
    if (d) {
      return;
    }
    d = true;
    a.b();
    b(a, c, b);
  }
  
  public final void b()
  {
    if (!d) {
      return;
    }
    d = false;
    c.removeCallbacksAndMessages(null);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.afr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */