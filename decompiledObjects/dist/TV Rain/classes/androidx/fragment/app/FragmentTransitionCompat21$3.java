package androidx.fragment.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import java.util.ArrayList;

class FragmentTransitionCompat21$3
  implements Transition.TransitionListener
{
  public FragmentTransitionCompat21$3(FragmentTransitionCompat21 paramFragmentTransitionCompat21, Object paramObject1, ArrayList paramArrayList1, Object paramObject2, ArrayList paramArrayList2, Object paramObject3, ArrayList paramArrayList3) {}
  
  public void onTransitionCancel(Transition paramTransition) {}
  
  public void onTransitionEnd(Transition paramTransition)
  {
    paramTransition.removeListener(this);
  }
  
  public void onTransitionPause(Transition paramTransition) {}
  
  public void onTransitionResume(Transition paramTransition) {}
  
  public void onTransitionStart(Transition paramTransition)
  {
    paramTransition = val$enterTransition;
    if (paramTransition != null) {
      this$0.replaceTargets(paramTransition, val$enteringViews, null);
    }
    paramTransition = val$exitTransition;
    if (paramTransition != null) {
      this$0.replaceTargets(paramTransition, val$exitingViews, null);
    }
    paramTransition = val$sharedElementTransition;
    if (paramTransition != null) {
      this$0.replaceTargets(paramTransition, val$sharedElementsIn, null);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransitionCompat21.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */