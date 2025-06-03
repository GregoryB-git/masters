package k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import r.h;
import z.a;

public class e
  extends b
  implements Menu
{
  public final a d;
  
  public e(Context paramContext, a parama)
  {
    super(paramContext);
    if (parama != null)
    {
      d = parama;
      return;
    }
    throw new IllegalArgumentException("Wrapped Object can not be null.");
  }
  
  public final MenuItem add(int paramInt)
  {
    return c(d.add(paramInt));
  }
  
  public final MenuItem add(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return c(d.add(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public final MenuItem add(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return c(d.add(paramInt1, paramInt2, paramInt3, paramCharSequence));
  }
  
  public final MenuItem add(CharSequence paramCharSequence)
  {
    return c(d.add(paramCharSequence));
  }
  
  public final int addIntentOptions(int paramInt1, int paramInt2, int paramInt3, ComponentName paramComponentName, Intent[] paramArrayOfIntent, Intent paramIntent, int paramInt4, MenuItem[] paramArrayOfMenuItem)
  {
    MenuItem[] arrayOfMenuItem;
    if (paramArrayOfMenuItem != null) {
      arrayOfMenuItem = new MenuItem[paramArrayOfMenuItem.length];
    } else {
      arrayOfMenuItem = null;
    }
    paramInt3 = d.addIntentOptions(paramInt1, paramInt2, paramInt3, paramComponentName, paramArrayOfIntent, paramIntent, paramInt4, arrayOfMenuItem);
    if (arrayOfMenuItem != null)
    {
      paramInt1 = 0;
      paramInt2 = arrayOfMenuItem.length;
      while (paramInt1 < paramInt2)
      {
        paramArrayOfMenuItem[paramInt1] = c(arrayOfMenuItem[paramInt1]);
        paramInt1++;
      }
    }
    return paramInt3;
  }
  
  public final SubMenu addSubMenu(int paramInt)
  {
    return d(d.addSubMenu(paramInt));
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return d(d.addSubMenu(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public final SubMenu addSubMenu(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence)
  {
    return d(d.addSubMenu(paramInt1, paramInt2, paramInt3, paramCharSequence));
  }
  
  public final SubMenu addSubMenu(CharSequence paramCharSequence)
  {
    return d(d.addSubMenu(paramCharSequence));
  }
  
  public final void clear()
  {
    h localh = b;
    if (localh != null) {
      localh.clear();
    }
    localh = c;
    if (localh != null) {
      localh.clear();
    }
    d.clear();
  }
  
  public final void close()
  {
    d.close();
  }
  
  public final MenuItem findItem(int paramInt)
  {
    return c(d.findItem(paramInt));
  }
  
  public final MenuItem getItem(int paramInt)
  {
    return c(d.getItem(paramInt));
  }
  
  public final boolean hasVisibleItems()
  {
    return d.hasVisibleItems();
  }
  
  public final boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent)
  {
    return d.isShortcutKey(paramInt, paramKeyEvent);
  }
  
  public final boolean performIdentifierAction(int paramInt1, int paramInt2)
  {
    return d.performIdentifierAction(paramInt1, paramInt2);
  }
  
  public final boolean performShortcut(int paramInt1, KeyEvent paramKeyEvent, int paramInt2)
  {
    return d.performShortcut(paramInt1, paramKeyEvent, paramInt2);
  }
  
  public final void removeGroup(int paramInt)
  {
    if (b != null)
    {
      int j;
      for (int i = 0;; i = j + 1)
      {
        h localh = b;
        if (i >= c) {
          break;
        }
        j = i;
        if (((z.b)localh.i(i)).getGroupId() == paramInt)
        {
          b.j(i);
          j = i - 1;
        }
      }
    }
    d.removeGroup(paramInt);
  }
  
  public final void removeItem(int paramInt)
  {
    if (b != null) {
      for (int i = 0;; i++)
      {
        h localh = b;
        if (i >= c) {
          break;
        }
        if (((z.b)localh.i(i)).getItemId() == paramInt)
        {
          b.j(i);
          break;
        }
      }
    }
    d.removeItem(paramInt);
  }
  
  public final void setGroupCheckable(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    d.setGroupCheckable(paramInt, paramBoolean1, paramBoolean2);
  }
  
  public final void setGroupEnabled(int paramInt, boolean paramBoolean)
  {
    d.setGroupEnabled(paramInt, paramBoolean);
  }
  
  public final void setGroupVisible(int paramInt, boolean paramBoolean)
  {
    d.setGroupVisible(paramInt, paramBoolean);
  }
  
  public final void setQwertyMode(boolean paramBoolean)
  {
    d.setQwertyMode(paramBoolean);
  }
  
  public final int size()
  {
    return d.size();
  }
}

/* Location:
 * Qualified Name:     k.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */