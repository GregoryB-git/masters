package x0;

import android.util.Log;
import d.a;
import d.b;
import g;
import java.util.ArrayDeque;

public final class y$i
  implements b<a>
{
  public y$i(y paramy) {}
  
  public final void a(Object paramObject)
  {
    a locala = (a)paramObject;
    Object localObject = (y.k)a.F.pollFirst();
    int i;
    if (localObject == null)
    {
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("No IntentSenders were started for ");
      ((StringBuilder)paramObject).append(this);
    }
    else
    {
      paramObject = a;
      i = b;
      localObject = a.c.d((String)paramObject);
      if (localObject != null) {
        break label94;
      }
      paramObject = g.g("Intent Sender result delivered for unknown Fragment ", (String)paramObject);
    }
    Log.w("FragmentManager", ((StringBuilder)paramObject).toString());
    return;
    label94:
    ((i)localObject).onActivityResult(i, a, b);
  }
}

/* Location:
 * Qualified Name:     x0.y.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */