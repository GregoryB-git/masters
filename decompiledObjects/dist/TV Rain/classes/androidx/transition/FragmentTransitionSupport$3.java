package androidx.transition;

import androidx.annotation.NonNull;
import java.util.ArrayList;

class FragmentTransitionSupport$3
  extends TransitionListenerAdapter
{
  public FragmentTransitionSupport$3(FragmentTransitionSupport paramFragmentTransitionSupport, Object paramObject1, ArrayList paramArrayList1, Object paramObject2, ArrayList paramArrayList2, Object paramObject3, ArrayList paramArrayList3) {}
  
  public void onTransitionEnd(@NonNull Transition paramTransition)
  {
    paramTransition.removeListener(this);
  }
  
  public void onTransitionStart(@NonNull Transition paramTransition)
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
 * Qualified Name:     androidx.transition.FragmentTransitionSupport.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */