package p6;

import V5.m;
import V5.q;
import V5.t;
import X5.d;
import X5.e;
import X5.g;
import u6.B;
import u6.J;

public final class N0
  extends B
{
  public final ThreadLocal s = new ThreadLocal();
  private volatile boolean threadLocalIsSet;
  
  public N0(g paramg, d paramd)
  {
    super((g)localObject, paramd);
    if (!(paramd.getContext().b(e.c) instanceof F))
    {
      paramd = J.c(paramg, null);
      J.a(paramg, paramd);
      L0(paramg, paramd);
    }
  }
  
  public void G0(Object paramObject)
  {
    if (threadLocalIsSet)
    {
      localObject1 = (m)s.get();
      if (localObject1 != null) {
        J.a((g)((m)localObject1).a(), ((m)localObject1).b());
      }
      s.remove();
    }
    Object localObject2 = D.a(paramObject, r);
    d locald = r;
    Object localObject1 = locald.getContext();
    paramObject = null;
    Object localObject4 = J.c((g)localObject1, null);
    if (localObject4 != J.a) {
      paramObject = E.g(locald, (g)localObject1, localObject4);
    }
    try
    {
      r.resumeWith(localObject2);
      localObject2 = t.a;
      return;
    }
    finally
    {
      if ((paramObject == null) || (((N0)paramObject).K0())) {
        J.a((g)localObject1, localObject4);
      }
    }
  }
  
  public final boolean K0()
  {
    int i;
    if ((threadLocalIsSet) && (s.get() == null)) {
      i = 1;
    } else {
      i = 0;
    }
    s.remove();
    return i ^ 0x1;
  }
  
  public final void L0(g paramg, Object paramObject)
  {
    threadLocalIsSet = true;
    s.set(q.a(paramg, paramObject));
  }
}

/* Location:
 * Qualified Name:     p6.N0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */