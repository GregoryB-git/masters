package j;

import android.content.Context;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import java.util.ArrayList;
import k.c;
import r.h;
import z.b;

public final class e
  extends ActionMode
{
  public final Context a;
  public final a b;
  
  public e(Context paramContext, a parama)
  {
    a = paramContext;
    b = parama;
  }
  
  public final void finish()
  {
    b.c();
  }
  
  public final View getCustomView()
  {
    return b.d();
  }
  
  public final Menu getMenu()
  {
    return new k.e(a, b.e());
  }
  
  public final MenuInflater getMenuInflater()
  {
    return b.f();
  }
  
  public final CharSequence getSubtitle()
  {
    return b.g();
  }
  
  public final Object getTag()
  {
    return b.a;
  }
  
  public final CharSequence getTitle()
  {
    return b.h();
  }
  
  public final boolean getTitleOptionalHint()
  {
    return b.b;
  }
  
  public final void invalidate()
  {
    b.i();
  }
  
  public final boolean isTitleOptional()
  {
    return b.j();
  }
  
  public final void setCustomView(View paramView)
  {
    b.k(paramView);
  }
  
  public final void setSubtitle(int paramInt)
  {
    b.l(paramInt);
  }
  
  public final void setSubtitle(CharSequence paramCharSequence)
  {
    b.m(paramCharSequence);
  }
  
  public final void setTag(Object paramObject)
  {
    b.a = paramObject;
  }
  
  public final void setTitle(int paramInt)
  {
    b.n(paramInt);
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    b.o(paramCharSequence);
  }
  
  public final void setTitleOptionalHint(boolean paramBoolean)
  {
    b.p(paramBoolean);
  }
  
  public static final class a
    implements a.a
  {
    public final ActionMode.Callback a;
    public final Context b;
    public final ArrayList<e> c;
    public final h<Menu, Menu> d;
    
    public a(Context paramContext, ActionMode.Callback paramCallback)
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
}

/* Location:
 * Qualified Name:     j.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */