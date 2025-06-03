package androidx.appcompat.widget;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.view.menu.h;

public final class Toolbar$d
  implements View.OnClickListener
{
  public Toolbar$d(Toolbar paramToolbar) {}
  
  public final void onClick(View paramView)
  {
    paramView = a.U;
    if (paramView == null) {
      paramView = null;
    } else {
      paramView = b;
    }
    if (paramView != null) {
      paramView.collapseActionView();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.Toolbar.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */