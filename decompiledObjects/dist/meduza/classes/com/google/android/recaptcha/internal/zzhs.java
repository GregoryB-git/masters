package com.google.android.recaptcha.internal;

public final class zzhs
  implements zzgx
{
  public static final zzhs zza = new zzhs();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i != 2)
    {
      if (i == 0)
      {
        paramzzgd.zzc().zze(paramInt, new zzbn());
        return;
      }
      throw new zzce(4, 3, null);
    }
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
      if (true != localObject2 instanceof zzbn) {
        paramVarArgs = null;
      }
      paramVarArgs = (zzbn)paramVarArgs;
      if (paramVarArgs != null)
      {
        paramVarArgs = zzev.zza(paramzzgd.zzb(), paramVarArgs).zzd();
        paramInt = paramVarArgs.length;
        paramVarArgs = zzkh.zzh().zzi(paramVarArgs, 0, paramInt);
        paramzzgd.zzi().zzb((String)localObject1, new String[] { paramVarArgs });
        return;
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 5, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzhs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */