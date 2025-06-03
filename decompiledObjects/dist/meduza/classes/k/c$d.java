package k;

import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;

public final class c$d
  implements MenuItem.OnActionExpandListener
{
  public final MenuItem.OnActionExpandListener a;
  
  public c$d(c paramc, MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    a = paramOnActionExpandListener;
  }
  
  public final boolean onMenuItemActionCollapse(MenuItem paramMenuItem)
  {
    return a.onMenuItemActionCollapse(b.c(paramMenuItem));
  }
  
  public final boolean onMenuItemActionExpand(MenuItem paramMenuItem)
  {
    return a.onMenuItemActionExpand(b.c(paramMenuItem));
  }
}

/* Location:
 * Qualified Name:     k.c.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */