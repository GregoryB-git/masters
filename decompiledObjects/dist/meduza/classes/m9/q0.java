package m9;

import eb.t0;
import j9.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k9.f;
import ka.f0;
import ka.f0.a;
import ka.h0;
import ma.h;
import ma.h.h;
import ma.n1;
import ma.w.a;
import n9.a.c;
import x6.b;

public final class q0
  extends a<f0, ka.g0, a>
{
  public static final h.h w = h.b;
  public final e0 t;
  public boolean u = false;
  public h v = w;
  
  public q0(v paramv, n9.a parama, e0 parame0, g0 paramg0)
  {
    super(paramv, (t0)localObject2, parama, a.c.d, a.c.c, paramg0);
    t = parame0;
  }
  
  public final void e(Object paramObject)
  {
    v = ((ka.g0)paramObject).I();
    u = true;
    ((a)m).d();
  }
  
  public final void f(Object paramObject)
  {
    paramObject = (ka.g0)paramObject;
    v = ((ka.g0)paramObject).I();
    l.f = 0L;
    Object localObject1 = t;
    Object localObject2 = ((ka.g0)paramObject).G();
    localObject1.getClass();
    localObject1 = e0.f((n1)localObject2);
    int i = ((ka.g0)paramObject).K();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++)
    {
      localObject2 = ((ka.g0)paramObject).J(j);
      t.getClass();
      localArrayList.add(e0.d((h0)localObject2, (q)localObject1));
    }
    ((a)m).b((q)localObject1, localArrayList);
  }
  
  public final void g()
  {
    u = false;
    super.g();
  }
  
  public final void h()
  {
    if (u) {
      j(Collections.emptyList());
    }
  }
  
  public final void j(List<f> paramList)
  {
    b.Z("Writing mutations requires an opened stream", c(), new Object[0]);
    b.Z("Handshake must be complete before writing mutations", u, new Object[0]);
    f0.a locala = f0.K();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject = (f)paramList.next();
      localObject = t.k((f)localObject);
      locala.m();
      f0.I((f0)b, (ka.e0)localObject);
    }
    paramList = v;
    locala.m();
    f0.H((f0)b, paramList);
    i((f0)locala.k());
  }
  
  public static abstract interface a
    extends j0
  {
    public abstract void b(q paramq, ArrayList paramArrayList);
    
    public abstract void d();
  }
}

/* Location:
 * Qualified Name:     m9.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */