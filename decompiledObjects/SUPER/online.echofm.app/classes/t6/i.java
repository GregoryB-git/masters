package t6;

import V5.n;
import V5.t;
import X5.g.b;
import Y5.b;
import g6.p;
import g6.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import p6.u0;
import s6.c;

public final class i
  extends Z5.d
  implements c, Z5.e
{
  public final c o;
  public final X5.g p;
  public final int q;
  public X5.g r;
  public X5.d s;
  
  public i(c paramc, X5.g paramg)
  {
    super(g.o, X5.h.o);
    o = paramc;
    p = paramg;
    q = ((Number)paramg.u(Integer.valueOf(0), a.o)).intValue();
  }
  
  public final void a(X5.g paramg1, X5.g paramg2, Object paramObject)
  {
    if ((paramg2 instanceof e)) {
      h((e)paramg2, paramObject);
    }
    k.a(this, paramg1);
  }
  
  public final Object b(X5.d paramd, Object paramObject)
  {
    Object localObject = paramd.getContext();
    u0.d((X5.g)localObject);
    X5.g localg = r;
    if (localg != localObject)
    {
      a((X5.g)localObject, localg, paramObject);
      r = ((X5.g)localObject);
    }
    s = paramd;
    paramd = j.a();
    localObject = o;
    Intrinsics.c(localObject, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
    Intrinsics.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
    paramd = paramd.c(localObject, paramObject, this);
    if (!Intrinsics.a(paramd, b.c())) {
      s = null;
    }
    return paramd;
  }
  
  public Object emit(Object paramObject, X5.d paramd)
  {
    try
    {
      paramObject = b(paramd, paramObject);
      if (paramObject == b.c()) {
        Z5.h.c(paramd);
      }
      if (paramObject == b.c()) {
        return paramObject;
      }
      return t.a;
    }
    finally
    {
      r = new e((Throwable)paramObject, paramd.getContext());
    }
  }
  
  public Z5.e getCallerFrame()
  {
    Object localObject = s;
    if ((localObject instanceof Z5.e)) {
      localObject = (Z5.e)localObject;
    } else {
      localObject = null;
    }
    return (Z5.e)localObject;
  }
  
  public X5.g getContext()
  {
    X5.g localg = r;
    Object localObject = localg;
    if (localg == null) {
      localObject = X5.h.o;
    }
    return (X5.g)localObject;
  }
  
  public StackTraceElement getStackTraceElement()
  {
    return null;
  }
  
  public final void h(e parame, Object paramObject)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
    localStringBuilder.append(o);
    localStringBuilder.append(", but then emission attempt of value '");
    localStringBuilder.append(paramObject);
    localStringBuilder.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
    throw new IllegalStateException(kotlin.text.i.e(localStringBuilder.toString()).toString());
  }
  
  public Object invokeSuspend(Object paramObject)
  {
    Object localObject = n.b(paramObject);
    if (localObject != null) {
      r = new e((Throwable)localObject, getContext());
    }
    localObject = s;
    if (localObject != null) {
      ((X5.d)localObject).resumeWith(paramObject);
    }
    return b.c();
  }
  
  public void releaseIntercepted()
  {
    super.releaseIntercepted();
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
    
    public final Integer a(int paramInt, g.b paramb)
    {
      return Integer.valueOf(paramInt + 1);
    }
  }
}

/* Location:
 * Qualified Name:     t6.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */