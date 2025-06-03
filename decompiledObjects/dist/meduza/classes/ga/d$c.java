package ga;

import android.util.Log;
import dc.p;
import rb.f;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f="RemoteSettings.kt", l={}, m="invokeSuspend")
public final class d$c
  extends i
  implements p<String, ub.e<? super h>, Object>
{
  public d$c(ub.e<? super c> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new c(parame);
    a = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((c)create((String)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject = a.a;
    f.b(paramObject);
    localObject = (String)a;
    paramObject = new StringBuilder();
    ((StringBuilder)paramObject).append("Error failing to fetch the remote configs: ");
    ((StringBuilder)paramObject).append((String)localObject);
    Log.e("SessionConfigFetcher", ((StringBuilder)paramObject).toString());
    return h.a;
  }
}

/* Location:
 * Qualified Name:     ga.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */