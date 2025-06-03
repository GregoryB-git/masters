package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.core.os.CancellationSignal;

class DefaultSpecialEffectsController$SpecialEffectsInfo
{
  @NonNull
  private final SpecialEffectsController.Operation mOperation;
  @NonNull
  private final CancellationSignal mSignal;
  
  public DefaultSpecialEffectsController$SpecialEffectsInfo(@NonNull SpecialEffectsController.Operation paramOperation, @NonNull CancellationSignal paramCancellationSignal)
  {
    mOperation = paramOperation;
    mSignal = paramCancellationSignal;
  }
  
  public void completeSpecialEffect()
  {
    mOperation.completeSpecialEffect(mSignal);
  }
  
  @NonNull
  public SpecialEffectsController.Operation getOperation()
  {
    return mOperation;
  }
  
  @NonNull
  public CancellationSignal getSignal()
  {
    return mSignal;
  }
  
  public boolean isVisibilityUnchanged()
  {
    SpecialEffectsController.Operation.State localState1 = SpecialEffectsController.Operation.State.from(mOperation.getFragment().mView);
    SpecialEffectsController.Operation.State localState2 = mOperation.getFinalState();
    if (localState1 != localState2)
    {
      SpecialEffectsController.Operation.State localState3 = SpecialEffectsController.Operation.State.VISIBLE;
      if ((localState1 == localState3) || (localState2 == localState3))
      {
        bool = false;
        break label53;
      }
    }
    boolean bool = true;
    label53:
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController.SpecialEffectsInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */