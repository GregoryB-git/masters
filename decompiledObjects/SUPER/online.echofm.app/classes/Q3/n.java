package Q3;

import V2.j;
import V3.C;
import V3.k;
import Y3.g;
import Z3.a;
import d4.o;
import d4.r;
import java.util.Map;

public class n
{
  public V3.m a;
  public k b;
  
  public n(V3.m paramm, k paramk)
  {
    a = paramm;
    b = paramk;
  }
  
  public j c()
  {
    return d(null);
  }
  
  public final j d(final e.e parame)
  {
    parame = Y3.m.l(parame);
    a.i0(new c(parame));
    return (j)parame.a();
  }
  
  public final j e(final Object paramObject, final d4.n paramn, e.e parame)
  {
    Y3.n.l(b);
    C.g(b, paramObject);
    paramObject = a.b(paramObject);
    Y3.n.k(paramObject);
    paramObject = o.b(paramObject, paramn);
    paramn = Y3.m.l(parame);
    a.i0(new a((d4.n)paramObject, paramn));
    return (j)paramn.a();
  }
  
  public j f(Object paramObject)
  {
    return e(paramObject, r.a(), null);
  }
  
  public j g(Object paramObject, double paramDouble)
  {
    return e(paramObject, r.c(b, Double.valueOf(paramDouble)), null);
  }
  
  public j h(Object paramObject, String paramString)
  {
    return e(paramObject, r.c(b, paramString), null);
  }
  
  public j i(Map paramMap)
  {
    return j(paramMap, null);
  }
  
  public final j j(final Map paramMap, final e.e parame)
  {
    final Map localMap = Y3.n.e(b, paramMap);
    parame = Y3.m.l(parame);
    a.i0(new b(localMap, parame, paramMap));
    return (j)parame.a();
  }
  
  public class a
    implements Runnable
  {
    public a(d4.n paramn, g paramg) {}
    
    public void run()
    {
      n.b(n.this).U(n.a(n.this), paramObject, (e.e)paramn.b());
    }
  }
  
  public class b
    implements Runnable
  {
    public b(Map paramMap1, g paramg, Map paramMap2) {}
    
    public void run()
    {
      n.b(n.this).V(n.a(n.this), localMap, (e.e)parame.b(), paramMap);
    }
  }
  
  public class c
    implements Runnable
  {
    public c(g paramg) {}
    
    public void run()
    {
      n.b(n.this).T(n.a(n.this), (e.e)parame.b());
    }
  }
}

/* Location:
 * Qualified Name:     Q3.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */