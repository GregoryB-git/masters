package androidx.recyclerview.widget;

import a;
import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import androidx.annotation.VisibleForTesting;

@VisibleForTesting
class ItemTouchHelper$RecoverAnimation
  implements Animator.AnimatorListener
{
  public final int mActionState;
  public final int mAnimationType;
  public boolean mEnded = false;
  private float mFraction;
  public boolean mIsPendingCleanup;
  public boolean mOverridden = false;
  public final float mStartDx;
  public final float mStartDy;
  public final float mTargetX;
  public final float mTargetY;
  @VisibleForTesting
  public final ValueAnimator mValueAnimator;
  public final RecyclerView.ViewHolder mViewHolder;
  public float mX;
  public float mY;
  
  public ItemTouchHelper$RecoverAnimation(RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    mActionState = paramInt2;
    mAnimationType = paramInt1;
    mViewHolder = paramViewHolder;
    mStartDx = paramFloat1;
    mStartDy = paramFloat2;
    mTargetX = paramFloat3;
    mTargetY = paramFloat4;
    ValueAnimator localValueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    mValueAnimator = localValueAnimator;
    localValueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener()
    {
      public void onAnimationUpdate(ValueAnimator paramAnonymousValueAnimator)
      {
        setFraction(paramAnonymousValueAnimator.getAnimatedFraction());
      }
    });
    localValueAnimator.setTarget(itemView);
    localValueAnimator.addListener(this);
    setFraction(0.0F);
  }
  
  public void cancel()
  {
    mValueAnimator.cancel();
  }
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    setFraction(1.0F);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    if (!mEnded) {
      mViewHolder.setIsRecyclable(true);
    }
    mEnded = true;
  }
  
  public void onAnimationRepeat(Animator paramAnimator) {}
  
  public void onAnimationStart(Animator paramAnimator) {}
  
  public void setDuration(long paramLong)
  {
    mValueAnimator.setDuration(paramLong);
  }
  
  public void setFraction(float paramFloat)
  {
    mFraction = paramFloat;
  }
  
  public void start()
  {
    mViewHolder.setIsRecyclable(false);
    mValueAnimator.start();
  }
  
  public void update()
  {
    float f1 = mStartDx;
    float f2 = mTargetX;
    if (f1 == f2) {
      mX = mViewHolder.itemView.getTranslationX();
    } else {
      mX = a.a(f2, f1, mFraction, f1);
    }
    f1 = mStartDy;
    f2 = mTargetY;
    if (f1 == f2) {
      mY = mViewHolder.itemView.getTranslationY();
    } else {
      mY = a.a(f2, f1, mFraction, f1);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */