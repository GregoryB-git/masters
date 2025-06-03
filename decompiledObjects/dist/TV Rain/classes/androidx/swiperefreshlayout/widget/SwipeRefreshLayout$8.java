package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class SwipeRefreshLayout$8
  extends Animation
{
  public SwipeRefreshLayout$8(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = this$0;
    float f = mStartingScale;
    paramTransformation.setAnimationProgress(-f * paramFloat + f);
    this$0.moveToStart(paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.swiperefreshlayout.widget.SwipeRefreshLayout.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */