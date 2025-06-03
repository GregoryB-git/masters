package j9;

import g9.e0;
import g9.k0;
import g9.l;
import g9.l.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import q0.g;
import v4.d;

public final class r
{
  public final String a;
  public final TreeSet b;
  public final ArrayList c;
  public final List<e0> d;
  
  public r(k0 paramk0)
  {
    Object localObject = e;
    if (localObject == null) {
      localObject = d.m();
    }
    a = ((String)localObject);
    d = b;
    b = new TreeSet(new d(9));
    c = new ArrayList();
    paramk0 = c.iterator();
    while (paramk0.hasNext())
    {
      localObject = (l)paramk0.next();
      if (((l)localObject).f()) {
        b.add(localObject);
      } else {
        c.add(localObject);
      }
    }
  }
  
  public static boolean b(l paraml, k.c paramc)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paraml != null) {
      if (!c.equals(paramc.f()))
      {
        bool2 = bool1;
      }
      else
      {
        int i;
        if ((!a.equals(l.a.p)) && (!a.equals(l.a.q))) {
          i = 0;
        } else {
          i = 1;
        }
        bool2 = bool1;
        if (g.b(paramc.g(), 3) == i) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public static boolean c(e0 parame0, k.c paramc)
  {
    boolean bool1 = b.equals(paramc.f());
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    if ((!g.b(paramc.g(), 1)) || (!g.b(a, 1)))
    {
      bool1 = bool2;
      if (g.b(paramc.g(), 2))
      {
        bool1 = bool2;
        if (!g.b(a, 2)) {}
      }
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }
  
  public final boolean a(k.c paramc)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext()) {
      if (b((l)localIterator.next(), paramc)) {
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     j9.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */