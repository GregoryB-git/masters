package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import e0.d0;

public final class n0$g
  implements Runnable
{
  public n0$g(n0 paramn0) {}
  
  public final void run()
  {
    j0 localj0 = a.c;
    if (localj0 != null)
    {
      Object localObject = d0.a;
      if ((localj0.isAttachedToWindow()) && (a.c.getCount() > a.c.getChildCount()))
      {
        int i = a.c.getChildCount();
        localObject = a;
        if (i <= u)
        {
          G.setInputMethodMode(2);
          a.show();
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     l.n0.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */