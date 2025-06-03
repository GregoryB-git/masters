package androidx.appcompat.app;

import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

class AppCompatDelegateImpl$6
  implements Runnable
{
  public AppCompatDelegateImpl$6(AppCompatDelegateImpl paramAppCompatDelegateImpl) {}
  
  public void run()
  {
    AppCompatDelegateImpl localAppCompatDelegateImpl = this$0;
    mActionModePopup.showAtLocation(mActionModeView, 55, 0, 0);
    this$0.endOnGoingFadeAnimation();
    if (this$0.shouldAnimateActionModeView())
    {
      this$0.mActionModeView.setAlpha(0.0F);
      localAppCompatDelegateImpl = this$0;
      mFadeAnim = ViewCompat.animate(mActionModeView).alpha(1.0F);
      this$0.mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter()
      {
        public void onAnimationEnd(View paramAnonymousView)
        {
          this$0.mActionModeView.setAlpha(1.0F);
          this$0.mFadeAnim.setListener(null);
          this$0.mFadeAnim = null;
        }
        
        public void onAnimationStart(View paramAnonymousView)
        {
          this$0.mActionModeView.setVisibility(0);
        }
      });
    }
    else
    {
      this$0.mActionModeView.setAlpha(1.0F);
      this$0.mActionModeView.setVisibility(0);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */