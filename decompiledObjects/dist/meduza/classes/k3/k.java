package k3;

import android.content.Context;
import java.util.concurrent.Executor;
import l3.j;
import m3.c;
import p3.e;
import p3.f;
import r3.a0;
import r3.f.a;
import r3.g.a;
import r3.t;
import r3.u;
import t3.b;
import t3.b.a;
import t3.c.a;
import x0.f0;

public final class k
  extends x
{
  public qb.a<Executor> a = m3.a.a(o.a.a);
  public c b;
  public qb.a c;
  public a0 d;
  public qb.a<t> e;
  public qb.a<w> f;
  
  public k(Context paramContext)
  {
    if (paramContext != null)
    {
      Object localObject1 = new c(paramContext);
      b = ((c)localObject1);
      b localb = b.a.a;
      paramContext = c.a.a;
      c = m3.a.a(new l3.l((c)localObject1, new j(localObject1, localb, paramContext)));
      localObject1 = b;
      d = new a0(localObject1, f.a.a, g.a.a);
      localObject1 = m3.a.a(new e((qb.a)localObject1, 1));
      qb.a locala1 = m3.a.a(new u(d, (qb.a)localObject1));
      e = locala1;
      Object localObject2 = new e(localb, 0);
      localObject1 = b;
      f localf = new f((qb.a)localObject1, locala1, (qb.a)localObject2, paramContext, 0);
      qb.a locala2 = a;
      localObject2 = c;
      f = m3.a.a(new y(localb, paramContext, new y(locala2, (qb.a)localObject2, localf, locala1, locala1, 1), new q3.l((qb.a)localObject1, (qb.a)localObject2, locala1, localf, locala2, locala1, locala1), new f0(locala2, locala1, localf, locala1), 0));
      return;
    }
    throw new NullPointerException("instance cannot be null");
  }
}

/* Location:
 * Qualified Name:     k3.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */