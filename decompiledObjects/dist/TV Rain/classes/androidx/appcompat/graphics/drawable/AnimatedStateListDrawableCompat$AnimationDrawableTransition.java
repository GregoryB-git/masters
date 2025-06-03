package androidx.appcompat.graphics.drawable;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.AnimationDrawable;
import androidx.appcompat.resources.Compatibility.Api18Impl;

class AnimatedStateListDrawableCompat$AnimationDrawableTransition
  extends AnimatedStateListDrawableCompat.Transition
{
  private final ObjectAnimator mAnim;
  private final boolean mHasReversibleFlag;
  
  public AnimatedStateListDrawableCompat$AnimationDrawableTransition(AnimationDrawable paramAnimationDrawable, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(null);
    int i = paramAnimationDrawable.getNumberOfFrames();
    int j;
    if (paramBoolean1) {
      j = i - 1;
    } else {
      j = 0;
    }
    if (paramBoolean1) {
      i = 0;
    } else {
      i--;
    }
    AnimatedStateListDrawableCompat.FrameInterpolator localFrameInterpolator = new AnimatedStateListDrawableCompat.FrameInterpolator(paramAnimationDrawable, paramBoolean1);
    paramAnimationDrawable = ObjectAnimator.ofInt(paramAnimationDrawable, "currentIndex", new int[] { j, i });
    Compatibility.Api18Impl.setAutoCancel(paramAnimationDrawable, true);
    paramAnimationDrawable.setDuration(localFrameInterpolator.getTotalDuration());
    paramAnimationDrawable.setInterpolator(localFrameInterpolator);
    mHasReversibleFlag = paramBoolean2;
    mAnim = paramAnimationDrawable;
  }
  
  public boolean canReverse()
  {
    return mHasReversibleFlag;
  }
  
  public void reverse()
  {
    mAnim.reverse();
  }
  
  public void start()
  {
    mAnim.start();
  }
  
  public void stop()
  {
    mAnim.cancel();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimationDrawableTransition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */