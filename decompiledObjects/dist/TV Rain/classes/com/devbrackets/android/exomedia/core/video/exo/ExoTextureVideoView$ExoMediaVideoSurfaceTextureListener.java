package com.devbrackets.android.exomedia.core.video.exo;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;

public class ExoTextureVideoView$ExoMediaVideoSurfaceTextureListener
  implements TextureView.SurfaceTextureListener
{
  public ExoTextureVideoView$ExoMediaVideoSurfaceTextureListener(ExoTextureVideoView paramExoTextureVideoView) {}
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    this$0.delegate.onSurfaceReady(new Surface(paramSurfaceTexture));
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    this$0.delegate.onSurfaceDestroyed();
    paramSurfaceTexture.release();
    return true;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2) {}
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.exo.ExoTextureVideoView.ExoMediaVideoSurfaceTextureListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */