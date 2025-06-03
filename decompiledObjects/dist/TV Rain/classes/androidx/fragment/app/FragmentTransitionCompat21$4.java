package androidx.fragment.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;

class FragmentTransitionCompat21$4
  implements Transition.TransitionListener
{
  public FragmentTransitionCompat21$4(FragmentTransitionCompat21 paramFragmentTransitionCompat21, Runnable paramRunnable) {}
  
  public void onTransitionCancel(Transition paramTransition) {}
  
  public void onTransitionEnd(Transition paramTransition)
  {
    val$transitionCompleteRunnable.run();
  }
  
  public void onTransitionPause(Transition paramTransition) {}
  
  public void onTransitionResume(Transition paramTransition) {}
  
  public void onTransitionStart(Transition paramTransition) {}
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransitionCompat21.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */