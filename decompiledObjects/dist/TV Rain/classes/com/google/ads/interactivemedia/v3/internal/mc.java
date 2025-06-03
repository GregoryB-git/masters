package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;

final class mc
{
  private final Handler a;
  private final Runnable b;
  
  public mc(Handler paramHandler, Runnable paramRunnable)
  {
    a = paramHandler;
    b = paramRunnable;
  }
  
  public final void a()
  {
    a.post(b);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.mc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */