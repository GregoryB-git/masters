package com.google.android.recaptcha.internal;

public final class zzgz
  implements zzgx
{
  public static final zzgz zza = new zzgz();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 1)
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
          paramzzgd.zzc().zze(paramInt, zzgc.zza(localObject));
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
 * Qualified Name:     com.google.android.recaptcha.internal.zzgz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */