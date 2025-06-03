package u6;

import X5.g;
import X5.g.b;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.K0;

public abstract class J
{
  public static final F a = new F("NO_THREAD_ELEMENTS");
  public static final p b = a.o;
  public static final p c = b.o;
  public static final p d = c.o;
  
  public static final void a(g paramg, Object paramObject)
  {
    if (paramObject == a) {
      return;
    }
    if ((paramObject instanceof N))
    {
      ((N)paramObject).b(paramg);
    }
    else
    {
      Object localObject = paramg.u(null, c);
      Intrinsics.c(localObject, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
      ((K0)localObject).D(paramg, paramObject);
    }
  }
  
  public static final Object b(g paramg)
  {
    paramg = paramg.u(Integer.valueOf(0), b);
    Intrinsics.b(paramg);
    return paramg;
  }
  
  public static final Object c(g paramg, Object paramObject)
  {
    Object localObject = paramObject;
    if (paramObject == null) {
      localObject = b(paramg);
    }
    if (localObject == Integer.valueOf(0))
    {
      paramg = a;
    }
    else if ((localObject instanceof Integer))
    {
      paramg = paramg.u(new N(paramg, ((Number)localObject).intValue()), d);
    }
    else
    {
      Intrinsics.c(localObject, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
      paramg = ((K0)localObject).B(paramg);
    }
    return paramg;
  }
  
  public static final class a
    extends l
    implements p
  {
    public static final a o = new a();
    
    public a()
    {
      super();
    }
    
    public final Object a(Object paramObject, g.b paramb)
    {
      if ((paramb instanceof K0))
      {
        if ((paramObject instanceof Integer)) {
          paramObject = (Integer)paramObject;
        } else {
          paramObject = null;
        }
        int i;
        if (paramObject != null) {
          i = ((Integer)paramObject).intValue();
        } else {
          i = 1;
        }
        if (i != 0) {
          paramb = Integer.valueOf(i + 1);
        }
        return paramb;
      }
      return paramObject;
    }
  }
  
  public static final class b
    extends l
    implements p
  {
    public static final b o = new b();
    
    public b()
    {
      super();
    }
    
    public final K0 a(K0 paramK0, g.b paramb)
    {
      if (paramK0 != null) {
        return paramK0;
      }
      if ((paramb instanceof K0)) {
        paramK0 = (K0)paramb;
      } else {
        paramK0 = null;
      }
      return paramK0;
    }
  }
  
  public static final class c
    extends l
    implements p
  {
    public static final c o = new c();
    
    public c()
    {
      super();
    }
    
    public final N a(N paramN, g.b paramb)
    {
      if ((paramb instanceof K0))
      {
        paramb = (K0)paramb;
        paramN.a(paramb, paramb.B(a));
      }
      return paramN;
    }
  }
}

/* Location:
 * Qualified Name:     u6.J
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */