package y6;

import V5.t;
import X5.g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p6.P0;
import p6.m;
import u6.C;

public final class b$a
  implements p6.l, P0
{
  public final m o;
  public final Object p;
  
  public b$a(b paramb, m paramm, Object paramObject)
  {
    o = paramm;
    p = paramObject;
  }
  
  public void a(C paramC, int paramInt)
  {
    o.a(paramC, paramInt);
  }
  
  public void b(t paramt, g6.l paraml)
  {
    b.m().set(q, p);
    o.j(paramt, new a(q, this));
  }
  
  public Object c(t paramt, Object paramObject, g6.l paraml)
  {
    paraml = q;
    paramt = o.g(paramt, paramObject, new b(paraml, this));
    if (paramt != null) {
      b.m().set(q, p);
    }
    return paramt;
  }
  
  public void d(g6.l paraml)
  {
    o.d(paraml);
  }
  
  public g getContext()
  {
    return o.getContext();
  }
  
  public boolean o(Throwable paramThrowable)
  {
    return o.o(paramThrowable);
  }
  
  public void p(Object paramObject)
  {
    o.p(paramObject);
  }
  
  public void resumeWith(Object paramObject)
  {
    o.resumeWith(paramObject);
  }
  
  public static final class a
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public a(b paramb, b.a parama)
    {
      super();
    }
    
    public final void a(Throwable paramThrowable)
    {
      o.b(jdField_thisp);
    }
  }
  
  public static final class b
    extends kotlin.jvm.internal.l
    implements g6.l
  {
    public b(b paramb, b.a parama)
    {
      super();
    }
    
    public final void a(Throwable paramThrowable)
    {
      b.m().set(o, jdField_thisp);
      o.b(jdField_thisp);
    }
  }
}

/* Location:
 * Qualified Name:     y6.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */