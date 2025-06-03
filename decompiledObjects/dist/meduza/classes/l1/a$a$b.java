package l1;

import android.net.Uri;
import android.view.InputEvent;
import dc.p;
import m1.d;
import nc.d0;
import rb.f;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f="MeasurementManagerFutures.kt", l={133}, m="invokeSuspend")
public final class a$a$b
  extends i
  implements p<d0, ub.e<? super h>, Object>
{
  public int a;
  
  public a$a$b(a.a parama, Uri paramUri, InputEvent paramInputEvent, ub.e<? super b> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new b(b, c, d, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((b)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
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
      d locald = b.a;
      Uri localUri = c;
      paramObject = d;
      a = 1;
      if (locald.b(localUri, (InputEvent)paramObject, this) == locala) {
        return locala;
      }
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     l1.a.a.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */