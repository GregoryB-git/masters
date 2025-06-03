package io.flutter.plugins.sharedpreferences;

import r0.d;
import r0.d.a;
import rb.h;
import vb.a;
import wb.c;

public final class SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2<T>
  implements qc.f
{
  public SharedPreferencesPlugin$getBool$1$invokeSuspend$$inlined$map$1$2(qc.f paramf, d.a parama) {}
  
  public final Object emit(Object paramObject, ub.e parame)
  {
    if ((parame instanceof 1))
    {
      localObject1 = (1)parame;
      i = label;
      if ((i & 0x80000000) != 0)
      {
        label = (i + Integer.MIN_VALUE);
        parame = (ub.e)localObject1;
        break label50;
      }
    }
    parame = new c(parame)
    {
      public Object L$0;
      public int label;
      
      public final Object invokeSuspend(Object paramAnonymousObject)
      {
        result = paramAnonymousObject;
        label |= 0x80000000;
        return this$0.emit(null, this);
      }
    };
    label50:
    Object localObject2 = result;
    Object localObject1 = a.a;
    int i = label;
    if (i != 0)
    {
      if (i == 1) {
        rb.f.b(localObject2);
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(localObject2);
      localObject2 = $this_unsafeFlow;
      paramObject = ((d)paramObject).b($preferencesKey$inlined);
      label = 1;
      if (((qc.f)localObject2).emit(paramObject, parame) == localObject1) {
        return localObject1;
      }
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.getBool.1.invokeSuspend..inlined.map.1.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */