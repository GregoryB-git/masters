package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import androidx.customview.widget.ViewDragHelper.Callback;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout
  extends ViewGroup
{
  private static final int DEFAULT_FADE_COLOR = -858993460;
  private static final int DEFAULT_OVERHANG_SIZE = 32;
  private static final int MIN_FLING_VELOCITY = 400;
  private static final String TAG = "SlidingPaneLayout";
  private boolean mCanSlide;
  private int mCoveredFadeColor;
  private boolean mDisplayListReflectionLoaded;
  public final ViewDragHelper mDragHelper;
  private boolean mFirstLayout = true;
  private Method mGetDisplayList;
  private float mInitialMotionX;
  private float mInitialMotionY;
  public boolean mIsUnableToDrag;
  private final int mOverhangSize;
  private PanelSlideListener mPanelSlideListener;
  private int mParallaxBy;
  private float mParallaxOffset;
  public final ArrayList<DisableLayerRunnable> mPostedRunnables = new ArrayList();
  public boolean mPreservedOpenState;
  private Field mRecreateDisplayList;
  private Drawable mShadowDrawableLeft;
  private Drawable mShadowDrawableRight;
  public float mSlideOffset;
  public int mSlideRange;
  public View mSlideableView;
  private int mSliderFadeColor = -858993460;
  private final Rect mTmpRect = new Rect();
  
  public SlidingPaneLayout(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SlidingPaneLayout(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SlidingPaneLayout(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f = getResourcesgetDisplayMetricsdensity;
    mOverhangSize = ((int)(32.0F * f + 0.5F));
    setWillNotDraw(false);
    ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegate());
    ViewCompat.setImportantForAccessibility(this, 1);
    paramContext = ViewDragHelper.create(this, 0.5F, new DragHelperCallback());
    mDragHelper = paramContext;
    paramContext.setMinVelocity(f * 400.0F);
  }
  
  private boolean closePane(View paramView, int paramInt)
  {
    if ((!mFirstLayout) && (!smoothSlideTo(0.0F, paramInt))) {
      return false;
    }
    mPreservedOpenState = false;
    return true;
  }
  
  private void dimChildView(View paramView, float paramFloat, int paramInt)
  {
    Object localObject = (LayoutParams)paramView.getLayoutParams();
    if ((paramFloat > 0.0F) && (paramInt != 0))
    {
      int i = (int)(((0xFF000000 & paramInt) >>> 24) * paramFloat);
      if (dimPaint == null) {
        dimPaint = new Paint();
      }
      dimPaint.setColorFilter(new PorterDuffColorFilter(i << 24 | paramInt & 0xFFFFFF, PorterDuff.Mode.SRC_OVER));
      if (paramView.getLayerType() != 2) {
        paramView.setLayerType(2, dimPaint);
      }
      invalidateChildRegion(paramView);
    }
    else if (paramView.getLayerType() != 0)
    {
      localObject = dimPaint;
      if (localObject != null) {
        ((Paint)localObject).setColorFilter(null);
      }
      paramView = new DisableLayerRunnable(paramView);
      mPostedRunnables.add(paramView);
      ViewCompat.postOnAnimation(this, paramView);
    }
  }
  
  private boolean openPane(View paramView, int paramInt)
  {
    if ((!mFirstLayout) && (!smoothSlideTo(1.0F, paramInt))) {
      return false;
    }
    mPreservedOpenState = true;
    return true;
  }
  
  private void parallaxOtherViews(float paramFloat)
  {
    boolean bool1 = isLayoutRtlSupport();
    Object localObject = (LayoutParams)mSlideableView.getLayoutParams();
    boolean bool2 = dimWhenOffset;
    int i = 0;
    if (bool2)
    {
      if (bool1) {
        j = rightMargin;
      } else {
        j = leftMargin;
      }
      if (j <= 0)
      {
        j = 1;
        break label63;
      }
    }
    int j = 0;
    label63:
    int k = getChildCount();
    while (i < k)
    {
      localObject = getChildAt(i);
      if (localObject != mSlideableView)
      {
        float f = mParallaxOffset;
        int m = mParallaxBy;
        int n = (int)((1.0F - f) * m);
        mParallaxOffset = paramFloat;
        n -= (int)((1.0F - paramFloat) * m);
        m = n;
        if (bool1) {
          m = -n;
        }
        ((View)localObject).offsetLeftAndRight(m);
        if (j != 0)
        {
          f = mParallaxOffset;
          if (bool1) {
            f -= 1.0F;
          } else {
            f = 1.0F - f;
          }
          dimChildView((View)localObject, f, mCoveredFadeColor);
        }
      }
      i++;
    }
  }
  
  private static boolean viewIsOpaque(View paramView)
  {
    return paramView.isOpaque();
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
    if (paramBoolean)
    {
      if (!isLayoutRtlSupport()) {
        paramInt1 = -paramInt1;
      }
      if (paramView.canScrollHorizontally(paramInt1)) {
        return bool2;
      }
    }
    paramBoolean = false;
    return paramBoolean;
  }
  
  @Deprecated
  public boolean canSlide()
  {
    return mCanSlide;
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
  
  public boolean closePane()
  {
    return closePane(mSlideableView, 0);
  }
  
  public void computeScroll()
  {
    if (mDragHelper.continueSettling(true))
    {
      if (!mCanSlide)
      {
        mDragHelper.abort();
        return;
      }
      ViewCompat.postInvalidateOnAnimation(this);
    }
  }
  
  public void dispatchOnPanelClosed(View paramView)
  {
    PanelSlideListener localPanelSlideListener = mPanelSlideListener;
    if (localPanelSlideListener != null) {
      localPanelSlideListener.onPanelClosed(paramView);
    }
    sendAccessibilityEvent(32);
  }
  
  public void dispatchOnPanelOpened(View paramView)
  {
    PanelSlideListener localPanelSlideListener = mPanelSlideListener;
    if (localPanelSlideListener != null) {
      localPanelSlideListener.onPanelOpened(paramView);
    }
    sendAccessibilityEvent(32);
  }
  
  public void dispatchOnPanelSlide(View paramView)
  {
    PanelSlideListener localPanelSlideListener = mPanelSlideListener;
    if (localPanelSlideListener != null) {
      localPanelSlideListener.onPanelSlide(paramView, mSlideOffset);
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    Drawable localDrawable;
    if (isLayoutRtlSupport()) {
      localDrawable = mShadowDrawableRight;
    } else {
      localDrawable = mShadowDrawableLeft;
    }
    View localView;
    if (getChildCount() > 1) {
      localView = getChildAt(1);
    } else {
      localView = null;
    }
    if ((localView != null) && (localDrawable != null))
    {
      int i = localView.getTop();
      int j = localView.getBottom();
      int k = localDrawable.getIntrinsicWidth();
      int m;
      int n;
      if (isLayoutRtlSupport())
      {
        m = localView.getRight();
        n = k + m;
      }
      else
      {
        m = localView.getLeft();
        n = m;
        m -= k;
      }
      localDrawable.setBounds(m, i, n, j);
      localDrawable.draw(paramCanvas);
    }
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    Object localObject = (LayoutParams)paramView.getLayoutParams();
    int i = paramCanvas.save();
    if ((mCanSlide) && (!slideable) && (mSlideableView != null))
    {
      paramCanvas.getClipBounds(mTmpRect);
      if (isLayoutRtlSupport())
      {
        localObject = mTmpRect;
        left = Math.max(left, mSlideableView.getRight());
      }
      else
      {
        localObject = mTmpRect;
        right = Math.min(right, mSlideableView.getLeft());
      }
      paramCanvas.clipRect(mTmpRect);
    }
    boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
    paramCanvas.restoreToCount(i);
    return bool;
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
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      paramLayoutParams = new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    } else {
      paramLayoutParams = new LayoutParams(paramLayoutParams);
    }
    return paramLayoutParams;
  }
  
  @ColorInt
  public int getCoveredFadeColor()
  {
    return mCoveredFadeColor;
  }
  
  @Px
  public int getParallaxDistance()
  {
    return mParallaxBy;
  }
  
  @ColorInt
  public int getSliderFadeColor()
  {
    return mSliderFadeColor;
  }
  
  public void invalidateChildRegion(View paramView)
  {
    ViewCompat.setLayerPaint(paramView, getLayoutParamsdimPaint);
  }
  
  public boolean isDimmed(View paramView)
  {
    boolean bool1 = false;
    if (paramView == null) {
      return false;
    }
    paramView = (LayoutParams)paramView.getLayoutParams();
    boolean bool2 = bool1;
    if (mCanSlide)
    {
      bool2 = bool1;
      if (dimWhenOffset)
      {
        bool2 = bool1;
        if (mSlideOffset > 0.0F) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public boolean isLayoutRtlSupport()
  {
    int i = ViewCompat.getLayoutDirection(this);
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isOpen()
  {
    boolean bool;
    if ((mCanSlide) && (mSlideOffset != 1.0F)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isSlideable()
  {
    return mCanSlide;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    mFirstLayout = true;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    mFirstLayout = true;
    int i = mPostedRunnables.size();
    for (int j = 0; j < i; j++) {
      ((DisableLayerRunnable)mPostedRunnables.get(j)).run();
    }
    mPostedRunnables.clear();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    boolean bool1 = mCanSlide;
    boolean bool2 = true;
    if ((!bool1) && (i == 0) && (getChildCount() > 1))
    {
      View localView = getChildAt(1);
      if (localView != null) {
        mPreservedOpenState = (mDragHelper.isViewUnder(localView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY()) ^ true);
      }
    }
    if ((mCanSlide) && ((!mIsUnableToDrag) || (i == 0)))
    {
      if ((i != 3) && (i != 1))
      {
        float f1;
        float f2;
        if (i != 0)
        {
          if (i == 2)
          {
            f1 = paramMotionEvent.getX();
            f2 = paramMotionEvent.getY();
            f1 = Math.abs(f1 - mInitialMotionX);
            f2 = Math.abs(f2 - mInitialMotionY);
            if ((f1 > mDragHelper.getTouchSlop()) && (f2 > f1))
            {
              mDragHelper.cancel();
              mIsUnableToDrag = true;
              return false;
            }
          }
        }
        else
        {
          mIsUnableToDrag = false;
          f2 = paramMotionEvent.getX();
          f1 = paramMotionEvent.getY();
          mInitialMotionX = f2;
          mInitialMotionY = f1;
          if ((mDragHelper.isViewUnder(mSlideableView, (int)f2, (int)f1)) && (isDimmed(mSlideableView)))
          {
            i = 1;
            break label251;
          }
        }
        i = 0;
        label251:
        bool1 = bool2;
        if (!mDragHelper.shouldInterceptTouchEvent(paramMotionEvent)) {
          if (i != 0) {
            bool1 = bool2;
          } else {
            bool1 = false;
          }
        }
        return bool1;
      }
      mDragHelper.cancel();
      return false;
    }
    mDragHelper.cancel();
    return super.onInterceptTouchEvent(paramMotionEvent);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = isLayoutRtlSupport();
    if (bool) {
      mDragHelper.setEdgeTrackingEnabled(2);
    } else {
      mDragHelper.setEdgeTrackingEnabled(1);
    }
    int i = paramInt3 - paramInt1;
    if (bool) {
      paramInt1 = getPaddingRight();
    } else {
      paramInt1 = getPaddingLeft();
    }
    if (bool) {
      paramInt4 = getPaddingLeft();
    } else {
      paramInt4 = getPaddingRight();
    }
    int j = getPaddingTop();
    int k = getChildCount();
    if (mFirstLayout)
    {
      float f;
      if ((mCanSlide) && (mPreservedOpenState)) {
        f = 1.0F;
      } else {
        f = 0.0F;
      }
      mSlideOffset = f;
    }
    paramInt2 = paramInt1;
    for (int m = 0; m < k; m++)
    {
      View localView = getChildAt(m);
      if (localView.getVisibility() != 8)
      {
        LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
        int n = localView.getMeasuredWidth();
        int i2;
        if (slideable)
        {
          paramInt3 = leftMargin;
          int i1 = rightMargin;
          i2 = i - paramInt4;
          i1 = Math.min(paramInt1, i2 - mOverhangSize) - paramInt2 - (paramInt3 + i1);
          mSlideRange = i1;
          if (bool) {
            paramInt3 = rightMargin;
          } else {
            paramInt3 = leftMargin;
          }
          if (n / 2 + (paramInt2 + paramInt3 + i1) > i2) {
            paramBoolean = true;
          } else {
            paramBoolean = false;
          }
          dimWhenOffset = paramBoolean;
          i2 = (int)(i1 * mSlideOffset);
          paramInt2 = paramInt3 + i2 + paramInt2;
          mSlideOffset = (i2 / i1);
          paramInt3 = 0;
        }
        else
        {
          if (mCanSlide)
          {
            paramInt2 = mParallaxBy;
            if (paramInt2 != 0)
            {
              paramInt3 = (int)((1.0F - mSlideOffset) * paramInt2);
              paramInt2 = paramInt1;
              break label354;
            }
          }
          paramInt2 = paramInt1;
          paramInt3 = 0;
        }
        label354:
        if (bool)
        {
          i2 = i - paramInt2 + paramInt3;
          paramInt3 = i2 - n;
        }
        else
        {
          paramInt3 = paramInt2 - paramInt3;
          i2 = paramInt3 + n;
        }
        localView.layout(paramInt3, j, i2, localView.getMeasuredHeight() + j);
        paramInt3 = localView.getWidth();
        paramInt1 = paramInt3 + paramInt1;
      }
    }
    if (mFirstLayout)
    {
      if (mCanSlide)
      {
        if (mParallaxBy != 0) {
          parallaxOtherViews(mSlideOffset);
        }
        if (mSlideableView.getLayoutParams()).dimWhenOffset) {
          dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
        }
      }
      else
      {
        for (paramInt1 = 0; paramInt1 < k; paramInt1++) {
          dimChildView(getChildAt(paramInt1), 0.0F, mSliderFadeColor);
        }
      }
      updateObscuredViewsVisibility(mSlideableView);
    }
    mFirstLayout = false;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    int m;
    int n;
    if (i != 1073741824)
    {
      if (isInEditMode())
      {
        if (i == Integer.MIN_VALUE)
        {
          m = j;
          n = k;
          paramInt1 = paramInt2;
        }
        else
        {
          m = j;
          n = k;
          paramInt1 = paramInt2;
          if (i == 0)
          {
            m = 300;
            n = k;
            paramInt1 = paramInt2;
          }
        }
      }
      else {
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
      }
    }
    else
    {
      m = j;
      n = k;
      paramInt1 = paramInt2;
      if (k == 0) {
        if (isInEditMode())
        {
          m = j;
          n = k;
          paramInt1 = paramInt2;
          if (k == 0)
          {
            paramInt1 = 300;
            n = Integer.MIN_VALUE;
            m = j;
          }
        }
        else
        {
          throw new IllegalStateException("Height must not be UNSPECIFIED");
        }
      }
    }
    if (n != Integer.MIN_VALUE)
    {
      if (n != 1073741824) {}
      for (paramInt1 = 0;; paramInt1 = paramInt1 - getPaddingTop() - getPaddingBottom())
      {
        j = paramInt1;
        break;
      }
    }
    j = paramInt1 - getPaddingTop() - getPaddingBottom();
    paramInt1 = 0;
    int i1 = m - getPaddingLeft() - getPaddingRight();
    int i2 = getChildCount();
    if (i2 > 2) {
      Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
    }
    mSlideableView = null;
    int i3 = 0;
    k = i3;
    i = i1;
    float f1 = 0.0F;
    View localView;
    LayoutParams localLayoutParams;
    int i4;
    label429:
    int i5;
    for (paramInt2 = paramInt1; i3 < i2; paramInt2 = paramInt1)
    {
      localView = getChildAt(i3);
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      if (localView.getVisibility() == 8)
      {
        dimWhenOffset = false;
        paramInt1 = paramInt2;
      }
      else
      {
        float f2 = weight;
        float f3 = f1;
        if (f2 > 0.0F)
        {
          f1 += f2;
          f3 = f1;
          if (width == 0)
          {
            paramInt1 = paramInt2;
            break label573;
          }
        }
        paramInt1 = leftMargin + rightMargin;
        i4 = width;
        if (i4 == -2) {}
        for (paramInt1 = View.MeasureSpec.makeMeasureSpec(i1 - paramInt1, Integer.MIN_VALUE);; paramInt1 = View.MeasureSpec.makeMeasureSpec(i1 - paramInt1, 1073741824))
        {
          i4 = paramInt1;
          break label429;
          if (i4 != -1) {
            break;
          }
        }
        i4 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        paramInt1 = height;
        if (paramInt1 == -2) {
          paramInt1 = View.MeasureSpec.makeMeasureSpec(j, Integer.MIN_VALUE);
        } else if (paramInt1 == -1) {
          paramInt1 = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
        } else {
          paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
        }
        localView.measure(i4, paramInt1);
        i4 = localView.getMeasuredWidth();
        i5 = localView.getMeasuredHeight();
        paramInt1 = paramInt2;
        if (n == Integer.MIN_VALUE)
        {
          paramInt1 = paramInt2;
          if (i5 > paramInt2) {
            paramInt1 = Math.min(i5, j);
          }
        }
        i -= i4;
        int i6;
        if (i < 0) {
          i6 = 1;
        } else {
          i6 = 0;
        }
        slideable = i6;
        k |= i6;
        if (i6 != 0) {
          mSlideableView = localView;
        }
        f1 = f3;
      }
      label573:
      i3++;
    }
    if ((k != 0) || (f1 > 0.0F))
    {
      n = i1 - mOverhangSize;
      for (i3 = 0; i3 < i2; i3++)
      {
        localView = getChildAt(i3);
        if (localView.getVisibility() != 8)
        {
          for (;;)
          {
            localLayoutParams = (LayoutParams)localView.getLayoutParams();
            if (localView.getVisibility() != 8)
            {
              if ((width == 0) && (weight > 0.0F)) {
                paramInt1 = 1;
              } else {
                paramInt1 = 0;
              }
              if (paramInt1 != 0) {
                i4 = 0;
              } else {
                i4 = localView.getMeasuredWidth();
              }
              if ((k != 0) && (localView != mSlideableView))
              {
                if ((width < 0) && ((i4 > n) || (weight > 0.0F)))
                {
                  if (paramInt1 != 0)
                  {
                    paramInt1 = height;
                    if (paramInt1 == -2) {
                      paramInt1 = View.MeasureSpec.makeMeasureSpec(j, Integer.MIN_VALUE);
                    } else if (paramInt1 == -1) {
                      paramInt1 = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
                    } else {
                      paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
                    }
                  }
                  else
                  {
                    paramInt1 = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824);
                  }
                  localView.measure(View.MeasureSpec.makeMeasureSpec(n, 1073741824), paramInt1);
                }
              }
              else if (weight > 0.0F)
              {
                if (width == 0)
                {
                  paramInt1 = height;
                  if (paramInt1 == -2) {
                    paramInt1 = View.MeasureSpec.makeMeasureSpec(j, Integer.MIN_VALUE);
                  } else if (paramInt1 == -1) {
                    paramInt1 = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
                  } else {
                    paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
                  }
                }
                else
                {
                  paramInt1 = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824);
                }
                if (k == 0) {
                  break;
                }
                i5 = i1 - (leftMargin + rightMargin);
                int i7 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                if (i4 != i5) {
                  localView.measure(i7, paramInt1);
                }
              }
            }
          }
          i5 = Math.max(0, i);
          localView.measure(View.MeasureSpec.makeMeasureSpec(i4 + (int)(weight * i5 / f1), 1073741824), paramInt1);
        }
      }
    }
    paramInt1 = getPaddingTop();
    setMeasuredDimension(m, getPaddingBottom() + (paramInt1 + paramInt2));
    mCanSlide = k;
    if ((mDragHelper.getViewDragState() != 0) && (k == 0)) {
      mDragHelper.abort();
    }
  }
  
  public void onPanelDragged(int paramInt)
  {
    if (mSlideableView == null)
    {
      mSlideOffset = 0.0F;
      return;
    }
    boolean bool = isLayoutRtlSupport();
    LayoutParams localLayoutParams = (LayoutParams)mSlideableView.getLayoutParams();
    int i = mSlideableView.getWidth();
    int j = paramInt;
    if (bool) {
      j = getWidth() - paramInt - i;
    }
    if (bool) {
      paramInt = getPaddingRight();
    } else {
      paramInt = getPaddingLeft();
    }
    if (bool) {
      i = rightMargin;
    } else {
      i = leftMargin;
    }
    float f = (j - (paramInt + i)) / mSlideRange;
    mSlideOffset = f;
    if (mParallaxBy != 0) {
      parallaxOtherViews(f);
    }
    if (dimWhenOffset) {
      dimChildView(mSlideableView, mSlideOffset, mSliderFadeColor);
    }
    dispatchOnPanelSlide(mSlideableView);
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
    if (isOpen) {
      openPane();
    } else {
      closePane();
    }
    mPreservedOpenState = isOpen;
  }
  
  public Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    boolean bool;
    if (isSlideable()) {
      bool = isOpen();
    } else {
      bool = mPreservedOpenState;
    }
    isOpen = bool;
    return localSavedState;
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      mFirstLayout = true;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!mCanSlide) {
      return super.onTouchEvent(paramMotionEvent);
    }
    mDragHelper.processTouchEvent(paramMotionEvent);
    int i = paramMotionEvent.getActionMasked();
    float f1;
    float f4;
    if (i != 0)
    {
      if ((i == 1) && (isDimmed(mSlideableView)))
      {
        f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        float f3 = f1 - mInitialMotionX;
        f4 = f2 - mInitialMotionY;
        i = mDragHelper.getTouchSlop();
        if ((f4 * f4 + f3 * f3 < i * i) && (mDragHelper.isViewUnder(mSlideableView, (int)f1, (int)f2))) {
          closePane(mSlideableView, 0);
        }
      }
    }
    else
    {
      f1 = paramMotionEvent.getX();
      f4 = paramMotionEvent.getY();
      mInitialMotionX = f1;
      mInitialMotionY = f4;
    }
    return true;
  }
  
  public boolean openPane()
  {
    return openPane(mSlideableView, 0);
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    if ((!isInTouchMode()) && (!mCanSlide))
    {
      boolean bool;
      if (paramView1 == mSlideableView) {
        bool = true;
      } else {
        bool = false;
      }
      mPreservedOpenState = bool;
    }
  }
  
  public void setAllChildrenVisible()
  {
    int i = getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = getChildAt(j);
      if (localView.getVisibility() == 4) {
        localView.setVisibility(0);
      }
    }
  }
  
  public void setCoveredFadeColor(@ColorInt int paramInt)
  {
    mCoveredFadeColor = paramInt;
  }
  
  public void setPanelSlideListener(@Nullable PanelSlideListener paramPanelSlideListener)
  {
    mPanelSlideListener = paramPanelSlideListener;
  }
  
  public void setParallaxDistance(@Px int paramInt)
  {
    mParallaxBy = paramInt;
    requestLayout();
  }
  
  @Deprecated
  public void setShadowDrawable(Drawable paramDrawable)
  {
    setShadowDrawableLeft(paramDrawable);
  }
  
  public void setShadowDrawableLeft(@Nullable Drawable paramDrawable)
  {
    mShadowDrawableLeft = paramDrawable;
  }
  
  public void setShadowDrawableRight(@Nullable Drawable paramDrawable)
  {
    mShadowDrawableRight = paramDrawable;
  }
  
  @Deprecated
  public void setShadowResource(@DrawableRes int paramInt)
  {
    setShadowDrawable(getResources().getDrawable(paramInt));
  }
  
  public void setShadowResourceLeft(int paramInt)
  {
    setShadowDrawableLeft(ContextCompat.getDrawable(getContext(), paramInt));
  }
  
  public void setShadowResourceRight(int paramInt)
  {
    setShadowDrawableRight(ContextCompat.getDrawable(getContext(), paramInt));
  }
  
  public void setSliderFadeColor(@ColorInt int paramInt)
  {
    mSliderFadeColor = paramInt;
  }
  
  @Deprecated
  public void smoothSlideClosed()
  {
    closePane();
  }
  
  @Deprecated
  public void smoothSlideOpen()
  {
    openPane();
  }
  
  public boolean smoothSlideTo(float paramFloat, int paramInt)
  {
    if (!mCanSlide) {
      return false;
    }
    boolean bool = isLayoutRtlSupport();
    Object localObject = (LayoutParams)mSlideableView.getLayoutParams();
    float f1;
    if (bool)
    {
      int i = getPaddingRight();
      paramInt = rightMargin;
      int j = mSlideableView.getWidth();
      f1 = getWidth();
      float f2 = i + paramInt;
      paramInt = (int)(f1 - (paramFloat * mSlideRange + f2 + j));
    }
    else
    {
      f1 = getPaddingLeft() + leftMargin;
      paramInt = (int)(paramFloat * mSlideRange + f1);
    }
    localObject = mDragHelper;
    View localView = mSlideableView;
    if (((ViewDragHelper)localObject).smoothSlideViewTo(localView, paramInt, localView.getTop()))
    {
      setAllChildrenVisible();
      ViewCompat.postInvalidateOnAnimation(this);
      return true;
    }
    return false;
  }
  
  public void updateObscuredViewsVisibility(View paramView)
  {
    boolean bool = isLayoutRtlSupport();
    int i;
    if (bool) {
      i = getWidth() - getPaddingRight();
    } else {
      i = getPaddingLeft();
    }
    int j;
    if (bool) {
      j = getPaddingLeft();
    } else {
      j = getWidth() - getPaddingRight();
    }
    int k = getPaddingTop();
    int m = getHeight();
    int n = getPaddingBottom();
    int i1;
    int i2;
    int i3;
    int i4;
    if ((paramView != null) && (viewIsOpaque(paramView)))
    {
      i1 = paramView.getLeft();
      i2 = paramView.getRight();
      i3 = paramView.getTop();
      i4 = paramView.getBottom();
    }
    else
    {
      i1 = 0;
      i2 = 0;
      i3 = 0;
      i4 = 0;
    }
    int i5 = getChildCount();
    for (int i6 = 0; i6 < i5; i6++)
    {
      View localView = getChildAt(i6);
      if (localView == paramView) {
        break;
      }
      if (localView.getVisibility() != 8)
      {
        if (bool) {
          i7 = j;
        } else {
          i7 = i;
        }
        int i8 = Math.max(i7, localView.getLeft());
        int i9 = Math.max(k, localView.getTop());
        if (bool) {
          i7 = i;
        } else {
          i7 = j;
        }
        int i10 = Math.min(i7, localView.getRight());
        int i7 = Math.min(m - n, localView.getBottom());
        if ((i8 >= i1) && (i9 >= i3) && (i10 <= i2) && (i7 <= i4)) {
          i7 = 4;
        } else {
          i7 = 0;
        }
        localView.setVisibility(i7);
      }
    }
  }
  
  public class AccessibilityDelegate
    extends AccessibilityDelegateCompat
  {
    private final Rect mTmpRect = new Rect();
    
    public AccessibilityDelegate() {}
    
    private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat1, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat2)
    {
      Rect localRect = mTmpRect;
      paramAccessibilityNodeInfoCompat2.getBoundsInParent(localRect);
      paramAccessibilityNodeInfoCompat1.setBoundsInParent(localRect);
      paramAccessibilityNodeInfoCompat2.getBoundsInScreen(localRect);
      paramAccessibilityNodeInfoCompat1.setBoundsInScreen(localRect);
      paramAccessibilityNodeInfoCompat1.setVisibleToUser(paramAccessibilityNodeInfoCompat2.isVisibleToUser());
      paramAccessibilityNodeInfoCompat1.setPackageName(paramAccessibilityNodeInfoCompat2.getPackageName());
      paramAccessibilityNodeInfoCompat1.setClassName(paramAccessibilityNodeInfoCompat2.getClassName());
      paramAccessibilityNodeInfoCompat1.setContentDescription(paramAccessibilityNodeInfoCompat2.getContentDescription());
      paramAccessibilityNodeInfoCompat1.setEnabled(paramAccessibilityNodeInfoCompat2.isEnabled());
      paramAccessibilityNodeInfoCompat1.setClickable(paramAccessibilityNodeInfoCompat2.isClickable());
      paramAccessibilityNodeInfoCompat1.setFocusable(paramAccessibilityNodeInfoCompat2.isFocusable());
      paramAccessibilityNodeInfoCompat1.setFocused(paramAccessibilityNodeInfoCompat2.isFocused());
      paramAccessibilityNodeInfoCompat1.setAccessibilityFocused(paramAccessibilityNodeInfoCompat2.isAccessibilityFocused());
      paramAccessibilityNodeInfoCompat1.setSelected(paramAccessibilityNodeInfoCompat2.isSelected());
      paramAccessibilityNodeInfoCompat1.setLongClickable(paramAccessibilityNodeInfoCompat2.isLongClickable());
      paramAccessibilityNodeInfoCompat1.addAction(paramAccessibilityNodeInfoCompat2.getActions());
      paramAccessibilityNodeInfoCompat1.setMovementGranularities(paramAccessibilityNodeInfoCompat2.getMovementGranularities());
    }
    
    public boolean filter(View paramView)
    {
      return isDimmed(paramView);
    }
    
    public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
    {
      AccessibilityNodeInfoCompat localAccessibilityNodeInfoCompat = AccessibilityNodeInfoCompat.obtain(paramAccessibilityNodeInfoCompat);
      super.onInitializeAccessibilityNodeInfo(paramView, localAccessibilityNodeInfoCompat);
      copyNodeInfoNoChildren(paramAccessibilityNodeInfoCompat, localAccessibilityNodeInfoCompat);
      localAccessibilityNodeInfoCompat.recycle();
      paramAccessibilityNodeInfoCompat.setClassName(SlidingPaneLayout.class.getName());
      paramAccessibilityNodeInfoCompat.setSource(paramView);
      paramView = ViewCompat.getParentForAccessibility(paramView);
      if ((paramView instanceof View)) {
        paramAccessibilityNodeInfoCompat.setParent((View)paramView);
      }
      int i = getChildCount();
      for (int j = 0; j < i; j++)
      {
        paramView = getChildAt(j);
        if ((!filter(paramView)) && (paramView.getVisibility() == 0))
        {
          ViewCompat.setImportantForAccessibility(paramView, 1);
          paramAccessibilityNodeInfoCompat.addChild(paramView);
        }
      }
    }
    
    public boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if (!filter(paramView)) {
        return super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
      }
      return false;
    }
  }
  
  public class DisableLayerRunnable
    implements Runnable
  {
    public final View mChildView;
    
    public DisableLayerRunnable(View paramView)
    {
      mChildView = paramView;
    }
    
    public void run()
    {
      if (mChildView.getParent() == SlidingPaneLayout.this)
      {
        mChildView.setLayerType(0, null);
        invalidateChildRegion(mChildView);
      }
      mPostedRunnables.remove(this);
    }
  }
  
  public class DragHelperCallback
    extends ViewDragHelper.Callback
  {
    public DragHelperCallback() {}
    
    public int clampViewPositionHorizontal(View paramView, int paramInt1, int paramInt2)
    {
      paramView = (SlidingPaneLayout.LayoutParams)mSlideableView.getLayoutParams();
      int j;
      if (isLayoutRtlSupport())
      {
        int i = getWidth();
        paramInt2 = getPaddingRight();
        j = rightMargin;
        paramInt2 = i - (mSlideableView.getWidth() + (paramInt2 + j));
        j = mSlideRange;
        paramInt1 = Math.max(Math.min(paramInt1, paramInt2), paramInt2 - j);
      }
      else
      {
        j = getPaddingLeft() + leftMargin;
        paramInt2 = mSlideRange;
        paramInt1 = Math.min(Math.max(paramInt1, j), paramInt2 + j);
      }
      return paramInt1;
    }
    
    public int clampViewPositionVertical(View paramView, int paramInt1, int paramInt2)
    {
      return paramView.getTop();
    }
    
    public int getViewHorizontalDragRange(View paramView)
    {
      return mSlideRange;
    }
    
    public void onEdgeDragStarted(int paramInt1, int paramInt2)
    {
      SlidingPaneLayout localSlidingPaneLayout = SlidingPaneLayout.this;
      mDragHelper.captureChildView(mSlideableView, paramInt2);
    }
    
    public void onViewCaptured(View paramView, int paramInt)
    {
      setAllChildrenVisible();
    }
    
    public void onViewDragStateChanged(int paramInt)
    {
      if (mDragHelper.getViewDragState() == 0)
      {
        SlidingPaneLayout localSlidingPaneLayout = SlidingPaneLayout.this;
        if (mSlideOffset == 0.0F)
        {
          localSlidingPaneLayout.updateObscuredViewsVisibility(mSlideableView);
          localSlidingPaneLayout = SlidingPaneLayout.this;
          localSlidingPaneLayout.dispatchOnPanelClosed(mSlideableView);
          mPreservedOpenState = false;
        }
        else
        {
          localSlidingPaneLayout.dispatchOnPanelOpened(mSlideableView);
          mPreservedOpenState = true;
        }
      }
    }
    
    public void onViewPositionChanged(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      onPanelDragged(paramInt1);
      invalidate();
    }
    
    public void onViewReleased(View paramView, float paramFloat1, float paramFloat2)
    {
      SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
      int i;
      int j;
      if (isLayoutRtlSupport())
      {
        i = getPaddingRight() + rightMargin;
        if (paramFloat1 >= 0.0F)
        {
          j = i;
          if (paramFloat1 == 0.0F)
          {
            j = i;
            if (mSlideOffset <= 0.5F) {}
          }
        }
        else
        {
          j = i + mSlideRange;
        }
        i = mSlideableView.getWidth();
        j = getWidth() - j - i;
      }
      else
      {
        j = getPaddingLeft();
        i = leftMargin + j;
        boolean bool = paramFloat1 < 0.0F;
        if (!bool)
        {
          j = i;
          if (!bool)
          {
            j = i;
            if (mSlideOffset <= 0.5F) {}
          }
        }
        else
        {
          j = i + mSlideRange;
        }
      }
      mDragHelper.settleCapturedViewAt(j, paramView.getTop());
      invalidate();
    }
    
    public boolean tryCaptureView(View paramView, int paramInt)
    {
      if (mIsUnableToDrag) {
        return false;
      }
      return getLayoutParamsslideable;
    }
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    private static final int[] ATTRS = { 16843137 };
    public Paint dimPaint;
    public boolean dimWhenOffset;
    public boolean slideable;
    public float weight = 0.0F;
    
    public LayoutParams()
    {
      super(-1);
    }
    
    public LayoutParams(int paramInt1, int paramInt2)
    {
      super(paramInt2);
    }
    
    public LayoutParams(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, ATTRS);
      weight = paramContext.getFloat(0, 0.0F);
      paramContext.recycle();
    }
    
    public LayoutParams(@NonNull ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(@NonNull ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
    
    public LayoutParams(@NonNull LayoutParams paramLayoutParams)
    {
      super();
      weight = weight;
    }
  }
  
  public static abstract interface PanelSlideListener
  {
    public abstract void onPanelClosed(@NonNull View paramView);
    
    public abstract void onPanelOpened(@NonNull View paramView);
    
    public abstract void onPanelSlide(@NonNull View paramView, float paramFloat);
  }
  
  public static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public SlidingPaneLayout.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new SlidingPaneLayout.SavedState(paramAnonymousParcel, null);
      }
      
      public SlidingPaneLayout.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new SlidingPaneLayout.SavedState(paramAnonymousParcel, null);
      }
      
      public SlidingPaneLayout.SavedState[] newArray(int paramAnonymousInt)
      {
        return new SlidingPaneLayout.SavedState[paramAnonymousInt];
      }
    };
    public boolean isOpen;
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      boolean bool;
      if (paramParcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      isOpen = bool;
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(isOpen);
    }
  }
  
  public static class SimplePanelSlideListener
    implements SlidingPaneLayout.PanelSlideListener
  {
    public void onPanelClosed(View paramView) {}
    
    public void onPanelOpened(View paramView) {}
    
    public void onPanelSlide(View paramView, float paramFloat) {}
  }
}

/* Location:
 * Qualified Name:     androidx.slidingpanelayout.widget.SlidingPaneLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */