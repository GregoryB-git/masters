package androidx.swiperefreshlayout.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

class SwipeRefreshLayout$4
  extends Animation
{
  public SwipeRefreshLayout$4(SwipeRefreshLayout paramSwipeRefreshLayout, int paramInt1, int paramInt2) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = this$0.mProgress;
    int i = val$startingAlpha;
    float f = i;
    paramTransformation.setAlpha((int)((val$endingAlpha - i) * paramFloat + f));
  }
}

/* Location:
 * Qualified Name:     androidx.swiperefreshlayout.widget.SwipeRefreshLayout.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */