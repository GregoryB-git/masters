package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import dc.p;
import nc.d0;
import r0.d.a;
import rb.f;
import rb.h;
import x6.b;

@wb.e(c="io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$setBool$1", f="SharedPreferencesPlugin.kt", l={70}, m="invokeSuspend")
final class SharedPreferencesPlugin$setBool$1
  extends wb.i
  implements p<d0, ub.e<? super h>, Object>
{
  public int label;
  
  public SharedPreferencesPlugin$setBool$1(String paramString, SharedPreferencesPlugin paramSharedPreferencesPlugin, boolean paramBoolean, ub.e<? super 1> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new 1($key, this$0, $value, parame);
  }
  
  public final Object invoke(d0 paramd0, ub.e<? super h> parame)
  {
    return ((1)create(paramd0, parame)).invokeSuspend(h.a);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    vb.a locala = vb.a.a;
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
      Object localObject = b.j($key);
      paramObject = SharedPreferencesPlugin.access$getContext$p(this$0);
      if (paramObject == null) {
        break label103;
      }
      paramObject = SharedPreferencesPluginKt.access$getSharedPreferencesDataStore((Context)paramObject);
      localObject = new wb.i((d.a)localObject, $value)
      {
        public int label;
        
        public final ub.e<h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
        {
          paramAnonymouse = new 1($boolKey, $value, paramAnonymouse);
          L$0 = paramAnonymousObject;
          return paramAnonymouse;
        }
        
        public final Object invoke(r0.a paramAnonymousa, ub.e<? super h> paramAnonymouse)
        {
          return ((1)create(paramAnonymousa, paramAnonymouse)).invokeSuspend(h.a);
        }
        
        public final Object invokeSuspend(Object paramAnonymousObject)
        {
          vb.a locala = vb.a.a;
          if (label == 0)
          {
            f.b(paramAnonymousObject);
            ((r0.a)L$0).d($boolKey, Boolean.valueOf($value));
            return h.a;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      };
      label = 1;
      if (r0.e.a((o0.i)paramObject, (p)localObject, this) == locala) {
        return locala;
      }
    }
    return h.a;
    label103:
    ec.i.i("context");
    throw null;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.setBool.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */