package nc;

import rb.d;
import sc.s;
import sc.w;
import ub.e;
import ub.f.a;

public final class g2<T>
  extends s<T>
{
  public final ThreadLocal<d<ub.h, Object>> e = new ThreadLocal();
  private volatile boolean threadLocalIsSet;
  
  public g2(e parame, ub.h paramh)
  {
    super(parame, (ub.h)localObject);
    if (!(parame.getContext().get(f.a.a) instanceof a0))
    {
      parame = w.c(paramh, null);
      w.a(paramh, parame);
      f0(paramh, parame);
    }
  }
  
  public final void Z(Object paramObject)
  {
    if (threadLocalIsSet)
    {
      localObject1 = (d)e.get();
      if (localObject1 != null) {
        w.a((ub.h)a, b);
      }
      e.remove();
    }
    Object localObject2 = eb.y.c(paramObject);
    e locale = d;
    Object localObject1 = locale.getContext();
    paramObject = null;
    Object localObject4 = w.c((ub.h)localObject1, null);
    if (localObject4 != w.a) {
      paramObject = y.c(locale, (ub.h)localObject1, localObject4);
    }
    try
    {
      d.resumeWith(localObject2);
      localObject2 = rb.h.a;
      return;
    }
    finally
    {
      if ((paramObject == null) || (((g2)paramObject).e0())) {
        w.a((ub.h)localObject1, localObject4);
      }
    }
  }
  
  public final boolean e0()
  {
    int i;
    if ((threadLocalIsSet) && (e.get() == null)) {
      i = 1;
    } else {
      i = 0;
    }
    e.remove();
    return i ^ 0x1;
  }
  
  public final void f0(ub.h paramh, Object paramObject)
  {
    threadLocalIsSet = true;
    e.set(new d(paramh, paramObject));
  }
}

/* Location:
 * Qualified Name:     nc.g2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */