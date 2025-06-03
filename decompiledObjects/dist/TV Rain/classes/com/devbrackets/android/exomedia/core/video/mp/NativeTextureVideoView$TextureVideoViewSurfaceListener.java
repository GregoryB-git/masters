package com.devbrackets.android.exomedia.core.video.mp;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;

public class NativeTextureVideoView$TextureVideoViewSurfaceListener
  implements TextureView.SurfaceTextureListener
{
  public NativeTextureVideoView$TextureVideoViewSurfaceListener(NativeTextureVideoView paramNativeTextureVideoView) {}
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    this$0.delegate.onSurfaceReady(new Surface(paramSurfaceTexture));
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    paramSurfaceTexture.release();
    this$0.suspend();
    return true;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    this$0.delegate.onSurfaceSizeChanged(paramInt1, paramInt2);
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.mp.NativeTextureVideoView.TextureVideoViewSurfaceListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */