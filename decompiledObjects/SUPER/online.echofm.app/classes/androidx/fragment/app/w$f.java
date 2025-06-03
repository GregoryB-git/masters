package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import t.a;

public class w$f
  implements Runnable
{
  public w$f(y paramy, a parama, Object paramObject1, w.h paramh, ArrayList paramArrayList1, View paramView, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean, ArrayList paramArrayList2, Object paramObject2, Rect paramRect) {}
  
  public void run()
  {
    a locala = w.h(o, p, q, r);
    if (locala != null)
    {
      s.addAll(locala.values());
      s.add(t);
    }
    w.f(u, v, w, locala, false);
    Object localObject = q;
    if (localObject != null)
    {
      o.A(localObject, x, s);
      localObject = w.s(locala, r, y, w);
      if (localObject != null) {
        o.k((View)localObject, z);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.w.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */