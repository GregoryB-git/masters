package androidx.fragment.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.view.View;
import java.util.ArrayList;

public class x$b
  implements Transition.TransitionListener
{
  public x$b(x paramx, View paramView, ArrayList paramArrayList) {}
  
  public void onTransitionCancel(Transition paramTransition) {}
  
  public void onTransitionEnd(Transition paramTransition)
  {
    paramTransition.removeListener(this);
    a.setVisibility(8);
    int i = b.size();
    for (int j = 0; j < i; j++) {
      ((View)b.get(j)).setVisibility(0);
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
 * Qualified Name:     androidx.fragment.app.x.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */