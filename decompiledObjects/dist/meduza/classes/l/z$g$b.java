package l;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import e0.d0;
import java.util.WeakHashMap;

public final class z$g$b
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public z$g$b(z.g paramg) {}
  
  public final void onGlobalLayout()
  {
    z.g localg = a;
    z localz = O;
    localg.getClass();
    WeakHashMap localWeakHashMap = d0.a;
    int i;
    if ((localz.isAttachedToWindow()) && (localz.getGlobalVisibleRect(M))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      a.dismiss();
    }
    else
    {
      a.r();
      a.show();
    }
  }
}

/* Location:
 * Qualified Name:     l.z.g.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */