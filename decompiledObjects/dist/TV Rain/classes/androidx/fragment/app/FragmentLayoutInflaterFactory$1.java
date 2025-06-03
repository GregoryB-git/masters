package androidx.fragment.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;

class FragmentLayoutInflaterFactory$1
  implements View.OnAttachStateChangeListener
{
  public FragmentLayoutInflaterFactory$1(FragmentLayoutInflaterFactory paramFragmentLayoutInflaterFactory, FragmentStateManager paramFragmentStateManager) {}
  
  public void onViewAttachedToWindow(View paramView)
  {
    paramView = val$fragmentStateManager.getFragment();
    val$fragmentStateManager.moveToExpectedState();
    SpecialEffectsController.getOrCreateController((ViewGroup)mView.getParent(), this$0.mFragmentManager).forceCompleteAllOperations();
  }
  
  public void onViewDetachedFromWindow(View paramView) {}
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentLayoutInflaterFactory.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */