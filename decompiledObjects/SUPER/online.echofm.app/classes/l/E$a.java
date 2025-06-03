package l;

import android.view.View;
import android.view.ViewParent;

public class E$a
  implements Runnable
{
  public E$a(E paramE) {}
  
  public void run()
  {
    ViewParent localViewParent = o.r.getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(true);
    }
  }
}

/* Location:
 * Qualified Name:     l.E.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */