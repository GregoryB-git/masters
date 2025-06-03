package androidx.appcompat.app;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

class AppCompatDelegateImpl$ActionModeCallbackWrapperV9
  implements ActionMode.Callback
{
  private ActionMode.Callback mWrapped;
  
  public AppCompatDelegateImpl$ActionModeCallbackWrapperV9(AppCompatDelegateImpl paramAppCompatDelegateImpl, ActionMode.Callback paramCallback)
  {
    mWrapped = paramCallback;
  }
  
  public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return mWrapped.onActionItemClicked(paramActionMode, paramMenuItem);
  }
  
  public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return mWrapped.onCreateActionMode(paramActionMode, paramMenu);
  }
  
  public void onDestroyActionMode(ActionMode paramActionMode)
  {
    mWrapped.onDestroyActionMode(paramActionMode);
    paramActionMode = this$0;
    if (mActionModePopup != null) {
      mWindow.getDecorView().removeCallbacks(this$0.mShowActionModePopup);
    }
    paramActionMode = this$0;
    if (mActionModeView != null)
    {
      paramActionMode.endOnGoingFadeAnimation();
      paramActionMode = this$0;
      mFadeAnim = ViewCompat.animate(mActionModeView).alpha(0.0F);
      this$0.mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter()
      {
        public void onAnimationEnd(View paramAnonymousView)
        {
          this$0.mActionModeView.setVisibility(8);
          paramAnonymousView = this$0;
          PopupWindow localPopupWindow = mActionModePopup;
          if (localPopupWindow != null) {
            localPopupWindow.dismiss();
          } else if ((mActionModeView.getParent() instanceof View)) {
            ViewCompat.requestApplyInsets((View)this$0.mActionModeView.getParent());
          }
          this$0.mActionModeView.killMode();
          this$0.mFadeAnim.setListener(null);
          paramAnonymousView = this$0;
          mFadeAnim = null;
          ViewCompat.requestApplyInsets(mSubDecor);
        }
      });
    }
    paramActionMode = this$0;
    AppCompatCallback localAppCompatCallback = mAppCompatCallback;
    if (localAppCompatCallback != null) {
      localAppCompatCallback.onSupportActionModeFinished(mActionMode);
    }
    paramActionMode = this$0;
    mActionMode = null;
    ViewCompat.requestApplyInsets(mSubDecor);
  }
  
  public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    ViewCompat.requestApplyInsets(this$0.mSubDecor);
    return mWrapped.onPrepareActionMode(paramActionMode, paramMenu);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */