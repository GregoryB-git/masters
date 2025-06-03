package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;

public final class ActionBarOverlayLayout$c
  implements Runnable
{
  public ActionBarOverlayLayout$c(ActionBarOverlayLayout paramActionBarOverlayLayout) {}
  
  public final void run()
  {
    a.k();
    ActionBarOverlayLayout localActionBarOverlayLayout = a;
    E = d.animate().translationY(-a.d.getHeight()).setListener(a.F);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionBarOverlayLayout.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */