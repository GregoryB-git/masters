package g;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.f.a;
import androidx.appcompat.view.menu.j.a;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.h;
import androidx.appcompat.widget.d;
import e0.d0;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class u
  extends a
{
  public final d a;
  public final Window.Callback b;
  public final e c;
  public boolean d;
  public boolean e;
  public boolean f;
  public ArrayList<a.b> g = new ArrayList();
  public final a h = new a();
  
  public u(Toolbar paramToolbar, CharSequence paramCharSequence, g.k paramk)
  {
    b localb = new b();
    paramToolbar.getClass();
    d locald = new d(paramToolbar, false);
    a = locald;
    paramk.getClass();
    b = paramk;
    l = paramk;
    paramToolbar.setOnMenuItemClickListener(localb);
    locald.setWindowTitle(paramCharSequence);
    c = new e();
  }
  
  public final boolean a()
  {
    return a.f();
  }
  
  public final boolean b()
  {
    if (a.j())
    {
      a.collapseActionView();
      return true;
    }
    return false;
  }
  
  public final void c(boolean paramBoolean)
  {
    if (paramBoolean == f) {
      return;
    }
    f = paramBoolean;
    int i = g.size();
    for (int j = 0; j < i; j++) {
      ((a.b)g.get(j)).a();
    }
  }
  
  public final int d()
  {
    return a.b;
  }
  
  public final Context e()
  {
    return a.getContext();
  }
  
  public final void f()
  {
    a.p(8);
  }
  
  public final boolean g()
  {
    a.a.removeCallbacks(h);
    Toolbar localToolbar = a.a;
    a locala = h;
    WeakHashMap localWeakHashMap = d0.a;
    localToolbar.postOnAnimation(locala);
    return true;
  }
  
  public final boolean h()
  {
    boolean bool;
    if (a.a.getVisibility() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void i() {}
  
  public final void j()
  {
    a.a.removeCallbacks(h);
  }
  
  public final boolean k(int paramInt, KeyEvent paramKeyEvent)
  {
    Menu localMenu = v();
    if (localMenu != null)
    {
      if (paramKeyEvent != null) {
        i = paramKeyEvent.getDeviceId();
      } else {
        i = -1;
      }
      int i = KeyCharacterMap.load(i).getKeyboardType();
      boolean bool = true;
      if (i == 1) {
        bool = false;
      }
      localMenu.setQwertyMode(bool);
      return localMenu.performShortcut(paramInt, paramKeyEvent, 0);
    }
    return false;
  }
  
  public final boolean l(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 1) {
      m();
    }
    return true;
  }
  
  public final boolean m()
  {
    return a.g();
  }
  
  public final void n(ColorDrawable paramColorDrawable)
  {
    Toolbar localToolbar = a.a;
    WeakHashMap localWeakHashMap = d0.a;
    localToolbar.setBackground(paramColorDrawable);
  }
  
  public final void o(boolean paramBoolean) {}
  
  public final void p(boolean paramBoolean)
  {
    int i;
    if (paramBoolean) {
      i = 8;
    } else {
      i = 0;
    }
    d locald = a;
    locald.k(i & 0x8 | b & 0xFFFFFFF7);
  }
  
  public final void q(boolean paramBoolean) {}
  
  public final void r(CharSequence paramCharSequence)
  {
    a.setTitle(paramCharSequence);
  }
  
  public final void s(CharSequence paramCharSequence)
  {
    a.setWindowTitle(paramCharSequence);
  }
  
  public final void t()
  {
    a.p(0);
  }
  
  public final Menu v()
  {
    if (!e)
    {
      Object localObject = a;
      c localc = new c();
      d locald = new d();
      localObject = a;
      V = localc;
      W = locald;
      localObject = a;
      if (localObject != null)
      {
        C = localc;
        D = locald;
      }
      e = true;
    }
    return a.a.getMenu();
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      u localu = u.this;
      Menu localMenu = localu.v();
      f localf;
      if ((localMenu instanceof f)) {
        localf = (f)localMenu;
      } else {
        localf = null;
      }
      if (localf != null) {
        localf.w();
      }
      try
      {
        localMenu.clear();
        if ((!b.onCreatePanelMenu(0, localMenu)) || (!b.onPreparePanel(0, null, localMenu))) {
          localMenu.clear();
        }
        return;
      }
      finally
      {
        if (localf != null) {
          localf.v();
        }
      }
    }
  }
  
  public final class b
    implements Toolbar.h
  {
    public b() {}
  }
  
  public final class c
    implements j.a
  {
    public boolean a;
    
    public c() {}
    
    public final void b(f paramf, boolean paramBoolean)
    {
      if (a) {
        return;
      }
      a = true;
      a.h();
      b.onPanelClosed(108, paramf);
      a = false;
    }
    
    public final boolean c(f paramf)
    {
      b.onMenuOpened(108, paramf);
      return true;
    }
  }
  
  public final class d
    implements f.a
  {
    public d() {}
    
    public final boolean a(f paramf, MenuItem paramMenuItem)
    {
      return false;
    }
    
    public final void b(f paramf)
    {
      if (a.a()) {
        b.onPanelClosed(108, paramf);
      } else if (b.onPreparePanel(0, null, paramf)) {
        b.onMenuOpened(108, paramf);
      }
    }
  }
  
  public final class e
    implements g.c
  {
    public e() {}
  }
}

/* Location:
 * Qualified Name:     g.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */