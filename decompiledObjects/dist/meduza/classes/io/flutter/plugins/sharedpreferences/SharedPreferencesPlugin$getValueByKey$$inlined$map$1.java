package io.flutter.plugins.sharedpreferences;

import r0.d;
import r0.d.a;
import rb.h;
import vb.a;
import wb.c;

public final class SharedPreferencesPlugin$getValueByKey$$inlined$map$1
  implements qc.e<Object>
{
  public SharedPreferencesPlugin$getValueByKey$$inlined$map$1(qc.e parame, d.a parama) {}
  
  public Object collect(qc.f paramf, ub.e parame)
  {
    paramf = $this_unsafeTransform$inlined.collect(new qc.f()
    {
      public final Object emit(Object paramAnonymousObject, ub.e paramAnonymouse)
      {
        if ((paramAnonymouse instanceof 1))
        {
          localObject1 = (1)paramAnonymouse;
          i = label;
          if ((i & 0x80000000) != 0)
          {
            label = (i + Integer.MIN_VALUE);
            paramAnonymouse = (ub.e)localObject1;
            break label50;
          }
        }
        paramAnonymouse = new c(paramAnonymouse)
        {
          public Object L$0;
          public int label;
          
          public final Object invokeSuspend(Object paramAnonymous2Object)
          {
            result = paramAnonymous2Object;
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
          paramAnonymousObject = ((d)paramAnonymousObject).b($key$inlined);
          label = 1;
          if (((qc.f)localObject2).emit(paramAnonymousObject, paramAnonymouse) == localObject1) {
            return localObject1;
          }
        }
        return h.a;
      }
    }, parame);
    if (paramf == a.a) {
      return paramf;
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.getValueByKey..inlined.map.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */