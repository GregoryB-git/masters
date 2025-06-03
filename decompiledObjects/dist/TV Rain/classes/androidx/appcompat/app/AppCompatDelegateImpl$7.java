package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

class AppCompatDelegateImpl$7
  extends ViewPropertyAnimatorListenerAdapter
{
  public AppCompatDelegateImpl$7(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public void onAnimationEnd(View paramView)
  {
    this$0.mActionModeView.setAlpha(1.0F);
    this$0.mFadeAnim.setListener(null);
    this$0.mFadeAnim = null;
  }
  
  public void onAnimationStart(View paramView)
  {
    this$0.mActionModeView.setVisibility(0);
    if ((this$0.mActionModeView.getParent() instanceof View)) {
      ViewCompat.requestApplyInsets((View)this$0.mActionModeView.getParent());
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */