package i9;

import g9.k0;
import j9.e;
import j9.g;
import j9.i;
import j9.k;
import j9.k.a;
import j9.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import t8.c;

public final class s
  implements f
{
  public final a a = new a();
  
  public final void a(k paramk) {}
  
  public final j9.b b(k0 paramk0)
  {
    return k.a.a;
  }
  
  public final void c(k paramk) {}
  
  public final Collection<k> d()
  {
    return Collections.emptyList();
  }
  
  public final String e()
  {
    return null;
  }
  
  public final List<o> f(String paramString)
  {
    paramString = (HashSet)a.a.get(paramString);
    if (paramString != null) {
      paramString = new ArrayList(paramString);
    } else {
      paramString = Collections.emptyList();
    }
    return paramString;
  }
  
  public final void g() {}
  
  public final void h(c<i, g> paramc) {}
  
  public final j9.b i(String paramString)
  {
    return k.a.a;
  }
  
  public final void j(o paramo)
  {
    a.a(paramo);
  }
  
  public final int k(k0 paramk0)
  {
    return 1;
  }
  
  public final List<i> l(k0 paramk0)
  {
    return null;
  }
  
  public final void m(k0 paramk0) {}
  
  public final void n(String paramString, j9.b paramb) {}
  
  public final void start() {}
  
  public static final class a
  {
    public final HashMap<String, HashSet<o>> a = new HashMap();
    
    public final boolean a(o paramo)
    {
      int i = paramo.q();
      boolean bool = true;
      if (i % 2 != 1) {
        bool = false;
      }
      x6.b.Z("Expected a collection path.", bool, new Object[0]);
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
}

/* Location:
 * Qualified Name:     i9.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */