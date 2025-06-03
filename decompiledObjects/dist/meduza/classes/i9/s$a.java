package i9;

import j9.e;
import j9.o;
import java.util.HashMap;
import java.util.HashSet;
import x6.b;

public final class s$a
{
  public final HashMap<String, HashSet<o>> a = new HashMap();
  
  public final boolean a(o paramo)
  {
    int i = paramo.q();
    boolean bool = true;
    if (i % 2 != 1) {
      bool = false;
    }
    b.Z("Expected a collection path.", bool, new Object[0]);
    String str = paramo.m();
    o localo = (o)paramo.s();
    HashSet localHashSet = (HashSet)a.get(str);
    paramo = localHashSet;
    if (localHashSet == null)
    {
      paramo = new HashSet();
      a.put(str, paramo);
    }
    return paramo.add(localo);
  }
}

/* Location:
 * Qualified Name:     i9.s.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */