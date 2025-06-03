package androidx.fragment.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import java.util.ArrayList;

public class x$c
  implements Transition.TransitionListener
{
  public x$c(x paramx, Object paramObject1, ArrayList paramArrayList1, Object paramObject2, ArrayList paramArrayList2, Object paramObject3, ArrayList paramArrayList3) {}
  
  public void onTransitionCancel(Transition paramTransition) {}
  
  public void onTransitionEnd(Transition paramTransition)
  {
    paramTransition.removeListener(this);
  }
  
  public void onTransitionPause(Transition paramTransition) {}
  
  public void onTransitionResume(Transition paramTransition) {}
  
  public void onTransitionStart(Transition paramTransition)
  {
    paramTransition = a;
    if (paramTransition != null) {
      g.q(paramTransition, b, null);
    }
    paramTransition = c;
    if (paramTransition != null) {
      g.q(paramTransition, d, null);
    }
    paramTransition = e;
    if (paramTransition != null) {
      g.q(paramTransition, f, null);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.x.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */