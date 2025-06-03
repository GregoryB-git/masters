package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import java.util.List;
import z2;

class LinearLayoutManager$LayoutState
{
  public static final int INVALID_LAYOUT = Integer.MIN_VALUE;
  public static final int ITEM_DIRECTION_HEAD = -1;
  public static final int ITEM_DIRECTION_TAIL = 1;
  public static final int LAYOUT_END = 1;
  public static final int LAYOUT_START = -1;
  public static final int SCROLLING_OFFSET_NaN = Integer.MIN_VALUE;
  public static final String TAG = "LLM#LayoutState";
  public int mAvailable;
  public int mCurrentPosition;
  public int mExtraFillSpace = 0;
  public boolean mInfinite;
  public boolean mIsPreLayout = false;
  public int mItemDirection;
  public int mLastScrollDelta;
  public int mLayoutDirection;
  public int mNoRecycleSpace = 0;
  public int mOffset;
  public boolean mRecycle = true;
  public List<RecyclerView.ViewHolder> mScrapList = null;
  public int mScrollingOffset;
  
  private View nextViewFromScrapList()
  {
    int i = mScrapList.size();
    for (int j = 0; j < i; j++)
    {
      View localView = mScrapList.get(j)).itemView;
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
      if ((!localLayoutParams.isItemRemoved()) && (mCurrentPosition == localLayoutParams.getViewLayoutPosition()))
      {
        assignPositionFromScrapList(localView);
        return localView;
      }
    }
    return null;
  }
  
  public void assignPositionFromScrapList()
  {
    assignPositionFromScrapList(null);
  }
  
  public void assignPositionFromScrapList(View paramView)
  {
    paramView = nextViewInLimitedList(paramView);
    if (paramView == null) {
      mCurrentPosition = -1;
    } else {
      mCurrentPosition = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).getViewLayoutPosition();
    }
  }
  
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
  
  public void log()
  {
    StringBuilder localStringBuilder = z2.t("avail:");
    localStringBuilder.append(mAvailable);
    localStringBuilder.append(", ind:");
    localStringBuilder.append(mCurrentPosition);
    localStringBuilder.append(", dir:");
    localStringBuilder.append(mItemDirection);
    localStringBuilder.append(", offset:");
    localStringBuilder.append(mOffset);
    localStringBuilder.append(", layoutDir:");
    localStringBuilder.append(mLayoutDirection);
    Log.d("LLM#LayoutState", localStringBuilder.toString());
  }
  
  public View next(RecyclerView.Recycler paramRecycler)
  {
    if (mScrapList != null) {
      return nextViewFromScrapList();
    }
    paramRecycler = paramRecycler.getViewForPosition(mCurrentPosition);
    mCurrentPosition += mItemDirection;
    return paramRecycler;
  }
  
  public View nextViewInLimitedList(View paramView)
  {
    int i = mScrapList.size();
    Object localObject1 = null;
    int j = Integer.MAX_VALUE;
    int k = 0;
    Object localObject2;
    for (;;)
    {
      localObject2 = localObject1;
      if (k >= i) {
        break;
      }
      View localView = mScrapList.get(k)).itemView;
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
      localObject2 = localObject1;
      int m = j;
      if (localView != paramView) {
        if (localLayoutParams.isItemRemoved())
        {
          localObject2 = localObject1;
          m = j;
        }
        else
        {
          int n = (localLayoutParams.getViewLayoutPosition() - mCurrentPosition) * mItemDirection;
          if (n < 0)
          {
            localObject2 = localObject1;
            m = j;
          }
          else
          {
            localObject2 = localObject1;
            m = j;
            if (n < j)
            {
              localObject1 = localView;
              if (n == 0)
              {
                localObject2 = localObject1;
                break;
              }
              m = n;
              localObject2 = localObject1;
            }
          }
        }
      }
      k++;
      localObject1 = localObject2;
      j = m;
    }
    return (View)localObject2;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.LinearLayoutManager.LayoutState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */