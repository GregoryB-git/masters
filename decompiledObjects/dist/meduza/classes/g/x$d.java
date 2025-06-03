package g;

import android.content.Context;
import android.content.res.Resources;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f.a;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import j.a.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class x$d
  extends j.a
  implements f.a
{
  public final Context c;
  public final androidx.appcompat.view.menu.f d;
  public a.a e;
  public WeakReference<View> f;
  
  public x$d(x paramx, Context paramContext, g.e parame)
  {
    c = paramContext;
    e = parame;
    paramx = new androidx.appcompat.view.menu.f(paramContext);
    l = 1;
    d = paramx;
    e = this;
  }
  
  public final boolean a(androidx.appcompat.view.menu.f paramf, MenuItem paramMenuItem)
  {
    paramf = e;
    if (paramf != null) {
      return paramf.d(this, paramMenuItem);
    }
    return false;
  }
  
  public final void b(androidx.appcompat.view.menu.f paramf)
  {
    if (e == null) {
      return;
    }
    i();
    paramf = o.f.d;
    if (paramf != null) {
      paramf.l();
    }
  }
  
  public final void c()
  {
    Object localObject = o;
    if (i != this) {
      return;
    }
    boolean bool1 = q;
    boolean bool2 = r;
    int i = 1;
    if ((bool1) || (bool2)) {
      i = 0;
    }
    if (i == 0)
    {
      j = this;
      k = e;
    }
    else
    {
      e.b(this);
    }
    e = null;
    o.v(false);
    localObject = o.f;
    if (s == null) {
      ((ActionBarContextView)localObject).h();
    }
    localObject = o;
    c.setHideOnContentScrollEnabled(w);
    o.i = null;
  }
  
  public final View d()
  {
    Object localObject = f;
    if (localObject != null) {
      localObject = (View)((Reference)localObject).get();
    } else {
      localObject = null;
    }
    return (View)localObject;
  }
  
  public final androidx.appcompat.view.menu.f e()
  {
    return d;
  }
  
  public final MenuInflater f()
  {
    return new j.f(c);
  }
  
  public final CharSequence g()
  {
    return o.f.getSubtitle();
  }
  
  public final CharSequence h()
  {
    return o.f.getTitle();
  }
  
  public final void i()
  {
    if (o.i != this) {
      return;
    }
    d.w();
    try
    {
      e.c(this, d);
      return;
    }
    finally
    {
      d.v();
    }
  }
  
  public final boolean j()
  {
    return o.f.A;
  }
  
  public final void k(View paramView)
  {
    o.f.setCustomView(paramView);
    f = new WeakReference(paramView);
  }
  
  public final void l(int paramInt)
  {
    m(o.a.getResources().getString(paramInt));
  }
  
  public final void m(CharSequence paramCharSequence)
  {
    o.f.setSubtitle(paramCharSequence);
  }
  
  public final void n(int paramInt)
  {
    o(o.a.getResources().getString(paramInt));
  }
  
  public final void o(CharSequence paramCharSequence)
  {
    o.f.setTitle(paramCharSequence);
  }
  
  public final void p(boolean paramBoolean)
  {
    b = paramBoolean;
    o.f.setTitleOptional(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     g.x.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */