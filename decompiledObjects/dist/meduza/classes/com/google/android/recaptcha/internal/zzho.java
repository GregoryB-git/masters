package com.google.android.recaptcha.internal;

import java.lang.reflect.Field;

public final class zzho
  implements zzgx
{
  public static final zzho zza = new zzho();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 2)
    {
      Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
      Object localObject2 = localObject1;
      if (true != localObject1 instanceof Field) {
        localObject2 = null;
      }
      localObject2 = (Field)localObject2;
      if (localObject2 != null)
      {
        paramzzgd = paramzzgd.zzc().zza(paramVarArgs[1]);
        try
        {
          ((Field)localObject2).set(null, paramzzgd);
          return;
        }
        catch (Exception paramzzgd)
        {
          throw new zzce(6, 11, paramzzgd);
        }
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzho
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */