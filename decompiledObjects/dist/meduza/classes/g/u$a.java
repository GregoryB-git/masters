package g;

import android.view.Menu;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.f;

public final class u$a
  implements Runnable
{
  public u$a(u paramu) {}
  
  public final void run()
  {
    u localu = a;
    Menu localMenu = localu.v();
    f localf;
    if ((localMenu instanceof f)) {
      localf = (f)localMenu;
    } else {
      localf = null;
    }
    if (localf != null) {
      localf.w();
    }
    try
    {
      localMenu.clear();
      if ((!b.onCreatePanelMenu(0, localMenu)) || (!b.onPreparePanel(0, null, localMenu))) {
        localMenu.clear();
      }
      return;
    }
    finally
    {
      if (localf != null) {
        localf.v();
      }
    }
  }
}

/* Location:
 * Qualified Name:     g.u.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */