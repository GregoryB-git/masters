package rc;

import dc.p;
import dc.q;
import eb.y;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import nc.a0;
import nc.c2;
import nc.d0;
import nc.j2;
import nc.p0;
import nc.x0;
import p2.m0;
import pc.j.b;
import pc.s;
import pc.t;
import sb.v;
import sc.g;
import wb.c;
import x6.b;

@wb.e(c="kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f="Combine.kt", l={54, 76, 79}, m="invokeSuspend")
public final class j
  extends wb.i
  implements p<d0, ub.e<? super rb.h>, Object>
{
  public pc.f a;
  public byte[] b;
  public int c;
  public int d;
  public int e;
  
  public j(ub.e parame, dc.a parama, q paramq, qc.f paramf, qc.e[] paramArrayOfe)
  {
    super(2, parame);
  }
  
  public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
  {
    qc.e[] arrayOfe = o;
    parame = new j(parame, p, q, r, arrayOfe);
    f = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((j)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
  }
  
  public final Object invokeSuspend(final Object paramObject)
  {
    vb.a locala = vb.a.a;
    final int i = e;
    int j;
    Object localObject1;
    final Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    int k;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            j = d;
            i = c;
            localObject1 = b;
            localObject2 = a;
            localObject3 = (Object[])f;
            rb.f.b(paramObject);
          }
          else
          {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          j = d;
          i = c;
          localObject1 = b;
          localObject2 = a;
          localObject3 = (Object[])f;
          rb.f.b(paramObject);
        }
        paramObject = this;
      }
      else
      {
        j = d;
        i = c;
        localObject1 = b;
        localObject2 = a;
        localObject4 = (Object[])f;
        rb.f.b(paramObject);
        paramObject = a;
        localObject5 = this;
        break label360;
      }
    }
    else
    {
      rb.f.b(paramObject);
      localObject1 = (d0)f;
      j = o.length;
      if (j == 0) {
        return rb.h.a;
      }
      localObject3 = new Object[j];
      Arrays.fill((Object[])localObject3, 0, j, y.c);
      localObject2 = pc.i.a(j, null, 6);
      paramObject = new AtomicInteger(j);
      for (i = 0; i < j; i++) {
        b.g0((d0)localObject1, null, new a(o, i, (AtomicInteger)paramObject, (pc.f)localObject2, null), 3);
      }
      localObject1 = new byte[j];
      paramObject = this;
      k = 0;
      i = j;
      j = k;
    }
    for (;;)
    {
      j = (byte)(j + 1);
      f = localObject3;
      a = ((pc.f)localObject2);
      b = ((byte[])localObject1);
      c = i;
      d = j;
      e = 1;
      Object localObject6 = ((s)localObject2).i((j)paramObject);
      localObject5 = paramObject;
      localObject4 = localObject3;
      paramObject = localObject6;
      if (localObject6 == locala) {
        return locala;
      }
      label360:
      if ((paramObject instanceof j.b)) {
        paramObject = null;
      }
      localObject3 = (v)paramObject;
      k = i;
      paramObject = localObject3;
      if (localObject3 == null) {
        return rb.h.a;
      }
      do
      {
        int m = a;
        localObject3 = localObject4[m];
        localObject4[m] = b;
        i = k;
        if (localObject3 == y.c) {
          i = k - 1;
        }
        if (localObject1[m] == j) {
          break;
        }
        localObject1[m] = ((byte)(byte)j);
        paramObject = ((s)localObject2).c();
        if ((paramObject instanceof j.b)) {
          paramObject = null;
        }
        localObject3 = (v)paramObject;
        k = i;
        paramObject = localObject3;
      } while (localObject3 != null);
      if (i == 0)
      {
        Object localObject7 = (Object[])p.invoke();
        if (localObject7 == null)
        {
          localObject7 = q;
          localObject6 = r;
          f = localObject4;
          a = ((pc.f)localObject2);
          b = ((byte[])localObject1);
          c = i;
          d = j;
          e = 2;
          paramObject = localObject5;
          localObject3 = localObject4;
          if (((q)localObject7).f((qc.f)localObject6, localObject4, localObject5) == locala) {
            return locala;
          }
        }
        else
        {
          sb.j.l((Object[])localObject4, 0, (Object[])localObject7, 0, localObject4.length);
          q localq = q;
          localObject6 = r;
          f = localObject4;
          a = ((pc.f)localObject2);
          b = ((byte[])localObject1);
          c = i;
          d = j;
          e = 3;
          paramObject = localObject5;
          localObject3 = localObject4;
          if (localq.f((qc.f)localObject6, localObject7, localObject5) == locala) {
            return locala;
          }
        }
      }
      else
      {
        paramObject = localObject5;
        localObject3 = localObject4;
      }
    }
  }
  
  @wb.e(c="kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f="Combine.kt", l={31}, m="invokeSuspend")
  public static final class a
    extends wb.i
    implements p<d0, ub.e<? super rb.h>, Object>
  {
    public int a;
    
    public a(qc.e<Object>[] paramArrayOfe, int paramInt, AtomicInteger paramAtomicInteger, pc.f<v<Object>> paramf, ub.e<? super a> parame)
    {
      super(parame);
    }
    
    public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
    {
      return new a(b, i, paramObject, localObject2, parame);
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      vb.a locala = vb.a.a;
      int i = a;
      if ((i == 0) || (i == 1)) {}
      try
      {
        rb.f.b(paramObject);
        break label89;
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        rb.f.b(paramObject);
        paramObject = b;
        i = i;
        Object localObject = paramObject[i];
        paramObject = new rc/j$a$a;
        ((a)paramObject).<init>(localObject2, i);
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
        if (paramObject.decrementAndGet() == 0) {
          localObject2.d(null);
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
        Object localObject1 = vb.a.a;
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
        if (paramT != vb.a.a) {
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
}

/* Location:
 * Qualified Name:     rc.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */