package B3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class c
{
  public final String a;
  public final Set b;
  public final Set c;
  public final int d;
  public final int e;
  public final h f;
  public final Set g;
  
  public c(String paramString, Set paramSet1, Set paramSet2, int paramInt1, int paramInt2, h paramh, Set paramSet3)
  {
    a = paramString;
    b = Collections.unmodifiableSet(paramSet1);
    c = Collections.unmodifiableSet(paramSet2);
    d = paramInt1;
    e = paramInt2;
    f = paramh;
    g = Collections.unmodifiableSet(paramSet3);
  }
  
  public static b c(F paramF)
  {
    return new b(paramF, new F[0], null);
  }
  
  public static b d(F paramF, F... paramVarArgs)
  {
    return new b(paramF, paramVarArgs, null);
  }
  
  public static b e(Class paramClass)
  {
    return new b(paramClass, new Class[0], null);
  }
  
  public static b f(Class paramClass, Class... paramVarArgs)
  {
    return new b(paramClass, paramVarArgs, null);
  }
  
  public static c l(Object paramObject, Class paramClass)
  {
    return m(paramClass).f(new a(paramObject)).d();
  }
  
  public static b m(Class paramClass)
  {
    return b.a(e(paramClass));
  }
  
  public static c s(Object paramObject, Class paramClass, Class... paramVarArgs)
  {
    return f(paramClass, paramVarArgs).f(new b(paramObject)).d();
  }
  
  public Set g()
  {
    return c;
  }
  
  public h h()
  {
    return f;
  }
  
  public String i()
  {
    return a;
  }
  
  public Set j()
  {
    return b;
  }
  
  public Set k()
  {
    return g;
  }
  
  public boolean n()
  {
    int i = d;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean o()
  {
    boolean bool;
    if (d == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean p()
  {
    boolean bool;
    if (e == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public c t(h paramh)
  {
    return new c(a, b, c, d, e, paramh, g);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("Component<");
    localStringBuilder.append(Arrays.toString(b.toArray()));
    localStringBuilder.append(">{");
    localStringBuilder.append(d);
    localStringBuilder.append(", type=");
    localStringBuilder.append(e);
    localStringBuilder.append(", deps=");
    localStringBuilder.append(Arrays.toString(c.toArray()));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static class b
  {
    public String a = null;
    public final Set b;
    public final Set c;
    public int d;
    public int e;
    public h f;
    public final Set g;
    
    public b(F paramF, F... paramVarArgs)
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
    
    public b(Class paramClass, Class... paramVarArgs)
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
}

/* Location:
 * Qualified Name:     B3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */