package com.google.android.recaptcha.internal;

public final class zzhm
  implements zzgx
{
  public static final zzhm zza = new zzhm();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 1)
    {
      Object localObject = paramzzgd.zzc().zza(paramVarArgs[0]);
      paramVarArgs = (zzue[])localObject;
      if (true != localObject instanceof String) {
        paramVarArgs = null;
      }
      paramVarArgs = (String)paramVarArgs;
      if (paramVarArgs != null)
      {
        paramzzgd.zzf(paramVarArgs);
        return;
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzhm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */