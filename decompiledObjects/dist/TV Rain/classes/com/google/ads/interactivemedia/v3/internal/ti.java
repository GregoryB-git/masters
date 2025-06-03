package com.google.ads.interactivemedia.v3.internal;

import android.view.View;

final class ti
  implements Runnable
{
  private float a;
  private float b;
  private boolean c;
  private boolean d;
  
  private ti(tj paramtj) {}
  
  public final void a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    a = paramFloat1;
    b = paramFloat2;
    c = paramBoolean;
    if (!d)
    {
      d = true;
      e.post(this);
    }
  }
  
  public final void run()
  {
    d = false;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ti
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */