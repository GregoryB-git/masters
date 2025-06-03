package rc;

import dc.p;
import sc.w;
import vb.a;
import wb.i;
import x6.b;

public final class t<T>
  implements qc.f<T>
{
  public final ub.h a;
  public final Object b;
  public final a c;
  
  public t(qc.f<? super T> paramf, ub.h paramh)
  {
    a = paramh;
    b = w.b(paramh);
    c = new a(paramf, null);
  }
  
  public final Object emit(T paramT, ub.e<? super rb.h> parame)
  {
    paramT = b.A0(a, paramT, b, c, parame);
    if (paramT == a.a) {
      return paramT;
    }
    return rb.h.a;
  }
  
  @wb.e(c="kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f="ChannelFlow.kt", l={212}, m="invokeSuspend")
  public static final class a
    extends i
    implements p<T, ub.e<? super rb.h>, Object>
  {
    public int a;
    
    public a(qc.f<? super T> paramf, ub.e<? super a> parame)
    {
      super(parame);
    }
    
    public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
    {
      parame = new a(c, parame);
      b = paramObject;
      return parame;
    }
    
    public final Object invoke(Object paramObject1, Object paramObject2)
    {
      return ((a)create(paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      a locala = a.a;
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
        qc.f localf = c;
        a = 1;
        if (localf.emit(paramObject, this) == locala) {
          return locala;
        }
      }
      return rb.h.a;
    }
  }
}

/* Location:
 * Qualified Name:     rc.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */