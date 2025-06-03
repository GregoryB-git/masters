package l;

import android.view.View;
import android.view.ViewParent;

public final class l0$a
  implements Runnable
{
  public l0$a(l0 paraml0) {}
  
  public final void run()
  {
    ViewParent localViewParent = a.d.getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(true);
    }
  }
}

/* Location:
 * Qualified Name:     l.l0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */