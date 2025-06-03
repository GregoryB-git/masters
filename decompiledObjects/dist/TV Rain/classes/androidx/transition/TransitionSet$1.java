package androidx.transition;

import androidx.annotation.NonNull;

class TransitionSet$1
  extends TransitionListenerAdapter
{
  public TransitionSet$1(TransitionSet paramTransitionSet, Transition paramTransition) {}
  
  public void onTransitionEnd(@NonNull Transition paramTransition)
  {
    val$nextTransition.runAnimators();
    paramTransition.removeListener(this);
  }
}

/* Location:
 * Qualified Name:     androidx.transition.TransitionSet.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */