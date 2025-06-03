package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

class Transition$2
  extends AnimatorListenerAdapter
{
  public Transition$2(Transition paramTransition, ArrayMap paramArrayMap) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    val$runningAnimators.remove(paramAnimator);
    this$0.mCurrentAnimators.remove(paramAnimator);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this$0.mCurrentAnimators.add(paramAnimator);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.Transition.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */