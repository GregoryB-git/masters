package g;

import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import e0.d0;
import e0.o0;
import e0.q0;

public final class j
  implements Runnable
{
  public j(g paramg) {}
  
  public final void run()
  {
    Object localObject1 = a;
    E.showAtLocation(D, 55, 0, 0);
    localObject1 = a.G;
    if (localObject1 != null) {
      ((o0)localObject1).b();
    }
    localObject1 = a;
    Object localObject2;
    if (I)
    {
      localObject1 = J;
      if (localObject1 != null)
      {
        localObject2 = d0.a;
        if (((View)localObject1).isLaidOut())
        {
          i = 1;
          break label75;
        }
      }
    }
    int i = 0;
    label75:
    if (i != 0)
    {
      a.D.setAlpha(0.0F);
      localObject1 = a;
      localObject2 = d0.a(D);
      ((o0)localObject2).a(1.0F);
      G = ((o0)localObject2);
      a.G.d(new a());
    }
    else
    {
      a.D.setAlpha(1.0F);
      a.D.setVisibility(0);
    }
  }
  
  public final class a
    extends q0
  {
    public a()
    {
      super();
    }
    
    public final void b()
    {
      a.D.setVisibility(0);
    }
    
    public final void c()
    {
      a.D.setAlpha(1.0F);
      a.G.d(null);
      a.G = null;
    }
  }
}

/* Location:
 * Qualified Name:     g.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */