package B3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class c$b
{
  public String a = null;
  public final Set b;
  public final Set c;
  public int d;
  public int e;
  public h f;
  public final Set g;
  
  public c$b(F paramF, F... paramVarArgs)
  {
    HashSet localHashSet = new HashSet();
    b = localHashSet;
    c = new HashSet();
    int i = 0;
    d = 0;
    e = 0;
    g = new HashSet();
    E.c(paramF, "Null interface");
    localHashSet.add(paramF);
    int j = paramVarArgs.length;
    while (i < j)
    {
      E.c(paramVarArgs[i], "Null interface");
      i++;
    }
    Collections.addAll(b, paramVarArgs);
  }
  
  public c$b(Class paramClass, Class... paramVarArgs)
  {
    HashSet localHashSet = new HashSet();
    b = localHashSet;
    c = new HashSet();
    int i = 0;
    d = 0;
    e = 0;
    g = new HashSet();
    E.c(paramClass, "Null interface");
    localHashSet.add(F.b(paramClass));
    int j = paramVarArgs.length;
    while (i < j)
    {
      paramClass = paramVarArgs[i];
      E.c(paramClass, "Null interface");
      b.add(F.b(paramClass));
      i++;
    }
  }
  
  public b b(r paramr)
  {
    E.c(paramr, "Null dependency");
    j(paramr.c());
    c.add(paramr);
    return this;
  }
  
  public b c()
  {
    return i(1);
  }
  
  public c d()
  {
    boolean bool;
    if (f != null) {
      bool = true;
    } else {
      bool = false;
    }
    E.d(bool, "Missing required property: factory.");
    return new c(a, new HashSet(b), new HashSet(c), d, e, f, g, null);
  }
  
  public b e()
  {
    return i(2);
  }
  
  public b f(h paramh)
  {
    f = ((h)E.c(paramh, "Null factory"));
    return this;
  }
  
  public final b g()
  {
    e = 1;
    return this;
  }
  
  public b h(String paramString)
  {
    a = paramString;
    return this;
  }
  
  public final b i(int paramInt)
  {
    boolean bool;
    if (d == 0) {
      bool = true;
    } else {
      bool = false;
    }
    E.d(bool, "Instantiation type has already been set.");
    d = paramInt;
    return this;
  }
  
  public final void j(F paramF)
  {
    E.a(b.contains(paramF) ^ true, "Components are not allowed to depend on interfaces they themselves provide.");
  }
}

/* Location:
 * Qualified Name:     B3.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */