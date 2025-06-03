package androidx.appcompat.graphics.drawable;

import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;

class AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition
  extends AnimatedStateListDrawableCompat.Transition
{
  private final AnimatedVectorDrawableCompat mAvd;
  
  public AnimatedStateListDrawableCompat$AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat paramAnimatedVectorDrawableCompat)
  {
    super(null);
    mAvd = paramAnimatedVectorDrawableCompat;
  }
  
  public void start()
  {
    mAvd.start();
  }
  
  public void stop()
  {
    mAvd.stop();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedVectorDrawableTransition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */