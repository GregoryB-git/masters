package g;

import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import e0.d0;
import e0.d0.c;
import e0.o0;
import e0.q0;
import j.a;
import j.a.a;
import java.util.WeakHashMap;

public final class g$e
  implements a.a
{
  public a.a a;
  
  public g$e(g paramg, a.a parama)
  {
    a = parama;
  }
  
  public final boolean a(a parama, f paramf)
  {
    return a.a(parama, paramf);
  }
  
  public final void b(a parama)
  {
    a.b(parama);
    parama = b;
    if (E != null) {
      t.getDecorView().removeCallbacks(b.F);
    }
    parama = b;
    if (D != null)
    {
      parama = G;
      if (parama != null) {
        parama.b();
      }
      localObject = b;
      parama = d0.a(D);
      parama.a(0.0F);
      G = parama;
      b.G.d(new a());
    }
    Object localObject = b;
    parama = v;
    if (parama != null) {
      parama.onSupportActionModeFinished(C);
    }
    parama = b;
    C = null;
    localObject = J;
    parama = d0.a;
    d0.c.c((View)localObject);
    b.a0();
  }
  
  public final boolean c(a parama, f paramf)
  {
    ViewGroup localViewGroup = b.J;
    WeakHashMap localWeakHashMap = d0.a;
    d0.c.c(localViewGroup);
    return a.c(parama, paramf);
  }
  
  public final boolean d(a parama, MenuItem paramMenuItem)
  {
    return a.d(parama, paramMenuItem);
  }
  
  public final class a
    extends q0
  {
    public a()
    {
      super();
    }
    
    public final void c()
    {
      b.D.setVisibility(8);
      Object localObject1 = b;
      Object localObject2 = E;
      if (localObject2 != null)
      {
        ((PopupWindow)localObject2).dismiss();
      }
      else if ((D.getParent() instanceof View))
      {
        localObject2 = (View)b.D.getParent();
        localObject1 = d0.a;
        d0.c.c((View)localObject2);
      }
      b.D.h();
      b.G.d(null);
      localObject2 = b;
      G = null;
      localObject2 = J;
      localObject1 = d0.a;
      d0.c.c((View)localObject2);
    }
  }
}

/* Location:
 * Qualified Name:     g.g.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */