package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class SwipeRefreshLayout$3
  extends Animation
{
  public SwipeRefreshLayout$3(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    this$0.setAnimationProgress(1.0F - paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.swiperefreshlayout.widget.SwipeRefreshLayout.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */