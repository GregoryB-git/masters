package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import androidx.recyclerview.R.styleable;
import java.util.ArrayList;
import z2;

public abstract class RecyclerView$LayoutManager
{
  public boolean mAutoMeasure;
  public ChildHelper mChildHelper;
  private int mHeight;
  private int mHeightMode;
  public ViewBoundsCheck mHorizontalBoundCheck;
  private final ViewBoundsCheck.Callback mHorizontalBoundCheckCallback;
  public boolean mIsAttachedToWindow;
  private boolean mItemPrefetchEnabled;
  private boolean mMeasurementCacheEnabled;
  public int mPrefetchMaxCountObserved;
  public boolean mPrefetchMaxObservedInInitialPrefetch;
  public RecyclerView mRecyclerView;
  public boolean mRequestedSimpleAnimations;
  @Nullable
  public RecyclerView.SmoothScroller mSmoothScroller;
  public ViewBoundsCheck mVerticalBoundCheck;
  private final ViewBoundsCheck.Callback mVerticalBoundCheckCallback;
  private int mWidth;
  private int mWidthMode;
  
  public RecyclerView$LayoutManager()
  {
    ViewBoundsCheck.Callback local1 = new ViewBoundsCheck.Callback()
    {
      public View getChildAt(int paramAnonymousInt)
      {
        return RecyclerView.LayoutManager.this.getChildAt(paramAnonymousInt);
      }
      
      public int getChildEnd(View paramAnonymousView)
      {
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramAnonymousView.getLayoutParams();
        return getDecoratedRight(paramAnonymousView) + rightMargin;
      }
      
      public int getChildStart(View paramAnonymousView)
      {
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramAnonymousView.getLayoutParams();
        return getDecoratedLeft(paramAnonymousView) - leftMargin;
      }
      
      public int getParentEnd()
      {
        return getWidth() - getPaddingRight();
      }
      
      public int getParentStart()
      {
        return getPaddingLeft();
      }
    };
    mHorizontalBoundCheckCallback = local1;
    ViewBoundsCheck.Callback local2 = new ViewBoundsCheck.Callback()
    {
      public View getChildAt(int paramAnonymousInt)
      {
        return RecyclerView.LayoutManager.this.getChildAt(paramAnonymousInt);
      }
      
      public int getChildEnd(View paramAnonymousView)
      {
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramAnonymousView.getLayoutParams();
        return getDecoratedBottom(paramAnonymousView) + bottomMargin;
      }
      
      public int getChildStart(View paramAnonymousView)
      {
        RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramAnonymousView.getLayoutParams();
        return getDecoratedTop(paramAnonymousView) - topMargin;
      }
      
      public int getParentEnd()
      {
        return getHeight() - getPaddingBottom();
      }
      
      public int getParentStart()
      {
        return getPaddingTop();
      }
    };
    mVerticalBoundCheckCallback = local2;
    mHorizontalBoundCheck = new ViewBoundsCheck(local1);
    mVerticalBoundCheck = new ViewBoundsCheck(local2);
    mRequestedSimpleAnimations = false;
    mIsAttachedToWindow = false;
    mAutoMeasure = false;
    mMeasurementCacheEnabled = true;
    mItemPrefetchEnabled = true;
  }
  
  private void addViewInt(View paramView, int paramInt, boolean paramBoolean)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    if ((!paramBoolean) && (!localViewHolder.isRemoved())) {
      mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(localViewHolder);
    } else {
      mRecyclerView.mViewInfoStore.addToDisappearedInLayout(localViewHolder);
    }
    Object localObject = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    if ((!localViewHolder.wasReturnedFromScrap()) && (!localViewHolder.isScrap()))
    {
      if (paramView.getParent() == mRecyclerView)
      {
        int i = mChildHelper.indexOfChild(paramView);
        int j = paramInt;
        if (paramInt == -1) {
          j = mChildHelper.getChildCount();
        }
        if (i != -1)
        {
          if (i != j) {
            mRecyclerView.mLayout.moveView(i, j);
          }
        }
        else
        {
          localObject = z2.t("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
          ((StringBuilder)localObject).append(mRecyclerView.indexOfChild(paramView));
          throw new IllegalStateException(z2.m(mRecyclerView, (StringBuilder)localObject));
        }
      }
      else
      {
        mChildHelper.addView(paramView, paramInt, false);
        mInsetsDirty = true;
        RecyclerView.SmoothScroller localSmoothScroller = mSmoothScroller;
        if ((localSmoothScroller != null) && (localSmoothScroller.isRunning())) {
          mSmoothScroller.onChildAttachedToWindow(paramView);
        }
      }
    }
    else
    {
      if (localViewHolder.isScrap()) {
        localViewHolder.unScrap();
      } else {
        localViewHolder.clearReturnedFromScrapFlag();
      }
      mChildHelper.attachViewToParent(paramView, paramInt, paramView.getLayoutParams(), false);
    }
    if (mPendingInvalidate)
    {
      itemView.invalidate();
      mPendingInvalidate = false;
    }
  }
  
  public static int chooseSize(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    if (i != Integer.MIN_VALUE)
    {
      if (i != 1073741824) {
        paramInt1 = Math.max(paramInt2, paramInt3);
      }
      return paramInt1;
    }
    return Math.min(paramInt1, Math.max(paramInt2, paramInt3));
  }
  
  private void detachViewInternal(int paramInt, @NonNull View paramView)
  {
    mChildHelper.detachViewFromParent(paramInt);
  }
  
  public static int getChildMeasureSpec(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    paramInt1 = Math.max(0, paramInt1 - paramInt3);
    if (paramBoolean)
    {
      if (paramInt4 < 0)
      {
        if (paramInt4 != -1) {
          break label100;
        }
        if (paramInt2 == Integer.MIN_VALUE) {
          break label59;
        }
        if (paramInt2 == 0) {
          break label100;
        }
        if (paramInt2 == 1073741824) {
          break label59;
        }
        break label100;
      }
    }
    else {
      if (paramInt4 < 0) {
        break label54;
      }
    }
    paramInt2 = 1073741824;
    break label104;
    label54:
    if (paramInt4 == -1)
    {
      label59:
      paramInt4 = paramInt1;
    }
    else if (paramInt4 == -2)
    {
      if ((paramInt2 != Integer.MIN_VALUE) && (paramInt2 != 1073741824))
      {
        paramInt2 = 0;
        paramInt4 = paramInt1;
      }
      else
      {
        paramInt2 = Integer.MIN_VALUE;
        paramInt4 = paramInt1;
      }
    }
    else
    {
      label100:
      paramInt2 = 0;
      paramInt4 = paramInt2;
    }
    label104:
    return View.MeasureSpec.makeMeasureSpec(paramInt4, paramInt2);
  }
  
  @Deprecated
  public static int getChildMeasureSpec(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int i = 0;
    paramInt1 = Math.max(0, paramInt1 - paramInt2);
    if (paramBoolean) {
      if (paramInt3 >= 0)
      {
        paramInt2 = paramInt3;
        break label38;
      }
    }
    label38:
    do
    {
      paramInt2 = 0;
      paramInt1 = i;
      break;
      if (paramInt3 >= 0) {}
      for (paramInt2 = paramInt3;; paramInt2 = paramInt1)
      {
        paramInt1 = 1073741824;
        break label67;
        if (paramInt3 != -1) {
          break;
        }
      }
    } while (paramInt3 != -2);
    paramInt3 = Integer.MIN_VALUE;
    paramInt2 = paramInt1;
    paramInt1 = paramInt3;
    label67:
    return View.MeasureSpec.makeMeasureSpec(paramInt2, paramInt1);
  }
  
  private int[] getChildRectangleOnScreenScrollAmount(View paramView, Rect paramRect)
  {
    int i = getPaddingLeft();
    int j = getPaddingTop();
    int k = getWidth();
    int m = getPaddingRight();
    int n = getHeight();
    int i1 = getPaddingBottom();
    int i2 = paramView.getLeft() + left - paramView.getScrollX();
    int i3 = paramView.getTop() + top - paramView.getScrollY();
    int i4 = paramRect.width();
    int i5 = paramRect.height();
    int i6 = i2 - i;
    i = Math.min(0, i6);
    int i7 = i3 - j;
    j = Math.min(0, i7);
    i4 = i4 + i2 - (k - m);
    m = Math.max(0, i4);
    n = Math.max(0, i5 + i3 - (n - i1));
    if (getLayoutDirection() == 1)
    {
      if (m != 0) {
        i = m;
      } else {
        i = Math.max(i, i4);
      }
    }
    else if (i == 0) {
      i = Math.min(i6, m);
    }
    if (j == 0) {
      j = Math.min(i7, n);
    }
    return new int[] { i, j };
  }
  
  public static Properties getProperties(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    Properties localProperties = new Properties();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.RecyclerView, paramInt1, paramInt2);
    orientation = paramContext.getInt(R.styleable.RecyclerView_android_orientation, 1);
    spanCount = paramContext.getInt(R.styleable.RecyclerView_spanCount, 1);
    reverseLayout = paramContext.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
    stackFromEnd = paramContext.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
    paramContext.recycle();
    return localProperties;
  }
  
  private boolean isFocusedChildVisibleAfterScrolling(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    paramRecyclerView = paramRecyclerView.getFocusedChild();
    if (paramRecyclerView == null) {
      return false;
    }
    int i = getPaddingLeft();
    int j = getPaddingTop();
    int k = getWidth();
    int m = getPaddingRight();
    int n = getHeight();
    int i1 = getPaddingBottom();
    Rect localRect = mRecyclerView.mTempRect;
    getDecoratedBoundsWithMargins(paramRecyclerView, localRect);
    return (left - paramInt1 < k - m) && (right - paramInt1 > i) && (top - paramInt2 < n - i1) && (bottom - paramInt2 > j);
  }
  
  private static boolean isMeasurementUpToDate(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    boolean bool1 = false;
    boolean bool2 = false;
    if ((paramInt3 > 0) && (paramInt1 != paramInt3)) {
      return false;
    }
    if (i != Integer.MIN_VALUE)
    {
      if (i != 0)
      {
        if (i != 1073741824) {
          return false;
        }
        if (paramInt2 == paramInt1) {
          bool2 = true;
        }
        return bool2;
      }
      return true;
    }
    bool2 = bool1;
    if (paramInt2 >= paramInt1) {
      bool2 = true;
    }
    return bool2;
  }
  
  private void scrapOrRecycleView(RecyclerView.Recycler paramRecycler, int paramInt, View paramView)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    if (localViewHolder.shouldIgnore()) {
      return;
    }
    if ((localViewHolder.isInvalid()) && (!localViewHolder.isRemoved()) && (!mRecyclerView.mAdapter.hasStableIds()))
    {
      removeViewAt(paramInt);
      paramRecycler.recycleViewHolderInternal(localViewHolder);
    }
    else
    {
      detachViewAt(paramInt);
      paramRecycler.scrapView(paramView);
      mRecyclerView.mViewInfoStore.onViewDetached(localViewHolder);
    }
  }
  
  public void addDisappearingView(View paramView)
  {
    addDisappearingView(paramView, -1);
  }
  
  public void addDisappearingView(View paramView, int paramInt)
  {
    addViewInt(paramView, paramInt, true);
  }
  
  public void addView(View paramView)
  {
    addView(paramView, -1);
  }
  
  public void addView(View paramView, int paramInt)
  {
    addViewInt(paramView, paramInt, false);
  }
  
  public void assertInLayoutOrScroll(String paramString)
  {
    RecyclerView localRecyclerView = mRecyclerView;
    if (localRecyclerView != null) {
      localRecyclerView.assertInLayoutOrScroll(paramString);
    }
  }
  
  public void assertNotInLayoutOrScroll(String paramString)
  {
    RecyclerView localRecyclerView = mRecyclerView;
    if (localRecyclerView != null) {
      localRecyclerView.assertNotInLayoutOrScroll(paramString);
    }
  }
  
  public void attachView(@NonNull View paramView)
  {
    attachView(paramView, -1);
  }
  
  public void attachView(@NonNull View paramView, int paramInt)
  {
    attachView(paramView, paramInt, (RecyclerView.LayoutParams)paramView.getLayoutParams());
  }
  
  public void attachView(@NonNull View paramView, int paramInt, RecyclerView.LayoutParams paramLayoutParams)
  {
    RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(paramView);
    if (localViewHolder.isRemoved()) {
      mRecyclerView.mViewInfoStore.addToDisappearedInLayout(localViewHolder);
    } else {
      mRecyclerView.mViewInfoStore.removeFromDisappearedInLayout(localViewHolder);
    }
    mChildHelper.attachViewToParent(paramView, paramInt, paramLayoutParams, localViewHolder.isRemoved());
  }
  
  public void calculateItemDecorationsForChild(@NonNull View paramView, @NonNull Rect paramRect)
  {
    RecyclerView localRecyclerView = mRecyclerView;
    if (localRecyclerView == null)
    {
      paramRect.set(0, 0, 0, 0);
      return;
    }
    paramRect.set(localRecyclerView.getItemDecorInsetsForChild(paramView));
  }
  
  public boolean canScrollHorizontally()
  {
    return false;
  }
  
  public boolean canScrollVertically()
  {
    return false;
  }
  
  public boolean checkLayoutParams(RecyclerView.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if (paramLayoutParams != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void collectAdjacentPrefetchPositions(int paramInt1, int paramInt2, RecyclerView.State paramState, LayoutPrefetchRegistry paramLayoutPrefetchRegistry) {}
  
  public void collectInitialPrefetchPositions(int paramInt, LayoutPrefetchRegistry paramLayoutPrefetchRegistry) {}
  
  public int computeHorizontalScrollExtent(@NonNull RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeHorizontalScrollOffset(@NonNull RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeHorizontalScrollRange(@NonNull RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeVerticalScrollExtent(@NonNull RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeVerticalScrollOffset(@NonNull RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int computeVerticalScrollRange(@NonNull RecyclerView.State paramState)
  {
    return 0;
  }
  
  public void detachAndScrapAttachedViews(@NonNull RecyclerView.Recycler paramRecycler)
  {
    for (int i = getChildCount() - 1; i >= 0; i--) {
      scrapOrRecycleView(paramRecycler, i, getChildAt(i));
    }
  }
  
  public void detachAndScrapView(@NonNull View paramView, @NonNull RecyclerView.Recycler paramRecycler)
  {
    scrapOrRecycleView(paramRecycler, mChildHelper.indexOfChild(paramView), paramView);
  }
  
  public void detachAndScrapViewAt(int paramInt, @NonNull RecyclerView.Recycler paramRecycler)
  {
    scrapOrRecycleView(paramRecycler, paramInt, getChildAt(paramInt));
  }
  
  public void detachView(@NonNull View paramView)
  {
    int i = mChildHelper.indexOfChild(paramView);
    if (i >= 0) {
      detachViewInternal(i, paramView);
    }
  }
  
  public void detachViewAt(int paramInt)
  {
    detachViewInternal(paramInt, getChildAt(paramInt));
  }
  
  public void dispatchAttachedToWindow(RecyclerView paramRecyclerView)
  {
    mIsAttachedToWindow = true;
    onAttachedToWindow(paramRecyclerView);
  }
  
  public void dispatchDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
  {
    mIsAttachedToWindow = false;
    onDetachedFromWindow(paramRecyclerView, paramRecycler);
  }
  
  public void endAnimation(View paramView)
  {
    RecyclerView.ItemAnimator localItemAnimator = mRecyclerView.mItemAnimator;
    if (localItemAnimator != null) {
      localItemAnimator.endAnimation(RecyclerView.getChildViewHolderInt(paramView));
    }
  }
  
  @Nullable
  public View findContainingItemView(@NonNull View paramView)
  {
    RecyclerView localRecyclerView = mRecyclerView;
    if (localRecyclerView == null) {
      return null;
    }
    paramView = localRecyclerView.findContainingItemView(paramView);
    if (paramView == null) {
      return null;
    }
    if (mChildHelper.isHidden(paramView)) {
      return null;
    }
    return paramView;
  }
  
  @Nullable
  public View findViewByPosition(int paramInt)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(localView);
      if ((localViewHolder != null) && (localViewHolder.getLayoutPosition() == paramInt) && (!localViewHolder.shouldIgnore()) && ((mRecyclerView.mState.isPreLayout()) || (!localViewHolder.isRemoved()))) {
        return localView;
      }
    }
    return null;
  }
  
  public abstract RecyclerView.LayoutParams generateDefaultLayoutParams();
  
  public RecyclerView.LayoutParams generateLayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new RecyclerView.LayoutParams(paramContext, paramAttributeSet);
  }
  
  public RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof RecyclerView.LayoutParams)) {
      return new RecyclerView.LayoutParams((RecyclerView.LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new RecyclerView.LayoutParams(paramLayoutParams);
  }
  
  public int getBaseline()
  {
    return -1;
  }
  
  public int getBottomDecorationHeight(@NonNull View paramView)
  {
    return getLayoutParamsmDecorInsets.bottom;
  }
  
  @Nullable
  public View getChildAt(int paramInt)
  {
    Object localObject = mChildHelper;
    if (localObject != null) {
      localObject = ((ChildHelper)localObject).getChildAt(paramInt);
    } else {
      localObject = null;
    }
    return (View)localObject;
  }
  
  public int getChildCount()
  {
    ChildHelper localChildHelper = mChildHelper;
    int i;
    if (localChildHelper != null) {
      i = localChildHelper.getChildCount();
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean getClipToPadding()
  {
    RecyclerView localRecyclerView = mRecyclerView;
    boolean bool;
    if ((localRecyclerView != null) && (mClipToPadding)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int getColumnCountForAccessibility(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState)
  {
    return -1;
  }
  
  public int getDecoratedBottom(@NonNull View paramView)
  {
    int i = paramView.getBottom();
    return getBottomDecorationHeight(paramView) + i;
  }
  
  public void getDecoratedBoundsWithMargins(@NonNull View paramView, @NonNull Rect paramRect)
  {
    RecyclerView.getDecoratedBoundsWithMarginsInt(paramView, paramRect);
  }
  
  public int getDecoratedLeft(@NonNull View paramView)
  {
    return paramView.getLeft() - getLeftDecorationWidth(paramView);
  }
  
  public int getDecoratedMeasuredHeight(@NonNull View paramView)
  {
    Rect localRect = getLayoutParamsmDecorInsets;
    return paramView.getMeasuredHeight() + top + bottom;
  }
  
  public int getDecoratedMeasuredWidth(@NonNull View paramView)
  {
    Rect localRect = getLayoutParamsmDecorInsets;
    return paramView.getMeasuredWidth() + left + right;
  }
  
  public int getDecoratedRight(@NonNull View paramView)
  {
    int i = paramView.getRight();
    return getRightDecorationWidth(paramView) + i;
  }
  
  public int getDecoratedTop(@NonNull View paramView)
  {
    return paramView.getTop() - getTopDecorationHeight(paramView);
  }
  
  @Nullable
  public View getFocusedChild()
  {
    Object localObject = mRecyclerView;
    if (localObject == null) {
      return null;
    }
    localObject = ((ViewGroup)localObject).getFocusedChild();
    if ((localObject != null) && (!mChildHelper.isHidden((View)localObject))) {
      return (View)localObject;
    }
    return null;
  }
  
  @Px
  public int getHeight()
  {
    return mHeight;
  }
  
  public int getHeightMode()
  {
    return mHeightMode;
  }
  
  public int getItemCount()
  {
    Object localObject = mRecyclerView;
    if (localObject != null) {
      localObject = ((RecyclerView)localObject).getAdapter();
    } else {
      localObject = null;
    }
    int i;
    if (localObject != null) {
      i = ((RecyclerView.Adapter)localObject).getItemCount();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getItemViewType(@NonNull View paramView)
  {
    return RecyclerView.getChildViewHolderInt(paramView).getItemViewType();
  }
  
  public int getLayoutDirection()
  {
    return ViewCompat.getLayoutDirection(mRecyclerView);
  }
  
  public int getLeftDecorationWidth(@NonNull View paramView)
  {
    return getLayoutParamsmDecorInsets.left;
  }
  
  @Px
  public int getMinimumHeight()
  {
    return ViewCompat.getMinimumHeight(mRecyclerView);
  }
  
  @Px
  public int getMinimumWidth()
  {
    return ViewCompat.getMinimumWidth(mRecyclerView);
  }
  
  @Px
  public int getPaddingBottom()
  {
    RecyclerView localRecyclerView = mRecyclerView;
    int i;
    if (localRecyclerView != null) {
      i = localRecyclerView.getPaddingBottom();
    } else {
      i = 0;
    }
    return i;
  }
  
  @Px
  public int getPaddingEnd()
  {
    RecyclerView localRecyclerView = mRecyclerView;
    int i;
    if (localRecyclerView != null) {
      i = ViewCompat.getPaddingEnd(localRecyclerView);
    } else {
      i = 0;
    }
    return i;
  }
  
  @Px
  public int getPaddingLeft()
  {
    RecyclerView localRecyclerView = mRecyclerView;
    int i;
    if (localRecyclerView != null) {
      i = localRecyclerView.getPaddingLeft();
    } else {
      i = 0;
    }
    return i;
  }
  
  @Px
  public int getPaddingRight()
  {
    RecyclerView localRecyclerView = mRecyclerView;
    int i;
    if (localRecyclerView != null) {
      i = localRecyclerView.getPaddingRight();
    } else {
      i = 0;
    }
    return i;
  }
  
  @Px
  public int getPaddingStart()
  {
    RecyclerView localRecyclerView = mRecyclerView;
    int i;
    if (localRecyclerView != null) {
      i = ViewCompat.getPaddingStart(localRecyclerView);
    } else {
      i = 0;
    }
    return i;
  }
  
  @Px
  public int getPaddingTop()
  {
    RecyclerView localRecyclerView = mRecyclerView;
    int i;
    if (localRecyclerView != null) {
      i = localRecyclerView.getPaddingTop();
    } else {
      i = 0;
    }
    return i;
  }
  
  public int getPosition(@NonNull View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).getViewLayoutPosition();
  }
  
  public int getRightDecorationWidth(@NonNull View paramView)
  {
    return getLayoutParamsmDecorInsets.right;
  }
  
  public int getRowCountForAccessibility(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState)
  {
    return -1;
  }
  
  public int getSelectionModeForAccessibility(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState)
  {
    return 0;
  }
  
  public int getTopDecorationHeight(@NonNull View paramView)
  {
    return getLayoutParamsmDecorInsets.top;
  }
  
  public void getTransformedBoundingBox(@NonNull View paramView, boolean paramBoolean, @NonNull Rect paramRect)
  {
    Object localObject;
    if (paramBoolean)
    {
      localObject = getLayoutParamsmDecorInsets;
      paramRect.set(-left, -top, paramView.getWidth() + right, paramView.getHeight() + bottom);
    }
    else
    {
      paramRect.set(0, 0, paramView.getWidth(), paramView.getHeight());
    }
    if (mRecyclerView != null)
    {
      localObject = paramView.getMatrix();
      if ((localObject != null) && (!((Matrix)localObject).isIdentity()))
      {
        RectF localRectF = mRecyclerView.mTempRectF;
        localRectF.set(paramRect);
        ((Matrix)localObject).mapRect(localRectF);
        paramRect.set((int)Math.floor(left), (int)Math.floor(top), (int)Math.ceil(right), (int)Math.ceil(bottom));
      }
    }
    paramRect.offset(paramView.getLeft(), paramView.getTop());
  }
  
  @Px
  public int getWidth()
  {
    return mWidth;
  }
  
  public int getWidthMode()
  {
    return mWidthMode;
  }
  
  public boolean hasFlexibleChildInBothOrientations()
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      ViewGroup.LayoutParams localLayoutParams = getChildAt(j).getLayoutParams();
      if ((width < 0) && (height < 0)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean hasFocus()
  {
    RecyclerView localRecyclerView = mRecyclerView;
    boolean bool;
    if ((localRecyclerView != null) && (localRecyclerView.hasFocus())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void ignoreView(@NonNull View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    RecyclerView localRecyclerView = mRecyclerView;
    if ((localViewParent == localRecyclerView) && (localRecyclerView.indexOfChild(paramView) != -1))
    {
      paramView = RecyclerView.getChildViewHolderInt(paramView);
      paramView.addFlags(128);
      mRecyclerView.mViewInfoStore.removeViewHolder(paramView);
      return;
    }
    paramView = z2.t("View should be fully attached to be ignored");
    throw new IllegalArgumentException(z2.m(mRecyclerView, paramView));
  }
  
  public boolean isAttachedToWindow()
  {
    return mIsAttachedToWindow;
  }
  
  public boolean isAutoMeasureEnabled()
  {
    return mAutoMeasure;
  }
  
  public boolean isFocused()
  {
    RecyclerView localRecyclerView = mRecyclerView;
    boolean bool;
    if ((localRecyclerView != null) && (localRecyclerView.isFocused())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isItemPrefetchEnabled()
  {
    return mItemPrefetchEnabled;
  }
  
  public boolean isLayoutHierarchical(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState)
  {
    return false;
  }
  
  public boolean isMeasurementCacheEnabled()
  {
    return mMeasurementCacheEnabled;
  }
  
  public boolean isSmoothScrolling()
  {
    RecyclerView.SmoothScroller localSmoothScroller = mSmoothScroller;
    boolean bool;
    if ((localSmoothScroller != null) && (localSmoothScroller.isRunning())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isViewPartiallyVisible(@NonNull View paramView, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((mHorizontalBoundCheck.isViewWithinBoundFlags(paramView, 24579)) && (mVerticalBoundCheck.isViewWithinBoundFlags(paramView, 24579))) {
      paramBoolean2 = true;
    } else {
      paramBoolean2 = false;
    }
    if (paramBoolean1) {
      return paramBoolean2;
    }
    return paramBoolean2 ^ true;
  }
  
  public void layoutDecorated(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = getLayoutParamsmDecorInsets;
    paramView.layout(paramInt1 + left, paramInt2 + top, paramInt3 - right, paramInt4 - bottom);
  }
  
  public void layoutDecoratedWithMargins(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    Rect localRect = mDecorInsets;
    paramView.layout(paramInt1 + left + leftMargin, paramInt2 + top + topMargin, paramInt3 - right - rightMargin, paramInt4 - bottom - bottomMargin);
  }
  
  public void measureChild(@NonNull View paramView, int paramInt1, int paramInt2)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    Rect localRect = mRecyclerView.getItemDecorInsetsForChild(paramView);
    int i = left;
    int j = right;
    int k = top;
    int m = bottom;
    int n = getWidth();
    int i1 = getWidthMode();
    int i2 = getPaddingLeft();
    paramInt1 = getChildMeasureSpec(n, i1, getPaddingRight() + i2 + (i + j + paramInt1), width, canScrollHorizontally());
    n = getHeight();
    i1 = getHeightMode();
    i = getPaddingTop();
    paramInt2 = getChildMeasureSpec(n, i1, getPaddingBottom() + i + (k + m + paramInt2), height, canScrollVertically());
    if (shouldMeasureChild(paramView, paramInt1, paramInt2, localLayoutParams)) {
      paramView.measure(paramInt1, paramInt2);
    }
  }
  
  public void measureChildWithMargins(@NonNull View paramView, int paramInt1, int paramInt2)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    Rect localRect = mRecyclerView.getItemDecorInsetsForChild(paramView);
    int i = left;
    int j = right;
    int k = top;
    int m = bottom;
    int n = getWidth();
    int i1 = getWidthMode();
    int i2 = getPaddingLeft();
    paramInt1 = getChildMeasureSpec(n, i1, getPaddingRight() + i2 + leftMargin + rightMargin + (i + j + paramInt1), width, canScrollHorizontally());
    i2 = getHeight();
    j = getHeightMode();
    n = getPaddingTop();
    paramInt2 = getChildMeasureSpec(i2, j, getPaddingBottom() + n + topMargin + bottomMargin + (k + m + paramInt2), height, canScrollVertically());
    if (shouldMeasureChild(paramView, paramInt1, paramInt2, localLayoutParams)) {
      paramView.measure(paramInt1, paramInt2);
    }
  }
  
  public void moveView(int paramInt1, int paramInt2)
  {
    Object localObject = getChildAt(paramInt1);
    if (localObject != null)
    {
      detachViewAt(paramInt1);
      attachView((View)localObject, paramInt2);
      return;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Cannot move a child from non-existing index:");
    ((StringBuilder)localObject).append(paramInt1);
    ((StringBuilder)localObject).append(mRecyclerView.toString());
    throw new IllegalArgumentException(((StringBuilder)localObject).toString());
  }
  
  public void offsetChildrenHorizontal(@Px int paramInt)
  {
    RecyclerView localRecyclerView = mRecyclerView;
    if (localRecyclerView != null) {
      localRecyclerView.offsetChildrenHorizontal(paramInt);
    }
  }
  
  public void offsetChildrenVertical(@Px int paramInt)
  {
    RecyclerView localRecyclerView = mRecyclerView;
    if (localRecyclerView != null) {
      localRecyclerView.offsetChildrenVertical(paramInt);
    }
  }
  
  public void onAdapterChanged(@Nullable RecyclerView.Adapter paramAdapter1, @Nullable RecyclerView.Adapter paramAdapter2) {}
  
  public boolean onAddFocusables(@NonNull RecyclerView paramRecyclerView, @NonNull ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    return false;
  }
  
  @CallSuper
  public void onAttachedToWindow(RecyclerView paramRecyclerView) {}
  
  @Deprecated
  public void onDetachedFromWindow(RecyclerView paramRecyclerView) {}
  
  @CallSuper
  public void onDetachedFromWindow(RecyclerView paramRecyclerView, RecyclerView.Recycler paramRecycler)
  {
    onDetachedFromWindow(paramRecyclerView);
  }
  
  @Nullable
  public View onFocusSearchFailed(@NonNull View paramView, int paramInt, @NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState)
  {
    return null;
  }
  
  public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent paramAccessibilityEvent)
  {
    RecyclerView localRecyclerView = mRecyclerView;
    onInitializeAccessibilityEvent(mRecycler, mState, paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityEvent(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState, @NonNull AccessibilityEvent paramAccessibilityEvent)
  {
    paramRecycler = mRecyclerView;
    if ((paramRecycler != null) && (paramAccessibilityEvent != null))
    {
      boolean bool1 = true;
      boolean bool2 = bool1;
      if (!paramRecycler.canScrollVertically(1))
      {
        bool2 = bool1;
        if (!mRecyclerView.canScrollVertically(-1))
        {
          bool2 = bool1;
          if (!mRecyclerView.canScrollHorizontally(-1)) {
            if (mRecyclerView.canScrollHorizontally(1)) {
              bool2 = bool1;
            } else {
              bool2 = false;
            }
          }
        }
      }
      paramAccessibilityEvent.setScrollable(bool2);
      paramRecycler = mRecyclerView.mAdapter;
      if (paramRecycler != null) {
        paramAccessibilityEvent.setItemCount(paramRecycler.getItemCount());
      }
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    RecyclerView localRecyclerView = mRecyclerView;
    onInitializeAccessibilityNodeInfo(mRecycler, mState, paramAccessibilityNodeInfoCompat);
  }
  
  public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState, @NonNull AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    if ((mRecyclerView.canScrollVertically(-1)) || (mRecyclerView.canScrollHorizontally(-1)))
    {
      paramAccessibilityNodeInfoCompat.addAction(8192);
      paramAccessibilityNodeInfoCompat.setScrollable(true);
    }
    if ((mRecyclerView.canScrollVertically(1)) || (mRecyclerView.canScrollHorizontally(1)))
    {
      paramAccessibilityNodeInfoCompat.addAction(4096);
      paramAccessibilityNodeInfoCompat.setScrollable(true);
    }
    paramAccessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(getRowCountForAccessibility(paramRecycler, paramState), getColumnCountForAccessibility(paramRecycler, paramState), isLayoutHierarchical(paramRecycler, paramState), getSelectionModeForAccessibility(paramRecycler, paramState)));
  }
  
  public void onInitializeAccessibilityNodeInfoForItem(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    Object localObject = RecyclerView.getChildViewHolderInt(paramView);
    if ((localObject != null) && (!((RecyclerView.ViewHolder)localObject).isRemoved()) && (!mChildHelper.isHidden(itemView)))
    {
      localObject = mRecyclerView;
      onInitializeAccessibilityNodeInfoForItem(mRecycler, mState, paramView, paramAccessibilityNodeInfoCompat);
    }
  }
  
  public void onInitializeAccessibilityNodeInfoForItem(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState, @NonNull View paramView, @NonNull AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat) {}
  
  @Nullable
  public View onInterceptFocusSearch(@NonNull View paramView, int paramInt)
  {
    return null;
  }
  
  public void onItemsAdded(@NonNull RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void onItemsChanged(@NonNull RecyclerView paramRecyclerView) {}
  
  public void onItemsMoved(@NonNull RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onItemsRemoved(@NonNull RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void onItemsUpdated(@NonNull RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void onItemsUpdated(@NonNull RecyclerView paramRecyclerView, int paramInt1, int paramInt2, @Nullable Object paramObject)
  {
    onItemsUpdated(paramRecyclerView, paramInt1, paramInt2);
  }
  
  public void onLayoutChildren(RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
  }
  
  public void onLayoutCompleted(RecyclerView.State paramState) {}
  
  public void onMeasure(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState, int paramInt1, int paramInt2)
  {
    mRecyclerView.defaultOnMeasure(paramInt1, paramInt2);
  }
  
  @Deprecated
  public boolean onRequestChildFocus(@NonNull RecyclerView paramRecyclerView, @NonNull View paramView1, @Nullable View paramView2)
  {
    boolean bool;
    if ((!isSmoothScrolling()) && (!paramRecyclerView.isComputingLayout())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean onRequestChildFocus(@NonNull RecyclerView paramRecyclerView, @NonNull RecyclerView.State paramState, @NonNull View paramView1, @Nullable View paramView2)
  {
    return onRequestChildFocus(paramRecyclerView, paramView1, paramView2);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {}
  
  @Nullable
  public Parcelable onSaveInstanceState()
  {
    return null;
  }
  
  public void onScrollStateChanged(int paramInt) {}
  
  public void onSmoothScrollerStopped(RecyclerView.SmoothScroller paramSmoothScroller)
  {
    if (mSmoothScroller == paramSmoothScroller) {
      mSmoothScroller = null;
    }
  }
  
  public boolean performAccessibilityAction(int paramInt, @Nullable Bundle paramBundle)
  {
    RecyclerView localRecyclerView = mRecyclerView;
    return performAccessibilityAction(mRecycler, mState, paramInt, paramBundle);
  }
  
  public boolean performAccessibilityAction(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState, int paramInt, @Nullable Bundle paramBundle)
  {
    paramRecycler = mRecyclerView;
    if (paramRecycler == null) {
      return false;
    }
    if (paramInt != 4096)
    {
      if (paramInt != 8192)
      {
        paramInt = 0;
        i = paramInt;
        break label169;
      }
      if (paramRecycler.canScrollVertically(-1)) {
        paramInt = -(getHeight() - getPaddingTop() - getPaddingBottom());
      } else {
        paramInt = 0;
      }
      i = paramInt;
      if (!mRecyclerView.canScrollHorizontally(-1)) {
        break label167;
      }
      i = -(getWidth() - getPaddingLeft() - getPaddingRight());
    }
    else
    {
      if (paramRecycler.canScrollVertically(1)) {
        paramInt = getHeight() - getPaddingTop() - getPaddingBottom();
      } else {
        paramInt = 0;
      }
      i = paramInt;
      if (!mRecyclerView.canScrollHorizontally(1)) {
        break label167;
      }
      i = getWidth() - getPaddingLeft() - getPaddingRight();
    }
    int j = paramInt;
    paramInt = i;
    int i = j;
    break label169;
    label167:
    paramInt = 0;
    label169:
    if ((i == 0) && (paramInt == 0)) {
      return false;
    }
    mRecyclerView.smoothScrollBy(paramInt, i, null, Integer.MIN_VALUE, true);
    return true;
  }
  
  public boolean performAccessibilityActionForItem(@NonNull View paramView, int paramInt, @Nullable Bundle paramBundle)
  {
    RecyclerView localRecyclerView = mRecyclerView;
    return performAccessibilityActionForItem(mRecycler, mState, paramView, paramInt, paramBundle);
  }
  
  public boolean performAccessibilityActionForItem(@NonNull RecyclerView.Recycler paramRecycler, @NonNull RecyclerView.State paramState, @NonNull View paramView, int paramInt, @Nullable Bundle paramBundle)
  {
    return false;
  }
  
  public void postOnAnimation(Runnable paramRunnable)
  {
    RecyclerView localRecyclerView = mRecyclerView;
    if (localRecyclerView != null) {
      ViewCompat.postOnAnimation(localRecyclerView, paramRunnable);
    }
  }
  
  public void removeAllViews()
  {
    for (int i = getChildCount() - 1; i >= 0; i--) {
      mChildHelper.removeViewAt(i);
    }
  }
  
  public void removeAndRecycleAllViews(@NonNull RecyclerView.Recycler paramRecycler)
  {
    for (int i = getChildCount() - 1; i >= 0; i--) {
      if (!RecyclerView.getChildViewHolderInt(getChildAt(i)).shouldIgnore()) {
        removeAndRecycleViewAt(i, paramRecycler);
      }
    }
  }
  
  public void removeAndRecycleScrapInt(RecyclerView.Recycler paramRecycler)
  {
    int i = paramRecycler.getScrapCount();
    for (int j = i - 1; j >= 0; j--)
    {
      View localView = paramRecycler.getScrapViewAt(j);
      RecyclerView.ViewHolder localViewHolder = RecyclerView.getChildViewHolderInt(localView);
      if (!localViewHolder.shouldIgnore())
      {
        localViewHolder.setIsRecyclable(false);
        if (localViewHolder.isTmpDetached()) {
          mRecyclerView.removeDetachedView(localView, false);
        }
        RecyclerView.ItemAnimator localItemAnimator = mRecyclerView.mItemAnimator;
        if (localItemAnimator != null) {
          localItemAnimator.endAnimation(localViewHolder);
        }
        localViewHolder.setIsRecyclable(true);
        paramRecycler.quickRecycleScrapView(localView);
      }
    }
    paramRecycler.clearScrap();
    if (i > 0) {
      mRecyclerView.invalidate();
    }
  }
  
  public void removeAndRecycleView(@NonNull View paramView, @NonNull RecyclerView.Recycler paramRecycler)
  {
    removeView(paramView);
    paramRecycler.recycleView(paramView);
  }
  
  public void removeAndRecycleViewAt(int paramInt, @NonNull RecyclerView.Recycler paramRecycler)
  {
    View localView = getChildAt(paramInt);
    removeViewAt(paramInt);
    paramRecycler.recycleView(localView);
  }
  
  public boolean removeCallbacks(Runnable paramRunnable)
  {
    RecyclerView localRecyclerView = mRecyclerView;
    if (localRecyclerView != null) {
      return localRecyclerView.removeCallbacks(paramRunnable);
    }
    return false;
  }
  
  public void removeDetachedView(@NonNull View paramView)
  {
    mRecyclerView.removeDetachedView(paramView, false);
  }
  
  public void removeView(View paramView)
  {
    mChildHelper.removeView(paramView);
  }
  
  public void removeViewAt(int paramInt)
  {
    if (getChildAt(paramInt) != null) {
      mChildHelper.removeViewAt(paramInt);
    }
  }
  
  public boolean requestChildRectangleOnScreen(@NonNull RecyclerView paramRecyclerView, @NonNull View paramView, @NonNull Rect paramRect, boolean paramBoolean)
  {
    return requestChildRectangleOnScreen(paramRecyclerView, paramView, paramRect, paramBoolean, false);
  }
  
  public boolean requestChildRectangleOnScreen(@NonNull RecyclerView paramRecyclerView, @NonNull View paramView, @NonNull Rect paramRect, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramView = getChildRectangleOnScreenScrollAmount(paramView, paramRect);
    int i = paramView[0];
    int j = paramView[1];
    if (((paramBoolean2) && (!isFocusedChildVisibleAfterScrolling(paramRecyclerView, i, j))) || ((i == 0) && (j == 0))) {
      return false;
    }
    if (paramBoolean1) {
      paramRecyclerView.scrollBy(i, j);
    } else {
      paramRecyclerView.smoothScrollBy(i, j);
    }
    return true;
  }
  
  public void requestLayout()
  {
    RecyclerView localRecyclerView = mRecyclerView;
    if (localRecyclerView != null) {
      localRecyclerView.requestLayout();
    }
  }
  
  public void requestSimpleAnimationsInNextLayout()
  {
    mRequestedSimpleAnimations = true;
  }
  
  public int scrollHorizontallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return 0;
  }
  
  public void scrollToPosition(int paramInt) {}
  
  public int scrollVerticallyBy(int paramInt, RecyclerView.Recycler paramRecycler, RecyclerView.State paramState)
  {
    return 0;
  }
  
  @Deprecated
  public void setAutoMeasureEnabled(boolean paramBoolean)
  {
    mAutoMeasure = paramBoolean;
  }
  
  public void setExactMeasureSpecsFrom(RecyclerView paramRecyclerView)
  {
    setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getHeight(), 1073741824));
  }
  
  public final void setItemPrefetchEnabled(boolean paramBoolean)
  {
    if (paramBoolean != mItemPrefetchEnabled)
    {
      mItemPrefetchEnabled = paramBoolean;
      mPrefetchMaxCountObserved = 0;
      RecyclerView localRecyclerView = mRecyclerView;
      if (localRecyclerView != null) {
        mRecycler.updateViewCacheSize();
      }
    }
  }
  
  public void setMeasureSpecs(int paramInt1, int paramInt2)
  {
    mWidth = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = View.MeasureSpec.getMode(paramInt1);
    mWidthMode = paramInt1;
    if ((paramInt1 == 0) && (!RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC)) {
      mWidth = 0;
    }
    mHeight = View.MeasureSpec.getSize(paramInt2);
    paramInt1 = View.MeasureSpec.getMode(paramInt2);
    mHeightMode = paramInt1;
    if ((paramInt1 == 0) && (!RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC)) {
      mHeight = 0;
    }
  }
  
  public void setMeasuredDimension(int paramInt1, int paramInt2)
  {
    RecyclerView.access$300(mRecyclerView, paramInt1, paramInt2);
  }
  
  public void setMeasuredDimension(Rect paramRect, int paramInt1, int paramInt2)
  {
    int i = paramRect.width();
    int j = getPaddingLeft();
    int k = getPaddingRight();
    int m = paramRect.height();
    int n = getPaddingTop();
    int i1 = getPaddingBottom();
    setMeasuredDimension(chooseSize(paramInt1, k + (j + i), getMinimumWidth()), chooseSize(paramInt2, i1 + (n + m), getMinimumHeight()));
  }
  
  public void setMeasuredDimensionFromChildren(int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    if (i == 0)
    {
      mRecyclerView.defaultOnMeasure(paramInt1, paramInt2);
      return;
    }
    int j = 0;
    int k = Integer.MIN_VALUE;
    int m = Integer.MAX_VALUE;
    int n = m;
    int i1 = Integer.MIN_VALUE;
    while (j < i)
    {
      View localView = getChildAt(j);
      Rect localRect = mRecyclerView.mTempRect;
      getDecoratedBoundsWithMargins(localView, localRect);
      int i2 = left;
      int i3 = m;
      if (i2 < m) {
        i3 = i2;
      }
      i2 = right;
      m = k;
      if (i2 > k) {
        m = i2;
      }
      k = top;
      i2 = n;
      if (k < n) {
        i2 = k;
      }
      k = bottom;
      n = i1;
      if (k > i1) {
        n = k;
      }
      j++;
      k = m;
      i1 = n;
      m = i3;
      n = i2;
    }
    mRecyclerView.mTempRect.set(m, n, k, i1);
    setMeasuredDimension(mRecyclerView.mTempRect, paramInt1, paramInt2);
  }
  
  public void setMeasurementCacheEnabled(boolean paramBoolean)
  {
    mMeasurementCacheEnabled = paramBoolean;
  }
  
  public void setRecyclerView(RecyclerView paramRecyclerView)
  {
    if (paramRecyclerView == null)
    {
      mRecyclerView = null;
      mChildHelper = null;
      mWidth = 0;
      mHeight = 0;
    }
    else
    {
      mRecyclerView = paramRecyclerView;
      mChildHelper = mChildHelper;
      mWidth = paramRecyclerView.getWidth();
      mHeight = paramRecyclerView.getHeight();
    }
    mWidthMode = 1073741824;
    mHeightMode = 1073741824;
  }
  
  public boolean shouldMeasureChild(View paramView, int paramInt1, int paramInt2, RecyclerView.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if ((!paramView.isLayoutRequested()) && (mMeasurementCacheEnabled) && (isMeasurementUpToDate(paramView.getWidth(), paramInt1, width)) && (isMeasurementUpToDate(paramView.getHeight(), paramInt2, height))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean shouldMeasureTwice()
  {
    return false;
  }
  
  public boolean shouldReMeasureChild(View paramView, int paramInt1, int paramInt2, RecyclerView.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if ((mMeasurementCacheEnabled) && (isMeasurementUpToDate(paramView.getMeasuredWidth(), paramInt1, width)) && (isMeasurementUpToDate(paramView.getMeasuredHeight(), paramInt2, height))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void smoothScrollToPosition(RecyclerView paramRecyclerView, RecyclerView.State paramState, int paramInt)
  {
    Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
  }
  
  public void startSmoothScroll(RecyclerView.SmoothScroller paramSmoothScroller)
  {
    RecyclerView.SmoothScroller localSmoothScroller = mSmoothScroller;
    if ((localSmoothScroller != null) && (paramSmoothScroller != localSmoothScroller) && (localSmoothScroller.isRunning())) {
      mSmoothScroller.stop();
    }
    mSmoothScroller = paramSmoothScroller;
    paramSmoothScroller.start(mRecyclerView, this);
  }
  
  public void stopIgnoringView(@NonNull View paramView)
  {
    paramView = RecyclerView.getChildViewHolderInt(paramView);
    paramView.stopIgnoring();
    paramView.resetInternal();
    paramView.addFlags(4);
  }
  
  public void stopSmoothScroller()
  {
    RecyclerView.SmoothScroller localSmoothScroller = mSmoothScroller;
    if (localSmoothScroller != null) {
      localSmoothScroller.stop();
    }
  }
  
  public boolean supportsPredictiveItemAnimations()
  {
    return false;
  }
  
  public static abstract interface LayoutPrefetchRegistry
  {
    public abstract void addPosition(int paramInt1, int paramInt2);
  }
  
  public static class Properties
  {
    public int orientation;
    public boolean reverseLayout;
    public int spanCount;
    public boolean stackFromEnd;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.LayoutManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */