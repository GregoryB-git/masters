package v3;

import android.content.Context;
import android.os.Looper;
import r5.o;
import v5.c;
import v5.e0;
import v5.z;
import w3.a;
import z4.t.a;

public final class r
{
  public final Context a;
  public z b;
  public n7.q<m1> c;
  public n7.q<t.a> d;
  public n7.q<o> e;
  public n7.q<n0> f;
  public n7.q<t5.e> g;
  public n7.e<c, a> h;
  public Looper i;
  public x3.d j;
  public int k;
  public boolean l;
  public n1 m;
  public long n;
  public long o;
  public m0 p;
  public long q;
  public long r;
  public boolean s;
  public boolean t;
  
  public r(Context paramContext)
  {
    paramContext.getClass();
    a = paramContext;
    c = locald1;
    d = localp;
    e = locale;
    f = locald;
    g = locald2;
    h = localq;
    int i1 = e0.a;
    paramContext = Looper.myLooper();
    if (paramContext == null) {
      paramContext = Looper.getMainLooper();
    }
    i = paramContext;
    j = x3.d.o;
    k = 1;
    l = true;
    m = n1.c;
    n = 5000L;
    o = 15000L;
    p = new i(0.97F, 1.03F, 1000L, 1.0E-7F, e0.I(20L), e0.I(500L), 0.999F);
    b = c.a;
    q = 500L;
    r = 2000L;
    s = true;
  }
}

/* Location:
 * Qualified Name:     v3.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */