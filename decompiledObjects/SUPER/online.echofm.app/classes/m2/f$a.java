package m2;

import c2.d;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p2.a;

public class f$a
{
  public a a;
  public Map b = new HashMap();
  
  public a a(d paramd, f.b paramb)
  {
    b.put(paramd, paramb);
    return this;
  }
  
  public f b()
  {
    if (a != null)
    {
      if (b.keySet().size() >= d.values().length)
      {
        Map localMap = b;
        b = new HashMap();
        return f.d(a, localMap);
      }
      throw new IllegalStateException("Not all priorities have been configured");
    }
    throw new NullPointerException("missing required property: clock");
  }
  
  public a c(a parama)
  {
    a = parama;
    return this;
  }
}

/* Location:
 * Qualified Name:     m2.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */