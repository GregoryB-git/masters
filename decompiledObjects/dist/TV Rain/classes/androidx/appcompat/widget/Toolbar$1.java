package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.core.view.MenuHostHelper;

class Toolbar$1
  implements ActionMenuView.OnMenuItemClickListener
{
  public Toolbar$1(Toolbar paramToolbar) {}
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    if (this$0.mMenuHostHelper.onMenuItemSelected(paramMenuItem)) {
      return true;
    }
    Toolbar.OnMenuItemClickListener localOnMenuItemClickListener = this$0.mOnMenuItemClickListener;
    if (localOnMenuItemClickListener != null) {
      return localOnMenuItemClickListener.onMenuItemClick(paramMenuItem);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */