package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.view.Surface;
import d2.e;
import io.flutter.view.TextureRegistry.OnTrimMemoryListener;
import io.flutter.view.TextureRegistry.SurfaceTextureEntry;
import io.flutter.view.TextureRegistry.TextureEntry;

public class SurfaceTexturePlatformViewRenderTarget
  implements PlatformViewRenderTarget
{
  private static final String TAG = "SurfaceTexturePlatformViewRenderTarget";
  private int bufferHeight = 0;
  private int bufferWidth = 0;
  private boolean shouldRecreateSurfaceForLowMemory = false;
  private Surface surface;
  private SurfaceTexture surfaceTexture;
  private final TextureRegistry.SurfaceTextureEntry surfaceTextureEntry;
  private final TextureRegistry.OnTrimMemoryListener trimMemoryListener;
  
  public SurfaceTexturePlatformViewRenderTarget(TextureRegistry.SurfaceTextureEntry paramSurfaceTextureEntry)
  {
    TextureRegistry.OnTrimMemoryListener local1 = new TextureRegistry.OnTrimMemoryListener()
    {
      public void onTrimMemory(int paramAnonymousInt)
      {
        if ((paramAnonymousInt == 80) && (Build.VERSION.SDK_INT >= 29)) {
          SurfaceTexturePlatformViewRenderTarget.access$002(SurfaceTexturePlatformViewRenderTarget.this, true);
        }
      }
    };
    trimMemoryListener = local1;
    surfaceTextureEntry = paramSurfaceTextureEntry;
    surfaceTexture = paramSurfaceTextureEntry.surfaceTexture();
    paramSurfaceTextureEntry.setOnTrimMemoryListener(local1);
  }
  
  private void recreateSurfaceIfNeeded()
  {
    Surface localSurface = surface;
    if ((localSurface != null) && (!shouldRecreateSurfaceForLowMemory)) {
      return;
    }
    if (localSurface != null)
    {
      localSurface.release();
      surface = null;
    }
    surface = createSurface();
    shouldRecreateSurfaceForLowMemory = false;
  }
  
  public Surface createSurface()
  {
    return new Surface(surfaceTexture);
  }
  
  public int getHeight()
  {
    return bufferHeight;
  }
  
  public long getId()
  {
    return surfaceTextureEntry.id();
  }
  
  public Surface getSurface()
  {
    recreateSurfaceIfNeeded();
    SurfaceTexture localSurfaceTexture = surfaceTexture;
    if ((localSurfaceTexture != null) && (!e.u(localSurfaceTexture))) {
      return surface;
    }
    return null;
  }
  
  public int getWidth()
  {
    return bufferWidth;
  }
  
  public boolean isReleased()
  {
    boolean bool;
    if (surfaceTexture == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void release()
  {
    surfaceTexture = null;
    Surface localSurface = surface;
    if (localSurface != null)
    {
      localSurface.release();
      surface = null;
    }
  }
  
  public void resize(int paramInt1, int paramInt2)
  {
    bufferWidth = paramInt1;
    bufferHeight = paramInt2;
    SurfaceTexture localSurfaceTexture = surfaceTexture;
    if (localSurfaceTexture != null) {
      localSurfaceTexture.setDefaultBufferSize(paramInt1, paramInt2);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.SurfaceTexturePlatformViewRenderTarget
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */