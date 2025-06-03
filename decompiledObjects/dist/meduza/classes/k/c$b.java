package k;

import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.h.a;
import e0.b.a;

public final class c$b
  extends c.a
  implements ActionProvider.VisibilityListener
{
  public b.a d;
  
  public c$b(c paramc, ActionProvider paramActionProvider)
  {
    super(paramc, paramActionProvider);
  }
  
  public final boolean b()
  {
    return b.isVisible();
  }
  
  public final View d(MenuItem paramMenuItem)
  {
    return b.onCreateActionView(paramMenuItem);
  }
  
  public final boolean g()
  {
    return b.overridesItemVisibility();
  }
  
  public final void h(h.a parama)
  {
    d = parama;
    b.setVisibilityListener(this);
  }
  
  public final void onActionProviderVisibilityChanged(boolean paramBoolean)
  {
    Object localObject = d;
    if (localObject != null)
    {
      localObject = a.n;
      h = true;
      ((f)localObject).p(true);
    }
  }
}

/* Location:
 * Qualified Name:     k.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */