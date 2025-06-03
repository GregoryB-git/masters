package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;

public class a$c
  implements Runnable
{
  public a.e o;
  
  public a$c(a parama, a.e parame)
  {
    o = parame;
  }
  
  public void run()
  {
    if (a.t(p) != null) {
      a.u(p).c();
    }
    View localView = (View)a.v(p);
    if ((localView != null) && (localView.getWindowToken() != null) && (o.m())) {
      p.L = o;
    }
    p.N = null;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */