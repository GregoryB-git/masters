package p6;

import X5.d;
import X5.g;
import X5.g.b;
import X5.h;
import g6.p;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.u;

public abstract class E
{
  public static final g a(g paramg1, g paramg2, final boolean paramBoolean)
  {
    boolean bool1 = c(paramg1);
    boolean bool2 = c(paramg2);
    if ((!bool1) && (!bool2)) {
      return paramg1.k(paramg2);
    }
    u localu = new u();
    o = paramg2;
    paramg2 = h.o;
    paramg1 = (g)paramg1.u(paramg2, new b(localu, paramBoolean));
    if (bool2) {
      o = ((g)o).u(paramg2, a.o);
    }
    return paramg1.k((g)o);
  }
  
  public static final String b(g paramg)
  {
    return null;
  }
  
  public static final boolean c(g paramg)
  {
    return ((Boolean)paramg.u(Boolean.FALSE, c.o)).booleanValue();
  }
  
  public static final g d(g paramg1, g paramg2)
  {
    if (!c(paramg2)) {
      return paramg1.k(paramg2);
    }
    return a(paramg1, paramg2, false);
  }
  
  public static final g e(I paramI, g paramg)
  {
    paramg = a(paramI.f(), paramg, true);
    paramI = paramg;
    if (paramg != W.a())
    {
      paramI = paramg;
      if (paramg.b(X5.e.c) == null) {
        paramI = paramg.k(W.a());
      }
    }
    return paramI;
  }
  
  public static final N0 f(Z5.e parame)
  {
    Z5.e locale;
    do
    {
      if ((parame instanceof T)) {
        return null;
      }
      locale = parame.getCallerFrame();
      if (locale == null) {
        return null;
      }
      parame = locale;
    } while (!(locale instanceof N0));
    return (N0)locale;
  }
  
  public static final N0 g(d paramd, g paramg, Object paramObject)
  {
    if (!(paramd instanceof Z5.e)) {
      return null;
    }
    if (paramg.b(O0.o) != null)
    {
      paramd = f((Z5.e)paramd);
      if (paramd != null) {
        paramd.L0(paramg, paramObject);
      }
      return paramd;
    }
    return null;
  }
  
  public static final class a
    extends l
    implements p
  {
    public static final a o = new a();
    
    public a()
    {
      super();
    }
    
    public final g a(g paramg, g.b paramb)
    {
      return paramg.k(paramb);
    }
  }
  
  public static final class b
    extends l
    implements p
  {
    public b(u paramu, boolean paramBoolean)
    {
      super();
    }
    
    public final g a(g paramg, g.b paramb)
    {
      return paramg.k(paramb);
    }
  }
  
  public static final class c
    extends l
    implements p
  {
    public static final c o = new c();
    
    public c()
    {
      super();
    }
    
    public final Boolean a(boolean paramBoolean, g.b paramb)
    {
      return Boolean.valueOf(paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     p6.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */