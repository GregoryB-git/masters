package io.flutter.plugins.sharedpreferences;

import dc.p;
import r0.d.a;
import rb.f;
import rb.h;
import wb.i;

@wb.e(c="io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setDouble$1$1", f="SharedPreferencesPlugin.kt", l={}, m="invokeSuspend")
final class SharedPreferencesPlugin$setDouble$1$1
  extends i
  implements p<r0.a, ub.e<? super h>, Object>
{
  public int label;
  
  public SharedPreferencesPlugin$setDouble$1$1(d.a<Double> parama, double paramDouble, ub.e<? super 1> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    parame = new 1($doubleKey, $value, parame);
    L$0 = paramObject;
    return parame;
  }
  
  public final Object invoke(r0.a parama, ub.e<? super h> parame)
  {
    return ((1)create(parama, parame)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    vb.a locala = vb.a.a;
    if (label == 0)
    {
      f.b(paramObject);
      ((r0.a)L$0).d($doubleKey, new Double($value));
      return h.a;
    }
    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.setDouble.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */