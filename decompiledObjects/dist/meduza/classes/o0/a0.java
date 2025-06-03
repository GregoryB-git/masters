package o0;

import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f="SingleProcessDataStore.kt", l={402}, m="invokeSuspend")
public final class a0
  extends i
  implements p<d0, ub.e<Object>, Object>
{
  public int a;
  
  public a0(Object paramObject, ub.e parame, p paramp)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    paramObject = b;
    return new a0(c, parame, (p)paramObject);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((a0)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = a;
    if (i != 0)
    {
      if (i == 1) {
        f.b(paramObject);
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(paramObject);
      Object localObject = b;
      paramObject = c;
      a = 1;
      localObject = ((p)localObject).invoke(paramObject, this);
      paramObject = localObject;
      if (localObject == locala) {
        return locala;
      }
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     o0.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */