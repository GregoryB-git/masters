package k0;

import W2.g;
import W2.s;
import android.content.Context;
import android.os.Looper;
import d0.b;
import g0.M;
import g0.a;
import g0.c;

public final class w$b
{
  public long A;
  public boolean B;
  public boolean C;
  public Looper D;
  public boolean E;
  public boolean F;
  public String G;
  public boolean H;
  public final Context a;
  public c b;
  public long c;
  public s d;
  public s e;
  public s f;
  public s g;
  public s h;
  public g i;
  public Looper j;
  public int k;
  public b l;
  public boolean m;
  public int n;
  public boolean o;
  public boolean p;
  public boolean q;
  public int r;
  public int s;
  public boolean t;
  public d1 u;
  public long v;
  public long w;
  public long x;
  public w0 y;
  public long z;
  
  public w$b(Context paramContext)
  {
    this(paramContext, new y(paramContext), new z(paramContext));
  }
  
  public w$b(Context paramContext, s params1, s params2)
  {
    this(paramContext, params1, params2, new A(paramContext), new B(), new C(paramContext), new D());
  }
  
  public w$b(Context paramContext, s params1, s params2, s params3, s params4, s params5, g paramg)
  {
    a = ((Context)a.e(paramContext));
    d = params1;
    e = params2;
    f = params3;
    g = params4;
    h = params5;
    i = paramg;
    j = M.U();
    l = b.g;
    n = 0;
    r = 1;
    s = 0;
    t = true;
    u = d1.g;
    v = 5000L;
    w = 15000L;
    x = 3000L;
    y = new q.b().a();
    b = c.a;
    z = 500L;
    A = 2000L;
    C = true;
    G = "";
    k = 64536;
  }
  
  public w f()
  {
    a.f(E ^ true);
    E = true;
    return new f0(this, null);
  }
  
  public b l(w0 paramw0)
  {
    a.f(E ^ true);
    y = ((w0)a.e(paramw0));
    return this;
  }
  
  public b m(x0 paramx0)
  {
    a.f(E ^ true);
    a.e(paramx0);
    g = new x(paramx0);
    return this;
  }
}

/* Location:
 * Qualified Name:     k0.w.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */