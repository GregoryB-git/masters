package androidx.transition;

import android.view.ViewGroup;

public abstract class TransitionPropagation
{
  public abstract void captureValues(TransitionValues paramTransitionValues);
  
  public abstract String[] getPropagationProperties();
  
  public abstract long getStartDelay(ViewGroup paramViewGroup, Transition paramTransition, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2);
}

/* Location:
 * Qualified Name:     androidx.transition.TransitionPropagation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */