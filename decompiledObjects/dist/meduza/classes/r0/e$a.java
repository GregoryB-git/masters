package r0;

import dc.p;
import java.util.LinkedHashMap;
import java.util.Map;
import rb.f;
import rb.h;

@wb.e(c="androidx.datastore.preferences.core.PreferencesKt$edit$2", f="Preferences.kt", l={329}, m="invokeSuspend")
public final class e$a
  extends wb.i
  implements p<d, ub.e<? super d>, Object>
{
  public int a;
  
  public e$a(p<? super a, ? super ub.e<? super h>, ? extends Object> paramp, ub.e<? super a> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new a(c, parame);
    b = paramObject;
    return parame;
  }
  
  public final Object invoke(Object paramObject1, Object paramObject2)
  {
    return ((a)create((d)paramObject1, (ub.e)paramObject2)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject = vb.a.a;
    int i = a;
    if (i != 0)
    {
      if (i == 1)
      {
        localObject = (a)b;
        f.b(paramObject);
        paramObject = localObject;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(paramObject);
      paramObject = ((d)b).a();
      ec.i.e(paramObject, "<this>");
      paramObject = new a(new LinkedHashMap((Map)paramObject), false);
      p localp = c;
      b = paramObject;
      a = 1;
      if (localp.invoke(paramObject, this) == localObject) {
        return localObject;
      }
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     r0.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */