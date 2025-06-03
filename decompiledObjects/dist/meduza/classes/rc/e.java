package rc;

import dc.p;
import pc.q;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f="ChannelFlow.kt", l={60}, m="invokeSuspend")
public final class e
  extends i
  implements p<q<Object>, ub.e<? super h>, Object>
{
  public int a;
  
  public e(f<Object> paramf, ub.e<? super e> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new e(c, parame);
    b = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((e)create((q)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
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
      paramObject = (q)b;
      f localf = c;
      a = 1;
      if (localf.b((q)paramObject, this) == locala) {
        return locala;
      }
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     rc.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */