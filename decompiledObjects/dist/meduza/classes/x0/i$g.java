package x0;

import android.view.View;
import b1.k.a;
import b1.m;
import b1.o;

public final class i$g
  implements m
{
  public i$g(i parami) {}
  
  public final void a(o paramo, k.a parama)
  {
    if (parama == k.a.ON_STOP)
    {
      paramo = a.mView;
      if (paramo != null) {
        paramo.cancelPendingInputEvents();
      }
    }
  }
}

/* Location:
 * Qualified Name:     x0.i.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */