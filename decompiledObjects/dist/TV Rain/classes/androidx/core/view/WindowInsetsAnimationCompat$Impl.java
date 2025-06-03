package androidx.core.view;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.Nullable;

class WindowInsetsAnimationCompat$Impl
{
  private float mAlpha;
  private final long mDurationMillis;
  private float mFraction;
  @Nullable
  private final Interpolator mInterpolator;
  private final int mTypeMask;
  
  public WindowInsetsAnimationCompat$Impl(int paramInt, @Nullable Interpolator paramInterpolator, long paramLong)
  {
    mTypeMask = paramInt;
    mInterpolator = paramInterpolator;
    mDurationMillis = paramLong;
  }
  
  public float getAlpha()
  {
    return mAlpha;
  }
  
  public long getDurationMillis()
  {
    return mDurationMillis;
  }
  
  public float getFraction()
  {
    return mFraction;
  }
  
  public float getInterpolatedFraction()
  {
    Interpolator localInterpolator = mInterpolator;
    if (localInterpolator != null) {
      return localInterpolator.getInterpolation(mFraction);
    }
    return mFraction;
  }
  
  @Nullable
  public Interpolator getInterpolator()
  {
    return mInterpolator;
  }
  
  public int getTypeMask()
  {
    return mTypeMask;
  }
  
  public void setAlpha(float paramFloat)
  {
    mAlpha = paramFloat;
  }
  
  public void setFraction(float paramFloat)
  {
    mFraction = paramFloat;
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.WindowInsetsAnimationCompat.Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */