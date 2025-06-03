package x0;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.view.View;
import java.util.ArrayList;

public final class j0$a
  implements Transition.TransitionListener
{
  public j0$a(View paramView, ArrayList paramArrayList) {}
  
  public final void onTransitionCancel(Transition paramTransition) {}
  
  public final void onTransitionEnd(Transition paramTransition)
  {
    paramTransition.removeListener(this);
    a.setVisibility(8);
    int i = b.size();
    for (int j = 0; j < i; j++) {
      ((View)b.get(j)).setVisibility(0);
    }
  }
  
  public final void onTransitionPause(Transition paramTransition) {}
  
  public final void onTransitionResume(Transition paramTransition) {}
  
  public final void onTransitionStart(Transition paramTransition)
  {
    paramTransition.removeListener(this);
    paramTransition.addListener(this);
  }
}

/* Location:
 * Qualified Name:     x0.j0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */