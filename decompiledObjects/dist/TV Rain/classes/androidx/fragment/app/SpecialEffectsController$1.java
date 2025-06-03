package androidx.fragment.app;

import java.util.ArrayList;

class SpecialEffectsController$1
  implements Runnable
{
  public SpecialEffectsController$1(SpecialEffectsController paramSpecialEffectsController, SpecialEffectsController.FragmentStateManagerOperation paramFragmentStateManagerOperation) {}
  
  public void run()
  {
    if (this$0.mPendingOperations.contains(val$operation)) {
      val$operation.getFinalState().applyState(val$operation.getFragment().mView);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.SpecialEffectsController.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */