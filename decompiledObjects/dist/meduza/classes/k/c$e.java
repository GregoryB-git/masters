package k;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

public final class c$e
  implements MenuItem.OnMenuItemClickListener
{
  public final MenuItem.OnMenuItemClickListener a;
  
  public c$e(c paramc, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    a = paramOnMenuItemClickListener;
  }
  
  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    return a.onMenuItemClick(b.c(paramMenuItem));
  }
}

/* Location:
 * Qualified Name:     k.c.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */