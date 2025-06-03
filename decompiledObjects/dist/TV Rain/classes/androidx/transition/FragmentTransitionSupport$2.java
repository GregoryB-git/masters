package androidx.transition;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;

class FragmentTransitionSupport$2
  implements Transition.TransitionListener
{
  public FragmentTransitionSupport$2(FragmentTransitionSupport paramFragmentTransitionSupport, View paramView, ArrayList paramArrayList) {}
  
  public void onTransitionCancel(@NonNull Transition paramTransition) {}
  
  public void onTransitionEnd(@NonNull Transition paramTransition)
  {
    paramTransition.removeListener(this);
    val$fragmentView.setVisibility(8);
    int i = val$exitingViews.size();
    for (int j = 0; j < i; j++) {
      ((View)val$exitingViews.get(j)).setVisibility(0);
    }
  }
  
  public void onTransitionPause(@NonNull Transition paramTransition) {}
  
  public void onTransitionResume(@NonNull Transition paramTransition) {}
  
  public void onTransitionStart(@NonNull Transition paramTransition) {}
}

/* Location:
 * Qualified Name:     androidx.transition.FragmentTransitionSupport.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */