package androidx.appcompat.view.menu;

import android.widget.ListView;
import androidx.annotation.RestrictTo;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract interface ShowableListMenu
{
  public abstract void dismiss();
  
  public abstract ListView getListView();
  
  public abstract boolean isShowing();
  
  public abstract void show();
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.ShowableListMenu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */