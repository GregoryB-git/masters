package io.flutter.view;

import android.view.Surface;

public abstract interface TextureRegistry$SurfaceProducer
  extends TextureRegistry.TextureEntry
{
  public abstract int getHeight();
  
  public abstract Surface getSurface();
  
  public abstract int getWidth();
  
  public abstract boolean handlesCropAndRotation();
  
  public abstract void scheduleFrame();
  
  public abstract void setCallback(Callback paramCallback);
  
  public abstract void setSize(int paramInt1, int paramInt2);
  
  public static abstract interface Callback
  {
    public abstract void onSurfaceAvailable();
    
    public abstract void onSurfaceCleanup();
    
    @Deprecated(forRemoval=true, since="Flutter 3.27")
    public abstract void onSurfaceCreated();
    
    @Deprecated(forRemoval=true, since="Flutter 3.28")
    public abstract void onSurfaceDestroyed();
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.TextureRegistry.SurfaceProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */