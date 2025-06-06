package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

class OrientationHelper$2
  extends OrientationHelper
{
  public OrientationHelper$2(RecyclerView.LayoutManager paramLayoutManager)
  {
    super(paramLayoutManager, null);
  }
  
  public int getDecoratedEnd(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return mLayoutManager.getDecoratedBottom(paramView) + bottomMargin;
  }
  
  public int getDecoratedMeasurement(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return mLayoutManager.getDecoratedMeasuredHeight(paramView) + topMargin + bottomMargin;
  }
  
  public int getDecoratedMeasurementInOther(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return mLayoutManager.getDecoratedMeasuredWidth(paramView) + leftMargin + rightMargin;
  }
  
  public int getDecoratedStart(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return mLayoutManager.getDecoratedTop(paramView) - topMargin;
  }
  
  public int getEnd()
  {
    return mLayoutManager.getHeight();
  }
  
  public int getEndAfterPadding()
  {
    return mLayoutManager.getHeight() - mLayoutManager.getPaddingBottom();
  }
  
  public int getEndPadding()
  {
    return mLayoutManager.getPaddingBottom();
  }
  
  public int getMode()
  {
    return mLayoutManager.getHeightMode();
  }
  
  public int getModeInOther()
  {
    return mLayoutManager.getWidthMode();
  }
  
  public int getStartAfterPadding()
  {
    return mLayoutManager.getPaddingTop();
  }
  
  public int getTotalSpace()
  {
    return mLayoutManager.getHeight() - mLayoutManager.getPaddingTop() - mLayoutManager.getPaddingBottom();
  }
  
  public int getTransformedEndWithDecoration(View paramView)
  {
    mLayoutManager.getTransformedBoundingBox(paramView, true, mTmpRect);
    return mTmpRect.bottom;
  }
  
  public int getTransformedStartWithDecoration(View paramView)
  {
    mLayoutManager.getTransformedBoundingBox(paramView, true, mTmpRect);
    return mTmpRect.top;
  }
  
  public void offsetChild(View paramView, int paramInt)
  {
    paramView.offsetTopAndBottom(paramInt);
  }
  
  public void offsetChildren(int paramInt)
  {
    mLayoutManager.offsetChildrenVertical(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.OrientationHelper.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */