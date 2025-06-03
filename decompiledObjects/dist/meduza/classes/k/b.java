package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import r.h;

public abstract class b
{
  public final Context a;
  public h<z.b, MenuItem> b;
  public h<z.c, SubMenu> c;
  
  public b(Context paramContext)
  {
    a = paramContext;
  }
  
  public final MenuItem c(MenuItem paramMenuItem)
  {
    if ((paramMenuItem instanceof z.b))
    {
      z.b localb = (z.b)paramMenuItem;
      if (b == null) {
        b = new h();
      }
      MenuItem localMenuItem = (MenuItem)b.getOrDefault(localb, null);
      paramMenuItem = localMenuItem;
      if (localMenuItem == null)
      {
        paramMenuItem = new c(a, localb);
        b.put(localb, paramMenuItem);
      }
      return paramMenuItem;
    }
    return paramMenuItem;
  }
  
  public final SubMenu d(SubMenu paramSubMenu)
  {
    if ((paramSubMenu instanceof z.c))
    {
      z.c localc = (z.c)paramSubMenu;
      if (c == null) {
        c = new h();
      }
      SubMenu localSubMenu = (SubMenu)c.getOrDefault(localc, null);
      paramSubMenu = localSubMenu;
      if (localSubMenu == null)
      {
        paramSubMenu = new g(a, localc);
        c.put(localc, paramSubMenu);
      }
      return paramSubMenu;
    }
    return paramSubMenu;
  }
}

/* Location:
 * Qualified Name:     k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */