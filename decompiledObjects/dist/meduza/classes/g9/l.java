package g9;

import j9.e;
import j9.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ka.d0;

public class l
  extends m
{
  public final a a;
  public final d0 b;
  public final j9.l c;
  
  public l(j9.l paraml, a parama, d0 paramd0)
  {
    c = paraml;
    a = parama;
    b = paramd0;
  }
  
  public static l e(j9.l paraml, a parama, d0 paramd0)
  {
    a locala1 = a.q;
    a locala2 = a.s;
    a locala3 = a.r;
    a locala4 = a.p;
    if (paraml.u())
    {
      if (parama == locala3) {
        return new x(paraml, paramd0);
      }
      if (parama == locala2) {
        return new y(paraml, paramd0);
      }
      boolean bool;
      if ((parama != locala4) && (parama != locala1)) {
        bool = true;
      } else {
        bool = false;
      }
      x6.b.Z(g.f(new StringBuilder(), a, "queries don't make sense on document keys"), bool, new Object[0]);
      return new w(paraml, parama, paramd0);
    }
    if (parama == locala4) {
      return new c(paraml, paramd0);
    }
    if (parama == locala3) {
      return new v(paraml, paramd0);
    }
    if (parama == locala1) {
      return new b(paraml, paramd0);
    }
    if (parama == locala2) {
      return new c0(paraml, paramd0);
    }
    return new l(paraml, parama, paramd0);
  }
  
  public final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(c.h());
    localStringBuilder.append(a.a);
    localStringBuilder.append(s.a(b));
    return localStringBuilder.toString();
  }
  
  public final List<m> b()
  {
    return Collections.singletonList(this);
  }
  
  public final List<l> c()
  {
    return Collections.singletonList(this);
  }
  
  public boolean d(j9.g paramg)
  {
    paramg = paramg.g(c);
    a locala1 = a;
    a locala2 = a.e;
    boolean bool1 = true;
    boolean bool2 = true;
    if (locala1 == locala2)
    {
      if ((paramg == null) || (!g(s.c(paramg, b)))) {
        bool2 = false;
      }
      return bool2;
    }
    if ((paramg != null) && (s.n(paramg) == s.n(b)) && (g(s.c(paramg, b)))) {
      bool2 = bool1;
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramObject != null) {
      if (!(paramObject instanceof l))
      {
        bool2 = bool1;
      }
      else
      {
        paramObject = (l)paramObject;
        bool2 = bool1;
        if (a == a)
        {
          bool2 = bool1;
          if (c.equals(c))
          {
            bool2 = bool1;
            if (b.equals(b)) {
              bool2 = true;
            }
          }
        }
      }
    }
    return bool2;
  }
  
  public final boolean f()
  {
    return Arrays.asList(new a[] { a.b, a.c, a.f, a.o, a.e, a.s }).contains(a);
  }
  
  public final boolean g(int paramInt)
  {
    int i = a.ordinal();
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool5 = false;
    boolean bool6 = false;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i == 5)
              {
                if (paramInt >= 0) {
                  bool6 = true;
                }
                return bool6;
              }
              x6.b.T("Unknown FieldFilter operator: %s", new Object[] { a });
              throw null;
            }
            bool6 = bool1;
            if (paramInt > 0) {
              bool6 = true;
            }
            return bool6;
          }
          bool6 = bool2;
          if (paramInt != 0) {
            bool6 = true;
          }
          return bool6;
        }
        bool6 = bool3;
        if (paramInt == 0) {
          bool6 = true;
        }
        return bool6;
      }
      bool6 = bool4;
      if (paramInt <= 0) {
        bool6 = true;
      }
      return bool6;
    }
    bool6 = bool5;
    if (paramInt < 0) {
      bool6 = true;
    }
    return bool6;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = c.hashCode();
    return b.hashCode() + (j + (i + 1147) * 31) * 31;
  }
  
  public final String toString()
  {
    return a();
  }
  
  public static enum a
  {
    public final String a;
    
    static
    {
      a locala1 = new a("LESS_THAN", 0, "<");
      b = locala1;
      a locala2 = new a("LESS_THAN_OR_EQUAL", 1, "<=");
      c = locala2;
      a locala3 = new a("EQUAL", 2, "==");
      d = locala3;
      a locala4 = new a("NOT_EQUAL", 3, "!=");
      e = locala4;
      a locala5 = new a("GREATER_THAN", 4, ">");
      f = locala5;
      a locala6 = new a("GREATER_THAN_OR_EQUAL", 5, ">=");
      o = locala6;
      a locala7 = new a("ARRAY_CONTAINS", 6, "array_contains");
      p = locala7;
      a locala8 = new a("ARRAY_CONTAINS_ANY", 7, "array_contains_any");
      q = locala8;
      a locala9 = new a("IN", 8, "in");
      r = locala9;
      a locala10 = new a("NOT_IN", 9, "not_in");
      s = locala10;
      t = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7, locala8, locala9, locala10 };
    }
    
    public a(String paramString)
    {
      a = paramString;
    }
    
    public final String toString()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     g9.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */