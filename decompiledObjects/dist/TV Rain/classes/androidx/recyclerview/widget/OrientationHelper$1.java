package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

class OrientationHelper$1
  extends OrientationHelper
{
  public OrientationHelper$1(RecyclerView.LayoutManager paramLayoutManager)
  {
    super(paramLayoutManager, null);
  }
  
  public int getDecoratedEnd(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return mLayoutManager.getDecoratedRight(paramView) + rightMargin;
  }
  
  public int getDecoratedMeasurement(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return mLayoutManager.getDecoratedMeasuredWidth(paramView) + leftMargin + rightMargin;
  }
  
  public int getDecoratedMeasurementInOther(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return mLayoutManager.getDecoratedMeasuredHeight(paramView) + topMargin + bottomMargin;
  }
  
  public int getDecoratedStart(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return mLayoutManager.getDecoratedLeft(paramView) - leftMargin;
  }
  
  public int getEnd()
  {
    return mLayoutManager.getWidth();
  }
  
  public int getEndAfterPadding()
  {
    return mLayoutManager.getWidth() - mLayoutManager.getPaddingRight();
  }
  
  public int getEndPadding()
  {
    return mLayoutManager.getPaddingRight();
  }
  
  public int getMode()
  {
    return mLayoutManager.getWidthMode();
  }
  
  public int getModeInOther()
  {
    return mLayoutManager.getHeightMode();
  }
  
  public int getStartAfterPadding()
  {
    return mLayoutManager.getPaddingLeft();
  }
  
  public int getTotalSpace()
  {
    return mLayoutManager.getWidth() - mLayoutManager.getPaddingLeft() - mLayoutManager.getPaddingRight();
  }
  
  public int getTransformedEndWithDecoration(View paramView)
  {
    mLayoutManager.getTransformedBoundingBox(paramView, true, mTmpRect);
    return mTmpRect.right;
  }
  
  public int getTransformedStartWithDecoration(View paramView)
  {
    mLayoutManager.getTransformedBoundingBox(paramView, true, mTmpRect);
    return mTmpRect.left;
  }
  
  public void offsetChild(View paramView, int paramInt)
  {
    paramView.offsetLeftAndRight(paramInt);
  }
  
  public void offsetChildren(int paramInt)
  {
    mLayoutManager.offsetChildrenHorizontal(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.OrientationHelper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */