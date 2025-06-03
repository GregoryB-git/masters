package x0;

import android.util.Log;
import d.a;
import d.b;
import g;
import java.util.ArrayDeque;

public final class y$h
  implements b<a>
{
  public y$h(y paramy) {}
  
  public final void a(Object paramObject)
  {
    paramObject = (a)paramObject;
    Object localObject = (y.k)a.F.pollLast();
    int i;
    if (localObject == null)
    {
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("No Activities were started for result for ");
      ((StringBuilder)paramObject).append(this);
    }
    else
    {
      String str = a;
      i = b;
      localObject = a.c.d(str);
      if (localObject != null) {
        break label94;
      }
      paramObject = g.g("Activity result delivered for unknown Fragment ", str);
    }
    Log.w("FragmentManager", ((StringBuilder)paramObject).toString());
    return;
    label94:
    ((i)localObject).onActivityResult(i, a, b);
  }
}

/* Location:
 * Qualified Name:     x0.y.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */