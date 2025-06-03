package io.flutter.view;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
public abstract interface TextureRegistry$SurfaceProducer
{
  public abstract int getHeight();
  
  public abstract Surface getSurface();
  
  public abstract int getWidth();
  
  public abstract void scheduleFrame();
  
  public abstract void setSize(int paramInt1, int paramInt2);
}

/* Location:
 * Qualified Name:     io.flutter.view.TextureRegistry.SurfaceProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */