package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;

public class w$d
  implements Runnable
{
  public w$d(Object paramObject1, y paramy, View paramView, Fragment paramFragment, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, Object paramObject2) {}
  
  public void run()
  {
    Object localObject = o;
    if (localObject != null)
    {
      p.p(localObject, q);
      localObject = w.k(p, o, r, s, q);
      t.addAll((Collection)localObject);
    }
    if (u != null)
    {
      if (v != null)
      {
        localObject = new ArrayList();
        ((ArrayList)localObject).add(q);
        p.q(v, u, (ArrayList)localObject);
      }
      u.clear();
      u.add(q);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.w.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */