package androidx.recyclerview.widget;

import a;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat;
import java.util.Arrays;
import z2;

public class GridLayoutManager
  extends LinearLayoutManager
{
  private static final boolean DEBUG = false;
  public static final int DEFAULT_SPAN_COUNT = -1;
  private static final String TAG = "GridLayoutManager";
  public int[] mCachedBorders;
  public final Rect mDecorInsets = new Rect();
  public boolean mPendingSpanCountChange = false;
  public final SparseIntArray mPreLayoutSpanIndexCache = new SparseIntArray();
  public final SparseIntArray mPreLayoutSpanSizeCache = new SparseIntArray();
  public View[] mSet;
  public int mSpanCount = -1;
  public SpanSizeLookup mSpanSizeLookup = new DefaultSpanSizeLookup();
  private boolean mUsingSpansToEstimateScrollBarDimensions;
  
  public GridLayoutManager(Context paramContext, int paramInt)
  {
    super(paramContext);
    setSpanCount(paramInt);
  }
  
  public GridLayoutManager(Context paramContext, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    super(paramContext, paramInt2, paramBoolean);
    setSpanCount(paramInt1);
  }
  
  public GridLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    setSpanCount(getPropertiesspanCount);
  }
  
  private void assignSpans(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt, boolean paramBoolean)
  {
    int i = 0;
    int j = -1;
    int k;
    int m;
    if (paramBoolean)
    {
      k = 1;
      m = 0;
      j = paramInt;
      paramInt = m;
    }
    else
    {
      paramInt--;
      k = -1;
    }
    while (paramInt != j)
    {
      View localView = mSet[paramInt];
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      m = getSpanSize(paramRecycler, paramState, getPosition(localView));
      mSpanSize = m;
      mSpanIndex = i;
      i += m;
      paramInt += k;
    }
  }
  
  private void cachePreLayoutSpanMapping()
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      LayoutParams localLayoutParams = (LayoutParams)getChildAt(j).getLayoutParams();
      int k = localLayoutParams.getViewLayoutPosition();
      mPreLayoutSpanSizeCache.put(k, localLayoutParams.getSpanSize());
      mPreLayoutSpanIndexCache.put(k, localLayoutParams.getSpanIndex());
    }
  }
  
  private void calculateItemBorders(int paramInt)
  {
    mCachedBorders = calculateItemBorders(mCachedBorders, mSpanCount, paramInt);
  }
  
  public static int[] calculateItemBorders(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = 1;
    int[] arrayOfInt;
    if ((paramArrayOfInt != null) && (paramArrayOfInt.length == paramInt1 + 1))
    {
      arrayOfInt = paramArrayOfInt;
      if (paramArrayOfInt[(paramArrayOfInt.length - 1)] == paramInt2) {}
    }
    else
    {
      arrayOfInt = new int[paramInt1 + 1];
    }
    int j = 0;
    arrayOfInt[0] = 0;
    int k = paramInt2 / paramInt1;
    int m = paramInt2 % paramInt1;
    int n = 0;
    paramInt2 = j;
    while (i <= paramInt1)
    {
      paramInt2 += m;
      if ((paramInt2 > 0) && (paramInt1 - paramInt2 < m))
      {
        j = k + 1;
        paramInt2 -= paramInt1;
      }
      else
      {
        j = k;
      }
      n += j;
      arrayOfInt[i] = n;
      i++;
    }
    return arrayOfInt;
  }
  
  private void clearPreLayoutSpanMappingCache()
  {
    mPreLayoutSpanSizeCache.clear();
    mPreLayoutSpanIndexCache.clear();
  }
  
  private int computeScrollOffsetWithSpanInfo(RecyclerView.State paramState)
  {
    if ((getChildCount() != 0) && (paramState.getItemCount() != 0))
    {
      ensureLayoutState();
      boolean bool = isSmoothScrollbarEnabled();
      View localView1 = findFirstVisibleChildClosestToStart(bool ^ true, true);
      View localView2 = findFirstVisibleChildClosestToEnd(bool ^ true, true);
      if ((localView1 != null) && (localView2 != null))
      {
        int i = mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(localView1), mSpanCount);
        int j = mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(localView2), mSpanCount);
        int k = Math.min(i, j);
        i = Math.max(i, j);
        j = mSpanSizeLookup.getCachedSpanGroupIndex(paramState.getItemCount() - 1, mSpanCount);
        if (mShouldReverseLayout) {
          k = Math.max(0, j + 1 - i - 1);
        } else {
          k = Math.max(0, k);
        }
        if (!bool) {
          return k;
        }
        int m = Math.abs(mOrientationHelper.getDecoratedEnd(localView2) - mOrientationHelper.getDecoratedStart(localView1));
        j = mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(localView1), mSpanCount);
        i = mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(localView2), mSpanCount);
        float f = m / (i - j + 1);
        return Math.round(k * f + (mOrientationHelper.getStartAfterPadding() - mOrientationHelper.getDecoratedStart(localView1)));
      }
    }
    return 0;
  }
  
  private int computeScrollRangeWithSpanInfo(RecyclerView.State paramState)
  {
    if ((getChildCount() != 0) && (paramState.getItemCount() != 0))
    {
      ensureLayoutState();
      View localView1 = findFirstVisibleChildClosestToStart(isSmoothScrollbarEnabled() ^ true, true);
      View localView2 = findFirstVisibleChildClosestToEnd(isSmoothScrollbarEnabled() ^ true, true);
      if ((localView1 != null) && (localView2 != null))
      {
        if (!isSmoothScrollbarEnabled()) {
          return mSpanSizeLookup.getCachedSpanGroupIndex(paramState.getItemCount() - 1, mSpanCount) + 1;
        }
        int i = mOrientationHelper.getDecoratedEnd(localView2);
        int j = mOrientationHelper.getDecoratedStart(localView1);
        int k = mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(localView1), mSpanCount);
        int m = mSpanSizeLookup.getCachedSpanGroupIndex(getPosition(localView2), mSpanCount);
        int n = mSpanSizeLookup.getCachedSpanGroupIndex(paramState.getItemCount() - 1, mSpanCount);
        return (int)((i - j) / (m - k + 1) * (n + 1));
      }
    }
    return 0;
  }
  
  private void ensureAnchorIsInCorrectSpan(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, LinearLayoutManager.AnchorInfo paramAnchorInfo, int paramInt)
  {
    if (paramInt == 1) {
      i = 1;
    } else {
      i = 0;
    }
    paramInt = getSpanIndex(paramRecycler, paramState, mPosition);
    if (i != 0) {
      while (paramInt > 0)
      {
        paramInt = mPosition;
        if (paramInt <= 0) {
          break;
        }
        paramInt--;
        mPosition = paramInt;
        paramInt = getSpanIndex(paramRecycler, paramState, paramInt);
      }
    }
    int j = paramState.getItemCount();
    int i = mPosition;
    while (i < j - 1)
    {
      int k = i + 1;
      int m = getSpanIndex(paramRecycler, paramState, k);
      if (m <= paramInt) {
        break;
      }
      i = k;
      paramInt = m;
    }
    mPosition = i;
  }
  
  private void ensureViewSet()
  {
    View[] arrayOfView = mSet;
    if ((arrayOfView == null) || (arrayOfView.length != mSpanCount)) {
      mSet = new View[mSpanCount];
    }
  }
  
  private int getSpanGroupIndex(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt)
  {
    if (!paramState.isPreLayout()) {
      return mSpanSizeLookup.getCachedSpanGroupIndex(paramInt, mSpanCount);
    }
    int i = paramRecycler.convertPreLayoutPositionToPostLayout(paramInt);
    if (i == -1)
    {
      paramRecycler = new StringBuilder();
      paramRecycler.append("Cannot find span size for pre layout position. ");
      paramRecycler.append(paramInt);
      Log.w("GridLayoutManager", paramRecycler.toString());
      return 0;
    }
    return mSpanSizeLookup.getCachedSpanGroupIndex(i, mSpanCount);
  }
  
  private int getSpanIndex(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt)
  {
    if (!paramState.isPreLayout()) {
      return mSpanSizeLookup.getCachedSpanIndex(paramInt, mSpanCount);
    }
    int i = mPreLayoutSpanIndexCache.get(paramInt, -1);
    if (i != -1) {
      return i;
    }
    i = paramRecycler.convertPreLayoutPositionToPostLayout(paramInt);
    if (i == -1)
    {
      paramRecycler = new StringBuilder();
      paramRecycler.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
      paramRecycler.append(paramInt);
      Log.w("GridLayoutManager", paramRecycler.toString());
      return 0;
    }
    return mSpanSizeLookup.getCachedSpanIndex(i, mSpanCount);
  }
  
  private int getSpanSize(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, int paramInt)
  {
    if (!paramState.isPreLayout()) {
      return mSpanSizeLookup.getSpanSize(paramInt);
    }
    int i = mPreLayoutSpanSizeCache.get(paramInt, -1);
    if (i != -1) {
      return i;
    }
    i = paramRecycler.convertPreLayoutPositionToPostLayout(paramInt);
    if (i == -1)
    {
      paramRecycler = new StringBuilder();
      paramRecycler.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
      paramRecycler.append(paramInt);
      Log.w("GridLayoutManager", paramRecycler.toString());
      return 1;
    }
    return mSpanSizeLookup.getSpanSize(i);
  }
  
  private void guessMeasurement(float paramFloat, int paramInt)
  {
    calculateItemBorders(Math.max(Math.round(paramFloat * mSpanCount), paramInt));
  }
  
  private void measureChild(View paramView, int paramInt, boolean paramBoolean)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    Rect localRect = mDecorInsets;
    int i = top + bottom + topMargin + bottomMargin;
    int j = left + right + leftMargin + rightMargin;
    int k = getSpaceForSpanRange(mSpanIndex, mSpanSize);
    if (mOrientation == 1)
    {
      j = RecyclerView.LayoutManager.getChildMeasureSpec(k, paramInt, j, width, false);
      paramInt = RecyclerView.LayoutManager.getChildMeasureSpec(mOrientationHelper.getTotalSpace(), getHeightMode(), i, height, true);
    }
    else
    {
      paramInt = RecyclerView.LayoutManager.getChildMeasureSpec(k, paramInt, i, height, false);
      j = RecyclerView.LayoutManager.getChildMeasureSpec(mOrientationHelper.getTotalSpace(), getWidthMode(), j, width, true);
    }
    measureChildWithDecorationsAndMargin(paramView, j, paramInt, paramBoolean);
  }
  
  private void measureChildWithDecorationsAndMargin(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    if (paramBoolean) {
      paramBoolean = shouldReMeasureChild(paramView, paramInt1, paramInt2, localLayoutParams);
    } else {
      paramBoolean = shouldMeasureChild(paramView, paramInt1, paramInt2, localLayoutParams);
    }
    if (paramBoolean) {
      paramView.measure(paramInt1, paramInt2);
    }
  }
  
  private void updateMeasurements()
  {
    int i;
    int j;
    if (getOrientation() == 1)
    {
      i = getWidth() - getPaddingRight();
      j = getPaddingLeft();
    }
    else
    {
      i = getHeight() - getPaddingBottom();
      j = getPaddingTop();
    }
    calculateItemBorders(i - j);
  }
  
  public boolean checkLayoutParams(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LayoutParams;
  }
  
  public void collectPrefetchPositionsForLayoutState(RecyclerView.State paramState, LinearLayoutManager.LayoutState paramLayoutState, RecyclerView.LayoutManager.LayoutPrefetchRegistry paramLayoutPrefetchRegistry)
  {
    int i = mSpanCount;
    for (int j = 0; (j < mSpanCount) && (paramLayoutState.hasMore(paramState)) && (i > 0); j++)
    {
      int k = mCurrentPosition;
      paramLayoutPrefetchRegistry.addPosition(k, Math.max(0, mScrollingOffset));
      i -= mSpanSizeLookup.getSpanSize(k);
      mCurrentPosition += mItemDirection;
    }
  }
  
  public int computeHorizontalScrollOffset(RecyclerView.State paramState)
  {
    if (mUsingSpansToEstimateScrollBarDimensions) {
      return computeScrollOffsetWithSpanInfo(paramState);
    }
    return super.computeHorizontalScrollOffset(paramState);
  }
  
  public int computeHorizontalScrollRange(RecyclerView.State paramState)
  {
    if (mUsingSpansToEstimateScrollBarDimensions) {
      return computeScrollRangeWithSpanInfo(paramState);
    }
    return super.computeHorizontalScrollRange(paramState);
  }
  
  public int computeVerticalScrollOffset(RecyclerView.State paramState)
  {
    if (mUsingSpansToEstimateScrollBarDimensions) {
      return computeScrollOffsetWithSpanInfo(paramState);
    }
    return super.computeVerticalScrollOffset(paramState);
  }
  
  public int computeVerticalScrollRange(RecyclerView.State paramState)
  {
    if (mUsingSpansToEstimateScrollBarDimensions) {
      return computeScrollRangeWithSpanInfo(paramState);
    }
    return super.computeVerticalScrollRange(paramState);
  }
  
  public View findReferenceChild(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = getChildCount();
    int j = -1;
    int k = 1;
    if (paramBoolean2)
    {
      i = getChildCount() - 1;
      k = -1;
    }
    else
    {
      j = i;
      i = 0;
    }
    int m = paramState.getItemCount();
    ensureLayoutState();
    int n = mOrientationHelper.getStartAfterPadding();
    int i1 = mOrientationHelper.getEndAfterPadding();
    Object localObject1 = null;
    Object localObject4;
    for (Object localObject2 = null; i != j; localObject2 = localObject4)
    {
      View localView = getChildAt(i);
      int i2 = getPosition(localView);
      Object localObject3 = localObject1;
      localObject4 = localObject2;
      if (i2 >= 0)
      {
        localObject3 = localObject1;
        localObject4 = localObject2;
        if (i2 < m) {
          if (getSpanIndex(paramRecycler, paramState, i2) != 0)
          {
            localObject3 = localObject1;
            localObject4 = localObject2;
          }
          else if (((RecyclerView.LayoutParams)localView.getLayoutParams()).isItemRemoved())
          {
            localObject3 = localObject1;
            localObject4 = localObject2;
            if (localObject2 == null)
            {
              localObject4 = localView;
              localObject3 = localObject1;
            }
          }
          else
          {
            if ((mOrientationHelper.getDecoratedStart(localView) < i1) && (mOrientationHelper.getDecoratedEnd(localView) >= n)) {
              return localView;
            }
            localObject3 = localObject1;
            localObject4 = localObject2;
            if (localObject1 == null)
            {
              localObject3 = localView;
              localObject4 = localObject2;
            }
          }
        }
      }
      i += k;
      localObject1 = localObject3;
    }
    if (localObject1 != null) {
      localObject2 = localObject1;
    }
    return (View)localObject2;
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
  
  public int getColumnCountForAccessibility(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (mOrientation == 1) {
      return mSpanCount;
    }
    if (paramState.getItemCount() < 1) {
      return 0;
    }
    return getSpanGroupIndex(paramRecycler, paramState, paramState.getItemCount() - 1) + 1;
  }
  
  public int getRowCountForAccessibility(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (mOrientation == 0) {
      return mSpanCount;
    }
    if (paramState.getItemCount() < 1) {
      return 0;
    }
    return getSpanGroupIndex(paramRecycler, paramState, paramState.getItemCount() - 1) + 1;
  }
  
  public int getSpaceForSpanRange(int paramInt1, int paramInt2)
  {
    if ((mOrientation == 1) && (isLayoutRTL()))
    {
      arrayOfInt = mCachedBorders;
      int i = mSpanCount;
      return arrayOfInt[(i - paramInt1)] - arrayOfInt[(i - paramInt1 - paramInt2)];
    }
    int[] arrayOfInt = mCachedBorders;
    return arrayOfInt[(paramInt2 + paramInt1)] - arrayOfInt[paramInt1];
  }
  
  public int getSpanCount()
  {
    return mSpanCount;
  }
  
  public SpanSizeLookup getSpanSizeLookup()
  {
    return mSpanSizeLookup;
  }
  
  public boolean isUsingSpansToEstimateScrollbarDimensions()
  {
    return mUsingSpansToEstimateScrollBarDimensions;
  }
  
  public void layoutChunk(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, LinearLayoutManager.LayoutState paramLayoutState, LinearLayoutManager.LayoutChunkResult paramLayoutChunkResult)
  {
    int i = mOrientationHelper.getModeInOther();
    int j = 0;
    if (i != 1073741824) {
      k = 1;
    } else {
      k = 0;
    }
    int m;
    if (getChildCount() > 0) {
      m = mCachedBorders[mSpanCount];
    } else {
      m = 0;
    }
    if (k != 0) {
      updateMeasurements();
    }
    boolean bool;
    if (mItemDirection == 1) {
      bool = true;
    } else {
      bool = false;
    }
    int n = mSpanCount;
    if (!bool) {
      n = getSpanIndex(paramRecycler, paramState, mCurrentPosition) + getSpanSize(paramRecycler, paramState, mCurrentPosition);
    }
    int i1 = 0;
    int i2;
    int i3;
    View localView;
    while ((i1 < mSpanCount) && (paramLayoutState.hasMore(paramState)) && (n > 0))
    {
      i2 = mCurrentPosition;
      i3 = getSpanSize(paramRecycler, paramState, i2);
      if (i3 <= mSpanCount)
      {
        n -= i3;
        if (n >= 0)
        {
          localView = paramLayoutState.next(paramRecycler);
          if (localView != null)
          {
            mSet[i1] = localView;
            i1++;
          }
        }
      }
      else
      {
        paramRecycler = new StringBuilder();
        paramRecycler.append("Item at position ");
        paramRecycler.append(i2);
        paramRecycler.append(" requires ");
        paramRecycler.append(i3);
        paramRecycler.append(" spans but GridLayoutManager has only ");
        throw new IllegalArgumentException(z2.q(paramRecycler, mSpanCount, " spans."));
      }
    }
    if (i1 == 0)
    {
      mFinished = true;
      return;
    }
    float f1 = 0.0F;
    assignSpans(paramRecycler, paramState, i1, bool);
    n = 0;
    while (j < i1)
    {
      paramState = mSet[j];
      if (mScrapList == null)
      {
        if (bool) {
          addView(paramState);
        } else {
          addView(paramState, 0);
        }
      }
      else if (bool) {
        addDisappearingView(paramState);
      } else {
        addDisappearingView(paramState, 0);
      }
      calculateItemDecorationsForChild(paramState, mDecorInsets);
      measureChild(paramState, i, false);
      i2 = mOrientationHelper.getDecoratedMeasurement(paramState);
      i3 = n;
      if (i2 > n) {
        i3 = i2;
      }
      paramRecycler = (LayoutParams)paramState.getLayoutParams();
      float f2 = mOrientationHelper.getDecoratedMeasurementInOther(paramState) * 1.0F / mSpanSize;
      float f3 = f1;
      if (f2 > f1) {
        f3 = f2;
      }
      j++;
      n = i3;
      f1 = f3;
    }
    j = n;
    if (k != 0)
    {
      guessMeasurement(f1, m);
      k = 0;
      for (n = 0;; n = j)
      {
        j = n;
        if (k >= i1) {
          break;
        }
        paramRecycler = mSet[k];
        measureChild(paramRecycler, 1073741824, true);
        m = mOrientationHelper.getDecoratedMeasurement(paramRecycler);
        j = n;
        if (m > n) {
          j = m;
        }
        k++;
      }
    }
    for (n = 0; n < i1; n++)
    {
      localView = mSet[n];
      if (mOrientationHelper.getDecoratedMeasurement(localView) != j)
      {
        paramState = (LayoutParams)localView.getLayoutParams();
        paramRecycler = mDecorInsets;
        k = top + bottom + topMargin + bottomMargin;
        m = left + right + leftMargin + rightMargin;
        i3 = getSpaceForSpanRange(mSpanIndex, mSpanSize);
        if (mOrientation == 1)
        {
          m = RecyclerView.LayoutManager.getChildMeasureSpec(i3, 1073741824, m, width, false);
          k = View.MeasureSpec.makeMeasureSpec(j - k, 1073741824);
        }
        else
        {
          m = View.MeasureSpec.makeMeasureSpec(j - m, 1073741824);
          k = RecyclerView.LayoutManager.getChildMeasureSpec(i3, 1073741824, k, height, false);
        }
        measureChildWithDecorationsAndMargin(localView, m, k, true);
      }
    }
    int k = 0;
    mConsumed = j;
    if (mOrientation == 1)
    {
      if (mLayoutDirection == -1)
      {
        m = mOffset;
        n = m - j;
        j = m;
      }
      else
      {
        n = mOffset;
        j += n;
      }
      i3 = 0;
      m = i3;
    }
    else
    {
      if (mLayoutDirection == -1)
      {
        k = mOffset;
        m = k - j;
      }
      else
      {
        m = mOffset;
        k = j + m;
      }
      i3 = 0;
      n = 0;
      j = 0;
    }
    while (i3 < i1)
    {
      paramState = mSet[i3];
      paramRecycler = (LayoutParams)paramState.getLayoutParams();
      if (mOrientation == 1)
      {
        if (isLayoutRTL())
        {
          m = getPaddingLeft() + mCachedBorders[(mSpanCount - mSpanIndex)];
          k = m - mOrientationHelper.getDecoratedMeasurementInOther(paramState);
        }
        else
        {
          k = getPaddingLeft();
          k = mCachedBorders[mSpanIndex] + k;
          m = mOrientationHelper.getDecoratedMeasurementInOther(paramState) + k;
        }
      }
      else
      {
        j = getPaddingTop() + mCachedBorders[mSpanIndex];
        i = mOrientationHelper.getDecoratedMeasurementInOther(paramState);
        i2 = k;
        k = m;
        n = j;
        j = i + j;
        m = i2;
      }
      layoutDecoratedWithMargins(paramState, k, n, m, j);
      if ((paramRecycler.isItemRemoved()) || (paramRecycler.isItemChanged())) {
        mIgnoreConsumed = true;
      }
      mFocusable |= paramState.hasFocusable();
      i2 = i3 + 1;
      i3 = k;
      k = m;
      m = i3;
      i3 = i2;
    }
    Arrays.fill(mSet, null);
  }
  
  public void onAnchorReady(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, LinearLayoutManager.AnchorInfo paramAnchorInfo, int paramInt)
  {
    super.onAnchorReady(paramRecycler, paramState, paramAnchorInfo, paramInt);
    updateMeasurements();
    if ((paramState.getItemCount() > 0) && (!paramState.isPreLayout())) {
      ensureAnchorIsInCorrectSpan(paramRecycler, paramState, paramAnchorInfo, paramInt);
    }
    ensureViewSet();
  }
  
  public View onFocusSearchFailed(View paramView, int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    View localView = findContainingItemView(paramView);
    Object localObject1 = null;
    if (localView == null) {
      return null;
    }
    Object localObject2 = (LayoutParams)localView.getLayoutParams();
    int i = mSpanIndex;
    int j = mSpanSize + i;
    if (super.onFocusSearchFailed(paramView, paramInt, paramRecycler, paramState) == null) {
      return null;
    }
    int k;
    if (convertFocusDirectionToLayoutDirection(paramInt) == 1) {
      k = 1;
    } else {
      k = 0;
    }
    if (k != mShouldReverseLayout) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    int n;
    if (paramInt != 0)
    {
      paramInt = getChildCount() - 1;
      m = -1;
      n = m;
    }
    else
    {
      m = getChildCount();
      n = 1;
      paramInt = 0;
    }
    int i1;
    if ((mOrientation == 1) && (isLayoutRTL())) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    int i2 = getSpanGroupIndex(paramRecycler, paramState, paramInt);
    int i3 = -1;
    int i4 = i3;
    int i5 = 0;
    int i6 = 0;
    int i7 = paramInt;
    paramView = null;
    paramInt = i6;
    i6 = m;
    int m = i5;
    while (i7 != i6)
    {
      i5 = getSpanGroupIndex(paramRecycler, paramState, i7);
      localObject2 = getChildAt(i7);
      if (localObject2 == localView) {
        break;
      }
      if ((((View)localObject2).hasFocusable()) && (i5 != i2))
      {
        if (localObject1 != null) {
          break;
        }
      }
      else
      {
        LayoutParams localLayoutParams = (LayoutParams)((View)localObject2).getLayoutParams();
        int i8 = mSpanIndex;
        int i9 = mSpanSize + i8;
        if ((((View)localObject2).hasFocusable()) && (i8 == i) && (i9 == j)) {
          return (View)localObject2;
        }
        if (((((View)localObject2).hasFocusable()) && (localObject1 == null)) || ((!((View)localObject2).hasFocusable()) && (paramView == null))) {}
        for (;;)
        {
          i5 = 1;
          break label483;
          i5 = Math.max(i8, i);
          int i10 = Math.min(i9, j) - i5;
          if (((View)localObject2).hasFocusable())
          {
            if (i10 <= m) {
              while (i10 == m)
              {
                if (i8 > i3) {
                  i5 = 1;
                } else {
                  i5 = 0;
                }
                if (i1 != i5) {
                  break;
                }
              }
            }
          }
          else
          {
            if (localObject1 != null) {
              break;
            }
            int i11 = 1;
            int i12 = 1;
            if (!isViewPartiallyVisible((View)localObject2, false, true)) {
              break;
            }
            i5 = paramInt;
            if (i10 > i5)
            {
              i5 = i11;
              break label483;
            }
            if (i10 != i5) {
              break;
            }
            if (i8 > i4) {
              i5 = i12;
            } else {
              i5 = 0;
            }
            if (i1 != i5) {
              break;
            }
          }
        }
        i5 = 0;
        label483:
        if (i5 != 0) {
          if (((View)localObject2).hasFocusable())
          {
            i3 = mSpanIndex;
            m = Math.min(i9, j);
            i5 = Math.max(i8, i);
            localObject1 = localObject2;
            m -= i5;
          }
          else
          {
            i4 = mSpanIndex;
            paramInt = Math.min(i9, j) - Math.max(i8, i);
            paramView = (View)localObject2;
          }
        }
      }
      i7 += n;
    }
    if (localObject1 == null) {
      localObject1 = paramView;
    }
    return (View)localObject1;
  }
  
  public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState, View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof LayoutParams))
    {
      super.onInitializeAccessibilityNodeInfoForItem(paramView, paramAccessibilityNodeInfoCompat);
      return;
    }
    paramView = (LayoutParams)localLayoutParams;
    int i = getSpanGroupIndex(paramRecycler, paramState, paramView.getViewLayoutPosition());
    if (mOrientation == 0) {
      paramAccessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(paramView.getSpanIndex(), paramView.getSpanSize(), i, 1, false, false));
    } else {
      paramAccessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i, 1, paramView.getSpanIndex(), paramView.getSpanSize(), false, false));
    }
  }
  
  public void onItemsAdded(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    mSpanSizeLookup.invalidateSpanIndexCache();
    mSpanSizeLookup.invalidateSpanGroupIndexCache();
  }
  
  public void onItemsChanged(RecyclerView paramRecyclerView)
  {
    mSpanSizeLookup.invalidateSpanIndexCache();
    mSpanSizeLookup.invalidateSpanGroupIndexCache();
  }
  
  public void onItemsMoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    mSpanSizeLookup.invalidateSpanIndexCache();
    mSpanSizeLookup.invalidateSpanGroupIndexCache();
  }
  
  public void onItemsRemoved(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    mSpanSizeLookup.invalidateSpanIndexCache();
    mSpanSizeLookup.invalidateSpanGroupIndexCache();
  }
  
  public void onItemsUpdated(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    mSpanSizeLookup.invalidateSpanIndexCache();
    mSpanSizeLookup.invalidateSpanGroupIndexCache();
  }
  
  public void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    if (paramState.isPreLayout()) {
      cachePreLayoutSpanMapping();
    }
    super.onLayoutChildren(paramRecycler, paramState);
    clearPreLayoutSpanMappingCache();
  }
  
  public void onLayoutCompleted(RecyclerView.State paramState)
  {
    super.onLayoutCompleted(paramState);
    mPendingSpanCountChange = false;
  }
  
  public int scrollHorizontallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    updateMeasurements();
    ensureViewSet();
    return super.scrollHorizontallyBy(paramInt, paramRecycler, paramState);
  }
  
  public int scrollVerticallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    updateMeasurements();
    ensureViewSet();
    return super.scrollVerticallyBy(paramInt, paramRecycler, paramState);
  }
  
  public void setMeasuredDimension(Rect paramRect, int paramInt1, int paramInt2)
  {
    if (mCachedBorders == null) {
      super.setMeasuredDimension(paramRect, paramInt1, paramInt2);
    }
    int i = getPaddingLeft();
    i = getPaddingRight() + i;
    int j = getPaddingTop();
    j = getPaddingBottom() + j;
    if (mOrientation == 1)
    {
      paramInt2 = RecyclerView.LayoutManager.chooseSize(paramInt2, paramRect.height() + j, getMinimumHeight());
      paramRect = mCachedBorders;
      i = RecyclerView.LayoutManager.chooseSize(paramInt1, paramRect[(paramRect.length - 1)] + i, getMinimumWidth());
      paramInt1 = paramInt2;
      paramInt2 = i;
    }
    else
    {
      paramInt1 = RecyclerView.LayoutManager.chooseSize(paramInt1, paramRect.width() + i, getMinimumWidth());
      paramRect = mCachedBorders;
      i = RecyclerView.LayoutManager.chooseSize(paramInt2, paramRect[(paramRect.length - 1)] + j, getMinimumHeight());
      paramInt2 = paramInt1;
      paramInt1 = i;
    }
    setMeasuredDimension(paramInt2, paramInt1);
  }
  
  public void setSpanCount(int paramInt)
  {
    if (paramInt == mSpanCount) {
      return;
    }
    mPendingSpanCountChange = true;
    if (paramInt >= 1)
    {
      mSpanCount = paramInt;
      mSpanSizeLookup.invalidateSpanIndexCache();
      requestLayout();
      return;
    }
    throw new IllegalArgumentException(a.f("Span count should be at least 1. Provided ", paramInt));
  }
  
  public void setSpanSizeLookup(SpanSizeLookup paramSpanSizeLookup)
  {
    mSpanSizeLookup = paramSpanSizeLookup;
  }
  
  public void setStackFromEnd(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      super.setStackFromEnd(false);
      return;
    }
    throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
  }
  
  public void setUsingSpansToEstimateScrollbarDimensions(boolean paramBoolean)
  {
    mUsingSpansToEstimateScrollBarDimensions = paramBoolean;
  }
  
  public boolean supportsPredictiveItemAnimations()
  {
    boolean bool;
    if ((mPendingSavedState == null) && (!mPendingSpanCountChange)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final class DefaultSpanSizeLookup
    extends GridLayoutManager.SpanSizeLookup
  {
    public int getSpanIndex(int paramInt1, int paramInt2)
    {
      return paramInt1 % paramInt2;
    }
    
    public int getSpanSize(int paramInt)
    {
      return 1;
    }
  }
  
  public static class LayoutParams
    extends RecyclerView.LayoutParams
  {
    public static final int INVALID_SPAN_ID = -1;
    public int mSpanIndex = -1;
    public int mSpanSize = 0;
    
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
    
    public int getSpanIndex()
    {
      return mSpanIndex;
    }
    
    public int getSpanSize()
    {
      return mSpanSize;
    }
  }
  
  public static abstract class SpanSizeLookup
  {
    private boolean mCacheSpanGroupIndices = false;
    private boolean mCacheSpanIndices = false;
    public final SparseIntArray mSpanGroupIndexCache = new SparseIntArray();
    public final SparseIntArray mSpanIndexCache = new SparseIntArray();
    
    public static int findFirstKeyLessThan(SparseIntArray paramSparseIntArray, int paramInt)
    {
      int i = paramSparseIntArray.size() - 1;
      int j = 0;
      while (j <= i)
      {
        int k = j + i >>> 1;
        if (paramSparseIntArray.keyAt(k) < paramInt) {
          j = k + 1;
        } else {
          i = k - 1;
        }
      }
      paramInt = j - 1;
      if ((paramInt >= 0) && (paramInt < paramSparseIntArray.size())) {
        return paramSparseIntArray.keyAt(paramInt);
      }
      return -1;
    }
    
    public int getCachedSpanGroupIndex(int paramInt1, int paramInt2)
    {
      if (!mCacheSpanGroupIndices) {
        return getSpanGroupIndex(paramInt1, paramInt2);
      }
      int i = mSpanGroupIndexCache.get(paramInt1, -1);
      if (i != -1) {
        return i;
      }
      paramInt2 = getSpanGroupIndex(paramInt1, paramInt2);
      mSpanGroupIndexCache.put(paramInt1, paramInt2);
      return paramInt2;
    }
    
    public int getCachedSpanIndex(int paramInt1, int paramInt2)
    {
      if (!mCacheSpanIndices) {
        return getSpanIndex(paramInt1, paramInt2);
      }
      int i = mSpanIndexCache.get(paramInt1, -1);
      if (i != -1) {
        return i;
      }
      paramInt2 = getSpanIndex(paramInt1, paramInt2);
      mSpanIndexCache.put(paramInt1, paramInt2);
      return paramInt2;
    }
    
    public int getSpanGroupIndex(int paramInt1, int paramInt2)
    {
      int j;
      int n;
      if (mCacheSpanGroupIndices)
      {
        i = findFirstKeyLessThan(mSpanGroupIndexCache, paramInt1);
        if (i != -1)
        {
          j = mSpanGroupIndexCache.get(i);
          k = i + 1;
          m = getCachedSpanIndex(i, paramInt2);
          n = getSpanSize(i) + m;
          m = n;
          i = j;
          i1 = k;
          if (n != paramInt2) {
            break label95;
          }
          i = j + 1;
          m = 0;
          i1 = k;
          break label95;
        }
      }
      int m = 0;
      int i = m;
      int i1 = i;
      label95:
      int i2 = getSpanSize(paramInt1);
      int k = i1;
      while (k < paramInt1)
      {
        j = getSpanSize(k);
        n = m + j;
        if (n == paramInt2)
        {
          i1 = i + 1;
          m = 0;
        }
        else
        {
          m = n;
          i1 = i;
          if (n > paramInt2)
          {
            i1 = i + 1;
            m = j;
          }
        }
        k++;
        i = i1;
      }
      paramInt1 = i;
      if (m + i2 > paramInt2) {
        paramInt1 = i + 1;
      }
      return paramInt1;
    }
    
    public int getSpanIndex(int paramInt1, int paramInt2)
    {
      int i = getSpanSize(paramInt1);
      if (i == paramInt2) {
        return 0;
      }
      int j;
      if (mCacheSpanIndices)
      {
        j = findFirstKeyLessThan(mSpanIndexCache, paramInt1);
        if (j >= 0)
        {
          k = mSpanIndexCache.get(j);
          k = getSpanSize(j) + k;
          break label126;
        }
      }
      int m = 0;
      int k = m;
      while (m < paramInt1)
      {
        int n = getSpanSize(m);
        int i1 = k + n;
        if (i1 == paramInt2)
        {
          k = 0;
          j = m;
        }
        else
        {
          j = m;
          k = i1;
          if (i1 > paramInt2)
          {
            k = n;
            j = m;
          }
        }
        label126:
        m = j + 1;
      }
      if (i + k <= paramInt2) {
        return k;
      }
      return 0;
    }
    
    public abstract int getSpanSize(int paramInt);
    
    public void invalidateSpanGroupIndexCache()
    {
      mSpanGroupIndexCache.clear();
    }
    
    public void invalidateSpanIndexCache()
    {
      mSpanIndexCache.clear();
    }
    
    public boolean isSpanGroupIndexCacheEnabled()
    {
      return mCacheSpanGroupIndices;
    }
    
    public boolean isSpanIndexCacheEnabled()
    {
      return mCacheSpanIndices;
    }
    
    public void setSpanGroupIndexCacheEnabled(boolean paramBoolean)
    {
      if (!paramBoolean) {
        mSpanGroupIndexCache.clear();
      }
      mCacheSpanGroupIndices = paramBoolean;
    }
    
    public void setSpanIndexCacheEnabled(boolean paramBoolean)
    {
      if (!paramBoolean) {
        mSpanGroupIndexCache.clear();
      }
      mCacheSpanIndices = paramBoolean;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.GridLayoutManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */