package androidx.fragment.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;

public class x$d
  implements Transition.TransitionListener
{
  public x$d(x paramx, Runnable paramRunnable) {}
  
  public void onTransitionCancel(Transition paramTransition) {}
  
  public void onTransitionEnd(Transition paramTransition)
  {
    a.run();
  }
  
  public void onTransitionPause(Transition paramTransition) {}
  
  public void onTransitionResume(Transition paramTransition) {}
  
  public void onTransitionStart(Transition paramTransition) {}
}

/* Location:
 * Qualified Name:     androidx.fragment.app.x.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */