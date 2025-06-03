package gb;

import eb.e1;
import eb.k0;
import eb.k0.c;
import eb.k0.e;
import eb.k0.f;
import eb.k0.g;
import eb.k0.h;
import eb.k0.j;
import eb.l0;
import eb.m0;
import f;
import n7.g.a;
import x6.b;

public final class i
{
  public final m0 a;
  public final String b;
  
  public i(String paramString)
  {
    b.y(localm0, "registry");
    a = localm0;
    b.y(paramString, "defaultPolicy");
    b = paramString;
  }
  
  public static l0 a(i parami, String paramString)
  {
    parami = a.b(paramString);
    if (parami != null) {
      return parami;
    }
    parami = new StringBuilder();
    parami.append("Trying to load '");
    parami.append(paramString);
    parami.append("' because ");
    parami.append("using default policy");
    parami.append(", but it's unavailable");
    throw new e(parami.toString());
  }
  
  public final class a
  {
    public final k0.e a;
    public k0 b;
    public l0 c;
    
    public a(r1.k paramk)
    {
      a = paramk;
      l0 locall0 = a.b(b);
      c = locall0;
      if (locall0 != null)
      {
        b = locall0.a(paramk);
        return;
      }
      throw new IllegalStateException(g.f(f.l("Could not find policy '"), b, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
    }
  }
  
  public static final class b
    extends k0.j
  {
    public final k0.f a(k0.g paramg)
    {
      return k0.f.e;
    }
    
    public final String toString()
    {
      return n7.g.a(b.class).toString();
    }
  }
  
  public static final class c
    extends k0.j
  {
    public final e1 a;
    
    public c(e1 parame1)
    {
      a = parame1;
    }
    
    public final k0.f a(k0.g paramg)
    {
      return k0.f.a(a);
    }
  }
  
  public static final class d
    extends k0
  {
    public final e1 a(k0.h paramh)
    {
      return e1.e;
    }
    
    public final void c(e1 parame1) {}
    
    @Deprecated
    public final void d(k0.h paramh) {}
    
    public final void f() {}
  }
  
  public static final class e
    extends Exception
  {
    public e(String paramString)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     gb.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */