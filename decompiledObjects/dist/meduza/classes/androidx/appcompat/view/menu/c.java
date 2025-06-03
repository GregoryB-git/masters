package androidx.appcompat.view.menu;

import android.view.MenuItem;

public final class c
  implements Runnable
{
  public c(b.c paramc, b.d paramd, h paramh, f paramf) {}
  
  public final void run()
  {
    b.d locald = a;
    if (locald != null)
    {
      d.a.I = true;
      b.c(false);
      d.a.I = false;
    }
    if ((b.isEnabled()) && (b.hasSubMenu())) {
      c.q(b, null, 4);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */