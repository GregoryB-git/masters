package V3;

import Q3.c;
import Q3.e.e;
import T3.p;
import d4.n;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class m$c
  implements p
{
  public m$c(m paramm, k paramk, Map paramMap, e.e parame) {}
  
  public void a(String paramString1, String paramString2)
  {
    c localc = m.y(paramString1, paramString2);
    m.z(d, "onDisconnect().updateChildren", a, localc);
    if (localc == null)
    {
      paramString1 = b.entrySet().iterator();
      while (paramString1.hasNext())
      {
        paramString2 = (Map.Entry)paramString1.next();
        m.k(d).d(a.T((k)paramString2.getKey()), (n)paramString2.getValue());
      }
    }
    d.G(c, localc, a);
  }
}

/* Location:
 * Qualified Name:     V3.m.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */