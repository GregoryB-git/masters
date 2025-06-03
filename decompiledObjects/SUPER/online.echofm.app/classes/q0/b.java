package q0;

import F0.L;
import F0.r;
import F0.s;
import F0.t;
import Y0.f;
import c1.t.a;
import d0.q;
import g0.E;
import g0.a;
import l1.J;
import l1.e;

public final class b
  implements k
{
  public static final L f = new L();
  public final r a;
  public final q b;
  public final E c;
  public final t.a d;
  public final boolean e;
  
  public b(r paramr, q paramq, E paramE, t.a parama, boolean paramBoolean)
  {
    a = paramr;
    b = paramq;
    c = paramE;
    d = parama;
    e = paramBoolean;
  }
  
  public boolean a()
  {
    r localr = a.d();
    boolean bool;
    if ((!(localr instanceof l1.h)) && (!(localr instanceof l1.b)) && (!(localr instanceof e)) && (!(localr instanceof f))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void b(t paramt)
  {
    a.b(paramt);
  }
  
  public boolean c(s params)
  {
    boolean bool;
    if (a.i(params, f) == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void d()
  {
    a.a(0L, 0L);
  }
  
  public boolean e()
  {
    r localr = a.d();
    boolean bool;
    if ((!(localr instanceof J)) && (!(localr instanceof Z0.h))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public k f()
  {
    boolean bool1 = e();
    boolean bool2 = true;
    a.f(bool1 ^ true);
    if (a.d() != a) {
      bool2 = false;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Can't recreate wrapped extractors. Outer type: ");
    ((StringBuilder)localObject).append(a.getClass());
    a.g(bool2, ((StringBuilder)localObject).toString());
    localObject = a;
    if ((localObject instanceof w)) {
      localObject = new w(b.d, c, d, e);
    }
    for (;;)
    {
      break;
      if ((localObject instanceof l1.h))
      {
        localObject = new l1.h();
      }
      else if ((localObject instanceof l1.b))
      {
        localObject = new l1.b();
      }
      else if ((localObject instanceof e))
      {
        localObject = new e();
      }
      else
      {
        if (!(localObject instanceof f)) {
          break label208;
        }
        localObject = new f();
      }
    }
    return new b((r)localObject, b, c, d, e);
    label208:
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Unexpected extractor type for recreation: ");
    ((StringBuilder)localObject).append(a.getClass().getSimpleName());
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     q0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */