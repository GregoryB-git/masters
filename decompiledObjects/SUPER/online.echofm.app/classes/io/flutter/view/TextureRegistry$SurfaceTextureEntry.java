package io.flutter.view;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
public abstract interface TextureRegistry$SurfaceTextureEntry
{
  public abstract void setOnFrameConsumedListener(TextureRegistry.a parama);
  
  public abstract void setOnTrimMemoryListener(TextureRegistry.b paramb);
  
  @NonNull
  public abstract SurfaceTexture surfaceTexture();
}

/* Location:
 * Qualified Name:     io.flutter.view.TextureRegistry.SurfaceTextureEntry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */