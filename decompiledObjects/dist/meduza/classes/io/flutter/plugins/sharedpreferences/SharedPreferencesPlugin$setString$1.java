package io.flutter.plugins.sharedpreferences;

import dc.p;
import nc.d0;
import rb.f;
import rb.h;
import vb.a;
import wb.i;

@wb.e(c="io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setString$1", f="SharedPreferencesPlugin.kt", l={76}, m="invokeSuspend")
final class SharedPreferencesPlugin$setString$1
  extends i
  implements p<d0, ub.e<? super h>, Object>
{
  public int label;
  
  public SharedPreferencesPlugin$setString$1(SharedPreferencesPlugin paramSharedPreferencesPlugin, String paramString1, String paramString2, ub.e<? super 1> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new 1(this$0, $key, $value, parame);
  }
  
  public final Object invoke(d0 paramd0, ub.e<? super h> parame)
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
      SharedPreferencesPlugin localSharedPreferencesPlugin = this$0;
      String str = $key;
      paramObject = $value;
      label = 1;
      if (SharedPreferencesPlugin.access$dataStoreSetString(localSharedPreferencesPlugin, str, (String)paramObject, this) == locala) {
        return locala;
      }
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.setString.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */