package androidx.core.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.R.attr;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import java.util.ArrayList;
import java.util.List;
import z2;

public class NestedScrollView
  extends FrameLayout
  implements NestedScrollingParent3, NestedScrollingChild3, ScrollingView
{
  private static final AccessibilityDelegate ACCESSIBILITY_DELEGATE = new AccessibilityDelegate();
  public static final int ANIMATED_SCROLL_GAP = 250;
  private static final float DECELERATION_RATE = (float)(Math.log(0.78D) / Math.log(0.9D));
  private static final int DEFAULT_SMOOTH_SCROLL_DURATION = 250;
  private static final float FLING_DESTRETCH_FACTOR = 4.0F;
  private static final float INFLEXION = 0.35F;
  private static final int INVALID_POINTER = -1;
  public static final float MAX_SCROLL_FACTOR = 0.5F;
  private static final int[] SCROLLVIEW_STYLEABLE = { 16843130 };
  private static final float SCROLL_FRICTION = 0.015F;
  private static final String TAG = "NestedScrollView";
  private int mActivePointerId = -1;
  private final NestedScrollingChildHelper mChildHelper;
  private View mChildToScrollTo = null;
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  @VisibleForTesting
  public EdgeEffect mEdgeGlowBottom;
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
  @VisibleForTesting
  public EdgeEffect mEdgeGlowTop;
  private boolean mFillViewport;
  private boolean mIsBeingDragged = false;
  private boolean mIsLaidOut = false;
  private boolean mIsLayoutDirty = true;
  private int mLastMotionY;
  private long mLastScroll;
  private int mLastScrollerY;
  private int mMaximumVelocity;
  private int mMinimumVelocity;
  private int mNestedYOffset;
  private OnScrollChangeListener mOnScrollChangeListener;
  private final NestedScrollingParentHelper mParentHelper;
  private final float mPhysicalCoeff;
  private SavedState mSavedState;
  private final int[] mScrollConsumed = new int[2];
  private final int[] mScrollOffset = new int[2];
  private OverScroller mScroller;
  private boolean mSmoothScrollingEnabled = true;
  private final Rect mTempRect = new Rect();
  private int mTouchSlop;
  private VelocityTracker mVelocityTracker;
  private float mVerticalScrollFactor;
  
  public NestedScrollView(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NestedScrollView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, R.attr.nestedScrollViewStyle);
  }
  
  public NestedScrollView(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    mEdgeGlowTop = EdgeEffectCompat.create(paramContext, paramAttributeSet);
    mEdgeGlowBottom = EdgeEffectCompat.create(paramContext, paramAttributeSet);
    mPhysicalCoeff = (getResourcesgetDisplayMetricsdensity * 160.0F * 386.0878F * 0.84F);
    initScrollView();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, SCROLLVIEW_STYLEABLE, paramInt, 0);
    setFillViewport(paramContext.getBoolean(0, false));
    paramContext.recycle();
    mParentHelper = new NestedScrollingParentHelper(this);
    mChildHelper = new NestedScrollingChildHelper(this);
    setNestedScrollingEnabled(true);
    ViewCompat.setAccessibilityDelegate(this, ACCESSIBILITY_DELEGATE);
  }
  
  private void abortAnimatedScroll()
  {
    mScroller.abortAnimation();
    stopNestedScroll(1);
  }
  
  private boolean canOverScroll()
  {
    int i = getOverScrollMode();
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i != 0) {
      if ((i == 1) && (getScrollRange() > 0)) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  private boolean canScroll()
  {
    int i = getChildCount();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      bool2 = bool1;
      if (localView.getHeight() + topMargin + bottomMargin > getHeight() - getPaddingTop() - getPaddingBottom()) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  private static int clamp(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 < paramInt3) && (paramInt1 >= 0))
    {
      if (paramInt2 + paramInt1 > paramInt3) {
        return paramInt3 - paramInt2;
      }
      return paramInt1;
    }
    return 0;
  }
  
  private void doScrollY(int paramInt)
  {
    if (paramInt != 0) {
      if (mSmoothScrollingEnabled) {
        smoothScrollBy(0, paramInt);
      } else {
        scrollBy(0, paramInt);
      }
    }
  }
  
  private boolean edgeEffectFling(int paramInt)
  {
    if (EdgeEffectCompat.getDistance(mEdgeGlowTop) != 0.0F)
    {
      if (shouldAbsorb(mEdgeGlowTop, paramInt)) {
        mEdgeGlowTop.onAbsorb(paramInt);
      } else {
        fling(-paramInt);
      }
    }
    else
    {
      if (EdgeEffectCompat.getDistance(mEdgeGlowBottom) == 0.0F) {
        break label94;
      }
      EdgeEffect localEdgeEffect = mEdgeGlowBottom;
      paramInt = -paramInt;
      if (shouldAbsorb(localEdgeEffect, paramInt)) {
        mEdgeGlowBottom.onAbsorb(paramInt);
      } else {
        fling(paramInt);
      }
    }
    boolean bool = true;
    return bool;
    label94:
    bool = false;
    return bool;
  }
  
  private void endDrag()
  {
    mIsBeingDragged = false;
    recycleVelocityTracker();
    stopNestedScroll(0);
    mEdgeGlowTop.onRelease();
    mEdgeGlowBottom.onRelease();
  }
  
  private View findFocusableViewInBounds(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = getFocusables(2);
    int i = localArrayList.size();
    Object localObject1 = null;
    int j = 0;
    int i1;
    for (int k = j; j < i; k = i1)
    {
      View localView = (View)localArrayList.get(j);
      int m = localView.getTop();
      int n = localView.getBottom();
      Object localObject2 = localObject1;
      i1 = k;
      if (paramInt1 < n)
      {
        localObject2 = localObject1;
        i1 = k;
        if (m < paramInt2)
        {
          int i2;
          if ((paramInt1 < m) && (n < paramInt2)) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          if (localObject1 == null)
          {
            localObject2 = localView;
            i1 = i2;
          }
          else
          {
            if (((paramBoolean) && (m < ((View)localObject1).getTop())) || ((!paramBoolean) && (n > ((View)localObject1).getBottom()))) {
              n = 1;
            } else {
              n = 0;
            }
            if (k != 0)
            {
              localObject2 = localObject1;
              i1 = k;
              if (i2 == 0) {
                break label233;
              }
              localObject2 = localObject1;
              i1 = k;
              if (n == 0) {
                break label233;
              }
            }
            else
            {
              if (i2 != 0)
              {
                localObject2 = localView;
                i1 = 1;
                break label233;
              }
              localObject2 = localObject1;
              i1 = k;
              if (n == 0) {
                break label233;
              }
            }
            localObject2 = localView;
            i1 = k;
          }
        }
      }
      label233:
      j++;
      localObject1 = localObject2;
    }
    return (View)localObject1;
  }
  
  private float getSplineFlingDistance(int paramInt)
  {
    double d1 = Math.log(Math.abs(paramInt) * 0.35F / (mPhysicalCoeff * 0.015F));
    float f = DECELERATION_RATE;
    double d2 = f;
    double d3 = mPhysicalCoeff * 0.015F;
    return (float)(Math.exp(f / (d2 - 1.0D) * d1) * d3);
  }
  
  private float getVerticalScrollFactorCompat()
  {
    if (mVerticalScrollFactor == 0.0F)
    {
      TypedValue localTypedValue = new TypedValue();
      Context localContext = getContext();
      if (localContext.getTheme().resolveAttribute(16842829, localTypedValue, true)) {
        mVerticalScrollFactor = localTypedValue.getDimension(localContext.getResources().getDisplayMetrics());
      } else {
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
      }
    }
    return mVerticalScrollFactor;
  }
  
  private boolean inChild(int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (i > 0)
    {
      i = getScrollY();
      View localView = getChildAt(0);
      bool2 = bool1;
      if (paramInt2 >= localView.getTop() - i)
      {
        bool2 = bool1;
        if (paramInt2 < localView.getBottom() - i)
        {
          bool2 = bool1;
          if (paramInt1 >= localView.getLeft())
          {
            bool2 = bool1;
            if (paramInt1 < localView.getRight()) {
              bool2 = true;
            }
          }
        }
      }
    }
    return bool2;
  }
  
  private void initOrResetVelocityTracker()
  {
    VelocityTracker localVelocityTracker = mVelocityTracker;
    if (localVelocityTracker == null) {
      mVelocityTracker = VelocityTracker.obtain();
    } else {
      localVelocityTracker.clear();
    }
  }
  
  private void initScrollView()
  {
    mScroller = new OverScroller(getContext());
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    mTouchSlop = localViewConfiguration.getScaledTouchSlop();
    mMinimumVelocity = localViewConfiguration.getScaledMinimumFlingVelocity();
    mMaximumVelocity = localViewConfiguration.getScaledMaximumFlingVelocity();
  }
  
  private void initVelocityTrackerIfNotExists()
  {
    if (mVelocityTracker == null) {
      mVelocityTracker = VelocityTracker.obtain();
    }
  }
  
  private boolean isOffScreen(View paramView)
  {
    return isWithinDeltaOfScreen(paramView, 0, getHeight()) ^ true;
  }
  
  private static boolean isViewDescendantOf(View paramView1, View paramView2)
  {
    boolean bool = true;
    if (paramView1 == paramView2) {
      return true;
    }
    paramView1 = paramView1.getParent();
    if ((!(paramView1 instanceof ViewGroup)) || (!isViewDescendantOf((View)paramView1, paramView2))) {
      bool = false;
    }
    return bool;
  }
  
  private boolean isWithinDeltaOfScreen(View paramView, int paramInt1, int paramInt2)
  {
    paramView.getDrawingRect(mTempRect);
    offsetDescendantRectToMyCoords(paramView, mTempRect);
    boolean bool;
    if ((mTempRect.bottom + paramInt1 >= getScrollY()) && (mTempRect.top - paramInt1 <= getScrollY() + paramInt2)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void onNestedScrollInternal(int paramInt1, int paramInt2, @Nullable int[] paramArrayOfInt)
  {
    int i = getScrollY();
    scrollBy(0, paramInt1);
    i = getScrollY() - i;
    if (paramArrayOfInt != null) {
      paramArrayOfInt[1] += i;
    }
    mChildHelper.dispatchNestedScroll(0, i, 0, paramInt1 - i, null, paramInt2, paramArrayOfInt);
  }
  
  private void onSecondaryPointerUp(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == mActivePointerId)
    {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      }
      mLastMotionY = ((int)paramMotionEvent.getY(i));
      mActivePointerId = paramMotionEvent.getPointerId(i);
      paramMotionEvent = mVelocityTracker;
      if (paramMotionEvent != null) {
        paramMotionEvent.clear();
      }
    }
  }
  
  private void recycleVelocityTracker()
  {
    VelocityTracker localVelocityTracker = mVelocityTracker;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      mVelocityTracker = null;
    }
  }
  
  private int releaseVerticalGlow(int paramInt, float paramFloat)
  {
    float f1 = paramFloat / getWidth();
    float f2 = paramInt / getHeight();
    float f3 = EdgeEffectCompat.getDistance(mEdgeGlowTop);
    paramFloat = 0.0F;
    if (f3 != 0.0F)
    {
      f1 = -EdgeEffectCompat.onPullDistance(mEdgeGlowTop, -f2, f1);
      paramFloat = f1;
      if (EdgeEffectCompat.getDistance(mEdgeGlowTop) == 0.0F)
      {
        mEdgeGlowTop.onRelease();
        paramFloat = f1;
      }
    }
    for (;;)
    {
      break;
      if (EdgeEffectCompat.getDistance(mEdgeGlowBottom) == 0.0F) {
        break;
      }
      f1 = EdgeEffectCompat.onPullDistance(mEdgeGlowBottom, f2, 1.0F - f1);
      paramFloat = f1;
      if (EdgeEffectCompat.getDistance(mEdgeGlowBottom) == 0.0F)
      {
        mEdgeGlowBottom.onRelease();
        paramFloat = f1;
      }
    }
    paramInt = Math.round(paramFloat * getHeight());
    if (paramInt != 0) {
      invalidate();
    }
    return paramInt;
  }
  
  private void runAnimatedScroll(boolean paramBoolean)
  {
    if (paramBoolean) {
      startNestedScroll(2, 1);
    } else {
      stopNestedScroll(1);
    }
    mLastScrollerY = getScrollY();
    ViewCompat.postInvalidateOnAnimation(this);
  }
  
  private boolean scrollAndFocus(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getHeight();
    int j = getScrollY();
    i += j;
    boolean bool1 = false;
    boolean bool2;
    if (paramInt1 == 33) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    View localView = findFocusableViewInBounds(bool2, paramInt2, paramInt3);
    Object localObject = localView;
    if (localView == null) {
      localObject = this;
    }
    if ((paramInt2 >= j) && (paramInt3 <= i))
    {
      bool2 = bool1;
    }
    else
    {
      if (bool2) {
        paramInt2 -= j;
      } else {
        paramInt2 = paramInt3 - i;
      }
      doScrollY(paramInt2);
      bool2 = true;
    }
    if (localObject != findFocus()) {
      ((View)localObject).requestFocus(paramInt1);
    }
    return bool2;
  }
  
  private void scrollToChild(View paramView)
  {
    paramView.getDrawingRect(mTempRect);
    offsetDescendantRectToMyCoords(paramView, mTempRect);
    int i = computeScrollDeltaToGetChildRectOnScreen(mTempRect);
    if (i != 0) {
      scrollBy(0, i);
    }
  }
  
  private boolean scrollToChildRect(Rect paramRect, boolean paramBoolean)
  {
    int i = computeScrollDeltaToGetChildRectOnScreen(paramRect);
    boolean bool;
    if (i != 0) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool) {
      if (paramBoolean) {
        scrollBy(0, i);
      } else {
        smoothScrollBy(0, i);
      }
    }
    return bool;
  }
  
  private boolean shouldAbsorb(@NonNull EdgeEffect paramEdgeEffect, int paramInt)
  {
    boolean bool = true;
    if (paramInt > 0) {
      return true;
    }
    float f1 = EdgeEffectCompat.getDistance(paramEdgeEffect);
    float f2 = getHeight();
    if (getSplineFlingDistance(-paramInt) >= f1 * f2) {
      bool = false;
    }
    return bool;
  }
  
  private void smoothScrollBy(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    if (getChildCount() == 0) {
      return;
    }
    if (AnimationUtils.currentAnimationTimeMillis() - mLastScroll > 250L)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      int i = localView.getHeight();
      int j = topMargin;
      int k = bottomMargin;
      int m = getHeight();
      int n = getPaddingTop();
      int i1 = getPaddingBottom();
      paramInt1 = getScrollY();
      paramInt2 = Math.max(0, Math.min(paramInt2 + paramInt1, Math.max(0, i + j + k - (m - n - i1))));
      mScroller.startScroll(getScrollX(), paramInt1, 0, paramInt2 - paramInt1, paramInt3);
      runAnimatedScroll(paramBoolean);
    }
    else
    {
      if (!mScroller.isFinished()) {
        abortAnimatedScroll();
      }
      scrollBy(paramInt1, paramInt2);
    }
    mLastScroll = AnimationUtils.currentAnimationTimeMillis();
  }
  
  private boolean stopGlowAnimations(MotionEvent paramMotionEvent)
  {
    float f = EdgeEffectCompat.getDistance(mEdgeGlowTop);
    boolean bool1 = true;
    boolean bool2;
    if (f != 0.0F)
    {
      EdgeEffectCompat.onPullDistance(mEdgeGlowTop, 0.0F, paramMotionEvent.getX() / getWidth());
      bool2 = true;
    }
    else
    {
      bool2 = false;
    }
    if (EdgeEffectCompat.getDistance(mEdgeGlowBottom) != 0.0F)
    {
      EdgeEffectCompat.onPullDistance(mEdgeGlowBottom, 0.0F, 1.0F - paramMotionEvent.getX() / getWidth());
      bool2 = bool1;
    }
    return bool2;
  }
  
  public void addView(@NonNull View paramView)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, int paramInt)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramInt);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() <= 0)
    {
      super.addView(paramView, paramLayoutParams);
      return;
    }
    throw new IllegalStateException("ScrollView can host only one direct child");
  }
  
  public boolean arrowScroll(int paramInt)
  {
    View localView1 = findFocus();
    View localView2 = localView1;
    if (localView1 == this) {
      localView2 = null;
    }
    localView1 = FocusFinder.getInstance().findNextFocus(this, localView2, paramInt);
    int i = getMaxScrollAmount();
    if ((localView1 != null) && (isWithinDeltaOfScreen(localView1, i, getHeight())))
    {
      localView1.getDrawingRect(mTempRect);
      offsetDescendantRectToMyCoords(localView1, mTempRect);
      doScrollY(computeScrollDeltaToGetChildRectOnScreen(mTempRect));
      localView1.requestFocus(paramInt);
    }
    else
    {
      int j;
      if ((paramInt == 33) && (getScrollY() < i))
      {
        j = getScrollY();
      }
      else
      {
        j = i;
        if (paramInt == 130)
        {
          j = i;
          if (getChildCount() > 0)
          {
            localView1 = getChildAt(0);
            FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView1.getLayoutParams();
            int k = localView1.getBottom();
            int m = bottomMargin;
            j = getScrollY();
            j = Math.min(k + m - (getHeight() + j - getPaddingBottom()), i);
          }
        }
      }
      if (j == 0) {
        return false;
      }
      if (paramInt != 130) {
        j = -j;
      }
      doScrollY(j);
    }
    if ((localView2 != null) && (localView2.isFocused()) && (isOffScreen(localView2)))
    {
      paramInt = getDescendantFocusability();
      setDescendantFocusability(131072);
      requestFocus();
      setDescendantFocusability(paramInt);
    }
    return true;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int computeHorizontalScrollExtent()
  {
    return super.computeHorizontalScrollExtent();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int computeHorizontalScrollOffset()
  {
    return super.computeHorizontalScrollOffset();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int computeHorizontalScrollRange()
  {
    return super.computeHorizontalScrollRange();
  }
  
  public void computeScroll()
  {
    if (mScroller.isFinished()) {
      return;
    }
    mScroller.computeScrollOffset();
    int i = mScroller.getCurrY();
    int j = consumeFlingInVerticalStretch(i - mLastScrollerY);
    mLastScrollerY = i;
    int[] arrayOfInt = mScrollConsumed;
    int k = 0;
    arrayOfInt[1] = 0;
    dispatchNestedPreScroll(0, j, arrayOfInt, null, 1);
    i = j - mScrollConsumed[1];
    int m = getScrollRange();
    j = i;
    if (i != 0)
    {
      j = getScrollY();
      overScrollByCompat(0, i, getScrollX(), j, 0, m, 0, 0, false);
      j = getScrollY() - j;
      i -= j;
      arrayOfInt = mScrollConsumed;
      arrayOfInt[1] = 0;
      dispatchNestedScroll(0, j, 0, i, mScrollOffset, 1, arrayOfInt);
      j = i - mScrollConsumed[1];
    }
    if (j != 0)
    {
      int n = getOverScrollMode();
      if (n != 0)
      {
        i = k;
        if (n == 1)
        {
          i = k;
          if (m <= 0) {}
        }
      }
      else
      {
        i = 1;
      }
      if (i != 0) {
        if (j < 0)
        {
          if (mEdgeGlowTop.isFinished()) {
            mEdgeGlowTop.onAbsorb((int)mScroller.getCurrVelocity());
          }
        }
        else if (mEdgeGlowBottom.isFinished()) {
          mEdgeGlowBottom.onAbsorb((int)mScroller.getCurrVelocity());
        }
      }
      abortAnimatedScroll();
    }
    if (!mScroller.isFinished()) {
      ViewCompat.postInvalidateOnAnimation(this);
    } else {
      stopNestedScroll(1);
    }
  }
  
  public int computeScrollDeltaToGetChildRectOnScreen(Rect paramRect)
  {
    int i = getChildCount();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    int k = getHeight();
    i = getScrollY();
    int m = i + k;
    int n = getVerticalFadingEdgeLength();
    int i1 = i;
    if (top > 0) {
      i1 = i + n;
    }
    View localView = getChildAt(0);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    if (bottom < localView.getHeight() + topMargin + bottomMargin) {
      n = m - n;
    } else {
      n = m;
    }
    int i2 = bottom;
    if ((i2 > n) && (top > i1))
    {
      if (paramRect.height() > k) {
        i = top - i1;
      } else {
        i = bottom - n;
      }
      i = Math.min(i + 0, localView.getBottom() + bottomMargin - m);
    }
    else
    {
      i = j;
      if (top < i1)
      {
        i = j;
        if (i2 < n)
        {
          if (paramRect.height() > k) {
            i = 0 - (n - bottom);
          } else {
            i = 0 - (i1 - top);
          }
          i = Math.max(i, -getScrollY());
        }
      }
    }
    return i;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int computeVerticalScrollExtent()
  {
    return super.computeVerticalScrollExtent();
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int computeVerticalScrollOffset()
  {
    return Math.max(0, super.computeVerticalScrollOffset());
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public int computeVerticalScrollRange()
  {
    int i = getChildCount();
    int j = getHeight() - getPaddingBottom() - getPaddingTop();
    if (i == 0) {
      return j;
    }
    View localView = getChildAt(0);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    i = localView.getBottom() + bottomMargin;
    int k = getScrollY();
    int m = Math.max(0, i - j);
    if (k < 0)
    {
      j = i - k;
    }
    else
    {
      j = i;
      if (k > m) {
        j = i + (k - m);
      }
    }
    return j;
  }
  
  public int consumeFlingInVerticalStretch(int paramInt)
  {
    int i = getHeight();
    float f1;
    float f2;
    if ((paramInt > 0) && (EdgeEffectCompat.getDistance(mEdgeGlowTop) != 0.0F))
    {
      f1 = -paramInt * 4.0F / i;
      f2 = -i / 4.0F;
      j = Math.round(EdgeEffectCompat.onPullDistance(mEdgeGlowTop, f1, 0.5F) * f2);
      if (j != paramInt) {
        mEdgeGlowTop.finish();
      }
      return paramInt - j;
    }
    int j = paramInt;
    if (paramInt < 0)
    {
      j = paramInt;
      if (EdgeEffectCompat.getDistance(mEdgeGlowBottom) != 0.0F)
      {
        f1 = paramInt;
        f2 = i;
        f1 = f1 * 4.0F / f2;
        f2 /= 4.0F;
        j = Math.round(EdgeEffectCompat.onPullDistance(mEdgeGlowBottom, f1, 0.5F) * f2);
        if (j != paramInt) {
          mEdgeGlowBottom.finish();
        }
        j = paramInt - j;
      }
    }
    return j;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool;
    if ((!super.dispatchKeyEvent(paramKeyEvent)) && (!executeKeyEvent(paramKeyEvent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return mChildHelper.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return mChildHelper.dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, @Nullable int[] paramArrayOfInt1, @Nullable int[] paramArrayOfInt2)
  {
    return dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, 0);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, @Nullable int[] paramArrayOfInt1, @Nullable int[] paramArrayOfInt2, int paramInt3)
  {
    return mChildHelper.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, paramInt3);
  }
  
  public void dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, @Nullable int[] paramArrayOfInt1, int paramInt5, @NonNull int[] paramArrayOfInt2)
  {
    mChildHelper.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt1, paramInt5, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, @Nullable int[] paramArrayOfInt)
  {
    return mChildHelper.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, @Nullable int[] paramArrayOfInt, int paramInt5)
  {
    return mChildHelper.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, paramInt5);
  }
  
  public void draw(@NonNull Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getScrollY();
    boolean bool = mEdgeGlowTop.isFinished();
    int j = 0;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    if (!bool)
    {
      k = paramCanvas.save();
      m = getWidth();
      n = getHeight();
      i1 = Math.min(0, i);
      if (Api21Impl.getClipToPadding(this))
      {
        i2 = getPaddingLeft();
        m -= getPaddingRight() + i2;
        i2 = getPaddingLeft() + 0;
      }
      else
      {
        i2 = 0;
      }
      i3 = n;
      i4 = i1;
      if (Api21Impl.getClipToPadding(this))
      {
        i4 = getPaddingTop();
        i3 = n - (getPaddingBottom() + i4);
        i4 = i1 + getPaddingTop();
      }
      paramCanvas.translate(i2, i4);
      mEdgeGlowTop.setSize(m, i3);
      if (mEdgeGlowTop.draw(paramCanvas)) {
        ViewCompat.postInvalidateOnAnimation(this);
      }
      paramCanvas.restoreToCount(k);
    }
    if (!mEdgeGlowBottom.isFinished())
    {
      k = paramCanvas.save();
      i4 = getWidth();
      n = getHeight();
      i1 = Math.max(getScrollRange(), i) + n;
      i2 = j;
      m = i4;
      if (Api21Impl.getClipToPadding(this))
      {
        m = getPaddingLeft();
        m = i4 - (getPaddingRight() + m);
        i2 = 0 + getPaddingLeft();
      }
      i3 = i1;
      i4 = n;
      if (Api21Impl.getClipToPadding(this))
      {
        i4 = getPaddingTop();
        i4 = n - (getPaddingBottom() + i4);
        i3 = i1 - getPaddingBottom();
      }
      paramCanvas.translate(i2 - m, i3);
      paramCanvas.rotate(180.0F, m, 0.0F);
      mEdgeGlowBottom.setSize(m, i4);
      if (mEdgeGlowBottom.draw(paramCanvas)) {
        ViewCompat.postInvalidateOnAnimation(this);
      }
      paramCanvas.restoreToCount(k);
    }
  }
  
  public boolean executeKeyEvent(@NonNull KeyEvent paramKeyEvent)
  {
    mTempRect.setEmpty();
    boolean bool1 = canScroll();
    boolean bool2 = false;
    boolean bool3 = false;
    int i = 130;
    if (!bool1)
    {
      bool1 = bool3;
      if (isFocused())
      {
        bool1 = bool3;
        if (paramKeyEvent.getKeyCode() != 4)
        {
          View localView = findFocus();
          paramKeyEvent = localView;
          if (localView == this) {
            paramKeyEvent = null;
          }
          paramKeyEvent = FocusFinder.getInstance().findNextFocus(this, paramKeyEvent, 130);
          bool1 = bool3;
          if (paramKeyEvent != null)
          {
            bool1 = bool3;
            if (paramKeyEvent != this)
            {
              bool1 = bool3;
              if (paramKeyEvent.requestFocus(130)) {
                bool1 = true;
              }
            }
          }
        }
      }
      return bool1;
    }
    bool1 = bool2;
    if (paramKeyEvent.getAction() == 0)
    {
      int j = paramKeyEvent.getKeyCode();
      if (j != 19)
      {
        if (j != 20)
        {
          if (j != 62)
          {
            bool1 = bool2;
          }
          else
          {
            if (paramKeyEvent.isShiftPressed()) {
              i = 33;
            }
            pageScroll(i);
            bool1 = bool2;
          }
        }
        else if (!paramKeyEvent.isAltPressed()) {
          bool1 = arrowScroll(130);
        } else {
          bool1 = fullScroll(130);
        }
      }
      else if (!paramKeyEvent.isAltPressed()) {
        bool1 = arrowScroll(33);
      } else {
        bool1 = fullScroll(33);
      }
    }
    return bool1;
  }
  
  public void fling(int paramInt)
  {
    if (getChildCount() > 0)
    {
      mScroller.fling(getScrollX(), getScrollY(), 0, paramInt, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
      runAnimatedScroll(true);
    }
  }
  
  public boolean fullScroll(int paramInt)
  {
    int i;
    if (paramInt == 130) {
      i = 1;
    } else {
      i = 0;
    }
    int j = getHeight();
    Object localObject = mTempRect;
    top = 0;
    bottom = j;
    if (i != 0)
    {
      i = getChildCount();
      if (i > 0)
      {
        localObject = getChildAt(i - 1);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)((View)localObject).getLayoutParams();
        Rect localRect = mTempRect;
        int k = ((View)localObject).getBottom();
        i = bottomMargin;
        bottom = (getPaddingBottom() + (k + i));
        localObject = mTempRect;
        top = (bottom - j);
      }
    }
    localObject = mTempRect;
    return scrollAndFocus(paramInt, top, bottom);
  }
  
  public float getBottomFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    View localView = getChildAt(0);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    int i = getVerticalFadingEdgeLength();
    int j = getHeight();
    int k = getPaddingBottom();
    j = localView.getBottom() + bottomMargin - getScrollY() - (j - k);
    if (j < i) {
      return j / i;
    }
    return 1.0F;
  }
  
  public int getMaxScrollAmount()
  {
    return (int)(getHeight() * 0.5F);
  }
  
  public int getNestedScrollAxes()
  {
    return mParentHelper.getNestedScrollAxes();
  }
  
  public int getScrollRange()
  {
    int i = getChildCount();
    int j = 0;
    if (i > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      j = Math.max(0, localView.getHeight() + topMargin + bottomMargin - (getHeight() - getPaddingTop() - getPaddingBottom()));
    }
    return j;
  }
  
  public float getTopFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    int i = getVerticalFadingEdgeLength();
    int j = getScrollY();
    if (j < i) {
      return j / i;
    }
    return 1.0F;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return hasNestedScrollingParent(0);
  }
  
  public boolean hasNestedScrollingParent(int paramInt)
  {
    return mChildHelper.hasNestedScrollingParent(paramInt);
  }
  
  public boolean isFillViewport()
  {
    return mFillViewport;
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return mChildHelper.isNestedScrollingEnabled();
  }
  
  public boolean isSmoothScrollingEnabled()
  {
    return mSmoothScrollingEnabled;
  }
  
  public void measureChild(@NonNull View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    paramInt2 = getPaddingLeft();
    paramView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + paramInt2, width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }
  
  public void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramInt3 = getPaddingLeft();
    paramView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + paramInt3 + leftMargin + rightMargin + paramInt2, width), View.MeasureSpec.makeMeasureSpec(topMargin + bottomMargin, 0));
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    mIsLaidOut = false;
  }
  
  public boolean onGenericMotionEvent(@NonNull MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    int j = 0;
    boolean bool = false;
    if ((i == 8) && (!mIsBeingDragged))
    {
      float f;
      if (MotionEventCompat.isFromSource(paramMotionEvent, 2)) {
        f = paramMotionEvent.getAxisValue(9);
      } else if (MotionEventCompat.isFromSource(paramMotionEvent, 4194304)) {
        f = paramMotionEvent.getAxisValue(26);
      } else {
        f = 0.0F;
      }
      if (f != 0.0F)
      {
        i = (int)(f * getVerticalScrollFactorCompat());
        int k = getScrollRange();
        int m = getScrollY();
        int n = m - i;
        if (n < 0)
        {
          if ((canOverScroll()) && (!MotionEventCompat.isFromSource(paramMotionEvent, 8194))) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            EdgeEffectCompat.onPullDistance(mEdgeGlowTop, -n / getHeight(), 0.5F);
            mEdgeGlowTop.onRelease();
            invalidate();
            bool = true;
            i = j;
          }
          else
          {
            bool = false;
            i = j;
          }
        }
        else if (n > k)
        {
          if ((canOverScroll()) && (!MotionEventCompat.isFromSource(paramMotionEvent, 8194))) {
            i = 1;
          } else {
            i = 0;
          }
          if (i != 0)
          {
            EdgeEffectCompat.onPullDistance(mEdgeGlowBottom, (n - k) / getHeight(), 0.5F);
            mEdgeGlowBottom.onRelease();
            invalidate();
            bool = true;
          }
          i = k;
        }
        else
        {
          bool = false;
          i = n;
        }
        if (i != m)
        {
          super.scrollTo(getScrollX(), i);
          return true;
        }
        return bool;
      }
    }
    return false;
  }
  
  public boolean onInterceptTouchEvent(@NonNull MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    boolean bool1 = true;
    boolean bool2 = true;
    if ((i == 2) && (mIsBeingDragged)) {
      return true;
    }
    i &= 0xFF;
    if (i != 0)
    {
      if (i != 1) {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 6) {
              break label406;
            }
            onSecondaryPointerUp(paramMotionEvent);
            break label406;
          }
        }
        else
        {
          i = mActivePointerId;
          if (i == -1) {
            break label406;
          }
          int j = paramMotionEvent.findPointerIndex(i);
          if (j == -1)
          {
            paramMotionEvent = new StringBuilder();
            paramMotionEvent.append("Invalid pointerId=");
            paramMotionEvent.append(i);
            paramMotionEvent.append(" in onInterceptTouchEvent");
            Log.e("NestedScrollView", paramMotionEvent.toString());
            break label406;
          }
          i = (int)paramMotionEvent.getY(j);
          if ((Math.abs(i - mLastMotionY) <= mTouchSlop) || ((0x2 & getNestedScrollAxes()) != 0)) {
            break label406;
          }
          mIsBeingDragged = true;
          mLastMotionY = i;
          initVelocityTrackerIfNotExists();
          mVelocityTracker.addMovement(paramMotionEvent);
          mNestedYOffset = 0;
          paramMotionEvent = getParent();
          if (paramMotionEvent == null) {
            break label406;
          }
          paramMotionEvent.requestDisallowInterceptTouchEvent(true);
          break label406;
        }
      }
      mIsBeingDragged = false;
      mActivePointerId = -1;
      recycleVelocityTracker();
      if (mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
        ViewCompat.postInvalidateOnAnimation(this);
      }
      stopNestedScroll(0);
    }
    else
    {
      i = (int)paramMotionEvent.getY();
      boolean bool3;
      if (!inChild((int)paramMotionEvent.getX(), i))
      {
        bool3 = bool2;
        if (!stopGlowAnimations(paramMotionEvent)) {
          if (!mScroller.isFinished()) {
            bool3 = bool2;
          } else {
            bool3 = false;
          }
        }
        mIsBeingDragged = bool3;
        recycleVelocityTracker();
      }
      else
      {
        mLastMotionY = i;
        mActivePointerId = paramMotionEvent.getPointerId(0);
        initOrResetVelocityTracker();
        mVelocityTracker.addMovement(paramMotionEvent);
        mScroller.computeScrollOffset();
        bool3 = bool1;
        if (!stopGlowAnimations(paramMotionEvent)) {
          if (!mScroller.isFinished()) {
            bool3 = bool1;
          } else {
            bool3 = false;
          }
        }
        mIsBeingDragged = bool3;
        startNestedScroll(2, 0);
      }
    }
    label406:
    return mIsBeingDragged;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramInt1 = 0;
    mIsLayoutDirty = false;
    View localView = mChildToScrollTo;
    if ((localView != null) && (isViewDescendantOf(localView, this))) {
      scrollToChild(mChildToScrollTo);
    }
    mChildToScrollTo = null;
    if (!mIsLaidOut)
    {
      if (mSavedState != null)
      {
        scrollTo(getScrollX(), mSavedState.scrollPosition);
        mSavedState = null;
      }
      if (getChildCount() > 0)
      {
        localView = getChildAt(0);
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        paramInt1 = localView.getMeasuredHeight() + topMargin + bottomMargin;
      }
      int i = getPaddingTop();
      int j = getPaddingBottom();
      paramInt3 = getScrollY();
      paramInt1 = clamp(paramInt3, paramInt4 - paramInt2 - i - j, paramInt1);
      if (paramInt1 != paramInt3) {
        scrollTo(getScrollX(), paramInt1);
      }
    }
    scrollTo(getScrollX(), getScrollY());
    mIsLaidOut = true;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!mFillViewport) {
      return;
    }
    if (View.MeasureSpec.getMode(paramInt2) == 0) {
      return;
    }
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      int i = localView.getMeasuredHeight();
      paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom() - topMargin - bottomMargin;
      if (i < paramInt2)
      {
        i = getPaddingLeft();
        localView.measure(ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + i + leftMargin + rightMargin, width), View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824));
      }
    }
  }
  
  public boolean onNestedFling(@NonNull View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      dispatchNestedFling(0.0F, paramFloat2, true);
      fling((int)paramFloat2);
      return true;
    }
    return false;
  }
  
  public boolean onNestedPreFling(@NonNull View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(@NonNull View paramView, int paramInt1, int paramInt2, @NonNull int[] paramArrayOfInt)
  {
    onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt, 0);
  }
  
  public void onNestedPreScroll(@NonNull View paramView, int paramInt1, int paramInt2, @NonNull int[] paramArrayOfInt, int paramInt3)
  {
    dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt, null, paramInt3);
  }
  
  public void onNestedScroll(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    onNestedScrollInternal(paramInt4, 0, null);
  }
  
  public void onNestedScroll(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    onNestedScrollInternal(paramInt4, paramInt5, null);
  }
  
  public void onNestedScroll(@NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, @NonNull int[] paramArrayOfInt)
  {
    onNestedScrollInternal(paramInt4, paramInt5, paramArrayOfInt);
  }
  
  public void onNestedScrollAccepted(@NonNull View paramView1, @NonNull View paramView2, int paramInt)
  {
    onNestedScrollAccepted(paramView1, paramView2, paramInt, 0);
  }
  
  public void onNestedScrollAccepted(@NonNull View paramView1, @NonNull View paramView2, int paramInt1, int paramInt2)
  {
    mParentHelper.onNestedScrollAccepted(paramView1, paramView2, paramInt1, paramInt2);
    startNestedScroll(2, paramInt2);
  }
  
  public void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  public boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i;
    if (paramInt == 2)
    {
      i = 130;
    }
    else
    {
      i = paramInt;
      if (paramInt == 1) {
        i = 33;
      }
    }
    View localView;
    if (paramRect == null) {
      localView = FocusFinder.getInstance().findNextFocus(this, null, i);
    } else {
      localView = FocusFinder.getInstance().findNextFocusFromRect(this, paramRect, i);
    }
    if (localView == null) {
      return false;
    }
    if (isOffScreen(localView)) {
      return false;
    }
    return localView.requestFocus(i, paramRect);
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    mSavedState = paramParcelable;
    requestLayout();
  }
  
  @NonNull
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    scrollPosition = getScrollY();
    return localSavedState;
  }
  
  public void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    OnScrollChangeListener localOnScrollChangeListener = mOnScrollChangeListener;
    if (localOnScrollChangeListener != null) {
      localOnScrollChangeListener.onScrollChange(this, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = findFocus();
    if ((localView != null) && (this != localView) && (isWithinDeltaOfScreen(localView, 0, paramInt4)))
    {
      localView.getDrawingRect(mTempRect);
      offsetDescendantRectToMyCoords(localView, mTempRect);
      doScrollY(computeScrollDeltaToGetChildRectOnScreen(mTempRect));
    }
  }
  
  public boolean onStartNestedScroll(@NonNull View paramView1, @NonNull View paramView2, int paramInt)
  {
    return onStartNestedScroll(paramView1, paramView2, paramInt, 0);
  }
  
  public boolean onStartNestedScroll(@NonNull View paramView1, @NonNull View paramView2, int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt1 & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onStopNestedScroll(@NonNull View paramView)
  {
    onStopNestedScroll(paramView, 0);
  }
  
  public void onStopNestedScroll(@NonNull View paramView, int paramInt)
  {
    mParentHelper.onStopNestedScroll(paramView, paramInt);
    stopNestedScroll(paramInt);
  }
  
  public boolean onTouchEvent(@NonNull MotionEvent paramMotionEvent)
  {
    initVelocityTrackerIfNotExists();
    int i = paramMotionEvent.getActionMasked();
    int j = 0;
    if (i == 0) {
      mNestedYOffset = 0;
    }
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    localMotionEvent.offsetLocation(0.0F, mNestedYOffset);
    Object localObject;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 5)
            {
              if (i == 6)
              {
                onSecondaryPointerUp(paramMotionEvent);
                mLastMotionY = ((int)paramMotionEvent.getY(paramMotionEvent.findPointerIndex(mActivePointerId)));
              }
            }
            else
            {
              i = paramMotionEvent.getActionIndex();
              mLastMotionY = ((int)paramMotionEvent.getY(i));
              mActivePointerId = paramMotionEvent.getPointerId(i);
            }
          }
          else
          {
            if ((mIsBeingDragged) && (getChildCount() > 0) && (mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()))) {
              ViewCompat.postInvalidateOnAnimation(this);
            }
            mActivePointerId = -1;
            endDrag();
          }
        }
        else
        {
          int k = paramMotionEvent.findPointerIndex(mActivePointerId);
          if (k == -1)
          {
            paramMotionEvent = z2.t("Invalid pointerId=");
            paramMotionEvent.append(mActivePointerId);
            paramMotionEvent.append(" in onTouchEvent");
            Log.e("NestedScrollView", paramMotionEvent.toString());
          }
          else
          {
            int m = (int)paramMotionEvent.getY(k);
            i = mLastMotionY - m;
            int n = i - releaseVerticalGlow(i, paramMotionEvent.getX(k));
            i = n;
            if (!mIsBeingDragged)
            {
              i = n;
              if (Math.abs(n) > mTouchSlop)
              {
                localObject = getParent();
                if (localObject != null) {
                  ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
                }
                mIsBeingDragged = true;
                if (n > 0) {
                  i = n - mTouchSlop;
                } else {
                  i = n + mTouchSlop;
                }
              }
            }
            if (mIsBeingDragged)
            {
              n = i;
              if (dispatchNestedPreScroll(0, i, mScrollConsumed, mScrollOffset, 0))
              {
                n = i - mScrollConsumed[1];
                mNestedYOffset += mScrollOffset[1];
              }
              mLastMotionY = (m - mScrollOffset[1]);
              int i1 = getScrollY();
              int i2 = getScrollRange();
              i = getOverScrollMode();
              if ((i != 0) && ((i != 1) || (i2 <= 0))) {
                m = 0;
              } else {
                m = 1;
              }
              if ((overScrollByCompat(0, n, 0, getScrollY(), 0, i2, 0, 0, true)) && (!hasNestedScrollingParent(0))) {
                i = 1;
              } else {
                i = 0;
              }
              int i3 = getScrollY() - i1;
              localObject = mScrollConsumed;
              localObject[1] = 0;
              dispatchNestedScroll(0, i3, 0, n - i3, mScrollOffset, 0, (int[])localObject);
              i3 = mLastMotionY;
              int i4 = mScrollOffset[1];
              mLastMotionY = (i3 - i4);
              mNestedYOffset += i4;
              if (m != 0)
              {
                n -= mScrollConsumed[1];
                m = i1 + n;
                if (m < 0)
                {
                  EdgeEffectCompat.onPullDistance(mEdgeGlowTop, -n / getHeight(), paramMotionEvent.getX(k) / getWidth());
                  if (!mEdgeGlowBottom.isFinished()) {
                    mEdgeGlowBottom.onRelease();
                  }
                }
                else if (m > i2)
                {
                  EdgeEffectCompat.onPullDistance(mEdgeGlowBottom, n / getHeight(), 1.0F - paramMotionEvent.getX(k) / getWidth());
                  if (!mEdgeGlowTop.isFinished()) {
                    mEdgeGlowTop.onRelease();
                  }
                }
                if ((!mEdgeGlowTop.isFinished()) || (!mEdgeGlowBottom.isFinished()))
                {
                  ViewCompat.postInvalidateOnAnimation(this);
                  i = j;
                }
              }
              if (i != 0) {
                mVelocityTracker.clear();
              }
            }
          }
        }
      }
      else
      {
        paramMotionEvent = mVelocityTracker;
        paramMotionEvent.computeCurrentVelocity(1000, mMaximumVelocity);
        i = (int)paramMotionEvent.getYVelocity(mActivePointerId);
        if (Math.abs(i) >= mMinimumVelocity)
        {
          if (!edgeEffectFling(i))
          {
            i = -i;
            float f = i;
            if (!dispatchNestedPreFling(0.0F, f))
            {
              dispatchNestedFling(0.0F, f, true);
              fling(i);
            }
          }
        }
        else if (mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
          ViewCompat.postInvalidateOnAnimation(this);
        }
        mActivePointerId = -1;
        endDrag();
      }
    }
    else
    {
      if (getChildCount() == 0) {
        return false;
      }
      if (mIsBeingDragged)
      {
        localObject = getParent();
        if (localObject != null) {
          ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
        }
      }
      if (!mScroller.isFinished()) {
        abortAnimatedScroll();
      }
      mLastMotionY = ((int)paramMotionEvent.getY());
      mActivePointerId = paramMotionEvent.getPointerId(0);
      startNestedScroll(2, 0);
    }
    paramMotionEvent = mVelocityTracker;
    if (paramMotionEvent != null) {
      paramMotionEvent.addMovement(localMotionEvent);
    }
    localMotionEvent.recycle();
    return true;
  }
  
  public boolean overScrollByCompat(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    int i = getOverScrollMode();
    int j = computeHorizontalScrollRange();
    int k = computeHorizontalScrollExtent();
    boolean bool1 = false;
    if (j > k) {
      k = 1;
    } else {
      k = 0;
    }
    if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
      j = 1;
    } else {
      j = 0;
    }
    if ((i != 0) && ((i != 1) || (k == 0))) {
      k = 0;
    } else {
      k = 1;
    }
    if ((i != 0) && ((i != 1) || (j == 0))) {
      j = 0;
    } else {
      j = 1;
    }
    paramInt3 += paramInt1;
    if (k == 0) {
      paramInt1 = 0;
    } else {
      paramInt1 = paramInt7;
    }
    paramInt4 += paramInt2;
    if (j == 0) {
      paramInt2 = 0;
    } else {
      paramInt2 = paramInt8;
    }
    paramInt7 = -paramInt1;
    paramInt1 += paramInt5;
    paramInt5 = -paramInt2;
    paramInt2 += paramInt6;
    if (paramInt3 > paramInt1)
    {
      paramBoolean = true;
    }
    else if (paramInt3 < paramInt7)
    {
      paramBoolean = true;
      paramInt1 = paramInt7;
    }
    else
    {
      paramBoolean = false;
      paramInt1 = paramInt3;
    }
    boolean bool2;
    if (paramInt4 > paramInt2)
    {
      bool2 = true;
    }
    else if (paramInt4 < paramInt5)
    {
      bool2 = true;
      paramInt2 = paramInt5;
    }
    else
    {
      bool2 = false;
      paramInt2 = paramInt4;
    }
    if ((bool2) && (!hasNestedScrollingParent(1))) {
      mScroller.springBack(paramInt1, paramInt2, 0, 0, 0, getScrollRange());
    }
    onOverScrolled(paramInt1, paramInt2, paramBoolean, bool2);
    if (!paramBoolean)
    {
      paramBoolean = bool1;
      if (!bool2) {}
    }
    else
    {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  public boolean pageScroll(int paramInt)
  {
    if (paramInt == 130) {
      i = 1;
    } else {
      i = 0;
    }
    int j = getHeight();
    if (i != 0)
    {
      mTempRect.top = (getScrollY() + j);
      i = getChildCount();
      if (i > 0)
      {
        View localView = getChildAt(i - 1);
        localObject = (FrameLayout.LayoutParams)localView.getLayoutParams();
        i = localView.getBottom();
        int k = bottomMargin;
        i = getPaddingBottom() + (i + k);
        localObject = mTempRect;
        if (top + j > i) {
          top = (i - j);
        }
      }
    }
    else
    {
      mTempRect.top = (getScrollY() - j);
      localObject = mTempRect;
      if (top < 0) {
        top = 0;
      }
    }
    Object localObject = mTempRect;
    int i = top;
    j += i;
    bottom = j;
    return scrollAndFocus(paramInt, i, j);
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    if (!mIsLayoutDirty) {
      scrollToChild(paramView2);
    } else {
      mChildToScrollTo = paramView2;
    }
    super.requestChildFocus(paramView1, paramView2);
  }
  
  public boolean requestChildRectangleOnScreen(@NonNull View paramView, Rect paramRect, boolean paramBoolean)
  {
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    return scrollToChildRect(paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean) {
      recycleVelocityTracker();
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    mIsLayoutDirty = true;
    super.requestLayout();
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
      int i = getWidth();
      int j = getPaddingLeft();
      int k = getPaddingRight();
      int m = localView.getWidth();
      int n = leftMargin;
      int i1 = rightMargin;
      int i2 = getHeight();
      int i3 = getPaddingTop();
      int i4 = getPaddingBottom();
      int i5 = localView.getHeight();
      int i6 = topMargin;
      int i7 = bottomMargin;
      paramInt1 = clamp(paramInt1, i - j - k, m + n + i1);
      paramInt2 = clamp(paramInt2, i2 - i3 - i4, i5 + i6 + i7);
      if ((paramInt1 != getScrollX()) || (paramInt2 != getScrollY())) {
        super.scrollTo(paramInt1, paramInt2);
      }
    }
  }
  
  public void setFillViewport(boolean paramBoolean)
  {
    if (paramBoolean != mFillViewport)
    {
      mFillViewport = paramBoolean;
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    mChildHelper.setNestedScrollingEnabled(paramBoolean);
  }
  
  public void setOnScrollChangeListener(@Nullable OnScrollChangeListener paramOnScrollChangeListener)
  {
    mOnScrollChangeListener = paramOnScrollChangeListener;
  }
  
  public void setSmoothScrollingEnabled(boolean paramBoolean)
  {
    mSmoothScrollingEnabled = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return true;
  }
  
  public final void smoothScrollBy(int paramInt1, int paramInt2)
  {
    smoothScrollBy(paramInt1, paramInt2, 250, false);
  }
  
  public final void smoothScrollBy(int paramInt1, int paramInt2, int paramInt3)
  {
    smoothScrollBy(paramInt1, paramInt2, paramInt3, false);
  }
  
  public final void smoothScrollTo(int paramInt1, int paramInt2)
  {
    smoothScrollTo(paramInt1, paramInt2, 250, false);
  }
  
  public final void smoothScrollTo(int paramInt1, int paramInt2, int paramInt3)
  {
    smoothScrollTo(paramInt1, paramInt2, paramInt3, false);
  }
  
  public void smoothScrollTo(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    smoothScrollBy(paramInt1 - getScrollX(), paramInt2 - getScrollY(), paramInt3, paramBoolean);
  }
  
  public void smoothScrollTo(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    smoothScrollTo(paramInt1, paramInt2, 250, paramBoolean);
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return startNestedScroll(paramInt, 0);
  }
  
  public boolean startNestedScroll(int paramInt1, int paramInt2)
  {
    return mChildHelper.startNestedScroll(paramInt1, paramInt2);
  }
  
  public void stopNestedScroll()
  {
    stopNestedScroll(0);
  }
  
  public void stopNestedScroll(int paramInt)
  {
    mChildHelper.stopNestedScroll(paramInt);
  }
  
  public static class AccessibilityDelegate
    extends AccessibilityDelegateCompat
  {
    public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramView = (NestedScrollView)paramView;
      paramAccessibilityEvent.setClassName(ScrollView.class.getName());
      boolean bool;
      if (paramView.getScrollRange() > 0) {
        bool = true;
      } else {
        bool = false;
      }
      paramAccessibilityEvent.setScrollable(bool);
      paramAccessibilityEvent.setScrollX(paramView.getScrollX());
      paramAccessibilityEvent.setScrollY(paramView.getScrollY());
      AccessibilityRecordCompat.setMaxScrollX(paramAccessibilityEvent, paramView.getScrollX());
      AccessibilityRecordCompat.setMaxScrollY(paramAccessibilityEvent, paramView.getScrollRange());
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
    {
      super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
      paramView = (NestedScrollView)paramView;
      paramAccessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
      if (paramView.isEnabled())
      {
        int i = paramView.getScrollRange();
        if (i > 0)
        {
          paramAccessibilityNodeInfoCompat.setScrollable(true);
          if (paramView.getScrollY() > 0)
          {
            paramAccessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
            paramAccessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
          }
          if (paramView.getScrollY() < i)
          {
            paramAccessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
            paramAccessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
          }
        }
      }
    }
    
    public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      if (super.performAccessibilityAction(paramView, paramInt, paramBundle)) {
        return true;
      }
      paramBundle = (NestedScrollView)paramView;
      if (!paramBundle.isEnabled()) {
        return false;
      }
      int i = paramBundle.getHeight();
      paramView = new Rect();
      int j = i;
      if (paramBundle.getMatrix().isIdentity())
      {
        j = i;
        if (paramBundle.getGlobalVisibleRect(paramView)) {
          j = paramView.height();
        }
      }
      if (paramInt != 4096) {
        if ((paramInt != 8192) && (paramInt != 16908344))
        {
          if (paramInt != 16908346) {
            return false;
          }
        }
        else
        {
          paramInt = paramBundle.getPaddingBottom();
          i = paramBundle.getPaddingTop();
          paramInt = Math.max(paramBundle.getScrollY() - (j - paramInt - i), 0);
          if (paramInt != paramBundle.getScrollY())
          {
            paramBundle.smoothScrollTo(0, paramInt, true);
            return true;
          }
          return false;
        }
      }
      i = paramBundle.getPaddingBottom();
      paramInt = paramBundle.getPaddingTop();
      paramInt = Math.min(paramBundle.getScrollY() + (j - i - paramInt), paramBundle.getScrollRange());
      if (paramInt != paramBundle.getScrollY())
      {
        paramBundle.smoothScrollTo(0, paramInt, true);
        return true;
      }
      return false;
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static boolean getClipToPadding(ViewGroup paramViewGroup)
    {
      return paramViewGroup.getClipToPadding();
    }
  }
  
  public static abstract interface OnScrollChangeListener
  {
    public abstract void onScrollChange(@NonNull NestedScrollView paramNestedScrollView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  }
  
  public static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator()
    {
      public NestedScrollView.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new NestedScrollView.SavedState(paramAnonymousParcel);
      }
      
      public NestedScrollView.SavedState[] newArray(int paramAnonymousInt)
      {
        return new NestedScrollView.SavedState[paramAnonymousInt];
      }
    };
    public int scrollPosition;
    
    public SavedState(Parcel paramParcel)
    {
      super();
      scrollPosition = paramParcel.readInt();
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    @NonNull
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("HorizontalScrollView.SavedState{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" scrollPosition=");
      return z2.q(localStringBuilder, scrollPosition, "}");
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(scrollPosition);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.NestedScrollView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */