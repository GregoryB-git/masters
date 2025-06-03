package androidx.mediarouter.app;

import a;
import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class OverlayListView$OverlayObject
{
  private BitmapDrawable mBitmap;
  private float mCurrentAlpha = 1.0F;
  private Rect mCurrentBounds;
  private int mDeltaY;
  private long mDuration;
  private float mEndAlpha = 1.0F;
  private Interpolator mInterpolator;
  private boolean mIsAnimationEnded;
  private boolean mIsAnimationStarted;
  private OnAnimationEndListener mListener;
  private float mStartAlpha = 1.0F;
  private Rect mStartRect;
  private long mStartTime;
  
  public OverlayListView$OverlayObject(@Nullable BitmapDrawable paramBitmapDrawable, @Nullable Rect paramRect)
  {
    mBitmap = paramBitmapDrawable;
    mStartRect = paramRect;
    mCurrentBounds = new Rect(paramRect);
    paramBitmapDrawable = mBitmap;
    if (paramBitmapDrawable != null)
    {
      paramBitmapDrawable.setAlpha((int)(mCurrentAlpha * 255.0F));
      mBitmap.setBounds(mCurrentBounds);
    }
  }
  
  @Nullable
  public BitmapDrawable getBitmapDrawable()
  {
    return mBitmap;
  }
  
  public boolean isAnimationStarted()
  {
    return mIsAnimationStarted;
  }
  
  @NonNull
  public OverlayObject setAlphaAnimation(float paramFloat1, float paramFloat2)
  {
    mStartAlpha = paramFloat1;
    mEndAlpha = paramFloat2;
    return this;
  }
  
  @NonNull
  public OverlayObject setAnimationEndListener(@Nullable OnAnimationEndListener paramOnAnimationEndListener)
  {
    mListener = paramOnAnimationEndListener;
    return this;
  }
  
  @NonNull
  public OverlayObject setDuration(long paramLong)
  {
    mDuration = paramLong;
    return this;
  }
  
  @NonNull
  public OverlayObject setInterpolator(@Nullable Interpolator paramInterpolator)
  {
    mInterpolator = paramInterpolator;
    return this;
  }
  
  @NonNull
  public OverlayObject setTranslateYAnimation(int paramInt)
  {
    mDeltaY = paramInt;
    return this;
  }
  
  public void startAnimation(long paramLong)
  {
    mStartTime = paramLong;
    mIsAnimationStarted = true;
  }
  
  public void stopAnimation()
  {
    mIsAnimationStarted = true;
    mIsAnimationEnded = true;
    OnAnimationEndListener localOnAnimationEndListener = mListener;
    if (localOnAnimationEndListener != null) {
      localOnAnimationEndListener.onAnimationEnd();
    }
  }
  
  public boolean update(long paramLong)
  {
    if (mIsAnimationEnded) {
      return false;
    }
    float f1 = Math.min(1.0F, (float)(paramLong - mStartTime) / (float)mDuration);
    float f2 = 0.0F;
    f1 = Math.max(0.0F, f1);
    if (mIsAnimationStarted) {
      f2 = f1;
    }
    Object localObject1 = mInterpolator;
    if (localObject1 == null) {
      f1 = f2;
    } else {
      f1 = ((TimeInterpolator)localObject1).getInterpolation(f2);
    }
    int i = (int)(mDeltaY * f1);
    localObject1 = mCurrentBounds;
    Object localObject2 = mStartRect;
    top += i;
    bottom += i;
    float f3 = mStartAlpha;
    f1 = a.a(mEndAlpha, f3, f1, f3);
    mCurrentAlpha = f1;
    localObject2 = mBitmap;
    if ((localObject2 != null) && (localObject1 != null))
    {
      ((BitmapDrawable)localObject2).setAlpha((int)(f1 * 255.0F));
      mBitmap.setBounds(mCurrentBounds);
    }
    if ((mIsAnimationStarted) && (f2 >= 1.0F))
    {
      mIsAnimationEnded = true;
      localObject1 = mListener;
      if (localObject1 != null) {
        ((OnAnimationEndListener)localObject1).onAnimationEnd();
      }
    }
    return mIsAnimationEnded ^ true;
  }
  
  public static abstract interface OnAnimationEndListener
  {
    public abstract void onAnimationEnd();
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.app.OverlayListView.OverlayObject
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */