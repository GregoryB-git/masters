package androidx.datastore.preferences.protobuf;

import java.util.Comparator;
import java.util.Iterator;

public final class g$b
  implements Comparator
{
  public int a(g paramg1, g paramg2)
  {
    g.g localg1 = paramg1.S();
    g.g localg2 = paramg2.S();
    while ((localg1.hasNext()) && (localg2.hasNext()))
    {
      int i = Integer.compare(g.a(localg1.c()), g.a(localg2.c()));
      if (i != 0) {
        return i;
      }
    }
    return Integer.compare(paramg1.size(), paramg2.size());
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.g.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */