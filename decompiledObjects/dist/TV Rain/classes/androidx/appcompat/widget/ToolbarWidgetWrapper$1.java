package androidx.appcompat.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.ActionMenuItem;

class ToolbarWidgetWrapper$1
  implements View.OnClickListener
{
  public final ActionMenuItem mNavItem;
  
  public ToolbarWidgetWrapper$1(ToolbarWidgetWrapper paramToolbarWidgetWrapper)
  {
    mNavItem = new ActionMenuItem(mToolbar.getContext(), 0, 16908332, 0, 0, mTitle);
  }
  
  public void onClick(View paramView)
  {
    paramView = this$0;
    Window.Callback localCallback = mWindowCallback;
    if ((localCallback != null) && (mMenuPrepared)) {
      localCallback.onMenuItemSelected(0, mNavItem);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ToolbarWidgetWrapper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */