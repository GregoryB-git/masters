package androidx.swiperefreshlayout.widget;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class SwipeRefreshLayout$6
  extends Animation
{
  public SwipeRefreshLayout$6(SwipeRefreshLayout paramSwipeRefreshLayout) {}
  
  public void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    paramTransformation = this$0;
    if (!mUsingCustomStart) {
      i = mSpinnerOffsetEnd - Math.abs(mOriginalOffsetTop);
    } else {
      i = mSpinnerOffsetEnd;
    }
    paramTransformation = this$0;
    int j = mFrom;
    int k = (int)((i - j) * paramFloat);
    int i = mCircleView.getTop();
    this$0.setTargetOffsetTopAndBottom(j + k - i);
    this$0.mProgress.setArrowScale(1.0F - paramFloat);
  }
}

/* Location:
 * Qualified Name:     androidx.swiperefreshlayout.widget.SwipeRefreshLayout.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */