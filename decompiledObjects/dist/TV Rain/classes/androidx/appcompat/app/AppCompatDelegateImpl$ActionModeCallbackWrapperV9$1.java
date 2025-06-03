package androidx.appcompat.app;

import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;

class AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1
  extends ViewPropertyAnimatorListenerAdapter
{
  public AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1(AppCompatDelegateImpl.ActionModeCallbackWrapperV9 paramActionModeCallbackWrapperV9) {}
  
  public void onAnimationEnd(View paramView)
  {
    this$1.this$0.mActionModeView.setVisibility(8);
    paramView = this$1.this$0;
    PopupWindow localPopupWindow = mActionModePopup;
    if (localPopupWindow != null) {
      localPopupWindow.dismiss();
    } else if ((mActionModeView.getParent() instanceof View)) {
      ViewCompat.requestApplyInsets((View)this$1.this$0.mActionModeView.getParent());
    }
    this$1.this$0.mActionModeView.killMode();
    this$1.this$0.mFadeAnim.setListener(null);
    paramView = this$1.this$0;
    mFadeAnim = null;
    ViewCompat.requestApplyInsets(mSubDecor);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.AppCompatDelegateImpl.ActionModeCallbackWrapperV9.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */