package com.google.android.recaptcha.internal;

public final class zzhr
  implements zzgx
{
  public static final zzhr zza = new zzhr();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 2)
    {
      Object localObject1 = paramzzgd.zzc();
      int i = 0;
      Object localObject2 = ((zzge)localObject1).zza(paramVarArgs[0]);
      localObject1 = localObject2;
      if (true != localObject2 instanceof int[]) {
        localObject1 = null;
      }
      localObject2 = (int[])localObject1;
      if (localObject2 != null)
      {
        localObject1 = paramzzgd.zzc().zza(paramVarArgs[1]);
        paramVarArgs = (zzue[])localObject1;
        if (true != localObject1 instanceof String) {
          paramVarArgs = null;
        }
        paramVarArgs = (String)paramVarArgs;
        if (paramVarArgs != null)
        {
          localObject1 = paramzzgd.zzc();
          paramzzgd = new StringBuilder();
          try
          {
            int j = localObject2.length;
            while (i < j)
            {
              paramzzgd.append(paramVarArgs.charAt(localObject2[i]));
              i++;
            }
            ((zzge)localObject1).zze(paramInt, paramzzgd.toString());
            return;
          }
          catch (Exception paramzzgd)
          {
            throw new zzce(4, 22, paramzzgd);
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
 * Qualified Name:     com.google.android.recaptcha.internal.zzhr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */