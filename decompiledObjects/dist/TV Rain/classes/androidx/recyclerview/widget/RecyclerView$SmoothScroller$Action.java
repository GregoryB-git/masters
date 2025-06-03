package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;
import androidx.annotation.Px;

public class RecyclerView$SmoothScroller$Action
{
  public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
  private boolean mChanged = false;
  private int mConsecutiveUpdates = 0;
  private int mDuration;
  private int mDx;
  private int mDy;
  private Interpolator mInterpolator;
  private int mJumpToPosition = -1;
  
  public RecyclerView$SmoothScroller$Action(@Px int paramInt1, @Px int paramInt2)
  {
    this(paramInt1, paramInt2, Integer.MIN_VALUE, null);
  }
  
  public RecyclerView$SmoothScroller$Action(@Px int paramInt1, @Px int paramInt2, int paramInt3)
  {
    this(paramInt1, paramInt2, paramInt3, null);
  }
  
  public RecyclerView$SmoothScroller$Action(@Px int paramInt1, @Px int paramInt2, int paramInt3, @Nullable Interpolator paramInterpolator)
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

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */