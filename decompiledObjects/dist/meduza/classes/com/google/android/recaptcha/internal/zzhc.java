package com.google.android.recaptcha.internal;

import ec.i;
import java.util.Arrays;
import java.util.List;
import sb.k;

public final class zzhc
  implements zzgx
{
  public static final zzhc zza = new zzhc();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i >= 2)
    {
      Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
      Object localObject2 = localObject1;
      if (true != localObject1 instanceof Object) {
        localObject2 = null;
      }
      if (localObject2 != null)
      {
        if ((localObject2 instanceof Class)) {
          localObject2 = (Class)localObject2;
        } else {
          localObject2 = localObject2.getClass();
        }
        Object localObject3 = paramzzgd.zzc().zza(paramVarArgs[1]);
        localObject1 = localObject3;
        if (true != localObject3 instanceof String) {
          localObject1 = null;
        }
        localObject1 = (String)localObject1;
        if (localObject1 != null)
        {
          localObject1 = paramzzgd.zzh().zza((String)localObject1);
          if (!i.a(localObject1, "forName"))
          {
            paramVarArgs = paramzzgd.zzc().zzf(k.r(paramVarArgs).subList(2, i));
            try
            {
              paramzzgd.zzc().zze(paramInt, ((Class)localObject2).getMethod((String)localObject1, (Class[])Arrays.copyOf(paramVarArgs, paramVarArgs.length)));
              return;
            }
            catch (Exception paramzzgd)
            {
              throw new zzce(6, 13, paramzzgd);
            }
          }
          throw new zzce(6, 48, null);
        }
        throw new zzce(4, 5, null);
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzhc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */