package androidx.transition;

import androidx.annotation.NonNull;

public abstract interface Transition$TransitionListener
{
  public abstract void onTransitionCancel(@NonNull Transition paramTransition);
  
  public abstract void onTransitionEnd(@NonNull Transition paramTransition);
  
  public abstract void onTransitionPause(@NonNull Transition paramTransition);
  
  public abstract void onTransitionResume(@NonNull Transition paramTransition);
  
  public abstract void onTransitionStart(@NonNull Transition paramTransition);
}

/* Location:
 * Qualified Name:     androidx.transition.Transition.TransitionListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */