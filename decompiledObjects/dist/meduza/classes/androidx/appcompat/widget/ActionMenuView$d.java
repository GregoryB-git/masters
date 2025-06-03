package androidx.appcompat.widget;

import android.view.MenuItem;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.f.a;
import e0.m;
import e0.o;
import g.u;
import g.u.b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class ActionMenuView$d
  implements f.a
{
  public ActionMenuView$d(ActionMenuView paramActionMenuView) {}
  
  public final boolean a(f paramf, MenuItem paramMenuItem)
  {
    paramf = a.I;
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramf != null)
    {
      paramf = (Toolbar.a)paramf;
      Iterator localIterator = a.O.b.iterator();
      while (localIterator.hasNext()) {
        if (((o)localIterator.next()).a(paramMenuItem))
        {
          i = 1;
          break label75;
        }
      }
      int i = 0;
      label75:
      boolean bool3;
      if (i != 0)
      {
        bool3 = true;
      }
      else
      {
        paramf = a.Q;
        if (paramf != null) {
          bool3 = a.b.onMenuItemSelected(0, paramMenuItem);
        } else {
          bool3 = false;
        }
      }
      bool2 = bool1;
      if (bool3) {
        bool2 = true;
      }
    }
    return bool2;
  }
  
  public final void b(f paramf)
  {
    f.a locala = a.D;
    if (locala != null) {
      locala.b(paramf);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionMenuView.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */