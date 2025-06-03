package m4;

import j4.d;
import java.util.HashMap;
import java.util.Map;
import k4.a;
import k4.b;

public final class h$a
  implements b
{
  public static final d d = new g();
  public final Map a = new HashMap();
  public final Map b = new HashMap();
  public d c = d;
  
  public h c()
  {
    return new h(new HashMap(a), new HashMap(b), c);
  }
  
  public a d(a parama)
  {
    parama.a(this);
    return this;
  }
  
  public a f(Class paramClass, d paramd)
  {
    a.put(paramClass, paramd);
    b.remove(paramClass);
    return this;
  }
}

/* Location:
 * Qualified Name:     m4.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */