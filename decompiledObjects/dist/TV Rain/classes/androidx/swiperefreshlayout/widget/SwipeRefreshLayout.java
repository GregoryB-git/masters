package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ListViewCompat;

public class SwipeRefreshLayout
  extends ViewGroup
  implements NestedScrollingParent, NestedScrollingChild
{
  private static final int ALPHA_ANIMATION_DURATION = 300;
  private static final int ANIMATE_TO_START_DURATION = 200;
  private static final int ANIMATE_TO_TRIGGER_DURATION = 200;
  private static final int CIRCLE_BG_LIGHT = -328966;
  @VisibleForTesting
  public static final int CIRCLE_DIAMETER = 40;
  @VisibleForTesting
  public static final int CIRCLE_DIAMETER_LARGE = 56;
  private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0F;
  public static final int DEFAULT = 1;
  private static final int DEFAULT_CIRCLE_TARGET = 64;
  public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
  private static final float DRAG_RATE = 0.5F;
  private static final int INVALID_POINTER = -1;
  public static final int LARGE = 0;
  private static final int[] LAYOUT_ATTRS = { 16842766 };
  private static final String LOG_TAG = "SwipeRefreshLayout";
  private static final int MAX_ALPHA = 255;
  private static final float MAX_PROGRESS_ANGLE = 0.8F;
  private static final int SCALE_DOWN_DURATION = 150;
  private static final int STARTING_PROGRESS_ALPHA = 76;
  private int mActivePointerId = -1;
  private Animation mAlphaMaxAnimation;
  private Animation mAlphaStartAnimation;
  private final Animation mAnimateToCorrectPosition = new Animation()
  {
    public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
    {
      paramAnonymousTransformation = SwipeRefreshLayout.this;
      if (!mUsingCustomStart) {
        i = mSpinnerOffsetEnd - Math.abs(mOriginalOffsetTop);
      } else {
        i = mSpinnerOffsetEnd;
      }
      paramAnonymousTransformation = SwipeRefreshLayout.this;
      int j = mFrom;
      int k = (int)((i - j) * paramAnonymousFloat);
      int i = mCircleView.getTop();
      setTargetOffsetTopAndBottom(j + k - i);
      mProgress.setArrowScale(1.0F - paramAnonymousFloat);
    }
  };
  private final Animation mAnimateToStartPosition = new Animation()
  {
    public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
    {
      moveToStart(paramAnonymousFloat);
    }
  };
  private OnChildScrollUpCallback mChildScrollUpCallback;
  private int mCircleDiameter;
  public CircleImageView mCircleView;
  private int mCircleViewIndex = -1;
  public int mCurrentTargetOffsetTop;
  public int mCustomSlingshotDistance;
  private final DecelerateInterpolator mDecelerateInterpolator;
  public int mFrom;
  private float mInitialDownY;
  private float mInitialMotionY;
  private boolean mIsBeingDragged;
  public OnRefreshListener mListener;
  private int mMediumAnimationDuration;
  private boolean mNestedScrollInProgress;
  private final NestedScrollingChildHelper mNestedScrollingChildHelper;
  private final NestedScrollingParentHelper mNestedScrollingParentHelper;
  public boolean mNotify;
  public int mOriginalOffsetTop;
  private final int[] mParentOffsetInWindow = new int[2];
  private final int[] mParentScrollConsumed = new int[2];
  public CircularProgressDrawable mProgress;
  private Animation.AnimationListener mRefreshListener = new Animation.AnimationListener()
  {
    public void onAnimationEnd(Animation paramAnonymousAnimation)
    {
      paramAnonymousAnimation = SwipeRefreshLayout.this;
      if (mRefreshing)
      {
        mProgress.setAlpha(255);
        mProgress.start();
        paramAnonymousAnimation = SwipeRefreshLayout.this;
        if (mNotify)
        {
          paramAnonymousAnimation = mListener;
          if (paramAnonymousAnimation != null) {
            paramAnonymousAnimation.onRefresh();
          }
        }
        paramAnonymousAnimation = SwipeRefreshLayout.this;
        mCurrentTargetOffsetTop = mCircleView.getTop();
      }
      else
      {
        paramAnonymousAnimation.reset();
      }
    }
    
    public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
    
    public void onAnimationStart(Animation paramAnonymousAnimation) {}
  };
  public boolean mRefreshing = false;
  private boolean mReturningToStart;
  public boolean mScale;
  private Animation mScaleAnimation;
  private Animation mScaleDownAnimation;
  private Animation mScaleDownToStartAnimation;
  public int mSpinnerOffsetEnd;
  public float mStartingScale;
  private View mTarget;
  private float mTotalDragDistance = -1.0F;
  private float mTotalUnconsumed;
  private int mTouchSlop;
  public boolean mUsingCustomStart;
  
  public SwipeRefreshLayout(@NonNull Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwipeRefreshLayout(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    mTouchSlop = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    mMediumAnimationDuration = getResources().getInteger(17694721);
    setWillNotDraw(false);
    mDecelerateInterpolator = new DecelerateInterpolator(2.0F);
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    mCircleDiameter = ((int)(density * 40.0F));
    createProgressView();
    setChildrenDrawingOrderEnabled(true);
    int i = (int)(density * 64.0F);
    mSpinnerOffsetEnd = i;
    mTotalDragDistance = i;
    mNestedScrollingParentHelper = new NestedScrollingParentHelper(this);
    mNestedScrollingChildHelper = new NestedScrollingChildHelper(this);
    setNestedScrollingEnabled(true);
    i = -mCircleDiameter;
    mCurrentTargetOffsetTop = i;
    mOriginalOffsetTop = i;
    moveToStart(1.0F);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, LAYOUT_ATTRS);
    setEnabled(paramContext.getBoolean(0, true));
    paramContext.recycle();
  }
  
  private void animateOffsetToCorrectPosition(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    mFrom = paramInt;
    mAnimateToCorrectPosition.reset();
    mAnimateToCorrectPosition.setDuration(200L);
    mAnimateToCorrectPosition.setInterpolator(mDecelerateInterpolator);
    if (paramAnimationListener != null) {
      mCircleView.setAnimationListener(paramAnimationListener);
    }
    mCircleView.clearAnimation();
    mCircleView.startAnimation(mAnimateToCorrectPosition);
  }
  
  private void animateOffsetToStartPosition(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    if (mScale)
    {
      startScaleDownReturnToStartAnimation(paramInt, paramAnimationListener);
    }
    else
    {
      mFrom = paramInt;
      mAnimateToStartPosition.reset();
      mAnimateToStartPosition.setDuration(200L);
      mAnimateToStartPosition.setInterpolator(mDecelerateInterpolator);
      if (paramAnimationListener != null) {
        mCircleView.setAnimationListener(paramAnimationListener);
      }
      mCircleView.clearAnimation();
      mCircleView.startAnimation(mAnimateToStartPosition);
    }
  }
  
  private void createProgressView()
  {
    mCircleView = new CircleImageView(getContext(), -328966);
    CircularProgressDrawable localCircularProgressDrawable = new CircularProgressDrawable(getContext());
    mProgress = localCircularProgressDrawable;
    localCircularProgressDrawable.setStyle(1);
    mCircleView.setImageDrawable(mProgress);
    mCircleView.setVisibility(8);
    addView(mCircleView);
  }
  
  private void ensureTarget()
  {
    if (mTarget == null) {
      for (int i = 0; i < getChildCount(); i++)
      {
        View localView = getChildAt(i);
        if (!localView.equals(mCircleView))
        {
          mTarget = localView;
          break;
        }
      }
    }
  }
  
  private void finishSpinner(float paramFloat)
  {
    if (paramFloat > mTotalDragDistance)
    {
      setRefreshing(true, true);
    }
    else
    {
      mRefreshing = false;
      mProgress.setStartEndTrim(0.0F, 0.0F);
      Animation.AnimationListener local5 = null;
      if (!mScale) {
        local5 = new Animation.AnimationListener()
        {
          public void onAnimationEnd(Animation paramAnonymousAnimation)
          {
            paramAnonymousAnimation = SwipeRefreshLayout.this;
            if (!mScale) {
              paramAnonymousAnimation.startScaleDownAnimation(null);
            }
          }
          
          public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
          
          public void onAnimationStart(Animation paramAnonymousAnimation) {}
        };
      }
      animateOffsetToStartPosition(mCurrentTargetOffsetTop, local5);
      mProgress.setArrowEnabled(false);
    }
  }
  
  private boolean isAnimationRunning(Animation paramAnimation)
  {
    boolean bool;
    if ((paramAnimation != null) && (paramAnimation.hasStarted()) && (!paramAnimation.hasEnded())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void moveSpinner(float paramFloat)
  {
    mProgress.setArrowEnabled(true);
    float f1 = Math.min(1.0F, Math.abs(paramFloat / mTotalDragDistance));
    float f2 = (float)Math.max(f1 - 0.4D, 0.0D) * 5.0F / 3.0F;
    float f3 = Math.abs(paramFloat);
    float f4 = mTotalDragDistance;
    int i = mCustomSlingshotDistance;
    if (i > 0) {}
    float f5;
    for (;;)
    {
      f5 = i;
      break;
      if (mUsingCustomStart) {
        i = mSpinnerOffsetEnd - mOriginalOffsetTop;
      } else {
        i = mSpinnerOffsetEnd;
      }
    }
    double d = Math.max(0.0F, Math.min(f3 - f4, f5 * 2.0F) / f5) / 4.0F;
    f3 = (float)(d - Math.pow(d, 2.0D)) * 2.0F;
    int j = mOriginalOffsetTop;
    i = (int)(f5 * f1 + f5 * f3 * 2.0F);
    if (mCircleView.getVisibility() != 0) {
      mCircleView.setVisibility(0);
    }
    if (!mScale)
    {
      mCircleView.setScaleX(1.0F);
      mCircleView.setScaleY(1.0F);
    }
    if (mScale) {
      setAnimationProgress(Math.min(1.0F, paramFloat / mTotalDragDistance));
    }
    if (paramFloat < mTotalDragDistance)
    {
      if ((mProgress.getAlpha() > 76) && (!isAnimationRunning(mAlphaStartAnimation))) {
        startProgressAlphaStartAnimation();
      }
    }
    else if ((mProgress.getAlpha() < 255) && (!isAnimationRunning(mAlphaMaxAnimation))) {
      startProgressAlphaMaxAnimation();
    }
    mProgress.setStartEndTrim(0.0F, Math.min(0.8F, f2 * 0.8F));
    mProgress.setArrowScale(Math.min(1.0F, f2));
    mProgress.setProgressRotation((f3 * 2.0F + (f2 * 0.4F - 0.25F)) * 0.5F);
    setTargetOffsetTopAndBottom(j + i - mCurrentTargetOffsetTop);
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
      mActivePointerId = paramMotionEvent.getPointerId(i);
    }
  }
  
  private void setColorViewAlpha(int paramInt)
  {
    mCircleView.getBackground().setAlpha(paramInt);
    mProgress.setAlpha(paramInt);
  }
  
  private void setRefreshing(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (mRefreshing != paramBoolean1)
    {
      mNotify = paramBoolean2;
      ensureTarget();
      mRefreshing = paramBoolean1;
      if (paramBoolean1) {
        animateOffsetToCorrectPosition(mCurrentTargetOffsetTop, mRefreshListener);
      } else {
        startScaleDownAnimation(mRefreshListener);
      }
    }
  }
  
  private Animation startAlphaAnimation(final int paramInt1, final int paramInt2)
  {
    Animation local4 = new Animation()
    {
      public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        paramAnonymousTransformation = mProgress;
        int i = paramInt1;
        float f = i;
        paramAnonymousTransformation.setAlpha((int)((paramInt2 - i) * paramAnonymousFloat + f));
      }
    };
    local4.setDuration(300L);
    mCircleView.setAnimationListener(null);
    mCircleView.clearAnimation();
    mCircleView.startAnimation(local4);
    return local4;
  }
  
  private void startDragging(float paramFloat)
  {
    float f = mInitialDownY;
    int i = mTouchSlop;
    if ((paramFloat - f > i) && (!mIsBeingDragged))
    {
      mInitialMotionY = (f + i);
      mIsBeingDragged = true;
      mProgress.setAlpha(76);
    }
  }
  
  private void startProgressAlphaMaxAnimation()
  {
    mAlphaMaxAnimation = startAlphaAnimation(mProgress.getAlpha(), 255);
  }
  
  private void startProgressAlphaStartAnimation()
  {
    mAlphaStartAnimation = startAlphaAnimation(mProgress.getAlpha(), 76);
  }
  
  private void startScaleDownReturnToStartAnimation(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    mFrom = paramInt;
    mStartingScale = mCircleView.getScaleX();
    Animation local8 = new Animation()
    {
      public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        paramAnonymousTransformation = SwipeRefreshLayout.this;
        float f = mStartingScale;
        paramAnonymousTransformation.setAnimationProgress(-f * paramAnonymousFloat + f);
        moveToStart(paramAnonymousFloat);
      }
    };
    mScaleDownToStartAnimation = local8;
    local8.setDuration(150L);
    if (paramAnimationListener != null) {
      mCircleView.setAnimationListener(paramAnimationListener);
    }
    mCircleView.clearAnimation();
    mCircleView.startAnimation(mScaleDownToStartAnimation);
  }
  
  private void startScaleUpAnimation(Animation.AnimationListener paramAnimationListener)
  {
    mCircleView.setVisibility(0);
    mProgress.setAlpha(255);
    Animation local2 = new Animation()
    {
      public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        setAnimationProgress(paramAnonymousFloat);
      }
    };
    mScaleAnimation = local2;
    local2.setDuration(mMediumAnimationDuration);
    if (paramAnimationListener != null) {
      mCircleView.setAnimationListener(paramAnimationListener);
    }
    mCircleView.clearAnimation();
    mCircleView.startAnimation(mScaleAnimation);
  }
  
  public boolean canChildScrollUp()
  {
    Object localObject = mChildScrollUpCallback;
    if (localObject != null) {
      return ((OnChildScrollUpCallback)localObject).canChildScrollUp(this, mTarget);
    }
    localObject = mTarget;
    if ((localObject instanceof ListView)) {
      return ListViewCompat.canScrollList((ListView)localObject, -1);
    }
    return ((View)localObject).canScrollVertically(-1);
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return mNestedScrollingChildHelper.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return mNestedScrollingChildHelper.dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return mNestedScrollingChildHelper.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return mNestedScrollingChildHelper.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  public int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    int i = mCircleViewIndex;
    if (i < 0) {
      return paramInt2;
    }
    if (paramInt2 == paramInt1 - 1) {
      return i;
    }
    paramInt1 = paramInt2;
    if (paramInt2 >= i) {
      paramInt1 = paramInt2 + 1;
    }
    return paramInt1;
  }
  
  public int getNestedScrollAxes()
  {
    return mNestedScrollingParentHelper.getNestedScrollAxes();
  }
  
  public int getProgressCircleDiameter()
  {
    return mCircleDiameter;
  }
  
  public int getProgressViewEndOffset()
  {
    return mSpinnerOffsetEnd;
  }
  
  public int getProgressViewStartOffset()
  {
    return mOriginalOffsetTop;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return mNestedScrollingChildHelper.hasNestedScrollingParent();
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return mNestedScrollingChildHelper.isNestedScrollingEnabled();
  }
  
  public boolean isRefreshing()
  {
    return mRefreshing;
  }
  
  public void moveToStart(float paramFloat)
  {
    int i = mFrom;
    setTargetOffsetTopAndBottom(i + (int)((mOriginalOffsetTop - i) * paramFloat) - mCircleView.getTop());
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    reset();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    ensureTarget();
    int i = paramMotionEvent.getActionMasked();
    if ((mReturningToStart) && (i == 0)) {
      mReturningToStart = false;
    }
    if ((isEnabled()) && (!mReturningToStart) && (!canChildScrollUp()) && (!mRefreshing) && (!mNestedScrollInProgress))
    {
      if (i != 0)
      {
        if (i != 1) {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 6) {
                break label211;
              }
              onSecondaryPointerUp(paramMotionEvent);
              break label211;
            }
          }
          else
          {
            i = mActivePointerId;
            if (i == -1)
            {
              Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
              return false;
            }
            i = paramMotionEvent.findPointerIndex(i);
            if (i < 0) {
              return false;
            }
            startDragging(paramMotionEvent.getY(i));
            break label211;
          }
        }
        mIsBeingDragged = false;
        mActivePointerId = -1;
      }
      else
      {
        setTargetOffsetTopAndBottom(mOriginalOffsetTop - mCircleView.getTop());
        i = paramMotionEvent.getPointerId(0);
        mActivePointerId = i;
        mIsBeingDragged = false;
        i = paramMotionEvent.findPointerIndex(i);
        if (i < 0) {
          return false;
        }
        mInitialDownY = paramMotionEvent.getY(i);
      }
      label211:
      return mIsBeingDragged;
    }
    return false;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = getMeasuredWidth();
    paramInt3 = getMeasuredHeight();
    if (getChildCount() == 0) {
      return;
    }
    if (mTarget == null) {
      ensureTarget();
    }
    Object localObject = mTarget;
    if (localObject == null) {
      return;
    }
    paramInt2 = getPaddingLeft();
    paramInt4 = getPaddingTop();
    ((View)localObject).layout(paramInt2, paramInt4, paramInt1 - getPaddingLeft() - getPaddingRight() + paramInt2, paramInt3 - getPaddingTop() - getPaddingBottom() + paramInt4);
    paramInt3 = mCircleView.getMeasuredWidth();
    paramInt2 = mCircleView.getMeasuredHeight();
    localObject = mCircleView;
    paramInt1 /= 2;
    paramInt4 = paramInt3 / 2;
    paramInt3 = mCurrentTargetOffsetTop;
    ((View)localObject).layout(paramInt1 - paramInt4, paramInt3, paramInt1 + paramInt4, paramInt2 + paramInt3);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (mTarget == null) {
      ensureTarget();
    }
    View localView = mTarget;
    if (localView == null) {
      return;
    }
    localView.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 1073741824));
    mCircleView.measure(View.MeasureSpec.makeMeasureSpec(mCircleDiameter, 1073741824), View.MeasureSpec.makeMeasureSpec(mCircleDiameter, 1073741824));
    mCircleViewIndex = -1;
    for (paramInt1 = 0; paramInt1 < getChildCount(); paramInt1++) {
      if (getChildAt(paramInt1) == mCircleView)
      {
        mCircleViewIndex = paramInt1;
        break;
      }
    }
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if (paramInt2 > 0)
    {
      float f1 = mTotalUnconsumed;
      if (f1 > 0.0F)
      {
        float f2 = paramInt2;
        if (f2 > f1)
        {
          paramArrayOfInt[1] = (paramInt2 - (int)f1);
          mTotalUnconsumed = 0.0F;
        }
        else
        {
          mTotalUnconsumed = (f1 - f2);
          paramArrayOfInt[1] = paramInt2;
        }
        moveSpinner(mTotalUnconsumed);
      }
    }
    if ((mUsingCustomStart) && (paramInt2 > 0) && (mTotalUnconsumed == 0.0F) && (Math.abs(paramInt2 - paramArrayOfInt[1]) > 0)) {
      mCircleView.setVisibility(8);
    }
    paramView = mParentScrollConsumed;
    if (dispatchNestedPreScroll(paramInt1 - paramArrayOfInt[0], paramInt2 - paramArrayOfInt[1], paramView, null))
    {
      paramArrayOfInt[0] += paramView[0];
      paramArrayOfInt[1] += paramView[1];
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, mParentOffsetInWindow);
    paramInt1 = paramInt4 + mParentOffsetInWindow[1];
    if ((paramInt1 < 0) && (!canChildScrollUp()))
    {
      float f = mTotalUnconsumed + Math.abs(paramInt1);
      mTotalUnconsumed = f;
      moveSpinner(f);
    }
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    mNestedScrollingParentHelper.onNestedScrollAccepted(paramView1, paramView2, paramInt);
    startNestedScroll(paramInt & 0x2);
    mTotalUnconsumed = 0.0F;
    mNestedScrollInProgress = true;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    boolean bool;
    if ((isEnabled()) && (!mReturningToStart) && (!mRefreshing) && ((paramInt & 0x2) != 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    mNestedScrollingParentHelper.onStopNestedScroll(paramView);
    mNestedScrollInProgress = false;
    float f = mTotalUnconsumed;
    if (f > 0.0F)
    {
      finishSpinner(f);
      mTotalUnconsumed = 0.0F;
    }
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if ((mReturningToStart) && (i == 0)) {
      mReturningToStart = false;
    }
    if ((isEnabled()) && (!mReturningToStart) && (!canChildScrollUp()) && (!mRefreshing) && (!mNestedScrollInProgress))
    {
      if (i != 0)
      {
        float f1;
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 5)
              {
                if (i == 6) {
                  onSecondaryPointerUp(paramMotionEvent);
                }
              }
              else
              {
                i = paramMotionEvent.getActionIndex();
                if (i < 0)
                {
                  Log.e(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                  return false;
                }
                mActivePointerId = paramMotionEvent.getPointerId(i);
              }
            }
            else {
              return false;
            }
          }
          else
          {
            i = paramMotionEvent.findPointerIndex(mActivePointerId);
            if (i < 0)
            {
              Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
              return false;
            }
            f1 = paramMotionEvent.getY(i);
            startDragging(f1);
            if (mIsBeingDragged)
            {
              f1 = (f1 - mInitialMotionY) * 0.5F;
              if (f1 > 0.0F) {
                moveSpinner(f1);
              } else {
                return false;
              }
            }
          }
        }
        else
        {
          i = paramMotionEvent.findPointerIndex(mActivePointerId);
          if (i < 0)
          {
            Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
            return false;
          }
          if (mIsBeingDragged)
          {
            f1 = paramMotionEvent.getY(i);
            float f2 = mInitialMotionY;
            mIsBeingDragged = false;
            finishSpinner((f1 - f2) * 0.5F);
          }
          mActivePointerId = -1;
          return false;
        }
      }
      else
      {
        mActivePointerId = paramMotionEvent.getPointerId(0);
        mIsBeingDragged = false;
      }
      return true;
    }
    return false;
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    View localView = mTarget;
    if ((localView == null) || (ViewCompat.isNestedScrollingEnabled(localView))) {
      super.requestDisallowInterceptTouchEvent(paramBoolean);
    }
  }
  
  public void reset()
  {
    mCircleView.clearAnimation();
    mProgress.stop();
    mCircleView.setVisibility(8);
    setColorViewAlpha(255);
    if (mScale) {
      setAnimationProgress(0.0F);
    } else {
      setTargetOffsetTopAndBottom(mOriginalOffsetTop - mCurrentTargetOffsetTop);
    }
    mCurrentTargetOffsetTop = mCircleView.getTop();
  }
  
  public void setAnimationProgress(float paramFloat)
  {
    mCircleView.setScaleX(paramFloat);
    mCircleView.setScaleY(paramFloat);
  }
  
  @Deprecated
  public void setColorScheme(@ColorRes int... paramVarArgs)
  {
    setColorSchemeResources(paramVarArgs);
  }
  
  public void setColorSchemeColors(@ColorInt int... paramVarArgs)
  {
    ensureTarget();
    mProgress.setColorSchemeColors(paramVarArgs);
  }
  
  public void setColorSchemeResources(@ColorRes int... paramVarArgs)
  {
    Context localContext = getContext();
    int[] arrayOfInt = new int[paramVarArgs.length];
    for (int i = 0; i < paramVarArgs.length; i++) {
      arrayOfInt[i] = ContextCompat.getColor(localContext, paramVarArgs[i]);
    }
    setColorSchemeColors(arrayOfInt);
  }
  
  public void setDistanceToTriggerSync(int paramInt)
  {
    mTotalDragDistance = paramInt;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    if (!paramBoolean) {
      reset();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    mNestedScrollingChildHelper.setNestedScrollingEnabled(paramBoolean);
  }
  
  public void setOnChildScrollUpCallback(@Nullable OnChildScrollUpCallback paramOnChildScrollUpCallback)
  {
    mChildScrollUpCallback = paramOnChildScrollUpCallback;
  }
  
  public void setOnRefreshListener(@Nullable OnRefreshListener paramOnRefreshListener)
  {
    mListener = paramOnRefreshListener;
  }
  
  @Deprecated
  public void setProgressBackgroundColor(int paramInt)
  {
    setProgressBackgroundColorSchemeResource(paramInt);
  }
  
  public void setProgressBackgroundColorSchemeColor(@ColorInt int paramInt)
  {
    mCircleView.setBackgroundColor(paramInt);
  }
  
  public void setProgressBackgroundColorSchemeResource(@ColorRes int paramInt)
  {
    setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), paramInt));
  }
  
  public void setProgressViewEndTarget(boolean paramBoolean, int paramInt)
  {
    mSpinnerOffsetEnd = paramInt;
    mScale = paramBoolean;
    mCircleView.invalidate();
  }
  
  public void setProgressViewOffset(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    mScale = paramBoolean;
    mOriginalOffsetTop = paramInt1;
    mSpinnerOffsetEnd = paramInt2;
    mUsingCustomStart = true;
    reset();
    mRefreshing = false;
  }
  
  public void setRefreshing(boolean paramBoolean)
  {
    if ((paramBoolean) && (mRefreshing != paramBoolean))
    {
      mRefreshing = paramBoolean;
      int i;
      if (!mUsingCustomStart) {
        i = mSpinnerOffsetEnd + mOriginalOffsetTop;
      } else {
        i = mSpinnerOffsetEnd;
      }
      setTargetOffsetTopAndBottom(i - mCurrentTargetOffsetTop);
      mNotify = false;
      startScaleUpAnimation(mRefreshListener);
    }
    else
    {
      setRefreshing(paramBoolean, false);
    }
  }
  
  public void setSize(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      return;
    }
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    if (paramInt == 0) {
      mCircleDiameter = ((int)(density * 56.0F));
    } else {
      mCircleDiameter = ((int)(density * 40.0F));
    }
    mCircleView.setImageDrawable(null);
    mProgress.setStyle(paramInt);
    mCircleView.setImageDrawable(mProgress);
  }
  
  public void setSlingshotDistance(@Px int paramInt)
  {
    mCustomSlingshotDistance = paramInt;
  }
  
  public void setTargetOffsetTopAndBottom(int paramInt)
  {
    mCircleView.bringToFront();
    ViewCompat.offsetTopAndBottom(mCircleView, paramInt);
    mCurrentTargetOffsetTop = mCircleView.getTop();
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return mNestedScrollingChildHelper.startNestedScroll(paramInt);
  }
  
  public void startScaleDownAnimation(Animation.AnimationListener paramAnimationListener)
  {
    Animation local3 = new Animation()
    {
      public void applyTransformation(float paramAnonymousFloat, Transformation paramAnonymousTransformation)
      {
        setAnimationProgress(1.0F - paramAnonymousFloat);
      }
    };
    mScaleDownAnimation = local3;
    local3.setDuration(150L);
    mCircleView.setAnimationListener(paramAnimationListener);
    mCircleView.clearAnimation();
    mCircleView.startAnimation(mScaleDownAnimation);
  }
  
  public void stopNestedScroll()
  {
    mNestedScrollingChildHelper.stopNestedScroll();
  }
  
  public static abstract interface OnChildScrollUpCallback
  {
    public abstract boolean canChildScrollUp(@NonNull SwipeRefreshLayout paramSwipeRefreshLayout, @Nullable View paramView);
  }
  
  public static abstract interface OnRefreshListener
  {
    public abstract void onRefresh();
  }
}

/* Location:
 * Qualified Name:     androidx.swiperefreshlayout.widget.SwipeRefreshLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */