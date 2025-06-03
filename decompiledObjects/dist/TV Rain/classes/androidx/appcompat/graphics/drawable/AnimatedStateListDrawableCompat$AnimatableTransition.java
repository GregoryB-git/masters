package androidx.appcompat.graphics.drawable;

import android.graphics.drawable.Animatable;

class AnimatedStateListDrawableCompat$AnimatableTransition
  extends AnimatedStateListDrawableCompat.Transition
{
  private final Animatable mA;
  
  public AnimatedStateListDrawableCompat$AnimatableTransition(Animatable paramAnimatable)
  {
    super(null);
    mA = paramAnimatable;
  }
  
  public void start()
  {
    mA.start();
  }
  
  public void stop()
  {
    mA.stop();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatableTransition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */