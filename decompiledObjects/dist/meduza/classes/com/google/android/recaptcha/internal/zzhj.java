package com.google.android.recaptcha.internal;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;
import sb.k;

public final class zzhj
  implements zzgx
{
  public static final zzhj zza = new zzhj();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i != 0)
    {
      Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
      Object localObject2 = localObject1;
      if (true != localObject1 instanceof Object) {
        localObject2 = null;
      }
      if (localObject2 != null)
      {
        if ((localObject2 instanceof Constructor)) {
          localObject2 = (Constructor)localObject2;
        } else {
          localObject2 = localObject2.getClass().getConstructor(new Class[0]);
        }
        paramVarArgs = paramzzgd.zzc().zzg(k.r(paramVarArgs).subList(1, i));
        try
        {
          paramzzgd.zzc().zze(paramInt, ((Constructor)localObject2).newInstance(Arrays.copyOf(paramVarArgs, paramVarArgs.length)));
          return;
        }
        catch (Exception paramzzgd)
        {
          throw new zzce(6, 14, paramzzgd);
        }
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzhj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */