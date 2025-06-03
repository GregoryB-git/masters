package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import z2;

public abstract class RecyclerView$SmoothScroller
{
  private RecyclerView.LayoutManager mLayoutManager;
  private boolean mPendingInitialRun;
  private RecyclerView mRecyclerView;
  private final Action mRecyclingAction = new Action(0, 0);
  private boolean mRunning;
  private boolean mStarted;
  private int mTargetPosition = -1;
  private View mTargetView;
  
  @Nullable
  public PointF computeScrollVectorForPosition(int paramInt)
  {
    Object localObject = getLayoutManager();
    if ((localObject instanceof ScrollVectorProvider)) {
      return ((ScrollVectorProvider)localObject).computeScrollVectorForPosition(paramInt);
    }
    localObject = z2.t("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
    ((StringBuilder)localObject).append(ScrollVectorProvider.class.getCanonicalName());
    Log.w("RecyclerView", ((StringBuilder)localObject).toString());
    return null;
  }
  
  public View findViewByPosition(int paramInt)
  {
    return mRecyclerView.mLayout.findViewByPosition(paramInt);
  }
  
  public int getChildCount()
  {
    return mRecyclerView.mLayout.getChildCount();
  }
  
  public int getChildPosition(View paramView)
  {
    return mRecyclerView.getChildLayoutPosition(paramView);
  }
  
  @Nullable
  public RecyclerView.LayoutManager getLayoutManager()
  {
    return mLayoutManager;
  }
  
  public int getTargetPosition()
  {
    return mTargetPosition;
  }
  
  @Deprecated
  public void instantScrollToPosition(int paramInt)
  {
    mRecyclerView.scrollToPosition(paramInt);
  }
  
  public boolean isPendingInitialRun()
  {
    return mPendingInitialRun;
  }
  
  public boolean isRunning()
  {
    return mRunning;
  }
  
  public void normalize(@NonNull PointF paramPointF)
  {
    float f1 = x;
    float f2 = y;
    f1 = (float)Math.sqrt(f2 * f2 + f1 * f1);
    x /= f1;
    y /= f1;
  }
  
  public void onAnimation(int paramInt1, int paramInt2)
  {
    RecyclerView localRecyclerView = mRecyclerView;
    if ((mTargetPosition == -1) || (localRecyclerView == null)) {
      stop();
    }
    if ((mPendingInitialRun) && (mTargetView == null) && (mLayoutManager != null))
    {
      localObject = computeScrollVectorForPosition(mTargetPosition);
      if (localObject != null)
      {
        float f = x;
        if ((f != 0.0F) || (y != 0.0F)) {
          localRecyclerView.scrollStep((int)Math.signum(f), (int)Math.signum(y), null);
        }
      }
    }
    mPendingInitialRun = false;
    Object localObject = mTargetView;
    if (localObject != null) {
      if (getChildPosition((View)localObject) == mTargetPosition)
      {
        onTargetFound(mTargetView, mState, mRecyclingAction);
        mRecyclingAction.runIfNecessary(localRecyclerView);
        stop();
      }
      else
      {
        Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
        mTargetView = null;
      }
    }
    if (mRunning)
    {
      onSeekTargetStep(paramInt1, paramInt2, mState, mRecyclingAction);
      boolean bool = mRecyclingAction.hasJumpTarget();
      mRecyclingAction.runIfNecessary(localRecyclerView);
      if ((bool) && (mRunning))
      {
        mPendingInitialRun = true;
        mViewFlinger.postOnAnimation();
      }
    }
  }
  
  public void onChildAttachedToWindow(View paramView)
  {
    if (getChildPosition(paramView) == getTargetPosition()) {
      mTargetView = paramView;
    }
  }
  
  public abstract void onSeekTargetStep(@Px int paramInt1, @Px int paramInt2, @NonNull RecyclerView.State paramState, @NonNull Action paramAction);
  
  public abstract void onStart();
  
  public abstract void onStop();
  
  public abstract void onTargetFound(@NonNull View paramView, @NonNull RecyclerView.State paramState, @NonNull Action paramAction);
  
  public void setTargetPosition(int paramInt)
  {
    mTargetPosition = paramInt;
  }
  
  public void start(RecyclerView paramRecyclerView, RecyclerView.LayoutManager paramLayoutManager)
  {
    mViewFlinger.stop();
    if (mStarted)
    {
      StringBuilder localStringBuilder = z2.t("An instance of ");
      localStringBuilder.append(getClass().getSimpleName());
      localStringBuilder.append(" was started more than once. Each instance of");
      localStringBuilder.append(getClass().getSimpleName());
      localStringBuilder.append(" is intended to only be used once. You should create a new instance for each use.");
      Log.w("RecyclerView", localStringBuilder.toString());
    }
    mRecyclerView = paramRecyclerView;
    mLayoutManager = paramLayoutManager;
    int i = mTargetPosition;
    if (i != -1)
    {
      mState.mTargetPosition = i;
      mRunning = true;
      mPendingInitialRun = true;
      mTargetView = findViewByPosition(getTargetPosition());
      onStart();
      mRecyclerView.mViewFlinger.postOnAnimation();
      mStarted = true;
      return;
    }
    throw new IllegalArgumentException("Invalid target position");
  }
  
  public final void stop()
  {
    if (!mRunning) {
      return;
    }
    mRunning = false;
    onStop();
    mRecyclerView.mState.mTargetPosition = -1;
    mTargetView = null;
    mTargetPosition = -1;
    mPendingInitialRun = false;
    mLayoutManager.onSmoothScrollerStopped(this);
    mLayoutManager = null;
    mRecyclerView = null;
  }
  
  public static class Action
  {
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    private boolean mChanged = false;
    private int mConsecutiveUpdates = 0;
    private int mDuration;
    private int mDx;
    private int mDy;
    private Interpolator mInterpolator;
    private int mJumpToPosition = -1;
    
    public Action(@Px int paramInt1, @Px int paramInt2)
    {
      this(paramInt1, paramInt2, Integer.MIN_VALUE, null);
    }
    
    public Action(@Px int paramInt1, @Px int paramInt2, int paramInt3)
    {
      this(paramInt1, paramInt2, paramInt3, null);
    }
    
    public Action(@Px int paramInt1, @Px int paramInt2, int paramInt3, @Nullable Interpolator paramInterpolator)
    {
      mDx = paramInt1;
      mDy = paramInt2;
      mDuration = paramInt3;
      mInterpolator = paramInterpolator;
    }
    
    private void validate()
    {
      if ((mInterpolator != null) && (mDuration < 1)) {
        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
      }
      if (mDuration >= 1) {
        return;
      }
      throw new IllegalStateException("Scroll duration must be a positive number");
    }
    
    public int getDuration()
    {
      return mDuration;
    }
    
    @Px
    public int getDx()
    {
      return mDx;
    }
    
    @Px
    public int getDy()
    {
      return mDy;
    }
    
    @Nullable
    public Interpolator getInterpolator()
    {
      return mInterpolator;
    }
    
    public boolean hasJumpTarget()
    {
      boolean bool;
      if (mJumpToPosition >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void jumpTo(int paramInt)
    {
      mJumpToPosition = paramInt;
    }
    
    public void runIfNecessary(RecyclerView paramRecyclerView)
    {
      int i = mJumpToPosition;
      if (i >= 0)
      {
        mJumpToPosition = -1;
        paramRecyclerView.jumpToPositionForSmoothScroller(i);
        mChanged = false;
        return;
      }
      if (mChanged)
      {
        validate();
        mViewFlinger.smoothScrollBy(mDx, mDy, mDuration, mInterpolator);
        i = mConsecutiveUpdates + 1;
        mConsecutiveUpdates = i;
        if (i > 10) {
          Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        mChanged = false;
      }
      else
      {
        mConsecutiveUpdates = 0;
      }
    }
    
    public void setDuration(int paramInt)
    {
      mChanged = true;
      mDuration = paramInt;
    }
    
    public void setDx(@Px int paramInt)
    {
      mChanged = true;
      mDx = paramInt;
    }
    
    public void setDy(@Px int paramInt)
    {
      mChanged = true;
      mDy = paramInt;
    }
    
    public void setInterpolator(@Nullable Interpolator paramInterpolator)
    {
      mChanged = true;
      mInterpolator = paramInterpolator;
    }
    
    public void update(@Px int paramInt1, @Px int paramInt2, int paramInt3, @Nullable Interpolator paramInterpolator)
    {
      mDx = paramInt1;
      mDy = paramInt2;
      mDuration = paramInt3;
      mInterpolator = paramInterpolator;
      mChanged = true;
    }
  }
  
  public static abstract interface ScrollVectorProvider
  {
    @Nullable
    public abstract PointF computeScrollVectorForPosition(int paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.SmoothScroller
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */