package io.flutter.plugins.sharedpreferences;

import dc.p;
import r0.d.a;
import rb.f;
import rb.h;
import wb.i;

@wb.e(c="io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$dataStoreSetString$2", f="SharedPreferencesPlugin.kt", l={}, m="invokeSuspend")
final class SharedPreferencesPlugin$dataStoreSetString$2
  extends i
  implements p<r0.a, ub.e<? super h>, Object>
{
  public int label;
  
  public SharedPreferencesPlugin$dataStoreSetString$2(d.a<String> parama, String paramString, ub.e<? super 2> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new 2($stringKey, $value, parame);
    L$0 = paramObject;
    return parame;
  }
  
  public final Object invoke(r0.a parama, ub.e<? super h> parame)
  {
    return ((2)create(parama, parame)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    vb.a locala = vb.a.a;
    if (label == 0)
    {
      f.b(paramObject);
      ((r0.a)L$0).d($stringKey, $value);
      return h.a;
    }
    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.dataStoreSetString.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */