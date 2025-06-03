package androidx.appcompat.view.menu;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.List;
import l.J;

public class b$c
  implements J
{
  public b$c(b paramb) {}
  
  public void b(final d paramd, final MenuItem paramMenuItem)
  {
    Handler localHandler = o.u;
    final b.d locald = null;
    localHandler.removeCallbacksAndMessages(null);
    int i = o.w.size();
    for (int j = 0; j < i; j++) {
      if (paramd == o.w.get(j)).b) {
        break label76;
      }
    }
    j = -1;
    label76:
    if (j == -1) {
      return;
    }
    j++;
    if (j < o.w.size()) {
      locald = (b.d)o.w.get(j);
    }
    paramMenuItem = new a(locald, paramMenuItem, paramd);
    long l = SystemClock.uptimeMillis();
    o.u.postAtTime(paramMenuItem, paramd, l + 200L);
  }
  
  public void c(d paramd, MenuItem paramMenuItem)
  {
    o.u.removeCallbacksAndMessages(paramd);
  }
  
  public class a
    implements Runnable
  {
    public a(b.d paramd, MenuItem paramMenuItem, d paramd1) {}
    
    public void run()
    {
      b.d locald = locald;
      if (locald != null)
      {
        o.O = true;
        b.d(false);
        o.O = false;
      }
      if ((paramMenuItem.isEnabled()) && (paramMenuItem.hasSubMenu())) {
        paramd.H(paramMenuItem, 4);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */