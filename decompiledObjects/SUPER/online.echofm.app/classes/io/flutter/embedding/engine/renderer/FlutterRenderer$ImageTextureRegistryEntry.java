package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.media.Image;
import android.os.Build.VERSION;
import android.os.Handler;
import androidx.annotation.Keep;
import io.flutter.view.TextureRegistry.ImageConsumer;
import io.flutter.view.TextureRegistry.ImageTextureEntry;
import java.io.IOException;
import t5.b;

@Keep
final class FlutterRenderer$ImageTextureRegistryEntry
  implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer
{
  private static final String TAG = "ImageTextureRegistryEntry";
  private final long id;
  private boolean ignoringFence = false;
  private Image image;
  private boolean released;
  
  public FlutterRenderer$ImageTextureRegistryEntry(FlutterRenderer paramFlutterRenderer, long paramLong)
  {
    id = paramLong;
  }
  
  @TargetApi(29)
  private void maybeWaitOnFence(Image paramImage)
  {
    if (paramImage == null) {
      return;
    }
    if (ignoringFence) {
      return;
    }
    if (Build.VERSION.SDK_INT >= 33)
    {
      waitOnFence(paramImage);
      return;
    }
    ignoringFence = true;
    b.g("ImageTextureRegistryEntry", "ImageTextureEntry can't wait on the fence on Android < 33");
  }
  
  @TargetApi(33)
  private void waitOnFence(Image paramImage)
  {
    try
    {
      f.a(e.a(paramImage));
      return;
    }
    catch (IOException paramImage)
    {
      for (;;) {}
    }
  }
  
  @TargetApi(29)
  public Image acquireLatestImage()
  {
    try
    {
      Image localImage = image;
      image = null;
      maybeWaitOnFence(localImage);
      return localImage;
    }
    finally {}
  }
  
  public void finalize()
  {
    try
    {
      boolean bool = released;
      if (bool)
      {
        super.finalize();
        return;
      }
      Image localImage = image;
      if (localImage != null)
      {
        localImage.close();
        image = null;
      }
    }
    finally
    {
      break label82;
    }
    released = true;
    Handler localHandler = FlutterRenderer.d(this$0);
    FlutterRenderer.e locale = new io/flutter/embedding/engine/renderer/FlutterRenderer$e;
    locale.<init>(id, FlutterRenderer.c(this$0));
    localHandler.post(locale);
    super.finalize();
    return;
    label82:
    super.finalize();
    throw localHandler;
  }
  
  public long id()
  {
    return id;
  }
  
  public void pushImage(Image paramImage)
  {
    if (released) {
      return;
    }
    try
    {
      Image localImage = image;
      image = paramImage;
      if (localImage != null)
      {
        b.b("ImageTextureRegistryEntry", "Dropping PlatformView Frame");
        localImage.close();
      }
      if (paramImage != null) {
        FlutterRenderer.e(this$0);
      }
      return;
    }
    finally {}
  }
  
  public void release()
  {
    if (released) {
      return;
    }
    released = true;
    Image localImage = image;
    if (localImage != null)
    {
      localImage.close();
      image = null;
    }
    FlutterRenderer.b(this$0, id);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.FlutterRenderer.ImageTextureRegistryEntry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */