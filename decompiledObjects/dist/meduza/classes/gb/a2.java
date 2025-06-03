package gb;

import eb.c;
import eb.e1;
import eb.h;
import eb.p;
import eb.s0;
import eb.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

public final class a2<ReqT>
  extends y2<ReqT>
{
  public a2()
  {
    super(localt0, locals0, locals, l1, l2, (Executor)localObject, g.p0(), locala3, localx0, a);
  }
  
  public final s w(s0 params0, y2.n paramn, int paramInt, boolean paramBoolean)
  {
    Object localObject1 = F;
    localObject1.getClass();
    Object localObject2 = new ArrayList(g.size() + 1);
    ((ArrayList)localObject2).addAll(g);
    ((ArrayList)localObject2).add(paramn);
    paramn = c.b((c)localObject1);
    g = Collections.unmodifiableList((List)localObject2);
    c localc = new c(paramn);
    localObject2 = v0.c(localc, params0, paramInt, paramBoolean);
    localObject1 = H.a(new s2(E, params0, localc));
    paramn = G.a();
    try
    {
      params0 = ((u)localObject1).d(E, params0, localc, (h[])localObject2);
      return params0;
    }
    finally
    {
      G.c(paramn);
    }
  }
  
  public final void x()
  {
    r1.p localp = H.b.G;
    synchronized (a)
    {
      b.remove(this);
      if (b.isEmpty())
      {
        e1 locale11 = c;
        HashSet localHashSet = new java/util/HashSet;
        localHashSet.<init>();
        b = localHashSet;
      }
    }
    locale12 = null;
    if (locale12 != null) {
      d.F.c(locale12);
    }
  }
  
  public final e1 y()
  {
    r1.p localp = H.b.G;
    synchronized (a)
    {
      e1 locale1 = c;
      if (locale1 == null)
      {
        b.add(this);
        locale1 = null;
      }
      return locale1;
    }
  }
}

/* Location:
 * Qualified Name:     gb.a2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */