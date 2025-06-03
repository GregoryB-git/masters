package androidx.fragment.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.view.View;
import java.util.ArrayList;

class FragmentTransitionCompat21$2
  implements Transition.TransitionListener
{
  public FragmentTransitionCompat21$2(FragmentTransitionCompat21 paramFragmentTransitionCompat21, View paramView, ArrayList paramArrayList) {}
  
  public void onTransitionCancel(Transition paramTransition) {}
  
  public void onTransitionEnd(Transition paramTransition)
  {
    paramTransition.removeListener(this);
    val$fragmentView.setVisibility(8);
    int i = val$exitingViews.size();
    for (int j = 0; j < i; j++) {
      ((View)val$exitingViews.get(j)).setVisibility(0);
    }
  }
  
  public void onTransitionPause(Transition paramTransition) {}
  
  public void onTransitionResume(Transition paramTransition) {}
  
  public void onTransitionStart(Transition paramTransition)
  {
    paramTransition.removeListener(this);
    paramTransition.addListener(this);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransitionCompat21.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */