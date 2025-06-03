package j9;

import java.util.Collections;
import java.util.List;
import v4.d;
import x6.b;

public final class i
  implements Comparable<i>
{
  public static final d b;
  public static final t8.e<i> c;
  public final o a;
  
  static
  {
    d locald = new d(8);
    b = locald;
    c = new t8.e(Collections.emptyList(), locald);
  }
  
  public i(o paramo)
  {
    b.Z("Not a document key path: %s", l(paramo), new Object[] { paramo });
    a = paramo;
  }
  
  public static i g()
  {
    List localList = Collections.emptyList();
    o localo = o.b;
    if (localList.isEmpty()) {
      localo = o.b;
    } else {
      localo = new o(localList);
    }
    return new i(localo);
  }
  
  public static i h(String paramString)
  {
    paramString = o.t(paramString);
    boolean bool;
    if ((paramString.q() > 4) && (paramString.n(0).equals("projects")) && (paramString.n(2).equals("databases")) && (paramString.n(4).equals("documents"))) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Tried to parse an invalid key: %s", bool, new Object[] { paramString });
    return new i((o)paramString.r());
  }
  
  public static boolean l(o paramo)
  {
    boolean bool;
    if (paramo.q() % 2 == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (i.class == paramObject.getClass()))
    {
      paramObject = (i)paramObject;
      return a.equals(a);
    }
    return false;
  }
  
  public final int f(i parami)
  {
    return a.i(a);
  }
  
  public final int hashCode()
  {
    return a.hashCode();
  }
  
  public final o i()
  {
    return (o)a.s();
  }
  
  public final String toString()
  {
    return a.h();
  }
}

/* Location:
 * Qualified Name:     j9.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */