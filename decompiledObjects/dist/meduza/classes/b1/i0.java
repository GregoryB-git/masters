package b1;

import android.os.Bundle;
import b.z;
import dc.a;
import ec.i;
import ec.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import rb.g;
import s1.c;
import s1.c.b;

public final class i0
  implements c.b
{
  public final c a;
  public boolean b;
  public Bundle c;
  public final g d;
  
  public i0(c paramc, t0 paramt0)
  {
    a = paramc;
    d = z.n(new a(paramt0));
  }
  
  public final Bundle a()
  {
    Bundle localBundle = new Bundle();
    Object localObject1 = c;
    if (localObject1 != null) {
      localBundle.putAll((Bundle)localObject1);
    }
    Iterator localIterator = d.getValue()).d.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (Map.Entry)localIterator.next();
      localObject1 = (String)((Map.Entry)localObject2).getKey();
      localObject2 = getValuee.a();
      if (!i.a(localObject2, Bundle.EMPTY)) {
        localBundle.putBundle((String)localObject1, (Bundle)localObject2);
      }
    }
    b = false;
    return localBundle;
  }
  
  public final void b()
  {
    if (!b)
    {
      Bundle localBundle1 = a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
      Object localObject = new Bundle();
      Bundle localBundle2 = c;
      if (localBundle2 != null) {
        ((Bundle)localObject).putAll(localBundle2);
      }
      if (localBundle1 != null) {
        ((Bundle)localObject).putAll(localBundle1);
      }
      c = ((Bundle)localObject);
      b = true;
      localObject = (j0)d.getValue();
    }
  }
  
  public static final class a
    extends j
    implements a<j0>
  {
    public a(t0 paramt0)
    {
      super();
    }
    
    public final Object invoke()
    {
      return h0.c(a);
    }
  }
}

/* Location:
 * Qualified Name:     b1.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */