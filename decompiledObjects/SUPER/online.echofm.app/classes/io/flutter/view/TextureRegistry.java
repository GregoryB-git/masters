package io.flutter.view;

import android.graphics.SurfaceTexture;
import android.media.Image;
import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

public abstract interface TextureRegistry
{
  @Keep
  public static abstract interface GLTextureConsumer
  {
    @NonNull
    public abstract SurfaceTexture getSurfaceTexture();
  }
  
  @Keep
  public static abstract interface ImageConsumer
  {
    public abstract Image acquireLatestImage();
  }
  
  @Keep
  public static abstract interface ImageTextureEntry
  {
    public abstract void pushImage(Image paramImage);
  }
  
  @Keep
  public static abstract interface SurfaceProducer
  {
    public abstract int getHeight();
    
    public abstract Surface getSurface();
    
    public abstract int getWidth();
    
    public abstract void scheduleFrame();
    
    public abstract void setSize(int paramInt1, int paramInt2);
  }
  
  @Keep
  public static abstract interface SurfaceTextureEntry
  {
    public abstract void setOnFrameConsumedListener(TextureRegistry.a parama);
    
    public abstract void setOnTrimMemoryListener(TextureRegistry.b paramb);
    
    @NonNull
    public abstract SurfaceTexture surfaceTexture();
  }
  
  public static abstract interface a {}
  
  public static abstract interface b
  {
    public abstract void onTrimMemory(int paramInt);
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.TextureRegistry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */