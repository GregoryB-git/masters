package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.TextureRegistry.GLTextureConsumer;
import io.flutter.view.TextureRegistry.SurfaceProducer;
import io.flutter.view.TextureRegistry.SurfaceProducer.Callback;
import io.flutter.view.TextureRegistry.SurfaceTextureEntry;
import io.flutter.view.TextureRegistry.TextureEntry;

final class SurfaceTextureSurfaceProducer
  implements TextureRegistry.SurfaceProducer, TextureRegistry.GLTextureConsumer
{
  private final FlutterJNI flutterJNI;
  private final Handler handler;
  private final long id;
  private boolean released;
  private int requestBufferWidth;
  private int requestedBufferHeight;
  private Surface surface;
  private final TextureRegistry.SurfaceTextureEntry texture;
  
  public SurfaceTextureSurfaceProducer(long paramLong, Handler paramHandler, FlutterJNI paramFlutterJNI, TextureRegistry.SurfaceTextureEntry paramSurfaceTextureEntry)
  {
    id = paramLong;
    handler = paramHandler;
    flutterJNI = paramFlutterJNI;
    texture = paramSurfaceTextureEntry;
  }
  
  public void finalize()
  {
    try
    {
      boolean bool = released;
      if (bool) {
        return;
      }
      release();
      Handler localHandler = handler;
      FlutterRenderer.TextureFinalizerRunnable localTextureFinalizerRunnable = new io/flutter/embedding/engine/renderer/FlutterRenderer$TextureFinalizerRunnable;
      localTextureFinalizerRunnable.<init>(id, flutterJNI);
      localHandler.post(localTextureFinalizerRunnable);
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public int getHeight()
  {
    return requestedBufferHeight;
  }
  
  public Surface getSurface()
  {
    if (surface == null) {
      surface = new Surface(texture.surfaceTexture());
    }
    return surface;
  }
  
  public SurfaceTexture getSurfaceTexture()
  {
    return texture.surfaceTexture();
  }
  
  public int getWidth()
  {
    return requestBufferWidth;
  }
  
  public boolean handlesCropAndRotation()
  {
    return true;
  }
  
  public long id()
  {
    return id;
  }
  
  public void release()
  {
    texture.release();
    released = true;
  }
  
  public void scheduleFrame()
  {
    flutterJNI.markTextureFrameAvailable(id);
  }
  
  public void setCallback(TextureRegistry.SurfaceProducer.Callback paramCallback) {}
  
  public void setSize(int paramInt1, int paramInt2)
  {
    requestBufferWidth = paramInt1;
    requestedBufferHeight = paramInt2;
    getSurfaceTexture().setDefaultBufferSize(paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.renderer.SurfaceTextureSurfaceProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */