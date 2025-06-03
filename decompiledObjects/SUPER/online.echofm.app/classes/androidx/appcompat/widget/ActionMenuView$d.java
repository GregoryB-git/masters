package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.d.a;

public class ActionMenuView$d
  implements d.a
{
  public ActionMenuView$d(ActionMenuView paramActionMenuView) {}
  
  public boolean a(d paramd, MenuItem paramMenuItem)
  {
    paramd = a.O;
    boolean bool;
    if ((paramd != null) && (paramd.onMenuItemClick(paramMenuItem))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void b(d paramd)
  {
    d.a locala = a.J;
    if (locala != null) {
      locala.b(paramd);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuView.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */