package com.devbrackets.android.exomedia.core.video.exo;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;

public class ExoSurfaceVideoView$HolderCallback
  implements SurfaceHolder.Callback
{
  public ExoSurfaceVideoView$HolderCallback(ExoSurfaceVideoView paramExoSurfaceVideoView) {}
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this$0.delegate.onSurfaceReady(paramSurfaceHolder.getSurface());
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    this$0.delegate.onSurfaceDestroyed();
    paramSurfaceHolder.getSurface().release();
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.exo.ExoSurfaceVideoView.HolderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */