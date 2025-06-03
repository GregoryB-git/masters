package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;

public abstract interface TextureRegistry
{
  public abstract ImageTextureEntry createImageTexture();
  
  public abstract SurfaceProducer createSurfaceProducer();
  
  public abstract SurfaceTextureEntry createSurfaceTexture();
  
  public abstract void onTrimMemory(int paramInt);
  
  public abstract SurfaceTextureEntry registerSurfaceTexture(SurfaceTexture paramSurfaceTexture);
  
  public static abstract interface GLTextureConsumer
  {
    public abstract SurfaceTexture getSurfaceTexture();
  }
  
  public static abstract interface ImageConsumer
  {
    public abstract Image acquireLatestImage();
  }
  
  public static abstract interface ImageTextureEntry
    extends TextureRegistry.TextureEntry
  {
    public abstract void pushImage(Image paramImage);
  }
  
  public static abstract interface OnFrameConsumedListener
  {
    public abstract void onFrameConsumed();
  }
  
  public static abstract interface OnTrimMemoryListener
  {
    public abstract void onTrimMemory(int paramInt);
  }
  
  public static abstract interface SurfaceProducer
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
  
  public static abstract interface SurfaceTextureEntry
    extends TextureRegistry.TextureEntry
  {
    public abstract void setOnFrameConsumedListener(TextureRegistry.OnFrameConsumedListener paramOnFrameConsumedListener);
    
    public abstract void setOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener paramOnTrimMemoryListener);
    
    public abstract SurfaceTexture surfaceTexture();
  }
  
  public static abstract interface TextureEntry
  {
    public abstract long id();
    
    public abstract void release();
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.TextureRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */