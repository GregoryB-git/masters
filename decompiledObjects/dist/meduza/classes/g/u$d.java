package g;

import android.view.MenuItem;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.f.a;
import androidx.appcompat.widget.d;

public final class u$d
  implements f.a
{
  public u$d(u paramu) {}
  
  public final boolean a(f paramf, MenuItem paramMenuItem)
  {
    return false;
  }
  
  public final void b(f paramf)
  {
    if (a.a.a()) {
      a.b.onPanelClosed(108, paramf);
    } else if (a.b.onPreparePanel(0, null, paramf)) {
      a.b.onMenuOpened(108, paramf);
    }
  }
}

/* Location:
 * Qualified Name:     g.u.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */