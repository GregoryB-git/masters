package androidx.slidingpanelayout.widget;

import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper.Callback;

class SlidingPaneLayout$DragHelperCallback
  extends ViewDragHelper.Callback
{
  public SlidingPaneLayout$DragHelperCallback(SlidingPaneLayout paramSlidingPaneLayout) {}
  
  public int clampViewPositionHorizontal(View paramView, int paramInt1, int paramInt2)
  {
    paramView = (SlidingPaneLayout.LayoutParams)this$0.mSlideableView.getLayoutParams();
    int j;
    if (this$0.isLayoutRtlSupport())
    {
      int i = this$0.getWidth();
      paramInt2 = this$0.getPaddingRight();
      j = rightMargin;
      paramInt2 = i - (this$0.mSlideableView.getWidth() + (paramInt2 + j));
      j = this$0.mSlideRange;
      paramInt1 = Math.max(Math.min(paramInt1, paramInt2), paramInt2 - j);
    }
    else
    {
      j = this$0.getPaddingLeft() + leftMargin;
      paramInt2 = this$0.mSlideRange;
      paramInt1 = Math.min(Math.max(paramInt1, j), paramInt2 + j);
    }
    return paramInt1;
  }
  
  public int clampViewPositionVertical(View paramView, int paramInt1, int paramInt2)
  {
    return paramView.getTop();
  }
  
  public int getViewHorizontalDragRange(View paramView)
  {
    return this$0.mSlideRange;
  }
  
  public void onEdgeDragStarted(int paramInt1, int paramInt2)
  {
    SlidingPaneLayout localSlidingPaneLayout = this$0;
    mDragHelper.captureChildView(mSlideableView, paramInt2);
  }
  
  public void onViewCaptured(View paramView, int paramInt)
  {
    this$0.setAllChildrenVisible();
  }
  
  public void onViewDragStateChanged(int paramInt)
  {
    if (this$0.mDragHelper.getViewDragState() == 0)
    {
      SlidingPaneLayout localSlidingPaneLayout = this$0;
      if (mSlideOffset == 0.0F)
      {
        localSlidingPaneLayout.updateObscuredViewsVisibility(mSlideableView);
        localSlidingPaneLayout = this$0;
        localSlidingPaneLayout.dispatchOnPanelClosed(mSlideableView);
        this$0.mPreservedOpenState = false;
      }
      else
      {
        localSlidingPaneLayout.dispatchOnPanelOpened(mSlideableView);
        this$0.mPreservedOpenState = true;
      }
    }
  }
  
  public void onViewPositionChanged(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this$0.onPanelDragged(paramInt1);
    this$0.invalidate();
  }
  
  public void onViewReleased(View paramView, float paramFloat1, float paramFloat2)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    int i;
    int j;
    if (this$0.isLayoutRtlSupport())
    {
      i = this$0.getPaddingRight() + rightMargin;
      if (paramFloat1 >= 0.0F)
      {
        j = i;
        if (paramFloat1 == 0.0F)
        {
          j = i;
          if (this$0.mSlideOffset <= 0.5F) {}
        }
      }
      else
      {
        j = i + this$0.mSlideRange;
      }
      i = this$0.mSlideableView.getWidth();
      j = this$0.getWidth() - j - i;
    }
    else
    {
      j = this$0.getPaddingLeft();
      i = leftMargin + j;
      boolean bool = paramFloat1 < 0.0F;
      if (!bool)
      {
        j = i;
        if (!bool)
        {
          j = i;
          if (this$0.mSlideOffset <= 0.5F) {}
        }
      }
      else
      {
        j = i + this$0.mSlideRange;
      }
    }
    this$0.mDragHelper.settleCapturedViewAt(j, paramView.getTop());
    this$0.invalidate();
  }
  
  public boolean tryCaptureView(View paramView, int paramInt)
  {
    if (this$0.mIsUnableToDrag) {
      return false;
    }
    return getLayoutParamsslideable;
  }
}

/* Location:
 * Qualified Name:     androidx.slidingpanelayout.widget.SlidingPaneLayout.DragHelperCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */