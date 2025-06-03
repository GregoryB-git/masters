package com.google.ads.interactivemedia.v3.internal;

import android.view.Surface;

public final class ws$c
  extends jr
{
  private final boolean a;
  
  public ws$c(Throwable paramThrowable, jp paramjp, Surface paramSurface)
  {
    super(paramThrowable, paramjp);
    System.identityHashCode(paramSurface);
    boolean bool;
    if ((paramSurface != null) && (!paramSurface.isValid())) {
      bool = false;
    } else {
      bool = true;
    }
    a = bool;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ws.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */