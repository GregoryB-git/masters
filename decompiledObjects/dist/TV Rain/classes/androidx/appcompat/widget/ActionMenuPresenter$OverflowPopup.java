package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.R.attr;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;

class ActionMenuPresenter$OverflowPopup
  extends MenuPopupHelper
{
  public ActionMenuPresenter$OverflowPopup(ActionMenuPresenter paramActionMenuPresenter, Context paramContext, MenuBuilder paramMenuBuilder, View paramView, boolean paramBoolean)
  {
    super(paramContext, paramMenuBuilder, paramView, paramBoolean, R.attr.actionOverflowMenuStyle);
    setGravity(8388613);
    setPresenterCallback(mPopupPresenterCallback);
  }
  
  public void onDismiss()
  {
    if (ActionMenuPresenter.access$000(this$0) != null) {
      ActionMenuPresenter.access$100(this$0).close();
    }
    this$0.mOverflowPopup = null;
    super.onDismiss();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuPresenter.OverflowPopup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */