package androidx.constraintlayout.motion.widget;

import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.KeyCache;

class ViewTransition$Animate
{
  public boolean hold_at_100 = false;
  public KeyCache mCache = new KeyCache();
  private final int mClearsTag;
  public float mDpositionDt;
  public int mDuration;
  public Interpolator mInterpolator;
  public long mLastRender;
  public MotionController mMC;
  public float mPosition;
  private final int mSetsTag;
  public long mStart;
  public Rect mTempRec = new Rect();
  public int mUpDuration;
  public ViewTransitionController mVtController;
  public boolean reverse = false;
  
  public ViewTransition$Animate(ViewTransitionController paramViewTransitionController, MotionController paramMotionController, int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator, int paramInt4, int paramInt5)
  {
    mVtController = paramViewTransitionController;
    mMC = paramMotionController;
    mDuration = paramInt1;
    mUpDuration = paramInt2;
    long l = System.nanoTime();
    mStart = l;
    mLastRender = l;
    mVtController.addAnimation(this);
    mInterpolator = paramInterpolator;
    mSetsTag = paramInt4;
    mClearsTag = paramInt5;
    if (paramInt3 == 3) {
      hold_at_100 = true;
    }
    float f;
    if (paramInt1 == 0) {
      f = Float.MAX_VALUE;
    } else {
      f = 1.0F / paramInt1;
    }
    mDpositionDt = f;
    mutate();
  }
  
  public void mutate()
  {
    if (reverse) {
      mutateReverse();
    } else {
      mutateForward();
    }
  }
  
  public void mutateForward()
  {
    long l1 = System.nanoTime();
    long l2 = mLastRender;
    mLastRender = l1;
    float f = mPosition;
    f = (float)((l1 - l2) * 1.0E-6D) * mDpositionDt + f;
    mPosition = f;
    if (f >= 1.0F) {
      mPosition = 1.0F;
    }
    Object localObject = mInterpolator;
    if (localObject == null) {
      f = mPosition;
    } else {
      f = ((TimeInterpolator)localObject).getInterpolation(mPosition);
    }
    localObject = mMC;
    boolean bool = ((MotionController)localObject).interpolate(mView, f, l1, mCache);
    if (mPosition >= 1.0F)
    {
      if (mSetsTag != -1) {
        mMC.getView().setTag(mSetsTag, Long.valueOf(System.nanoTime()));
      }
      if (mClearsTag != -1) {
        mMC.getView().setTag(mClearsTag, null);
      }
      if (!hold_at_100) {
        mVtController.removeAnimation(this);
      }
    }
    if ((mPosition < 1.0F) || (bool)) {
      mVtController.invalidate();
    }
  }
  
  public void mutateReverse()
  {
    long l1 = System.nanoTime();
    long l2 = mLastRender;
    mLastRender = l1;
    float f = mPosition - (float)((l1 - l2) * 1.0E-6D) * mDpositionDt;
    mPosition = f;
    if (f < 0.0F) {
      mPosition = 0.0F;
    }
    Object localObject = mInterpolator;
    if (localObject == null) {
      f = mPosition;
    } else {
      f = ((TimeInterpolator)localObject).getInterpolation(mPosition);
    }
    localObject = mMC;
    boolean bool = ((MotionController)localObject).interpolate(mView, f, l1, mCache);
    if (mPosition <= 0.0F)
    {
      if (mSetsTag != -1) {
        mMC.getView().setTag(mSetsTag, Long.valueOf(System.nanoTime()));
      }
      if (mClearsTag != -1) {
        mMC.getView().setTag(mClearsTag, null);
      }
      mVtController.removeAnimation(this);
    }
    if ((mPosition > 0.0F) || (bool)) {
      mVtController.invalidate();
    }
  }
  
  public void reactTo(int paramInt, float paramFloat1, float paramFloat2)
  {
    if (paramInt != 1)
    {
      if (paramInt == 2)
      {
        mMC.getView().getHitRect(mTempRec);
        if ((!mTempRec.contains((int)paramFloat1, (int)paramFloat2)) && (!reverse)) {
          reverse(true);
        }
      }
      return;
    }
    if (!reverse) {
      reverse(true);
    }
  }
  
  public void reverse(boolean paramBoolean)
  {
    reverse = paramBoolean;
    if (paramBoolean)
    {
      int i = mUpDuration;
      if (i != -1)
      {
        float f;
        if (i == 0) {
          f = Float.MAX_VALUE;
        } else {
          f = 1.0F / i;
        }
        mDpositionDt = f;
      }
    }
    mVtController.invalidate();
    mLastRender = System.nanoTime();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.ViewTransition.Animate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */