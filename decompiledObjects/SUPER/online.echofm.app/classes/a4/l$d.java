package a4;

import V3.G;
import b4.d.a;
import d4.b;
import d4.h;
import d4.i;
import d4.j;
import d4.m;
import d4.n;

public class l$d
  implements d.a
{
  public final G a;
  public final k b;
  public final n c;
  
  public l$d(G paramG, k paramk, n paramn)
  {
    a = paramG;
    b = paramk;
    c = paramn;
  }
  
  public m a(h paramh, m paramm, boolean paramBoolean)
  {
    n localn = c;
    if (localn == null) {
      localn = b.b();
    }
    return a.g(localn, paramm, paramBoolean, paramh);
  }
  
  public n b(b paramb)
  {
    Object localObject = b.c();
    if (((a)localObject).c(paramb)) {
      return ((a)localObject).b().v(paramb);
    }
    localObject = c;
    if (localObject != null) {
      localObject = new a(i.f((n)localObject, j.j()), true, false);
    } else {
      localObject = b.d();
    }
    return a.a(paramb, (a)localObject);
  }
}

/* Location:
 * Qualified Name:     a4.l.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */