package t2;

import dc.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import nc.d0;
import qc.h.a;
import qc.h.b;
import sb.m;
import sb.q;
import u2.c;

@wb.e(c="androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f="WorkConstraintsTracker.kt", l={54}, m="invokeSuspend")
public final class g
  extends wb.i
  implements p<d0, ub.e<? super rb.h>, Object>
{
  public int a;
  
  public g(e parame, x2.s params, d paramd, ub.e<? super g> parame1)
  {
    super(2, parame1);
  }
  
  public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
  {
    return new g(b, c, d, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((g)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    vb.a locala = vb.a.a;
    int i = a;
    if (i != 0)
    {
      if (i == 1) {
        rb.f.b(paramObject);
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(paramObject);
      paramObject = b;
      Object localObject1 = c;
      paramObject.getClass();
      ec.i.e(localObject1, "spec");
      Object localObject2 = a;
      paramObject = new ArrayList();
      Object localObject3 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject2 = ((Iterator)localObject3).next();
        if (((u2.d)localObject2).b((x2.s)localObject1)) {
          ((ArrayList)paramObject).add(localObject2);
        }
      }
      localObject1 = new ArrayList(m.j((Iterable)paramObject));
      paramObject = ((ArrayList)paramObject).iterator();
      while (((Iterator)paramObject).hasNext())
      {
        localObject2 = (u2.d)((Iterator)paramObject).next();
        localObject2.getClass();
        ((ArrayList)localObject1).add(new qc.b(new c((u2.d)localObject2, null), ub.i.a, -2, pc.a.a));
      }
      paramObject = new f((qc.e[])q.u((Iterable)localObject1).toArray(new qc.e[0]));
      localObject1 = qc.h.a;
      if (!(paramObject instanceof qc.s))
      {
        localObject1 = qc.h.a;
        localObject3 = qc.h.b;
        if ((paramObject instanceof qc.d))
        {
          localObject2 = (qc.d)paramObject;
          if ((b == localObject1) && (c == localObject3)) {}
        }
        else
        {
          paramObject = new qc.d((f)paramObject, (h.b)localObject1, (h.a)localObject3);
        }
      }
      localObject1 = new a(d, c);
      a = 1;
      if (((qc.e)paramObject).collect((qc.f)localObject1, this) == locala) {
        return locala;
      }
    }
    return rb.h.a;
  }
  
  public static final class a<T>
    implements qc.f
  {
    public a(d paramd, x2.s params) {}
    
    public final Object emit(Object paramObject, ub.e parame)
    {
      paramObject = (b)paramObject;
      a.d(b, (b)paramObject);
      return rb.h.a;
    }
  }
}

/* Location:
 * Qualified Name:     t2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */