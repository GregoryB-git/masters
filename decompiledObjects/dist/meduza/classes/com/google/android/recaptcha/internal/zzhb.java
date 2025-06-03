package com.google.android.recaptcha.internal;

public final class zzhb
  implements zzgx
{
  public static final zzhb zza = new zzhb();
  
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
        if ((localObject2 instanceof Class)) {
          localObject2 = (Class)localObject2;
        } else {
          localObject2 = localObject2.getClass();
        }
        localObject1 = paramzzgd.zzc().zza(paramVarArgs[1]);
        paramVarArgs = (zzue[])localObject1;
        if (true != localObject1 instanceof String) {
          paramVarArgs = null;
        }
        paramVarArgs = (String)paramVarArgs;
        if (paramVarArgs != null) {
          try
          {
            paramzzgd.zzc().zze(paramInt, ((Class)localObject2).getField(paramzzgd.zzh().zza(paramVarArgs)));
            return;
          }
          catch (Exception paramzzgd)
          {
            throw new zzce(6, 10, paramzzgd);
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
 * Qualified Name:     com.google.android.recaptcha.internal.zzhb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */