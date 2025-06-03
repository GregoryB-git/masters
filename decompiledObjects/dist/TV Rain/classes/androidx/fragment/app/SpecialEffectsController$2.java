package androidx.fragment.app;

import java.util.ArrayList;

class SpecialEffectsController$2
  implements Runnable
{
  public SpecialEffectsController$2(SpecialEffectsController paramSpecialEffectsController, SpecialEffectsController.FragmentStateManagerOperation paramFragmentStateManagerOperation) {}
  
  public void run()
  {
    this$0.mPendingOperations.remove(val$operation);
    this$0.mRunningOperations.remove(val$operation);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.SpecialEffectsController.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */