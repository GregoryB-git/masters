package com.google.android.recaptcha.internal;

public final class zzgm
  implements zzgx
{
  public static final zzgm zza = new zzgm();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    int i = paramVarArgs.length;
    boolean bool = true;
    if (i == 1)
    {
      Object localObject = paramzzgd.zzc().zza(paramVarArgs[0]);
      paramVarArgs = (zzue[])localObject;
      if (true != localObject instanceof Object) {
        paramVarArgs = null;
      }
      if (paramVarArgs != null)
      {
        localObject = paramVarArgs;
        try
        {
          if ((paramVarArgs instanceof String))
          {
            paramVarArgs = (String)paramVarArgs;
            localObject = paramzzgd.zzh().zza(paramVarArgs);
          }
          paramzzgd = paramzzgd.zzc();
          try
          {
            zzgc.zza(localObject);
          }
          catch (zzce paramVarArgs)
          {
            if ((paramVarArgs.zzb() != 8) && (paramVarArgs.zzb() != 6))
            {
              if (paramVarArgs.zzb() != 47) {
                throw paramVarArgs;
              }
            }
            else {
              bool = false;
            }
          }
          paramzzgd.zze(paramInt, Boolean.valueOf(bool));
          return;
        }
        catch (Exception paramzzgd)
        {
          throw new zzce(6, 8, paramzzgd);
        }
        catch (zzce paramzzgd)
        {
          throw paramzzgd;
        }
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */