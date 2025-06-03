package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.Iterator;
import java.util.List;
import l.I;

public class b$a
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public b$a(b paramb) {}
  
  public void onGlobalLayout()
  {
    if ((o.i()) && (o.w.size() > 0) && (!o.w.get(0)).a.n()))
    {
      Object localObject = o.D;
      if ((localObject != null) && (((View)localObject).isShown())) {
        localObject = o.w.iterator();
      }
      while (((Iterator)localObject).hasNext())
      {
        nexta.a();
        continue;
        o.dismiss();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */