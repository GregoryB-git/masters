package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

class CircularProgressDrawable$2
  implements Animator.AnimatorListener
{
  public CircularProgressDrawable$2(CircularProgressDrawable paramCircularProgressDrawable, CircularProgressDrawable.Ring paramRing) {}
  
  public void onAnimationCancel(Animator paramAnimator) {}
  
  public void onAnimationEnd(Animator paramAnimator) {}
  
  public void onAnimationRepeat(Animator paramAnimator)
  {
    this$0.applyTransformation(1.0F, val$ring, true);
    val$ring.storeOriginals();
    val$ring.goToNextColor();
    CircularProgressDrawable localCircularProgressDrawable = this$0;
    if (mFinishing)
    {
      mFinishing = false;
      paramAnimator.cancel();
      paramAnimator.setDuration(1332L);
      paramAnimator.start();
      val$ring.setShowArrow(false);
    }
    else
    {
      mRotationCount += 1.0F;
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this$0.mRotationCount = 0.0F;
  }
}

/* Location:
 * Qualified Name:     androidx.swiperefreshlayout.widget.CircularProgressDrawable.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */