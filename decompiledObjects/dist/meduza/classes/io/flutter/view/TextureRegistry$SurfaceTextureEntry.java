package io.flutter.view;

import android.graphics.SurfaceTexture;

public abstract interface TextureRegistry$SurfaceTextureEntry
  extends TextureRegistry.TextureEntry
{
  public abstract void setOnFrameConsumedListener(TextureRegistry.OnFrameConsumedListener paramOnFrameConsumedListener);
  
  public abstract void setOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener paramOnTrimMemoryListener);
  
  public abstract SurfaceTexture surfaceTexture();
}

/* Location:
 * Qualified Name:     io.flutter.view.TextureRegistry.SurfaceTextureEntry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */