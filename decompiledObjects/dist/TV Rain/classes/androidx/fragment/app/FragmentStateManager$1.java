package androidx.fragment.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import androidx.core.view.ViewCompat;

class FragmentStateManager$1
  implements View.OnAttachStateChangeListener
{
  public FragmentStateManager$1(FragmentStateManager paramFragmentStateManager, View paramView) {}
  
  public void onViewAttachedToWindow(View paramView)
  {
    val$fragmentView.removeOnAttachStateChangeListener(this);
    ViewCompat.requestApplyInsets(val$fragmentView);
  }
  
  public void onViewDetachedFromWindow(View paramView) {}
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentStateManager.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */