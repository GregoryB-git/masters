package f2;

import android.content.Context;
import g2.l;
import m2.s;
import n2.N;
import n2.V;
import n2.h;

public final class e
  extends v
{
  public U5.a A;
  public U5.a o;
  public U5.a p;
  public U5.a q;
  public U5.a r;
  public U5.a s;
  public U5.a t;
  public U5.a u;
  public U5.a v;
  public U5.a w;
  public U5.a x;
  public U5.a y;
  public U5.a z;
  
  public e(Context paramContext)
  {
    e(paramContext);
  }
  
  public static v.a c()
  {
    return new b(null);
  }
  
  public n2.d a()
  {
    return (n2.d)u.get();
  }
  
  public u b()
  {
    return (u)A.get();
  }
  
  public final void e(Context paramContext)
  {
    o = h2.a.a(k.a());
    paramContext = h2.c.a(paramContext);
    p = paramContext;
    paramContext = g2.j.a(paramContext, p2.c.a(), p2.d.a());
    q = paramContext;
    r = h2.a.a(l.a(p, paramContext));
    s = V.a(p, n2.g.a(), n2.i.a());
    t = h2.a.a(h.a(p));
    u = h2.a.a(N.a(p2.c.a(), p2.d.a(), n2.j.a(), s, t));
    paramContext = l2.g.b(p2.c.a());
    v = paramContext;
    l2.i locali = l2.i.a(p, u, paramContext, p2.d.a());
    w = locali;
    paramContext = o;
    U5.a locala1 = r;
    U5.a locala2 = u;
    x = l2.d.a(paramContext, locala1, locali, locala2, locala2);
    paramContext = p;
    locala1 = r;
    locala2 = u;
    y = s.a(paramContext, locala1, locala2, w, o, locala2, p2.c.a(), p2.d.a(), u);
    paramContext = o;
    locala1 = u;
    z = m2.w.a(paramContext, locala1, w, locala1);
    A = h2.a.a(w.a(p2.c.a(), p2.d.a(), x, y, z));
  }
  
  public static final class b
    implements v.a
  {
    public Context a;
    
    public v a()
    {
      h2.d.a(a, Context.class);
      return new e(a, null);
    }
    
    public b c(Context paramContext)
    {
      a = ((Context)h2.d.b(paramContext));
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     f2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */