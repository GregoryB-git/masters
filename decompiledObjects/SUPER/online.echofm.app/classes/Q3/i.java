package Q3;

import R3.d;
import V3.A;
import V3.p;
import java.util.HashMap;
import java.util.Map;
import r4.a;
import s3.e;

public class i
{
  public final Map a = new HashMap();
  public final e b;
  public final A c;
  public final A d;
  
  public i(e parame, a parama1, a parama2)
  {
    b = parame;
    c = new R3.g(parama1);
    d = new d(parama2);
  }
  
  public h a(p paramp)
  {
    Object localObject1;
    try
    {
      localObject1 = (h)a.get(paramp);
      localObject2 = localObject1;
      if (localObject1 != null) {
        break label108;
      }
      localObject1 = new V3/g;
      ((V3.g)localObject1).<init>();
      if (!b.y()) {
        ((V3.g)localObject1).O(b.q());
      }
    }
    finally
    {
      break label112;
    }
    ((V3.g)localObject1).K(b);
    ((V3.g)localObject1).J(c);
    ((V3.g)localObject1).I(d);
    Object localObject2 = new Q3/h;
    ((h)localObject2).<init>(b, paramp, (V3.g)localObject1);
    a.put(paramp, localObject2);
    label108:
    return (h)localObject2;
    label112:
    throw paramp;
  }
}

/* Location:
 * Qualified Name:     Q3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */