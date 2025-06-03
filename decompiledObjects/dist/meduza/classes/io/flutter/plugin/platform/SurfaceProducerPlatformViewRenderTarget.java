package io.flutter.plugin.platform;

import android.view.Surface;
import io.flutter.view.TextureRegistry.SurfaceProducer;
import io.flutter.view.TextureRegistry.TextureEntry;

public class SurfaceProducerPlatformViewRenderTarget
  implements PlatformViewRenderTarget
{
  private static final String TAG = "SurfaceProducerRenderTarget";
  private TextureRegistry.SurfaceProducer producer;
  
  public SurfaceProducerPlatformViewRenderTarget(TextureRegistry.SurfaceProducer paramSurfaceProducer)
  {
    producer = paramSurfaceProducer;
  }
  
  public int getHeight()
  {
    return producer.getHeight();
  }
  
  public long getId()
  {
    return producer.id();
  }
  
  public Surface getSurface()
  {
    return producer.getSurface();
  }
  
  public int getWidth()
  {
    return producer.getWidth();
  }
  
  public boolean isReleased()
  {
    boolean bool;
    if (producer == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void release()
  {
    producer.release();
    producer = null;
  }
  
  public void resize(int paramInt1, int paramInt2)
  {
    producer.setSize(paramInt1, paramInt2);
  }
  
  public void scheduleFrame()
  {
    producer.scheduleFrame();
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.SurfaceProducerPlatformViewRenderTarget
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */