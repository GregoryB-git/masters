package j;

import android.content.Context;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.menu.f;
import java.util.ArrayList;
import k.c;
import r.h;
import z.b;

public final class e$a
  implements a.a
{
  public final ActionMode.Callback a;
  public final Context b;
  public final ArrayList<e> c;
  public final h<Menu, Menu> d;
  
  public e$a(Context paramContext, ActionMode.Callback paramCallback)
  {
    b = paramContext;
    a = paramCallback;
    c = new ArrayList();
    d = new h();
  }
  
  public final boolean a(a parama, f paramf)
  {
    ActionMode.Callback localCallback = a;
    e locale = e(parama);
    Menu localMenu = (Menu)d.getOrDefault(paramf, null);
    parama = localMenu;
    if (localMenu == null)
    {
      parama = new k.e(b, paramf);
      d.put(paramf, parama);
    }
    return localCallback.onCreateActionMode(locale, parama);
  }
  
  public final void b(a parama)
  {
    a.onDestroyActionMode(e(parama));
  }
  
  public final boolean c(a parama, f paramf)
  {
    ActionMode.Callback localCallback = a;
    e locale = e(parama);
    Menu localMenu = (Menu)d.getOrDefault(paramf, null);
    parama = localMenu;
    if (localMenu == null)
    {
      parama = new k.e(b, paramf);
      d.put(paramf, parama);
    }
    return localCallback.onPrepareActionMode(locale, parama);
  }
  
  public final boolean d(a parama, MenuItem paramMenuItem)
  {
    return a.onActionItemClicked(e(parama), new c(b, (b)paramMenuItem));
  }
  
  public final e e(a parama)
  {
    int i = c.size();
    for (int j = 0; j < i; j++)
    {
      e locale = (e)c.get(j);
      if ((locale != null) && (b == parama)) {
        return locale;
      }
    }
    parama = new e(b, parama);
    c.add(parama);
    return parama;
  }
}

/* Location:
 * Qualified Name:     j.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */