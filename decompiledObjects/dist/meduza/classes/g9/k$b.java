package g9;

import java.util.ArrayList;
import java.util.Iterator;

public final class k$b
{
  public final ArrayList a = new ArrayList();
  public s0 b;
  
  public final boolean a()
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext()) {
      if (((g0)localIterator.next()).a()) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     g9.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */