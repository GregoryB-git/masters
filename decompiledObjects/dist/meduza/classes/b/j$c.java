package b;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import b1.k.a;
import b1.m;
import b1.o;
import b1.s0;

public final class j$c
  implements m
{
  public j$c(j paramj) {}
  
  public final void a(o paramo, k.a parama)
  {
    if (parama == k.a.ON_DESTROY)
    {
      a.mContextAwareHelper.b = null;
      if (!a.isChangingConfigurations()) {
        a.getViewModelStore().a();
      }
      paramo = (j.j)a.mReportFullyDrawnExecutor;
      d.getWindow().getDecorView().removeCallbacks(paramo);
      d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(paramo);
    }
  }
}

/* Location:
 * Qualified Name:     b.j.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */