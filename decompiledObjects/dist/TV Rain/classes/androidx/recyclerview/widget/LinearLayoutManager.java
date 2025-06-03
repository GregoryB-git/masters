package androidx.recyclerview.widget;

import a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.List;
import z2;

public class LinearLayoutManager
  extends RecyclerView.LayoutManager
  implements ItemTouchHelper.ViewDropHandler, RecyclerView.SmoothScroller.ScrollVectorProvider
{
  public static final boolean DEBUG = false;
  public static final int HORIZONTAL = 0;
  public static final int INVALID_OFFSET = Integer.MIN_VALUE;
  private static final float MAX_SCROLL_FACTOR = 0.33333334F;
  private static final String TAG = "LinearLayoutManager";
  public static final int VERTICAL = 1;
  public final AnchorInfo mAnchorInfo = new AnchorInfo();
  private int mInitialPrefetchItemCount = 2;
  private boolean mLastStackFromEnd;
  private final LayoutChunkResult mLayoutChunkResult = new LayoutChunkResult();
  private LayoutState mLayoutState;
  public int mOrientation = 1;
  public OrientationHelper mOrientationHelper;
  public SavedState mPendingSavedState = null;
  public int mPendingScrollPosition = -1;
  public int mPendingScrollPositionOffset = Integer.MIN_VALUE;
  private boolean mRecycleChildrenOnDetach;
  private int[] mReusableIntPair = new int[2];
  private boolean mReverseLayout = false;
  public boolean mShouldReverseLayout = false;
  private boolean mSmoothScrollbarEnabled = true;
  private boolean mStackFromEnd = false;
  
  public LinearLayoutManager(Context paramContext)
  {
    this(paramContext, 1, false);
  }
  
  public LinearLayoutManager(Context paramContext, int paramInt, boolean paramBoolean)
  {
    setOrientation(paramInt);
    setReverseLayout(paramBoolean);
  }
  
  public LinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = RecyclerView.LayoutManager.getProperties(paramContext, paramAttributeSet, paramInt1, paramInt2);
    setOrientation(orientation);
    setReverseLayout(reverseLayout);
    setStackFromEnd(stackFromEnd);
  }
  
  private int computeScrollExtent(RecyclerView.State paramState)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    ensureLayoutState();
    return ScrollbarHelper.computeScrollExtent(paramState, mOrientationHelper, findFirstVisibleChildClosestToStart(mSmoothScrollbarEnabled ^ true, true), findFirstVisibleChildClosestToEnd(mSmoothScrollbarEnabled ^ true, true), this, mSmoothScrollbarEnabled);
  }
  
  private int computeScrollOffset(RecyclerView.State paramState)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    ensureLayoutState();
    return ScrollbarHelper.computeScrollOffset(paramState, mOrientationHelper, findFirstVisibleChildClosestToStart(mSmoothScrollbarEnabled ^ true, true), findFirstVisibleChildClosestToEnd(mSmoothScrollbarEnabled ^ true, true), this, mSmoothScrollbarEnabled, mShouldReverseLayout);
  }
  
  private int computeScrollRange(RecyclerView.State paramState)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    ensureLayoutState();
    return ScrollbarHelper.computeScrollRange(paramState, mOrientationHelper, findFirstVisibleChildClosestToStart(mSmoothScrollbarEnabled ^ true, true), findFirstVisibleChildClosestToEnd(mSmoothScrollbarEnabled ^ true, true), this, mSmoothScrollbarEnabled);
  }
  
  private View findFirstPartiallyOrCompletelyInvisibleChild()
  {
    return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
  }
  
  private View findLastPartiallyOrCompletelyInvisibleChild()
  {
    return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
  }
  
  private View findPartiallyOrCompletelyInvisibleChildClosestToEnd()
  {
    View localView;
    if (mShouldReverseLayout) {
      localView = findFirstPartiallyOrCompletelyInvisibleChild();
    } else {
      localView = findLastPartiallyOrCompletelyInvisibleChild();
    }
    return localView;
  }
  
  private View findPartiallyOrCompletelyInvisibleChildClosestToStart()
  {
    View localView;
    if (mShouldReverseLayout) {
      localView = findLastPartiallyOrCompletelyInvisibleChild();
    } else {
      localView = findFirstPartiallyOrCompletelyInvisibleChild();
    }
    return localView;
  }
  
  private int fixLayoutEndGap(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i = mOrientationHelper.getEndAfterPadding() - paramInt;
    if (i > 0)
    {
      i = -scrollBy(-i, paramRecycler, paramState);
      if (paramBoolean)
      {
        paramInt = mOrientationHelper.getEndAfterPadding() - (paramInt + i);
        if (paramInt > 0)
        {
          mOrientationHelper.offsetChildren(paramInt);
          return paramInt + i;
        }
      }
      return i;
    }
    return 0;
  }
  
  private int fixLayoutStartGap(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i = paramInt - mOrientationHelper.getStartAfterPadding();
    if (i > 0)
    {
      int j = -scrollBy(i, paramRecycler, paramState);
      i = j;
      if (paramBoolean)
      {
        paramInt = paramInt + j - mOrientationHelper.getStartAfterPadding();
        i = j;
        if (paramInt > 0)
        {
          mOrientationHelper.offsetChildren(-paramInt);
          i = j - paramInt;
        }
      }
      return i;
    }
    return 0;
  }
  
  private View getChildClosestToEnd()
  {
    int i;
    if (mShouldReverseLayout) {
      i = 0;
    } else {
      i = getChildCount() - 1;
    }
    return getChildAt(i);
  }
  
  private View getChildClosestToStart()
  {
    int i;
    if (mShouldReverseLayout) {
      i = getChildCount() - 1;
    } else {
      i = 0;
    }
    return getChildAt(i);
  }
  
  private void layoutForPredictiveAnimations(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt1, int paramInt2)
  {
    if ((paramState.willRunPredictiveAnimations()) && (getChildCount() != 0) && (!paramState.isPreLayout()) && (supportsPredictiveItemAnimations()))
    {
      List localList = paramRecycler.getScrapList();
      int i = localList.size();
      int j = getPosition(getChildAt(0));
      int k = 0;
      int m = k;
      int n = m;
      int i1 = m;
      Object localObject;
      for (m = k; m < i; m++)
      {
        localObject = (RecyclerView.ViewHolder)localList.get(m);
        if (!((RecyclerView.ViewHolder)localObject).isRemoved())
        {
          int i2 = ((RecyclerView.ViewHolder)localObject).getLayoutPosition();
          k = 1;
          int i3;
          if (i2 < j) {
            i3 = 1;
          } else {
            i3 = 0;
          }
          if (i3 != mShouldReverseLayout) {
            k = -1;
          }
          if (k == -1) {
            i1 += mOrientationHelper.getDecoratedMeasurement(itemView);
          } else {
            n += mOrientationHelper.getDecoratedMeasurement(itemView);
          }
        }
      }
      mLayoutState.mScrapList = localList;
      if (i1 > 0)
      {
        updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), paramInt1);
        localObject = mLayoutState;
        mExtraFillSpace = i1;
        mAvailable = 0;
        ((LayoutState)localObject).assignPositionFromScrapList();
        fill(paramRecycler, mLayoutState, paramState, false);
      }
      if (n > 0)
      {
        updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), paramInt2);
        localObject = mLayoutState;
        mExtraFillSpace = n;
        mAvailable = 0;
        ((LayoutState)localObject).assignPositionFromScrapList();
        fill(paramRecycler, mLayoutState, paramState, false);
      }
      mLayoutState.mScrapList = null;
    }
  }
  
  private void logChildren()
  {
    Log.d("LinearLayoutManager", "internal representation of views on the screen");
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      StringBuilder localStringBuilder = z2.t("item ");
      localStringBuilder.append(getPosition(localView));
      localStringBuilder.append(", coord:");
      localStringBuilder.append(mOrientationHelper.getDecoratedStart(localView));
      Log.d("LinearLayoutManager", localStringBuilder.toString());
    }
    Log.d("LinearLayoutManager", "==============");
  }
  
  private void recycleByLayoutState(RecyclerView.Recycler paramRecycler, LayoutState paramLayoutState)
  {
    if ((mRecycle) && (!mInfinite))
    {
      int i = mScrollingOffset;
      int j = mNoRecycleSpace;
      if (mLayoutDirection == -1) {
        recycleViewsFromEnd(paramRecycler, i, j);
      } else {
        recycleViewsFromStart(paramRecycler, i, j);
      }
    }
  }
  
  private void recycleChildren(RecyclerView.Recycler paramRecycler, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {
      return;
    }
    int i = paramInt1;
    if (paramInt2 > paramInt1)
    {
      paramInt2--;
      while (paramInt2 >= paramInt1)
      {
        removeAndRecycleViewAt(paramInt2, paramRecycler);
        paramInt2--;
      }
    }
    while (i > paramInt2)
    {
      removeAndRecycleViewAt(i, paramRecycler);
      i--;
    }
  }
  
  private void recycleViewsFromEnd(RecyclerView.Recycler paramRecycler, int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    if (paramInt1 < 0) {
      return;
    }
    int j = mOrientationHelper.getEnd() - paramInt1 + paramInt2;
    View localView;
    if (mShouldReverseLayout)
    {
      for (paramInt1 = 0;; paramInt1++)
      {
        if (paramInt1 >= i) {
          return;
        }
        localView = getChildAt(paramInt1);
        if ((mOrientationHelper.getDecoratedStart(localView) < j) || (mOrientationHelper.getTransformedStartWithDecoration(localView) < j)) {
          break;
        }
      }
      recycleChildren(paramRecycler, 0, paramInt1);
      return;
    }
    paramInt2 = i - 1;
    paramInt1 = paramInt2;
    while (paramInt1 >= 0)
    {
      localView = getChildAt(paramInt1);
      if ((mOrientationHelper.getDecoratedStart(localView) >= j) && (mOrientationHelper.getTransformedStartWithDecoration(localView) >= j)) {
        paramInt1--;
      } else {
        recycleChildren(paramRecycler, paramInt2, paramInt1);
      }
    }
  }
  
  private void recycleViewsFromStart(RecyclerView.Recycler paramRecycler, int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      return;
    }
    int i = paramInt1 - paramInt2;
    paramInt2 = getChildCount();
    View localView;
    if (mShouldReverseLayout)
    {
      paramInt2--;
      for (paramInt1 = paramInt2;; paramInt1--)
      {
        if (paramInt1 < 0) {
          return;
        }
        localView = getChildAt(paramInt1);
        if ((mOrientationHelper.getDecoratedEnd(localView) > i) || (mOrientationHelper.getTransformedEndWithDecoration(localView) > i)) {
          break;
        }
      }
      recycleChildren(paramRecycler, paramInt2, paramInt1);
      return;
    }
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      localView = getChildAt(paramInt1);
      if ((mOrientationHelper.getDecoratedEnd(localView) <= i) && (mOrientationHelper.getTransformedEndWithDecoration(localView) <= i)) {
        paramInt1++;
      } else {
        recycleChildren(paramRecycler, 0, paramInt1);
      }
    }
  }
  
  private void resolveShouldLayoutReverse()
  {
    if ((mOrientation != 1) && (isLayoutRTL())) {
      mShouldReverseLayout = (mReverseLayout ^ true);
    } else {
      mShouldReverseLayout = mReverseLayout;
    }
  }
  
  private boolean updateAnchorFromChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, AnchorInfo paramAnchorInfo)
  {
    int i = getChildCount();
    int j = 0;
    if (i == 0) {
      return false;
    }
    View localView = getFocusedChild();
    if ((localView != null) && (paramAnchorInfo.isViewValidAsAnchor(localView, paramState)))
    {
      paramAnchorInfo.assignFromViewAndKeepVisibleRect(localView, getPosition(localView));
      return true;
    }
    boolean bool1 = mLastStackFromEnd;
    boolean bool2 = mStackFromEnd;
    if (bool1 != bool2) {
      return false;
    }
    paramRecycler = findReferenceChild(paramRecycler, paramState, mLayoutFromEnd, bool2);
    if (paramRecycler != null)
    {
      paramAnchorInfo.assignFromView(paramRecycler, getPosition(paramRecycler));
      if ((!paramState.isPreLayout()) && (supportsPredictiveItemAnimations()))
      {
        int k = mOrientationHelper.getDecoratedStart(paramRecycler);
        int m = mOrientationHelper.getDecoratedEnd(paramRecycler);
        int n = mOrientationHelper.getStartAfterPadding();
        int i1 = mOrientationHelper.getEndAfterPadding();
        if ((m <= n) && (k < n)) {
          i = 1;
        } else {
          i = 0;
        }
        int i2 = j;
        if (k >= i1)
        {
          i2 = j;
          if (m > i1) {
            i2 = 1;
          }
        }
        if ((i != 0) || (i2 != 0))
        {
          i = n;
          if (mLayoutFromEnd) {
            i = i1;
          }
          mCoordinate = i;
        }
      }
      return true;
    }
    return false;
  }
  
  private boolean updateAnchorFromPendingData(RecyclerView.State paramState, AnchorInfo paramAnchorInfo)
  {
    boolean bool1 = paramState.isPreLayout();
    boolean bool2 = false;
    if (!bool1)
    {
      int i = mPendingScrollPosition;
      if (i != -1)
      {
        if ((i >= 0) && (i < paramState.getItemCount()))
        {
          mPosition = mPendingScrollPosition;
          paramState = mPendingSavedState;
          if ((paramState != null) && (paramState.hasValidAnchor()))
          {
            bool1 = mPendingSavedState.mAnchorLayoutFromEnd;
            mLayoutFromEnd = bool1;
            if (bool1) {
              mCoordinate = (mOrientationHelper.getEndAfterPadding() - mPendingSavedState.mAnchorOffset);
            } else {
              mCoordinate = (mOrientationHelper.getStartAfterPadding() + mPendingSavedState.mAnchorOffset);
            }
            return true;
          }
          if (mPendingScrollPositionOffset == Integer.MIN_VALUE)
          {
            paramState = findViewByPosition(mPendingScrollPosition);
            if (paramState != null)
            {
              if (mOrientationHelper.getDecoratedMeasurement(paramState) > mOrientationHelper.getTotalSpace())
              {
                paramAnchorInfo.assignCoordinateFromPadding();
                return true;
              }
              if (mOrientationHelper.getDecoratedStart(paramState) - mOrientationHelper.getStartAfterPadding() < 0)
              {
                mCoordinate = mOrientationHelper.getStartAfterPadding();
                mLayoutFromEnd = false;
                return true;
              }
              if (mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(paramState) < 0)
              {
                mCoordinate = mOrientationHelper.getEndAfterPadding();
                mLayoutFromEnd = true;
                return true;
              }
              if (mLayoutFromEnd)
              {
                i = mOrientationHelper.getDecoratedEnd(paramState);
                i = mOrientationHelper.getTotalSpaceChange() + i;
              }
              else
              {
                i = mOrientationHelper.getDecoratedStart(paramState);
              }
              mCoordinate = i;
            }
            else
            {
              if (getChildCount() > 0)
              {
                i = getPosition(getChildAt(0));
                if (mPendingScrollPosition < i) {
                  bool1 = true;
                } else {
                  bool1 = false;
                }
                if (bool1 == mShouldReverseLayout) {
                  bool2 = true;
                }
                mLayoutFromEnd = bool2;
              }
              paramAnchorInfo.assignCoordinateFromPadding();
            }
            return true;
          }
          bool1 = mShouldReverseLayout;
          mLayoutFromEnd = bool1;
          if (bool1) {
            mCoordinate = (mOrientationHelper.getEndAfterPadding() - mPendingScrollPositionOffset);
          } else {
            mCoordinate = (mOrientationHelper.getStartAfterPadding() + mPendingScrollPositionOffset);
          }
          return true;
        }
        mPendingScrollPosition = -1;
        mPendingScrollPositionOffset = Integer.MIN_VALUE;
      }
    }
    return false;
  }
  
  private void updateAnchorInfoForLayout(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, AnchorInfo paramAnchorInfo)
  {
    if (updateAnchorFromPendingData(paramState, paramAnchorInfo)) {
      return;
    }
    if (updateAnchorFromChildren(paramRecycler, paramState, paramAnchorInfo)) {
      return;
    }
    paramAnchorInfo.assignCoordinateFromPadding();
    int i;
    if (mStackFromEnd) {
      i = paramState.getItemCount() - 1;
    } else {
      i = 0;
    }
    mPosition = i;
  }
  
  private void updateLayoutState(int paramInt1, int paramInt2, boolean paramBoolean, RecyclerView.State paramState)
  {
    mLayoutState.mInfinite = resolveIsInfinite();
    mLayoutState.mLayoutDirection = paramInt1;
    Object localObject = mReusableIntPair;
    int i = 0;
    localObject[0] = 0;
    int j = 1;
    int k = 1;
    localObject[1] = 0;
    calculateExtraLayoutSpace(paramState, (int[])localObject);
    int m = Math.max(0, mReusableIntPair[0]);
    int n = Math.max(0, mReusableIntPair[1]);
    if (paramInt1 == 1) {
      i = 1;
    }
    paramState = mLayoutState;
    if (i != 0) {
      paramInt1 = n;
    } else {
      paramInt1 = m;
    }
    mExtraFillSpace = paramInt1;
    if (i != 0) {
      n = m;
    }
    mNoRecycleSpace = n;
    LayoutState localLayoutState;
    if (i != 0)
    {
      mExtraFillSpace = (mOrientationHelper.getEndPadding() + paramInt1);
      localObject = getChildClosestToEnd();
      localLayoutState = mLayoutState;
      paramInt1 = k;
      if (mShouldReverseLayout) {
        paramInt1 = -1;
      }
      mItemDirection = paramInt1;
      paramInt1 = getPosition((View)localObject);
      paramState = mLayoutState;
      mCurrentPosition = (paramInt1 + mItemDirection);
      mOffset = mOrientationHelper.getDecoratedEnd((View)localObject);
      paramInt1 = mOrientationHelper.getDecoratedEnd((View)localObject) - mOrientationHelper.getEndAfterPadding();
    }
    else
    {
      paramState = getChildClosestToStart();
      localObject = mLayoutState;
      paramInt1 = mExtraFillSpace;
      mExtraFillSpace = (mOrientationHelper.getStartAfterPadding() + paramInt1);
      localObject = mLayoutState;
      if (mShouldReverseLayout) {
        paramInt1 = j;
      } else {
        paramInt1 = -1;
      }
      mItemDirection = paramInt1;
      paramInt1 = getPosition(paramState);
      localLayoutState = mLayoutState;
      mCurrentPosition = (paramInt1 + mItemDirection);
      mOffset = mOrientationHelper.getDecoratedStart(paramState);
      paramInt1 = -mOrientationHelper.getDecoratedStart(paramState) + mOrientationHelper.getStartAfterPadding();
    }
    paramState = mLayoutState;
    mAvailable = paramInt2;
    if (paramBoolean) {
      mAvailable = (paramInt2 - paramInt1);
    }
    mScrollingOffset = paramInt1;
  }
  
  private void updateLayoutStateToFillEnd(int paramInt1, int paramInt2)
  {
    mLayoutState.mAvailable = (mOrientationHelper.getEndAfterPadding() - paramInt2);
    LayoutState localLayoutState = mLayoutState;
    int i;
    if (mShouldReverseLayout) {
      i = -1;
    } else {
      i = 1;
    }
    mItemDirection = i;
    mCurrentPosition = paramInt1;
    mLayoutDirection = 1;
    mOffset = paramInt2;
    mScrollingOffset = Integer.MIN_VALUE;
  }
  
  private void updateLayoutStateToFillEnd(AnchorInfo paramAnchorInfo)
  {
    updateLayoutStateToFillEnd(mPosition, mCoordinate);
  }
  
  private void updateLayoutStateToFillStart(int paramInt1, int paramInt2)
  {
    mLayoutState.mAvailable = (paramInt2 - mOrientationHelper.getStartAfterPadding());
    LayoutState localLayoutState = mLayoutState;
    mCurrentPosition = paramInt1;
    if (mShouldReverseLayout) {
      paramInt1 = 1;
    } else {
      paramInt1 = -1;
    }
    mItemDirection = paramInt1;
    mLayoutDirection = -1;
    mOffset = paramInt2;
    mScrollingOffset = Integer.MIN_VALUE;
  }
  
  private void updateLayoutStateToFillStart(AnchorInfo paramAnchorInfo)
  {
    updateLayoutStateToFillStart(mPosition, mCoordinate);
  }
  
  public void assertNotInLayoutOrScroll(String paramString)
  {
    if (mPendingSavedState == null) {
      super.assertNotInLayoutOrScroll(paramString);
    }
  }
  
  public void calculateExtraLayoutSpace(@NonNull RecyclerView.State paramState, @NonNull int[] paramArrayOfInt)
  {
    int i = getExtraLayoutSpace(paramState);
    int j;
    int k;
    if (mLayoutState.mLayoutDirection == -1)
    {
      j = 0;
      k = i;
    }
    else
    {
      k = 0;
      j = i;
    }
    paramArrayOfInt[0] = k;
    paramArrayOfInt[1] = j;
  }
  
  public boolean canScrollHorizontally()
  {
    boolean bool;
    if (mOrientation == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean canScrollVertically()
  {
    int i = mOrientation;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public void collectAdjacentPrefetchPositions(int paramInt1, int paramInt2, RecyclerView.State paramState, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry)
  {
    if (mOrientation != 0) {
      paramInt1 = paramInt2;
    }
    if ((getChildCount() != 0) && (paramInt1 != 0))
    {
      ensureLayoutState();
      if (paramInt1 > 0) {
        paramInt2 = 1;
      } else {
        paramInt2 = -1;
      }
      updateLayoutState(paramInt2, Math.abs(paramInt1), true, paramState);
      collectPrefetchPositionsForLayoutState(paramState, mLayoutState, paramLayoutPrefetchRegistry);
    }
  }
  
  public void collectInitialPrefetchPositions(int paramInt, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry)
  {
    SavedState localSavedState = mPendingSavedState;
    int i = -1;
    boolean bool1;
    int j;
    if ((localSavedState != null) && (localSavedState.hasValidAnchor()))
    {
      localSavedState = mPendingSavedState;
      bool1 = mAnchorLayoutFromEnd;
      j = mAnchorPosition;
    }
    else
    {
      resolveShouldLayoutReverse();
      boolean bool2 = mShouldReverseLayout;
      k = mPendingScrollPosition;
      j = k;
      bool1 = bool2;
      if (k == -1) {
        if (bool2)
        {
          j = paramInt - 1;
          bool1 = bool2;
        }
        else
        {
          j = 0;
          bool1 = bool2;
        }
      }
    }
    if (!bool1) {
      i = 1;
    }
    for (int k = 0; (k < mInitialPrefetchItemCount) && (j >= 0) && (j < paramInt); k++)
    {
      paramLayoutPrefetchRegistry.addPosition(j, 0);
      j += i;
    }
  }
  
  public void collectPrefetchPositionsForLayoutState(RecyclerView.State paramState, LayoutState paramLayoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry)
  {
    int i = mCurrentPosition;
    if ((i >= 0) && (i < paramState.getItemCount())) {
      paramLayoutPrefetchRegistry.addPosition(i, Math.max(0, mScrollingOffset));
    }
  }
  
  public int computeHorizontalScrollExtent(RecyclerView.State paramState)
  {
    return computeScrollExtent(paramState);
  }
  
  public int computeHorizontalScrollOffset(RecyclerView.State paramState)
  {
    return computeScrollOffset(paramState);
  }
  
  public int computeHorizontalScrollRange(RecyclerView.State paramState)
  {
    return computeScrollRange(paramState);
  }
  
  public PointF computeScrollVectorForPosition(int paramInt)
  {
    if (getChildCount() == 0) {
      return null;
    }
    int i = 0;
    int j = getPosition(getChildAt(0));
    int k = 1;
    if (paramInt < j) {
      i = 1;
    }
    paramInt = k;
    if (i != mShouldReverseLayout) {
      paramInt = -1;
    }
    if (mOrientation == 0) {
      return new PointF(paramInt, 0.0F);
    }
    return new PointF(0.0F, paramInt);
  }
  
  public int computeVerticalScrollExtent(RecyclerView.State paramState)
  {
    return computeScrollExtent(paramState);
  }
  
  public int computeVerticalScrollOffset(RecyclerView.State paramState)
  {
    return computeScrollOffset(paramState);
  }
  
  public int computeVerticalScrollRange(RecyclerView.State paramState)
  {
    return computeScrollRange(paramState);
  }
  
  public int convertFocusDirectionToLayoutDirection(int paramInt)
  {
    int i = -1;
    int j = 1;
    int k = 1;
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramInt != 17)
        {
          if (paramInt != 33)
          {
            if (paramInt != 66)
            {
              if (paramInt != 130) {
                return Integer.MIN_VALUE;
              }
              if (mOrientation == 1) {
                paramInt = k;
              } else {
                paramInt = Integer.MIN_VALUE;
              }
              return paramInt;
            }
            if (mOrientation == 0) {
              paramInt = j;
            } else {
              paramInt = Integer.MIN_VALUE;
            }
            return paramInt;
          }
          if (mOrientation != 1) {
            i = Integer.MIN_VALUE;
          }
          return i;
        }
        if (mOrientation != 0) {
          i = Integer.MIN_VALUE;
        }
        return i;
      }
      if (mOrientation == 1) {
        return 1;
      }
      if (isLayoutRTL()) {
        return -1;
      }
      return 1;
    }
    if (mOrientation == 1) {
      return -1;
    }
    if (isLayoutRTL()) {
      return 1;
    }
    return -1;
  }
  
  public LayoutState createLayoutState()
  {
    return new LayoutState();
  }
  
  public void ensureLayoutState()
  {
    if (mLayoutState == null) {
      mLayoutState = createLayoutState();
    }
  }
  
  public int fill(RecyclerView.Recycler paramRecycler, LayoutState paramLayoutState, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i = mAvailable;
    int j = mScrollingOffset;
    if (j != Integer.MIN_VALUE)
    {
      if (i < 0) {
        mScrollingOffset = (j + i);
      }
      recycleByLayoutState(paramRecycler, paramLayoutState);
    }
    j = mAvailable + mExtraFillSpace;
    LayoutChunkResult localLayoutChunkResult = mLayoutChunkResult;
    do
    {
      int k;
      do
      {
        if (((!mInfinite) && (j <= 0)) || (!paramLayoutState.hasMore(paramState))) {
          break;
        }
        localLayoutChunkResult.resetInternal();
        layoutChunk(paramRecycler, paramState, paramLayoutState, localLayoutChunkResult);
        if (mFinished) {
          break;
        }
        k = mOffset;
        mOffset = (mConsumed * mLayoutDirection + k);
        int m;
        if ((mIgnoreConsumed) && (mScrapList == null))
        {
          k = j;
          if (paramState.isPreLayout()) {}
        }
        else
        {
          k = mAvailable;
          m = mConsumed;
          mAvailable = (k - m);
          k = j - m;
        }
        j = mScrollingOffset;
        if (j != Integer.MIN_VALUE)
        {
          j += mConsumed;
          mScrollingOffset = j;
          m = mAvailable;
          if (m < 0) {
            mScrollingOffset = (j + m);
          }
          recycleByLayoutState(paramRecycler, paramLayoutState);
        }
        j = k;
      } while (!paramBoolean);
      j = k;
    } while (!mFocusable);
    return i - mAvailable;
  }
  
  public int findFirstCompletelyVisibleItemPosition()
  {
    View localView = findOneVisibleChild(0, getChildCount(), true, false);
    int i;
    if (localView == null) {
      i = -1;
    } else {
      i = getPosition(localView);
    }
    return i;
  }
  
  public View findFirstVisibleChildClosestToEnd(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (mShouldReverseLayout) {
      return findOneVisibleChild(0, getChildCount(), paramBoolean1, paramBoolean2);
    }
    return findOneVisibleChild(getChildCount() - 1, -1, paramBoolean1, paramBoolean2);
  }
  
  public View findFirstVisibleChildClosestToStart(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (mShouldReverseLayout) {
      return findOneVisibleChild(getChildCount() - 1, -1, paramBoolean1, paramBoolean2);
    }
    return findOneVisibleChild(0, getChildCount(), paramBoolean1, paramBoolean2);
  }
  
  public int findFirstVisibleItemPosition()
  {
    View localView = findOneVisibleChild(0, getChildCount(), false, true);
    int i;
    if (localView == null) {
      i = -1;
    } else {
      i = getPosition(localView);
    }
    return i;
  }
  
  public int findLastCompletelyVisibleItemPosition()
  {
    int i = getChildCount();
    int j = -1;
    View localView = findOneVisibleChild(i - 1, -1, true, false);
    if (localView != null) {
      j = getPosition(localView);
    }
    return j;
  }
  
  public int findLastVisibleItemPosition()
  {
    int i = getChildCount();
    int j = -1;
    View localView = findOneVisibleChild(i - 1, -1, false, true);
    if (localView != null) {
      j = getPosition(localView);
    }
    return j;
  }
  
  public View findOnePartiallyOrCompletelyInvisibleChild(int paramInt1, int paramInt2)
  {
    ensureLayoutState();
    int i;
    if (paramInt2 > paramInt1) {
      i = 1;
    } else if (paramInt2 < paramInt1) {
      i = -1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return getChildAt(paramInt1);
    }
    int j;
    if (mOrientationHelper.getDecoratedStart(getChildAt(paramInt1)) < mOrientationHelper.getStartAfterPadding())
    {
      j = 16644;
      i = 16388;
    }
    else
    {
      j = 4161;
      i = 4097;
    }
    View localView;
    if (mOrientation == 0) {
      localView = mHorizontalBoundCheck.findOneViewWithinBoundFlags(paramInt1, paramInt2, j, i);
    } else {
      localView = mVerticalBoundCheck.findOneViewWithinBoundFlags(paramInt1, paramInt2, j, i);
    }
    return localView;
  }
  
  public View findOneVisibleChild(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    ensureLayoutState();
    int i = 320;
    int j;
    if (paramBoolean1) {
      j = 24579;
    } else {
      j = 320;
    }
    if (!paramBoolean2) {
      i = 0;
    }
    View localView;
    if (mOrientation == 0) {
      localView = mHorizontalBoundCheck.findOneViewWithinBoundFlags(paramInt1, paramInt2, j, i);
    } else {
      localView = mVerticalBoundCheck.findOneViewWithinBoundFlags(paramInt1, paramInt2, j, i);
    }
    return localView;
  }
  
  public View findReferenceChild(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean1, boolean paramBoolean2)
  {
    ensureLayoutState();
    int i = getChildCount();
    int j = -1;
    int k;
    if (paramBoolean2)
    {
      i = getChildCount() - 1;
      k = -1;
    }
    else
    {
      j = i;
      i = 0;
      k = 1;
    }
    int m = paramState.getItemCount();
    int n = mOrientationHelper.getStartAfterPadding();
    int i1 = mOrientationHelper.getEndAfterPadding();
    Object localObject1 = null;
    paramState = null;
    Object localObject4;
    for (paramRecycler = paramState; i != j; paramRecycler = (RecyclerView.Recycler)localObject4)
    {
      View localView = getChildAt(i);
      int i2 = getPosition(localView);
      int i3 = mOrientationHelper.getDecoratedStart(localView);
      int i4 = mOrientationHelper.getDecoratedEnd(localView);
      Object localObject2 = localObject1;
      Object localObject3 = paramState;
      localObject4 = paramRecycler;
      if (i2 >= 0)
      {
        localObject2 = localObject1;
        localObject3 = paramState;
        localObject4 = paramRecycler;
        if (i2 < m) {
          if (((RecyclerView.LayoutParams)localView.getLayoutParams()).isItemRemoved())
          {
            localObject2 = localObject1;
            localObject3 = paramState;
            localObject4 = paramRecycler;
            if (paramRecycler == null)
            {
              localObject2 = localObject1;
              localObject3 = paramState;
              localObject4 = localView;
            }
          }
          else
          {
            if ((i4 <= n) && (i3 < n)) {
              i2 = 1;
            } else {
              i2 = 0;
            }
            if ((i3 >= i1) && (i4 > i1)) {
              i4 = 1;
            } else {
              i4 = 0;
            }
            if ((i2 == 0) && (i4 == 0)) {
              return localView;
            }
            if (paramBoolean1)
            {
              if (i4 == 0)
              {
                localObject2 = localObject1;
                localObject3 = paramState;
                localObject4 = paramRecycler;
                if (localObject1 != null) {
                  break label328;
                }
                break label318;
              }
            }
            else {
              if (i2 == 0) {
                break label303;
              }
            }
            localObject2 = localObject1;
            localObject3 = localView;
            localObject4 = paramRecycler;
            break label328;
            label303:
            localObject2 = localObject1;
            localObject3 = paramState;
            localObject4 = paramRecycler;
            if (localObject1 == null)
            {
              label318:
              localObject4 = paramRecycler;
              localObject3 = paramState;
              localObject2 = localView;
            }
          }
        }
      }
      label328:
      i += k;
      localObject1 = localObject2;
      paramState = (RecyclerView.State)localObject3;
    }
    if (localObject1 == null) {
      if (paramState != null) {
        localObject1 = paramState;
      } else {
        localObject1 = paramRecycler;
      }
    }
    return (View)localObject1;
  }
  
  public View findViewByPosition(int paramInt)
  {
    int i = getChildCount();
    if (i == 0) {
      return null;
    }
    int j = paramInt - getPosition(getChildAt(0));
    if ((j >= 0) && (j < i))
    {
      View localView = getChildAt(j);
      if (getPosition(localView) == paramInt) {
        return localView;
      }
    }
    return super.findViewByPosition(paramInt);
  }
  
  public RecyclerView.LayoutParams generateDefaultLayoutParams()
  {
    return new RecyclerView.LayoutParams(-2, -2);
  }
  
  @Deprecated
  public int getExtraLayoutSpace(RecyclerView.State paramState)
  {
    if (paramState.hasTargetScrollPosition()) {
      return mOrientationHelper.getTotalSpace();
    }
    return 0;
  }
  
  public int getInitialPrefetchItemCount()
  {
    return mInitialPrefetchItemCount;
  }
  
  public int getOrientation()
  {
    return mOrientation;
  }
  
  public boolean getRecycleChildrenOnDetach()
  {
    return mRecycleChildrenOnDetach;
  }
  
  public boolean getReverseLayout()
  {
    return mReverseLayout;
  }
  
  public boolean getStackFromEnd()
  {
    return mStackFromEnd;
  }
  
  public boolean isAutoMeasureEnabled()
  {
    return true;
  }
  
  public boolean isLayoutRTL()
  {
    int i = getLayoutDirection();
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isSmoothScrollbarEnabled()
  {
    return mSmoothScrollbarEnabled;
  }
  
  public void layoutChunk(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, LayoutState paramLayoutState, LayoutChunkResult paramLayoutChunkResult)
  {
    paramRecycler = paramLayoutState.next(paramRecycler);
    if (paramRecycler == null)
    {
      mFinished = true;
      return;
    }
    paramState = (RecyclerView.LayoutParams)paramRecycler.getLayoutParams();
    boolean bool1;
    boolean bool2;
    if (mScrapList == null)
    {
      bool1 = mShouldReverseLayout;
      if (mLayoutDirection == -1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      if (bool1 == bool2) {
        addView(paramRecycler);
      } else {
        addView(paramRecycler, 0);
      }
    }
    else
    {
      bool1 = mShouldReverseLayout;
      if (mLayoutDirection == -1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      if (bool1 == bool2) {
        addDisappearingView(paramRecycler);
      } else {
        addDisappearingView(paramRecycler, 0);
      }
    }
    measureChildWithMargins(paramRecycler, 0, 0);
    mConsumed = mOrientationHelper.getDecoratedMeasurement(paramRecycler);
    int i;
    int j;
    int k;
    int m;
    int n;
    int i1;
    if (mOrientation == 1)
    {
      if (isLayoutRTL())
      {
        i = getWidth() - getPaddingRight();
        j = i - mOrientationHelper.getDecoratedMeasurementInOther(paramRecycler);
      }
      else
      {
        j = getPaddingLeft();
        i = mOrientationHelper.getDecoratedMeasurementInOther(paramRecycler) + j;
      }
      if (mLayoutDirection == -1)
      {
        k = mOffset;
        m = mConsumed;
        n = k;
        i1 = i;
        i = k - m;
        k = j;
        j = i1;
      }
      else
      {
        k = mOffset;
        m = mConsumed;
        i1 = k;
        n = i;
        m += k;
        k = j;
        i = i1;
        j = n;
        n = m;
      }
    }
    else
    {
      k = getPaddingTop();
      i = mOrientationHelper.getDecoratedMeasurementInOther(paramRecycler) + k;
      if (mLayoutDirection == -1)
      {
        m = mOffset;
        int i2 = mConsumed;
        j = m;
        i1 = k;
        n = i;
        k = m - i2;
        i = i1;
      }
      else
      {
        i1 = mOffset;
        j = mConsumed;
        j += i1;
        n = i;
        i = k;
        k = i1;
      }
    }
    layoutDecoratedWithMargins(paramRecycler, k, i, j, n);
    if ((paramState.isItemRemoved()) || (paramState.isItemChanged())) {
      mIgnoreConsumed = true;
    }
    mFocusable = paramRecycler.hasFocusable();
  }
  
  public void onAnchorReady(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, AnchorInfo paramAnchorInfo, int paramInt) {}
  
  public void onDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
  {
    super.onDetachedFromWindow(paramRecyclerView, paramRecycler);
    if (mRecycleChildrenOnDetach)
    {
      removeAndRecycleAllViews(paramRecycler);
      paramRecycler.clear();
    }
  }
  
  public View onFocusSearchFailed(View paramView, int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    resolveShouldLayoutReverse();
    if (getChildCount() == 0) {
      return null;
    }
    paramInt = convertFocusDirectionToLayoutDirection(paramInt);
    if (paramInt == Integer.MIN_VALUE) {
      return null;
    }
    ensureLayoutState();
    updateLayoutState(paramInt, (int)(mOrientationHelper.getTotalSpace() * 0.33333334F), false, paramState);
    paramView = mLayoutState;
    mScrollingOffset = Integer.MIN_VALUE;
    mRecycle = false;
    fill(paramRecycler, paramView, paramState, true);
    if (paramInt == -1) {
      paramView = findPartiallyOrCompletelyInvisibleChildClosestToStart();
    } else {
      paramView = findPartiallyOrCompletelyInvisibleChildClosestToEnd();
    }
    if (paramInt == -1) {
      paramRecycler = getChildClosestToStart();
    } else {
      paramRecycler = getChildClosestToEnd();
    }
    if (paramRecycler.hasFocusable())
    {
      if (paramView == null) {
        return null;
      }
      return paramRecycler;
    }
    return paramView;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    if (getChildCount() > 0)
    {
      paramAccessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
      paramAccessibilityEvent.setToIndex(findLastVisibleItemPosition());
    }
  }
  
  public void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    Object localObject = mPendingSavedState;
    int i = -1;
    if (((localObject != null) || (mPendingScrollPosition != -1)) && (paramState.getItemCount() == 0))
    {
      removeAndRecycleAllViews(paramRecycler);
      return;
    }
    localObject = mPendingSavedState;
    if ((localObject != null) && (((SavedState)localObject).hasValidAnchor())) {
      mPendingScrollPosition = mPendingSavedState.mAnchorPosition;
    }
    ensureLayoutState();
    mLayoutState.mRecycle = false;
    resolveShouldLayoutReverse();
    View localView = getFocusedChild();
    localObject = mAnchorInfo;
    if ((mValid) && (mPendingScrollPosition == -1) && (mPendingSavedState == null))
    {
      if ((localView != null) && ((mOrientationHelper.getDecoratedStart(localView) >= mOrientationHelper.getEndAfterPadding()) || (mOrientationHelper.getDecoratedEnd(localView) <= mOrientationHelper.getStartAfterPadding()))) {
        mAnchorInfo.assignFromViewAndKeepVisibleRect(localView, getPosition(localView));
      }
    }
    else
    {
      ((AnchorInfo)localObject).reset();
      localObject = mAnchorInfo;
      mLayoutFromEnd = (mShouldReverseLayout ^ mStackFromEnd);
      updateAnchorInfoForLayout(paramRecycler, paramState, (AnchorInfo)localObject);
      mAnchorInfo.mValid = true;
    }
    localObject = mLayoutState;
    if (mLastScrollDelta >= 0) {
      j = 1;
    } else {
      j = -1;
    }
    mLayoutDirection = j;
    localObject = mReusableIntPair;
    localObject[0] = 0;
    localObject[1] = 0;
    calculateExtraLayoutSpace(paramState, (int[])localObject);
    int j = Math.max(0, mReusableIntPair[0]);
    int k = mOrientationHelper.getStartAfterPadding() + j;
    j = Math.max(0, mReusableIntPair[1]);
    int m = mOrientationHelper.getEndPadding() + j;
    j = k;
    int n = m;
    int i1;
    if (paramState.isPreLayout())
    {
      i1 = mPendingScrollPosition;
      j = k;
      n = m;
      if (i1 != -1)
      {
        j = k;
        n = m;
        if (mPendingScrollPositionOffset != Integer.MIN_VALUE)
        {
          localObject = findViewByPosition(i1);
          j = k;
          n = m;
          if (localObject != null)
          {
            if (mShouldReverseLayout)
            {
              n = mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd((View)localObject);
              j = mPendingScrollPositionOffset;
            }
            else
            {
              j = mOrientationHelper.getDecoratedStart((View)localObject) - mOrientationHelper.getStartAfterPadding();
              n = mPendingScrollPositionOffset;
            }
            j = n - j;
            if (j > 0)
            {
              j = k + j;
              n = m;
            }
            else
            {
              n = m - j;
              j = k;
            }
          }
        }
      }
    }
    localObject = mAnchorInfo;
    if (mLayoutFromEnd)
    {
      if (!mShouldReverseLayout) {}
    }
    else {
      while (!mShouldReverseLayout)
      {
        i = 1;
        break;
      }
    }
    onAnchorReady(paramRecycler, paramState, (AnchorInfo)localObject, i);
    detachAndScrapAttachedViews(paramRecycler);
    mLayoutState.mInfinite = resolveIsInfinite();
    mLayoutState.mIsPreLayout = paramState.isPreLayout();
    mLayoutState.mNoRecycleSpace = 0;
    localObject = mAnchorInfo;
    if (mLayoutFromEnd)
    {
      updateLayoutStateToFillStart((AnchorInfo)localObject);
      localObject = mLayoutState;
      mExtraFillSpace = j;
      fill(paramRecycler, (LayoutState)localObject, paramState, false);
      localObject = mLayoutState;
      i = mOffset;
      m = mCurrentPosition;
      k = mAvailable;
      j = n;
      if (k > 0) {
        j = n + k;
      }
      updateLayoutStateToFillEnd(mAnchorInfo);
      localObject = mLayoutState;
      mExtraFillSpace = j;
      mCurrentPosition += mItemDirection;
      fill(paramRecycler, (LayoutState)localObject, paramState, false);
      localObject = mLayoutState;
      k = mOffset;
      i1 = mAvailable;
      j = i;
      n = k;
      if (i1 > 0)
      {
        updateLayoutStateToFillStart(m, i);
        localObject = mLayoutState;
        mExtraFillSpace = i1;
        fill(paramRecycler, (LayoutState)localObject, paramState, false);
        j = mLayoutState.mOffset;
        n = k;
      }
    }
    else
    {
      updateLayoutStateToFillEnd((AnchorInfo)localObject);
      localObject = mLayoutState;
      mExtraFillSpace = n;
      fill(paramRecycler, (LayoutState)localObject, paramState, false);
      localObject = mLayoutState;
      i = mOffset;
      k = mCurrentPosition;
      m = mAvailable;
      n = j;
      if (m > 0) {
        n = j + m;
      }
      updateLayoutStateToFillStart(mAnchorInfo);
      localObject = mLayoutState;
      mExtraFillSpace = n;
      mCurrentPosition += mItemDirection;
      fill(paramRecycler, (LayoutState)localObject, paramState, false);
      localObject = mLayoutState;
      j = mOffset;
      m = mAvailable;
      n = i;
      if (m > 0)
      {
        updateLayoutStateToFillEnd(k, i);
        localObject = mLayoutState;
        mExtraFillSpace = m;
        fill(paramRecycler, (LayoutState)localObject, paramState, false);
        n = mLayoutState.mOffset;
      }
    }
    k = j;
    i = n;
    if (getChildCount() > 0)
    {
      if ((mShouldReverseLayout ^ mStackFromEnd))
      {
        k = fixLayoutEndGap(n, paramRecycler, paramState, true);
        i = j + k;
        j = n + k;
        n = fixLayoutStartGap(i, paramRecycler, paramState, false);
      }
      else
      {
        k = fixLayoutStartGap(j, paramRecycler, paramState, true);
        i = j + k;
        j = n + k;
        n = fixLayoutEndGap(j, paramRecycler, paramState, false);
      }
      k = i + n;
      i = j + n;
    }
    layoutForPredictiveAnimations(paramRecycler, paramState, k, i);
    if (!paramState.isPreLayout()) {
      mOrientationHelper.onLayoutComplete();
    } else {
      mAnchorInfo.reset();
    }
    mLastStackFromEnd = mStackFromEnd;
  }
  
  public void onLayoutCompleted(RecyclerView.State paramState)
  {
    super.onLayoutCompleted(paramState);
    mPendingSavedState = null;
    mPendingScrollPosition = -1;
    mPendingScrollPositionOffset = Integer.MIN_VALUE;
    mAnchorInfo.reset();
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof SavedState))
    {
      paramParcelable = (SavedState)paramParcelable;
      mPendingSavedState = paramParcelable;
      if (mPendingScrollPosition != -1) {
        paramParcelable.invalidateAnchor();
      }
      requestLayout();
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    if (mPendingSavedState != null) {
      return new SavedState(mPendingSavedState);
    }
    SavedState localSavedState = new SavedState();
    if (getChildCount() > 0)
    {
      ensureLayoutState();
      boolean bool = mLastStackFromEnd ^ mShouldReverseLayout;
      mAnchorLayoutFromEnd = bool;
      View localView;
      if (bool)
      {
        localView = getChildClosestToEnd();
        mAnchorOffset = (mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(localView));
        mAnchorPosition = getPosition(localView);
      }
      else
      {
        localView = getChildClosestToStart();
        mAnchorPosition = getPosition(localView);
        mAnchorOffset = (mOrientationHelper.getDecoratedStart(localView) - mOrientationHelper.getStartAfterPadding());
      }
    }
    else
    {
      localSavedState.invalidateAnchor();
    }
    return localSavedState;
  }
  
  public void prepareForDrop(@NonNull View paramView1, @NonNull View paramView2, int paramInt1, int paramInt2)
  {
    assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
    ensureLayoutState();
    resolveShouldLayoutReverse();
    paramInt1 = getPosition(paramView1);
    paramInt2 = getPosition(paramView2);
    if (paramInt1 < paramInt2) {
      paramInt1 = 1;
    } else {
      paramInt1 = -1;
    }
    if (mShouldReverseLayout)
    {
      if (paramInt1 == 1)
      {
        paramInt1 = mOrientationHelper.getEndAfterPadding();
        int i = mOrientationHelper.getDecoratedStart(paramView2);
        scrollToPositionWithOffset(paramInt2, paramInt1 - (mOrientationHelper.getDecoratedMeasurement(paramView1) + i));
      }
      else
      {
        scrollToPositionWithOffset(paramInt2, mOrientationHelper.getEndAfterPadding() - mOrientationHelper.getDecoratedEnd(paramView2));
      }
    }
    else if (paramInt1 == -1) {
      scrollToPositionWithOffset(paramInt2, mOrientationHelper.getDecoratedStart(paramView2));
    } else {
      scrollToPositionWithOffset(paramInt2, mOrientationHelper.getDecoratedEnd(paramView2) - mOrientationHelper.getDecoratedMeasurement(paramView1));
    }
  }
  
  public boolean resolveIsInfinite()
  {
    boolean bool;
    if ((mOrientationHelper.getMode() == 0) && (mOrientationHelper.getEnd() == 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int scrollBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if ((getChildCount() != 0) && (paramInt != 0))
    {
      ensureLayoutState();
      mLayoutState.mRecycle = true;
      int i;
      if (paramInt > 0) {
        i = 1;
      } else {
        i = -1;
      }
      int j = Math.abs(paramInt);
      updateLayoutState(i, j, true, paramState);
      LayoutState localLayoutState = mLayoutState;
      int k = mScrollingOffset;
      k = fill(paramRecycler, localLayoutState, paramState, false) + k;
      if (k < 0) {
        return 0;
      }
      if (j > k) {
        paramInt = i * k;
      }
      mOrientationHelper.offsetChildren(-paramInt);
      mLayoutState.mLastScrollDelta = paramInt;
      return paramInt;
    }
    return 0;
  }
  
  public int scrollHorizontallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (mOrientation == 1) {
      return 0;
    }
    return scrollBy(paramInt, paramRecycler, paramState);
  }
  
  public void scrollToPosition(int paramInt)
  {
    mPendingScrollPosition = paramInt;
    mPendingScrollPositionOffset = Integer.MIN_VALUE;
    SavedState localSavedState = mPendingSavedState;
    if (localSavedState != null) {
      localSavedState.invalidateAnchor();
    }
    requestLayout();
  }
  
  public void scrollToPositionWithOffset(int paramInt1, int paramInt2)
  {
    mPendingScrollPosition = paramInt1;
    mPendingScrollPositionOffset = paramInt2;
    SavedState localSavedState = mPendingSavedState;
    if (localSavedState != null) {
      localSavedState.invalidateAnchor();
    }
    requestLayout();
  }
  
  public int scrollVerticallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (mOrientation == 0) {
      return 0;
    }
    return scrollBy(paramInt, paramRecycler, paramState);
  }
  
  public void setInitialPrefetchItemCount(int paramInt)
  {
    mInitialPrefetchItemCount = paramInt;
  }
  
  public void setOrientation(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException(a.f("invalid orientation:", paramInt));
    }
    assertNotInLayoutOrScroll(null);
    if ((paramInt != mOrientation) || (mOrientationHelper == null))
    {
      OrientationHelper localOrientationHelper = OrientationHelper.createOrientationHelper(this, paramInt);
      mOrientationHelper = localOrientationHelper;
      mAnchorInfo.mOrientationHelper = localOrientationHelper;
      mOrientation = paramInt;
      requestLayout();
    }
  }
  
  public void setRecycleChildrenOnDetach(boolean paramBoolean)
  {
    mRecycleChildrenOnDetach = paramBoolean;
  }
  
  public void setReverseLayout(boolean paramBoolean)
  {
    assertNotInLayoutOrScroll(null);
    if (paramBoolean == mReverseLayout) {
      return;
    }
    mReverseLayout = paramBoolean;
    requestLayout();
  }
  
  public void setSmoothScrollbarEnabled(boolean paramBoolean)
  {
    mSmoothScrollbarEnabled = paramBoolean;
  }
  
  public void setStackFromEnd(boolean paramBoolean)
  {
    assertNotInLayoutOrScroll(null);
    if (mStackFromEnd == paramBoolean) {
      return;
    }
    mStackFromEnd = paramBoolean;
    requestLayout();
  }
  
  public boolean shouldMeasureTwice()
  {
    boolean bool;
    if ((getHeightMode() != 1073741824) && (getWidthMode() != 1073741824) && (hasFlexibleChildInBothOrientations())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void smoothScrollToPosition(RecyclerView paramRecyclerView, RecyclerView.State paramState, int paramInt)
  {
    paramRecyclerView = new LinearSmoothScroller(paramRecyclerView.getContext());
    paramRecyclerView.setTargetPosition(paramInt);
    startSmoothScroll(paramRecyclerView);
  }
  
  public boolean supportsPredictiveItemAnimations()
  {
    boolean bool;
    if ((mPendingSavedState == null) && (mLastStackFromEnd == mStackFromEnd)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void validateChildOrder()
  {
    Object localObject = z2.t("validating child count ");
    ((StringBuilder)localObject).append(getChildCount());
    Log.d("LinearLayoutManager", ((StringBuilder)localObject).toString());
    int i = getChildCount();
    boolean bool1 = true;
    boolean bool2 = true;
    if (i < 1) {
      return;
    }
    int j = getPosition(getChildAt(0));
    int k = mOrientationHelper.getDecoratedStart(getChildAt(0));
    int m;
    int n;
    if (mShouldReverseLayout)
    {
      for (i = 1;; i++)
      {
        if (i >= getChildCount()) {
          return;
        }
        localObject = getChildAt(i);
        m = getPosition((View)localObject);
        n = mOrientationHelper.getDecoratedStart((View)localObject);
        if (m < j)
        {
          logChildren();
          localObject = z2.t("detected invalid position. loc invalid? ");
          if (n >= k) {
            bool2 = false;
          }
          ((StringBuilder)localObject).append(bool2);
          throw new RuntimeException(((StringBuilder)localObject).toString());
        }
        if (n > k) {
          break;
        }
      }
      logChildren();
      throw new RuntimeException("detected invalid location");
    }
    i = 1;
    while (i < getChildCount())
    {
      localObject = getChildAt(i);
      m = getPosition((View)localObject);
      n = mOrientationHelper.getDecoratedStart((View)localObject);
      if (m < j)
      {
        logChildren();
        localObject = z2.t("detected invalid position. loc invalid? ");
        if (n < k) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
        ((StringBuilder)localObject).append(bool2);
        throw new RuntimeException(((StringBuilder)localObject).toString());
      }
      if (n >= k)
      {
        i++;
      }
      else
      {
        logChildren();
        throw new RuntimeException("detected invalid location");
      }
    }
  }
  
  public static class AnchorInfo
  {
    public int mCoordinate;
    public boolean mLayoutFromEnd;
    public OrientationHelper mOrientationHelper;
    public int mPosition;
    public boolean mValid;
    
    public AnchorInfo()
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
  
  public static class LayoutChunkResult
  {
    public int mConsumed;
    public boolean mFinished;
    public boolean mFocusable;
    public boolean mIgnoreConsumed;
    
    public void resetInternal()
    {
      mConsumed = 0;
      mFinished = false;
      mIgnoreConsumed = false;
      mFocusable = false;
    }
  }
  
  public static class LayoutState
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
  
  @SuppressLint({"BanParcelableUsage"})
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public LinearLayoutManager.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new LinearLayoutManager.SavedState(paramAnonymousParcel);
      }
      
      public LinearLayoutManager.SavedState[] newArray(int paramAnonymousInt)
      {
        return new LinearLayoutManager.SavedState[paramAnonymousInt];
      }
    };
    public boolean mAnchorLayoutFromEnd;
    public int mAnchorOffset;
    public int mAnchorPosition;
    
    public SavedState() {}
    
    public SavedState(Parcel paramParcel)
    {
      mAnchorPosition = paramParcel.readInt();
      mAnchorOffset = paramParcel.readInt();
      int i = paramParcel.readInt();
      boolean bool = true;
      if (i != 1) {
        bool = false;
      }
      mAnchorLayoutFromEnd = bool;
    }
    
    public SavedState(SavedState paramSavedState)
    {
      mAnchorPosition = mAnchorPosition;
      mAnchorOffset = mAnchorOffset;
      mAnchorLayoutFromEnd = mAnchorLayoutFromEnd;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public boolean hasValidAnchor()
    {
      boolean bool;
      if (mAnchorPosition >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void invalidateAnchor()
    {
      mAnchorPosition = -1;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(mAnchorPosition);
      paramParcel.writeInt(mAnchorOffset);
      paramParcel.writeInt(mAnchorLayoutFromEnd);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.LinearLayoutManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */