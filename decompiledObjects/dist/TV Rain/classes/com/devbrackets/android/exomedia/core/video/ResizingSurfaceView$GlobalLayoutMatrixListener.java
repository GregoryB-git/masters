package com.devbrackets.android.exomedia.core.video;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.devbrackets.android.exomedia.core.video.scale.MatrixManager;

class ResizingSurfaceView$GlobalLayoutMatrixListener
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private ResizingSurfaceView$GlobalLayoutMatrixListener(ResizingSurfaceView paramResizingSurfaceView) {}
  
  public void onGlobalLayout()
  {
    ResizingSurfaceView localResizingSurfaceView = this$0;
    localResizingSurfaceView.setScaleType(matrixManager.getCurrentScaleType());
    this$0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.ResizingSurfaceView.GlobalLayoutMatrixListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */