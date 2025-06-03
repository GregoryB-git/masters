package io.flutter.plugin.platform;

import android.view.Surface;

public abstract interface PlatformViewRenderTarget
{
  public abstract int getHeight();
  
  public abstract long getId();
  
  public abstract Surface getSurface();
  
  public abstract int getWidth();
  
  public abstract boolean isReleased();
  
  public abstract void release();
  
  public abstract void resize(int paramInt1, int paramInt2);
  
  public abstract void scheduleFrame();
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.PlatformViewRenderTarget
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */