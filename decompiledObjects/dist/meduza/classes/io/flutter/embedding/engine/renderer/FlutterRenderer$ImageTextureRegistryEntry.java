package io.flutter.embedding.engine.renderer;

import android.hardware.SyncFence;
import android.media.Image;
import android.os.Build.VERSION;
import android.os.Handler;
import io.flutter.Log;
import io.flutter.view.TextureRegistry.ImageConsumer;
import io.flutter.view.TextureRegistry.ImageTextureEntry;
import java.io.IOException;

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
    Log.d("ImageTextureRegistryEntry", "ImageTextureEntry can't wait on the fence on Android < 33");
  }
  
  private void waitOnFence(Image paramImage)
  {
    try
    {
      paramImage.getFence().awaitForever();
      return;
    }
    catch (IOException paramImage)
    {
      for (;;) {}
    }
  }
  
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
      if (bool) {
        return;
      }
      Object localObject1 = image;
      if (localObject1 != null)
      {
        ((Image)localObject1).close();
        image = null;
      }
      released = true;
      localObject1 = FlutterRenderer.access$600(this$0);
      FlutterRenderer.TextureFinalizerRunnable localTextureFinalizerRunnable = new io/flutter/embedding/engine/renderer/FlutterRenderer$TextureFinalizerRunnable;
      localTextureFinalizerRunnable.<init>(id, FlutterRenderer.access$500(this$0));
      ((Handler)localObject1).post(localTextureFinalizerRunnable);
      return;
    }
    finally
    {
      super.finalize();
    }
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
        Log.e("ImageTextureRegistryEntry", "Dropping PlatformView Frame");
        localImage.close();
      }
      if (paramImage != null) {
        this$0.scheduleEngineFrame();
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
    FlutterRenderer.access$400(this$0, id);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.FlutterRenderer.ImageTextureRegistryEntry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */