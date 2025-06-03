package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;

public final class zzgt
  implements zzgx
{
  public static final zzgt zza = new zzgt();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    int i = paramVarArgs.length;
    zzga localzzga = null;
    if ((i != 4) && (i != 5)) {
      throw new zzce(4, 3, null);
    }
    Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
    Object localObject2 = localObject1;
    if (true != localObject1 instanceof Integer) {
      localObject2 = null;
    }
    localObject2 = (Integer)localObject2;
    if (localObject2 != null)
    {
      int j = ((Number)localObject2).intValue();
      localObject1 = paramzzgd.zzc().zza(paramVarArgs[1]);
      localObject2 = localObject1;
      if (true != localObject1 instanceof Integer) {
        localObject2 = null;
      }
      localObject2 = (Integer)localObject2;
      if (localObject2 != null)
      {
        int k = ((Number)localObject2).intValue();
        localObject1 = paramzzgd.zzc().zza(paramVarArgs[2]);
        localObject2 = localObject1;
        if (true != localObject1 instanceof String) {
          localObject2 = null;
        }
        localObject2 = (String)localObject2;
        if (localObject2 != null)
        {
          Object localObject3 = paramzzgd.zzh().zza((String)localObject2);
          localObject1 = paramzzgd.zzc().zza(paramVarArgs[3]);
          localObject2 = localObject1;
          if (true != localObject1 instanceof String) {
            localObject2 = null;
          }
          localObject2 = (String)localObject2;
          if (localObject2 != null)
          {
            localObject1 = paramzzgd.zzh().zza((String)localObject2);
            localObject2 = localzzga;
            if (i == 5) {
              localObject2 = paramzzgd.zzc().zza(paramVarArgs[4]);
            }
            paramVarArgs = new zzfz(k);
            try
            {
              Class localClass = zzgc.zza(localObject3);
              localObject3 = paramzzgd.zzc();
              ClassLoader localClassLoader = localClass.getClassLoader();
              localzzga = new com/google/android/recaptcha/internal/zzga;
              localzzga.<init>(paramVarArgs, (String)localObject1, localObject2);
              ((zzge)localObject3).zze(j, Proxy.newProxyInstance(localClassLoader, new Class[] { localClass }, localzzga));
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
    throw new zzce(4, 5, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */