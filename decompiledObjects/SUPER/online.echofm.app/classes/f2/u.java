package f2;

import android.content.Context;
import c2.b;
import c2.c;
import java.util.Collections;
import java.util.Set;
import m2.r;
import p2.a;

public class u
  implements t
{
  public static volatile v e;
  public final a a;
  public final a b;
  public final l2.e c;
  public final r d;
  
  public u(a parama1, a parama2, l2.e parame, r paramr, m2.v paramv)
  {
    a = parama1;
    b = parama2;
    c = parame;
    d = paramr;
    paramv.c();
  }
  
  public static u c()
  {
    v localv = e;
    if (localv != null) {
      return localv.b();
    }
    throw new IllegalStateException("Not initialized!");
  }
  
  public static Set d(f paramf)
  {
    if ((paramf instanceof g)) {
      return Collections.unmodifiableSet(((g)paramf).a());
    }
    return Collections.singleton(b.b("proto"));
  }
  
  public static void f(Context paramContext)
  {
    if (e == null)
    {
      try
      {
        if (e == null) {
          e = e.c().b(paramContext).a();
        }
      }
      finally
      {
        break label45;
      }
      return;
      label45:
      throw paramContext;
    }
  }
  
  public void a(o paramo, c2.h paramh)
  {
    c.a(paramo.f().f(paramo.c().c()), b(paramo), paramh);
  }
  
  public final i b(o paramo)
  {
    return i.a().i(a.a()).k(b.a()).j(paramo.g()).h(new h(paramo.b(), paramo.d())).g(paramo.c().a()).d();
  }
  
  public r e()
  {
    return d;
  }
  
  public c2.g g(f paramf)
  {
    return new q(d(paramf), p.a().b(paramf.d()).c(paramf.r()).a(), this);
  }
}

/* Location:
 * Qualified Name:     f2.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */