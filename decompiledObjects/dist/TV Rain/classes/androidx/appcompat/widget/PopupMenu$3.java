package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

class PopupMenu$3
  extends ForwardingListener
{
  public PopupMenu$3(PopupMenu paramPopupMenu, View paramView)
  {
    super(paramView);
  }
  
  public ShowableListMenu getPopup()
  {
    return this$0.mPopup.getPopup();
  }
  
  public boolean onForwardingStarted()
  {
    this$0.show();
    return true;
  }
  
  public boolean onForwardingStopped()
  {
    this$0.dismiss();
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.PopupMenu.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */