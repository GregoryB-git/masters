package g;

import android.view.Window.Callback;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j.a;

public final class g$d
  implements j.a
{
  public g$d(g paramg) {}
  
  public final void b(f paramf, boolean paramBoolean)
  {
    a.I(paramf);
  }
  
  public final boolean c(f paramf)
  {
    Window.Callback localCallback = a.S();
    if (localCallback != null) {
      localCallback.onMenuOpened(108, paramf);
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     g.g.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */