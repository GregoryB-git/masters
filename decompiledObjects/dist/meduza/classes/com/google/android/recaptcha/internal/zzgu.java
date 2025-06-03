package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

public final class zzgu
  implements zzgx
{
  public static final zzgu zza = new zzgu();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 2)
    {
      Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
      Object localObject2 = localObject1;
      if (true != localObject1 instanceof Object) {
        localObject2 = null;
      }
      if (localObject2 != null)
      {
        localObject1 = paramzzgd.zzc().zza(paramVarArgs[1]);
        paramVarArgs = (zzue[])localObject1;
        if (true != localObject1 instanceof Integer) {
          paramVarArgs = null;
        }
        paramVarArgs = (Integer)paramVarArgs;
        if (paramVarArgs != null)
        {
          int i = paramVarArgs.intValue();
          paramVarArgs = (zzue[])localObject2;
          try
          {
            if ((localObject2 instanceof String))
            {
              paramVarArgs = (String)localObject2;
              paramVarArgs = paramzzgd.zzh().zza(paramVarArgs);
            }
            paramzzgd.zzc().zze(paramInt, Array.newInstance(zzgc.zza(paramVarArgs), i));
            return;
          }
          catch (Exception paramzzgd)
          {
            throw new zzce(6, 21, paramzzgd);
          }
        }
        throw new zzce(4, 5, null);
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */