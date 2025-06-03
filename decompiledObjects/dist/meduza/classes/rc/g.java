package rc;

import dc.p;
import vb.a;

@wb.e(c="kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f="ChannelFlow.kt", l={152}, m="invokeSuspend")
public final class g
  extends wb.i
  implements p<qc.f<Object>, ub.e<? super rb.h>, Object>
{
  public int a;
  
  public g(h<Object, Object> paramh, ub.e<? super g> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<rb.h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new g(c, parame);
    b = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((g)create((qc.f)paramObject1, (ub.e)paramObject2)).invokeSuspend(rb.h.a);
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
      paramObject = (qc.f)b;
      h localh = c;
      a = 1;
      paramObject = d.collect((qc.f)paramObject, this);
      if (paramObject != locala) {
        paramObject = rb.h.a;
      }
      if (paramObject == locala) {
        return locala;
      }
    }
    return rb.h.a;
  }
}

/* Location:
 * Qualified Name:     rc.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */