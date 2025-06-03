package io.flutter.plugins.sharedpreferences;

import dc.p;
import java.util.List;
import java.util.Map;
import nc.d0;
import rb.f;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getAll$1", f="SharedPreferencesPlugin.kt", l={129}, m="invokeSuspend")
final class SharedPreferencesPlugin$getAll$1
  extends i
  implements p<d0, ub.e<? super Map<String, ? extends Object>>, Object>
{
  public int label;
  
  public SharedPreferencesPlugin$getAll$1(SharedPreferencesPlugin paramSharedPreferencesPlugin, List<String> paramList, ub.e<? super 1> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new 1(this$0, $allowList, parame);
  }
  
  public final Object invoke(d0 paramd0, ub.e<? super Map<String, ? extends Object>> parame)
  {
    return ((1)create(paramd0, parame)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = label;
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
      paramObject = this$0;
      Object localObject = $allowList;
      label = 1;
      localObject = SharedPreferencesPlugin.access$getPrefs((SharedPreferencesPlugin)paramObject, (List)localObject, this);
      paramObject = localObject;
      if (localObject == locala) {
        return locala;
      }
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.getAll.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */