package l;

import I.s;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.PopupWindow;

public class I$g
  implements Runnable
{
  public I$g(I paramI) {}
  
  public void run()
  {
    Object localObject = o.q;
    if ((localObject != null) && (s.t((View)localObject)) && (o.q.getCount() > o.q.getChildCount()))
    {
      int i = o.q.getChildCount();
      localObject = o;
      if (i <= C)
      {
        T.setInputMethodMode(2);
        o.a();
      }
    }
  }
}

/* Location:
 * Qualified Name:     l.I.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */