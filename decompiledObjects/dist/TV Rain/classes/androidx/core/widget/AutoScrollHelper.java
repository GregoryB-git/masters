package androidx.core.widget;

import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

public abstract class AutoScrollHelper
  implements View.OnTouchListener
{
  private static final int DEFAULT_ACTIVATION_DELAY = ;
  private static final int DEFAULT_EDGE_TYPE = 1;
  private static final float DEFAULT_MAXIMUM_EDGE = Float.MAX_VALUE;
  private static final int DEFAULT_MAXIMUM_VELOCITY_DIPS = 1575;
  private static final int DEFAULT_MINIMUM_VELOCITY_DIPS = 315;
  private static final int DEFAULT_RAMP_DOWN_DURATION = 500;
  private static final int DEFAULT_RAMP_UP_DURATION = 500;
  private static final float DEFAULT_RELATIVE_EDGE = 0.2F;
  private static final float DEFAULT_RELATIVE_VELOCITY = 1.0F;
  public static final int EDGE_TYPE_INSIDE = 0;
  public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
  public static final int EDGE_TYPE_OUTSIDE = 2;
  private static final int HORIZONTAL = 0;
  public static final float NO_MAX = Float.MAX_VALUE;
  public static final float NO_MIN = 0.0F;
  public static final float RELATIVE_UNSPECIFIED = 0.0F;
  private static final int VERTICAL = 1;
  private int mActivationDelay;
  private boolean mAlreadyDelayed;
  public boolean mAnimating;
  private final Interpolator mEdgeInterpolator = new AccelerateInterpolator();
  private int mEdgeType;
  private boolean mEnabled;
  private boolean mExclusive;
  private float[] mMaximumEdges = { Float.MAX_VALUE, Float.MAX_VALUE };
  private float[] mMaximumVelocity = { Float.MAX_VALUE, Float.MAX_VALUE };
  private float[] mMinimumVelocity = { 0.0F, 0.0F };
  public boolean mNeedsCancel;
  public boolean mNeedsReset;
  private float[] mRelativeEdges = { 0.0F, 0.0F };
  private float[] mRelativeVelocity = { 0.0F, 0.0F };
  private Runnable mRunnable;
  public final ClampedScroller mScroller = new ClampedScroller();
  public final View mTarget;
  
  public AutoScrollHelper(@NonNull View paramView)
  {
    mTarget = paramView;
    float f = getSystemgetDisplayMetricsdensity;
    int i = (int)(1575.0F * f + 0.5F);
    int j = (int)(f * 315.0F + 0.5F);
    f = i;
    setMaximumVelocity(f, f);
    f = j;
    setMinimumVelocity(f, f);
    setEdgeType(1);
    setMaximumEdges(Float.MAX_VALUE, Float.MAX_VALUE);
    setRelativeEdges(0.2F, 0.2F);
    setRelativeVelocity(1.0F, 1.0F);
    setActivationDelay(DEFAULT_ACTIVATION_DELAY);
    setRampUpDuration(500);
    setRampDownDuration(500);
  }
  
  private float computeTargetVelocity(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f1 = getEdgeValue(mRelativeEdges[paramInt], paramFloat2, mMaximumEdges[paramInt], paramFloat1);
    boolean bool = f1 < 0.0F;
    if (!bool) {
      return 0.0F;
    }
    float f2 = mRelativeVelocity[paramInt];
    paramFloat1 = mMinimumVelocity[paramInt];
    paramFloat2 = mMaximumVelocity[paramInt];
    paramFloat3 = f2 * paramFloat3;
    if (bool) {
      return constrain(f1 * paramFloat3, paramFloat1, paramFloat2);
    }
    return -constrain(-f1 * paramFloat3, paramFloat1, paramFloat2);
  }
  
  public static float constrain(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > paramFloat3) {
      return paramFloat3;
    }
    if (paramFloat1 < paramFloat2) {
      return paramFloat2;
    }
    return paramFloat1;
  }
  
  public static int constrain(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > paramInt3) {
      return paramInt3;
    }
    if (paramInt1 < paramInt2) {
      return paramInt2;
    }
    return paramInt1;
  }
  
  private float constrainEdgeValue(float paramFloat1, float paramFloat2)
  {
    if (paramFloat2 == 0.0F) {
      return 0.0F;
    }
    int i = mEdgeType;
    if ((i != 0) && (i != 1))
    {
      if ((i == 2) && (paramFloat1 < 0.0F)) {
        return paramFloat1 / -paramFloat2;
      }
    }
    else if (paramFloat1 < paramFloat2)
    {
      if (paramFloat1 >= 0.0F) {
        return 1.0F - paramFloat1 / paramFloat2;
      }
      if ((mAnimating) && (i == 1)) {
        return 1.0F;
      }
    }
    return 0.0F;
  }
  
  private float getEdgeValue(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    paramFloat1 = constrain(paramFloat1 * paramFloat2, 0.0F, paramFloat3);
    paramFloat3 = constrainEdgeValue(paramFloat4, paramFloat1);
    paramFloat1 = constrainEdgeValue(paramFloat2 - paramFloat4, paramFloat1) - paramFloat3;
    if (paramFloat1 < 0.0F)
    {
      paramFloat1 = -mEdgeInterpolator.getInterpolation(-paramFloat1);
    }
    else
    {
      if (paramFloat1 <= 0.0F) {
        break label76;
      }
      paramFloat1 = mEdgeInterpolator.getInterpolation(paramFloat1);
    }
    return constrain(paramFloat1, -1.0F, 1.0F);
    label76:
    return 0.0F;
  }
  
  private void requestStop()
  {
    if (mNeedsReset) {
      mAnimating = false;
    } else {
      mScroller.requestStop();
    }
  }
  
  private void startAnimating()
  {
    if (mRunnable == null) {
      mRunnable = new ScrollAnimationRunnable();
    }
    mAnimating = true;
    mNeedsReset = true;
    if (!mAlreadyDelayed)
    {
      int i = mActivationDelay;
      if (i > 0)
      {
        ViewCompat.postOnAnimationDelayed(mTarget, mRunnable, i);
        break label70;
      }
    }
    mRunnable.run();
    label70:
    mAlreadyDelayed = true;
  }
  
  public abstract boolean canTargetScrollHorizontally(int paramInt);
  
  public abstract boolean canTargetScrollVertically(int paramInt);
  
  public void cancelTargetTouch()
  {
    long l = SystemClock.uptimeMillis();
    MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
    mTarget.onTouchEvent(localMotionEvent);
    localMotionEvent.recycle();
  }
  
  public boolean isEnabled()
  {
    return mEnabled;
  }
  
  public boolean isExclusive()
  {
    return mExclusive;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = mEnabled;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    int i = paramMotionEvent.getActionMasked();
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          if (i != 3) {
            break label140;
          }
        }
      }
      else
      {
        requestStop();
        break label140;
      }
    }
    else
    {
      mNeedsCancel = true;
      mAlreadyDelayed = false;
    }
    float f1 = computeTargetVelocity(0, paramMotionEvent.getX(), paramView.getWidth(), mTarget.getWidth());
    float f2 = computeTargetVelocity(1, paramMotionEvent.getY(), paramView.getHeight(), mTarget.getHeight());
    mScroller.setTargetVelocity(f1, f2);
    if ((!mAnimating) && (shouldAnimate())) {
      startAnimating();
    }
    label140:
    bool1 = bool2;
    if (mExclusive)
    {
      bool1 = bool2;
      if (mAnimating) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public abstract void scrollTargetBy(int paramInt1, int paramInt2);
  
  @NonNull
  public AutoScrollHelper setActivationDelay(int paramInt)
  {
    mActivationDelay = paramInt;
    return this;
  }
  
  @NonNull
  public AutoScrollHelper setEdgeType(int paramInt)
  {
    mEdgeType = paramInt;
    return this;
  }
  
  public AutoScrollHelper setEnabled(boolean paramBoolean)
  {
    if ((mEnabled) && (!paramBoolean)) {
      requestStop();
    }
    mEnabled = paramBoolean;
    return this;
  }
  
  public AutoScrollHelper setExclusive(boolean paramBoolean)
  {
    mExclusive = paramBoolean;
    return this;
  }
  
  @NonNull
  public AutoScrollHelper setMaximumEdges(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = mMaximumEdges;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  @NonNull
  public AutoScrollHelper setMaximumVelocity(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = mMaximumVelocity;
    arrayOfFloat[0] = (paramFloat1 / 1000.0F);
    arrayOfFloat[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  @NonNull
  public AutoScrollHelper setMinimumVelocity(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = mMinimumVelocity;
    arrayOfFloat[0] = (paramFloat1 / 1000.0F);
    arrayOfFloat[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  @NonNull
  public AutoScrollHelper setRampDownDuration(int paramInt)
  {
    mScroller.setRampDownDuration(paramInt);
    return this;
  }
  
  @NonNull
  public AutoScrollHelper setRampUpDuration(int paramInt)
  {
    mScroller.setRampUpDuration(paramInt);
    return this;
  }
  
  @NonNull
  public AutoScrollHelper setRelativeEdges(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = mRelativeEdges;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  @NonNull
  public AutoScrollHelper setRelativeVelocity(float paramFloat1, float paramFloat2)
  {
    float[] arrayOfFloat = mRelativeVelocity;
    arrayOfFloat[0] = (paramFloat1 / 1000.0F);
    arrayOfFloat[1] = (paramFloat2 / 1000.0F);
    return this;
  }
  
  public boolean shouldAnimate()
  {
    ClampedScroller localClampedScroller = mScroller;
    int i = localClampedScroller.getVerticalDirection();
    int j = localClampedScroller.getHorizontalDirection();
    boolean bool;
    if (((i != 0) && (canTargetScrollVertically(i))) || ((j != 0) && (canTargetScrollHorizontally(j)))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static class ClampedScroller
  {
    private long mDeltaTime = 0L;
    private int mDeltaX = 0;
    private int mDeltaY = 0;
    private int mEffectiveRampDown;
    private int mRampDownDuration;
    private int mRampUpDuration;
    private long mStartTime = Long.MIN_VALUE;
    private long mStopTime = -1L;
    private float mStopValue;
    private float mTargetVelocityX;
    private float mTargetVelocityY;
    
    private float getValueAt(long paramLong)
    {
      long l1 = mStartTime;
      if (paramLong < l1) {
        return 0.0F;
      }
      long l2 = mStopTime;
      if ((l2 >= 0L) && (paramLong >= l2))
      {
        float f = mStopValue;
        return AutoScrollHelper.constrain((float)(paramLong - l2) / mEffectiveRampDown, 0.0F, 1.0F) * f + (1.0F - f);
      }
      return AutoScrollHelper.constrain((float)(paramLong - l1) / mRampUpDuration, 0.0F, 1.0F) * 0.5F;
    }
    
    private float interpolateValue(float paramFloat)
    {
      return paramFloat * 4.0F + -4.0F * paramFloat * paramFloat;
    }
    
    public void computeScrollDelta()
    {
      if (mDeltaTime != 0L)
      {
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        float f = interpolateValue(getValueAt(l1));
        long l2 = mDeltaTime;
        mDeltaTime = l1;
        f = (float)(l1 - l2) * f;
        mDeltaX = ((int)(mTargetVelocityX * f));
        mDeltaY = ((int)(f * mTargetVelocityY));
        return;
      }
      throw new RuntimeException("Cannot compute scroll delta before calling start()");
    }
    
    public int getDeltaX()
    {
      return mDeltaX;
    }
    
    public int getDeltaY()
    {
      return mDeltaY;
    }
    
    public int getHorizontalDirection()
    {
      float f = mTargetVelocityX;
      return (int)(f / Math.abs(f));
    }
    
    public int getVerticalDirection()
    {
      float f = mTargetVelocityY;
      return (int)(f / Math.abs(f));
    }
    
    public boolean isFinished()
    {
      boolean bool;
      if ((mStopTime > 0L) && (AnimationUtils.currentAnimationTimeMillis() > mStopTime + mEffectiveRampDown)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void requestStop()
    {
      long l = AnimationUtils.currentAnimationTimeMillis();
      mEffectiveRampDown = AutoScrollHelper.constrain((int)(l - mStartTime), 0, mRampDownDuration);
      mStopValue = getValueAt(l);
      mStopTime = l;
    }
    
    public void setRampDownDuration(int paramInt)
    {
      mRampDownDuration = paramInt;
    }
    
    public void setRampUpDuration(int paramInt)
    {
      mRampUpDuration = paramInt;
    }
    
    public void setTargetVelocity(float paramFloat1, float paramFloat2)
    {
      mTargetVelocityX = paramFloat1;
      mTargetVelocityY = paramFloat2;
    }
    
    public void start()
    {
      long l = AnimationUtils.currentAnimationTimeMillis();
      mStartTime = l;
      mStopTime = -1L;
      mDeltaTime = l;
      mStopValue = 0.5F;
      mDeltaX = 0;
      mDeltaY = 0;
    }
  }
  
  public class ScrollAnimationRunnable
    implements Runnable
  {
    public ScrollAnimationRunnable() {}
    
    public void run()
    {
      Object localObject = AutoScrollHelper.this;
      if (!mAnimating) {
        return;
      }
      if (mNeedsReset)
      {
        mNeedsReset = false;
        mScroller.start();
      }
      localObject = mScroller;
      if ((!((AutoScrollHelper.ClampedScroller)localObject).isFinished()) && (shouldAnimate()))
      {
        AutoScrollHelper localAutoScrollHelper = AutoScrollHelper.this;
        if (mNeedsCancel)
        {
          mNeedsCancel = false;
          localAutoScrollHelper.cancelTargetTouch();
        }
        ((AutoScrollHelper.ClampedScroller)localObject).computeScrollDelta();
        int i = ((AutoScrollHelper.ClampedScroller)localObject).getDeltaX();
        int j = ((AutoScrollHelper.ClampedScroller)localObject).getDeltaY();
        scrollTargetBy(i, j);
        ViewCompat.postOnAnimation(mTarget, this);
        return;
      }
      mAnimating = false;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.AutoScrollHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */