package l;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

public final class z$a
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public z$a(z paramz) {}
  
  public final void onGlobalLayout()
  {
    if (!a.getInternalPopup().a())
    {
      localObject = a;
      f.m(z.c.b((View)localObject), z.c.a((View)localObject));
    }
    Object localObject = a.getViewTreeObserver();
    if (localObject != null) {
      z.b.a((ViewTreeObserver)localObject, this);
    }
  }
}

/* Location:
 * Qualified Name:     l.z.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */