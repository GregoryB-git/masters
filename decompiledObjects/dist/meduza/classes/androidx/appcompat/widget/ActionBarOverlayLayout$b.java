package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;

public final class ActionBarOverlayLayout$b
  implements Runnable
{
  public ActionBarOverlayLayout$b(ActionBarOverlayLayout paramActionBarOverlayLayout) {}
  
  public final void run()
  {
    a.k();
    ActionBarOverlayLayout localActionBarOverlayLayout = a;
    E = d.animate().translationY(0.0F).setListener(a.F);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionBarOverlayLayout.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */