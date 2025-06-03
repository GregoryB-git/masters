package b;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import b1.k.a;
import b1.m;
import b1.o;

public final class j$b
  implements m
{
  public j$b(j paramj) {}
  
  public final void a(o paramo, k.a parama)
  {
    if (parama == k.a.ON_STOP)
    {
      paramo = a.getWindow();
      if (paramo != null) {
        paramo = paramo.peekDecorView();
      } else {
        paramo = null;
      }
      if (paramo != null) {
        paramo.cancelPendingInputEvents();
      }
    }
  }
}

/* Location:
 * Qualified Name:     b.j.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */