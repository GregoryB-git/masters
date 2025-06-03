package ga;

import dc.p;
import java.util.LinkedHashMap;
import java.util.Map;
import nc.d0;
import r0.d;
import rb.f;
import rb.h;
import x6.b;

@wb.e(c="com.google.firebase.sessions.settings.SettingsCache$1", f="SettingsCache.kt", l={46}, m="invokeSuspend")
public final class i$a
  extends wb.i
  implements p<d0, ub.e<? super h>, Object>
{
  public i a;
  public int b;
  
  public i$a(i parami, ub.e<? super a> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new a(c, parame);
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((a)create((d0)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    vb.a locala = vb.a.a;
    int i = b;
    i locali;
    if (i != 0)
    {
      if (i == 1)
      {
        locali = a;
        f.b(paramObject);
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(paramObject);
      locali = c;
      paramObject = a.getData();
      a = locali;
      b = 1;
      paramObject = b.U((qc.e)paramObject, this);
      if (paramObject == locala) {
        return locala;
      }
    }
    paramObject = ((d)paramObject).a();
    ec.i.e(paramObject, "<this>");
    i.a(locali, new r0.a(new LinkedHashMap((Map)paramObject), true));
    return h.a;
  }
}

/* Location:
 * Qualified Name:     ga.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */