package g;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.d;
import j.a.a;
import j.e.a;
import j.h;
import java.util.List;

public final class g$k
  extends h
{
  public g.c b;
  public boolean c;
  public boolean d;
  public boolean e;
  
  public g$k(g paramg, Window.Callback paramCallback)
  {
    super(paramCallback);
  }
  
  public final void a(Window.Callback paramCallback)
  {
    try
    {
      c = true;
      paramCallback.onContentChanged();
      return;
    }
    finally
    {
      c = false;
    }
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if (d) {
      return a.dispatchKeyEvent(paramKeyEvent);
    }
    boolean bool;
    if ((!f.L(paramKeyEvent)) && (!super.dispatchKeyEvent(paramKeyEvent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public final boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    boolean bool1 = super.dispatchKeyShortcutEvent(paramKeyEvent);
    boolean bool2 = false;
    if (!bool1)
    {
      g localg = f;
      int i = paramKeyEvent.getKeyCode();
      localg.T();
      Object localObject = w;
      if ((localObject == null) || (!((a)localObject).k(i, paramKeyEvent)))
      {
        localObject = V;
        if ((localObject != null) && (localg.X((g.p)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent)))
        {
          paramKeyEvent = V;
          if (paramKeyEvent != null) {
            l = true;
          }
        }
        else
        {
          if (V != null) {
            break label154;
          }
          localObject = localg.R(0);
          localg.Y((g.p)localObject, paramKeyEvent);
          bool1 = localg.X((g.p)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent);
          k = false;
          if (!bool1) {
            break label154;
          }
        }
      }
      i = 1;
      break label157;
      label154:
      i = 0;
      label157:
      if (i == 0) {}
    }
    else
    {
      bool2 = true;
    }
    return bool2;
  }
  
  public final void onContentChanged()
  {
    if (c) {
      a.onContentChanged();
    }
  }
  
  public final boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if ((paramInt == 0) && (!(paramMenu instanceof f))) {
      return false;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public final View onCreatePanelView(int paramInt)
  {
    Object localObject = b;
    if (localObject != null)
    {
      localObject = (u.e)localObject;
      if (paramInt == 0) {
        localObject = new View(a.a.getContext());
      } else {
        localObject = null;
      }
      if (localObject != null) {
        return (View)localObject;
      }
    }
    return super.onCreatePanelView(paramInt);
  }
  
  public final boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    super.onMenuOpened(paramInt, paramMenu);
    paramMenu = f;
    if (paramInt == 108)
    {
      paramMenu.T();
      paramMenu = w;
      if (paramMenu != null) {
        paramMenu.c(true);
      }
    }
    else
    {
      paramMenu.getClass();
    }
    return true;
  }
  
  public final void onPanelClosed(int paramInt, Menu paramMenu)
  {
    if (e)
    {
      a.onPanelClosed(paramInt, paramMenu);
      return;
    }
    super.onPanelClosed(paramInt, paramMenu);
    paramMenu = f;
    if (paramInt == 108)
    {
      paramMenu.T();
      paramMenu = w;
      if (paramMenu != null) {
        paramMenu.c(false);
      }
    }
    else if (paramInt == 0)
    {
      g.p localp = paramMenu.R(paramInt);
      if (m) {
        paramMenu.J(localp, false);
      }
    }
    else
    {
      paramMenu.getClass();
    }
  }
  
  public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    f localf;
    if ((paramMenu instanceof f)) {
      localf = (f)paramMenu;
    } else {
      localf = null;
    }
    if ((paramInt == 0) && (localf == null)) {
      return false;
    }
    if (localf != null) {
      y = true;
    }
    Object localObject = b;
    if (localObject != null)
    {
      localObject = (u.e)localObject;
      if (paramInt == 0)
      {
        localObject = a;
        if (!d)
        {
          a.m = true;
          d = true;
        }
      }
    }
    boolean bool = super.onPreparePanel(paramInt, paramView, paramMenu);
    if (localf != null) {
      y = false;
    }
    return bool;
  }
  
  public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> paramList, Menu paramMenu, int paramInt)
  {
    f localf = f.R(0).h;
    if (localf != null) {
      super.onProvideKeyboardShortcuts(paramList, localf, paramInt);
    } else {
      super.onProvideKeyboardShortcuts(paramList, paramMenu, paramInt);
    }
  }
  
  public final ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public final ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
  {
    Object localObject = f;
    if ((H) && (paramInt == 0))
    {
      localObject = new e.a(s, paramCallback);
      paramCallback = f.D((a.a)localObject);
      if (paramCallback != null) {
        paramCallback = ((e.a)localObject).e(paramCallback);
      } else {
        paramCallback = null;
      }
      return paramCallback;
    }
    return super.onWindowStartingActionMode(paramCallback, paramInt);
  }
}

/* Location:
 * Qualified Name:     g.g.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */