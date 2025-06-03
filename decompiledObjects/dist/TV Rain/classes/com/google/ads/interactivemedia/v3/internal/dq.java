package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;

public final class dq
{
  private final Handler a;
  private final dn b;
  
  public dq(Handler paramHandler, dn paramdn)
  {
    if (paramdn != null) {
      paramHandler = (Handler)rp.a(paramHandler);
    } else {
      paramHandler = null;
    }
    a = paramHandler;
    b = paramdn;
  }
  
  public final void a(int paramInt)
  {
    if (b != null) {
      a.post(new dw(this, paramInt));
    }
  }
  
  public final void a(int paramInt, long paramLong1, long paramLong2)
  {
    if (b != null) {
      a.post(new du(this, paramInt, paramLong1, paramLong2));
    }
  }
  
  public final void a(bw parambw)
  {
    if (b != null) {
      a.post(new dr(this, parambw));
    }
  }
  
  public final void a(fa paramfa)
  {
    if (b != null) {
      a.post(new dp(this, paramfa));
    }
  }
  
  public final void a(String paramString, long paramLong1, long paramLong2)
  {
    if (b != null) {
      a.post(new ds(this, paramString, paramLong1, paramLong2));
    }
  }
  
  public final void b(fa paramfa)
  {
    paramfa.a();
    if (b != null) {
      a.post(new dt(this, paramfa));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.dq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */