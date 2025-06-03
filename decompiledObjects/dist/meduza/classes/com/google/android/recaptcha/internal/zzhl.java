package com.google.android.recaptcha.internal;

public final class zzhl
  implements zzgx
{
  public static final zzhl zza = new zzhl();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 1)
    {
      paramVarArgs = paramzzgd.zzc().zza(paramVarArgs[0]);
      paramzzgd.zzc().zze(paramInt, paramVarArgs);
      return;
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzhl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */