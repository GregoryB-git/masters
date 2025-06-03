package androidx.transition;

import android.graphics.PointF;
import android.view.View;

class ChangeBounds$ViewBounds
{
  private int mBottom;
  private int mBottomRightCalls;
  private int mLeft;
  private int mRight;
  private int mTop;
  private int mTopLeftCalls;
  private View mView;
  
  public ChangeBounds$ViewBounds(View paramView)
  {
    mView = paramView;
  }
  
  private void setLeftTopRightBottom()
  {
    ViewUtils.setLeftTopRightBottom(mView, mLeft, mTop, mRight, mBottom);
    mTopLeftCalls = 0;
    mBottomRightCalls = 0;
  }
  
  public void setBottomRight(PointF paramPointF)
  {
    mRight = Math.round(x);
    mBottom = Math.round(y);
    int i = mBottomRightCalls + 1;
    mBottomRightCalls = i;
    if (mTopLeftCalls == i) {
      setLeftTopRightBottom();
    }
  }
  
  public void setTopLeft(PointF paramPointF)
  {
    mLeft = Math.round(x);
    mTop = Math.round(y);
    int i = mTopLeftCalls + 1;
    mTopLeftCalls = i;
    if (i == mBottomRightCalls) {
      setLeftTopRightBottom();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.ChangeBounds.ViewBounds
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */