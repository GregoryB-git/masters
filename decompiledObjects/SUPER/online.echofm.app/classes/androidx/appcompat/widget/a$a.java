package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;

public class a$a
  extends f
{
  public a$a(a parama, Context paramContext, j paramj, View paramView)
  {
    super(paramContext, paramj, paramView, false, e.a.f);
    if (!((e)paramj.getItem()).k())
    {
      paramj = x;
      paramContext = paramj;
      if (paramj == null) {
        paramContext = (View)a.r(parama);
      }
      f(paramContext);
    }
    j(P);
  }
  
  public void e()
  {
    a locala = m;
    M = null;
    Q = 0;
    super.e();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */