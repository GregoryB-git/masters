package androidx.recyclerview.widget;

import a;
import android.view.View;
import z2;

class LayoutState
{
  public static final int INVALID_LAYOUT = Integer.MIN_VALUE;
  public static final int ITEM_DIRECTION_HEAD = -1;
  public static final int ITEM_DIRECTION_TAIL = 1;
  public static final int LAYOUT_END = 1;
  public static final int LAYOUT_START = -1;
  public int mAvailable;
  public int mCurrentPosition;
  public int mEndLine = 0;
  public boolean mInfinite;
  public int mItemDirection;
  public int mLayoutDirection;
  public boolean mRecycle = true;
  public int mStartLine = 0;
  public boolean mStopInFocusable;
  
  public boolean hasMore(RecyclerView.State paramState)
  {
    int i = mCurrentPosition;
    boolean bool;
    if ((i >= 0) && (i < paramState.getItemCount())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public View next(RecyclerView.Recycler paramRecycler)
  {
    paramRecycler = paramRecycler.getViewForPosition(mCurrentPosition);
    mCurrentPosition += mItemDirection;
    return paramRecycler;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("LayoutState{mAvailable=");
    localStringBuilder.append(mAvailable);
    localStringBuilder.append(", mCurrentPosition=");
    localStringBuilder.append(mCurrentPosition);
    localStringBuilder.append(", mItemDirection=");
    localStringBuilder.append(mItemDirection);
    localStringBuilder.append(", mLayoutDirection=");
    localStringBuilder.append(mLayoutDirection);
    localStringBuilder.append(", mStartLine=");
    localStringBuilder.append(mStartLine);
    localStringBuilder.append(", mEndLine=");
    return a.n(localStringBuilder, mEndLine, '}');
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.LayoutState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */