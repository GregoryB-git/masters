package rc;

import dc.p;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f="ChannelFlow.kt", l={212}, m="invokeSuspend")
public final class t$a
  extends i
  implements p<T, ub.e<? super h>, Object>
{
  public int a;
  
  public t$a(qc.f<? super T> paramf, ub.e<? super a> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new a(c, parame);
    b = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((a)create(paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
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
    return h.a;
  }
}

/* Location:
 * Qualified Name:     rc.t.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */