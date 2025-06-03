package ga;

import dc.p;
import java.util.Map;
import r0.d.a;
import rb.f;
import rb.h;

@wb.e(c="com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f="SettingsCache.kt", l={}, m="invokeSuspend")
public final class i$c
  extends wb.i
  implements p<r0.a, ub.e<? super h>, Object>
{
  public i$c(d.a parama, i parami, Object paramObject, ub.e parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    Object localObject = b;
    parame = new c(c, d, localObject, parame);
    a = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((c)create((r0.a)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject = vb.a.a;
    f.b(paramObject);
    paramObject = (r0.a)a;
    localObject = b;
    if (localObject != null)
    {
      ((r0.a)paramObject).d(c, localObject);
    }
    else
    {
      localObject = c;
      paramObject.getClass();
      ec.i.e(localObject, "key");
      ((r0.a)paramObject).c();
      a.remove(localObject);
    }
    i.a(d, (r0.a)paramObject);
    return h.a;
  }
}

/* Location:
 * Qualified Name:     ga.i.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */