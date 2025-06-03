package com.google.android.recaptcha.internal;

public final class zzgo
  implements zzgx
{
  public static final zzgo zza = new zzgo();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 2)
    {
      Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
      Object localObject2 = localObject1;
      if (true != localObject1 instanceof String) {
        localObject2 = null;
      }
      localObject1 = (String)localObject2;
      if (localObject1 != null)
      {
        localObject2 = paramzzgd.zzc().zza(paramVarArgs[1]);
        paramVarArgs = (zzue[])localObject2;
        if (true != localObject2 instanceof String) {
          paramVarArgs = null;
        }
        paramVarArgs = (String)paramVarArgs;
        if (paramVarArgs != null)
        {
          paramzzgd.zzc().zze(paramInt, ((String)localObject1).concat(paramVarArgs));
          return;
        }
        throw new zzce(4, 5, null);
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */