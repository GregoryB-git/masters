package x0;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import java.util.ArrayList;

public final class k0
  implements Transition.TransitionListener
{
  public k0(j0 paramj0, Object paramObject1, ArrayList paramArrayList1, Object paramObject2, ArrayList paramArrayList2) {}
  
  public final void onTransitionCancel(Transition paramTransition) {}
  
  public final void onTransitionEnd(Transition paramTransition)
  {
    paramTransition.removeListener(this);
  }
  
  public final void onTransitionPause(Transition paramTransition) {}
  
  public final void onTransitionResume(Transition paramTransition) {}
  
  public final void onTransitionStart(Transition paramTransition)
  {
    Object localObject1 = a;
    Object localObject2;
    if (localObject1 != null)
    {
      paramTransition = g;
      localObject2 = b;
      paramTransition.getClass();
      j0.t(localObject1, (ArrayList)localObject2, null);
    }
    paramTransition = c;
    if (paramTransition != null)
    {
      localObject1 = g;
      localObject2 = d;
      localObject1.getClass();
      j0.t(paramTransition, (ArrayList)localObject2, null);
    }
    paramTransition = e;
    if (paramTransition != null)
    {
      localObject2 = g;
      localObject1 = f;
      localObject2.getClass();
      j0.t(paramTransition, (ArrayList)localObject1, null);
    }
  }
}

/* Location:
 * Qualified Name:     x0.k0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */