package g;

import android.view.View;
import androidx.appcompat.widget.ActionBarContainer;
import e0.d0;
import e0.d0.c;
import e0.q0;
import j.a.a;

public final class x$a
  extends q0
{
  public x$a(x paramx)
  {
    super(0);
  }
  
  public final void c()
  {
    Object localObject1 = b;
    if (p)
    {
      localObject1 = g;
      if (localObject1 != null)
      {
        ((View)localObject1).setTranslationY(0.0F);
        b.d.setTranslationY(0.0F);
      }
    }
    b.d.setVisibility(8);
    b.d.setTransitioning(false);
    Object localObject2 = b;
    u = null;
    localObject1 = k;
    if (localObject1 != null)
    {
      ((a.a)localObject1).b(j);
      j = null;
      k = null;
    }
    localObject2 = b.c;
    if (localObject2 != null)
    {
      localObject1 = d0.a;
      d0.c.c((View)localObject2);
    }
  }
}

/* Location:
 * Qualified Name:     g.x.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */