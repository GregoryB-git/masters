package androidx.appcompat.view.menu;

import android.view.MenuItem;

public class b$c$a
  implements Runnable
{
  public b$c$a(b.c paramc, b.d paramd, MenuItem paramMenuItem, d paramd1) {}
  
  public void run()
  {
    b.d locald = o;
    if (locald != null)
    {
      r.o.O = true;
      b.d(false);
      r.o.O = false;
    }
    if ((p.isEnabled()) && (p.hasSubMenu())) {
      q.H(p, 4);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.b.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */