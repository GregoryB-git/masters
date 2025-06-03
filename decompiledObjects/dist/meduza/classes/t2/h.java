package t2;

import ec.i;
import nc.a0;
import nc.e0;
import nc.m1;
import o2.j;
import ub.h.a;
import x2.s;
import x6.b;

public final class h
{
  public static final String a;
  
  static
  {
    String str = j.f("WorkConstraintsTracker");
    i.d(str, "tagWithPrefix(\"WorkConstraintsTracker\")");
    a = str;
  }
  
  public static final m1 a(e parame, s params, a0 parama0, d paramd)
  {
    i.e(parame, "<this>");
    i.e(parama0, "dispatcher");
    i.e(paramd, "listener");
    m1 localm1 = new m1(null);
    b.g0(e0.a(h.a.a(parama0, localm1)), null, new g(parame, params, paramd, null), 3);
    return localm1;
  }
}

/* Location:
 * Qualified Name:     t2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */