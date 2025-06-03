package com.devbrackets.android.exomedia.core.video.mp;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;

public class NativeSurfaceVideoView$HolderCallback
  implements SurfaceHolder.Callback
{
  public NativeSurfaceVideoView$HolderCallback(NativeSurfaceVideoView paramNativeSurfaceVideoView) {}
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    this$0.delegate.onSurfaceSizeChanged(paramInt2, paramInt3);
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this$0.delegate.onSurfaceReady(paramSurfaceHolder.getSurface());
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    paramSurfaceHolder.getSurface().release();
    this$0.suspend();
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.mp.NativeSurfaceVideoView.HolderCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */