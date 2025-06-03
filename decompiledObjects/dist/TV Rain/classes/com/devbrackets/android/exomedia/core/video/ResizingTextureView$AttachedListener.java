package com.devbrackets.android.exomedia.core.video;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import java.util.concurrent.locks.ReentrantLock;

class ResizingTextureView$AttachedListener
  implements View.OnAttachStateChangeListener
{
  private ResizingTextureView$AttachedListener(ResizingTextureView paramResizingTextureView) {}
  
  public void onViewAttachedToWindow(View paramView)
  {
    this$0.globalLayoutMatrixListenerLock.lock();
    this$0.getViewTreeObserver().addOnGlobalLayoutListener(this$0.globalLayoutMatrixListener);
    this$0.removeOnAttachStateChangeListener(this);
    this$0.globalLayoutMatrixListenerLock.unlock();
  }
  
  public void onViewDetachedFromWindow(View paramView) {}
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.ResizingTextureView.AttachedListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */