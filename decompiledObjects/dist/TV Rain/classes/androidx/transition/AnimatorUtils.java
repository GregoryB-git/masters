package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.annotation.NonNull;

class AnimatorUtils
{
  public static void addPauseListener(@NonNull Animator paramAnimator, @NonNull AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    paramAnimator.addPauseListener(paramAnimatorListenerAdapter);
  }
  
  public static void pause(@NonNull Animator paramAnimator)
  {
    paramAnimator.pause();
  }
  
  public static void resume(@NonNull Animator paramAnimator)
  {
    paramAnimator.resume();
  }
  
  public static abstract interface AnimatorPauseListenerCompat
  {
    public abstract void onAnimationPause(Animator paramAnimator);
    
    public abstract void onAnimationResume(Animator paramAnimator);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.AnimatorUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */