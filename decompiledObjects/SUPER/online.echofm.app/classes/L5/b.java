package L5;

import E5.d.b;
import E5.d.d;
import Q3.p;
import Q3.s;
import java.util.Map;
import java.util.Objects;

public class b
  implements d.d
{
  public final p a;
  public final z b;
  public s c;
  public Q3.a d;
  
  public b(p paramp, z paramz)
  {
    a = paramp;
    b = paramz;
  }
  
  public void a(Object paramObject)
  {
    b.run();
    paramObject = c;
    if (paramObject != null)
    {
      a.D((s)paramObject);
      c = null;
    }
    paramObject = d;
    if (paramObject != null)
    {
      a.C((Q3.a)paramObject);
      d = null;
    }
  }
  
  public void b(Object paramObject, d.b paramb)
  {
    paramObject = ((Map)paramObject).get("eventType");
    Objects.requireNonNull(paramObject);
    paramObject = (String)paramObject;
    if ("value".equals(paramObject))
    {
      paramObject = new E(paramb);
      c = ((s)paramObject);
      a.c((s)paramObject);
    }
    else
    {
      paramObject = new a(paramb, (String)paramObject);
      d = ((Q3.a)paramObject);
      a.a((Q3.a)paramObject);
    }
  }
}

/* Location:
 * Qualified Name:     L5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */