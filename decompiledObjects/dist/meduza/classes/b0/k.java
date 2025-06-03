package b0;

import d0.a;
import java.util.ArrayList;
import r.h;

public final class k
  implements a<l.a>
{
  public final void accept(Object arg1)
  {
    l.a locala = (l.a)???;
    synchronized (l.c)
    {
      h localh = l.d;
      ArrayList localArrayList = (ArrayList)localh.getOrDefault(a, null);
      if (localArrayList != null)
      {
        localh.remove(a);
        for (int i = 0; i < localArrayList.size(); i++) {
          ((a)localArrayList.get(i)).accept(locala);
        }
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     b0.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */