package u5;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

public class j$b
  implements ViewTreeObserver.OnPreDrawListener
{
  public j$b(j paramj, D paramD) {}
  
  public boolean onPreDraw()
  {
    if ((j.b(p)) && (p.e != null))
    {
      o.getViewTreeObserver().removeOnPreDrawListener(this);
      p.e = null;
    }
    return j.b(p);
  }
}

/* Location:
 * Qualified Name:     u5.j.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */