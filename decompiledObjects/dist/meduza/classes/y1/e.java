package y1;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import e0.d0;
import e0.d0.d;
import e0.p;
import e0.q;
import e0.r;
import e0.s;
import java.util.WeakHashMap;

public class e
  extends ViewGroup
  implements r, q
{
  private static final int ALPHA_ANIMATION_DURATION = 300;
  private static final int ANIMATE_TO_START_DURATION = 200;
  private static final int ANIMATE_TO_TRIGGER_DURATION = 200;
  public static final int CIRCLE_DIAMETER = 40;
  public static final int CIRCLE_DIAMETER_LARGE = 56;
  private static final float DECELERATE_INTERPOLATION_FACTOR = 2.0F;
  public static final int DEFAULT = 1;
  private static final int DEFAULT_CIRCLE_TARGET = 64;
  public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
  private static final float DRAG_RATE = 0.5F;
  private static final int INVALID_POINTER = -1;
  public static final int LARGE = 0;
  private static final int[] LAYOUT_ATTRS = { 16842766 };
  private static final String LOG_TAG = e.class.getSimpleName();
  private static final int MAX_ALPHA = 255;
  private static final float MAX_PROGRESS_ANGLE = 0.8F;
  private static final int SCALE_DOWN_DURATION = 150;
  private static final int STARTING_PROGRESS_ALPHA = 76;
  private int mActivePointerId = -1;
  private Animation mAlphaMaxAnimation;
  private Animation mAlphaStartAnimation;
  private final Animation mAnimateToCorrectPosition = new f();
  private final Animation mAnimateToStartPosition = new g();
  private i mChildScrollUpCallback;
  private int mCircleDiameter;
  public a mCircleView;
  private int mCircleViewIndex = -1;
  public int mCurrentTargetOffsetTop;
  public int mCustomSlingshotDistance;
  private final DecelerateInterpolator mDecelerateInterpolator;
  private boolean mEnableLegacyRequestDisallowInterceptTouch;
  public int mFrom;
  private float mInitialDownY;
  private float mInitialMotionY;
  private boolean mIsBeingDragged;
  public j mListener;
  private int mMediumAnimationDuration;
  private boolean mNestedScrollInProgress;
  private final p mNestedScrollingChildHelper;
  private final s mNestedScrollingParentHelper;
  private final int[] mNestedScrollingV2ConsumedCompat = new int[2];
  public boolean mNotify;
  public int mOriginalOffsetTop;
  private final int[] mParentOffsetInWindow = new int[2];
  private final int[] mParentScrollConsumed = new int[2];
  public d mProgress;
  private Animation.AnimationListener mRefreshListener = new a();
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
  
  public e(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public e(Context paramContext, AttributeSet paramAttributeSet)
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
    mNestedScrollingParentHelper = new s();
    mNestedScrollingChildHelper = new p(this);
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
      mCircleView.a = paramAnimationListener;
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
        mCircleView.a = paramAnimationListener;
      }
      mCircleView.clearAnimation();
      mCircleView.startAnimation(mAnimateToStartPosition);
    }
  }
  
  private void createProgressView()
  {
    mCircleView = new a(getContext());
    d locald = new d(getContext());
    mProgress = locald;
    locald.b(7.5F, 2.5F, 10.0F, 5.0F);
    locald.invalidateSelf();
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
      d locald = mProgress;
      Object localObject = a;
      e = 0.0F;
      f = 0.0F;
      locald.invalidateSelf();
      localObject = null;
      if (!mScale) {
        localObject = new e();
      }
      animateOffsetToStartPosition(mCurrentTargetOffsetTop, (Animation.AnimationListener)localObject);
      locald = mProgress;
      localObject = a;
      if (n) {
        n = false;
      }
      locald.invalidateSelf();
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
    Object localObject1 = mProgress;
    Object localObject2 = a;
    if (n != true) {
      n = true;
    }
    ((Drawable)localObject1).invalidateSelf();
    float f1 = Math.min(1.0F, Math.abs(paramFloat / mTotalDragDistance));
    float f2 = (float)Math.max(f1 - 0.4D, 0.0D) * 5.0F / 3.0F;
    float f3 = Math.abs(paramFloat);
    float f4 = mTotalDragDistance;
    int i = mCustomSlingshotDistance;
    if (i <= 0) {
      if (mUsingCustomStart) {
        i = mSpinnerOffsetEnd - mOriginalOffsetTop;
      } else {
        i = mSpinnerOffsetEnd;
      }
    }
    float f5 = i;
    double d = Math.max(0.0F, Math.min(f3 - f4, f5 * 2.0F) / f5) / 4.0F;
    f4 = (float)(d - Math.pow(d, 2.0D)) * 2.0F;
    int j = mOriginalOffsetTop;
    i = (int)(f5 * f1 + f5 * f4 * 2.0F);
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
      if ((mProgress.a.t > 76) && (!isAnimationRunning(mAlphaStartAnimation))) {
        startProgressAlphaStartAnimation();
      }
    }
    else if ((mProgress.a.t < 255) && (!isAnimationRunning(mAlphaMaxAnimation))) {
      startProgressAlphaMaxAnimation();
    }
    localObject2 = mProgress;
    paramFloat = Math.min(0.8F, f2 * 0.8F);
    localObject1 = a;
    e = 0.0F;
    f = paramFloat;
    ((Drawable)localObject2).invalidateSelf();
    localObject1 = mProgress;
    paramFloat = Math.min(1.0F, f2);
    localObject2 = a;
    if (paramFloat != p) {
      p = paramFloat;
    }
    ((Drawable)localObject1).invalidateSelf();
    localObject2 = mProgress;
    a.g = ((f4 * 2.0F + (f2 * 0.4F - 0.25F)) * 0.5F);
    ((Drawable)localObject2).invalidateSelf();
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
    d locald = new d(paramInt1, paramInt2);
    locald.setDuration(300L);
    a locala = mCircleView;
    a = null;
    locala.clearAnimation();
    mCircleView.startAnimation(locald);
    return locald;
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
    mAlphaMaxAnimation = startAlphaAnimation(mProgress.a.t, 255);
  }
  
  private void startProgressAlphaStartAnimation()
  {
    mAlphaStartAnimation = startAlphaAnimation(mProgress.a.t, 76);
  }
  
  private void startScaleDownReturnToStartAnimation(int paramInt, Animation.AnimationListener paramAnimationListener)
  {
    mFrom = paramInt;
    mStartingScale = mCircleView.getScaleX();
    h localh = new h();
    mScaleDownToStartAnimation = localh;
    localh.setDuration(150L);
    if (paramAnimationListener != null) {
      mCircleView.a = paramAnimationListener;
    }
    mCircleView.clearAnimation();
    mCircleView.startAnimation(mScaleDownToStartAnimation);
  }
  
  private void startScaleUpAnimation(Animation.AnimationListener paramAnimationListener)
  {
    mCircleView.setVisibility(0);
    mProgress.setAlpha(255);
    b localb = new b();
    mScaleAnimation = localb;
    localb.setDuration(mMediumAnimationDuration);
    if (paramAnimationListener != null) {
      mCircleView.a = paramAnimationListener;
    }
    mCircleView.clearAnimation();
    mCircleView.startAnimation(mScaleAnimation);
  }
  
  public boolean canChildScrollUp()
  {
    Object localObject = mChildScrollUpCallback;
    if (localObject != null) {
      return ((i)localObject).canChildScrollUp(this, mTarget);
    }
    localObject = mTarget;
    if ((localObject instanceof ListView)) {
      return ((ListView)localObject).canScrollList(-1);
    }
    return ((View)localObject).canScrollVertically(-1);
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return mNestedScrollingChildHelper.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return mNestedScrollingChildHelper.b(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return mNestedScrollingChildHelper.c(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, 0);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    boolean bool;
    if ((paramInt3 == 0) && (dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt1, int paramInt5, int[] paramArrayOfInt2)
  {
    if (paramInt5 == 0) {
      mNestedScrollingChildHelper.e(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt1, paramInt5, paramArrayOfInt2);
    }
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return mNestedScrollingChildHelper.e(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, 0, null);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    boolean bool;
    if ((paramInt5 == 0) && (mNestedScrollingChildHelper.e(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, paramInt5, null))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
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
    s locals = mNestedScrollingParentHelper;
    int i = a;
    return b | i;
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
    p localp = mNestedScrollingChildHelper;
    boolean bool = false;
    if (localp.f(0) != null) {
      bool = true;
    }
    return bool;
  }
  
  public boolean hasNestedScrollingParent(int paramInt)
  {
    boolean bool;
    if ((paramInt == 0) && (hasNestedScrollingParent())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return mNestedScrollingChildHelper.d;
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
    paramInt4 = getPaddingLeft();
    paramInt2 = getPaddingTop();
    ((View)localObject).layout(paramInt4, paramInt2, paramInt1 - getPaddingLeft() - getPaddingRight() + paramInt4, paramInt3 - getPaddingTop() - getPaddingBottom() + paramInt2);
    paramInt3 = mCircleView.getMeasuredWidth();
    paramInt2 = mCircleView.getMeasuredHeight();
    localObject = mCircleView;
    paramInt1 /= 2;
    paramInt3 /= 2;
    paramInt4 = mCurrentTargetOffsetTop;
    ((View)localObject).layout(paramInt1 - paramInt3, paramInt4, paramInt1 + paramInt3, paramInt2 + paramInt4);
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
          paramArrayOfInt[1] = ((int)f1);
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
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3)
  {
    if (paramInt3 == 0) {
      onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
    }
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0, mNestedScrollingV2ConsumedCompat);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, mNestedScrollingV2ConsumedCompat);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt)
  {
    if (paramInt5 != 0) {
      return;
    }
    int i = paramArrayOfInt[1];
    dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, mParentOffsetInWindow, paramInt5, paramArrayOfInt);
    paramInt2 = paramInt4 - (paramArrayOfInt[1] - i);
    if (paramInt2 == 0) {
      paramInt1 = paramInt4 + mParentOffsetInWindow[1];
    } else {
      paramInt1 = paramInt2;
    }
    if ((paramInt1 < 0) && (!canChildScrollUp()))
    {
      float f = mTotalUnconsumed + Math.abs(paramInt1);
      mTotalUnconsumed = f;
      moveSpinner(f);
      paramArrayOfInt[1] += paramInt2;
    }
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    mNestedScrollingParentHelper.a = paramInt;
    startNestedScroll(paramInt & 0x2);
    mTotalUnconsumed = 0.0F;
    mNestedScrollInProgress = true;
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      onNestedScrollAccepted(paramView1, paramView2, paramInt1);
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (k)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    setRefreshing(a);
  }
  
  public Parcelable onSaveInstanceState()
  {
    return new k(super.onSaveInstanceState(), mRefreshing);
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
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return onStartNestedScroll(paramView1, paramView2, paramInt1);
    }
    return false;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    mNestedScrollingParentHelper.a = 0;
    mNestedScrollInProgress = false;
    float f = mTotalUnconsumed;
    if (f > 0.0F)
    {
      finishSpinner(f);
      mTotalUnconsumed = 0.0F;
    }
    stopNestedScroll();
  }
  
  public void onStopNestedScroll(View paramView, int paramInt)
  {
    if (paramInt == 0) {
      onStopNestedScroll(paramView);
    }
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
              if (f1 > 0.0F)
              {
                getParent().requestDisallowInterceptTouchEvent(true);
                moveSpinner(f1);
              }
              else
              {
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
            float f2 = paramMotionEvent.getY(i);
            f1 = mInitialMotionY;
            mIsBeingDragged = false;
            finishSpinner((f2 - f1) * 0.5F);
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
    if (localView != null)
    {
      Object localObject = d0.a;
      if (!d0.d.p(localView))
      {
        if (mEnableLegacyRequestDisallowInterceptTouch) {
          return;
        }
        localObject = getParent();
        if (localObject == null) {
          return;
        }
        ((ViewParent)localObject).requestDisallowInterceptTouchEvent(paramBoolean);
        return;
      }
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
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
  public void setColorScheme(int... paramVarArgs)
  {
    setColorSchemeResources(paramVarArgs);
  }
  
  public void setColorSchemeColors(int... paramVarArgs)
  {
    ensureTarget();
    d locald = mProgress;
    d.a locala = a;
    i = paramVarArgs;
    locala.a(0);
    a.a(0);
    locald.invalidateSelf();
  }
  
  public void setColorSchemeResources(int... paramVarArgs)
  {
    Context localContext = getContext();
    int[] arrayOfInt = new int[paramVarArgs.length];
    for (int i = 0; i < paramVarArgs.length; i++) {
      arrayOfInt[i] = v.a.getColor(localContext, paramVarArgs[i]);
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
  
  @Deprecated
  public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean paramBoolean)
  {
    mEnableLegacyRequestDisallowInterceptTouch = paramBoolean;
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    p localp = mNestedScrollingChildHelper;
    if (d)
    {
      View localView = c;
      WeakHashMap localWeakHashMap = d0.a;
      d0.d.z(localView);
    }
    d = paramBoolean;
  }
  
  public void setOnChildScrollUpCallback(i parami)
  {
    mChildScrollUpCallback = parami;
  }
  
  public void setOnRefreshListener(j paramj)
  {
    mListener = paramj;
  }
  
  @Deprecated
  public void setProgressBackgroundColor(int paramInt)
  {
    setProgressBackgroundColorSchemeResource(paramInt);
  }
  
  public void setProgressBackgroundColorSchemeColor(int paramInt)
  {
    mCircleView.setBackgroundColor(paramInt);
  }
  
  public void setProgressBackgroundColorSchemeResource(int paramInt)
  {
    setProgressBackgroundColorSchemeColor(v.a.getColor(getContext(), paramInt));
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
    Object localObject = getResources().getDisplayMetrics();
    float f1;
    if (paramInt == 0) {
      f1 = 56.0F;
    } else {
      f1 = 40.0F;
    }
    mCircleDiameter = ((int)(density * f1));
    mCircleView.setImageDrawable(null);
    localObject = mProgress;
    float f2;
    float f3;
    float f4;
    if (paramInt == 0)
    {
      f2 = 11.0F;
      f1 = 3.0F;
      f3 = 12.0F;
      f4 = 6.0F;
    }
    else
    {
      f2 = 7.5F;
      f1 = 2.5F;
      f3 = 10.0F;
      f4 = 5.0F;
    }
    ((d)localObject).b(f2, f1, f3, f4);
    ((Drawable)localObject).invalidateSelf();
    mCircleView.setImageDrawable(mProgress);
  }
  
  public void setSlingshotDistance(int paramInt)
  {
    mCustomSlingshotDistance = paramInt;
  }
  
  public void setTargetOffsetTopAndBottom(int paramInt)
  {
    mCircleView.bringToFront();
    a locala = mCircleView;
    WeakHashMap localWeakHashMap = d0.a;
    locala.offsetTopAndBottom(paramInt);
    mCurrentTargetOffsetTop = mCircleView.getTop();
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return mNestedScrollingChildHelper.g(paramInt, 0);
  }
  
  public boolean startNestedScroll(int paramInt1, int paramInt2)
  {
    boolean bool;
    if ((paramInt2 == 0) && (startNestedScroll(paramInt1))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void startScaleDownAnimation(Animation.AnimationListener paramAnimationListener)
  {
    Object localObject = new c();
    mScaleDownAnimation = ((Animation)localObject);
    ((Animation)localObject).setDuration(150L);
    localObject = mCircleView;
    a = paramAnimationListener;
    ((View)localObject).clearAnimation();
    mCircleView.startAnimation(mScaleDownAnimation);
  }
  
  public void stopNestedScroll()
  {
    mNestedScrollingChildHelper.h(0);
  }
  
  public void stopNestedScroll(int paramInt)
  {
    if (paramInt == 0) {
      stopNestedScroll();
    }
  }
  
  public final class a
    implements Animation.AnimationListener
  {
    public a() {}
    
    public final void onAnimationEnd(Animation paramAnimation)
    {
      paramAnimation = e.this;
      if (mRefreshing)
      {
        mProgress.setAlpha(255);
        mProgress.start();
        paramAnimation = e.this;
        if (mNotify)
        {
          paramAnimation = mListener;
          if (paramAnimation != null) {
            paramAnimation.onRefresh();
          }
        }
        paramAnimation = e.this;
        mCurrentTargetOffsetTop = mCircleView.getTop();
      }
      else
      {
        paramAnimation.reset();
      }
    }
    
    public final void onAnimationRepeat(Animation paramAnimation) {}
    
    public final void onAnimationStart(Animation paramAnimation) {}
  }
  
  public final class b
    extends Animation
  {
    public b() {}
    
    public final void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      setAnimationProgress(paramFloat);
    }
  }
  
  public final class c
    extends Animation
  {
    public c() {}
    
    public final void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      setAnimationProgress(1.0F - paramFloat);
    }
  }
  
  public final class d
    extends Animation
  {
    public d(int paramInt1, int paramInt2) {}
    
    public final void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      paramTransformation = mProgress;
      int i = paramInt1;
      float f = i;
      paramTransformation.setAlpha((int)((paramInt2 - i) * paramFloat + f));
    }
  }
  
  public final class e
    implements Animation.AnimationListener
  {
    public e() {}
    
    public final void onAnimationEnd(Animation paramAnimation)
    {
      paramAnimation = e.this;
      if (!mScale) {
        paramAnimation.startScaleDownAnimation(null);
      }
    }
    
    public final void onAnimationRepeat(Animation paramAnimation) {}
    
    public final void onAnimationStart(Animation paramAnimation) {}
  }
  
  public final class f
    extends Animation
  {
    public f() {}
    
    public final void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      paramTransformation = e.this;
      if (!mUsingCustomStart) {
        i = mSpinnerOffsetEnd - Math.abs(mOriginalOffsetTop);
      } else {
        i = mSpinnerOffsetEnd;
      }
      paramTransformation = e.this;
      int j = mFrom;
      int k = (int)((i - j) * paramFloat);
      int i = mCircleView.getTop();
      setTargetOffsetTopAndBottom(j + k - i);
      paramTransformation = mProgress;
      paramFloat = 1.0F - paramFloat;
      d.a locala = a;
      if (paramFloat != p) {
        p = paramFloat;
      }
      paramTransformation.invalidateSelf();
    }
  }
  
  public final class g
    extends Animation
  {
    public g() {}
    
    public final void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      moveToStart(paramFloat);
    }
  }
  
  public final class h
    extends Animation
  {
    public h() {}
    
    public final void applyTransformation(float paramFloat, Transformation paramTransformation)
    {
      paramTransformation = e.this;
      float f = mStartingScale;
      paramTransformation.setAnimationProgress(-f * paramFloat + f);
      moveToStart(paramFloat);
    }
  }
  
  public static abstract interface i
  {
    public abstract boolean canChildScrollUp(e parame, View paramView);
  }
  
  public static abstract interface j
  {
    public abstract void onRefresh();
  }
  
  public static final class k
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<k> CREATOR = new a();
    public final boolean a;
    
    public k(Parcel paramParcel)
    {
      super();
      boolean bool;
      if (paramParcel.readByte() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      a = bool;
    }
    
    public k(Parcelable paramParcelable, boolean paramBoolean)
    {
      super();
      a = paramBoolean;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeByte(a);
    }
    
    public final class a
      implements Parcelable.Creator<e.k>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new e.k(paramParcel);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new e.k[paramInt];
      }
    }
  }
}

/* Location:
 * Qualified Name:     y1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */