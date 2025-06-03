package aa;

import b9.f;
import b9.g;
import b9.g.a;
import java.util.HashMap;

public abstract class t
{
  public static final g a;
  
  static
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    f localf = g.a.a;
    localHashMap1.put(t.class, c.a);
    localHashMap2.remove(t.class);
    localHashMap1.put(ba.b.class, b.a);
    localHashMap2.remove(ba.b.class);
    localHashMap1.put(ba.a.class, a.a);
    localHashMap2.remove(ba.a.class);
    a = new g(new HashMap(localHashMap1), new HashMap(localHashMap2), localf);
  }
  
  public abstract ba.b a();
}

/* Location:
 * Qualified Name:     aa.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */