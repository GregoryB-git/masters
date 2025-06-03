package ea;

import dc.p;
import rb.f;
import rb.h;
import wb.i;

@wb.e(c="com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f="SessionDatastore.kt", l={}, m="invokeSuspend")
public final class w$g$a
  extends i
  implements p<r0.a, ub.e<? super h>, Object>
{
  public w$g$a(String paramString, ub.e<? super a> parame)
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
    return ((a)create((r0.a)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject = vb.a.a;
    f.b(paramObject);
    paramObject = (r0.a)a;
    localObject = w.d.a;
    ((r0.a)paramObject).d(w.d.a, b);
    return h.a;
  }
}

/* Location:
 * Qualified Name:     ea.w.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */