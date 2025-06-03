package l1;

import dc.p;
import m1.d;
import nc.d0;
import rb.f;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f="MeasurementManagerFutures.kt", l={169}, m="invokeSuspend")
public final class a$a$a
  extends i
  implements p<d0, ub.e<? super Integer>, Object>
{
  public int a;
  
  public a$a$a(a.a parama, ub.e<? super a> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new a(b, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
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
      paramObject = b.a;
      a = 1;
      Object localObject = ((d)paramObject).a(this);
      paramObject = localObject;
      if (localObject == locala) {
        return locala;
      }
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     l1.a.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */