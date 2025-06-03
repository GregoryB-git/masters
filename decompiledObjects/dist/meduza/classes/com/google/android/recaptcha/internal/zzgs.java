package com.google.android.recaptcha.internal;

import dc.p;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public final class zzgs
  implements zzgx
{
  public static final zzgs zza = new zzgs();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if ((i != 4) && (i != 5)) {
      throw new zzce(4, 3, null);
    }
    Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
    Object localObject2 = localObject1;
    if (true != localObject1 instanceof String) {
      localObject2 = null;
    }
    Object localObject3 = (String)localObject2;
    if (localObject3 != null)
    {
      localObject1 = paramzzgd.zzc().zza(paramVarArgs[1]);
      localObject2 = localObject1;
      if (true != localObject1 instanceof Object) {
        localObject2 = null;
      }
      if (localObject2 != null)
      {
        Object localObject4 = paramzzgd.zzc().zza(paramVarArgs[2]);
        localObject1 = localObject4;
        if (true != localObject4 instanceof String) {
          localObject1 = null;
        }
        localObject1 = (String)localObject1;
        if (localObject1 != null)
        {
          localObject4 = paramzzgd.zzh().zza((String)localObject1);
          Object localObject5 = paramzzgd.zzc().zza(paramVarArgs[3]);
          if (i == 5)
          {
            localObject1 = paramzzgd.zzc().zza(paramVarArgs[4]);
            paramVarArgs = (zzue[])localObject1;
            if (true != localObject1 instanceof Integer) {
              paramVarArgs = null;
            }
            paramVarArgs = (Integer)paramVarArgs;
            if (paramVarArgs != null) {
              i = paramVarArgs.intValue();
            } else {
              throw new zzce(4, 5, null);
            }
          }
          else
          {
            i = -1;
          }
          paramVarArgs = (zzue[])localObject2;
          try
          {
            if ((localObject2 instanceof String))
            {
              paramVarArgs = (String)localObject2;
              paramVarArgs = paramzzgd.zzh().zza(paramVarArgs);
            }
            paramVarArgs = zzgc.zza(paramVarArgs);
            localObject2 = new com/google/android/recaptcha/internal/zzgr;
            ((zzgr)localObject2).<init>(paramzzgd, (String)localObject3, i);
            localObject3 = paramVarArgs.getClassLoader();
            localObject1 = new com/google/android/recaptcha/internal/zzfy;
            ((zzfy)localObject1).<init>((p)localObject2, (String)localObject4, localObject5);
            paramVarArgs = Proxy.newProxyInstance((ClassLoader)localObject3, new Class[] { paramVarArgs }, (InvocationHandler)localObject1);
            paramzzgd.zzc().zze(paramInt, paramVarArgs);
            return;
          }
          catch (Exception paramzzgd)
          {
            throw new zzce(6, 20, paramzzgd);
          }
        }
        throw new zzce(4, 5, null);
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 5, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */