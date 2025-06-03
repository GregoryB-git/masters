package androidx.drawerlayout.widget;

import android.view.View;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper.Callback;

class DrawerLayout$ViewDragCallback
  extends ViewDragHelper.Callback
{
  private final int mAbsGravity;
  private ViewDragHelper mDragger;
  private final Runnable mPeekRunnable = new Runnable()
  {
    public void run()
    {
      peekDrawer();
    }
  };
  
  public DrawerLayout$ViewDragCallback(DrawerLayout paramDrawerLayout, int paramInt)
  {
    mAbsGravity = paramInt;
  }
  
  private void closeOtherDrawer()
  {
    int i = mAbsGravity;
    int j = 3;
    if (i == 3) {
      j = 5;
    }
    View localView = this$0.findDrawerWithGravity(j);
    if (localView != null) {
      this$0.closeDrawer(localView);
    }
  }
  
  public int clampViewPositionHorizontal(View paramView, int paramInt1, int paramInt2)
  {
    if (this$0.checkDrawerViewAbsoluteGravity(paramView, 3)) {
      return Math.max(-paramView.getWidth(), Math.min(paramInt1, 0));
    }
    paramInt2 = this$0.getWidth();
    return Math.max(paramInt2 - paramView.getWidth(), Math.min(paramInt1, paramInt2));
  }
  
  public int clampViewPositionVertical(View paramView, int paramInt1, int paramInt2)
  {
    return paramView.getTop();
  }
  
  public int getViewHorizontalDragRange(View paramView)
  {
    int i;
    if (this$0.isDrawerView(paramView)) {
      i = paramView.getWidth();
    } else {
      i = 0;
    }
    return i;
  }
  
  public void onEdgeDragStarted(int paramInt1, int paramInt2)
  {
    View localView;
    if ((paramInt1 & 0x1) == 1) {
      localView = this$0.findDrawerWithGravity(3);
    } else {
      localView = this$0.findDrawerWithGravity(5);
    }
    if ((localView != null) && (this$0.getDrawerLockMode(localView) == 0)) {
      mDragger.captureChildView(localView, paramInt2);
    }
  }
  
  public boolean onEdgeLock(int paramInt)
  {
    return false;
  }
  
  public void onEdgeTouched(int paramInt1, int paramInt2)
  {
    this$0.postDelayed(mPeekRunnable, 160L);
  }
  
  public void onViewCaptured(View paramView, int paramInt)
  {
    getLayoutParamsisPeeking = false;
    closeOtherDrawer();
  }
  
  public void onViewDragStateChanged(int paramInt)
  {
    this$0.updateDrawerState(paramInt, mDragger.getCapturedView());
  }
  
  public void onViewPositionChanged(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = paramView.getWidth();
    float f;
    if (this$0.checkDrawerViewAbsoluteGravity(paramView, 3)) {
      f = paramInt1 + paramInt2;
    } else {
      f = this$0.getWidth() - paramInt1;
    }
    f /= paramInt2;
    this$0.setDrawerViewOffset(paramView, f);
    if (f == 0.0F) {
      paramInt1 = 4;
    } else {
      paramInt1 = 0;
    }
    paramView.setVisibility(paramInt1);
    this$0.invalidate();
  }
  
  public void onViewReleased(View paramView, float paramFloat1, float paramFloat2)
  {
    paramFloat2 = this$0.getDrawerViewOffset(paramView);
    int i = paramView.getWidth();
    int j;
    if (this$0.checkDrawerViewAbsoluteGravity(paramView, 3))
    {
      boolean bool = paramFloat1 < 0.0F;
      if ((!bool) && ((bool) || (paramFloat2 <= 0.5F))) {
        j = -i;
      } else {
        j = 0;
      }
    }
    else
    {
      int k = this$0.getWidth();
      if (paramFloat1 >= 0.0F)
      {
        j = k;
        if (paramFloat1 == 0.0F)
        {
          j = k;
          if (paramFloat2 <= 0.5F) {}
        }
      }
      else
      {
        j = k - i;
      }
    }
    mDragger.settleCapturedViewAt(j, paramView.getTop());
    this$0.invalidate();
  }
  
  public void peekDrawer()
  {
    int i = mDragger.getEdgeSize();
    int j = mAbsGravity;
    int k = 0;
    if (j == 3) {
      j = 1;
    } else {
      j = 0;
    }
    View localView;
    if (j != 0)
    {
      localView = this$0.findDrawerWithGravity(3);
      if (localView != null) {
        k = -localView.getWidth();
      }
      k += i;
    }
    else
    {
      localView = this$0.findDrawerWithGravity(5);
      k = this$0.getWidth() - i;
    }
    if ((localView != null) && (((j != 0) && (localView.getLeft() < k)) || ((j == 0) && (localView.getLeft() > k) && (this$0.getDrawerLockMode(localView) == 0))))
    {
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
      mDragger.smoothSlideViewTo(localView, k, localView.getTop());
      isPeeking = true;
      this$0.invalidate();
      closeOtherDrawer();
      this$0.cancelChildViewTouch();
    }
  }
  
  public void removeCallbacks()
  {
    this$0.removeCallbacks(mPeekRunnable);
  }
  
  public void setDragger(ViewDragHelper paramViewDragHelper)
  {
    mDragger = paramViewDragHelper;
  }
  
  public boolean tryCaptureView(View paramView, int paramInt)
  {
    boolean bool;
    if ((this$0.isDrawerView(paramView)) && (this$0.checkDrawerViewAbsoluteGravity(paramView, mAbsGravity)) && (this$0.getDrawerLockMode(paramView) == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */