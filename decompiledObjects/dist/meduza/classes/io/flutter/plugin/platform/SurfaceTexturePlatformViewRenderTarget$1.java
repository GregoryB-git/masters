package io.flutter.plugin.platform;

import android.os.Build.VERSION;
import io.flutter.view.TextureRegistry.OnTrimMemoryListener;

class SurfaceTexturePlatformViewRenderTarget$1
  implements TextureRegistry.OnTrimMemoryListener
{
  public SurfaceTexturePlatformViewRenderTarget$1(SurfaceTexturePlatformViewRenderTarget paramSurfaceTexturePlatformViewRenderTarget) {}
  
  public void onTrimMemory(int paramInt)
  {
    if ((paramInt == 80) && (Build.VERSION.SDK_INT >= 29)) {
      SurfaceTexturePlatformViewRenderTarget.access$002(this$0, true);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.SurfaceTexturePlatformViewRenderTarget.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */