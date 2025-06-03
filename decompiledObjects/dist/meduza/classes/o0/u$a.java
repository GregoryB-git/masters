package o0;

import dc.p;
import rb.f;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="androidx.datastore.core.SingleProcessDataStore$data$1$1", f="SingleProcessDataStore.kt", l={}, m="invokeSuspend")
public final class u$a
  extends i
  implements p<b0<Object>, ub.e<? super Boolean>, Object>
{
  public u$a(b0<Object> paramb0, ub.e<? super a> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new a(b, parame);
    a = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((a)create((b0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject = a.a;
    f.b(paramObject);
    localObject = (b0)a;
    paramObject = b;
    boolean bool1 = paramObject instanceof c;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (!bool1) {
      if ((paramObject instanceof j))
      {
        bool3 = bool2;
      }
      else
      {
        bool3 = bool2;
        if (localObject == paramObject) {
          bool3 = true;
        }
      }
    }
    return Boolean.valueOf(bool3);
  }
}

/* Location:
 * Qualified Name:     o0.u.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */