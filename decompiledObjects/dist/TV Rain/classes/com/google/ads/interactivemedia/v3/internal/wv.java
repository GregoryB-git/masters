package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;

@TargetApi(17)
final class wv
  implements DisplayManager.DisplayListener
{
  private final DisplayManager a;
  
  public wv(ww paramww, DisplayManager paramDisplayManager)
  {
    a = paramDisplayManager;
  }
  
  public final void a()
  {
    a.registerDisplayListener(this, null);
  }
  
  public final void b()
  {
    a.unregisterDisplayListener(this);
  }
  
  public final void onDisplayAdded(int paramInt) {}
  
  public final void onDisplayChanged(int paramInt)
  {
    if (paramInt == 0) {
      ww.a(b);
    }
  }
  
  public final void onDisplayRemoved(int paramInt) {}
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.wv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */