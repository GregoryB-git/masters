package l1;

import android.net.Uri;
import dc.p;
import m1.d;
import nc.d0;
import rb.f;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f="MeasurementManagerFutures.kt", l={141}, m="invokeSuspend")
public final class a$a$c
  extends i
  implements p<d0, ub.e<? super h>, Object>
{
  public int a;
  
  public a$a$c(a.a parama, Uri paramUri, ub.e<? super c> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new c(b, c, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((c)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
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
      Uri localUri = c;
      a = 1;
      if (((d)paramObject).c(localUri, this) == locala) {
        return locala;
      }
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     l1.a.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */