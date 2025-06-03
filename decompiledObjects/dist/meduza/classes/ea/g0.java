package ea;

import android.util.Log;
import dc.p;
import fa.b;
import fa.b.a;
import fa.b.b;
import java.util.Iterator;
import java.util.Map;
import nc.d0;
import rb.f;
import rb.h;
import wb.i;

@wb.e(c="com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", f="SessionLifecycleClient.kt", l={74}, m="invokeSuspend")
public final class g0
  extends i
  implements p<d0, ub.e<? super h>, Object>
{
  public int a;
  
  public g0(String paramString, ub.e<? super g0> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new g0(b, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((g0)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = vb.a.a;
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
      paramObject = fa.a.a;
      a = 1;
      localObject2 = ((fa.a)paramObject).b(this);
      paramObject = localObject2;
      if (localObject2 == localObject1) {
        return localObject1;
      }
    }
    Object localObject2 = ((Map)paramObject).values();
    paramObject = b;
    localObject2 = ((Iterable)localObject2).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (b)((Iterator)localObject2).next();
      ((b)localObject1).a(new b.b((String)paramObject));
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Notified ");
      ((b)localObject1).c();
      localStringBuilder.append(b.a.a);
      localStringBuilder.append(" of new session ");
      localStringBuilder.append((String)paramObject);
      Log.d("SessionLifecycleClient", localStringBuilder.toString());
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     ea.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */