package com.google.android.recaptcha.internal;

public final class zzgk
  implements zzgx
{
  public static final zzgk zza = new zzgk();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    int i = paramVarArgs.length;
    if (i != 0)
    {
      zztf localzztf = zzti.zzf();
      int j = 0;
      while (j < i)
      {
        Object localObject = paramVarArgs[j];
        localObject = paramzzgd.zzc().zza((zzue)localObject);
        if (localObject != null)
        {
          zztg localzztg = zzth.zzf();
          if ((localObject instanceof Integer))
          {
            localzztg.zzu(((Number)localObject).intValue());
          }
          else if ((localObject instanceof Short))
          {
            localzztg.zzt(((Number)localObject).shortValue());
          }
          else if ((localObject instanceof Byte))
          {
            localzztg.zzf(zzle.zzk(new byte[] { ((Number)localObject).byteValue() }, 0, 1));
          }
          else if ((localObject instanceof Long))
          {
            localzztg.zzv(((Number)localObject).longValue());
          }
          else if ((localObject instanceof Double))
          {
            localzztg.zzr(((Number)localObject).doubleValue());
          }
          else if ((localObject instanceof Float))
          {
            localzztg.zzs(((Number)localObject).floatValue());
          }
          else if ((localObject instanceof Boolean))
          {
            localzztg.zze(((Boolean)localObject).booleanValue());
          }
          else if ((localObject instanceof Character))
          {
            localzztg.zzq(String.valueOf(((Character)localObject).charValue()));
          }
          else
          {
            if ((localObject instanceof String)) {
              localObject = (String)localObject;
            } else {
              localObject = localObject.toString();
            }
            localzztg.zzw((String)localObject);
          }
          localzztf.zzf((zzth)localzztg.zzi());
          j++;
        }
        else
        {
          throw new zzce(4, 4, null);
        }
      }
      paramzzgd = paramzzgd.zzc();
      paramVarArgs = ((zzti)localzztf.zzi()).zzd();
      j = paramVarArgs.length;
      paramzzgd.zze(paramInt, zzkh.zzh().zzi(paramVarArgs, 0, j));
      return;
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */