package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

class StaggeredGridLayoutManager$Span
{
  public static final int INVALID_LINE = Integer.MIN_VALUE;
  public int mCachedEnd = Integer.MIN_VALUE;
  public int mCachedStart = Integer.MIN_VALUE;
  public int mDeletedSize = 0;
  public final int mIndex;
  public ArrayList<View> mViews = new ArrayList();
  
  public StaggeredGridLayoutManager$Span(StaggeredGridLayoutManager paramStaggeredGridLayoutManager, int paramInt)
  {
    mIndex = paramInt;
  }
  
  public void appendToSpan(View paramView)
  {
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = getLayoutParams(paramView);
    mSpan = this;
    mViews.add(paramView);
    mCachedEnd = Integer.MIN_VALUE;
    if (mViews.size() == 1) {
      mCachedStart = Integer.MIN_VALUE;
    }
    if ((localLayoutParams.isItemRemoved()) || (localLayoutParams.isItemChanged()))
    {
      int i = mDeletedSize;
      mDeletedSize = (this$0.mPrimaryOrientation.getDecoratedMeasurement(paramView) + i);
    }
  }
  
  public void cacheReferenceLineAndClear(boolean paramBoolean, int paramInt)
  {
    int i;
    if (paramBoolean) {
      i = getEndLine(Integer.MIN_VALUE);
    } else {
      i = getStartLine(Integer.MIN_VALUE);
    }
    clear();
    if (i == Integer.MIN_VALUE) {
      return;
    }
    if (((paramBoolean) && (i < this$0.mPrimaryOrientation.getEndAfterPadding())) || ((!paramBoolean) && (i > this$0.mPrimaryOrientation.getStartAfterPadding()))) {
      return;
    }
    int j = i;
    if (paramInt != Integer.MIN_VALUE) {
      j = i + paramInt;
    }
    mCachedEnd = j;
    mCachedStart = j;
  }
  
  public void calculateCachedEnd()
  {
    Object localObject = mViews;
    localObject = (View)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = getLayoutParams((View)localObject);
    mCachedEnd = this$0.mPrimaryOrientation.getDecoratedEnd((View)localObject);
    if (mFullSpan)
    {
      localObject = this$0.mLazySpanLookup.getFullSpanItem(localLayoutParams.getViewLayoutPosition());
      if ((localObject != null) && (mGapDir == 1)) {
        mCachedEnd += ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).getGapForSpan(mIndex);
      }
    }
  }
  
  public void calculateCachedStart()
  {
    View localView = (View)mViews.get(0);
    Object localObject = getLayoutParams(localView);
    mCachedStart = this$0.mPrimaryOrientation.getDecoratedStart(localView);
    if (mFullSpan)
    {
      localObject = this$0.mLazySpanLookup.getFullSpanItem(((RecyclerView.LayoutParams)localObject).getViewLayoutPosition());
      if ((localObject != null) && (mGapDir == -1)) {
        mCachedStart -= ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).getGapForSpan(mIndex);
      }
    }
  }
  
  public void clear()
  {
    mViews.clear();
    invalidateCache();
    mDeletedSize = 0;
  }
  
  public int findFirstCompletelyVisibleItemPosition()
  {
    int i;
    if (this$0.mReverseLayout) {
      i = findOneVisibleChild(mViews.size() - 1, -1, true);
    } else {
      i = findOneVisibleChild(0, mViews.size(), true);
    }
    return i;
  }
  
  public int findFirstPartiallyVisibleItemPosition()
  {
    int i;
    if (this$0.mReverseLayout) {
      i = findOnePartiallyVisibleChild(mViews.size() - 1, -1, true);
    } else {
      i = findOnePartiallyVisibleChild(0, mViews.size(), true);
    }
    return i;
  }
  
  public int findFirstVisibleItemPosition()
  {
    int i;
    if (this$0.mReverseLayout) {
      i = findOneVisibleChild(mViews.size() - 1, -1, false);
    } else {
      i = findOneVisibleChild(0, mViews.size(), false);
    }
    return i;
  }
  
  public int findLastCompletelyVisibleItemPosition()
  {
    int i;
    if (this$0.mReverseLayout) {
      i = findOneVisibleChild(0, mViews.size(), true);
    } else {
      i = findOneVisibleChild(mViews.size() - 1, -1, true);
    }
    return i;
  }
  
  public int findLastPartiallyVisibleItemPosition()
  {
    int i;
    if (this$0.mReverseLayout) {
      i = findOnePartiallyVisibleChild(0, mViews.size(), true);
    } else {
      i = findOnePartiallyVisibleChild(mViews.size() - 1, -1, true);
    }
    return i;
  }
  
  public int findLastVisibleItemPosition()
  {
    int i;
    if (this$0.mReverseLayout) {
      i = findOneVisibleChild(0, mViews.size(), false);
    } else {
      i = findOneVisibleChild(mViews.size() - 1, -1, false);
    }
    return i;
  }
  
  public int findOnePartiallyOrCompletelyVisibleChild(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    int i = this$0.mPrimaryOrientation.getStartAfterPadding();
    int j = this$0.mPrimaryOrientation.getEndAfterPadding();
    int k;
    if (paramInt2 > paramInt1) {
      k = 1;
    } else {
      k = -1;
    }
    while (paramInt1 != paramInt2)
    {
      View localView = (View)mViews.get(paramInt1);
      int m = this$0.mPrimaryOrientation.getDecoratedStart(localView);
      int n = this$0.mPrimaryOrientation.getDecoratedEnd(localView);
      int i1 = 0;
      int i2;
      if (paramBoolean3 ? m <= j : m < j) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      if (paramBoolean3 ? n >= i : n > i) {
        i1 = 1;
      }
      if ((i2 != 0) && (i1 != 0)) {
        if ((paramBoolean1) && (paramBoolean2))
        {
          if ((m >= i) && (n <= j)) {
            return this$0.getPosition(localView);
          }
        }
        else
        {
          if (paramBoolean2) {
            return this$0.getPosition(localView);
          }
          if ((m < i) || (n > j)) {
            return this$0.getPosition(localView);
          }
        }
      }
      paramInt1 += k;
    }
    return -1;
  }
  
  public int findOnePartiallyVisibleChild(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return findOnePartiallyOrCompletelyVisibleChild(paramInt1, paramInt2, false, false, paramBoolean);
  }
  
  public int findOneVisibleChild(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return findOnePartiallyOrCompletelyVisibleChild(paramInt1, paramInt2, paramBoolean, true, false);
  }
  
  public int getDeletedSize()
  {
    return mDeletedSize;
  }
  
  public int getEndLine()
  {
    int i = mCachedEnd;
    if (i != Integer.MIN_VALUE) {
      return i;
    }
    calculateCachedEnd();
    return mCachedEnd;
  }
  
  public int getEndLine(int paramInt)
  {
    int i = mCachedEnd;
    if (i != Integer.MIN_VALUE) {
      return i;
    }
    if (mViews.size() == 0) {
      return paramInt;
    }
    calculateCachedEnd();
    return mCachedEnd;
  }
  
  public View getFocusableViewAfter(int paramInt1, int paramInt2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    View localView;
    StaggeredGridLayoutManager localStaggeredGridLayoutManager;
    if (paramInt2 == -1)
    {
      int i = mViews.size();
      paramInt2 = 0;
      for (;;)
      {
        localObject1 = localObject2;
        if (paramInt2 >= i) {
          break;
        }
        localView = (View)mViews.get(paramInt2);
        localStaggeredGridLayoutManager = this$0;
        if (mReverseLayout)
        {
          localObject1 = localObject2;
          if (localStaggeredGridLayoutManager.getPosition(localView) <= paramInt1) {
            break;
          }
        }
        localObject1 = this$0;
        if ((!mReverseLayout) && (((RecyclerView.LayoutManager)localObject1).getPosition(localView) >= paramInt1))
        {
          localObject1 = localObject2;
          break;
        }
        localObject1 = localObject2;
        if (!localView.hasFocusable()) {
          break;
        }
        paramInt2++;
        localObject2 = localView;
      }
    }
    paramInt2 = mViews.size() - 1;
    for (localObject2 = localObject1;; localObject2 = localView)
    {
      localObject1 = localObject2;
      if (paramInt2 < 0) {
        break;
      }
      localView = (View)mViews.get(paramInt2);
      localStaggeredGridLayoutManager = this$0;
      if (mReverseLayout)
      {
        localObject1 = localObject2;
        if (localStaggeredGridLayoutManager.getPosition(localView) >= paramInt1) {
          break;
        }
      }
      localObject1 = this$0;
      if ((!mReverseLayout) && (((RecyclerView.LayoutManager)localObject1).getPosition(localView) <= paramInt1))
      {
        localObject1 = localObject2;
        break;
      }
      localObject1 = localObject2;
      if (!localView.hasFocusable()) {
        break;
      }
      paramInt2--;
    }
    return (View)localObject1;
  }
  
  public StaggeredGridLayoutManager.LayoutParams getLayoutParams(View paramView)
  {
    return (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
  }
  
  public int getStartLine()
  {
    int i = mCachedStart;
    if (i != Integer.MIN_VALUE) {
      return i;
    }
    calculateCachedStart();
    return mCachedStart;
  }
  
  public int getStartLine(int paramInt)
  {
    int i = mCachedStart;
    if (i != Integer.MIN_VALUE) {
      return i;
    }
    if (mViews.size() == 0) {
      return paramInt;
    }
    calculateCachedStart();
    return mCachedStart;
  }
  
  public void invalidateCache()
  {
    mCachedStart = Integer.MIN_VALUE;
    mCachedEnd = Integer.MIN_VALUE;
  }
  
  public void onOffset(int paramInt)
  {
    int i = mCachedStart;
    if (i != Integer.MIN_VALUE) {
      mCachedStart = (i + paramInt);
    }
    i = mCachedEnd;
    if (i != Integer.MIN_VALUE) {
      mCachedEnd = (i + paramInt);
    }
  }
  
  public void popEnd()
  {
    int i = mViews.size();
    View localView = (View)mViews.remove(i - 1);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = getLayoutParams(localView);
    mSpan = null;
    if ((localLayoutParams.isItemRemoved()) || (localLayoutParams.isItemChanged())) {
      mDeletedSize -= this$0.mPrimaryOrientation.getDecoratedMeasurement(localView);
    }
    if (i == 1) {
      mCachedStart = Integer.MIN_VALUE;
    }
    mCachedEnd = Integer.MIN_VALUE;
  }
  
  public void popStart()
  {
    View localView = (View)mViews.remove(0);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = getLayoutParams(localView);
    mSpan = null;
    if (mViews.size() == 0) {
      mCachedEnd = Integer.MIN_VALUE;
    }
    if ((localLayoutParams.isItemRemoved()) || (localLayoutParams.isItemChanged())) {
      mDeletedSize -= this$0.mPrimaryOrientation.getDecoratedMeasurement(localView);
    }
    mCachedStart = Integer.MIN_VALUE;
  }
  
  public void prependToSpan(View paramView)
  {
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = getLayoutParams(paramView);
    mSpan = this;
    mViews.add(0, paramView);
    mCachedStart = Integer.MIN_VALUE;
    if (mViews.size() == 1) {
      mCachedEnd = Integer.MIN_VALUE;
    }
    if ((localLayoutParams.isItemRemoved()) || (localLayoutParams.isItemChanged()))
    {
      int i = mDeletedSize;
      mDeletedSize = (this$0.mPrimaryOrientation.getDecoratedMeasurement(paramView) + i);
    }
  }
  
  public void setLine(int paramInt)
  {
    mCachedStart = paramInt;
    mCachedEnd = paramInt;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager.Span
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */