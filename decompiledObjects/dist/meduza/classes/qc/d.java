package qc;

import dc.l;
import dc.p;
import eb.y;
import ec.s;
import rb.h;
import vb.a;
import wb.c;

public final class d<T>
  implements e<T>
{
  public final e<T> a;
  public final l<T, Object> b;
  public final p<Object, Object, Boolean> c;
  
  public d(t2.f paramf, h.b paramb, h.a parama)
  {
    a = paramf;
    b = paramb;
    c = parama;
  }
  
  public final Object collect(final f<? super T> paramf, ub.e<? super h> parame)
  {
    final s locals = new s();
    a = y.b;
    paramf = a.collect(new a(this, locals, paramf), parame);
    if (paramf == a.a) {
      return paramf;
    }
    return h.a;
  }
  
  public static final class a<T>
    implements f
  {
    public a(d<T> paramd, s<Object> params, f<? super T> paramf) {}
    
    public final Object emit(T paramT, ub.e<? super h> parame)
    {
      if ((parame instanceof a))
      {
        localObject1 = (a)parame;
        i = c;
        if ((i & 0x80000000) != 0)
        {
          c = (i + Integer.MIN_VALUE);
          parame = (ub.e<? super h>)localObject1;
          break label50;
        }
      }
      parame = new a(this, parame);
      label50:
      Object localObject2 = a;
      Object localObject1 = a.a;
      int i = c;
      if (i != 0)
      {
        if (i == 1) {
          rb.f.b(localObject2);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        rb.f.b(localObject2);
        Object localObject3 = a.b.invoke(paramT);
        localObject2 = localsa;
        if ((localObject2 != y.b) && (((Boolean)a.c.invoke(localObject2, localObject3)).booleanValue())) {
          return h.a;
        }
        localsa = localObject3;
        localObject2 = paramf;
        c = 1;
        if (((f)localObject2).emit(paramT, parame) == localObject1) {
          return localObject1;
        }
      }
      return h.a;
    }
    
    @wb.e(c="kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f="Distinct.kt", l={77}, m="emit")
    public static final class a
      extends c
    {
      public int c;
      
      public a(d.a<? super T> parama, ub.e<? super a> parame)
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
 * Qualified Name:     qc.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */