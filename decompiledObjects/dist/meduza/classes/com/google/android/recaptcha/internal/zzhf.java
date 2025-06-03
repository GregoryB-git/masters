package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import sb.k;

public final class zzhf
  implements zzgx
{
  public static final zzhf zza = new zzhf();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i >= 2)
    {
      Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
      Object localObject2 = localObject1;
      if (true != localObject1 instanceof Method) {
        localObject2 = null;
      }
      localObject1 = (Method)localObject2;
      if (localObject1 != null)
      {
        localObject2 = paramzzgd.zzc().zza(paramVarArgs[1]);
        paramVarArgs = paramzzgd.zzc().zzg(k.r(paramVarArgs).subList(2, i));
        try
        {
          paramzzgd.zzc().zze(paramInt, ((Method)localObject1).invoke(localObject2, Arrays.copyOf(paramVarArgs, paramVarArgs.length)));
          return;
        }
        catch (Exception paramzzgd)
        {
          throw new zzce(6, 15, paramzzgd);
        }
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzhf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */