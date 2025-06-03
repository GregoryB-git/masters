package rc;

import dc.p;
import java.util.concurrent.atomic.AtomicInteger;
import nc.a0;
import nc.c2;
import nc.d0;
import nc.j2;
import nc.p0;
import nc.x0;
import p2.m0;
import pc.t;
import sb.v;
import sc.g;
import vb.a;
import wb.c;

@wb.e(c="kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f="Combine.kt", l={31}, m="invokeSuspend")
public final class j$a
  extends wb.i
  implements p<d0, ub.e<? super rb.h>, Object>
{
  public int a;
  
  public j$a(qc.e<Object>[] paramArrayOfe, int paramInt, AtomicInteger paramAtomicInteger, pc.f<v<Object>> paramf, ub.e<? super a> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
  {
    return new a(b, c, d, e, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = a;
    if ((i == 0) || (i == 1)) {}
    try
    {
      rb.f.b(paramObject);
      break label89;
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      rb.f.b(paramObject);
      paramObject = b;
      i = c;
      Object localObject = paramObject[i];
      paramObject = new rc/j$a$a;
      ((a)paramObject).<init>(e, i);
      a = 1;
      paramObject = ((qc.e)localObject).collect((qc.f)paramObject, this);
      if (paramObject == locala) {
        return locala;
      }
      label89:
      return rb.h.a;
    }
    finally
    {
      if (d.decrementAndGet() == 0) {
        e.d(null);
      }
    }
  }
  
  public static final class a<T>
    implements qc.f
  {
    public a(pc.f<v<Object>> paramf, int paramInt) {}
    
    public final Object emit(T paramT, ub.e<? super rb.h> parame)
    {
      if ((parame instanceof a))
      {
        localObject1 = (a)parame;
        i = c;
        if ((i & 0x80000000) != 0)
        {
          c = (i + Integer.MIN_VALUE);
          parame = (ub.e<? super rb.h>)localObject1;
          break label50;
        }
      }
      parame = new a(this, parame);
      label50:
      Object localObject2 = a;
      Object localObject1 = a.a;
      int j = c;
      int i = 1;
      if (j != 0)
      {
        if (j != 1)
        {
          if (j == 2)
          {
            rb.f.b(localObject2);
            break label439;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        rb.f.b(localObject2);
      }
      else
      {
        rb.f.b(localObject2);
        localObject2 = a;
        paramT = new v(b, paramT);
        c = 1;
        if (((t)localObject2).k(paramT, parame) == localObject1) {
          return localObject1;
        }
      }
      c = 2;
      localObject2 = parame.getContext();
      m0.C((ub.h)localObject2);
      paramT = m0.P(parame);
      if ((paramT instanceof g)) {
        paramT = (g)paramT;
      } else {
        paramT = null;
      }
      if (paramT != null)
      {
        if (d.B0())
        {
          f = rb.h.a;
          c = 1;
          d.A0((ub.h)localObject2, paramT);
          break label414;
        }
        parame = new j2();
        Object localObject3 = ((ub.h)localObject2).plus(parame);
        localObject2 = rb.h.a;
        f = localObject2;
        c = 1;
        d.A0((ub.h)localObject3, paramT);
        if (!b) {
          break label414;
        }
        parame = c2.a();
        localObject3 = e;
        boolean bool;
        if (localObject3 != null) {
          bool = ((sb.i)localObject3).isEmpty();
        } else {
          bool = true;
        }
        if (!bool)
        {
          if (parame.F0())
          {
            f = localObject2;
            c = 1;
            parame.D0(paramT);
            break label391;
          }
          parame.E0(true);
          try
          {
            paramT.run();
            for (;;)
            {
              bool = parame.H0();
              if (!bool) {
                break;
              }
            }
          }
          finally {}
        }
      }
      label391:
      label414:
      try
      {
        paramT.i(localThrowable, null);
        parame.C0(true);
        i = 0;
        if (i == 0) {
          paramT = rb.h.a;
        }
      }
      finally
      {
        parame.C0(true);
      }
      if (paramT != a.a) {
        paramT = rb.h.a;
      }
      if (paramT == localObject1) {
        return localObject1;
      }
      label439:
      return rb.h.a;
    }
    
    @wb.e(c="kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f="Combine.kt", l={32, 33}, m="emit")
    public static final class a
      extends c
    {
      public int c;
      
      public a(j.a.a<? super T> parama, ub.e<? super a> parame)
      {
        super();
      }
      
      public final Object invokeSuspend(Object paramObject)
      {
        a = paramObject;
        c |= 0x80000000;
        return b.emit(null, this);
      }
    }
  }
}

/* Location:
 * Qualified Name:     rc.j.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */