package io.flutter.view;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
public abstract interface TextureRegistry$GLTextureConsumer
{
  @NonNull
  public abstract SurfaceTexture getSurfaceTexture();
}

/* Location:
 * Qualified Name:     io.flutter.view.TextureRegistry.GLTextureConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */