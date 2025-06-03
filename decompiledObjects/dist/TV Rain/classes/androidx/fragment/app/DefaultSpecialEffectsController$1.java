package androidx.fragment.app;

import java.util.List;

class DefaultSpecialEffectsController$1
  implements Runnable
{
  public DefaultSpecialEffectsController$1(DefaultSpecialEffectsController paramDefaultSpecialEffectsController, List paramList, SpecialEffectsController.Operation paramOperation) {}
  
  public void run()
  {
    if (val$awaitingContainerChanges.contains(val$operation))
    {
      val$awaitingContainerChanges.remove(val$operation);
      this$0.applyContainerChanges(val$operation);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */