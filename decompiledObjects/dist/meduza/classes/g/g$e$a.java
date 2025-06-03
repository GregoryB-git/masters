package g;

import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import e0.d0;
import e0.d0.c;
import e0.o0;
import e0.q0;

public final class g$e$a
  extends q0
{
  public g$e$a(g.e parame)
  {
    super(0);
  }
  
  public final void c()
  {
    b.b.D.setVisibility(8);
    Object localObject1 = b.b;
    Object localObject2 = E;
    if (localObject2 != null)
    {
      ((PopupWindow)localObject2).dismiss();
    }
    else if ((D.getParent() instanceof View))
    {
      localObject2 = (View)b.b.D.getParent();
      localObject1 = d0.a;
      d0.c.c((View)localObject2);
    }
    b.b.D.h();
    b.b.G.d(null);
    localObject2 = b.b;
    G = null;
    localObject2 = J;
    localObject1 = d0.a;
    d0.c.c((View)localObject2);
  }
}

/* Location:
 * Qualified Name:     g.g.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */