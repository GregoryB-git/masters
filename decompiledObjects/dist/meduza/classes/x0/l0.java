package x0;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;

public final class l0
  implements Transition.TransitionListener
{
  public l0(f paramf) {}
  
  public final void onTransitionCancel(Transition paramTransition) {}
  
  public final void onTransitionEnd(Transition paramTransition)
  {
    a.run();
  }
  
  public final void onTransitionPause(Transition paramTransition) {}
  
  public final void onTransitionResume(Transition paramTransition) {}
  
  public final void onTransitionStart(Transition paramTransition) {}
}

/* Location:
 * Qualified Name:     x0.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */