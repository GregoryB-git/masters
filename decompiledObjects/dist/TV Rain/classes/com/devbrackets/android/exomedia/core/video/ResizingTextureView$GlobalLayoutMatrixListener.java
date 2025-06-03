package com.devbrackets.android.exomedia.core.video;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.devbrackets.android.exomedia.core.video.scale.MatrixManager;

class ResizingTextureView$GlobalLayoutMatrixListener
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private ResizingTextureView$GlobalLayoutMatrixListener(ResizingTextureView paramResizingTextureView) {}
  
  public void onGlobalLayout()
  {
    ResizingTextureView localResizingTextureView = this$0;
    localResizingTextureView.setScaleType(matrixManager.getCurrentScaleType());
    this$0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.ResizingTextureView.GlobalLayoutMatrixListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */