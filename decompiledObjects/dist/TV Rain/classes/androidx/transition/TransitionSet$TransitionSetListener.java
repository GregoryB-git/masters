package androidx.transition;

import androidx.annotation.NonNull;

class TransitionSet$TransitionSetListener
  extends TransitionListenerAdapter
{
  public TransitionSet mTransitionSet;
  
  public TransitionSet$TransitionSetListener(TransitionSet paramTransitionSet)
  {
    mTransitionSet = paramTransitionSet;
  }
  
  public void onTransitionEnd(@NonNull Transition paramTransition)
  {
    TransitionSet localTransitionSet = mTransitionSet;
    int i = mCurrentListeners - 1;
    mCurrentListeners = i;
    if (i == 0)
    {
      mStarted = false;
      localTransitionSet.end();
    }
    paramTransition.removeListener(this);
  }
  
  public void onTransitionStart(@NonNull Transition paramTransition)
  {
    paramTransition = mTransitionSet;
    if (!mStarted)
    {
      paramTransition.start();
      mTransitionSet.mStarted = true;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.TransitionSet.TransitionSetListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */