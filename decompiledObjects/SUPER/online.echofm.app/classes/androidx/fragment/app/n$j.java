package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.a;
import androidx.activity.result.b;
import java.util.ArrayDeque;

public class n$j
  implements b
{
  public n$j(n paramn) {}
  
  public void b(a parama)
  {
    Object localObject = (n.m)a.C.pollFirst();
    if (localObject == null)
    {
      parama = new StringBuilder();
      parama.append("No Activities were started for result for ");
      parama.append(this);
      Log.w("FragmentManager", parama.toString());
      return;
    }
    String str = o;
    int i = p;
    localObject = n.c(a).i(str);
    if (localObject == null)
    {
      parama = new StringBuilder();
      parama.append("Activity result delivered for unknown Fragment ");
      parama.append(str);
      Log.w("FragmentManager", parama.toString());
      return;
    }
    ((Fragment)localObject).h0(i, parama.b(), parama.a());
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.n.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */