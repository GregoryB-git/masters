package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

public final class zzhe
  implements zzgx
{
  public static final zzhe zza = new zzhe();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 1)
    {
      Object localObject = paramzzgd.zzc().zza(paramVarArgs[0]);
      paramVarArgs = (zzue[])localObject;
      if (true != localObject instanceof Field) {
        paramVarArgs = null;
      }
      paramVarArgs = (Field)paramVarArgs;
      if (paramVarArgs != null) {
        try
        {
          paramzzgd.zzc().zze(paramInt, paramVarArgs.get(null));
          return;
        }
        catch (Exception paramzzgd)
        {
          throw new zzce(6, 16, paramzzgd);
        }
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzhe
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */