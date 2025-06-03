package androidx.fragment.app;

import androidx.collection.ArrayMap;

class DefaultSpecialEffectsController$6
  implements Runnable
{
  public DefaultSpecialEffectsController$6(DefaultSpecialEffectsController paramDefaultSpecialEffectsController, SpecialEffectsController.Operation paramOperation1, SpecialEffectsController.Operation paramOperation2, boolean paramBoolean, ArrayMap paramArrayMap) {}
  
  public void run()
  {
    FragmentTransition.callSharedElementStartEnd(val$lastIn.getFragment(), val$firstOut.getFragment(), val$isPop, val$lastInViews, false);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */