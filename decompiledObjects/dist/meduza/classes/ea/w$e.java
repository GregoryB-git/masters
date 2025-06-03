package ea;

import android.util.Log;
import dc.q;
import r0.d;
import rb.h;
import wb.i;

@wb.e(c="com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f="SessionDatastore.kt", l={76}, m="invokeSuspend")
public final class w$e
  extends i
  implements q<qc.f<? super d>, Throwable, ub.e<? super h>, Object>
{
  public int a;
  
  public w$e(ub.e<? super e> parame)
  {
    super(3, parame);
  }
  
  public final Object f(qc.f paramf, Object paramObject1, Object paramObject2)
  {
    paramObject1 = (Throwable)paramObject1;
    paramObject2 = new e((ub.e)paramObject2);
    b = paramf;
    c = ((Throwable)paramObject1);
    return ((e)paramObject2).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    vb.a locala = vb.a.a;
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
      qc.f localf = b;
      Log.e("FirebaseSessionsRepo", "Error reading stored session data.", c);
      paramObject = new r0.a(true, 1);
      b = null;
      a = 1;
      if (localf.emit(paramObject, this) == locala) {
        return locala;
      }
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     ea.w.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */