package androidx.appcompat.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window.Callback;
import k.a;

public class d$a
  implements View.OnClickListener
{
  public final a o;
  
  public d$a(d paramd)
  {
    o = new a(a.getContext(), 0, 16908332, 0, 0, h);
  }
  
  public void onClick(View paramView)
  {
    paramView = p;
    Window.Callback localCallback = k;
    if ((localCallback != null) && (l)) {
      localCallback.onMenuItemSelected(0, o);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.d.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */