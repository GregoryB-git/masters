package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.os.CancellationSignal;

class SpecialEffectsController$FragmentStateManagerOperation
  extends SpecialEffectsController.Operation
{
  @NonNull
  private final FragmentStateManager mFragmentStateManager;
  
  public SpecialEffectsController$FragmentStateManagerOperation(@NonNull SpecialEffectsController.Operation.State paramState, @NonNull SpecialEffectsController.Operation.LifecycleImpact paramLifecycleImpact, @NonNull FragmentStateManager paramFragmentStateManager, @NonNull CancellationSignal paramCancellationSignal)
  {
    super(paramState, paramLifecycleImpact, paramFragmentStateManager.getFragment(), paramCancellationSignal);
    mFragmentStateManager = paramFragmentStateManager;
  }
  
  public void complete()
  {
    super.complete();
    mFragmentStateManager.moveToExpectedState();
  }
  
  public void onStart()
  {
    if (getLifecycleImpact() == SpecialEffectsController.Operation.LifecycleImpact.ADDING)
    {
      Fragment localFragment = mFragmentStateManager.getFragment();
      View localView = mView.findFocus();
      if (localView != null)
      {
        localFragment.setFocusedView(localView);
        if (FragmentManager.isLoggingEnabled(2))
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("requestFocus: Saved focused view ");
          ((StringBuilder)localObject).append(localView);
          ((StringBuilder)localObject).append(" for Fragment ");
          ((StringBuilder)localObject).append(localFragment);
          Log.v("FragmentManager", ((StringBuilder)localObject).toString());
        }
      }
      Object localObject = getFragment().requireView();
      if (((View)localObject).getParent() == null)
      {
        mFragmentStateManager.addViewToContainer();
        ((View)localObject).setAlpha(0.0F);
      }
      if ((((View)localObject).getAlpha() == 0.0F) && (((View)localObject).getVisibility() == 0)) {
        ((View)localObject).setVisibility(4);
      }
      ((View)localObject).setAlpha(localFragment.getPostOnViewCreatedAlpha());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.SpecialEffectsController.FragmentStateManagerOperation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */