package ea;

import android.util.Log;
import dc.p;
import java.io.IOException;
import nc.d0;
import q0.c;
import rb.f;
import rb.h;

@wb.e(c="com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f="SessionDatastore.kt", l={89}, m="invokeSuspend")
public final class w$g
  extends wb.i
  implements p<d0, ub.e<? super h>, Object>
{
  public int a;
  
  public w$g(w paramw, String paramString, ub.e<? super g> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new g(b, c, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((g)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = vb.a.a;
    int i = a;
    if ((i == 0) || (i == 1)) {}
    try
    {
      f.b(paramObject);
    }
    catch (IOException paramObject)
    {
      Object localObject2;
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Failed to update session Id: ");
      ((StringBuilder)localObject1).append(paramObject);
      Log.w("FirebaseSessionsRepo", ((StringBuilder)localObject1).toString());
    }
    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    f.b(paramObject);
    paramObject = w.e;
    localObject2 = b.a;
    paramObject.getClass();
    localObject2 = w.f.a(localObject2, w.c.a[0]);
    paramObject = new ea/w$g$a;
    ((a)paramObject).<init>(c, null);
    a = 1;
    paramObject = r0.e.a((o0.i)localObject2, (p)paramObject, this);
    if (paramObject == localObject1) {
      return localObject1;
    }
    return h.a;
  }
  
  @wb.e(c="com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f="SessionDatastore.kt", l={}, m="invokeSuspend")
  public static final class a
    extends wb.i
    implements p<r0.a, ub.e<? super h>, Object>
  {
    public a(String paramString, ub.e<? super a> parame)
    {
      super(parame);
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
}

/* Location:
 * Qualified Name:     ea.w.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */