package com.google.android.recaptcha.internal;

import ec.i;

public final class zzgj
  implements zzgx
{
  public static final zzgj zza = new zzgj();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 3)
    {
      Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
      Object localObject2 = localObject1;
      if (true != localObject1 instanceof Integer) {
        localObject2 = null;
      }
      localObject2 = (Integer)localObject2;
      if (localObject2 != null)
      {
        paramInt = ((Number)localObject2).intValue();
        if (paramInt != 0)
        {
          localObject1 = paramzzgd.zzc().zza(paramVarArgs[1]);
          localObject2 = localObject1;
          if (true != localObject1 instanceof Object) {
            localObject2 = null;
          }
          if (localObject2 != null)
          {
            localObject1 = paramzzgd.zzc().zza(paramVarArgs[2]);
            paramVarArgs = (zzue[])localObject1;
            if (true != localObject1 instanceof Object) {
              paramVarArgs = null;
            }
            if (paramVarArgs != null)
            {
              if (i.a(localObject2, paramVarArgs)) {
                paramzzgd.zzg(paramzzgd.zza() + paramInt);
              }
              return;
            }
            throw new zzce(4, 5, null);
          }
          throw new zzce(4, 5, null);
        }
        throw new zzce(4, 6, null);
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */