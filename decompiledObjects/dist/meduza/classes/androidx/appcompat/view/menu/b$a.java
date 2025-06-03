package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.ArrayList;
import java.util.Iterator;
import l.n0;

public final class b$a
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public b$a(b paramb) {}
  
  public final void onGlobalLayout()
  {
    if ((a.a()) && (a.q.size() > 0) && (!a.q.get(0)).a.F))
    {
      Object localObject = a.x;
      if ((localObject != null) && (((View)localObject).isShown())) {
        localObject = a.q.iterator();
      }
      while (((Iterator)localObject).hasNext())
      {
        nexta.show();
        continue;
        a.dismiss();
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.menu.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */