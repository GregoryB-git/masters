package X3;

import V3.k;
import Y3.d.c;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class i$e
  implements d.c
{
  public i$e(i parami) {}
  
  public Void b(k paramk, Map paramMap, Void paramVoid)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      paramk = (h)((Map.Entry)paramMap.next()).getValue();
      if (!d) {
        i.b(a, paramk.b());
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     X3.i.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */