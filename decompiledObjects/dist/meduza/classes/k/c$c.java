package k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j.b;

public final class c$c
  extends FrameLayout
  implements b
{
  public final CollapsibleActionView a;
  
  public c$c(View paramView)
  {
    super(paramView.getContext());
    a = ((CollapsibleActionView)paramView);
    addView(paramView);
  }
  
  public final void onActionViewCollapsed()
  {
    a.onActionViewCollapsed();
  }
  
  public final void onActionViewExpanded()
  {
    a.onActionViewExpanded();
  }
}

/* Location:
 * Qualified Name:     k.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */