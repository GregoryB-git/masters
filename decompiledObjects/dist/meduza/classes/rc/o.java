package rc;

import ec.j;
import p2.m0;
import ub.h.b;
import vb.a;
import wb.c;
import wb.d;

public final class o<T>
  extends c
  implements qc.f<T>
{
  public final qc.f<T> a;
  public final ub.h b;
  public final int c;
  public ub.h d;
  public ub.e<? super rb.h> e;
  
  public o(qc.f<? super T> paramf, ub.h paramh)
  {
    super(n.a, ub.i.a);
    a = paramf;
    b = paramh;
    c = ((Number)paramh.fold(Integer.valueOf(0), a.a)).intValue();
  }
  
  public final Object c(ub.e<? super rb.h> parame, T paramT)
  {
    Object localObject = parame.getContext();
    m0.C((ub.h)localObject);
    ub.h localh = d;
    if (localh != localObject) {
      if (!(localh instanceof k))
      {
        if (((Number)((ub.h)localObject).fold(Integer.valueOf(0), new q(this))).intValue() == c)
        {
          d = ((ub.h)localObject);
        }
        else
        {
          parame = f.l("Flow invariant is violated:\n\t\tFlow was collected in ");
          parame.append(b);
          parame.append(",\n\t\tbut emission happened in ");
          parame.append(localObject);
          parame.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
          throw new IllegalStateException(parame.toString().toString());
        }
      }
      else
      {
        parame = (k)localh;
        localObject = f.l("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
        ((StringBuilder)localObject).append(a);
        ((StringBuilder)localObject).append(", but then emission attempt of value '");
        ((StringBuilder)localObject).append(paramT);
        ((StringBuilder)localObject).append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(m0.e0(((StringBuilder)localObject).toString()).toString());
      }
    }
    e = parame;
    parame = p.a;
    localObject = a;
    ec.i.c(localObject, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
    parame = parame.f((qc.f)localObject, paramT, this);
    if (!ec.i.a(parame, a.a)) {
      e = null;
    }
    return parame;
  }
  
  public final Object emit(T paramT, ub.e<? super rb.h> parame)
  {
    try
    {
      paramT = c(parame, paramT);
      if (paramT == a.a) {
        return paramT;
      }
      return rb.h.a;
    }
    finally
    {
      d = new k(parame.getContext(), paramT);
    }
  }
  
  public final d getCallerFrame()
  {
    Object localObject = e;
    if ((localObject instanceof d)) {
      localObject = (d)localObject;
    } else {
      localObject = null;
    }
    return (d)localObject;
  }
  
  public final ub.h getContext()
  {
    ub.h localh = d;
    Object localObject = localh;
    if (localh == null) {
      localObject = ub.i.a;
    }
    return (ub.h)localObject;
  }
  
  public final StackTraceElement getStackTraceElement()
  {
    return null;
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject = rb.e.a(paramObject);
    if (localObject != null) {
      d = new k(getContext(), (Throwable)localObject);
    }
    localObject = e;
    if (localObject != null) {
      ((ub.e)localObject).resumeWith(paramObject);
    }
    return a.a;
  }
  
  public final void releaseIntercepted()
  {
    super.releaseIntercepted();
  }
  
  public static final class a
    extends j
    implements dc.p<Integer, h.b, Integer>
  {
    public static final a a = new a();
    
    public a()
    {
      super();
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      int i = ((Number)paramObject1).intValue();
      paramObject1 = (h.b)paramObject2;
      return Integer.valueOf(i + 1);
    }
  }
}

/* Location:
 * Qualified Name:     rc.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */