package nb;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o7.p;

public final class i$b
  extends p<SocketAddress, i.a>
{
  public final HashMap a = new HashMap();
  
  public final Object b()
  {
    return a;
  }
  
  public final Map<SocketAddress, i.a> c()
  {
    return a;
  }
  
  public final double d()
  {
    if (a.isEmpty()) {
      return 0.0D;
    }
    Iterator localIterator = a.values().iterator();
    int i = 0;
    int j = 0;
    while (localIterator.hasNext())
    {
      i.a locala = (i.a)localIterator.next();
      int k = j + 1;
      j = k;
      if (locala.d())
      {
        i++;
        j = k;
      }
    }
    return i / j * 100.0D;
  }
}

/* Location:
 * Qualified Name:     nb.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */