package j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f.a;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class d
  extends a
  implements f.a
{
  public Context c;
  public ActionBarContextView d;
  public a.a e;
  public WeakReference<View> f;
  public boolean o;
  public androidx.appcompat.view.menu.f p;
  
  public d(Context paramContext, ActionBarContextView paramActionBarContextView, a.a parama)
  {
    c = paramContext;
    d = paramActionBarContextView;
    e = parama;
    paramContext = new androidx.appcompat.view.menu.f(paramActionBarContextView.getContext());
    l = 1;
    p = paramContext;
    e = this;
  }
  
  public final boolean a(androidx.appcompat.view.menu.f paramf, MenuItem paramMenuItem)
  {
    return e.d(this, paramMenuItem);
  }
  
  public final void b(androidx.appcompat.view.menu.f paramf)
  {
    i();
    paramf = d.d;
    if (paramf != null) {
      paramf.l();
    }
  }
  
  public final void c()
  {
    if (o) {
      return;
    }
    o = true;
    e.b(this);
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
    return p;
  }
  
  public final MenuInflater f()
  {
    return new f(d.getContext());
  }
  
  public final CharSequence g()
  {
    return d.getSubtitle();
  }
  
  public final CharSequence h()
  {
    return d.getTitle();
  }
  
  public final void i()
  {
    e.c(this, p);
  }
  
  public final boolean j()
  {
    return d.A;
  }
  
  public final void k(View paramView)
  {
    d.setCustomView(paramView);
    if (paramView != null) {
      paramView = new WeakReference(paramView);
    } else {
      paramView = null;
    }
    f = paramView;
  }
  
  public final void l(int paramInt)
  {
    m(c.getString(paramInt));
  }
  
  public final void m(CharSequence paramCharSequence)
  {
    d.setSubtitle(paramCharSequence);
  }
  
  public final void n(int paramInt)
  {
    o(c.getString(paramInt));
  }
  
  public final void o(CharSequence paramCharSequence)
  {
    d.setTitle(paramCharSequence);
  }
  
  public final void p(boolean paramBoolean)
  {
    b = paramBoolean;
    d.setTitleOptional(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     j.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */