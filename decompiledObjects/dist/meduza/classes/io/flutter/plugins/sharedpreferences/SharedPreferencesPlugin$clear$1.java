package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import dc.p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nc.d0;
import r0.d;
import rb.f;
import rb.h;
import x6.b;

@wb.e(c="io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$clear$1", f="SharedPreferencesPlugin.kt", l={113}, m="invokeSuspend")
final class SharedPreferencesPlugin$clear$1
  extends wb.i
  implements p<d0, ub.e<? super d>, Object>
{
  public int label;
  
  public SharedPreferencesPlugin$clear$1(SharedPreferencesPlugin paramSharedPreferencesPlugin, List<String> paramList, ub.e<? super 1> parame)
  {
    super(2, parame);
  }
  
  public final ub.e<h> create(Object paramObject, ub.e<?> parame)
  {
    return new 1(this$0, $allowList, parame);
  }
  
  public final Object invoke(d0 paramd0, ub.e<? super d> parame)
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
      paramObject = SharedPreferencesPlugin.access$getContext$p(this$0);
      if (paramObject == null) {
        break label97;
      }
      paramObject = SharedPreferencesPluginKt.access$getSharedPreferencesDataStore((Context)paramObject);
      Object localObject = new wb.i($allowList, null)
      {
        public int label;
        
        public final ub.e<h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
        {
          paramAnonymouse = new 1($allowList, paramAnonymouse);
          L$0 = paramAnonymousObject;
          return paramAnonymouse;
        }
        
        public final Object invoke(r0.a paramAnonymousa, ub.e<? super h> paramAnonymouse)
        {
          return ((1)create(paramAnonymousa, paramAnonymouse)).invokeSuspend(h.a);
        }
        
        public final Object invokeSuspend(Object paramAnonymousObject)
        {
          Object localObject = vb.a.a;
          if (label == 0)
          {
            f.b(paramAnonymousObject);
            paramAnonymousObject = (r0.a)L$0;
            localObject = $allowList;
            if (localObject != null)
            {
              Iterator localIterator = ((Iterable)localObject).iterator();
              while (localIterator.hasNext())
              {
                localObject = b.j((String)localIterator.next());
                paramAnonymousObject.getClass();
                ((r0.a)paramAnonymousObject).c();
                a.remove(localObject);
              }
            }
            ((r0.a)paramAnonymousObject).c();
            a.clear();
            return h.a;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      };
      label = 1;
      localObject = r0.e.a((o0.i)paramObject, (p)localObject, this);
      paramObject = localObject;
      if (localObject == locala) {
        return locala;
      }
    }
    return paramObject;
    label97:
    ec.i.i("context");
    throw null;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.clear.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */