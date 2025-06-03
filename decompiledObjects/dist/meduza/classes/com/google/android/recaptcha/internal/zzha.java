package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import sb.k;

public final class zzha
  implements zzgx
{
  public static final zzha zza = new zzha();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i != 0)
    {
      Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
      Object localObject2 = localObject1;
      if (true != localObject1 instanceof Class) {
        localObject2 = null;
      }
      localObject2 = (Class)localObject2;
      if (localObject2 != null)
      {
        paramVarArgs = paramzzgd.zzc().zzf(k.r(paramVarArgs).subList(1, i));
        try
        {
          paramzzgd.zzc().zze(paramInt, ((Class)localObject2).getConstructor((Class[])Arrays.copyOf(paramVarArgs, paramVarArgs.length)));
          return;
        }
        catch (Exception paramzzgd)
        {
          throw new zzce(6, 9, paramzzgd);
        }
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzha
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */