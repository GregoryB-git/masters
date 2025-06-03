package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;

class FragmentTransition$4
  implements Runnable
{
  public FragmentTransition$4(Object paramObject1, FragmentTransitionImpl paramFragmentTransitionImpl, View paramView, Fragment paramFragment, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, Object paramObject2) {}
  
  public void run()
  {
    Object localObject = val$enterTransition;
    if (localObject != null)
    {
      val$impl.removeTarget(localObject, val$nonExistentView);
      localObject = FragmentTransition.configureEnteringExitingViews(val$impl, val$enterTransition, val$inFragment, val$sharedElementsIn, val$nonExistentView);
      val$enteringViews.addAll((Collection)localObject);
    }
    if (val$exitingViews != null)
    {
      if (val$exitTransition != null)
      {
        localObject = new ArrayList();
        ((ArrayList)localObject).add(val$nonExistentView);
        val$impl.replaceTargets(val$exitTransition, val$exitingViews, (ArrayList)localObject);
      }
      val$exitingViews.clear();
      val$exitingViews.add(val$nonExistentView);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransition.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */