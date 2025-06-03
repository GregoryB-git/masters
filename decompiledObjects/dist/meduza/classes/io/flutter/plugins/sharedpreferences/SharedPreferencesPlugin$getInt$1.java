package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import dc.p;
import ec.s;
import nc.d0;
import r0.d;
import r0.d.a;
import rb.h;
import vb.a;
import wb.c;
import x6.b;

@wb.e(c="io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin$getInt$1", f="SharedPreferencesPlugin.kt", l={140}, m="invokeSuspend")
final class SharedPreferencesPlugin$getInt$1
  extends wb.i
  implements p<d0, ub.e<? super h>, Object>
{
  public Object L$0;
  public int label;
  
  public SharedPreferencesPlugin$getInt$1(String paramString, SharedPreferencesPlugin paramSharedPreferencesPlugin, s<Long> params, ub.e<? super 1> parame)
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
  
  public final Object invokeSuspend(final Object paramObject)
  {
    Object localObject1 = a.a;
    int i = label;
    Object localObject2;
    if (i != 0)
    {
      if (i == 1)
      {
        localObject1 = (s)L$0;
        rb.f.b(paramObject);
        localObject2 = paramObject;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      rb.f.b(paramObject);
      paramObject = $key;
      ec.i.e(paramObject, "name");
      paramObject = new d.a((String)paramObject);
      localObject2 = SharedPreferencesPlugin.access$getContext$p(this$0);
      if (localObject2 == null) {
        break label147;
      }
      localObject2 = new qc.e()
      {
        public Object collect(qc.f paramAnonymousf, ub.e paramAnonymouse)
        {
          paramAnonymousf = $this_unsafeTransform$inlined.collect(new qc.f()
          {
            public final Object emit(Object paramAnonymous2Object, ub.e paramAnonymous2e)
            {
              if ((paramAnonymous2e instanceof 1))
              {
                localObject1 = (1)paramAnonymous2e;
                i = label;
                if ((i & 0x80000000) != 0)
                {
                  label = (i + Integer.MIN_VALUE);
                  paramAnonymous2e = (ub.e)localObject1;
                  break label50;
                }
              }
              paramAnonymous2e = new c(paramAnonymous2e)
              {
                public Object L$0;
                public int label;
                
                public final Object invokeSuspend(Object paramAnonymous3Object)
                {
                  result = paramAnonymous3Object;
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
                paramAnonymous2Object = ((d)paramAnonymous2Object).b($preferencesKey$inlined);
                label = 1;
                if (((qc.f)localObject2).emit(paramAnonymous2Object, paramAnonymous2e) == localObject1) {
                  return localObject1;
                }
              }
              return h.a;
            }
          }, paramAnonymouse);
          if (paramAnonymousf == a.a) {
            return paramAnonymousf;
          }
          return h.a;
        }
      };
      paramObject = $value;
      L$0 = paramObject;
      label = 1;
      localObject2 = b.V((qc.e)localObject2, this);
      if (localObject2 == localObject1) {
        return localObject1;
      }
      localObject1 = paramObject;
    }
    a = localObject2;
    return h.a;
    label147:
    ec.i.i("context");
    throw null;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.getInt.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */