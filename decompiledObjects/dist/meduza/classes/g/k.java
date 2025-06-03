package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import e0.d0;
import e0.d0.c;
import e0.o0;
import e0.q0;
import java.util.WeakHashMap;

public final class k
  extends q0
{
  public k(g paramg)
  {
    super(0);
  }
  
  public final void b()
  {
    b.D.setVisibility(0);
    if ((b.D.getParent() instanceof View))
    {
      View localView = (View)b.D.getParent();
      WeakHashMap localWeakHashMap = d0.a;
      d0.c.c(localView);
    }
  }
  
  public final void c()
  {
    b.D.setAlpha(1.0F);
    b.G.d(null);
    b.G = null;
  }
}

/* Location:
 * Qualified Name:     g.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */