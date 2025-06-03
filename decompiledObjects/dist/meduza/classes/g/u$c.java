package g;

import android.view.Window.Callback;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j.a;
import androidx.appcompat.widget.d;

public final class u$c
  implements j.a
{
  public boolean a;
  
  public u$c(u paramu) {}
  
  public final void b(f paramf, boolean paramBoolean)
  {
    if (a) {
      return;
    }
    a = true;
    b.a.h();
    b.b.onPanelClosed(108, paramf);
    a = false;
  }
  
  public final boolean c(f paramf)
  {
    b.b.onMenuOpened(108, paramf);
    return true;
  }
}

/* Location:
 * Qualified Name:     g.u.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */