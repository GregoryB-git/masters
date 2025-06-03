package androidx.recyclerview.widget;

import android.view.View;
import z2;

class LinearLayoutManager$AnchorInfo
{
  public int mCoordinate;
  public boolean mLayoutFromEnd;
  public OrientationHelper mOrientationHelper;
  public int mPosition;
  public boolean mValid;
  
  public LinearLayoutManager$AnchorInfo()
  {
    reset();
  }
  
  public void assignCoordinateFromPadding()
  {
    int i;
    if (mLayoutFromEnd) {
      i = mOrientationHelper.getEndAfterPadding();
    } else {
      i = mOrientationHelper.getStartAfterPadding();
    }
    mCoordinate = i;
  }
  
  public void assignFromView(View paramView, int paramInt)
  {
    if (mLayoutFromEnd)
    {
      int i = mOrientationHelper.getDecoratedEnd(paramView);
      mCoordinate = (mOrientationHelper.getTotalSpaceChange() + i);
    }
    else
    {
      mCoordinate = mOrientationHelper.getDecoratedStart(paramView);
    }
    mPosition = paramInt;
  }
  
  public void assignFromViewAndKeepVisibleRect(View paramView, int paramInt)
  {
    int i = mOrientationHelper.getTotalSpaceChange();
    if (i >= 0)
    {
      assignFromView(paramView, paramInt);
      return;
    }
    mPosition = paramInt;
    int j;
    int k;
    if (mLayoutFromEnd)
    {
      paramInt = mOrientationHelper.getEndAfterPadding() - i - mOrientationHelper.getDecoratedEnd(paramView);
      mCoordinate = (mOrientationHelper.getEndAfterPadding() - paramInt);
      if (paramInt > 0)
      {
        j = mOrientationHelper.getDecoratedMeasurement(paramView);
        k = mCoordinate;
        i = mOrientationHelper.getStartAfterPadding();
        i = k - j - (Math.min(mOrientationHelper.getDecoratedStart(paramView) - i, 0) + i);
        if (i < 0)
        {
          j = mCoordinate;
          mCoordinate = (Math.min(paramInt, -i) + j);
        }
      }
    }
    else
    {
      j = mOrientationHelper.getDecoratedStart(paramView);
      paramInt = j - mOrientationHelper.getStartAfterPadding();
      mCoordinate = j;
      if (paramInt > 0)
      {
        k = mOrientationHelper.getDecoratedMeasurement(paramView);
        int m = mOrientationHelper.getEndAfterPadding();
        int n = mOrientationHelper.getDecoratedEnd(paramView);
        i = mOrientationHelper.getEndAfterPadding() - Math.min(0, m - i - n) - (k + j);
        if (i < 0) {
          mCoordinate -= Math.min(paramInt, -i);
        }
      }
    }
  }
  
  public boolean isViewValidAsAnchor(View paramView, RecyclerView.State paramState)
  {
    paramView = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    boolean bool;
    if ((!paramView.isItemRemoved()) && (paramView.getViewLayoutPosition() >= 0) && (paramView.getViewLayoutPosition() < paramState.getItemCount())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void reset()
  {
    mPosition = -1;
    mCoordinate = Integer.MIN_VALUE;
    mLayoutFromEnd = false;
    mValid = false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("AnchorInfo{mPosition=");
    localStringBuilder.append(mPosition);
    localStringBuilder.append(", mCoordinate=");
    localStringBuilder.append(mCoordinate);
    localStringBuilder.append(", mLayoutFromEnd=");
    localStringBuilder.append(mLayoutFromEnd);
    localStringBuilder.append(", mValid=");
    localStringBuilder.append(mValid);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.LinearLayoutManager.AnchorInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */