package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import z2;

public class ViewPager
  extends ViewGroup
{
  private static final int CLOSE_ENOUGH = 2;
  private static final Comparator<ItemInfo> COMPARATOR = new Comparator()
  {
    public int compare(ViewPager.ItemInfo paramAnonymousItemInfo1, ViewPager.ItemInfo paramAnonymousItemInfo2)
    {
      return position - position;
    }
  };
  private static final boolean DEBUG = false;
  private static final int DEFAULT_GUTTER_SIZE = 16;
  private static final int DEFAULT_OFFSCREEN_PAGES = 1;
  private static final int DRAW_ORDER_DEFAULT = 0;
  private static final int DRAW_ORDER_FORWARD = 1;
  private static final int DRAW_ORDER_REVERSE = 2;
  private static final int INVALID_POINTER = -1;
  public static final int[] LAYOUT_ATTRS = { 16842931 };
  private static final int MAX_SETTLE_DURATION = 600;
  private static final int MIN_DISTANCE_FOR_FLING = 25;
  private static final int MIN_FLING_VELOCITY = 400;
  public static final int SCROLL_STATE_DRAGGING = 1;
  public static final int SCROLL_STATE_IDLE = 0;
  public static final int SCROLL_STATE_SETTLING = 2;
  private static final String TAG = "ViewPager";
  private static final boolean USE_CACHE = false;
  private static final Interpolator sInterpolator = new Interpolator()
  {
    public float getInterpolation(float paramAnonymousFloat)
    {
      paramAnonymousFloat -= 1.0F;
      return paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat * paramAnonymousFloat + 1.0F;
    }
  };
  private static final ViewPositionComparator sPositionComparator = new ViewPositionComparator();
  private int mActivePointerId = -1;
  public PagerAdapter mAdapter;
  private List<OnAdapterChangeListener> mAdapterChangeListeners;
  private int mBottomPageBounds;
  private boolean mCalledSuper;
  private int mChildHeightMeasureSpec;
  private int mChildWidthMeasureSpec;
  private int mCloseEnough;
  public int mCurItem;
  private int mDecorChildCount;
  private int mDefaultGutterSize;
  private int mDrawingOrder;
  private ArrayList<View> mDrawingOrderedChildren;
  private final Runnable mEndScrollRunnable = new Runnable()
  {
    public void run()
    {
      setScrollState(0);
      populate();
    }
  };
  private int mExpectedAdapterCount;
  private long mFakeDragBeginTime;
  private boolean mFakeDragging;
  private boolean mFirstLayout = true;
  private float mFirstOffset = -3.4028235E38F;
  private int mFlingDistance;
  private int mGutterSize;
  private boolean mInLayout;
  private float mInitialMotionX;
  private float mInitialMotionY;
  private OnPageChangeListener mInternalPageChangeListener;
  private boolean mIsBeingDragged;
  private boolean mIsScrollStarted;
  private boolean mIsUnableToDrag;
  private final ArrayList<ItemInfo> mItems = new ArrayList();
  private float mLastMotionX;
  private float mLastMotionY;
  private float mLastOffset = Float.MAX_VALUE;
  private EdgeEffect mLeftEdge;
  private Drawable mMarginDrawable;
  private int mMaximumVelocity;
  private int mMinimumVelocity;
  private boolean mNeedCalculatePageOffsets = false;
  private PagerObserver mObserver;
  private int mOffscreenPageLimit = 1;
  private OnPageChangeListener mOnPageChangeListener;
  private List<OnPageChangeListener> mOnPageChangeListeners;
  private int mPageMargin;
  private PageTransformer mPageTransformer;
  private int mPageTransformerLayerType;
  private boolean mPopulatePending;
  private Parcelable mRestoredAdapterState = null;
  private ClassLoader mRestoredClassLoader = null;
  private int mRestoredCurItem = -1;
  private EdgeEffect mRightEdge;
  private int mScrollState = 0;
  private Scroller mScroller;
  private boolean mScrollingCacheEnabled;
  private final ItemInfo mTempItem = new ItemInfo();
  private final Rect mTempRect = new Rect();
  private int mTopPageBounds;
  private int mTouchSlop;
  private VelocityTracker mVelocityTracker;
  
  public ViewPager(@NonNull Context paramContext)
  {
    super(paramContext);
    initViewPager();
  }
  
  public ViewPager(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initViewPager();
  }
  
  private void calculatePageOffsets(ItemInfo paramItemInfo1, int paramInt, ItemInfo paramItemInfo2)
  {
    int i = mAdapter.getCount();
    int j = getClientWidth();
    float f1;
    if (j > 0) {
      f1 = mPageMargin / j;
    } else {
      f1 = 0.0F;
    }
    float f3;
    if (paramItemInfo2 != null)
    {
      j = position;
      k = position;
      if (j < k)
      {
        f2 = offset + widthFactor + f1;
        j++;
        k = 0;
        while ((j <= position) && (k < mItems.size()))
        {
          for (paramItemInfo2 = (ItemInfo)mItems.get(k);; paramItemInfo2 = (ItemInfo)mItems.get(k))
          {
            m = j;
            f3 = f2;
            if (j <= position) {
              break;
            }
            m = j;
            f3 = f2;
            if (k >= mItems.size() - 1) {
              break;
            }
            k++;
          }
          while (m < position)
          {
            f3 += mAdapter.getPageWidth(m) + f1;
            m++;
          }
          offset = f3;
          f2 = f3 + (widthFactor + f1);
          j = m + 1;
        }
      }
      if (j > k)
      {
        k = mItems.size() - 1;
        f2 = offset;
        j--;
        while ((j >= position) && (k >= 0))
        {
          for (paramItemInfo2 = (ItemInfo)mItems.get(k);; paramItemInfo2 = (ItemInfo)mItems.get(k))
          {
            m = j;
            f3 = f2;
            if (j >= position) {
              break;
            }
            m = j;
            f3 = f2;
            if (k <= 0) {
              break;
            }
            k--;
          }
          while (m > position)
          {
            f3 -= mAdapter.getPageWidth(m) + f1;
            m--;
          }
          f2 = f3 - (widthFactor + f1);
          offset = f2;
          j = m - 1;
        }
      }
    }
    int m = mItems.size();
    float f2 = offset;
    int k = position;
    j = k - 1;
    if (k == 0) {
      f3 = f2;
    } else {
      f3 = -3.4028235E38F;
    }
    mFirstOffset = f3;
    i--;
    if (k == i) {
      f3 = widthFactor + f2 - 1.0F;
    } else {
      f3 = Float.MAX_VALUE;
    }
    mLastOffset = f3;
    k = paramInt - 1;
    while (k >= 0)
    {
      paramItemInfo2 = (ItemInfo)mItems.get(k);
      int n;
      for (;;)
      {
        n = position;
        if (j <= n) {
          break;
        }
        f2 -= mAdapter.getPageWidth(j) + f1;
        j--;
      }
      f2 -= widthFactor + f1;
      offset = f2;
      if (n == 0) {
        mFirstOffset = f2;
      }
      k--;
      j--;
    }
    f2 = offset + widthFactor + f1;
    k = position + 1;
    j = paramInt + 1;
    for (paramInt = k; j < m; paramInt++)
    {
      paramItemInfo1 = (ItemInfo)mItems.get(j);
      for (;;)
      {
        k = position;
        if (paramInt >= k) {
          break;
        }
        f2 += mAdapter.getPageWidth(paramInt) + f1;
        paramInt++;
      }
      if (k == i) {
        mLastOffset = (widthFactor + f2 - 1.0F);
      }
      offset = f2;
      f2 += widthFactor + f1;
      j++;
    }
    mNeedCalculatePageOffsets = false;
  }
  
  private void completeScroll(boolean paramBoolean)
  {
    int i;
    if (mScrollState == 2) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      setScrollingCacheEnabled(false);
      if ((mScroller.isFinished() ^ true))
      {
        mScroller.abortAnimation();
        int j = getScrollX();
        int k = getScrollY();
        int m = mScroller.getCurrX();
        n = mScroller.getCurrY();
        if ((j != m) || (k != n))
        {
          scrollTo(m, n);
          if (m != j) {
            pageScrolled(m);
          }
        }
      }
    }
    mPopulatePending = false;
    for (int n = 0; n < mItems.size(); n++)
    {
      ItemInfo localItemInfo = (ItemInfo)mItems.get(n);
      if (scrolling)
      {
        scrolling = false;
        i = 1;
      }
    }
    if (i != 0) {
      if (paramBoolean) {
        ViewCompat.postOnAnimation(this, mEndScrollRunnable);
      } else {
        mEndScrollRunnable.run();
      }
    }
  }
  
  private int determineTargetPage(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    if ((Math.abs(paramInt3) > mFlingDistance) && (Math.abs(paramInt2) > mMinimumVelocity))
    {
      if (paramInt2 <= 0) {
        paramInt1++;
      }
    }
    else
    {
      float f;
      if (paramInt1 >= mCurItem) {
        f = 0.4F;
      } else {
        f = 0.6F;
      }
      paramInt1 += (int)(paramFloat + f);
    }
    paramInt2 = paramInt1;
    if (mItems.size() > 0)
    {
      ItemInfo localItemInfo = (ItemInfo)mItems.get(0);
      Object localObject = mItems;
      localObject = (ItemInfo)((ArrayList)localObject).get(((ArrayList)localObject).size() - 1);
      paramInt2 = Math.max(position, Math.min(paramInt1, position));
    }
    return paramInt2;
  }
  
  private void dispatchOnPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    Object localObject = mOnPageChangeListener;
    if (localObject != null) {
      ((OnPageChangeListener)localObject).onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
    localObject = mOnPageChangeListeners;
    if (localObject != null)
    {
      int i = 0;
      int j = ((List)localObject).size();
      while (i < j)
      {
        localObject = (OnPageChangeListener)mOnPageChangeListeners.get(i);
        if (localObject != null) {
          ((OnPageChangeListener)localObject).onPageScrolled(paramInt1, paramFloat, paramInt2);
        }
        i++;
      }
    }
    localObject = mInternalPageChangeListener;
    if (localObject != null) {
      ((OnPageChangeListener)localObject).onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
  }
  
  private void dispatchOnPageSelected(int paramInt)
  {
    Object localObject = mOnPageChangeListener;
    if (localObject != null) {
      ((OnPageChangeListener)localObject).onPageSelected(paramInt);
    }
    localObject = mOnPageChangeListeners;
    if (localObject != null)
    {
      int i = 0;
      int j = ((List)localObject).size();
      while (i < j)
      {
        localObject = (OnPageChangeListener)mOnPageChangeListeners.get(i);
        if (localObject != null) {
          ((OnPageChangeListener)localObject).onPageSelected(paramInt);
        }
        i++;
      }
    }
    localObject = mInternalPageChangeListener;
    if (localObject != null) {
      ((OnPageChangeListener)localObject).onPageSelected(paramInt);
    }
  }
  
  private void dispatchOnScrollStateChanged(int paramInt)
  {
    Object localObject = mOnPageChangeListener;
    if (localObject != null) {
      ((OnPageChangeListener)localObject).onPageScrollStateChanged(paramInt);
    }
    localObject = mOnPageChangeListeners;
    if (localObject != null)
    {
      int i = 0;
      int j = ((List)localObject).size();
      while (i < j)
      {
        localObject = (OnPageChangeListener)mOnPageChangeListeners.get(i);
        if (localObject != null) {
          ((OnPageChangeListener)localObject).onPageScrollStateChanged(paramInt);
        }
        i++;
      }
    }
    localObject = mInternalPageChangeListener;
    if (localObject != null) {
      ((OnPageChangeListener)localObject).onPageScrollStateChanged(paramInt);
    }
  }
  
  private void enableLayers(boolean paramBoolean)
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      int k;
      if (paramBoolean) {
        k = mPageTransformerLayerType;
      } else {
        k = 0;
      }
      getChildAt(j).setLayerType(k, null);
    }
  }
  
  private void endDrag()
  {
    mIsBeingDragged = false;
    mIsUnableToDrag = false;
    VelocityTracker localVelocityTracker = mVelocityTracker;
    if (localVelocityTracker != null)
    {
      localVelocityTracker.recycle();
      mVelocityTracker = null;
    }
  }
  
  private Rect getChildRectInPagerCoordinates(Rect paramRect, View paramView)
  {
    Rect localRect = paramRect;
    if (paramRect == null) {
      localRect = new Rect();
    }
    if (paramView == null)
    {
      localRect.set(0, 0, 0, 0);
      return localRect;
    }
    left = paramView.getLeft();
    right = paramView.getRight();
    top = paramView.getTop();
    bottom = paramView.getBottom();
    for (paramRect = paramView.getParent(); ((paramRect instanceof ViewGroup)) && (paramRect != this); paramRect = paramRect.getParent())
    {
      paramRect = (ViewGroup)paramRect;
      int i = left;
      left = (paramRect.getLeft() + i);
      i = right;
      right = (paramRect.getRight() + i);
      i = top;
      top = (paramRect.getTop() + i);
      i = bottom;
      bottom = (paramRect.getBottom() + i);
    }
    return localRect;
  }
  
  private int getClientWidth()
  {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }
  
  private ItemInfo infoForCurrentScrollPosition()
  {
    int i = getClientWidth();
    float f1 = 0.0F;
    float f2;
    if (i > 0) {
      f2 = getScrollX() / i;
    } else {
      f2 = 0.0F;
    }
    float f3;
    if (i > 0) {
      f3 = mPageMargin / i;
    } else {
      f3 = 0.0F;
    }
    Object localObject = null;
    i = 0;
    int j = -1;
    int k = 1;
    float f4 = 0.0F;
    while (i < mItems.size())
    {
      ItemInfo localItemInfo1 = (ItemInfo)mItems.get(i);
      int m = i;
      ItemInfo localItemInfo2 = localItemInfo1;
      if (k == 0)
      {
        int n = position;
        j++;
        m = i;
        localItemInfo2 = localItemInfo1;
        if (n != j)
        {
          localItemInfo2 = mTempItem;
          offset = (f1 + f4 + f3);
          position = j;
          widthFactor = mAdapter.getPageWidth(j);
          m = i - 1;
        }
      }
      f1 = offset;
      f4 = widthFactor;
      if ((k == 0) && (f2 < f1)) {
        return (ItemInfo)localObject;
      }
      if ((f2 >= f4 + f1 + f3) && (m != mItems.size() - 1))
      {
        j = position;
        f4 = widthFactor;
        i = m + 1;
        k = 0;
        localObject = localItemInfo2;
      }
      else
      {
        return localItemInfo2;
      }
    }
    return (ItemInfo)localObject;
  }
  
  private static boolean isDecorView(@NonNull View paramView)
  {
    boolean bool;
    if (paramView.getClass().getAnnotation(DecorView.class) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isGutterDrag(float paramFloat1, float paramFloat2)
  {
    boolean bool;
    if (((paramFloat1 < mGutterSize) && (paramFloat2 > 0.0F)) || ((paramFloat1 > getWidth() - mGutterSize) && (paramFloat2 < 0.0F))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
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
      mLastMotionX = paramMotionEvent.getX(i);
      mActivePointerId = paramMotionEvent.getPointerId(i);
      paramMotionEvent = mVelocityTracker;
      if (paramMotionEvent != null) {
        paramMotionEvent.clear();
      }
    }
  }
  
  private boolean pageScrolled(int paramInt)
  {
    if (mItems.size() == 0)
    {
      if (mFirstLayout) {
        return false;
      }
      mCalledSuper = false;
      onPageScrolled(0, 0.0F, 0);
      if (mCalledSuper) {
        return false;
      }
      throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }
    ItemInfo localItemInfo = infoForCurrentScrollPosition();
    int i = getClientWidth();
    int j = mPageMargin;
    float f1 = j;
    float f2 = i;
    f1 /= f2;
    int k = position;
    f2 = (paramInt / f2 - offset) / (widthFactor + f1);
    paramInt = (int)((i + j) * f2);
    mCalledSuper = false;
    onPageScrolled(k, f2, paramInt);
    if (mCalledSuper) {
      return true;
    }
    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
  }
  
  private boolean performDrag(float paramFloat)
  {
    float f1 = mLastMotionX;
    mLastMotionX = paramFloat;
    float f2 = getScrollX() + (f1 - paramFloat);
    float f3 = getClientWidth();
    paramFloat = mFirstOffset * f3;
    f1 = mLastOffset * f3;
    Object localObject1 = mItems;
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    localObject1 = (ItemInfo)((ArrayList)localObject1).get(0);
    Object localObject2 = mItems;
    localObject2 = (ItemInfo)((ArrayList)localObject2).get(((ArrayList)localObject2).size() - 1);
    if (position != 0)
    {
      paramFloat = offset * f3;
      i = 0;
    }
    else
    {
      i = 1;
    }
    int j;
    if (position != mAdapter.getCount() - 1)
    {
      f1 = offset * f3;
      j = 0;
    }
    else
    {
      j = 1;
    }
    if (f2 < paramFloat)
    {
      if (i != 0)
      {
        mLeftEdge.onPull(Math.abs(paramFloat - f2) / f3);
        bool3 = true;
      }
    }
    else
    {
      bool3 = bool2;
      paramFloat = f2;
      if (f2 > f1)
      {
        bool3 = bool1;
        if (j != 0)
        {
          mRightEdge.onPull(Math.abs(f2 - f1) / f3);
          bool3 = true;
        }
        paramFloat = f1;
      }
    }
    f1 = mLastMotionX;
    int i = (int)paramFloat;
    mLastMotionX = (paramFloat - i + f1);
    scrollTo(i, getScrollY());
    pageScrolled(i);
    return bool3;
  }
  
  private void recomputeScrollPosition(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 > 0) && (!mItems.isEmpty()))
    {
      if (!mScroller.isFinished())
      {
        mScroller.setFinalX(getCurrentItem() * getClientWidth());
      }
      else
      {
        int i = getPaddingLeft();
        int j = getPaddingRight();
        int k = getPaddingLeft();
        int m = getPaddingRight();
        scrollTo((int)(getScrollX() / (paramInt2 - k - m + paramInt4) * (paramInt1 - i - j + paramInt3)), getScrollY());
      }
    }
    else
    {
      ItemInfo localItemInfo = infoForPosition(mCurItem);
      float f;
      if (localItemInfo != null) {
        f = Math.min(offset, mLastOffset);
      } else {
        f = 0.0F;
      }
      paramInt1 = (int)(f * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (paramInt1 != getScrollX())
      {
        completeScroll(false);
        scrollTo(paramInt1, getScrollY());
      }
    }
  }
  
  private void removeNonDecorViews()
  {
    int j;
    for (int i = 0; i < getChildCount(); i = j + 1)
    {
      j = i;
      if (!getChildAtgetLayoutParamsisDecor)
      {
        removeViewAt(i);
        j = i - 1;
      }
    }
  }
  
  private void requestParentDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
  }
  
  private boolean resetTouch()
  {
    mActivePointerId = -1;
    endDrag();
    mLeftEdge.onRelease();
    mRightEdge.onRelease();
    boolean bool;
    if ((!mLeftEdge.isFinished()) && (!mRightEdge.isFinished())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private void scrollToItem(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    ItemInfo localItemInfo = infoForPosition(paramInt1);
    int i;
    if (localItemInfo != null)
    {
      float f = getClientWidth();
      i = (int)(Math.max(mFirstOffset, Math.min(offset, mLastOffset)) * f);
    }
    else
    {
      i = 0;
    }
    if (paramBoolean1)
    {
      smoothScrollTo(i, 0, paramInt2);
      if (paramBoolean2) {
        dispatchOnPageSelected(paramInt1);
      }
    }
    else
    {
      if (paramBoolean2) {
        dispatchOnPageSelected(paramInt1);
      }
      completeScroll(false);
      scrollTo(i, 0);
      pageScrolled(i);
    }
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (mScrollingCacheEnabled != paramBoolean) {
      mScrollingCacheEnabled = paramBoolean;
    }
  }
  
  private void sortChildDrawingOrder()
  {
    if (mDrawingOrder != 0)
    {
      Object localObject = mDrawingOrderedChildren;
      if (localObject == null) {
        mDrawingOrderedChildren = new ArrayList();
      } else {
        ((ArrayList)localObject).clear();
      }
      int i = getChildCount();
      for (int j = 0; j < i; j++)
      {
        localObject = getChildAt(j);
        mDrawingOrderedChildren.add(localObject);
      }
      Collections.sort(mDrawingOrderedChildren, sPositionComparator);
    }
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int i = paramArrayList.size();
    int j = getDescendantFocusability();
    if (j != 393216) {
      for (int k = 0; k < getChildCount(); k++)
      {
        View localView = getChildAt(k);
        if (localView.getVisibility() == 0)
        {
          ItemInfo localItemInfo = infoForChild(localView);
          if ((localItemInfo != null) && (position == mCurItem)) {
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          }
        }
      }
    }
    if ((j != 262144) || (i == paramArrayList.size()))
    {
      if (!isFocusable()) {
        return;
      }
      if (((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode())) {
        return;
      }
      paramArrayList.add(this);
    }
  }
  
  public ItemInfo addNewItem(int paramInt1, int paramInt2)
  {
    ItemInfo localItemInfo = new ItemInfo();
    position = paramInt1;
    object = mAdapter.instantiateItem(this, paramInt1);
    widthFactor = mAdapter.getPageWidth(paramInt1);
    if ((paramInt2 >= 0) && (paramInt2 < mItems.size())) {
      mItems.add(paramInt2, localItemInfo);
    } else {
      mItems.add(localItemInfo);
    }
    return localItemInfo;
  }
  
  public void addOnAdapterChangeListener(@NonNull OnAdapterChangeListener paramOnAdapterChangeListener)
  {
    if (mAdapterChangeListeners == null) {
      mAdapterChangeListeners = new ArrayList();
    }
    mAdapterChangeListeners.add(paramOnAdapterChangeListener);
  }
  
  public void addOnPageChangeListener(@NonNull OnPageChangeListener paramOnPageChangeListener)
  {
    if (mOnPageChangeListeners == null) {
      mOnPageChangeListeners = new ArrayList();
    }
    mOnPageChangeListeners.add(paramOnPageChangeListener);
  }
  
  public void addTouchables(ArrayList<View> paramArrayList)
  {
    for (int i = 0; i < getChildCount(); i++)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        ItemInfo localItemInfo = infoForChild(localView);
        if ((localItemInfo != null) && (position == mCurItem)) {
          localView.addTouchables(paramArrayList);
        }
      }
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    ViewGroup.LayoutParams localLayoutParams = paramLayoutParams;
    if (!checkLayoutParams(paramLayoutParams)) {
      localLayoutParams = generateLayoutParams(paramLayoutParams);
    }
    paramLayoutParams = (LayoutParams)localLayoutParams;
    boolean bool = isDecor | isDecorView(paramView);
    isDecor = bool;
    if (mInLayout)
    {
      if (!bool)
      {
        needsMeasure = true;
        addViewInLayout(paramView, paramInt, localLayoutParams);
      }
      else
      {
        throw new IllegalStateException("Cannot add pager decor view during layout");
      }
    }
    else {
      super.addView(paramView, paramInt, localLayoutParams);
    }
  }
  
  public boolean arrowScroll(int paramInt)
  {
    View localView = findFocus();
    boolean bool = false;
    Object localObject;
    int i;
    if (localView != this)
    {
      localObject = localView;
      if (localView != null)
      {
        for (localObject = localView.getParent(); (localObject instanceof ViewGroup); localObject = ((ViewParent)localObject).getParent()) {
          if (localObject == this)
          {
            i = 1;
            break label63;
          }
        }
        i = 0;
        label63:
        localObject = localView;
        if (i == 0)
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append(localView.getClass().getSimpleName());
          for (localObject = localView.getParent(); (localObject instanceof ViewGroup); localObject = ((ViewParent)localObject).getParent())
          {
            localStringBuilder.append(" => ");
            localStringBuilder.append(localObject.getClass().getSimpleName());
          }
          localObject = z2.t("arrowScroll tried to find focus based on non-child current focused view ");
          ((StringBuilder)localObject).append(localStringBuilder.toString());
          Log.e("ViewPager", ((StringBuilder)localObject).toString());
        }
      }
    }
    else
    {
      localObject = null;
    }
    localView = FocusFinder.getInstance().findNextFocus(this, (View)localObject, paramInt);
    int j;
    if ((localView != null) && (localView != localObject)) {
      if (paramInt == 17)
      {
        i = getChildRectInPagerCoordinatesmTempRect, localView).left;
        j = getChildRectInPagerCoordinatesmTempRect, (View)localObject).left;
        if ((localObject != null) && (i >= j)) {
          bool = pageLeft();
        } else {
          bool = localView.requestFocus();
        }
      }
    }
    for (;;)
    {
      break;
      if (paramInt == 66)
      {
        i = getChildRectInPagerCoordinatesmTempRect, localView).left;
        j = getChildRectInPagerCoordinatesmTempRect, (View)localObject).left;
        if ((localObject != null) && (i <= j))
        {
          bool = pageRight();
        }
        else
        {
          bool = localView.requestFocus();
          continue;
          if ((paramInt != 17) && (paramInt != 1))
          {
            if ((paramInt == 66) || (paramInt == 2)) {
              bool = pageRight();
            }
          }
          else {
            bool = pageLeft();
          }
        }
      }
    }
    if (bool) {
      playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
    }
    return bool;
  }
  
  public boolean beginFakeDrag()
  {
    if (mIsBeingDragged) {
      return false;
    }
    mFakeDragging = true;
    setScrollState(1);
    mLastMotionX = 0.0F;
    mInitialMotionX = 0.0F;
    Object localObject = mVelocityTracker;
    if (localObject == null) {
      mVelocityTracker = VelocityTracker.obtain();
    } else {
      ((VelocityTracker)localObject).clear();
    }
    long l = SystemClock.uptimeMillis();
    localObject = MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0);
    mVelocityTracker.addMovement((MotionEvent)localObject);
    ((MotionEvent)localObject).recycle();
    mFakeDragBeginTime = l;
    return true;
  }
  
  public boolean canScroll(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool1 = paramView instanceof ViewGroup;
    boolean bool2 = true;
    if (bool1)
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int i = paramView.getScrollX();
      int j = paramView.getScrollY();
      for (int k = localViewGroup.getChildCount() - 1; k >= 0; k--)
      {
        View localView = localViewGroup.getChildAt(k);
        int m = paramInt2 + i;
        if ((m >= localView.getLeft()) && (m < localView.getRight()))
        {
          int n = paramInt3 + j;
          if ((n >= localView.getTop()) && (n < localView.getBottom()) && (canScroll(localView, true, paramInt1, m - localView.getLeft(), n - localView.getTop()))) {
            return true;
          }
        }
      }
    }
    if ((paramBoolean) && (paramView.canScrollHorizontally(-paramInt1))) {
      paramBoolean = bool2;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    PagerAdapter localPagerAdapter = mAdapter;
    boolean bool1 = false;
    boolean bool2 = false;
    if (localPagerAdapter == null) {
      return false;
    }
    int i = getClientWidth();
    int j = getScrollX();
    if (paramInt < 0)
    {
      if (j > (int)(i * mFirstOffset)) {
        bool2 = true;
      }
      return bool2;
    }
    bool2 = bool1;
    if (paramInt > 0)
    {
      bool2 = bool1;
      if (j < (int)(i * mLastOffset)) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool;
    if (((paramLayoutParams instanceof LayoutParams)) && (super.checkLayoutParams(paramLayoutParams))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void clearOnPageChangeListeners()
  {
    List localList = mOnPageChangeListeners;
    if (localList != null) {
      localList.clear();
    }
  }
  
  public void computeScroll()
  {
    mIsScrollStarted = true;
    if ((!mScroller.isFinished()) && (mScroller.computeScrollOffset()))
    {
      int i = getScrollX();
      int j = getScrollY();
      int k = mScroller.getCurrX();
      int m = mScroller.getCurrY();
      if ((i != k) || (j != m))
      {
        scrollTo(k, m);
        if (!pageScrolled(k))
        {
          mScroller.abortAnimation();
          scrollTo(0, m);
        }
      }
      ViewCompat.postInvalidateOnAnimation(this);
      return;
    }
    completeScroll(true);
  }
  
  public void dataSetChanged()
  {
    int i = mAdapter.getCount();
    mExpectedAdapterCount = i;
    int j;
    if ((mItems.size() < mOffscreenPageLimit * 2 + 1) && (mItems.size() < i)) {
      j = 1;
    } else {
      j = 0;
    }
    int k = mCurItem;
    int m = 0;
    Object localObject;
    int i4;
    for (int n = m; m < mItems.size(); n = i4)
    {
      localObject = (ItemInfo)mItems.get(m);
      int i1 = mAdapter.getItemPosition(object);
      int i2;
      int i3;
      if (i1 == -1)
      {
        i2 = k;
        i3 = m;
        i4 = n;
      }
      else
      {
        if (i1 == -2)
        {
          mItems.remove(m);
          i2 = m - 1;
          j = n;
          if (n == 0)
          {
            mAdapter.startUpdate(this);
            j = 1;
          }
          mAdapter.destroyItem(this, position, object);
          i4 = mCurItem;
          m = i2;
          n = j;
          if (i4 == position)
          {
            k = Math.max(0, Math.min(i4, i - 1));
            n = j;
            m = i2;
          }
        }
        for (;;)
        {
          j = 1;
          i2 = k;
          i3 = m;
          i4 = n;
          break;
          int i5 = position;
          i2 = k;
          i3 = m;
          i4 = n;
          if (i5 == i1) {
            break;
          }
          if (i5 == mCurItem) {
            k = i1;
          }
          position = i1;
        }
      }
      m = i3 + 1;
      k = i2;
    }
    if (n != 0) {
      mAdapter.finishUpdate(this);
    }
    Collections.sort(mItems, COMPARATOR);
    if (j != 0)
    {
      m = getChildCount();
      for (n = 0; n < m; n++)
      {
        localObject = (LayoutParams)getChildAt(n).getLayoutParams();
        if (!isDecor) {
          widthFactor = 0.0F;
        }
      }
      setCurrentItemInternal(k, false, true);
      requestLayout();
    }
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
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    if (paramAccessibilityEvent.getEventType() == 4096) {
      return super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
    }
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if (localView.getVisibility() == 0)
      {
        ItemInfo localItemInfo = infoForChild(localView);
        if ((localItemInfo != null) && (position == mCurItem) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public float distanceInfluenceForSnapDuration(float paramFloat)
  {
    return (float)Math.sin((paramFloat - 0.5F) * 0.47123894F);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getOverScrollMode();
    int j = 0;
    int k = 0;
    if (i != 0) {
      if (i == 1)
      {
        PagerAdapter localPagerAdapter = mAdapter;
        if ((localPagerAdapter != null) && (localPagerAdapter.getCount() > 1)) {}
      }
      else
      {
        mLeftEdge.finish();
        mRightEdge.finish();
        break label260;
      }
    }
    int n;
    int m;
    if (!mLeftEdge.isFinished())
    {
      j = paramCanvas.save();
      i = getHeight() - getPaddingTop() - getPaddingBottom();
      n = getWidth();
      paramCanvas.rotate(270.0F);
      k = -i;
      paramCanvas.translate(getPaddingTop() + k, mFirstOffset * n);
      mLeftEdge.setSize(i, n);
      m = false | mLeftEdge.draw(paramCanvas);
      paramCanvas.restoreToCount(j);
    }
    j = m;
    boolean bool;
    if (!mRightEdge.isFinished())
    {
      i = paramCanvas.save();
      int i1 = getWidth();
      int i2 = getHeight();
      j = getPaddingTop();
      n = getPaddingBottom();
      paramCanvas.rotate(90.0F);
      paramCanvas.translate(-getPaddingTop(), -(mLastOffset + 1.0F) * i1);
      mRightEdge.setSize(i2 - j - n, i1);
      bool = m | mRightEdge.draw(paramCanvas);
      paramCanvas.restoreToCount(i);
    }
    label260:
    if (bool) {
      ViewCompat.postInvalidateOnAnimation(this);
    }
  }
  
  public void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = mMarginDrawable;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  public void endFakeDrag()
  {
    if (mFakeDragging)
    {
      if (mAdapter != null)
      {
        Object localObject = mVelocityTracker;
        ((VelocityTracker)localObject).computeCurrentVelocity(1000, mMaximumVelocity);
        int i = (int)((VelocityTracker)localObject).getXVelocity(mActivePointerId);
        mPopulatePending = true;
        int j = getClientWidth();
        int k = getScrollX();
        localObject = infoForCurrentScrollPosition();
        setCurrentItemInternal(determineTargetPage(position, (k / j - offset) / widthFactor, i, (int)(mLastMotionX - mInitialMotionX)), true, true, i);
      }
      endDrag();
      mFakeDragging = false;
      return;
    }
    throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
  }
  
  public boolean executeKeyEvent(@NonNull KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0)
    {
      int i = paramKeyEvent.getKeyCode();
      if (i != 21)
      {
        if (i != 22)
        {
          if (i == 61)
          {
            if (paramKeyEvent.hasNoModifiers()) {
              return arrowScroll(2);
            }
            if (paramKeyEvent.hasModifiers(1)) {
              return arrowScroll(1);
            }
          }
        }
        else
        {
          if (paramKeyEvent.hasModifiers(2)) {
            return pageRight();
          }
          return arrowScroll(66);
        }
      }
      else
      {
        if (paramKeyEvent.hasModifiers(2)) {
          return pageLeft();
        }
        return arrowScroll(17);
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public void fakeDragBy(float paramFloat)
  {
    if (mFakeDragging)
    {
      if (mAdapter == null) {
        return;
      }
      mLastMotionX += paramFloat;
      float f1 = getScrollX() - paramFloat;
      float f2 = getClientWidth();
      paramFloat = mFirstOffset * f2;
      float f3 = mLastOffset * f2;
      Object localObject1 = (ItemInfo)mItems.get(0);
      Object localObject2 = mItems;
      localObject2 = (ItemInfo)((ArrayList)localObject2).get(((ArrayList)localObject2).size() - 1);
      if (position != 0) {
        paramFloat = offset * f2;
      }
      if (position != mAdapter.getCount() - 1) {
        f3 = offset * f2;
      }
      if (f1 >= paramFloat)
      {
        paramFloat = f1;
        if (f1 > f3) {
          paramFloat = f3;
        }
      }
      f3 = mLastMotionX;
      int i = (int)paramFloat;
      mLastMotionX = (paramFloat - i + f3);
      scrollTo(i, getScrollY());
      pageScrolled(i);
      long l = SystemClock.uptimeMillis();
      localObject1 = MotionEvent.obtain(mFakeDragBeginTime, l, 2, mLastMotionX, 0.0F, 0);
      mVelocityTracker.addMovement((MotionEvent)localObject1);
      ((MotionEvent)localObject1).recycle();
      return;
    }
    throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
  }
  
  public ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new LayoutParams();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return generateDefaultLayoutParams();
  }
  
  @Nullable
  public PagerAdapter getAdapter()
  {
    return mAdapter;
  }
  
  public int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (mDrawingOrder == 2) {
      i = paramInt1 - 1 - paramInt2;
    }
    return mDrawingOrderedChildren.get(i)).getLayoutParams()).childIndex;
  }
  
  public int getCurrentItem()
  {
    return mCurItem;
  }
  
  public int getOffscreenPageLimit()
  {
    return mOffscreenPageLimit;
  }
  
  public int getPageMargin()
  {
    return mPageMargin;
  }
  
  public ItemInfo infoForAnyChild(View paramView)
  {
    for (;;)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this) {
        break label34;
      }
      if ((localViewParent == null) || (!(localViewParent instanceof View))) {
        break;
      }
      paramView = (View)localViewParent;
    }
    return null;
    label34:
    return infoForChild(paramView);
  }
  
  public ItemInfo infoForChild(View paramView)
  {
    for (int i = 0; i < mItems.size(); i++)
    {
      ItemInfo localItemInfo = (ItemInfo)mItems.get(i);
      if (mAdapter.isViewFromObject(paramView, object)) {
        return localItemInfo;
      }
    }
    return null;
  }
  
  public ItemInfo infoForPosition(int paramInt)
  {
    for (int i = 0; i < mItems.size(); i++)
    {
      ItemInfo localItemInfo = (ItemInfo)mItems.get(i);
      if (position == paramInt) {
        return localItemInfo;
      }
    }
    return null;
  }
  
  public void initViewPager()
  {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context localContext = getContext();
    mScroller = new Scroller(localContext, sInterpolator);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    float f = getResourcesgetDisplayMetricsdensity;
    mTouchSlop = localViewConfiguration.getScaledPagingTouchSlop();
    mMinimumVelocity = ((int)(400.0F * f));
    mMaximumVelocity = localViewConfiguration.getScaledMaximumFlingVelocity();
    mLeftEdge = new EdgeEffect(localContext);
    mRightEdge = new EdgeEffect(localContext);
    mFlingDistance = ((int)(25.0F * f));
    mCloseEnough = ((int)(2.0F * f));
    mDefaultGutterSize = ((int)(f * 16.0F));
    ViewCompat.setAccessibilityDelegate(this, new MyAccessibilityDelegate());
    if (ViewCompat.getImportantForAccessibility(this) == 0) {
      ViewCompat.setImportantForAccessibility(this, 1);
    }
    ViewCompat.setOnApplyWindowInsetsListener(this, new OnApplyWindowInsetsListener()
    {
      private final Rect mTempRect = new Rect();
      
      public WindowInsetsCompat onApplyWindowInsets(View paramAnonymousView, WindowInsetsCompat paramAnonymousWindowInsetsCompat)
      {
        paramAnonymousView = ViewCompat.onApplyWindowInsets(paramAnonymousView, paramAnonymousWindowInsetsCompat);
        if (paramAnonymousView.isConsumed()) {
          return paramAnonymousView;
        }
        paramAnonymousWindowInsetsCompat = mTempRect;
        left = paramAnonymousView.getSystemWindowInsetLeft();
        top = paramAnonymousView.getSystemWindowInsetTop();
        right = paramAnonymousView.getSystemWindowInsetRight();
        bottom = paramAnonymousView.getSystemWindowInsetBottom();
        int i = 0;
        int j = getChildCount();
        while (i < j)
        {
          WindowInsetsCompat localWindowInsetsCompat = ViewCompat.dispatchApplyWindowInsets(getChildAt(i), paramAnonymousView);
          left = Math.min(localWindowInsetsCompat.getSystemWindowInsetLeft(), left);
          top = Math.min(localWindowInsetsCompat.getSystemWindowInsetTop(), top);
          right = Math.min(localWindowInsetsCompat.getSystemWindowInsetRight(), right);
          bottom = Math.min(localWindowInsetsCompat.getSystemWindowInsetBottom(), bottom);
          i++;
        }
        return paramAnonymousView.replaceSystemWindowInsets(left, top, right, bottom);
      }
    });
  }
  
  public boolean isFakeDragging()
  {
    return mFakeDragging;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    mFirstLayout = true;
  }
  
  public void onDetachedFromWindow()
  {
    removeCallbacks(mEndScrollRunnable);
    Scroller localScroller = mScroller;
    if ((localScroller != null) && (!localScroller.isFinished())) {
      mScroller.abortAnimation();
    }
    super.onDetachedFromWindow();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((mPageMargin > 0) && (mMarginDrawable != null) && (mItems.size() > 0) && (mAdapter != null))
    {
      int i = getScrollX();
      int j = getWidth();
      float f1 = mPageMargin;
      float f2 = j;
      float f3 = f1 / f2;
      Object localObject = mItems;
      int k = 0;
      localObject = (ItemInfo)((ArrayList)localObject).get(0);
      f1 = offset;
      int m = mItems.size();
      int n = position;
      int i1 = mItems.get(m - 1)).position;
      while (n < i1)
      {
        int i2;
        for (;;)
        {
          i2 = position;
          if ((n <= i2) || (k >= m)) {
            break;
          }
          localObject = mItems;
          k++;
          localObject = (ItemInfo)((ArrayList)localObject).get(k);
        }
        float f4;
        float f5;
        if (n == i2)
        {
          f4 = offset;
          f1 = widthFactor;
          f5 = (f4 + f1) * f2;
          f1 = f4 + f1 + f3;
        }
        else
        {
          f4 = mAdapter.getPageWidth(n);
          f5 = (f1 + f4) * f2;
          f1 = f4 + f3 + f1;
        }
        if (mPageMargin + f5 > i)
        {
          mMarginDrawable.setBounds(Math.round(f5), mTopPageBounds, Math.round(mPageMargin + f5), mBottomPageBounds);
          mMarginDrawable.draw(paramCanvas);
        }
        if (f5 > i + j) {
          break;
        }
        n++;
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction() & 0xFF;
    if ((i != 3) && (i != 1))
    {
      if (i != 0)
      {
        if (mIsBeingDragged) {
          return true;
        }
        if (mIsUnableToDrag) {
          return false;
        }
      }
      float f5;
      if (i != 0)
      {
        if (i != 2)
        {
          if (i == 6) {
            onSecondaryPointerUp(paramMotionEvent);
          }
        }
        else
        {
          i = mActivePointerId;
          if (i != -1)
          {
            i = paramMotionEvent.findPointerIndex(i);
            float f1 = paramMotionEvent.getX(i);
            float f2 = f1 - mLastMotionX;
            float f3 = Math.abs(f2);
            float f4 = paramMotionEvent.getY(i);
            f5 = Math.abs(f4 - mInitialMotionY);
            boolean bool = f2 < 0.0F;
            if ((bool) && (!isGutterDrag(mLastMotionX, f2)) && (canScroll(this, false, (int)f2, (int)f1, (int)f4)))
            {
              mLastMotionX = f1;
              mLastMotionY = f4;
              mIsUnableToDrag = true;
              return false;
            }
            int j = mTouchSlop;
            if ((f3 > j) && (f3 * 0.5F > f5))
            {
              mIsBeingDragged = true;
              requestParentDisallowInterceptTouchEvent(true);
              setScrollState(1);
              f3 = mInitialMotionX;
              f5 = mTouchSlop;
              if (bool) {
                f5 = f3 + f5;
              } else {
                f5 = f3 - f5;
              }
              mLastMotionX = f5;
              mLastMotionY = f4;
              setScrollingCacheEnabled(true);
            }
            else if (f5 > j)
            {
              mIsUnableToDrag = true;
            }
            if ((mIsBeingDragged) && (performDrag(f1))) {
              ViewCompat.postInvalidateOnAnimation(this);
            }
          }
        }
      }
      else
      {
        f5 = paramMotionEvent.getX();
        mInitialMotionX = f5;
        mLastMotionX = f5;
        f5 = paramMotionEvent.getY();
        mInitialMotionY = f5;
        mLastMotionY = f5;
        mActivePointerId = paramMotionEvent.getPointerId(0);
        mIsUnableToDrag = false;
        mIsScrollStarted = true;
        mScroller.computeScrollOffset();
        if ((mScrollState == 2) && (Math.abs(mScroller.getFinalX() - mScroller.getCurrX()) > mCloseEnough))
        {
          mScroller.abortAnimation();
          mPopulatePending = false;
          populate();
          mIsBeingDragged = true;
          requestParentDisallowInterceptTouchEvent(true);
          setScrollState(1);
        }
        else
        {
          completeScroll(false);
          mIsBeingDragged = false;
        }
      }
      if (mVelocityTracker == null) {
        mVelocityTracker = VelocityTracker.obtain();
      }
      mVelocityTracker.addMovement(paramMotionEvent);
      return mIsBeingDragged;
    }
    resetTouch();
    return false;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getChildCount();
    int j = paramInt3 - paramInt1;
    int k = paramInt4 - paramInt2;
    paramInt2 = getPaddingLeft();
    paramInt1 = getPaddingTop();
    paramInt4 = getPaddingRight();
    paramInt3 = getPaddingBottom();
    int m = getScrollX();
    int n = 0;
    View localView;
    LayoutParams localLayoutParams;
    for (int i1 = 0; n < i; i1 = i6)
    {
      localView = getChildAt(n);
      int i2 = paramInt2;
      int i3 = paramInt1;
      int i4 = paramInt4;
      int i5 = paramInt3;
      i6 = i1;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        i2 = paramInt2;
        i3 = paramInt1;
        i4 = paramInt4;
        i5 = paramInt3;
        i6 = i1;
        if (isDecor)
        {
          i5 = gravity;
          i6 = i5 & 0x7;
          i4 = i5 & 0x70;
          if (i6 != 1)
          {
            if (i6 != 3)
            {
              if (i6 != 5)
              {
                i6 = paramInt2;
                i5 = paramInt2;
                paramInt2 = i6;
                break label246;
              }
              i6 = j - paramInt4 - localView.getMeasuredWidth();
              paramInt4 += localView.getMeasuredWidth();
            }
            else
            {
              i6 = localView.getMeasuredWidth() + paramInt2;
              i5 = paramInt2;
              paramInt2 = i6;
              break label246;
            }
          }
          else {
            i6 = Math.max((j - localView.getMeasuredWidth()) / 2, paramInt2);
          }
          i5 = i6;
          label246:
          if (i4 != 16)
          {
            if (i4 != 48)
            {
              if (i4 != 80)
              {
                i4 = paramInt1;
                i6 = paramInt1;
                paramInt1 = i4;
              }
              else
              {
                i6 = k - paramInt3 - localView.getMeasuredHeight();
                paramInt3 += localView.getMeasuredHeight();
              }
            }
            else
            {
              i4 = localView.getMeasuredHeight() + paramInt1;
              i6 = paramInt1;
              paramInt1 = i4;
            }
          }
          else {
            i6 = Math.max((k - localView.getMeasuredHeight()) / 2, paramInt1);
          }
          i5 += m;
          localView.layout(i5, i6, localView.getMeasuredWidth() + i5, localView.getMeasuredHeight() + i6);
          i6 = i1 + 1;
          i5 = paramInt3;
          i4 = paramInt4;
          i3 = paramInt1;
          i2 = paramInt2;
        }
      }
      n++;
      paramInt2 = i2;
      paramInt1 = i3;
      paramInt4 = i4;
      paramInt3 = i5;
    }
    for (int i6 = 0; i6 < i; i6++)
    {
      localView = getChildAt(i6);
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if (!isDecor)
        {
          ItemInfo localItemInfo = infoForChild(localView);
          if (localItemInfo != null)
          {
            float f = j - paramInt2 - paramInt4;
            n = (int)(offset * f) + paramInt2;
            if (needsMeasure)
            {
              needsMeasure = false;
              localView.measure(View.MeasureSpec.makeMeasureSpec((int)(f * widthFactor), 1073741824), View.MeasureSpec.makeMeasureSpec(k - paramInt1 - paramInt3, 1073741824));
            }
            localView.layout(n, paramInt1, localView.getMeasuredWidth() + n, localView.getMeasuredHeight() + paramInt1);
          }
        }
      }
    }
    mTopPageBounds = paramInt1;
    mBottomPageBounds = (k - paramInt3);
    mDecorChildCount = i1;
    if (mFirstLayout) {
      scrollToItem(mCurItem, false, 0, false);
    }
    mFirstLayout = false;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    setMeasuredDimension(View.getDefaultSize(0, paramInt1), View.getDefaultSize(0, paramInt2));
    paramInt1 = getMeasuredWidth();
    mGutterSize = Math.min(paramInt1 / 10, mDefaultGutterSize);
    paramInt1 = paramInt1 - getPaddingLeft() - getPaddingRight();
    paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int j = getChildCount();
    int k = 0;
    Object localObject1;
    Object localObject2;
    for (;;)
    {
      int m = 1;
      int n = 1073741824;
      if (k >= j) {
        break;
      }
      localObject1 = getChildAt(k);
      int i1 = paramInt1;
      i2 = paramInt2;
      if (((View)localObject1).getVisibility() != 8)
      {
        localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        i1 = paramInt1;
        i2 = paramInt2;
        if (localObject2 != null)
        {
          i1 = paramInt1;
          i2 = paramInt2;
          if (isDecor)
          {
            i1 = gravity;
            i2 = i1 & 0x7;
            i1 &= 0x70;
            int i3;
            if ((i1 != 48) && (i1 != 80)) {
              i3 = 0;
            } else {
              i3 = 1;
            }
            int i4 = m;
            if (i2 != 3) {
              if (i2 == 5) {
                i4 = m;
              } else {
                i4 = 0;
              }
            }
            i1 = Integer.MIN_VALUE;
            if (i3 != 0)
            {
              i2 = Integer.MIN_VALUE;
              i1 = 1073741824;
            }
            else if (i4 != 0)
            {
              i2 = 1073741824;
            }
            else
            {
              i2 = Integer.MIN_VALUE;
            }
            m = width;
            int i5;
            if (m != -2)
            {
              if (m != -1) {
                i1 = m;
              } else {
                i1 = paramInt1;
              }
              m = 1073741824;
              i5 = i1;
            }
            else
            {
              i5 = paramInt1;
              m = i1;
            }
            i1 = height;
            if (i1 != -2)
            {
              if (i1 != -1) {
                i2 = i1;
              } else {
                i2 = paramInt2;
              }
            }
            else
            {
              i1 = paramInt2;
              n = i2;
              i2 = i1;
            }
            ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(i5, m), View.MeasureSpec.makeMeasureSpec(i2, n));
            if (i3 != 0)
            {
              i2 = paramInt2 - ((View)localObject1).getMeasuredHeight();
              i1 = paramInt1;
            }
            else
            {
              i1 = paramInt1;
              i2 = paramInt2;
              if (i4 != 0)
              {
                i1 = paramInt1 - ((View)localObject1).getMeasuredWidth();
                i2 = paramInt2;
              }
            }
          }
        }
      }
      k++;
      paramInt1 = i1;
      paramInt2 = i2;
    }
    mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
    mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
    mInLayout = true;
    populate();
    mInLayout = false;
    int i2 = getChildCount();
    for (paramInt2 = i; paramInt2 < i2; paramInt2++)
    {
      localObject2 = getChildAt(paramInt2);
      if (((View)localObject2).getVisibility() != 8)
      {
        localObject1 = (LayoutParams)((View)localObject2).getLayoutParams();
        if ((localObject1 == null) || (!isDecor)) {
          ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec((int)(paramInt1 * widthFactor), 1073741824), mChildHeightMeasureSpec);
        }
      }
    }
  }
  
  @CallSuper
  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    int i = mDecorChildCount;
    int j = 0;
    Object localObject;
    if (i > 0)
    {
      int k = getScrollX();
      i = getPaddingLeft();
      int m = getPaddingRight();
      int n = getWidth();
      int i1 = getChildCount();
      for (int i2 = 0; i2 < i1; i2++)
      {
        View localView = getChildAt(i2);
        localObject = (LayoutParams)localView.getLayoutParams();
        if (isDecor)
        {
          int i3 = gravity & 0x7;
          if (i3 != 1)
          {
            int i4;
            if (i3 != 3)
            {
              if (i3 != 5)
              {
                i4 = i;
                i3 = i;
                i = i4;
              }
              else
              {
                i3 = n - m - localView.getMeasuredWidth();
                m += localView.getMeasuredWidth();
              }
            }
            else
            {
              i4 = localView.getWidth() + i;
              i3 = i;
              i = i4;
            }
          }
          else
          {
            i3 = Math.max((n - localView.getMeasuredWidth()) / 2, i);
          }
          i3 = i3 + k - localView.getLeft();
          if (i3 != 0) {
            localView.offsetLeftAndRight(i3);
          }
        }
      }
    }
    dispatchOnPageScrolled(paramInt1, paramFloat, paramInt2);
    if (mPageTransformer != null)
    {
      i = getScrollX();
      paramInt2 = getChildCount();
      for (paramInt1 = j; paramInt1 < paramInt2; paramInt1++)
      {
        localObject = getChildAt(paramInt1);
        if (!getLayoutParamsisDecor)
        {
          paramFloat = (((View)localObject).getLeft() - i) / getClientWidth();
          mPageTransformer.transformPage((View)localObject, paramFloat);
        }
      }
    }
    mCalledSuper = true;
  }
  
  public boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i = getChildCount();
    int j = -1;
    int k;
    if ((paramInt & 0x2) != 0)
    {
      j = i;
      i = 0;
      k = 1;
    }
    else
    {
      i--;
      k = -1;
    }
    while (i != j)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        ItemInfo localItemInfo = infoForChild(localView);
        if ((localItemInfo != null) && (position == mCurItem) && (localView.requestFocus(paramInt, paramRect))) {
          return true;
        }
      }
      i += k;
    }
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    SavedState localSavedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    paramParcelable = mAdapter;
    if (paramParcelable != null)
    {
      paramParcelable.restoreState(adapterState, loader);
      setCurrentItemInternal(position, false, true);
    }
    else
    {
      mRestoredCurItem = position;
      mRestoredAdapterState = adapterState;
      mRestoredClassLoader = loader;
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    position = mCurItem;
    PagerAdapter localPagerAdapter = mAdapter;
    if (localPagerAdapter != null) {
      adapterState = localPagerAdapter.saveState();
    }
    return localSavedState;
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3)
    {
      paramInt2 = mPageMargin;
      recomputeScrollPosition(paramInt1, paramInt3, paramInt2, paramInt2);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (mFakeDragging) {
      return true;
    }
    int i = paramMotionEvent.getAction();
    boolean bool = false;
    if ((i == 0) && (paramMotionEvent.getEdgeFlags() != 0)) {
      return false;
    }
    Object localObject = mAdapter;
    if ((localObject != null) && (((PagerAdapter)localObject).getCount() != 0))
    {
      if (mVelocityTracker == null) {
        mVelocityTracker = VelocityTracker.obtain();
      }
      mVelocityTracker.addMovement(paramMotionEvent);
      i = paramMotionEvent.getAction() & 0xFF;
      float f1;
      if (i != 0)
      {
        float f3;
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
                  mLastMotionX = paramMotionEvent.getX(paramMotionEvent.findPointerIndex(mActivePointerId));
                }
              }
              else
              {
                i = paramMotionEvent.getActionIndex();
                mLastMotionX = paramMotionEvent.getX(i);
                mActivePointerId = paramMotionEvent.getPointerId(i);
              }
            }
            else if (mIsBeingDragged)
            {
              scrollToItem(mCurItem, true, 0, false);
              bool = resetTouch();
            }
          }
          else
          {
            if (!mIsBeingDragged)
            {
              i = paramMotionEvent.findPointerIndex(mActivePointerId);
              if (i == -1)
              {
                bool = resetTouch();
                break label600;
              }
              f1 = paramMotionEvent.getX(i);
              float f2 = Math.abs(f1 - mLastMotionX);
              f3 = paramMotionEvent.getY(i);
              float f4 = Math.abs(f3 - mLastMotionY);
              if ((f2 > mTouchSlop) && (f2 > f4))
              {
                mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                f2 = mInitialMotionX;
                if (f1 - f2 > 0.0F) {
                  f1 = f2 + mTouchSlop;
                } else {
                  f1 = f2 - mTouchSlop;
                }
                mLastMotionX = f1;
                mLastMotionY = f3;
                setScrollState(1);
                setScrollingCacheEnabled(true);
                localObject = getParent();
                if (localObject != null) {
                  ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
                }
              }
            }
            if (mIsBeingDragged) {
              bool = false | performDrag(paramMotionEvent.getX(paramMotionEvent.findPointerIndex(mActivePointerId)));
            }
          }
        }
        else if (mIsBeingDragged)
        {
          localObject = mVelocityTracker;
          ((VelocityTracker)localObject).computeCurrentVelocity(1000, mMaximumVelocity);
          i = (int)((VelocityTracker)localObject).getXVelocity(mActivePointerId);
          mPopulatePending = true;
          int j = getClientWidth();
          int k = getScrollX();
          localObject = infoForCurrentScrollPosition();
          f3 = mPageMargin;
          f1 = j;
          f3 /= f1;
          setCurrentItemInternal(determineTargetPage(position, (k / f1 - offset) / (widthFactor + f3), i, (int)(paramMotionEvent.getX(paramMotionEvent.findPointerIndex(mActivePointerId)) - mInitialMotionX)), true, true, i);
          bool = resetTouch();
        }
      }
      else
      {
        mScroller.abortAnimation();
        mPopulatePending = false;
        populate();
        f1 = paramMotionEvent.getX();
        mInitialMotionX = f1;
        mLastMotionX = f1;
        f1 = paramMotionEvent.getY();
        mInitialMotionY = f1;
        mLastMotionY = f1;
        mActivePointerId = paramMotionEvent.getPointerId(0);
      }
      label600:
      if (bool) {
        ViewCompat.postInvalidateOnAnimation(this);
      }
      return true;
    }
    return false;
  }
  
  public boolean pageLeft()
  {
    int i = mCurItem;
    if (i > 0)
    {
      setCurrentItem(i - 1, true);
      return true;
    }
    return false;
  }
  
  public boolean pageRight()
  {
    PagerAdapter localPagerAdapter = mAdapter;
    if ((localPagerAdapter != null) && (mCurItem < localPagerAdapter.getCount() - 1))
    {
      setCurrentItem(mCurItem + 1, true);
      return true;
    }
    return false;
  }
  
  public void populate()
  {
    populate(mCurItem);
  }
  
  public void populate(int paramInt)
  {
    int i = mCurItem;
    if (i != paramInt)
    {
      localObject1 = infoForPosition(i);
      mCurItem = paramInt;
    }
    else
    {
      localObject1 = null;
    }
    if (mAdapter == null)
    {
      sortChildDrawingOrder();
      return;
    }
    if (mPopulatePending)
    {
      sortChildDrawingOrder();
      return;
    }
    if (getWindowToken() == null) {
      return;
    }
    mAdapter.startUpdate(this);
    paramInt = mOffscreenPageLimit;
    i = mCurItem;
    int j = 0;
    int k = Math.max(0, i - paramInt);
    int m = mAdapter.getCount();
    int n = Math.min(m - 1, mCurItem + paramInt);
    Object localObject2;
    if (m == mExpectedAdapterCount)
    {
      while (j < mItems.size())
      {
        localObject2 = (ItemInfo)mItems.get(j);
        i = position;
        paramInt = mCurItem;
        if (i >= paramInt)
        {
          if (i != paramInt) {
            break;
          }
          break label180;
        }
        j++;
      }
      localObject2 = null;
      label180:
      Object localObject3 = localObject2;
      if (localObject2 == null)
      {
        localObject3 = localObject2;
        if (m > 0) {
          localObject3 = addNewItem(mCurItem, j);
        }
      }
      if (localObject3 != null)
      {
        int i1 = j - 1;
        if (i1 >= 0) {
          localObject2 = (ItemInfo)mItems.get(i1);
        } else {
          localObject2 = null;
        }
        int i2 = getClientWidth();
        float f1;
        if (i2 <= 0)
        {
          f1 = 0.0F;
        }
        else
        {
          f2 = widthFactor;
          f1 = getPaddingLeft() / i2 + (2.0F - f2);
        }
        int i3 = mCurItem - 1;
        float f3 = 0.0F;
        Object localObject4 = localObject2;
        while (i3 >= 0)
        {
          if ((f3 >= f1) && (i3 < k))
          {
            if (localObject4 == null) {
              break;
            }
            paramInt = j;
            i = i1;
            localObject2 = localObject4;
            f2 = f3;
            if (i3 != position) {
              break label584;
            }
            paramInt = j;
            i = i1;
            localObject2 = localObject4;
            f2 = f3;
            if (scrolling) {
              break label584;
            }
            mItems.remove(i1);
            mAdapter.destroyItem(this, i3, object);
            i1--;
            j--;
            paramInt = j;
            i = i1;
            f2 = f3;
            if (i1 >= 0)
            {
              localObject2 = (ItemInfo)mItems.get(i1);
              paramInt = j;
              i = i1;
              f2 = f3;
              break label584;
            }
          }
          else if ((localObject4 != null) && (i3 == position))
          {
            f3 += widthFactor;
            i1--;
            paramInt = j;
            i = i1;
            f2 = f3;
            if (i1 >= 0)
            {
              localObject2 = (ItemInfo)mItems.get(i1);
              paramInt = j;
              i = i1;
              f2 = f3;
              break label584;
            }
          }
          else
          {
            f3 += addNewItem1widthFactor;
            j++;
            paramInt = j;
            i = i1;
            f2 = f3;
            if (i1 >= 0)
            {
              localObject2 = (ItemInfo)mItems.get(i1);
              paramInt = j;
              i = i1;
              f2 = f3;
              break label584;
            }
          }
          localObject2 = null;
          label584:
          i3--;
          j = paramInt;
          i1 = i;
          localObject4 = localObject2;
          f3 = f2;
        }
        float f2 = widthFactor;
        paramInt = j + 1;
        if (f2 < 2.0F)
        {
          if (paramInt < mItems.size()) {
            localObject2 = (ItemInfo)mItems.get(paramInt);
          } else {
            localObject2 = null;
          }
          if (i2 <= 0) {
            f1 = 0.0F;
          } else {
            f1 = getPaddingRight() / i2 + 2.0F;
          }
          i = mCurItem;
          for (;;)
          {
            i1 = i + 1;
            if (i1 >= m) {
              break;
            }
            if ((f2 >= f1) && (i1 > n))
            {
              if (localObject2 == null) {
                break;
              }
              i = i1;
              if (i1 != position) {
                continue;
              }
              i = i1;
              if (scrolling) {
                continue;
              }
              mItems.remove(paramInt);
              mAdapter.destroyItem(this, i1, object);
              f3 = f2;
              i = paramInt;
              if (paramInt < mItems.size())
              {
                localObject2 = (ItemInfo)mItems.get(paramInt);
                i = i1;
              }
            }
            else if ((localObject2 != null) && (i1 == position))
            {
              f2 += widthFactor;
              paramInt++;
              f3 = f2;
              i = paramInt;
              if (paramInt < mItems.size())
              {
                localObject2 = (ItemInfo)mItems.get(paramInt);
                i = i1;
              }
            }
            else
            {
              localObject2 = addNewItem(i1, paramInt);
              paramInt++;
              f2 += widthFactor;
              f3 = f2;
              i = paramInt;
              if (paramInt < mItems.size())
              {
                localObject2 = (ItemInfo)mItems.get(paramInt);
                i = i1;
                continue;
              }
            }
            localObject2 = null;
            f2 = f3;
            paramInt = i;
            i = i1;
          }
        }
        calculatePageOffsets((ItemInfo)localObject3, j, (ItemInfo)localObject1);
        mAdapter.setPrimaryItem(this, mCurItem, object);
      }
      mAdapter.finishUpdate(this);
      i = getChildCount();
      for (paramInt = 0; paramInt < i; paramInt++)
      {
        localObject1 = getChildAt(paramInt);
        localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
        childIndex = paramInt;
        if ((!isDecor) && (widthFactor == 0.0F))
        {
          localObject1 = infoForChild((View)localObject1);
          if (localObject1 != null)
          {
            widthFactor = widthFactor;
            position = position;
          }
        }
      }
      sortChildDrawingOrder();
      if (hasFocus())
      {
        localObject2 = findFocus();
        if (localObject2 != null) {
          localObject2 = infoForAnyChild((View)localObject2);
        } else {
          localObject2 = null;
        }
        if ((localObject2 == null) || (position != mCurItem)) {
          for (paramInt = 0; paramInt < getChildCount(); paramInt++)
          {
            localObject1 = getChildAt(paramInt);
            localObject2 = infoForChild((View)localObject1);
            if ((localObject2 != null) && (position == mCurItem) && (((View)localObject1).requestFocus(2))) {
              break;
            }
          }
        }
      }
      return;
    }
    String str;
    try
    {
      localObject2 = getResources().getResourceName(getId());
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      str = Integer.toHexString(getId());
    }
    Object localObject1 = z2.t("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: ");
    ((StringBuilder)localObject1).append(mExpectedAdapterCount);
    ((StringBuilder)localObject1).append(", found: ");
    ((StringBuilder)localObject1).append(m);
    ((StringBuilder)localObject1).append(" Pager id: ");
    ((StringBuilder)localObject1).append(str);
    ((StringBuilder)localObject1).append(" Pager class: ");
    ((StringBuilder)localObject1).append(getClass());
    ((StringBuilder)localObject1).append(" Problematic adapter: ");
    ((StringBuilder)localObject1).append(mAdapter.getClass());
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public void removeOnAdapterChangeListener(@NonNull OnAdapterChangeListener paramOnAdapterChangeListener)
  {
    List localList = mAdapterChangeListeners;
    if (localList != null) {
      localList.remove(paramOnAdapterChangeListener);
    }
  }
  
  public void removeOnPageChangeListener(@NonNull OnPageChangeListener paramOnPageChangeListener)
  {
    List localList = mOnPageChangeListeners;
    if (localList != null) {
      localList.remove(paramOnPageChangeListener);
    }
  }
  
  public void removeView(View paramView)
  {
    if (mInLayout) {
      removeViewInLayout(paramView);
    } else {
      super.removeView(paramView);
    }
  }
  
  public void setAdapter(@Nullable PagerAdapter paramPagerAdapter)
  {
    Object localObject = mAdapter;
    int i = 0;
    int j;
    if (localObject != null)
    {
      ((PagerAdapter)localObject).setViewPagerObserver(null);
      mAdapter.startUpdate(this);
      for (j = 0; j < mItems.size(); j++)
      {
        localObject = (ItemInfo)mItems.get(j);
        mAdapter.destroyItem(this, position, object);
      }
      mAdapter.finishUpdate(this);
      mItems.clear();
      removeNonDecorViews();
      mCurItem = 0;
      scrollTo(0, 0);
    }
    PagerAdapter localPagerAdapter = mAdapter;
    mAdapter = paramPagerAdapter;
    mExpectedAdapterCount = 0;
    if (paramPagerAdapter != null)
    {
      if (mObserver == null) {
        mObserver = new PagerObserver();
      }
      mAdapter.setViewPagerObserver(mObserver);
      mPopulatePending = false;
      boolean bool = mFirstLayout;
      mFirstLayout = true;
      mExpectedAdapterCount = mAdapter.getCount();
      if (mRestoredCurItem >= 0)
      {
        mAdapter.restoreState(mRestoredAdapterState, mRestoredClassLoader);
        setCurrentItemInternal(mRestoredCurItem, false, true);
        mRestoredCurItem = -1;
        mRestoredAdapterState = null;
        mRestoredClassLoader = null;
      }
      else if (!bool)
      {
        populate();
      }
      else
      {
        requestLayout();
      }
    }
    localObject = mAdapterChangeListeners;
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      int k = mAdapterChangeListeners.size();
      for (j = i; j < k; j++) {
        ((OnAdapterChangeListener)mAdapterChangeListeners.get(j)).onAdapterChanged(this, localPagerAdapter, paramPagerAdapter);
      }
    }
  }
  
  public void setCurrentItem(int paramInt)
  {
    mPopulatePending = false;
    setCurrentItemInternal(paramInt, mFirstLayout ^ true, false);
  }
  
  public void setCurrentItem(int paramInt, boolean paramBoolean)
  {
    mPopulatePending = false;
    setCurrentItemInternal(paramInt, paramBoolean, false);
  }
  
  public void setCurrentItemInternal(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    setCurrentItemInternal(paramInt, paramBoolean1, paramBoolean2, 0);
  }
  
  public void setCurrentItemInternal(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    PagerAdapter localPagerAdapter = mAdapter;
    boolean bool = false;
    if ((localPagerAdapter != null) && (localPagerAdapter.getCount() > 0))
    {
      if ((!paramBoolean2) && (mCurItem == paramInt1) && (mItems.size() != 0))
      {
        setScrollingCacheEnabled(false);
        return;
      }
      int i;
      if (paramInt1 < 0)
      {
        i = 0;
      }
      else
      {
        i = paramInt1;
        if (paramInt1 >= mAdapter.getCount()) {
          i = mAdapter.getCount() - 1;
        }
      }
      int j = mOffscreenPageLimit;
      paramInt1 = mCurItem;
      if ((i > paramInt1 + j) || (i < paramInt1 - j)) {
        for (paramInt1 = 0; paramInt1 < mItems.size(); paramInt1++) {
          mItems.get(paramInt1)).scrolling = true;
        }
      }
      paramBoolean2 = bool;
      if (mCurItem != i) {
        paramBoolean2 = true;
      }
      if (mFirstLayout)
      {
        mCurItem = i;
        if (paramBoolean2) {
          dispatchOnPageSelected(i);
        }
        requestLayout();
      }
      else
      {
        populate(i);
        scrollToItem(i, paramBoolean1, paramInt2, paramBoolean2);
      }
      return;
    }
    setScrollingCacheEnabled(false);
  }
  
  public OnPageChangeListener setInternalPageChangeListener(OnPageChangeListener paramOnPageChangeListener)
  {
    OnPageChangeListener localOnPageChangeListener = mInternalPageChangeListener;
    mInternalPageChangeListener = paramOnPageChangeListener;
    return localOnPageChangeListener;
  }
  
  public void setOffscreenPageLimit(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 1)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Requested offscreen page limit ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" too small; defaulting to ");
      localStringBuilder.append(1);
      Log.w("ViewPager", localStringBuilder.toString());
      i = 1;
    }
    if (i != mOffscreenPageLimit)
    {
      mOffscreenPageLimit = i;
      populate();
    }
  }
  
  @Deprecated
  public void setOnPageChangeListener(OnPageChangeListener paramOnPageChangeListener)
  {
    mOnPageChangeListener = paramOnPageChangeListener;
  }
  
  public void setPageMargin(int paramInt)
  {
    int i = mPageMargin;
    mPageMargin = paramInt;
    int j = getWidth();
    recomputeScrollPosition(j, j, paramInt, i);
    requestLayout();
  }
  
  public void setPageMarginDrawable(@DrawableRes int paramInt)
  {
    setPageMarginDrawable(ContextCompat.getDrawable(getContext(), paramInt));
  }
  
  public void setPageMarginDrawable(@Nullable Drawable paramDrawable)
  {
    mMarginDrawable = paramDrawable;
    if (paramDrawable != null) {
      refreshDrawableState();
    }
    boolean bool;
    if (paramDrawable == null) {
      bool = true;
    } else {
      bool = false;
    }
    setWillNotDraw(bool);
    invalidate();
  }
  
  public void setPageTransformer(boolean paramBoolean, @Nullable PageTransformer paramPageTransformer)
  {
    setPageTransformer(paramBoolean, paramPageTransformer, 2);
  }
  
  public void setPageTransformer(boolean paramBoolean, @Nullable PageTransformer paramPageTransformer, int paramInt)
  {
    int i = 1;
    boolean bool1;
    if (paramPageTransformer != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool2;
    if (mPageTransformer != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    int j;
    if (bool1 != bool2) {
      j = 1;
    } else {
      j = 0;
    }
    mPageTransformer = paramPageTransformer;
    setChildrenDrawingOrderEnabled(bool1);
    if (bool1)
    {
      if (paramBoolean) {
        i = 2;
      }
      mDrawingOrder = i;
      mPageTransformerLayerType = paramInt;
    }
    else
    {
      mDrawingOrder = 0;
    }
    if (j != 0) {
      populate();
    }
  }
  
  public void setScrollState(int paramInt)
  {
    if (mScrollState == paramInt) {
      return;
    }
    mScrollState = paramInt;
    if (mPageTransformer != null)
    {
      boolean bool;
      if (paramInt != 0) {
        bool = true;
      } else {
        bool = false;
      }
      enableLayers(bool);
    }
    dispatchOnScrollStateChanged(paramInt);
  }
  
  public void smoothScrollTo(int paramInt1, int paramInt2)
  {
    smoothScrollTo(paramInt1, paramInt2, 0);
  }
  
  public void smoothScrollTo(int paramInt1, int paramInt2, int paramInt3)
  {
    if (getChildCount() == 0)
    {
      setScrollingCacheEnabled(false);
      return;
    }
    Scroller localScroller = mScroller;
    int i;
    if ((localScroller != null) && (!localScroller.isFinished())) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      if (mIsScrollStarted) {
        i = mScroller.getCurrX();
      } else {
        i = mScroller.getStartX();
      }
      mScroller.abortAnimation();
      setScrollingCacheEnabled(false);
    }
    else
    {
      i = getScrollX();
    }
    int j = getScrollY();
    int k = paramInt1 - i;
    paramInt2 -= j;
    if ((k == 0) && (paramInt2 == 0))
    {
      completeScroll(false);
      populate();
      setScrollState(0);
      return;
    }
    setScrollingCacheEnabled(true);
    setScrollState(2);
    int m = getClientWidth();
    paramInt1 = m / 2;
    float f1 = Math.abs(k);
    float f2 = m;
    float f3 = Math.min(1.0F, f1 * 1.0F / f2);
    f1 = paramInt1;
    f3 = distanceInfluenceForSnapDuration(f3);
    paramInt1 = Math.abs(paramInt3);
    if (paramInt1 > 0)
    {
      paramInt1 = Math.round(Math.abs((f3 * f1 + f1) / paramInt1) * 1000.0F) * 4;
    }
    else
    {
      f1 = mAdapter.getPageWidth(mCurItem);
      paramInt1 = (int)((Math.abs(k) / (f1 * f2 + mPageMargin) + 1.0F) * 100.0F);
    }
    paramInt1 = Math.min(paramInt1, 600);
    mIsScrollStarted = false;
    mScroller.startScroll(i, j, k, paramInt2, paramInt1);
    ViewCompat.postInvalidateOnAnimation(this);
  }
  
  public boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool;
    if ((!super.verifyDrawable(paramDrawable)) && (paramDrawable != mMarginDrawable)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({java.lang.annotation.ElementType.TYPE})
  public static @interface DecorView {}
  
  public static class ItemInfo
  {
    public Object object;
    public float offset;
    public int position;
    public boolean scrolling;
    public float widthFactor;
  }
  
  public static class LayoutParams
    extends ViewGroup.LayoutParams
  {
    public int childIndex;
    public int gravity;
    public boolean isDecor;
    public boolean needsMeasure;
    public int position;
    public float widthFactor = 0.0F;
    
    public LayoutParams()
    {
      super(-1);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ViewPager.LAYOUT_ATTRS);
      gravity = paramContext.getInteger(0, 48);
      paramContext.recycle();
    }
  }
  
  public class MyAccessibilityDelegate
    extends AccessibilityDelegateCompat
  {
    public MyAccessibilityDelegate() {}
    
    private boolean canScroll()
    {
      PagerAdapter localPagerAdapter = mAdapter;
      boolean bool = true;
      if ((localPagerAdapter == null) || (localPagerAdapter.getCount() <= 1)) {
        bool = false;
      }
      return bool;
    }
    
    public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(ViewPager.class.getName());
      paramAccessibilityEvent.setScrollable(canScroll());
      if (paramAccessibilityEvent.getEventType() == 4096)
      {
        paramView = mAdapter;
        if (paramView != null)
        {
          paramAccessibilityEvent.setItemCount(paramView.getCount());
          paramAccessibilityEvent.setFromIndex(mCurItem);
          paramAccessibilityEvent.setToIndex(mCurItem);
        }
      }
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
    {
      super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfoCompat);
      paramAccessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
      paramAccessibilityNodeInfoCompat.setScrollable(canScroll());
      if (canScrollHorizontally(1)) {
        paramAccessibilityNodeInfoCompat.addAction(4096);
      }
      if (canScrollHorizontally(-1)) {
        paramAccessibilityNodeInfoCompat.addAction(8192);
      }
    }
    
    public boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      if (super.performAccessibilityAction(paramView, paramInt, paramBundle)) {
        return true;
      }
      if (paramInt != 4096)
      {
        if (paramInt != 8192) {
          return false;
        }
        if (canScrollHorizontally(-1))
        {
          paramView = ViewPager.this;
          paramView.setCurrentItem(mCurItem - 1);
          return true;
        }
        return false;
      }
      if (canScrollHorizontally(1))
      {
        paramView = ViewPager.this;
        paramView.setCurrentItem(mCurItem + 1);
        return true;
      }
      return false;
    }
  }
  
  public static abstract interface OnAdapterChangeListener
  {
    public abstract void onAdapterChanged(@NonNull ViewPager paramViewPager, @Nullable PagerAdapter paramPagerAdapter1, @Nullable PagerAdapter paramPagerAdapter2);
  }
  
  public static abstract interface OnPageChangeListener
  {
    public abstract void onPageScrollStateChanged(int paramInt);
    
    public abstract void onPageScrolled(int paramInt1, float paramFloat, @Px int paramInt2);
    
    public abstract void onPageSelected(int paramInt);
  }
  
  public static abstract interface PageTransformer
  {
    public abstract void transformPage(@NonNull View paramView, float paramFloat);
  }
  
  public class PagerObserver
    extends DataSetObserver
  {
    public PagerObserver() {}
    
    public void onChanged()
    {
      dataSetChanged();
    }
    
    public void onInvalidated()
    {
      dataSetChanged();
    }
  }
  
  public static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public ViewPager.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new ViewPager.SavedState(paramAnonymousParcel, null);
      }
      
      public ViewPager.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new ViewPager.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public ViewPager.SavedState[] newArray(int paramAnonymousInt)
      {
        return new ViewPager.SavedState[paramAnonymousInt];
      }
    };
    public Parcelable adapterState;
    public ClassLoader loader;
    public int position;
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      ClassLoader localClassLoader = paramClassLoader;
      if (paramClassLoader == null) {
        localClassLoader = getClass().getClassLoader();
      }
      position = paramParcel.readInt();
      adapterState = paramParcel.readParcelable(localClassLoader);
      loader = localClassLoader;
    }
    
    public SavedState(@NonNull Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("FragmentPager.SavedState{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" position=");
      return z2.q(localStringBuilder, position, "}");
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(position);
      paramParcel.writeParcelable(adapterState, paramInt);
    }
  }
  
  public static class SimpleOnPageChangeListener
    implements ViewPager.OnPageChangeListener
  {
    public void onPageScrollStateChanged(int paramInt) {}
    
    public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {}
    
    public void onPageSelected(int paramInt) {}
  }
  
  public static class ViewPositionComparator
    implements Comparator<View>
  {
    public int compare(View paramView1, View paramView2)
    {
      paramView1 = (ViewPager.LayoutParams)paramView1.getLayoutParams();
      paramView2 = (ViewPager.LayoutParams)paramView2.getLayoutParams();
      boolean bool = isDecor;
      if (bool != isDecor)
      {
        int i;
        if (bool) {
          i = 1;
        } else {
          i = -1;
        }
        return i;
      }
      return position - position;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.viewpager.widget.ViewPager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */