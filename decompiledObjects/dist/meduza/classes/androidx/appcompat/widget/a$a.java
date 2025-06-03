package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;

public final class a$a
  extends i
{
  public a$a(a parama, Context paramContext, m paramm, View paramView)
  {
    super(paramContext, paramm, paramView, false);
    if ((B.x & 0x20) == 32) {
      i = 1;
    }
    if (i == 0)
    {
      paramm = q;
      paramContext = paramm;
      if (paramm == null) {
        paramContext = (View)p;
      }
      f = paramContext;
    }
    paramContext = E;
    this.i = paramContext;
    parama = j;
    if (parama != null) {
      parama.d(paramContext);
    }
  }
  
  public final void c()
  {
    m.B = null;
    super.c();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */