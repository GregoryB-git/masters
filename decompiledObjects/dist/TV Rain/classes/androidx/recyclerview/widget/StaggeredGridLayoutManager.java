package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import z2;

public class StaggeredGridLayoutManager
  extends RecyclerView.LayoutManager
  implements RecyclerView.SmoothScroller.ScrollVectorProvider
{
  public static final boolean DEBUG = false;
  @Deprecated
  public static final int GAP_HANDLING_LAZY = 1;
  public static final int GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS = 2;
  public static final int GAP_HANDLING_NONE = 0;
  public static final int HORIZONTAL = 0;
  public static final int INVALID_OFFSET = Integer.MIN_VALUE;
  private static final float MAX_SCROLL_FACTOR = 0.33333334F;
  private static final String TAG = "StaggeredGridLManager";
  public static final int VERTICAL = 1;
  private final AnchorInfo mAnchorInfo = new AnchorInfo();
  private final Runnable mCheckForGapsRunnable = new Runnable()
  {
    public void run()
    {
      checkForGaps();
    }
  };
  private int mFullSizeSpec;
  private int mGapStrategy = 2;
  private boolean mLaidOutInvalidFullSpan = false;
  private boolean mLastLayoutFromEnd;
  private boolean mLastLayoutRTL;
  @NonNull
  private final LayoutState mLayoutState;
  public LazySpanLookup mLazySpanLookup = new LazySpanLookup();
  private int mOrientation;
  private SavedState mPendingSavedState;
  public int mPendingScrollPosition = -1;
  public int mPendingScrollPositionOffset = Integer.MIN_VALUE;
  private int[] mPrefetchDistances;
  @NonNull
  public OrientationHelper mPrimaryOrientation;
  private BitSet mRemainingSpans;
  public boolean mReverseLayout = false;
  @NonNull
  public OrientationHelper mSecondaryOrientation;
  public boolean mShouldReverseLayout = false;
  private int mSizePerSpan;
  private boolean mSmoothScrollbarEnabled = true;
  private int mSpanCount = -1;
  public Span[] mSpans;
  private final Rect mTmpRect = new Rect();
  
  public StaggeredGridLayoutManager(int paramInt1, int paramInt2)
  {
    mOrientation = paramInt2;
    setSpanCount(paramInt1);
    mLayoutState = new LayoutState();
    createOrientationHelpers();
  }
  
  public StaggeredGridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    paramContext = RecyclerView.LayoutManager.getProperties(paramContext, paramAttributeSet, paramInt1, paramInt2);
    setOrientation(orientation);
    setSpanCount(spanCount);
    setReverseLayout(reverseLayout);
    mLayoutState = new LayoutState();
    createOrientationHelpers();
  }
  
  private void appendViewToAllSpans(View paramView)
  {
    for (int i = mSpanCount - 1; i >= 0; i--) {
      mSpans[i].appendToSpan(paramView);
    }
  }
  
  private void applyPendingSavedState(AnchorInfo paramAnchorInfo)
  {
    SavedState localSavedState = mPendingSavedState;
    int i = mSpanOffsetsSize;
    if (i > 0)
    {
      if (i == mSpanCount) {
        for (i = 0; i < mSpanCount; i++)
        {
          mSpans[i].clear();
          localSavedState = mPendingSavedState;
          int j = mSpanOffsets[i];
          int k = j;
          if (j != Integer.MIN_VALUE)
          {
            if (mAnchorLayoutFromEnd) {
              k = mPrimaryOrientation.getEndAfterPadding();
            } else {
              k = mPrimaryOrientation.getStartAfterPadding();
            }
            k = j + k;
          }
          mSpans[i].setLine(k);
        }
      }
      localSavedState.invalidateSpanInfo();
      localSavedState = mPendingSavedState;
      mAnchorPosition = mVisibleAnchorPosition;
    }
    localSavedState = mPendingSavedState;
    mLastLayoutRTL = mLastLayoutRTL;
    setReverseLayout(mReverseLayout);
    resolveShouldLayoutReverse();
    localSavedState = mPendingSavedState;
    i = mAnchorPosition;
    if (i != -1)
    {
      mPendingScrollPosition = i;
      mLayoutFromEnd = mAnchorLayoutFromEnd;
    }
    else
    {
      mLayoutFromEnd = mShouldReverseLayout;
    }
    if (mSpanLookupSize > 1)
    {
      paramAnchorInfo = mLazySpanLookup;
      mData = mSpanLookup;
      mFullSpanItems = mFullSpanItems;
    }
  }
  
  private void attachViewToSpans(View paramView, LayoutParams paramLayoutParams, LayoutState paramLayoutState)
  {
    if (mLayoutDirection == 1)
    {
      if (mFullSpan) {
        appendViewToAllSpans(paramView);
      } else {
        mSpan.appendToSpan(paramView);
      }
    }
    else if (mFullSpan) {
      prependViewToAllSpans(paramView);
    } else {
      mSpan.prependToSpan(paramView);
    }
  }
  
  private int calculateScrollDirectionForPosition(int paramInt)
  {
    int i = getChildCount();
    int j = -1;
    if (i == 0)
    {
      if (mShouldReverseLayout) {
        j = 1;
      }
      return j;
    }
    int k;
    if (paramInt < getFirstChildPosition()) {
      k = 1;
    } else {
      k = 0;
    }
    if (k == mShouldReverseLayout) {
      j = 1;
    }
    return j;
  }
  
  private boolean checkSpanForGap(Span paramSpan)
  {
    ArrayList localArrayList;
    if (mShouldReverseLayout)
    {
      if (paramSpan.getEndLine() < mPrimaryOrientation.getEndAfterPadding()) {
        localArrayList = mViews;
      }
    }
    else {
      for (boolean bool = getLayoutParamsgetsize1mFullSpan;; bool = getLayoutParamsmViews.get(0)).mFullSpan)
      {
        return bool ^ true;
        if (paramSpan.getStartLine() <= mPrimaryOrientation.getStartAfterPadding()) {
          break;
        }
      }
    }
    return false;
  }
  
  private int computeScrollExtent(RecyclerView.State paramState)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    return ScrollbarHelper.computeScrollExtent(paramState, mPrimaryOrientation, findFirstVisibleItemClosestToStart(mSmoothScrollbarEnabled ^ true), findFirstVisibleItemClosestToEnd(mSmoothScrollbarEnabled ^ true), this, mSmoothScrollbarEnabled);
  }
  
  private int computeScrollOffset(RecyclerView.State paramState)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    return ScrollbarHelper.computeScrollOffset(paramState, mPrimaryOrientation, findFirstVisibleItemClosestToStart(mSmoothScrollbarEnabled ^ true), findFirstVisibleItemClosestToEnd(mSmoothScrollbarEnabled ^ true), this, mSmoothScrollbarEnabled, mShouldReverseLayout);
  }
  
  private int computeScrollRange(RecyclerView.State paramState)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    return ScrollbarHelper.computeScrollRange(paramState, mPrimaryOrientation, findFirstVisibleItemClosestToStart(mSmoothScrollbarEnabled ^ true), findFirstVisibleItemClosestToEnd(mSmoothScrollbarEnabled ^ true), this, mSmoothScrollbarEnabled);
  }
  
  private int convertFocusDirectionToLayoutDirection(int paramInt)
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
  
  private StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFullSpanItemFromEnd(int paramInt)
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
    mGapPerSpan = new int[mSpanCount];
    for (int i = 0; i < mSpanCount; i++) {
      mGapPerSpan[i] = (paramInt - mSpans[i].getEndLine(paramInt));
    }
    return localFullSpanItem;
  }
  
  private StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFullSpanItemFromStart(int paramInt)
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
    mGapPerSpan = new int[mSpanCount];
    for (int i = 0; i < mSpanCount; i++) {
      mGapPerSpan[i] = (mSpans[i].getStartLine(paramInt) - paramInt);
    }
    return localFullSpanItem;
  }
  
  private void createOrientationHelpers()
  {
    mPrimaryOrientation = OrientationHelper.createOrientationHelper(this, mOrientation);
    mSecondaryOrientation = OrientationHelper.createOrientationHelper(this, 1 - mOrientation);
  }
  
  private int fill(RecyclerView.Recycler paramRecycler, LayoutState paramLayoutState, RecyclerView.State paramState)
  {
    Object localObject = mRemainingSpans;
    int i = mSpanCount;
    int j = 0;
    ((BitSet)localObject).set(0, i, true);
    if (mLayoutState.mInfinite)
    {
      if (mLayoutDirection == 1) {
        i = Integer.MAX_VALUE;
      } else {
        i = Integer.MIN_VALUE;
      }
    }
    else if (mLayoutDirection == 1) {
      i = mEndLine + mAvailable;
    } else {
      i = mStartLine - mAvailable;
    }
    updateAllRemainingSpans(mLayoutDirection, i);
    int m;
    if (mShouldReverseLayout) {
      m = mPrimaryOrientation.getEndAfterPadding();
    } else {
      m = mPrimaryOrientation.getStartAfterPadding();
    }
    int k;
    for (int n = 0; (paramLayoutState.hasMore(paramState)) && ((mLayoutState.mInfinite) || (!mRemainingSpans.isEmpty())); n = 1)
    {
      View localView = paramLayoutState.next(paramRecycler);
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      int i1 = localLayoutParams.getViewLayoutPosition();
      n = mLazySpanLookup.getSpan(i1);
      int i2;
      if (n == -1) {
        i2 = 1;
      } else {
        i2 = j;
      }
      if (i2 != 0)
      {
        if (mFullSpan) {
          localObject = mSpans[j];
        } else {
          localObject = getNextSpan(paramLayoutState);
        }
        mLazySpanLookup.setSpan(i1, (Span)localObject);
      }
      else
      {
        localObject = mSpans[n];
      }
      mSpan = ((Span)localObject);
      if (mLayoutDirection == 1) {
        addView(localView);
      } else {
        addView(localView, j);
      }
      measureChildWithDecorationsAndMargin(localView, localLayoutParams, j);
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem;
      int i3;
      if (mLayoutDirection == 1)
      {
        if (mFullSpan) {
          k = getMaxEnd(m);
        } else {
          k = ((Span)localObject).getEndLine(m);
        }
        n = mPrimaryOrientation.getDecoratedMeasurement(localView);
        if ((i2 != 0) && (mFullSpan))
        {
          localFullSpanItem = createFullSpanItemFromEnd(k);
          mGapDir = -1;
          mPosition = i1;
          mLazySpanLookup.addFullSpanItem(localFullSpanItem);
        }
        n += k;
        i3 = k;
      }
      else
      {
        if (mFullSpan) {
          k = getMinStart(m);
        } else {
          k = ((Span)localObject).getStartLine(m);
        }
        i3 = k - mPrimaryOrientation.getDecoratedMeasurement(localView);
        if ((i2 != 0) && (mFullSpan))
        {
          localFullSpanItem = createFullSpanItemFromStart(k);
          mGapDir = 1;
          mPosition = i1;
          mLazySpanLookup.addFullSpanItem(localFullSpanItem);
        }
        n = k;
      }
      if ((mFullSpan) && (mItemDirection == -1)) {
        if (i2 != 0)
        {
          mLaidOutInvalidFullSpan = true;
        }
        else
        {
          boolean bool;
          if (mLayoutDirection == 1) {
            bool = areAllEndsEqual();
          } else {
            bool = areAllStartsEqual();
          }
          if ((bool ^ true))
          {
            localFullSpanItem = mLazySpanLookup.getFullSpanItem(i1);
            if (localFullSpanItem != null) {
              mHasUnwantedGapAfter = true;
            }
            mLaidOutInvalidFullSpan = true;
          }
        }
      }
      attachViewToSpans(localView, localLayoutParams, paramLayoutState);
      if ((isLayoutRTL()) && (mOrientation == 1))
      {
        if (mFullSpan) {
          k = mSecondaryOrientation.getEndAfterPadding();
        } else {
          k = mSecondaryOrientation.getEndAfterPadding() - (mSpanCount - 1 - mIndex) * mSizePerSpan;
        }
        i1 = mSecondaryOrientation.getDecoratedMeasurement(localView);
        i2 = k;
        i1 = k - i1;
        k = i2;
      }
      else
      {
        if (mFullSpan) {
          k = mSecondaryOrientation.getStartAfterPadding();
        } else {
          k = mIndex * mSizePerSpan + mSecondaryOrientation.getStartAfterPadding();
        }
        i1 = mSecondaryOrientation.getDecoratedMeasurement(localView);
        i2 = k;
        k = i1 + k;
        i1 = i2;
      }
      if (mOrientation == 1) {
        layoutDecoratedWithMargins(localView, i1, i3, k, n);
      } else {
        layoutDecoratedWithMargins(localView, i3, i1, n, k);
      }
      if (mFullSpan) {
        updateAllRemainingSpans(mLayoutState.mLayoutDirection, i);
      } else {
        updateRemainingSpans((Span)localObject, mLayoutState.mLayoutDirection, i);
      }
      recycle(paramRecycler, mLayoutState);
      if ((mLayoutState.mStopInFocusable) && (localView.hasFocusable())) {
        if (mFullSpan) {
          mRemainingSpans.clear();
        } else {
          mRemainingSpans.set(mIndex, false);
        }
      }
      k = 0;
    }
    if (n == 0) {
      recycle(paramRecycler, mLayoutState);
    }
    if (mLayoutState.mLayoutDirection == -1)
    {
      i = getMinStart(mPrimaryOrientation.getStartAfterPadding());
      i = mPrimaryOrientation.getStartAfterPadding() - i;
    }
    else
    {
      i = getMaxEnd(mPrimaryOrientation.getEndAfterPadding()) - mPrimaryOrientation.getEndAfterPadding();
    }
    if (i > 0) {
      k = Math.min(mAvailable, i);
    }
    return k;
  }
  
  private int findFirstReferenceChildPosition(int paramInt)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      int k = getPosition(getChildAt(j));
      if ((k >= 0) && (k < paramInt)) {
        return k;
      }
    }
    return 0;
  }
  
  private int findLastReferenceChildPosition(int paramInt)
  {
    for (int i = getChildCount() - 1; i >= 0; i--)
    {
      int j = getPosition(getChildAt(i));
      if ((j >= 0) && (j < paramInt)) {
        return j;
      }
    }
    return 0;
  }
  
  private void fixEndGap(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i = getMaxEnd(Integer.MIN_VALUE);
    if (i == Integer.MIN_VALUE) {
      return;
    }
    i = mPrimaryOrientation.getEndAfterPadding() - i;
    if (i > 0)
    {
      i -= -scrollBy(-i, paramRecycler, paramState);
      if ((paramBoolean) && (i > 0)) {
        mPrimaryOrientation.offsetChildren(i);
      }
    }
  }
  
  private void fixStartGap(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    int i = getMinStart(Integer.MAX_VALUE);
    if (i == Integer.MAX_VALUE) {
      return;
    }
    i -= mPrimaryOrientation.getStartAfterPadding();
    if (i > 0)
    {
      i -= scrollBy(i, paramRecycler, paramState);
      if ((paramBoolean) && (i > 0)) {
        mPrimaryOrientation.offsetChildren(-i);
      }
    }
  }
  
  private int getMaxEnd(int paramInt)
  {
    int i = mSpans[0].getEndLine(paramInt);
    int j = 1;
    while (j < mSpanCount)
    {
      int k = mSpans[j].getEndLine(paramInt);
      int m = i;
      if (k > i) {
        m = k;
      }
      j++;
      i = m;
    }
    return i;
  }
  
  private int getMaxStart(int paramInt)
  {
    int i = mSpans[0].getStartLine(paramInt);
    int j = 1;
    while (j < mSpanCount)
    {
      int k = mSpans[j].getStartLine(paramInt);
      int m = i;
      if (k > i) {
        m = k;
      }
      j++;
      i = m;
    }
    return i;
  }
  
  private int getMinEnd(int paramInt)
  {
    int i = mSpans[0].getEndLine(paramInt);
    int j = 1;
    while (j < mSpanCount)
    {
      int k = mSpans[j].getEndLine(paramInt);
      int m = i;
      if (k < i) {
        m = k;
      }
      j++;
      i = m;
    }
    return i;
  }
  
  private int getMinStart(int paramInt)
  {
    int i = mSpans[0].getStartLine(paramInt);
    int j = 1;
    while (j < mSpanCount)
    {
      int k = mSpans[j].getStartLine(paramInt);
      int m = i;
      if (k < i) {
        m = k;
      }
      j++;
      i = m;
    }
    return i;
  }
  
  private Span getNextSpan(LayoutState paramLayoutState)
  {
    boolean bool = preferLastSpan(mLayoutDirection);
    int i = -1;
    int j;
    int k;
    if (bool)
    {
      j = mSpanCount - 1;
      k = -1;
    }
    else
    {
      j = 0;
      i = mSpanCount;
      k = 1;
    }
    int m = mLayoutDirection;
    Span localSpan = null;
    paramLayoutState = null;
    int i2;
    if (m == 1)
    {
      n = Integer.MAX_VALUE;
      i1 = mPrimaryOrientation.getStartAfterPadding();
      m = j;
      while (m != i)
      {
        localSpan = mSpans[m];
        i2 = localSpan.getEndLine(i1);
        j = n;
        if (i2 < n)
        {
          paramLayoutState = localSpan;
          j = i2;
        }
        m += k;
        n = j;
      }
      return paramLayoutState;
    }
    m = Integer.MIN_VALUE;
    int i1 = mPrimaryOrientation.getEndAfterPadding();
    paramLayoutState = localSpan;
    int n = j;
    while (n != i)
    {
      localSpan = mSpans[n];
      i2 = localSpan.getStartLine(i1);
      j = m;
      if (i2 > m)
      {
        paramLayoutState = localSpan;
        j = i2;
      }
      n += k;
      m = j;
    }
    return paramLayoutState;
  }
  
  private void handleUpdate(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if (mShouldReverseLayout) {
      i = getLastChildPosition();
    } else {
      i = getFirstChildPosition();
    }
    int j;
    if (paramInt3 == 8)
    {
      if (paramInt1 < paramInt2)
      {
        j = paramInt2 + 1;
      }
      else
      {
        j = paramInt1 + 1;
        k = paramInt2;
        break label60;
      }
    }
    else {
      j = paramInt1 + paramInt2;
    }
    int k = paramInt1;
    label60:
    mLazySpanLookup.invalidateAfter(k);
    if (paramInt3 != 1)
    {
      if (paramInt3 != 2)
      {
        if (paramInt3 == 8)
        {
          mLazySpanLookup.offsetForRemoval(paramInt1, 1);
          mLazySpanLookup.offsetForAddition(paramInt2, 1);
        }
      }
      else {
        mLazySpanLookup.offsetForRemoval(paramInt1, paramInt2);
      }
    }
    else {
      mLazySpanLookup.offsetForAddition(paramInt1, paramInt2);
    }
    if (j <= i) {
      return;
    }
    if (mShouldReverseLayout) {
      paramInt1 = getFirstChildPosition();
    } else {
      paramInt1 = getLastChildPosition();
    }
    if (k <= paramInt1) {
      requestLayout();
    }
  }
  
  private void measureChildWithDecorationsAndMargin(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    calculateItemDecorationsForChild(paramView, mTmpRect);
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = leftMargin;
    Rect localRect = mTmpRect;
    paramInt1 = updateSpecWithExtra(paramInt1, i + left, rightMargin + right);
    i = topMargin;
    localRect = mTmpRect;
    paramInt2 = updateSpecWithExtra(paramInt2, i + top, bottomMargin + bottom);
    if (paramBoolean) {
      paramBoolean = shouldReMeasureChild(paramView, paramInt1, paramInt2, localLayoutParams);
    } else {
      paramBoolean = shouldMeasureChild(paramView, paramInt1, paramInt2, localLayoutParams);
    }
    if (paramBoolean) {
      paramView.measure(paramInt1, paramInt2);
    }
  }
  
  private void measureChildWithDecorationsAndMargin(View paramView, LayoutParams paramLayoutParams, boolean paramBoolean)
  {
    int i;
    int j;
    int k;
    int m;
    if (mFullSpan)
    {
      if (mOrientation == 1)
      {
        i = mFullSizeSpec;
        j = getHeight();
        k = getHeightMode();
        m = getPaddingTop();
        measureChildWithDecorationsAndMargin(paramView, i, RecyclerView.LayoutManager.getChildMeasureSpec(j, k, getPaddingBottom() + m, height, true), paramBoolean);
      }
      else
      {
        m = getWidth();
        j = getWidthMode();
        k = getPaddingLeft();
        measureChildWithDecorationsAndMargin(paramView, RecyclerView.LayoutManager.getChildMeasureSpec(m, j, getPaddingRight() + k, width, true), mFullSizeSpec, paramBoolean);
      }
    }
    else if (mOrientation == 1)
    {
      i = RecyclerView.LayoutManager.getChildMeasureSpec(mSizePerSpan, getWidthMode(), 0, width, false);
      j = getHeight();
      k = getHeightMode();
      m = getPaddingTop();
      measureChildWithDecorationsAndMargin(paramView, i, RecyclerView.LayoutManager.getChildMeasureSpec(j, k, getPaddingBottom() + m, height, true), paramBoolean);
    }
    else
    {
      j = getWidth();
      k = getWidthMode();
      m = getPaddingLeft();
      measureChildWithDecorationsAndMargin(paramView, RecyclerView.LayoutManager.getChildMeasureSpec(j, k, getPaddingRight() + m, width, true), RecyclerView.LayoutManager.getChildMeasureSpec(mSizePerSpan, getHeightMode(), 0, height, false), paramBoolean);
    }
  }
  
  private void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean)
  {
    AnchorInfo localAnchorInfo = mAnchorInfo;
    if (((mPendingSavedState != null) || (mPendingScrollPosition != -1)) && (paramState.getItemCount() == 0))
    {
      removeAndRecycleAllViews(paramRecycler);
      localAnchorInfo.reset();
      return;
    }
    boolean bool = mValid;
    int i = 1;
    if ((bool) && (mPendingScrollPosition == -1) && (mPendingSavedState == null)) {
      j = 0;
    } else {
      j = 1;
    }
    if (j != 0)
    {
      localAnchorInfo.reset();
      if (mPendingSavedState != null)
      {
        applyPendingSavedState(localAnchorInfo);
      }
      else
      {
        resolveShouldLayoutReverse();
        mLayoutFromEnd = mShouldReverseLayout;
      }
      updateAnchorInfoForLayout(paramState, localAnchorInfo);
      mValid = true;
    }
    if ((mPendingSavedState == null) && (mPendingScrollPosition == -1) && ((mLayoutFromEnd != mLastLayoutFromEnd) || (isLayoutRTL() != mLastLayoutRTL)))
    {
      mLazySpanLookup.clear();
      mInvalidateOffsets = true;
    }
    Object localObject;
    if (getChildCount() > 0)
    {
      localObject = mPendingSavedState;
      if ((localObject == null) || (mSpanOffsetsSize < 1))
      {
        if (mInvalidateOffsets) {
          for (j = 0; j < mSpanCount; j++)
          {
            mSpans[j].clear();
            int k = mOffset;
            if (k != Integer.MIN_VALUE) {
              mSpans[j].setLine(k);
            }
          }
        }
        if ((j == 0) && (mAnchorInfo.mSpanReferenceLines != null)) {
          j = 0;
        }
        while (j < mSpanCount)
        {
          localObject = mSpans[j];
          ((Span)localObject).clear();
          ((Span)localObject).setLine(mAnchorInfo.mSpanReferenceLines[j]);
          j++;
          continue;
          for (j = 0; j < mSpanCount; j++) {
            mSpans[j].cacheReferenceLineAndClear(mShouldReverseLayout, mOffset);
          }
          mAnchorInfo.saveSpanReferenceLines(mSpans);
        }
      }
    }
    detachAndScrapAttachedViews(paramRecycler);
    mLayoutState.mRecycle = false;
    mLaidOutInvalidFullSpan = false;
    updateMeasureSpecs(mSecondaryOrientation.getTotalSpace());
    updateLayoutState(mPosition, paramState);
    if (mLayoutFromEnd)
    {
      setLayoutStateDirection(-1);
      fill(paramRecycler, mLayoutState, paramState);
      setLayoutStateDirection(1);
      localObject = mLayoutState;
      mCurrentPosition = (mPosition + mItemDirection);
      fill(paramRecycler, (LayoutState)localObject, paramState);
    }
    else
    {
      setLayoutStateDirection(1);
      fill(paramRecycler, mLayoutState, paramState);
      setLayoutStateDirection(-1);
      localObject = mLayoutState;
      mCurrentPosition = (mPosition + mItemDirection);
      fill(paramRecycler, (LayoutState)localObject, paramState);
    }
    repositionToWrapContentIfNecessary();
    if (getChildCount() > 0) {
      if (mShouldReverseLayout)
      {
        fixEndGap(paramRecycler, paramState, true);
        fixStartGap(paramRecycler, paramState, false);
      }
      else
      {
        fixStartGap(paramRecycler, paramState, true);
        fixEndGap(paramRecycler, paramState, false);
      }
    }
    if ((paramBoolean) && (!paramState.isPreLayout()))
    {
      if ((mGapStrategy != 0) && (getChildCount() > 0) && ((mLaidOutInvalidFullSpan) || (hasGapsToFix() != null))) {
        j = 1;
      } else {
        j = 0;
      }
      if (j != 0)
      {
        removeCallbacks(mCheckForGapsRunnable);
        if (checkForGaps())
        {
          j = i;
          break label668;
        }
      }
    }
    int j = 0;
    label668:
    if (paramState.isPreLayout()) {
      mAnchorInfo.reset();
    }
    mLastLayoutFromEnd = mLayoutFromEnd;
    mLastLayoutRTL = isLayoutRTL();
    if (j != 0)
    {
      mAnchorInfo.reset();
      onLayoutChildren(paramRecycler, paramState, false);
    }
  }
  
  private boolean preferLastSpan(int paramInt)
  {
    int i = mOrientation;
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3;
    if (i == 0)
    {
      if (paramInt == -1) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      if (bool3 != mShouldReverseLayout) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      return bool3;
    }
    if (paramInt == -1) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    if (bool3 == mShouldReverseLayout) {
      bool3 = true;
    } else {
      bool3 = false;
    }
    if (bool3 == isLayoutRTL()) {
      bool3 = bool1;
    } else {
      bool3 = false;
    }
    return bool3;
  }
  
  private void prependViewToAllSpans(View paramView)
  {
    for (int i = mSpanCount - 1; i >= 0; i--) {
      mSpans[i].prependToSpan(paramView);
    }
  }
  
  private void recycle(RecyclerView.Recycler paramRecycler, LayoutState paramLayoutState)
  {
    if ((mRecycle) && (!mInfinite)) {
      if (mAvailable == 0)
      {
        if (mLayoutDirection == -1) {
          recycleFromEnd(paramRecycler, mEndLine);
        } else {
          recycleFromStart(paramRecycler, mStartLine);
        }
      }
      else
      {
        int i;
        if (mLayoutDirection == -1)
        {
          i = mStartLine;
          i -= getMaxStart(i);
          if (i < 0) {
            i = mEndLine;
          } else {
            i = mEndLine - Math.min(i, mAvailable);
          }
          recycleFromEnd(paramRecycler, i);
        }
        else
        {
          int j = getMinEnd(mEndLine) - mEndLine;
          if (j < 0)
          {
            i = mStartLine;
          }
          else
          {
            i = mStartLine;
            i = Math.min(j, mAvailable) + i;
          }
          recycleFromStart(paramRecycler, i);
        }
      }
    }
  }
  
  private void recycleFromEnd(RecyclerView.Recycler paramRecycler, int paramInt)
  {
    for (int i = getChildCount() - 1; i >= 0; i--)
    {
      View localView = getChildAt(i);
      if ((mPrimaryOrientation.getDecoratedStart(localView) < paramInt) || (mPrimaryOrientation.getTransformedStartWithDecoration(localView) < paramInt)) {
        break;
      }
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (mFullSpan)
      {
        int j = 0;
        int m;
        for (int k = 0;; k++)
        {
          m = j;
          if (k >= mSpanCount) {
            break;
          }
          if (mSpans[k].mViews.size() == 1) {
            return;
          }
        }
        while (m < mSpanCount)
        {
          mSpans[m].popEnd();
          m++;
        }
      }
      if (mSpan.mViews.size() == 1) {
        return;
      }
      mSpan.popEnd();
      removeAndRecycleView(localView, paramRecycler);
    }
  }
  
  private void recycleFromStart(RecyclerView.Recycler paramRecycler, int paramInt)
  {
    while (getChildCount() > 0)
    {
      int i = 0;
      View localView = getChildAt(0);
      if ((mPrimaryOrientation.getDecoratedEnd(localView) > paramInt) || (mPrimaryOrientation.getTransformedEndWithDecoration(localView) > paramInt)) {
        break;
      }
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (mFullSpan)
      {
        int k;
        for (int j = 0;; j++)
        {
          k = i;
          if (j >= mSpanCount) {
            break;
          }
          if (mSpans[j].mViews.size() == 1) {
            return;
          }
        }
        while (k < mSpanCount)
        {
          mSpans[k].popStart();
          k++;
        }
      }
      if (mSpan.mViews.size() == 1) {
        return;
      }
      mSpan.popStart();
      removeAndRecycleView(localView, paramRecycler);
    }
  }
  
  private void repositionToWrapContentIfNecessary()
  {
    if (mSecondaryOrientation.getMode() == 1073741824) {
      return;
    }
    float f1 = 0.0F;
    int i = getChildCount();
    int j = 0;
    View localView;
    for (int k = 0; k < i; k++)
    {
      localView = getChildAt(k);
      float f2 = mSecondaryOrientation.getDecoratedMeasurement(localView);
      if (f2 >= f1)
      {
        float f3 = f2;
        if (((LayoutParams)localView.getLayoutParams()).isFullSpan()) {
          f3 = f2 * 1.0F / mSpanCount;
        }
        f1 = Math.max(f1, f3);
      }
    }
    int m = mSizePerSpan;
    int n = Math.round(f1 * mSpanCount);
    k = n;
    if (mSecondaryOrientation.getMode() == Integer.MIN_VALUE) {
      k = Math.min(n, mSecondaryOrientation.getTotalSpace());
    }
    updateMeasureSpecs(k);
    k = j;
    if (mSizePerSpan == m) {
      return;
    }
    while (k < i)
    {
      localView = getChildAt(k);
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (!mFullSpan) {
        if ((isLayoutRTL()) && (mOrientation == 1))
        {
          j = mSpanCount;
          n = mSpan.mIndex;
          localView.offsetLeftAndRight(-(j - 1 - n) * mSizePerSpan - -(j - 1 - n) * m);
        }
        else
        {
          n = mSpan.mIndex;
          j = mSizePerSpan * n;
          n *= m;
          if (mOrientation == 1) {
            localView.offsetLeftAndRight(j - n);
          } else {
            localView.offsetTopAndBottom(j - n);
          }
        }
      }
      k++;
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
  
  private void setLayoutStateDirection(int paramInt)
  {
    LayoutState localLayoutState = mLayoutState;
    mLayoutDirection = paramInt;
    boolean bool1 = mShouldReverseLayout;
    int i = 1;
    boolean bool2;
    if (paramInt == -1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    if (bool1 == bool2) {
      paramInt = i;
    } else {
      paramInt = -1;
    }
    mItemDirection = paramInt;
  }
  
  private void updateAllRemainingSpans(int paramInt1, int paramInt2)
  {
    for (int i = 0; i < mSpanCount; i++) {
      if (!mSpans[i].mViews.isEmpty()) {
        updateRemainingSpans(mSpans[i], paramInt1, paramInt2);
      }
    }
  }
  
  private boolean updateAnchorFromChildren(RecyclerView.State paramState, AnchorInfo paramAnchorInfo)
  {
    int i;
    if (mLastLayoutFromEnd) {
      i = findLastReferenceChildPosition(paramState.getItemCount());
    } else {
      i = findFirstReferenceChildPosition(paramState.getItemCount());
    }
    mPosition = i;
    mOffset = Integer.MIN_VALUE;
    return true;
  }
  
  private void updateLayoutState(int paramInt, RecyclerView.State paramState)
  {
    LayoutState localLayoutState = mLayoutState;
    boolean bool1 = false;
    mAvailable = 0;
    mCurrentPosition = paramInt;
    if (isSmoothScrolling())
    {
      i = paramState.getTargetScrollPosition();
      if (i != -1)
      {
        boolean bool2 = mShouldReverseLayout;
        if (i < paramInt) {
          bool3 = true;
        } else {
          bool3 = false;
        }
        if (bool2 == bool3)
        {
          paramInt = mPrimaryOrientation.getTotalSpace();
          i = 0;
          break label98;
        }
        i = mPrimaryOrientation.getTotalSpace();
        paramInt = 0;
        break label98;
      }
    }
    paramInt = 0;
    int i = paramInt;
    label98:
    if (getClipToPadding())
    {
      mLayoutState.mStartLine = (mPrimaryOrientation.getStartAfterPadding() - i);
      mLayoutState.mEndLine = (mPrimaryOrientation.getEndAfterPadding() + paramInt);
    }
    else
    {
      mLayoutState.mEndLine = (mPrimaryOrientation.getEnd() + paramInt);
      mLayoutState.mStartLine = (-i);
    }
    paramState = mLayoutState;
    mStopInFocusable = false;
    mRecycle = true;
    boolean bool3 = bool1;
    if (mPrimaryOrientation.getMode() == 0)
    {
      bool3 = bool1;
      if (mPrimaryOrientation.getEnd() == 0) {
        bool3 = true;
      }
    }
    mInfinite = bool3;
  }
  
  private void updateRemainingSpans(Span paramSpan, int paramInt1, int paramInt2)
  {
    int i = paramSpan.getDeletedSize();
    if (paramInt1 == -1)
    {
      if (paramSpan.getStartLine() + i <= paramInt2) {
        mRemainingSpans.set(mIndex, false);
      }
    }
    else if (paramSpan.getEndLine() - i >= paramInt2) {
      mRemainingSpans.set(mIndex, false);
    }
  }
  
  private int updateSpecWithExtra(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      return paramInt1;
    }
    int i = View.MeasureSpec.getMode(paramInt1);
    if ((i != Integer.MIN_VALUE) && (i != 1073741824)) {
      return paramInt1;
    }
    return View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), i);
  }
  
  public boolean areAllEndsEqual()
  {
    int i = mSpans[0].getEndLine(Integer.MIN_VALUE);
    for (int j = 1; j < mSpanCount; j++) {
      if (mSpans[j].getEndLine(Integer.MIN_VALUE) != i) {
        return false;
      }
    }
    return true;
  }
  
  public boolean areAllStartsEqual()
  {
    int i = mSpans[0].getStartLine(Integer.MIN_VALUE);
    for (int j = 1; j < mSpanCount; j++) {
      if (mSpans[j].getStartLine(Integer.MIN_VALUE) != i) {
        return false;
      }
    }
    return true;
  }
  
  public void assertNotInLayoutOrScroll(String paramString)
  {
    if (mPendingSavedState == null) {
      super.assertNotInLayoutOrScroll(paramString);
    }
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
  
  public boolean checkForGaps()
  {
    if ((getChildCount() != 0) && (mGapStrategy != 0) && (isAttachedToWindow()))
    {
      int i;
      int j;
      if (mShouldReverseLayout)
      {
        i = getLastChildPosition();
        j = getFirstChildPosition();
      }
      else
      {
        i = getFirstChildPosition();
        j = getLastChildPosition();
      }
      if ((i == 0) && (hasGapsToFix() != null))
      {
        mLazySpanLookup.clear();
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
      }
      if (!mLaidOutInvalidFullSpan) {
        return false;
      }
      int k;
      if (mShouldReverseLayout) {
        k = -1;
      } else {
        k = 1;
      }
      Object localObject = mLazySpanLookup;
      j++;
      localObject = ((LazySpanLookup)localObject).getFirstFullSpanItemInRange(i, j, k, true);
      if (localObject == null)
      {
        mLaidOutInvalidFullSpan = false;
        mLazySpanLookup.forceInvalidateAfter(j);
        return false;
      }
      StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = mLazySpanLookup.getFirstFullSpanItemInRange(i, mPosition, k * -1, true);
      if (localFullSpanItem == null) {
        mLazySpanLookup.forceInvalidateAfter(mPosition);
      } else {
        mLazySpanLookup.forceInvalidateAfter(mPosition + 1);
      }
      requestSimpleAnimationsInNextLayout();
      requestLayout();
      return true;
    }
    return false;
  }
  
  public boolean checkLayoutParams(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public void collectAdjacentPrefetchPositions(int paramInt1, int paramInt2, RecyclerView.State paramState, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry)
  {
    if (mOrientation != 0) {
      paramInt1 = paramInt2;
    }
    if ((getChildCount() != 0) && (paramInt1 != 0))
    {
      prepareLayoutStateForDelta(paramInt1, paramState);
      Object localObject = mPrefetchDistances;
      if ((localObject == null) || (localObject.length < mSpanCount)) {
        mPrefetchDistances = new int[mSpanCount];
      }
      int i = 0;
      paramInt2 = 0;
      int k;
      for (paramInt1 = paramInt2; paramInt2 < mSpanCount; paramInt1 = k)
      {
        localObject = mLayoutState;
        int j;
        if (mItemDirection == -1)
        {
          j = mStartLine;
          k = mSpans[paramInt2].getStartLine(j);
        }
        else
        {
          j = mSpans[paramInt2].getEndLine(mEndLine);
          k = mLayoutState.mEndLine;
        }
        j -= k;
        k = paramInt1;
        if (j >= 0)
        {
          mPrefetchDistances[paramInt1] = j;
          k = paramInt1 + 1;
        }
        paramInt2++;
      }
      Arrays.sort(mPrefetchDistances, 0, paramInt1);
      for (paramInt2 = i; (paramInt2 < paramInt1) && (mLayoutState.hasMore(paramState)); paramInt2++)
      {
        paramLayoutPrefetchRegistry.addPosition(mLayoutState.mCurrentPosition, mPrefetchDistances[paramInt2]);
        localObject = mLayoutState;
        mCurrentPosition += mItemDirection;
      }
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
    paramInt = calculateScrollDirectionForPosition(paramInt);
    PointF localPointF = new PointF();
    if (paramInt == 0) {
      return null;
    }
    if (mOrientation == 0)
    {
      x = paramInt;
      y = 0.0F;
    }
    else
    {
      x = 0.0F;
      y = paramInt;
    }
    return localPointF;
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
  
  public int[] findFirstCompletelyVisibleItemPositions(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      paramArrayOfInt = new int[mSpanCount];
    } else {
      if (paramArrayOfInt.length < mSpanCount) {
        break label53;
      }
    }
    for (int i = 0; i < mSpanCount; i++) {
      paramArrayOfInt[i] = mSpans[i].findFirstCompletelyVisibleItemPosition();
    }
    return paramArrayOfInt;
    label53:
    StringBuilder localStringBuilder = z2.t("Provided int[]'s size must be more than or equal to span count. Expected:");
    localStringBuilder.append(mSpanCount);
    localStringBuilder.append(", array size:");
    localStringBuilder.append(paramArrayOfInt.length);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public View findFirstVisibleItemClosestToEnd(boolean paramBoolean)
  {
    int i = mPrimaryOrientation.getStartAfterPadding();
    int j = mPrimaryOrientation.getEndAfterPadding();
    int k = getChildCount() - 1;
    Object localObject2;
    for (Object localObject1 = null; k >= 0; localObject1 = localObject2)
    {
      View localView = getChildAt(k);
      int m = mPrimaryOrientation.getDecoratedStart(localView);
      int n = mPrimaryOrientation.getDecoratedEnd(localView);
      localObject2 = localObject1;
      if (n > i) {
        if (m >= j)
        {
          localObject2 = localObject1;
        }
        else if ((n > j) && (paramBoolean))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = localView;
          }
        }
        else
        {
          return localView;
        }
      }
      k--;
    }
    return (View)localObject1;
  }
  
  public View findFirstVisibleItemClosestToStart(boolean paramBoolean)
  {
    int i = mPrimaryOrientation.getStartAfterPadding();
    int j = mPrimaryOrientation.getEndAfterPadding();
    int k = getChildCount();
    Object localObject1 = null;
    int m = 0;
    while (m < k)
    {
      View localView = getChildAt(m);
      int n = mPrimaryOrientation.getDecoratedStart(localView);
      Object localObject2 = localObject1;
      if (mPrimaryOrientation.getDecoratedEnd(localView) > i) {
        if (n >= j)
        {
          localObject2 = localObject1;
        }
        else if ((n < i) && (paramBoolean))
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = localView;
          }
        }
        else
        {
          return localView;
        }
      }
      m++;
      localObject1 = localObject2;
    }
    return (View)localObject1;
  }
  
  public int findFirstVisibleItemPositionInt()
  {
    View localView;
    if (mShouldReverseLayout) {
      localView = findFirstVisibleItemClosestToEnd(true);
    } else {
      localView = findFirstVisibleItemClosestToStart(true);
    }
    int i;
    if (localView == null) {
      i = -1;
    } else {
      i = getPosition(localView);
    }
    return i;
  }
  
  public int[] findFirstVisibleItemPositions(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      paramArrayOfInt = new int[mSpanCount];
    } else {
      if (paramArrayOfInt.length < mSpanCount) {
        break label53;
      }
    }
    for (int i = 0; i < mSpanCount; i++) {
      paramArrayOfInt[i] = mSpans[i].findFirstVisibleItemPosition();
    }
    return paramArrayOfInt;
    label53:
    StringBuilder localStringBuilder = z2.t("Provided int[]'s size must be more than or equal to span count. Expected:");
    localStringBuilder.append(mSpanCount);
    localStringBuilder.append(", array size:");
    localStringBuilder.append(paramArrayOfInt.length);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public int[] findLastCompletelyVisibleItemPositions(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      paramArrayOfInt = new int[mSpanCount];
    } else {
      if (paramArrayOfInt.length < mSpanCount) {
        break label53;
      }
    }
    for (int i = 0; i < mSpanCount; i++) {
      paramArrayOfInt[i] = mSpans[i].findLastCompletelyVisibleItemPosition();
    }
    return paramArrayOfInt;
    label53:
    StringBuilder localStringBuilder = z2.t("Provided int[]'s size must be more than or equal to span count. Expected:");
    localStringBuilder.append(mSpanCount);
    localStringBuilder.append(", array size:");
    localStringBuilder.append(paramArrayOfInt.length);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public int[] findLastVisibleItemPositions(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {
      paramArrayOfInt = new int[mSpanCount];
    } else {
      if (paramArrayOfInt.length < mSpanCount) {
        break label53;
      }
    }
    for (int i = 0; i < mSpanCount; i++) {
      paramArrayOfInt[i] = mSpans[i].findLastVisibleItemPosition();
    }
    return paramArrayOfInt;
    label53:
    StringBuilder localStringBuilder = z2.t("Provided int[]'s size must be more than or equal to span count. Expected:");
    localStringBuilder.append(mSpanCount);
    localStringBuilder.append(", array size:");
    localStringBuilder.append(paramArrayOfInt.length);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public RecyclerView.LayoutParams generateDefaultLayoutParams()
  {
    if (mOrientation == 0) {
      return new LayoutParams(-2, -1);
    }
    return new LayoutParams(-1, -2);
  }
  
  public RecyclerView.LayoutParams generateLayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new LayoutParams(paramContext, paramAttributeSet);
  }
  
  public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new LayoutParams(paramLayoutParams);
  }
  
  public int getFirstChildPosition()
  {
    int i = getChildCount();
    int j = 0;
    if (i != 0) {
      j = getPosition(getChildAt(0));
    }
    return j;
  }
  
  public int getGapStrategy()
  {
    return mGapStrategy;
  }
  
  public int getLastChildPosition()
  {
    int i = getChildCount();
    if (i == 0) {
      i = 0;
    } else {
      i = getPosition(getChildAt(i - 1));
    }
    return i;
  }
  
  public int getOrientation()
  {
    return mOrientation;
  }
  
  public boolean getReverseLayout()
  {
    return mReverseLayout;
  }
  
  public int getSpanCount()
  {
    return mSpanCount;
  }
  
  public View hasGapsToFix()
  {
    int i = getChildCount() - 1;
    BitSet localBitSet = new BitSet(mSpanCount);
    localBitSet.set(0, mSpanCount, true);
    int j = mOrientation;
    int k = -1;
    if ((j == 1) && (isLayoutRTL())) {
      j = 1;
    } else {
      j = -1;
    }
    int m;
    if (mShouldReverseLayout)
    {
      m = -1;
    }
    else
    {
      m = i + 1;
      i = 0;
    }
    int n = i;
    if (i < m)
    {
      k = 1;
      n = i;
    }
    while (n != m)
    {
      View localView = getChildAt(n);
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (localBitSet.get(mSpan.mIndex))
      {
        if (checkSpanForGap(mSpan)) {
          return localView;
        }
        localBitSet.clear(mSpan.mIndex);
      }
      if (!mFullSpan)
      {
        i = n + k;
        if (i != m)
        {
          Object localObject = getChildAt(i);
          int i1;
          if (mShouldReverseLayout)
          {
            i = mPrimaryOrientation.getDecoratedEnd(localView);
            i1 = mPrimaryOrientation.getDecoratedEnd((View)localObject);
            if (i < i1) {
              return localView;
            }
            if (i != i1) {
              break label275;
            }
          }
          else
          {
            i = mPrimaryOrientation.getDecoratedStart(localView);
            i1 = mPrimaryOrientation.getDecoratedStart((View)localObject);
            if (i > i1) {
              return localView;
            }
            if (i != i1) {
              break label275;
            }
          }
          i = 1;
          break label277;
          label275:
          i = 0;
          label277:
          if (i != 0)
          {
            localObject = (LayoutParams)((View)localObject).getLayoutParams();
            if (mSpan.mIndex - mSpan.mIndex < 0) {
              i = 1;
            } else {
              i = 0;
            }
            if (j < 0) {
              i1 = 1;
            } else {
              i1 = 0;
            }
            if (i != i1) {
              return localView;
            }
          }
        }
      }
      n += k;
    }
    return null;
  }
  
  public void invalidateSpanAssignments()
  {
    mLazySpanLookup.clear();
    requestLayout();
  }
  
  public boolean isAutoMeasureEnabled()
  {
    boolean bool;
    if (mGapStrategy != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
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
  
  public void offsetChildrenHorizontal(int paramInt)
  {
    super.offsetChildrenHorizontal(paramInt);
    for (int i = 0; i < mSpanCount; i++) {
      mSpans[i].onOffset(paramInt);
    }
  }
  
  public void offsetChildrenVertical(int paramInt)
  {
    super.offsetChildrenVertical(paramInt);
    for (int i = 0; i < mSpanCount; i++) {
      mSpans[i].onOffset(paramInt);
    }
  }
  
  public void onAdapterChanged(@Nullable RecyclerView.Adapter paramAdapter1, @Nullable RecyclerView.Adapter paramAdapter2)
  {
    mLazySpanLookup.clear();
    for (int i = 0; i < mSpanCount; i++) {
      mSpans[i].clear();
    }
  }
  
  public void onDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
  {
    super.onDetachedFromWindow(paramRecyclerView, paramRecycler);
    removeCallbacks(mCheckForGapsRunnable);
    for (int i = 0; i < mSpanCount; i++) {
      mSpans[i].clear();
    }
    paramRecyclerView.requestLayout();
  }
  
  @Nullable
  public View onFocusSearchFailed(View paramView, int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (getChildCount() == 0) {
      return null;
    }
    paramView = findContainingItemView(paramView);
    if (paramView == null) {
      return null;
    }
    resolveShouldLayoutReverse();
    int i = convertFocusDirectionToLayoutDirection(paramInt);
    if (i == Integer.MIN_VALUE) {
      return null;
    }
    Object localObject = (LayoutParams)paramView.getLayoutParams();
    boolean bool1 = mFullSpan;
    localObject = mSpan;
    if (i == 1) {
      paramInt = getLastChildPosition();
    } else {
      paramInt = getFirstChildPosition();
    }
    updateLayoutState(paramInt, paramState);
    setLayoutStateDirection(i);
    LayoutState localLayoutState = mLayoutState;
    mCurrentPosition = (mItemDirection + paramInt);
    mAvailable = ((int)(mPrimaryOrientation.getTotalSpace() * 0.33333334F));
    localLayoutState = mLayoutState;
    mStopInFocusable = true;
    int j = 0;
    mRecycle = false;
    fill(paramRecycler, localLayoutState, paramState);
    mLastLayoutFromEnd = mShouldReverseLayout;
    if (!bool1)
    {
      paramRecycler = ((Span)localObject).getFocusableViewAfter(paramInt, i);
      if ((paramRecycler != null) && (paramRecycler != paramView)) {
        return paramRecycler;
      }
    }
    if (preferLastSpan(i)) {
      for (k = mSpanCount - 1; k >= 0; k--)
      {
        paramRecycler = mSpans[k].getFocusableViewAfter(paramInt, i);
        if ((paramRecycler != null) && (paramRecycler != paramView)) {
          return paramRecycler;
        }
      }
    }
    for (int k = 0; k < mSpanCount; k++)
    {
      paramRecycler = mSpans[k].getFocusableViewAfter(paramInt, i);
      if ((paramRecycler != null) && (paramRecycler != paramView)) {
        return paramRecycler;
      }
    }
    boolean bool2 = mReverseLayout;
    if (i == -1) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if ((bool2 ^ true) == paramInt) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    if (!bool1)
    {
      if (paramInt != 0) {
        k = ((Span)localObject).findFirstPartiallyVisibleItemPosition();
      } else {
        k = ((Span)localObject).findLastPartiallyVisibleItemPosition();
      }
      paramRecycler = findViewByPosition(k);
      if ((paramRecycler != null) && (paramRecycler != paramView)) {
        return paramRecycler;
      }
    }
    k = j;
    if (preferLastSpan(i)) {
      for (k = mSpanCount - 1; k >= 0; k--) {
        if (k != mIndex)
        {
          if (paramInt != 0) {
            j = mSpans[k].findFirstPartiallyVisibleItemPosition();
          } else {
            j = mSpans[k].findLastPartiallyVisibleItemPosition();
          }
          paramRecycler = findViewByPosition(j);
          if ((paramRecycler != null) && (paramRecycler != paramView)) {
            return paramRecycler;
          }
        }
      }
    }
    while (k < mSpanCount)
    {
      if (paramInt != 0) {
        j = mSpans[k].findFirstPartiallyVisibleItemPosition();
      } else {
        j = mSpans[k].findLastPartiallyVisibleItemPosition();
      }
      paramRecycler = findViewByPosition(j);
      if ((paramRecycler != null) && (paramRecycler != paramView)) {
        return paramRecycler;
      }
      k++;
    }
    return null;
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    if (getChildCount() > 0)
    {
      View localView1 = findFirstVisibleItemClosestToStart(false);
      View localView2 = findFirstVisibleItemClosestToEnd(false);
      if ((localView1 != null) && (localView2 != null))
      {
        int i = getPosition(localView1);
        int j = getPosition(localView2);
        if (i < j)
        {
          paramAccessibilityEvent.setFromIndex(i);
          paramAccessibilityEvent.setToIndex(j);
        }
        else
        {
          paramAccessibilityEvent.setFromIndex(j);
          paramAccessibilityEvent.setToIndex(i);
        }
      }
    }
  }
  
  public void onItemsAdded(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    handleUpdate(paramInt1, paramInt2, 1);
  }
  
  public void onItemsChanged(RecyclerView paramRecyclerView)
  {
    mLazySpanLookup.clear();
    requestLayout();
  }
  
  public void onItemsMoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    handleUpdate(paramInt1, paramInt2, 8);
  }
  
  public void onItemsRemoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    handleUpdate(paramInt1, paramInt2, 2);
  }
  
  public void onItemsUpdated(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    handleUpdate(paramInt1, paramInt2, 4);
  }
  
  public void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    onLayoutChildren(paramRecycler, paramState, true);
  }
  
  public void onLayoutCompleted(RecyclerView.State paramState)
  {
    super.onLayoutCompleted(paramState);
    mPendingScrollPosition = -1;
    mPendingScrollPositionOffset = Integer.MIN_VALUE;
    mPendingSavedState = null;
    mAnchorInfo.reset();
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof SavedState))
    {
      paramParcelable = (SavedState)paramParcelable;
      mPendingSavedState = paramParcelable;
      if (mPendingScrollPosition != -1)
      {
        paramParcelable.invalidateAnchorPositionInfo();
        mPendingSavedState.invalidateSpanInfo();
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
    mReverseLayout = mReverseLayout;
    mAnchorLayoutFromEnd = mLastLayoutFromEnd;
    mLastLayoutRTL = mLastLayoutRTL;
    LazySpanLookup localLazySpanLookup = mLazySpanLookup;
    int i = 0;
    if (localLazySpanLookup != null)
    {
      int[] arrayOfInt = mData;
      if (arrayOfInt != null)
      {
        mSpanLookup = arrayOfInt;
        mSpanLookupSize = arrayOfInt.length;
        mFullSpanItems = mFullSpanItems;
        break label102;
      }
    }
    mSpanLookupSize = 0;
    label102:
    if (getChildCount() > 0)
    {
      if (mLastLayoutFromEnd) {
        j = getLastChildPosition();
      } else {
        j = getFirstChildPosition();
      }
      mAnchorPosition = j;
      mVisibleAnchorPosition = findFirstVisibleItemPositionInt();
      int j = mSpanCount;
      mSpanOffsetsSize = j;
      mSpanOffsets = new int[j];
      while (i < mSpanCount)
      {
        int k;
        if (mLastLayoutFromEnd)
        {
          k = mSpans[i].getEndLine(Integer.MIN_VALUE);
          j = k;
          if (k == Integer.MIN_VALUE) {
            break label256;
          }
          j = mPrimaryOrientation.getEndAfterPadding();
        }
        else
        {
          k = mSpans[i].getStartLine(Integer.MIN_VALUE);
          j = k;
          if (k == Integer.MIN_VALUE) {
            break label256;
          }
          j = mPrimaryOrientation.getStartAfterPadding();
        }
        j = k - j;
        label256:
        mSpanOffsets[i] = j;
        i++;
      }
    }
    mAnchorPosition = -1;
    mVisibleAnchorPosition = -1;
    mSpanOffsetsSize = 0;
    return localSavedState;
  }
  
  public void onScrollStateChanged(int paramInt)
  {
    if (paramInt == 0) {
      checkForGaps();
    }
  }
  
  public void prepareLayoutStateForDelta(int paramInt, RecyclerView.State paramState)
  {
    int i;
    int j;
    if (paramInt > 0)
    {
      i = getLastChildPosition();
      j = 1;
    }
    else
    {
      i = getFirstChildPosition();
      j = -1;
    }
    mLayoutState.mRecycle = true;
    updateLayoutState(i, paramState);
    setLayoutStateDirection(j);
    paramState = mLayoutState;
    mCurrentPosition = (i + mItemDirection);
    mAvailable = Math.abs(paramInt);
  }
  
  public int scrollBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if ((getChildCount() != 0) && (paramInt != 0))
    {
      prepareLayoutStateForDelta(paramInt, paramState);
      int i = fill(paramRecycler, mLayoutState, paramState);
      if (mLayoutState.mAvailable >= i) {
        if (paramInt < 0) {
          paramInt = -i;
        } else {
          paramInt = i;
        }
      }
      mPrimaryOrientation.offsetChildren(-paramInt);
      mLastLayoutFromEnd = mShouldReverseLayout;
      paramState = mLayoutState;
      mAvailable = 0;
      recycle(paramRecycler, paramState);
      return paramInt;
    }
    return 0;
  }
  
  public int scrollHorizontallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return scrollBy(paramInt, paramRecycler, paramState);
  }
  
  public void scrollToPosition(int paramInt)
  {
    SavedState localSavedState = mPendingSavedState;
    if ((localSavedState != null) && (mAnchorPosition != paramInt)) {
      localSavedState.invalidateAnchorPositionInfo();
    }
    mPendingScrollPosition = paramInt;
    mPendingScrollPositionOffset = Integer.MIN_VALUE;
    requestLayout();
  }
  
  public void scrollToPositionWithOffset(int paramInt1, int paramInt2)
  {
    SavedState localSavedState = mPendingSavedState;
    if (localSavedState != null) {
      localSavedState.invalidateAnchorPositionInfo();
    }
    mPendingScrollPosition = paramInt1;
    mPendingScrollPositionOffset = paramInt2;
    requestLayout();
  }
  
  public int scrollVerticallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return scrollBy(paramInt, paramRecycler, paramState);
  }
  
  public void setGapStrategy(int paramInt)
  {
    assertNotInLayoutOrScroll(null);
    if (paramInt == mGapStrategy) {
      return;
    }
    if ((paramInt != 0) && (paramInt != 2)) {
      throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
    }
    mGapStrategy = paramInt;
    requestLayout();
  }
  
  public void setMeasuredDimension(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = getPaddingLeft();
    i = getPaddingRight() + i;
    int j = getPaddingTop();
    j = getPaddingBottom() + j;
    if (mOrientation == 1)
    {
      paramInt2 = RecyclerView.LayoutManager.chooseSize(paramInt2, paramRect.height() + j, getMinimumHeight());
      i = RecyclerView.LayoutManager.chooseSize(paramInt1, mSizePerSpan * mSpanCount + i, getMinimumWidth());
      paramInt1 = paramInt2;
      paramInt2 = i;
    }
    else
    {
      paramInt1 = RecyclerView.LayoutManager.chooseSize(paramInt1, paramRect.width() + i, getMinimumWidth());
      i = RecyclerView.LayoutManager.chooseSize(paramInt2, mSizePerSpan * mSpanCount + j, getMinimumHeight());
      paramInt2 = paramInt1;
      paramInt1 = i;
    }
    setMeasuredDimension(paramInt2, paramInt1);
  }
  
  public void setOrientation(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("invalid orientation.");
    }
    assertNotInLayoutOrScroll(null);
    if (paramInt == mOrientation) {
      return;
    }
    mOrientation = paramInt;
    OrientationHelper localOrientationHelper = mPrimaryOrientation;
    mPrimaryOrientation = mSecondaryOrientation;
    mSecondaryOrientation = localOrientationHelper;
    requestLayout();
  }
  
  public void setReverseLayout(boolean paramBoolean)
  {
    assertNotInLayoutOrScroll(null);
    SavedState localSavedState = mPendingSavedState;
    if ((localSavedState != null) && (mReverseLayout != paramBoolean)) {
      mReverseLayout = paramBoolean;
    }
    mReverseLayout = paramBoolean;
    requestLayout();
  }
  
  public void setSpanCount(int paramInt)
  {
    assertNotInLayoutOrScroll(null);
    if (paramInt != mSpanCount)
    {
      invalidateSpanAssignments();
      mSpanCount = paramInt;
      mRemainingSpans = new BitSet(mSpanCount);
      mSpans = new Span[mSpanCount];
      for (paramInt = 0; paramInt < mSpanCount; paramInt++) {
        mSpans[paramInt] = new Span(paramInt);
      }
      requestLayout();
    }
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
    if (mPendingSavedState == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean updateAnchorFromPendingData(RecyclerView.State paramState, AnchorInfo paramAnchorInfo)
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
          paramState = mPendingSavedState;
          if ((paramState != null) && (mAnchorPosition != -1) && (mSpanOffsetsSize >= 1))
          {
            mOffset = Integer.MIN_VALUE;
            mPosition = mPendingScrollPosition;
          }
          else
          {
            paramState = findViewByPosition(mPendingScrollPosition);
            if (paramState != null)
            {
              if (mShouldReverseLayout) {
                i = getLastChildPosition();
              } else {
                i = getFirstChildPosition();
              }
              mPosition = i;
              if (mPendingScrollPositionOffset != Integer.MIN_VALUE)
              {
                if (mLayoutFromEnd) {
                  mOffset = (mPrimaryOrientation.getEndAfterPadding() - mPendingScrollPositionOffset - mPrimaryOrientation.getDecoratedEnd(paramState));
                } else {
                  mOffset = (mPrimaryOrientation.getStartAfterPadding() + mPendingScrollPositionOffset - mPrimaryOrientation.getDecoratedStart(paramState));
                }
                return true;
              }
              if (mPrimaryOrientation.getDecoratedMeasurement(paramState) > mPrimaryOrientation.getTotalSpace())
              {
                if (mLayoutFromEnd) {
                  i = mPrimaryOrientation.getEndAfterPadding();
                } else {
                  i = mPrimaryOrientation.getStartAfterPadding();
                }
                mOffset = i;
                return true;
              }
              i = mPrimaryOrientation.getDecoratedStart(paramState) - mPrimaryOrientation.getStartAfterPadding();
              if (i < 0)
              {
                mOffset = (-i);
                return true;
              }
              i = mPrimaryOrientation.getEndAfterPadding() - mPrimaryOrientation.getDecoratedEnd(paramState);
              if (i < 0)
              {
                mOffset = i;
                return true;
              }
              mOffset = Integer.MIN_VALUE;
            }
            else
            {
              i = mPendingScrollPosition;
              mPosition = i;
              int j = mPendingScrollPositionOffset;
              if (j == Integer.MIN_VALUE)
              {
                if (calculateScrollDirectionForPosition(i) == 1) {
                  bool2 = true;
                }
                mLayoutFromEnd = bool2;
                paramAnchorInfo.assignCoordinateFromPadding();
              }
              else
              {
                paramAnchorInfo.assignCoordinateFromPadding(j);
              }
              mInvalidateOffsets = true;
            }
          }
          return true;
        }
        mPendingScrollPosition = -1;
        mPendingScrollPositionOffset = Integer.MIN_VALUE;
      }
    }
    return false;
  }
  
  public void updateAnchorInfoForLayout(RecyclerView.State paramState, AnchorInfo paramAnchorInfo)
  {
    if (updateAnchorFromPendingData(paramState, paramAnchorInfo)) {
      return;
    }
    if (updateAnchorFromChildren(paramState, paramAnchorInfo)) {
      return;
    }
    paramAnchorInfo.assignCoordinateFromPadding();
    mPosition = 0;
  }
  
  public void updateMeasureSpecs(int paramInt)
  {
    mSizePerSpan = (paramInt / mSpanCount);
    mFullSizeSpec = View.MeasureSpec.makeMeasureSpec(paramInt, mSecondaryOrientation.getMode());
  }
  
  public class AnchorInfo
  {
    public boolean mInvalidateOffsets;
    public boolean mLayoutFromEnd;
    public int mOffset;
    public int mPosition;
    public int[] mSpanReferenceLines;
    public boolean mValid;
    
    public AnchorInfo()
    {
      reset();
    }
    
    public void assignCoordinateFromPadding()
    {
      int i;
      if (mLayoutFromEnd) {
        i = mPrimaryOrientation.getEndAfterPadding();
      } else {
        i = mPrimaryOrientation.getStartAfterPadding();
      }
      mOffset = i;
    }
    
    public void assignCoordinateFromPadding(int paramInt)
    {
      if (mLayoutFromEnd) {
        mOffset = (mPrimaryOrientation.getEndAfterPadding() - paramInt);
      } else {
        mOffset = (mPrimaryOrientation.getStartAfterPadding() + paramInt);
      }
    }
    
    public void reset()
    {
      mPosition = -1;
      mOffset = Integer.MIN_VALUE;
      mLayoutFromEnd = false;
      mInvalidateOffsets = false;
      mValid = false;
      int[] arrayOfInt = mSpanReferenceLines;
      if (arrayOfInt != null) {
        Arrays.fill(arrayOfInt, -1);
      }
    }
    
    public void saveSpanReferenceLines(StaggeredGridLayoutManager.Span[] paramArrayOfSpan)
    {
      int i = paramArrayOfSpan.length;
      int[] arrayOfInt = mSpanReferenceLines;
      if ((arrayOfInt == null) || (arrayOfInt.length < i)) {
        mSpanReferenceLines = new int[mSpans.length];
      }
      for (int j = 0; j < i; j++) {
        mSpanReferenceLines[j] = paramArrayOfSpan[j].getStartLine(Integer.MIN_VALUE);
      }
    }
  }
  
  public static class LayoutParams
    extends RecyclerView.LayoutParams
  {
    public static final int INVALID_SPAN_ID = -1;
    public boolean mFullSpan;
    public StaggeredGridLayoutManager.Span mSpan;
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public LayoutParams(RecyclerView.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public final int getSpanIndex()
    {
      StaggeredGridLayoutManager.Span localSpan = mSpan;
      if (localSpan == null) {
        return -1;
      }
      return mIndex;
    }
    
    public boolean isFullSpan()
    {
      return mFullSpan;
    }
    
    public void setFullSpan(boolean paramBoolean)
    {
      mFullSpan = paramBoolean;
    }
  }
  
  public static class LazySpanLookup
  {
    private static final int MIN_SIZE = 10;
    public int[] mData;
    public List<FullSpanItem> mFullSpanItems;
    
    private int invalidateFullSpansAfter(int paramInt)
    {
      if (mFullSpanItems == null) {
        return -1;
      }
      FullSpanItem localFullSpanItem = getFullSpanItem(paramInt);
      if (localFullSpanItem != null) {
        mFullSpanItems.remove(localFullSpanItem);
      }
      int i = mFullSpanItems.size();
      for (int j = 0; j < i; j++) {
        if (mFullSpanItems.get(j)).mPosition >= paramInt) {
          break label82;
        }
      }
      j = -1;
      label82:
      if (j != -1)
      {
        localFullSpanItem = (FullSpanItem)mFullSpanItems.get(j);
        mFullSpanItems.remove(j);
        return mPosition;
      }
      return -1;
    }
    
    private void offsetFullSpansForAddition(int paramInt1, int paramInt2)
    {
      Object localObject = mFullSpanItems;
      if (localObject == null) {
        return;
      }
      for (int i = ((List)localObject).size() - 1; i >= 0; i--)
      {
        localObject = (FullSpanItem)mFullSpanItems.get(i);
        int j = mPosition;
        if (j >= paramInt1) {
          mPosition = (j + paramInt2);
        }
      }
    }
    
    private void offsetFullSpansForRemoval(int paramInt1, int paramInt2)
    {
      Object localObject = mFullSpanItems;
      if (localObject == null) {
        return;
      }
      for (int i = ((List)localObject).size() - 1; i >= 0; i--)
      {
        localObject = (FullSpanItem)mFullSpanItems.get(i);
        int j = mPosition;
        if (j >= paramInt1) {
          if (j < paramInt1 + paramInt2) {
            mFullSpanItems.remove(i);
          } else {
            mPosition = (j - paramInt2);
          }
        }
      }
    }
    
    public void addFullSpanItem(FullSpanItem paramFullSpanItem)
    {
      if (mFullSpanItems == null) {
        mFullSpanItems = new ArrayList();
      }
      int i = mFullSpanItems.size();
      for (int j = 0; j < i; j++)
      {
        FullSpanItem localFullSpanItem = (FullSpanItem)mFullSpanItems.get(j);
        if (mPosition == mPosition) {
          mFullSpanItems.remove(j);
        }
        if (mPosition >= mPosition)
        {
          mFullSpanItems.add(j, paramFullSpanItem);
          return;
        }
      }
      mFullSpanItems.add(paramFullSpanItem);
    }
    
    public void clear()
    {
      int[] arrayOfInt = mData;
      if (arrayOfInt != null) {
        Arrays.fill(arrayOfInt, -1);
      }
      mFullSpanItems = null;
    }
    
    public void ensureSize(int paramInt)
    {
      int[] arrayOfInt1 = mData;
      if (arrayOfInt1 == null)
      {
        arrayOfInt1 = new int[Math.max(paramInt, 10) + 1];
        mData = arrayOfInt1;
        Arrays.fill(arrayOfInt1, -1);
      }
      else if (paramInt >= arrayOfInt1.length)
      {
        int[] arrayOfInt2 = new int[sizeForPosition(paramInt)];
        mData = arrayOfInt2;
        System.arraycopy(arrayOfInt1, 0, arrayOfInt2, 0, arrayOfInt1.length);
        arrayOfInt2 = mData;
        Arrays.fill(arrayOfInt2, arrayOfInt1.length, arrayOfInt2.length, -1);
      }
    }
    
    public int forceInvalidateAfter(int paramInt)
    {
      List localList = mFullSpanItems;
      if (localList != null) {
        for (int i = localList.size() - 1; i >= 0; i--) {
          if (mFullSpanItems.get(i)).mPosition >= paramInt) {
            mFullSpanItems.remove(i);
          }
        }
      }
      return invalidateAfter(paramInt);
    }
    
    public FullSpanItem getFirstFullSpanItemInRange(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
    {
      Object localObject = mFullSpanItems;
      if (localObject == null) {
        return null;
      }
      int i = ((List)localObject).size();
      for (int j = 0; j < i; j++)
      {
        localObject = (FullSpanItem)mFullSpanItems.get(j);
        int k = mPosition;
        if (k >= paramInt2) {
          return null;
        }
        if ((k >= paramInt1) && ((paramInt3 == 0) || (mGapDir == paramInt3) || ((paramBoolean) && (mHasUnwantedGapAfter)))) {
          return (FullSpanItem)localObject;
        }
      }
      return null;
    }
    
    public FullSpanItem getFullSpanItem(int paramInt)
    {
      Object localObject = mFullSpanItems;
      if (localObject == null) {
        return null;
      }
      for (int i = ((List)localObject).size() - 1; i >= 0; i--)
      {
        localObject = (FullSpanItem)mFullSpanItems.get(i);
        if (mPosition == paramInt) {
          return (FullSpanItem)localObject;
        }
      }
      return null;
    }
    
    public int getSpan(int paramInt)
    {
      int[] arrayOfInt = mData;
      if ((arrayOfInt != null) && (paramInt < arrayOfInt.length)) {
        return arrayOfInt[paramInt];
      }
      return -1;
    }
    
    public int invalidateAfter(int paramInt)
    {
      int[] arrayOfInt = mData;
      if (arrayOfInt == null) {
        return -1;
      }
      if (paramInt >= arrayOfInt.length) {
        return -1;
      }
      int i = invalidateFullSpansAfter(paramInt);
      if (i == -1)
      {
        arrayOfInt = mData;
        Arrays.fill(arrayOfInt, paramInt, arrayOfInt.length, -1);
        return mData.length;
      }
      i = Math.min(i + 1, mData.length);
      Arrays.fill(mData, paramInt, i, -1);
      return i;
    }
    
    public void offsetForAddition(int paramInt1, int paramInt2)
    {
      int[] arrayOfInt = mData;
      if ((arrayOfInt != null) && (paramInt1 < arrayOfInt.length))
      {
        int i = paramInt1 + paramInt2;
        ensureSize(i);
        arrayOfInt = mData;
        System.arraycopy(arrayOfInt, paramInt1, arrayOfInt, i, arrayOfInt.length - paramInt1 - paramInt2);
        Arrays.fill(mData, paramInt1, i, -1);
        offsetFullSpansForAddition(paramInt1, paramInt2);
      }
    }
    
    public void offsetForRemoval(int paramInt1, int paramInt2)
    {
      int[] arrayOfInt = mData;
      if ((arrayOfInt != null) && (paramInt1 < arrayOfInt.length))
      {
        int i = paramInt1 + paramInt2;
        ensureSize(i);
        arrayOfInt = mData;
        System.arraycopy(arrayOfInt, i, arrayOfInt, paramInt1, arrayOfInt.length - paramInt1 - paramInt2);
        arrayOfInt = mData;
        Arrays.fill(arrayOfInt, arrayOfInt.length - paramInt2, arrayOfInt.length, -1);
        offsetFullSpansForRemoval(paramInt1, paramInt2);
      }
    }
    
    public void setSpan(int paramInt, StaggeredGridLayoutManager.Span paramSpan)
    {
      ensureSize(paramInt);
      mData[paramInt] = mIndex;
    }
    
    public int sizeForPosition(int paramInt)
    {
      int i = mData.length;
      while (i <= paramInt) {
        i *= 2;
      }
      return i;
    }
    
    @SuppressLint({"BanParcelableUsage"})
    public static class FullSpanItem
      implements Parcelable
    {
      public static final Parcelable.Creator<FullSpanItem> CREATOR = new Parcelable.Creator()
      {
        public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem createFromParcel(Parcel paramAnonymousParcel)
        {
          return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem(paramAnonymousParcel);
        }
        
        public StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[] newArray(int paramAnonymousInt)
        {
          return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[paramAnonymousInt];
        }
      };
      public int mGapDir;
      public int[] mGapPerSpan;
      public boolean mHasUnwantedGapAfter;
      public int mPosition;
      
      public FullSpanItem() {}
      
      public FullSpanItem(Parcel paramParcel)
      {
        mPosition = paramParcel.readInt();
        mGapDir = paramParcel.readInt();
        int i = paramParcel.readInt();
        boolean bool = true;
        if (i != 1) {
          bool = false;
        }
        mHasUnwantedGapAfter = bool;
        i = paramParcel.readInt();
        if (i > 0)
        {
          int[] arrayOfInt = new int[i];
          mGapPerSpan = arrayOfInt;
          paramParcel.readIntArray(arrayOfInt);
        }
      }
      
      public int describeContents()
      {
        return 0;
      }
      
      public int getGapForSpan(int paramInt)
      {
        int[] arrayOfInt = mGapPerSpan;
        if (arrayOfInt == null) {
          paramInt = 0;
        } else {
          paramInt = arrayOfInt[paramInt];
        }
        return paramInt;
      }
      
      public String toString()
      {
        StringBuilder localStringBuilder = z2.t("FullSpanItem{mPosition=");
        localStringBuilder.append(mPosition);
        localStringBuilder.append(", mGapDir=");
        localStringBuilder.append(mGapDir);
        localStringBuilder.append(", mHasUnwantedGapAfter=");
        localStringBuilder.append(mHasUnwantedGapAfter);
        localStringBuilder.append(", mGapPerSpan=");
        localStringBuilder.append(Arrays.toString(mGapPerSpan));
        localStringBuilder.append('}');
        return localStringBuilder.toString();
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        paramParcel.writeInt(mPosition);
        paramParcel.writeInt(mGapDir);
        paramParcel.writeInt(mHasUnwantedGapAfter);
        int[] arrayOfInt = mGapPerSpan;
        if ((arrayOfInt != null) && (arrayOfInt.length > 0))
        {
          paramParcel.writeInt(arrayOfInt.length);
          paramParcel.writeIntArray(mGapPerSpan);
        }
        else
        {
          paramParcel.writeInt(0);
        }
      }
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  public static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public StaggeredGridLayoutManager.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new StaggeredGridLayoutManager.SavedState(paramAnonymousParcel);
      }
      
      public StaggeredGridLayoutManager.SavedState[] newArray(int paramAnonymousInt)
      {
        return new StaggeredGridLayoutManager.SavedState[paramAnonymousInt];
      }
    };
    public boolean mAnchorLayoutFromEnd;
    public int mAnchorPosition;
    public List<StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem> mFullSpanItems;
    public boolean mLastLayoutRTL;
    public boolean mReverseLayout;
    public int[] mSpanLookup;
    public int mSpanLookupSize;
    public int[] mSpanOffsets;
    public int mSpanOffsetsSize;
    public int mVisibleAnchorPosition;
    
    public SavedState() {}
    
    public SavedState(Parcel paramParcel)
    {
      mAnchorPosition = paramParcel.readInt();
      mVisibleAnchorPosition = paramParcel.readInt();
      int i = paramParcel.readInt();
      mSpanOffsetsSize = i;
      int[] arrayOfInt;
      if (i > 0)
      {
        arrayOfInt = new int[i];
        mSpanOffsets = arrayOfInt;
        paramParcel.readIntArray(arrayOfInt);
      }
      i = paramParcel.readInt();
      mSpanLookupSize = i;
      if (i > 0)
      {
        arrayOfInt = new int[i];
        mSpanLookup = arrayOfInt;
        paramParcel.readIntArray(arrayOfInt);
      }
      i = paramParcel.readInt();
      boolean bool1 = false;
      if (i == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      mReverseLayout = bool2;
      if (paramParcel.readInt() == 1) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      mAnchorLayoutFromEnd = bool2;
      boolean bool2 = bool1;
      if (paramParcel.readInt() == 1) {
        bool2 = true;
      }
      mLastLayoutRTL = bool2;
      mFullSpanItems = paramParcel.readArrayList(StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.class.getClassLoader());
    }
    
    public SavedState(SavedState paramSavedState)
    {
      mSpanOffsetsSize = mSpanOffsetsSize;
      mAnchorPosition = mAnchorPosition;
      mVisibleAnchorPosition = mVisibleAnchorPosition;
      mSpanOffsets = mSpanOffsets;
      mSpanLookupSize = mSpanLookupSize;
      mSpanLookup = mSpanLookup;
      mReverseLayout = mReverseLayout;
      mAnchorLayoutFromEnd = mAnchorLayoutFromEnd;
      mLastLayoutRTL = mLastLayoutRTL;
      mFullSpanItems = mFullSpanItems;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void invalidateAnchorPositionInfo()
    {
      mSpanOffsets = null;
      mSpanOffsetsSize = 0;
      mAnchorPosition = -1;
      mVisibleAnchorPosition = -1;
    }
    
    public void invalidateSpanInfo()
    {
      mSpanOffsets = null;
      mSpanOffsetsSize = 0;
      mSpanLookupSize = 0;
      mSpanLookup = null;
      mFullSpanItems = null;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeInt(mAnchorPosition);
      paramParcel.writeInt(mVisibleAnchorPosition);
      paramParcel.writeInt(mSpanOffsetsSize);
      if (mSpanOffsetsSize > 0) {
        paramParcel.writeIntArray(mSpanOffsets);
      }
      paramParcel.writeInt(mSpanLookupSize);
      if (mSpanLookupSize > 0) {
        paramParcel.writeIntArray(mSpanLookup);
      }
      paramParcel.writeInt(mReverseLayout);
      paramParcel.writeInt(mAnchorLayoutFromEnd);
      paramParcel.writeInt(mLastLayoutRTL);
      paramParcel.writeList(mFullSpanItems);
    }
  }
  
  public class Span
  {
    public static final int INVALID_LINE = Integer.MIN_VALUE;
    public int mCachedEnd = Integer.MIN_VALUE;
    public int mCachedStart = Integer.MIN_VALUE;
    public int mDeletedSize = 0;
    public final int mIndex;
    public ArrayList<View> mViews = new ArrayList();
    
    public Span(int paramInt)
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
        mDeletedSize = (mPrimaryOrientation.getDecoratedMeasurement(paramView) + i);
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
      if (((paramBoolean) && (i < mPrimaryOrientation.getEndAfterPadding())) || ((!paramBoolean) && (i > mPrimaryOrientation.getStartAfterPadding()))) {
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
      mCachedEnd = mPrimaryOrientation.getDecoratedEnd((View)localObject);
      if (mFullSpan)
      {
        localObject = mLazySpanLookup.getFullSpanItem(localLayoutParams.getViewLayoutPosition());
        if ((localObject != null) && (mGapDir == 1)) {
          mCachedEnd += ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).getGapForSpan(mIndex);
        }
      }
    }
    
    public void calculateCachedStart()
    {
      View localView = (View)mViews.get(0);
      Object localObject = getLayoutParams(localView);
      mCachedStart = mPrimaryOrientation.getDecoratedStart(localView);
      if (mFullSpan)
      {
        localObject = mLazySpanLookup.getFullSpanItem(((RecyclerView.LayoutParams)localObject).getViewLayoutPosition());
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
      if (mReverseLayout) {
        i = findOneVisibleChild(mViews.size() - 1, -1, true);
      } else {
        i = findOneVisibleChild(0, mViews.size(), true);
      }
      return i;
    }
    
    public int findFirstPartiallyVisibleItemPosition()
    {
      int i;
      if (mReverseLayout) {
        i = findOnePartiallyVisibleChild(mViews.size() - 1, -1, true);
      } else {
        i = findOnePartiallyVisibleChild(0, mViews.size(), true);
      }
      return i;
    }
    
    public int findFirstVisibleItemPosition()
    {
      int i;
      if (mReverseLayout) {
        i = findOneVisibleChild(mViews.size() - 1, -1, false);
      } else {
        i = findOneVisibleChild(0, mViews.size(), false);
      }
      return i;
    }
    
    public int findLastCompletelyVisibleItemPosition()
    {
      int i;
      if (mReverseLayout) {
        i = findOneVisibleChild(0, mViews.size(), true);
      } else {
        i = findOneVisibleChild(mViews.size() - 1, -1, true);
      }
      return i;
    }
    
    public int findLastPartiallyVisibleItemPosition()
    {
      int i;
      if (mReverseLayout) {
        i = findOnePartiallyVisibleChild(0, mViews.size(), true);
      } else {
        i = findOnePartiallyVisibleChild(mViews.size() - 1, -1, true);
      }
      return i;
    }
    
    public int findLastVisibleItemPosition()
    {
      int i;
      if (mReverseLayout) {
        i = findOneVisibleChild(0, mViews.size(), false);
      } else {
        i = findOneVisibleChild(mViews.size() - 1, -1, false);
      }
      return i;
    }
    
    public int findOnePartiallyOrCompletelyVisibleChild(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      int i = mPrimaryOrientation.getStartAfterPadding();
      int j = mPrimaryOrientation.getEndAfterPadding();
      int k;
      if (paramInt2 > paramInt1) {
        k = 1;
      } else {
        k = -1;
      }
      while (paramInt1 != paramInt2)
      {
        View localView = (View)mViews.get(paramInt1);
        int m = mPrimaryOrientation.getDecoratedStart(localView);
        int n = mPrimaryOrientation.getDecoratedEnd(localView);
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
              return getPosition(localView);
            }
          }
          else
          {
            if (paramBoolean2) {
              return getPosition(localView);
            }
            if ((m < i) || (n > j)) {
              return getPosition(localView);
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
          localStaggeredGridLayoutManager = StaggeredGridLayoutManager.this;
          if (mReverseLayout)
          {
            localObject1 = localObject2;
            if (localStaggeredGridLayoutManager.getPosition(localView) <= paramInt1) {
              break;
            }
          }
          localObject1 = StaggeredGridLayoutManager.this;
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
        localStaggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        if (mReverseLayout)
        {
          localObject1 = localObject2;
          if (localStaggeredGridLayoutManager.getPosition(localView) >= paramInt1) {
            break;
          }
        }
        localObject1 = StaggeredGridLayoutManager.this;
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
        mDeletedSize -= mPrimaryOrientation.getDecoratedMeasurement(localView);
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
        mDeletedSize -= mPrimaryOrientation.getDecoratedMeasurement(localView);
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
        mDeletedSize = (mPrimaryOrientation.getDecoratedMeasurement(paramView) + i);
      }
    }
    
    public void setLine(int paramInt)
    {
      mCachedStart = paramInt;
      mCachedEnd = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.StaggeredGridLayoutManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */