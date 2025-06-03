package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.R.attr;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.SubMenuBuilder;

class ActionMenuPresenter$ActionButtonSubmenu
  extends MenuPopupHelper
{
  public ActionMenuPresenter$ActionButtonSubmenu(ActionMenuPresenter paramActionMenuPresenter, Context paramContext, SubMenuBuilder paramSubMenuBuilder, View paramView)
  {
    super(paramContext, paramSubMenuBuilder, paramView, false, R.attr.actionOverflowMenuStyle);
    if (!((MenuItemImpl)paramSubMenuBuilder.getItem()).isActionButton())
    {
      paramSubMenuBuilder = mOverflowButton;
      paramContext = paramSubMenuBuilder;
      if (paramSubMenuBuilder == null) {
        paramContext = (View)ActionMenuPresenter.access$200(paramActionMenuPresenter);
      }
      setAnchorView(paramContext);
    }
    setPresenterCallback(mPopupPresenterCallback);
  }
  
  public void onDismiss()
  {
    ActionMenuPresenter localActionMenuPresenter = this$0;
    mActionButtonPopup = null;
    mOpenSubMenuId = 0;
    super.onDismiss();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuPresenter.ActionButtonSubmenu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */