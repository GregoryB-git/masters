package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import f;
import io.flutter.Log;
import io.flutter.view.TextureRegistry.OnFrameConsumedListener;
import io.flutter.view.TextureRegistry.OnTrimMemoryListener;
import io.flutter.view.TextureRegistry.SurfaceTextureEntry;

final class FlutterRenderer$SurfaceTextureRegistryEntry
  implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.OnTrimMemoryListener
{
  private TextureRegistry.OnFrameConsumedListener frameConsumedListener;
  private final long id;
  private boolean released;
  private final SurfaceTextureWrapper textureWrapper;
  private TextureRegistry.OnTrimMemoryListener trimMemoryListener;
  
  public FlutterRenderer$SurfaceTextureRegistryEntry(FlutterRenderer paramFlutterRenderer, long paramLong, SurfaceTexture paramSurfaceTexture)
  {
    id = paramLong;
    textureWrapper = new SurfaceTextureWrapper(paramSurfaceTexture, new c(this));
    paramFlutterRenderer = new d(this);
    surfaceTexture().setOnFrameAvailableListener(paramFlutterRenderer, new Handler());
  }
  
  private void removeListener()
  {
    this$0.removeOnTrimMemoryListener(this);
  }
  
  public void finalize()
  {
    try
    {
      boolean bool = released;
      if (bool) {
        return;
      }
      Handler localHandler = FlutterRenderer.access$600(this$0);
      FlutterRenderer.TextureFinalizerRunnable localTextureFinalizerRunnable = new io/flutter/embedding/engine/renderer/FlutterRenderer$TextureFinalizerRunnable;
      localTextureFinalizerRunnable.<init>(id, FlutterRenderer.access$500(this$0));
      localHandler.post(localTextureFinalizerRunnable);
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
  
  public void onTrimMemory(int paramInt)
  {
    TextureRegistry.OnTrimMemoryListener localOnTrimMemoryListener = trimMemoryListener;
    if (localOnTrimMemoryListener != null) {
      localOnTrimMemoryListener.onTrimMemory(paramInt);
    }
  }
  
  public void release()
  {
    if (released) {
      return;
    }
    StringBuilder localStringBuilder = f.l("Releasing a SurfaceTexture (");
    localStringBuilder.append(id);
    localStringBuilder.append(").");
    Log.v("FlutterRenderer", localStringBuilder.toString());
    textureWrapper.release();
    FlutterRenderer.access$400(this$0, id);
    removeListener();
    released = true;
  }
  
  public void setOnFrameConsumedListener(TextureRegistry.OnFrameConsumedListener paramOnFrameConsumedListener)
  {
    frameConsumedListener = paramOnFrameConsumedListener;
  }
  
  public void setOnTrimMemoryListener(TextureRegistry.OnTrimMemoryListener paramOnTrimMemoryListener)
  {
    trimMemoryListener = paramOnTrimMemoryListener;
  }
  
  public SurfaceTexture surfaceTexture()
  {
    return textureWrapper.surfaceTexture();
  }
  
  public SurfaceTextureWrapper textureWrapper()
  {
    return textureWrapper;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.FlutterRenderer.SurfaceTextureRegistryEntry
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */