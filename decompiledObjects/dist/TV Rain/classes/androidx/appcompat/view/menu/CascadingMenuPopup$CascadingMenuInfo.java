package androidx.appcompat.view.menu;

import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.appcompat.widget.MenuPopupWindow;

class CascadingMenuPopup$CascadingMenuInfo
{
  public final MenuBuilder menu;
  public final int position;
  public final MenuPopupWindow window;
  
  public CascadingMenuPopup$CascadingMenuInfo(@NonNull MenuPopupWindow paramMenuPopupWindow, @NonNull MenuBuilder paramMenuBuilder, int paramInt)
  {
    window = paramMenuPopupWindow;
    menu = paramMenuBuilder;
    position = paramInt;
  }
  
  public ListView getListView()
  {
    return window.getListView();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.CascadingMenuPopup.CascadingMenuInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */