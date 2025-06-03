package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;

public class ActionBarOverlayLayout$c
  implements Runnable
{
  public ActionBarOverlayLayout$c(ActionBarOverlayLayout paramActionBarOverlayLayout) {}
  
  public void run()
  {
    o.l();
    ActionBarOverlayLayout localActionBarOverlayLayout = o;
    N = r.animate().translationY(-o.r.getHeight()).setListener(o.O);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ActionBarOverlayLayout.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */