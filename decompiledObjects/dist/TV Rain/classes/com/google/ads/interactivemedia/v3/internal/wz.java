package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.view.Surface;

public final class wz
{
  private final Handler a;
  private final xa b;
  
  public wz(Handler paramHandler, xa paramxa)
  {
    if (paramxa != null) {
      paramHandler = (Handler)rp.a(paramHandler);
    } else {
      paramHandler = null;
    }
    a = paramHandler;
    b = paramxa;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    if (b != null) {
      a.post(new xg(this, paramInt1, paramInt2, paramInt3, paramFloat));
    }
  }
  
  public final void a(int paramInt, long paramLong)
  {
    if (b != null) {
      a.post(new xd(this, paramInt, paramLong));
    }
  }
  
  public final void a(Surface paramSurface)
  {
    if (b != null) {
      a.post(new xf(this, paramSurface));
    }
  }
  
  public final void a(bw parambw)
  {
    if (b != null) {
      a.post(new xe(this, parambw));
    }
  }
  
  public final void a(fa paramfa)
  {
    if (b != null) {
      a.post(new xc(this, paramfa));
    }
  }
  
  public final void a(String paramString, long paramLong1, long paramLong2)
  {
    if (b != null) {
      a.post(new xb(this, paramString, paramLong1, paramLong2));
    }
  }
  
  public final void b(fa paramfa)
  {
    paramfa.a();
    if (b != null) {
      a.post(new xi(this, paramfa));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */